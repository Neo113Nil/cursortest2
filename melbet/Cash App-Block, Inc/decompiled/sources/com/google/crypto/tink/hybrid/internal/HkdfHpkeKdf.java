package com.google.crypto.tink.hybrid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.zxing.BinaryBitmap;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes4.dex */
public final class HkdfHpkeKdf implements X25519 {
    public static final byte[] x25519Pkcs8Prefix = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, PnmConstants.PNM_SEPARATOR};
    public static final byte[] x25519X509Prefix = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    public final Serializable macAlgorithm;

    public /* synthetic */ HkdfHpkeKdf(Serializable serializable) {
        this.macAlgorithm = serializable;
    }

    @Override // com.google.crypto.tink.hybrid.internal.X25519
    public byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) {
        Provider provider = (Provider) this.macAlgorithm;
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", provider);
        if (bArr.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Invalid X25519 private key");
            return null;
        }
        PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Bytes.concat(x25519Pkcs8Prefix, bArr)));
        if (bArr2.length != 32) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Invalid X25519 public key");
            return null;
        }
        PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(Bytes.concat(x25519X509Prefix, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", provider);
        keyAgreement.init(generatePrivate);
        keyAgreement.doPhase(generatePublic, true);
        return keyAgreement.generateSecret();
    }

    public byte[] expand(byte[] bArr, byte[] bArr2, int i) {
        EngineFactory engineFactory = EngineFactory.MAC;
        String str = (String) this.macAlgorithm;
        Mac mac = (Mac) engineFactory.policy.getInstance(str);
        if (i > mac.getMacLength() * 255) {
            a$$ExternalSyntheticBUOutline0.m$6("size too large");
            return null;
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArr4 = mac.doFinal();
            if (bArr4.length + i3 >= i) {
                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
            i2++;
        }
    }

    public byte[] extract(byte[] bArr, byte[] bArr2) {
        EngineFactory engineFactory = EngineFactory.MAC;
        String str = (String) this.macAlgorithm;
        Mac mac = (Mac) engineFactory.policy.getInstance(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    @Override // com.google.crypto.tink.hybrid.internal.X25519
    public BinaryBitmap generateKeyPair() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", (Provider) this.macAlgorithm);
        keyPairGenerator.initialize(255);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = generateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            a$$ExternalSyntheticBUOutline0.m$6("Invalid encoded private key length");
            return null;
        }
        if (!Util.isPrefix(x25519Pkcs8Prefix, encoded)) {
            a$$ExternalSyntheticBUOutline0.m$6("Invalid encoded private key prefix");
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            a$$ExternalSyntheticBUOutline0.m$6("Invalid encoded public key length");
            return null;
        }
        if (Util.isPrefix(x25519X509Prefix, encoded2)) {
            return new BinaryBitmap(6, copyOfRange, Arrays.copyOfRange(encoded2, 12, encoded2.length));
        }
        a$$ExternalSyntheticBUOutline0.m$6("Invalid encoded public key prefix");
        return null;
    }
}
