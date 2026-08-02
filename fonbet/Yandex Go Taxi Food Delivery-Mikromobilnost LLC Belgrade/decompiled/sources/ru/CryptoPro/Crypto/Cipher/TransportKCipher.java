package ru.CryptoPro.Crypto.Cipher;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import defpackage.w511;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_GostR3412_KeyTransport;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.Kexp15ParamsSpec;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class TransportKCipher extends TransportCipher {
    public int i;

    public TransportKCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.g = "GOST3412_2015_K";
        this.h = "GOST3412_2015_K";
        this.i = 16;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.TransportCipher, javax.crypto.CipherSpi
    public final Key engineUnwrap(byte[] bArr, String str, int i) {
        byte[] bArr2 = null;
        if (this.b != 4) {
            w511.u();
            return null;
        }
        try {
            if (this.a == null) {
                this.a = a();
            }
            Cipher cipher = Cipher.getInstance(proc(this.a), "Crypto");
            GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport = new GostR3410_GostR3412_KeyTransport();
            gostR3410_GostR3412_KeyTransport.decode(new Asn1BerDecodeBuffer(bArr));
            byte[] bArr3 = gostR3410_GostR3412_KeyTransport.encryptedKey.value;
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            gostR3410_GostR3412_KeyTransport.ephemeralPublicKey.encode(asn1BerEncodeBuffer);
            GostPublicKey gostPublicKey = new GostPublicKey(asn1BerEncodeBuffer.getMsgCopy(), false);
            AlgorithmParameterSpec algorithmParameterSpec = this.d;
            byte[] iv = (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof IvParameterSpec)) ? gostR3410_GostR3412_KeyTransport.ukm.value : ((IvParameterSpec) algorithmParameterSpec).getIV();
            if (iv.length != 32) {
                throw new InvalidKeyException("Invalid UKM length");
            }
            byte[] bArr4 = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                bArr4[i2] = iv[15 - i2];
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
            int i3 = this.i;
            byte[] bArr5 = new byte[i3 / 2];
            Array.copy(iv, 24, bArr5, 0, i3 / 2);
            String algorithm = gostPublicKey.getAlgorithm();
            if (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                byte[] bArr6 = new byte[8];
                Array.copy(iv, 16, bArr6, 0, 8);
                bArr2 = bArr6;
            }
            Kexp15ParamsSpec kexp15ParamsSpec = new Kexp15ParamsSpec(bArr5, bArr2);
            String str2 = this.f;
            if (str2 == null) {
                str2 = this.c.getAlgorithm();
            }
            KeyAgreement keyAgreement = KeyAgreement.getInstance(str2, "Crypto");
            keyAgreement.init(this.c, ivParameterSpec);
            keyAgreement.doPhase(gostPublicKey, true);
            cipher.init(4, keyAgreement.generateSecret(this.g), kexp15ParamsSpec);
            return cipher.unwrap(bArr3, str, i);
        } catch (Exception e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException();
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    @Override // ru.CryptoPro.Crypto.Cipher.TransportCipher, javax.crypto.CipherSpi
    public final byte[] engineWrap(Key key) {
        byte[] bArr;
        byte[] bArr2 = null;
        if (this.b != 3) {
            w511.u();
            return null;
        }
        try {
            if (this.a == null) {
                this.a = a();
            }
            Cipher cipher = Cipher.getInstance(proc(this.a), "Crypto");
            String str = this.e;
            if (str == null) {
                String algorithm = this.c.getAlgorithm();
                if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                    if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
                        str = "GOST3410DHELEPH";
                    }
                    str = JCP.GOST_EPH_DH_2012_512_NAME;
                }
                str = JCP.GOST_EPH_DH_2012_256_NAME;
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, "Crypto");
            keyPairGenerator.initialize((AlgIdInterface) ((GostPublicKey) this.c).getSpec().getParams());
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            PublicKey publicKey = generateKeyPair.getPublic();
            AlgorithmParameterSpec algorithmParameterSpec = this.d;
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof IvParameterSpec)) {
                bArr = null;
            } else {
                bArr = Array.copy(((IvParameterSpec) algorithmParameterSpec).getIV());
                if (bArr.length != 32) {
                    throw new InvalidKeyException("Invalid UKM length");
                }
            }
            if (bArr == null) {
                bArr = new byte[32];
                SecureRandom.getInstance(JCP.CP_RANDOM, "JCP").nextBytes(bArr);
            }
            byte[] bArr3 = new byte[16];
            for (int i = 0; i < 16; i++) {
                bArr3[i] = bArr[15 - i];
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            int i2 = this.i;
            byte[] bArr4 = new byte[i2 / 2];
            Array.copy(bArr, 24, bArr4, 0, i2 / 2);
            String algorithm2 = publicKey.getAlgorithm();
            if (algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                byte[] bArr5 = new byte[8];
                Array.copy(bArr, 16, bArr5, 0, 8);
                bArr2 = bArr5;
            }
            Kexp15ParamsSpec kexp15ParamsSpec = new Kexp15ParamsSpec(bArr4, bArr2);
            String str2 = this.f;
            if (str2 == null) {
                str2 = this.c.getAlgorithm();
            }
            KeyAgreement keyAgreement = KeyAgreement.getInstance(str2, "Crypto");
            keyAgreement.init(privateKey, ivParameterSpec);
            keyAgreement.doPhase(this.c, true);
            cipher.init(3, keyAgreement.generateSecret(this.g), kexp15ParamsSpec);
            byte[] wrap = cipher.wrap(key);
            byte[] encoded = publicKey.getEncoded();
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
            subjectPublicKeyInfo.decode(new Asn1BerDecodeBuffer(encoded));
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport = new GostR3410_GostR3412_KeyTransport();
            gostR3410_GostR3412_KeyTransport.encryptedKey = new Asn1OctetString(wrap);
            gostR3410_GostR3412_KeyTransport.ephemeralPublicKey = subjectPublicKeyInfo;
            gostR3410_GostR3412_KeyTransport.ukm = new Asn1OctetString(bArr);
            gostR3410_GostR3412_KeyTransport.encode(asn1BerEncodeBuffer);
            return asn1BerEncodeBuffer.getMsgCopy();
        } catch (Exception e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException();
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }
}
