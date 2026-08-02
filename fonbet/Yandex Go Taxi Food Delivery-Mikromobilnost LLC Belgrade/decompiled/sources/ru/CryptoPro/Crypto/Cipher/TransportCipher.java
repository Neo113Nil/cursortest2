package ru.CryptoPro.Crypto.Cipher;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import defpackage.g8e;
import defpackage.oyr;
import defpackage.ss61;
import defpackage.unr0;
import defpackage.w511;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.Cipher;
import javax.crypto.CipherSpi;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_EncryptedKey;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_ParamSet;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_KeyTransport;
import ru.CryptoPro.JCP.ASN.GostR3410_EncryptionSyntax.GostR3410_TransportParameters;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.GostExchPrivateKey;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.spec.GostCipherSpec;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TransportCipher extends CipherSpi {
    public static final String BUNDLE_NAME = "ru.CryptoPro.Crypto.Cipher.resources.cipher";
    public static final String CIPHER_TYPE_SEPARATOR = ";";
    public static final String SECRET_KEY_TYPE = "GOST28147";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.Crypto.Cipher.resources.cipher", Locale.getDefault());
    public String a;
    public int b;
    public Key c;
    public AlgorithmParameterSpec d;
    public String e = null;
    public String f = null;
    public String g = "GOST28147";
    public String h = "GOST28147";

    public String a() {
        return this.h.equalsIgnoreCase("GOST3412_2015_M") ? "KEXP_2015_M_EXPORT" : this.h.equalsIgnoreCase("GOST3412_2015_K") ? "KEXP_2015_K_EXPORT" : "PRO_EXPORT";
    }

    public void b(Key key) {
        String algorithm = key.getAlgorithm();
        if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_DEGREE_NAME) && !algorithm.equalsIgnoreCase("GOST3410DHEL") && !algorithm.equalsIgnoreCase(JCP.GOST_EL_EPH_DEGREE_NAME) && !algorithm.equalsIgnoreCase("GOST3410DHELEPH") && !algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_DH_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_EPH_DH_2012_512_NAME)) {
            throw new InvalidKeyException(resource.getString("InvalidKeyType"));
        }
    }

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetKeySize(Key key) {
        if (key instanceof SpecKey) {
            return ((SpecKey) key).getKeySize();
        }
        InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("InvalidKeyType"));
        JCPLogger.warning(invalidKeyException);
        throw invalidKeyException;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetOutputSize(int i) {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public final AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!ss61.a) {
            throw new InvalidKeyException(resource.getString("NoCipherLicense"));
        }
        if (i != 3 && i != 4) {
            w511.u();
            return;
        }
        if (i == 4 && !(key instanceof GostExchPrivateKey)) {
            throw new InvalidKeyException(resource.getString(ErrorStrings.TRANSPORT_KEY_ERR));
        }
        b(key);
        this.b = i;
        this.c = key;
        this.d = algorithmParameterSpec;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetMode(String str) {
        this.a = str;
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetPadding(String str) {
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) {
        PublicKey publicKey = null;
        if (this.b != 4) {
            w511.u();
            return null;
        }
        try {
            String str2 = this.g;
            if (str != null) {
                str2 = str;
            }
            if (this.a == null) {
                this.a = a();
            }
            Cipher cipher = Cipher.getInstance(proc(this.a), "Crypto");
            GostR3410_KeyTransport gostR3410_KeyTransport = new GostR3410_KeyTransport();
            gostR3410_KeyTransport.decode(new Asn1BerDecodeBuffer(bArr));
            Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = gostR3410_KeyTransport.sessionEncryptedKey;
            byte[] bArr2 = gost28147_89_EncryptedKey.encryptedKey.value;
            byte[] bArr3 = gost28147_89_EncryptedKey.macKey.value;
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            new Gost28147_89_EncryptedKey(new Gost28147_89_Key(bArr2), (Gost28147_89_Key) null, new Gost28147_89_MAC(bArr3)).encode(asn1BerEncodeBuffer);
            byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
            if (gostR3410_KeyTransport.transportParameters.ephemeralPublicKey != null) {
                asn1BerEncodeBuffer.reset();
                gostR3410_KeyTransport.transportParameters.ephemeralPublicKey.encode(asn1BerEncodeBuffer);
                publicKey = new GostPublicKey(asn1BerEncodeBuffer.getMsgCopy(), false);
            } else {
                AlgorithmParameterSpec algorithmParameterSpec = this.d;
                if (algorithmParameterSpec != null && (algorithmParameterSpec instanceof GostCipherSpec)) {
                    publicKey = ((GostCipherSpec) algorithmParameterSpec).getPublicKey();
                }
            }
            if (publicKey == null) {
                throw new InvalidKeyException("Public key is undefined.");
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(gostR3410_KeyTransport.transportParameters.ukm.value);
            GostCipherSpec gostCipherSpec = new GostCipherSpec(ivParameterSpec, CryptParamsSpec.getInstance(new OID(gostR3410_KeyTransport.transportParameters.encryptionParamSet.value)));
            String str3 = this.f;
            if (str3 == null) {
                str3 = this.c.getAlgorithm();
            }
            KeyAgreement keyAgreement = KeyAgreement.getInstance(str3, "Crypto");
            keyAgreement.init(this.c, ivParameterSpec);
            keyAgreement.doPhase(publicKey, true);
            cipher.init(4, keyAgreement.generateSecret(str2), gostCipherSpec);
            return cipher.unwrap(msgCopy, str, i);
        } catch (Exception e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException();
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:7:0x0008, B:9:0x000c, B:10:0x0012, B:13:0x0025, B:15:0x0033, B:18:0x003c, B:20:0x0044, B:26:0x0053, B:28:0x005d, B:29:0x006b, B:31:0x0088, B:33:0x008c, B:35:0x00ac, B:39:0x00c6, B:41:0x00cc, B:44:0x00d3, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:49:0x00ed, B:52:0x00f8, B:55:0x00f2, B:56:0x0091, B:58:0x0095, B:60:0x0060), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:7:0x0008, B:9:0x000c, B:10:0x0012, B:13:0x0025, B:15:0x0033, B:18:0x003c, B:20:0x0044, B:26:0x0053, B:28:0x005d, B:29:0x006b, B:31:0x0088, B:33:0x008c, B:35:0x00ac, B:39:0x00c6, B:41:0x00cc, B:44:0x00d3, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:49:0x00ed, B:52:0x00f8, B:55:0x00f2, B:56:0x0091, B:58:0x0095, B:60:0x0060), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[Catch: Exception -> 0x0168, TryCatch #0 {Exception -> 0x0168, blocks: (B:7:0x0008, B:9:0x000c, B:10:0x0012, B:13:0x0025, B:15:0x0033, B:18:0x003c, B:20:0x0044, B:26:0x0053, B:28:0x005d, B:29:0x006b, B:31:0x0088, B:33:0x008c, B:35:0x00ac, B:39:0x00c6, B:41:0x00cc, B:44:0x00d3, B:45:0x00dc, B:47:0x00e2, B:48:0x00eb, B:49:0x00ed, B:52:0x00f8, B:55:0x00f2, B:56:0x0091, B:58:0x0095, B:60:0x0060), top: B:6:0x0008 }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.security.spec.AlgorithmParameterSpec] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] engineWrap(Key key) {
        IvParameterSpec ivParameterSpec;
        OID oid;
        String str;
        IvParameterSpec ivParameterSpec2 = null;
        if (this.b != 3) {
            w511.u();
            return null;
        }
        try {
            if (this.a == null) {
                this.a = a();
            }
            Cipher cipher = Cipher.getInstance(proc(this.a), "Crypto");
            String str2 = this.e;
            if (str2 == null) {
                String algorithm = this.c.getAlgorithm();
                if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) {
                    if (!algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) && !algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) {
                        str2 = "GOST3410DHELEPH";
                    }
                    str2 = JCP.GOST_EPH_DH_2012_512_NAME;
                }
                str2 = JCP.GOST_EPH_DH_2012_256_NAME;
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str2, "Crypto");
            Key key2 = this.c;
            AlgIdInterface algIdInterface = (AlgIdInterface) (key2 instanceof GostPublicKey ? (GostPublicKey) key2 : new GostPublicKey(key2.getEncoded(), false)).getSpec().getParams();
            keyPairGenerator.initialize(algIdInterface);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            PublicKey publicKey = generateKeyPair.getPublic();
            ?? r10 = this.d;
            if (r10 != 0) {
                if (r10 instanceof IvParameterSpec) {
                    IvParameterSpec ivParameterSpec3 = (IvParameterSpec) r10;
                    oid = null;
                    ivParameterSpec2 = ivParameterSpec3;
                    ivParameterSpec = ivParameterSpec3;
                } else if (r10 instanceof GostCipherSpec) {
                    ivParameterSpec2 = ((GostCipherSpec) r10).getIvParameters();
                    oid = ((GostCipherSpec) r10).getCryptParameters().getOID();
                    ivParameterSpec = r10;
                }
                if (ivParameterSpec2 == null) {
                    byte[] bArr = new byte[8];
                    SecureRandom.getInstance(JCP.CP_RANDOM, "JCP").nextBytes(bArr);
                    ivParameterSpec2 = new IvParameterSpec(bArr);
                }
                if (ivParameterSpec == null) {
                    ivParameterSpec = ivParameterSpec2;
                }
                if (oid == null) {
                    if (!str2.equalsIgnoreCase(JCP.GOST_EPH_DH_2012_256_NAME) && !str2.equalsIgnoreCase(JCP.GOST_EPH_DH_2012_512_NAME)) {
                        oid = CryptParamsSpec.getInstance().getOID();
                    }
                    oid = algIdInterface.getCryptParams() != null ? algIdInterface.getCryptParams().getOID() : CryptParamsSpec.OID_Gost28147_89_Rosstandart_TC26_Z_ParamSet;
                }
                str = this.f;
                if (str != null) {
                    str = this.c.getAlgorithm();
                }
                KeyAgreement keyAgreement = KeyAgreement.getInstance(str, "Crypto");
                keyAgreement.init(privateKey, ivParameterSpec2);
                keyAgreement.doPhase(this.c, true);
                cipher.init(3, keyAgreement.generateSecret(this.g), ivParameterSpec);
                byte[] wrap = cipher.wrap(key);
                Gost28147_89_EncryptedKey gost28147_89_EncryptedKey = new Gost28147_89_EncryptedKey();
                gost28147_89_EncryptedKey.decode(new Asn1BerDecodeBuffer(wrap));
                byte[] bArr2 = gost28147_89_EncryptedKey.macKey.value;
                byte[] bArr3 = gost28147_89_EncryptedKey.encryptedKey.value;
                byte[] encoded = publicKey.getEncoded();
                SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo();
                subjectPublicKeyInfo.decode(new Asn1BerDecodeBuffer(encoded));
                GostR3410_KeyTransport gostR3410_KeyTransport = new GostR3410_KeyTransport();
                Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                gostR3410_KeyTransport.sessionEncryptedKey = new Gost28147_89_EncryptedKey(bArr3, bArr2);
                gostR3410_KeyTransport.transportParameters = new GostR3410_TransportParameters(new Gost28147_89_ParamSet(oid.value), subjectPublicKeyInfo, new Asn1OctetString(ivParameterSpec2.getIV()));
                gostR3410_KeyTransport.encode(asn1BerEncodeBuffer);
                return asn1BerEncodeBuffer.getMsgCopy();
            }
            ivParameterSpec = null;
            oid = null;
            if (ivParameterSpec2 == null) {
            }
            if (ivParameterSpec == null) {
            }
            if (oid == null) {
            }
            str = this.f;
            if (str != null) {
            }
            KeyAgreement keyAgreement2 = KeyAgreement.getInstance(str, "Crypto");
            keyAgreement2.init(privateKey, ivParameterSpec2);
            keyAgreement2.doPhase(this.c, true);
            cipher.init(3, keyAgreement2.generateSecret(this.g), ivParameterSpec);
            byte[] wrap2 = cipher.wrap(key);
            Gost28147_89_EncryptedKey gost28147_89_EncryptedKey2 = new Gost28147_89_EncryptedKey();
            gost28147_89_EncryptedKey2.decode(new Asn1BerDecodeBuffer(wrap2));
            byte[] bArr22 = gost28147_89_EncryptedKey2.macKey.value;
            byte[] bArr32 = gost28147_89_EncryptedKey2.encryptedKey.value;
            byte[] encoded2 = publicKey.getEncoded();
            SubjectPublicKeyInfo subjectPublicKeyInfo2 = new SubjectPublicKeyInfo();
            subjectPublicKeyInfo2.decode(new Asn1BerDecodeBuffer(encoded2));
            GostR3410_KeyTransport gostR3410_KeyTransport2 = new GostR3410_KeyTransport();
            Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
            gostR3410_KeyTransport2.sessionEncryptedKey = new Gost28147_89_EncryptedKey(bArr32, bArr22);
            gostR3410_KeyTransport2.transportParameters = new GostR3410_TransportParameters(new Gost28147_89_ParamSet(oid.value), subjectPublicKeyInfo2, new Asn1OctetString(ivParameterSpec2.getIV()));
            gostR3410_KeyTransport2.encode(asn1BerEncodeBuffer2);
            return asn1BerEncodeBuffer2.getMsgCopy();
        } catch (Exception e) {
            InvalidKeyException invalidKeyException = new InvalidKeyException();
            invalidKeyException.initCause(e);
            throw invalidKeyException;
        }
    }

    public String proc(String str) {
        String t = oyr.t(new StringBuilder(), this.h, "/CFB/NoPadding");
        if (str != null) {
            String[] split = str.split(";");
            if (split.length == 1 && str.length() != 0) {
                t = g8e.r(new StringBuilder(), this.h, "/", str, "/NoPadding");
            } else if (split.length >= 2) {
                String str2 = split.length == 2 ? "NoPadding" : split[2];
                StringBuilder sb = new StringBuilder();
                sb.append(split[0]);
                sb.append("/");
                t = unr0.r(sb, split[1], "/", str2);
            }
            if (split.length > 3) {
                this.e = split[3];
            }
            if (split.length > 4) {
                this.f = split[4];
            }
            if (split.length > 5) {
                this.g = split[5];
            }
        }
        return t;
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, SecureRandom secureRandom) {
        if (!ss61.a) {
            throw new InvalidKeyException(resource.getString("NoCipherLicense"));
        }
        if (i != 3 && i != 4) {
            w511.u();
        } else {
            if (i == 4 && !(key instanceof GostExchPrivateKey)) {
                throw new InvalidKeyException(resource.getString(ErrorStrings.TRANSPORT_KEY_ERR));
            }
            b(key);
            this.b = i;
            this.c = key;
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        throw new UnsupportedOperationException();
    }
}
