package ru.CryptoPro.JCSP.Cipher;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import defpackage.dy31;
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
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_GostR3412_KeyTransport;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.Kexp15ParamsSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Key.GostPublicKey;

/* loaded from: classes4.dex */
public class TransportKCipher extends TransportCipher {
    protected int j;

    public TransportKCipher() throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.g = "GOST3412_2015_K";
        this.h = "GOST3412_2015_K";
        this.j = 16;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[Catch: all -> 0x0059, Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:13:0x004a, B:15:0x004e, B:17:0x0052, B:18:0x0063, B:20:0x0068, B:22:0x006f, B:24:0x0078, B:26:0x0096, B:30:0x00a8, B:33:0x00b8, B:38:0x00b2, B:39:0x00a1, B:40:0x00dd, B:41:0x00e4, B:42:0x005f), top: B:12:0x004a }] */
    @Override // ru.CryptoPro.JCSP.Cipher.TransportCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] bArr2;
        String str2;
        SecretKey generateSecret;
        SpecKey specKey = null;
        try {
            if (this.b != 4) {
                w511.u();
                return null;
            }
            try {
                if (this.a == null) {
                    this.a = a(false);
                }
                Cipher cipher = Cipher.getInstance(proc(this.a), "JCSP");
                GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport = new GostR3410_GostR3412_KeyTransport();
                gostR3410_GostR3412_KeyTransport.decode(new Asn1BerDecodeBuffer(bArr));
                byte[] bArr3 = gostR3410_GostR3412_KeyTransport.encryptedKey.value;
                Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                gostR3410_GostR3412_KeyTransport.ephemeralPublicKey.encode(asn1BerEncodeBuffer);
                GostPublicKey gostPublicKey = new GostPublicKey(asn1BerEncodeBuffer.getMsgCopy(), false);
                try {
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
                    int i3 = this.j;
                    byte[] bArr5 = new byte[i3 / 2];
                    Array.copy(iv, 24, bArr5, 0, i3 / 2);
                    String algorithm = gostPublicKey.getAlgorithm();
                    if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                        bArr2 = null;
                        Kexp15ParamsSpec kexp15ParamsSpec = new Kexp15ParamsSpec(bArr5, bArr2);
                        str2 = this.f;
                        if (str2 != null) {
                            str2 = this.c.getAlgorithm();
                        }
                        KeyAgreement keyAgreement = KeyAgreement.getInstance(str2, "JCSP");
                        keyAgreement.init(this.c, ivParameterSpec);
                        keyAgreement.doPhase(gostPublicKey, true);
                        generateSecret = keyAgreement.generateSecret(this.g);
                        cipher.init(4, generateSecret, kexp15ParamsSpec);
                        Key unwrap = cipher.unwrap(bArr3, str, i);
                        if (generateSecret != null) {
                            ((SpecKey) generateSecret).clear();
                        }
                        gostPublicKey.clear();
                        return unwrap;
                    }
                    bArr2 = new byte[8];
                    Array.copy(iv, 16, bArr2, 0, 8);
                    Kexp15ParamsSpec kexp15ParamsSpec2 = new Kexp15ParamsSpec(bArr5, bArr2);
                    str2 = this.f;
                    if (str2 != null) {
                    }
                    KeyAgreement keyAgreement2 = KeyAgreement.getInstance(str2, "JCSP");
                    keyAgreement2.init(this.c, ivParameterSpec);
                    keyAgreement2.doPhase(gostPublicKey, true);
                    generateSecret = keyAgreement2.generateSecret(this.g);
                    cipher.init(4, generateSecret, kexp15ParamsSpec2);
                    Key unwrap2 = cipher.unwrap(bArr3, str, i);
                    if (generateSecret != null) {
                    }
                    gostPublicKey.clear();
                    return unwrap2;
                } catch (Exception e) {
                    e = e;
                    InvalidKeyException invalidKeyException = new InvalidKeyException();
                    invalidKeyException.initCause(e);
                    throw invalidKeyException;
                }
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ((SpecKey) null).clear();
                }
                if (0 != 0) {
                    specKey.clear();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc A[Catch: all -> 0x00b1, Exception -> 0x00b5, TRY_LEAVE, TryCatch #14 {Exception -> 0x00b5, all -> 0x00b1, blocks: (B:104:0x0097, B:106:0x009b, B:61:0x00bc, B:67:0x00d0, B:109:0x00a9, B:110:0x00b0), top: B:103:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119 A[Catch: all -> 0x00ff, Exception -> 0x0104, TryCatch #10 {Exception -> 0x0104, all -> 0x00ff, blocks: (B:73:0x00e8, B:75:0x00f5, B:79:0x010f, B:82:0x011d, B:98:0x0119, B:99:0x0108), top: B:72:0x00e8 }] */
    @Override // ru.CryptoPro.JCSP.Cipher.TransportCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        Key key2;
        PublicKey publicKey;
        PrivateKey privateKey;
        Key key3;
        PrivateKey privateKey2;
        PublicKey a;
        AlgorithmParameterSpec algorithmParameterSpec;
        byte[] copy;
        int i;
        String algorithm;
        byte[] bArr;
        String str;
        Key generateSecret;
        if (this.b != 3) {
            w511.u();
            return null;
        }
        Key key4 = this.c;
        if (!(key4 instanceof PublicKey)) {
            dy31.v("Recipient key must be public.");
            return null;
        }
        try {
            if (key4 instanceof GostPublicKey) {
                a = (PublicKey) key4;
            } else {
                try {
                    a = a((PublicKey) key4);
                } catch (Exception e) {
                    e = e;
                    privateKey2 = null;
                    publicKey = null;
                    key3 = null;
                    try {
                        InvalidKeyException invalidKeyException = new InvalidKeyException();
                        invalidKeyException.initCause(e);
                        throw invalidKeyException;
                    } catch (Throwable th) {
                        th = th;
                        privateKey = privateKey2;
                        key2 = key3;
                        if (key2 != null) {
                            ((SpecKey) key2).clear();
                        }
                        if (privateKey != null) {
                            ((SpecKey) privateKey).clear();
                        }
                        if (publicKey != null) {
                            ((SpecKey) publicKey).clear();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    key2 = null;
                    publicKey = null;
                    privateKey = null;
                    if (key2 != null) {
                    }
                    if (privateKey != null) {
                    }
                    if (publicKey != null) {
                    }
                    throw th;
                }
            }
            if (this.a == null) {
                this.a = a(false);
            }
            Cipher cipher = Cipher.getInstance(proc(this.a), "JCSP");
            String str2 = this.e;
            if (str2 == null) {
                String algorithm2 = a.getAlgorithm();
                if (!algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                    if (!algorithm2.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME)) {
                        if (!algorithm2.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
                            str2 = "GOST3410DHELEPH";
                        }
                    }
                    str2 = JCP.GOST_EPH_DH_2012_512_NAME;
                }
                str2 = JCP.GOST_EPH_DH_2012_256_NAME;
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str2, "JCSP");
            keyPairGenerator.initialize((AlgIdInterface) ((GostPublicKey) a).getSpec().getParams());
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            privateKey = generateKeyPair.getPrivate();
            try {
                publicKey = generateKeyPair.getPublic();
                try {
                    algorithmParameterSpec = this.d;
                } catch (Exception e2) {
                    e = e2;
                    key3 = null;
                } catch (Throwable th3) {
                    th = th3;
                    key3 = null;
                }
            } catch (Exception e3) {
                e = e3;
                key3 = null;
                privateKey2 = privateKey;
                publicKey = null;
            } catch (Throwable th4) {
                th = th4;
                key2 = null;
                publicKey = null;
            }
            try {
                try {
                    if (algorithmParameterSpec != null) {
                        try {
                            if (algorithmParameterSpec instanceof IvParameterSpec) {
                                copy = Array.copy(((IvParameterSpec) algorithmParameterSpec).getIV());
                                if (copy.length != 32) {
                                    throw new InvalidKeyException("Invalid UKM length");
                                }
                                if (copy == null) {
                                    copy = new byte[32];
                                    SecureRandom.getInstance(JCP.CP_RANDOM, "JCSP").nextBytes(copy);
                                }
                                byte[] bArr2 = new byte[16];
                                for (i = 0; i < 16; i++) {
                                    bArr2[i] = copy[15 - i];
                                }
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                int i2 = this.j;
                                byte[] bArr3 = new byte[i2 / 2];
                                key3 = null;
                                Array.copy(copy, 24, bArr3, 0, i2 / 2);
                                algorithm = publicKey.getAlgorithm();
                                if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                                    bArr = null;
                                    AlgorithmParameterSpec kexp15ParamsSpec = new Kexp15ParamsSpec(bArr3, bArr);
                                    str = this.f;
                                    if (str != null) {
                                        str = a.getAlgorithm();
                                    }
                                    KeyAgreement keyAgreement = KeyAgreement.getInstance(str, "JCSP");
                                    keyAgreement.init(privateKey, ivParameterSpec);
                                    keyAgreement.doPhase(a, true);
                                    generateSecret = keyAgreement.generateSecret(this.g);
                                    cipher.init(3, generateSecret, kexp15ParamsSpec);
                                    byte[] wrap = cipher.wrap(key);
                                    byte[] encoded = publicKey.getEncoded();
                                    SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
                                    subjectPublicKeyInfo.decode(new Asn1BerDecodeBuffer(encoded));
                                    Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                                    GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport = new GostR3410_GostR3412_KeyTransport();
                                    gostR3410_GostR3412_KeyTransport.encryptedKey = new Asn1OctetString(wrap);
                                    gostR3410_GostR3412_KeyTransport.ephemeralPublicKey = subjectPublicKeyInfo;
                                    gostR3410_GostR3412_KeyTransport.ukm = new Asn1OctetString(copy);
                                    gostR3410_GostR3412_KeyTransport.encode(asn1BerEncodeBuffer);
                                    byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
                                    if (generateSecret != null) {
                                        ((SpecKey) generateSecret).clear();
                                    }
                                    if (privateKey != null) {
                                        ((SpecKey) privateKey).clear();
                                    }
                                    ((SpecKey) publicKey).clear();
                                    return msgCopy;
                                }
                                bArr = new byte[8];
                                Array.copy(copy, 16, bArr, 0, 8);
                                AlgorithmParameterSpec kexp15ParamsSpec2 = new Kexp15ParamsSpec(bArr3, bArr);
                                str = this.f;
                                if (str != null) {
                                }
                                KeyAgreement keyAgreement2 = KeyAgreement.getInstance(str, "JCSP");
                                keyAgreement2.init(privateKey, ivParameterSpec);
                                keyAgreement2.doPhase(a, true);
                                generateSecret = keyAgreement2.generateSecret(this.g);
                                cipher.init(3, generateSecret, kexp15ParamsSpec2);
                                byte[] wrap2 = cipher.wrap(key);
                                byte[] encoded2 = publicKey.getEncoded();
                                SubjectPublicKeyInfo subjectPublicKeyInfo2 = new SubjectPublicKeyInfo();
                                subjectPublicKeyInfo2.decode(new Asn1BerDecodeBuffer(encoded2));
                                Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
                                GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport2 = new GostR3410_GostR3412_KeyTransport();
                                gostR3410_GostR3412_KeyTransport2.encryptedKey = new Asn1OctetString(wrap2);
                                gostR3410_GostR3412_KeyTransport2.ephemeralPublicKey = subjectPublicKeyInfo2;
                                gostR3410_GostR3412_KeyTransport2.ukm = new Asn1OctetString(copy);
                                gostR3410_GostR3412_KeyTransport2.encode(asn1BerEncodeBuffer2);
                                byte[] msgCopy2 = asn1BerEncodeBuffer2.getMsgCopy();
                                if (generateSecret != null) {
                                }
                                if (privateKey != null) {
                                }
                                ((SpecKey) publicKey).clear();
                                return msgCopy2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            privateKey2 = privateKey;
                            key3 = null;
                            InvalidKeyException invalidKeyException2 = new InvalidKeyException();
                            invalidKeyException2.initCause(e);
                            throw invalidKeyException2;
                        } catch (Throwable th5) {
                            th = th5;
                            key2 = null;
                            if (key2 != null) {
                            }
                            if (privateKey != null) {
                            }
                            if (publicKey != null) {
                            }
                            throw th;
                        }
                    }
                    if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME)) {
                        bArr = null;
                        AlgorithmParameterSpec kexp15ParamsSpec22 = new Kexp15ParamsSpec(bArr3, bArr);
                        str = this.f;
                        if (str != null) {
                        }
                        KeyAgreement keyAgreement22 = KeyAgreement.getInstance(str, "JCSP");
                        keyAgreement22.init(privateKey, ivParameterSpec);
                        keyAgreement22.doPhase(a, true);
                        generateSecret = keyAgreement22.generateSecret(this.g);
                        cipher.init(3, generateSecret, kexp15ParamsSpec22);
                        byte[] wrap22 = cipher.wrap(key);
                        byte[] encoded22 = publicKey.getEncoded();
                        SubjectPublicKeyInfo subjectPublicKeyInfo22 = new SubjectPublicKeyInfo();
                        subjectPublicKeyInfo22.decode(new Asn1BerDecodeBuffer(encoded22));
                        Asn1BerEncodeBuffer asn1BerEncodeBuffer22 = new Asn1BerEncodeBuffer();
                        GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport22 = new GostR3410_GostR3412_KeyTransport();
                        gostR3410_GostR3412_KeyTransport22.encryptedKey = new Asn1OctetString(wrap22);
                        gostR3410_GostR3412_KeyTransport22.ephemeralPublicKey = subjectPublicKeyInfo22;
                        gostR3410_GostR3412_KeyTransport22.ukm = new Asn1OctetString(copy);
                        gostR3410_GostR3412_KeyTransport22.encode(asn1BerEncodeBuffer22);
                        byte[] msgCopy22 = asn1BerEncodeBuffer22.getMsgCopy();
                        if (generateSecret != null) {
                        }
                        if (privateKey != null) {
                        }
                        ((SpecKey) publicKey).clear();
                        return msgCopy22;
                    }
                    cipher.init(3, generateSecret, kexp15ParamsSpec22);
                    byte[] wrap222 = cipher.wrap(key);
                    byte[] encoded222 = publicKey.getEncoded();
                    SubjectPublicKeyInfo subjectPublicKeyInfo222 = new SubjectPublicKeyInfo();
                    subjectPublicKeyInfo222.decode(new Asn1BerDecodeBuffer(encoded222));
                    Asn1BerEncodeBuffer asn1BerEncodeBuffer222 = new Asn1BerEncodeBuffer();
                    GostR3410_GostR3412_KeyTransport gostR3410_GostR3412_KeyTransport222 = new GostR3410_GostR3412_KeyTransport();
                    gostR3410_GostR3412_KeyTransport222.encryptedKey = new Asn1OctetString(wrap222);
                    gostR3410_GostR3412_KeyTransport222.ephemeralPublicKey = subjectPublicKeyInfo222;
                    gostR3410_GostR3412_KeyTransport222.ukm = new Asn1OctetString(copy);
                    gostR3410_GostR3412_KeyTransport222.encode(asn1BerEncodeBuffer222);
                    byte[] msgCopy222 = asn1BerEncodeBuffer222.getMsgCopy();
                    if (generateSecret != null) {
                    }
                    if (privateKey != null) {
                    }
                    ((SpecKey) publicKey).clear();
                    return msgCopy222;
                } catch (Exception e5) {
                    e = e5;
                    key3 = generateSecret;
                    privateKey2 = privateKey;
                    InvalidKeyException invalidKeyException22 = new InvalidKeyException();
                    invalidKeyException22.initCause(e);
                    throw invalidKeyException22;
                } catch (Throwable th6) {
                    th = th6;
                    key2 = generateSecret;
                    if (key2 != null) {
                    }
                    if (privateKey != null) {
                    }
                    if (publicKey != null) {
                    }
                    throw th;
                }
                Array.copy(copy, 24, bArr3, 0, i2 / 2);
                algorithm = publicKey.getAlgorithm();
                bArr = new byte[8];
                Array.copy(copy, 16, bArr, 0, 8);
                AlgorithmParameterSpec kexp15ParamsSpec222 = new Kexp15ParamsSpec(bArr3, bArr);
                str = this.f;
                if (str != null) {
                }
                KeyAgreement keyAgreement222 = KeyAgreement.getInstance(str, "JCSP");
                keyAgreement222.init(privateKey, ivParameterSpec);
                keyAgreement222.doPhase(a, true);
                generateSecret = keyAgreement222.generateSecret(this.g);
            } catch (Exception e6) {
                e = e6;
            } catch (Throwable th7) {
                th = th7;
                key2 = key3;
                if (key2 != null) {
                }
                if (privateKey != null) {
                }
                if (publicKey != null) {
                }
                throw th;
            }
            copy = null;
            if (copy == null) {
            }
            byte[] bArr22 = new byte[16];
            while (i < 16) {
            }
            IvParameterSpec ivParameterSpec2 = new IvParameterSpec(bArr22);
            int i22 = this.j;
            byte[] bArr32 = new byte[i22 / 2];
            key3 = null;
        } catch (Exception e7) {
            e = e7;
            key3 = null;
            privateKey2 = null;
            publicKey = null;
        } catch (Throwable th8) {
            th = th8;
            key2 = null;
            publicKey = null;
            privateKey = null;
        }
    }
}
