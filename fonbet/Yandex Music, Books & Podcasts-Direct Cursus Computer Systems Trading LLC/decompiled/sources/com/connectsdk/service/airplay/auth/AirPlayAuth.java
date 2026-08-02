package com.connectsdk.service.airplay.auth;

import android.util.Log;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.airplay.auth.crypt.Curve25519;
import com.connectsdk.service.airplay.auth.crypt.srp6.AppleSRP6ClientSessionImpl;
import com.dd.plist.NSDictionary;
import com.dd.plist.PropertyListParser;
import com.nimbusds.srp6.BigIntegerUtils;
import com.nimbusds.srp6.SRP6CryptoParams;
import defpackage.b6e;
import defpackage.tlm;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import net.i2p.crypto.eddsa.Utils;

/* loaded from: classes.dex */
public class AirPlayAuth {
    private static final int SOCKET_TIMEOUT = 60000;
    private final InetSocketAddress address;
    private final EdDSAPrivateKey authKey;
    private final String clientId;

    public AirPlayAuth(InetSocketAddress inetSocketAddress, String str) {
        try {
            this.address = inetSocketAddress;
            String[] split = str.split("@");
            this.clientId = split[0];
            this.authKey = new EdDSAPrivateKey(new PKCS8EncodedKeySpec(Utils.hexToBytes(split[1])));
        } catch (InvalidKeySpecException e) {
            b6e.q(e);
            throw null;
        }
    }

    private Socket connect() throws IOException {
        Socket socket = new Socket();
        socket.setReuseAddress(true);
        socket.setSoTimeout(60000);
        socket.connect(this.address, 60000);
        return socket;
    }

    private PairSetupPin1Response doPairSetupPin1(Socket socket) throws Exception {
        NSDictionary parse = PropertyListParser.parse(AuthUtils.postData(socket, "/pair-setup-pin", HttpMessage.CONTENT_TYPE_APPLICATION_PLIST, AuthUtils.createPList(new HashMap<String, String>() { // from class: com.connectsdk.service.airplay.auth.AirPlayAuth.1
            {
                put("method", "pin");
                put("user", AirPlayAuth.this.clientId);
            }
        })));
        if (parse.containsKey("pk") && parse.containsKey("salt")) {
            return new PairSetupPin1Response(parse.get("pk").bytes(), parse.get("salt").bytes());
        }
        throw new Exception();
    }

    private PairSetupPin2Response doPairSetupPin2(Socket socket, byte[] bArr, byte[] bArr2) throws Exception {
        NSDictionary parse = PropertyListParser.parse(AuthUtils.postData(socket, "/pair-setup-pin", HttpMessage.CONTENT_TYPE_APPLICATION_PLIST, AuthUtils.createPList(new HashMap<String, byte[]>(bArr, bArr2) { // from class: com.connectsdk.service.airplay.auth.AirPlayAuth.2
            final /* synthetic */ byte[] val$clientEvidenceMessageM1;
            final /* synthetic */ byte[] val$publicClientValueA;

            {
                this.val$publicClientValueA = bArr;
                this.val$clientEvidenceMessageM1 = bArr2;
                put("pk", bArr);
                put("proof", bArr2);
            }
        })));
        if (parse.containsKey("proof")) {
            return new PairSetupPin2Response(parse.get("proof").bytes());
        }
        throw new Exception();
    }

    private PairSetupPin3Response doPairSetupPin3(Socket socket, byte[] bArr) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        Charset charset = StandardCharsets.UTF_8;
        messageDigest.update("Pair-Setup-AES-Key".getBytes(charset));
        messageDigest.update(bArr);
        byte[] copyOfRange = Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        messageDigest.update("Pair-Setup-AES-IV".getBytes(charset));
        messageDigest.update(bArr);
        byte[] copyOfRange2 = Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        for (int length = copyOfRange2.length - 1; length >= 0; length--) {
            byte b = (byte) (copyOfRange2[length] + 1);
            copyOfRange2[length] = b;
            if (256 != b) {
                break;
            }
        }
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(copyOfRange, "AES"), new GCMParameterSpec(128, copyOfRange2));
        NSDictionary parse = PropertyListParser.parse(AuthUtils.postData(socket, "/pair-setup-pin", HttpMessage.CONTENT_TYPE_APPLICATION_PLIST, AuthUtils.createPList(new HashMap<String, byte[]>(cipher.doFinal(this.authKey.getAbyte())) { // from class: com.connectsdk.service.airplay.auth.AirPlayAuth.3
            final /* synthetic */ byte[] val$aesGcm128ClientLTPK;

            {
                this.val$aesGcm128ClientLTPK = r3;
                put("epk", Arrays.copyOfRange(r3, 0, r3.length - 16));
                put("authTag", Arrays.copyOfRange(r3, r3.length - 16, r3.length));
            }
        })));
        if (parse.containsKey("epk") && parse.containsKey("authTag")) {
            return new PairSetupPin3Response(parse.get("epk").bytes(), parse.get("authTag").bytes());
        }
        throw new Exception();
    }

    private byte[] doPairVerify1(Socket socket, byte[] bArr) throws Exception {
        return AuthUtils.postData(socket, "/pair-verify", "application/octet-stream", AuthUtils.concatByteArrays(new byte[]{1, 0, 0, 0}, bArr, this.authKey.getAbyte()));
    }

    private void doPairVerify2(Socket socket, byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, InvalidAlgorithmParameterException, SignatureException {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 32);
        byte[] bArr4 = new byte[32];
        Curve25519.curve(bArr4, bArr2, copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        Charset charset = StandardCharsets.UTF_8;
        messageDigest.update("Pair-Verify-AES-Key".getBytes(charset));
        messageDigest.update(bArr4);
        byte[] copyOfRange2 = Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        messageDigest.update("Pair-Verify-AES-IV".getBytes(charset));
        messageDigest.update(bArr4);
        byte[] copyOfRange3 = Arrays.copyOfRange(messageDigest.digest(), 0, 16);
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(1, new SecretKeySpec(copyOfRange2, "AES"), new IvParameterSpec(copyOfRange3));
        cipher.update(Arrays.copyOfRange(bArr, 32, bArr.length));
        EdDSAEngine edDSAEngine = new EdDSAEngine();
        edDSAEngine.initSign(this.authKey);
        AuthUtils.postData(socket, "/pair-verify", "application/octet-stream", AuthUtils.concatByteArrays(new byte[]{0, 0, 0, 0}, cipher.update(edDSAEngine.signOneShot(AuthUtils.concatByteArrays(bArr3, copyOfRange)))));
    }

    public static String generateNewAuthToken() {
        StringBuilder m = tlm.m(AuthUtils.randomString(16), "@");
        m.append(Utils.bytesToHex(new KeyPairGenerator().generateKeyPair().getPrivate().getEncoded()));
        return m.toString();
    }

    public Socket authenticate() throws Exception {
        Socket connect = connect();
        byte[] bArr = new byte[32];
        new Random().nextBytes(bArr);
        byte[] bArr2 = new byte[32];
        Curve25519.keygen(bArr2, null, bArr);
        doPairVerify2(connect, doPairVerify1(connect, bArr2), bArr, bArr2);
        Log.i("LSH", "Pair Verify finished!");
        return connect;
    }

    public void doPairing(String str) throws Exception {
        Socket connect = connect();
        PairSetupPin1Response doPairSetupPin1 = doPairSetupPin1(connect);
        AppleSRP6ClientSessionImpl appleSRP6ClientSessionImpl = new AppleSRP6ClientSessionImpl();
        appleSRP6ClientSessionImpl.step1(this.clientId, str);
        appleSRP6ClientSessionImpl.step2(SRP6CryptoParams.getInstance(2048, "SHA-1"), BigIntegerUtils.bigIntegerFromBytes(doPairSetupPin1.SALT), BigIntegerUtils.bigIntegerFromBytes(doPairSetupPin1.PK));
        appleSRP6ClientSessionImpl.step3(BigIntegerUtils.bigIntegerFromBytes(doPairSetupPin2(connect, BigIntegerUtils.bigIntegerToBytes(appleSRP6ClientSessionImpl.getPublicClientValue()), BigIntegerUtils.bigIntegerToBytes(appleSRP6ClientSessionImpl.getClientEvidenceMessage())).PROOF));
        doPairSetupPin3(connect, appleSRP6ClientSessionImpl.getSessionKeyHash());
        connect.close();
    }

    public void startPairing() throws IOException {
        Socket connect = connect();
        AuthUtils.postData(connect, "/pair-pin-start", null, null);
        connect.close();
    }
}
