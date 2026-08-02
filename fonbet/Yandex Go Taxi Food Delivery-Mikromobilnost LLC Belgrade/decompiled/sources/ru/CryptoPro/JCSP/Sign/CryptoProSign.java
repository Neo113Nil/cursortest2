package ru.CryptoPro.JCSP.Sign;

import defpackage.ny61;
import defpackage.w511;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.Digest.DigestForSign;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Key.StrictModeHelper;
import ru.CryptoPro.JCP.Sign.AbstractSignature;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.DigestParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;
import ru.CryptoPro.JCP.spec.LocalContextSpec;
import ru.CryptoPro.JCSP.Digest.BaseGostDigest;
import ru.CryptoPro.JCSP.Digest.GostDigest;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.GostPrivateKey;
import ru.CryptoPro.JCSP.Key.GostPublicKey;
import ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface;
import ru.CryptoPro.JCSP.Key.JCSPPublicKeyInterface;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.Key.ecdsa.ECDSAPublicKey;
import ru.CryptoPro.JCSP.Key.eddsa.EDDSAPublicKey;
import ru.CryptoPro.JCSP.Key.rsa.RSAPublicKey;
import ru.CryptoPro.JCSP.MSCAPI.CAPI;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.Starter;

/* loaded from: classes4.dex */
public abstract class CryptoProSign extends AbstractSignature {
    protected static final String A = "GenNoHash";
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.Sign.resources.sign";
    private static final String C = "Updated";
    private static final String D = "NotSupport";
    private static final String E = "NeedEllipticKey";
    public static final String INV_KEY_ALG = "AlgNotMatch";
    public static final String INV_KEY_TYPE = "InvKeyType";
    public static final String INV_KEY_VALUE = "InvKey";
    public static final String INV_PARAMS_TYPE = "InvParams";
    public static final String INV_SIG_LEN = "InvSigLen";
    public static final int SIGNATURE_LENGTH_2001 = 64;
    protected static final String a = "GenSHA1RSA";
    protected static final String b = "GenSHA224RSA";
    protected static final String c = "GenSHA256RSA";
    protected static final String d = "GenSHA384RSA";
    protected static final String e = "GenSHA512RSA";
    protected static final String f = "GenSHA3-224RSA";
    protected static final String g = "GenSHA3-256RSA";
    protected static final String h = "GenSHA3-384RSA";
    protected static final String i = "GenSHA3-512RSA";
    protected static final String j = "GenKECCAK-224RSA";
    protected static final String k = "GenKECCAK-256RSA";
    protected static final String l = "GenKECCAK-384RSA";
    protected static final String m = "GenKECCAK-512RSA";
    protected static final String n = "GenSHA1ECDSA";
    protected static final String o = "GenSHA224ECDSA";
    protected static final String p = "GenSHA256ECDSA";
    protected static final String q = "GenSHA384ECDSA";
    protected static final String r = "GenSHA512ECDSA";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCP.Sign.resources.sign", Locale.getDefault());
    protected static final String s = "GenSHA3-224ECDSA";
    protected static final String t = "GenSHA3-256ECDSA";
    protected static final String u = "GenSHA3-384ECDSA";
    protected static final String v = "GenSHA3-512ECDSA";
    protected static final String w = "GenKECCAK-224ECDSA";
    protected static final String x = "GenKECCAK-256ECDSA";
    protected static final String y = "GenKECCAK-384ECDSA";
    protected static final String z = "GenKECCAK-512ECDSA";
    protected KeyInterface B;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;

    public CryptoProSign(String str, String str2) {
        super(str, str2);
        this.F = 0;
        this.B = null;
        this.G = false;
        this.H = false;
        this.I = false;
        Starter.check(CryptoProSign.class);
    }

    private void prepare() throws InvalidKeyException {
        if (this.dataHash == null) {
            JCSPLogger.subEnter();
            try {
                AlgorithmParameterSpec algorithmParameterSpec = this.initParams;
                if (algorithmParameterSpec == null) {
                    throw new InvalidKeyException(resource.getString("InvParams"));
                }
                if (!(algorithmParameterSpec instanceof AlgIdInterface)) {
                    throw new InvalidKeyException(resource.getString("InvParams"));
                }
                this.H = false;
                KeyInterface keyInterface = this.B;
                if (keyInterface == null) {
                    throw new InvalidKeyException(resource.getString(INV_KEY_VALUE));
                }
                this.dataHash = getDigestObject(keyInterface, this.I);
                AlgorithmParameterSpec algorithmParameterSpec2 = this.initParams;
                if (!(algorithmParameterSpec2 instanceof AlgIdSpecForeign) && ((AlgIdInterface) algorithmParameterSpec2).getDigestParams() != null) {
                    this.dataHash.reset(((AlgIdInterface) this.initParams).getDigestParams().getOID());
                }
                this.signParams = ((AlgIdInterface) this.initParams).getSignParams();
                a();
                JCSPLogger.subExit();
            } catch (Error e2) {
                b();
                throw e2;
            } catch (RuntimeException e3) {
                b();
                throw e3;
            } catch (InvalidKeyException e4) {
                b();
                throw e4;
            }
        }
    }

    public void a() throws InvalidKeyException {
        ParamsInterface paramsInterface = this.signParams;
        if (paramsInterface != null && !(paramsInterface instanceof EllipticParamsInterface)) {
            throw new InvalidKeyException(resource.getString(E));
        }
    }

    public void b() {
        AbstractGostDigest abstractGostDigest = this.dataHash;
        if (abstractGostDigest != null) {
            abstractGostDigest.engineReset();
            this.dataHash = null;
        }
        this.G = false;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        try {
            try {
                JCSPLogger.enter();
                String algorithm = getAlgorithm();
                String algorithm2 = privateKey.getAlgorithm();
                if (validateAlgorithms(algorithm, algorithm2)) {
                    KeyInterface spec = ((GostPrivateKey) privateKey).getSpec();
                    this.B = spec;
                    this.initParams = spec.getParams();
                    return;
                }
                throw new InvalidKeyException(resource.getString("AlgNotMatch") + " (inappropriate key algorithm: " + algorithm2 + " and signature algorithm: " + algorithm + ").");
            } catch (Error e2) {
                b();
                throw e2;
            } catch (RuntimeException e3) {
                b();
                throw e3;
            }
        } finally {
            JCSPLogger.exit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0118 A[Catch: InvalidKeyException -> 0x004e, RuntimeException -> 0x0051, Error -> 0x0054, all -> 0x0197, TryCatch #5 {InvalidKeyException -> 0x004e, blocks: (B:3:0x0002, B:6:0x0012, B:8:0x0016, B:10:0x0024, B:12:0x0033, B:14:0x0046, B:15:0x0057, B:19:0x0061, B:20:0x008f, B:21:0x0090, B:23:0x009c, B:27:0x00a8, B:29:0x00bc, B:31:0x00c7, B:34:0x00f3, B:36:0x00f7, B:38:0x0102, B:41:0x0112, B:43:0x0118, B:45:0x0123, B:47:0x012a, B:49:0x0131, B:50:0x014c, B:53:0x0139, B:55:0x0141, B:56:0x0147, B:57:0x015c, B:58:0x016a, B:59:0x016b, B:60:0x018a, B:61:0x00d6, B:63:0x00e1), top: B:2:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131 A[Catch: InvalidKeyException -> 0x004e, RuntimeException -> 0x0051, Error -> 0x0054, InvalidAlgorithmParameterException -> 0x015c, InvalidKeySpecException -> 0x016b, all -> 0x0197, TryCatch #5 {InvalidKeyException -> 0x004e, blocks: (B:3:0x0002, B:6:0x0012, B:8:0x0016, B:10:0x0024, B:12:0x0033, B:14:0x0046, B:15:0x0057, B:19:0x0061, B:20:0x008f, B:21:0x0090, B:23:0x009c, B:27:0x00a8, B:29:0x00bc, B:31:0x00c7, B:34:0x00f3, B:36:0x00f7, B:38:0x0102, B:41:0x0112, B:43:0x0118, B:45:0x0123, B:47:0x012a, B:49:0x0131, B:50:0x014c, B:53:0x0139, B:55:0x0141, B:56:0x0147, B:57:0x015c, B:58:0x016a, B:59:0x016b, B:60:0x018a, B:61:0x00d6, B:63:0x00e1), top: B:2:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    @Override // java.security.SignatureSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        boolean z2;
        try {
            try {
                try {
                    JCSPLogger.enter();
                    boolean z3 = false;
                    boolean z4 = CAPI.StrengthenedKeyUsageControlState == 1;
                    if (publicKey instanceof GostPublicKey) {
                        String algorithm = getAlgorithm();
                        String algorithm2 = publicKey.getAlgorithm();
                        if (!validateAlgorithms(algorithm, algorithm2)) {
                            throw new InvalidKeyException(resource.getString("AlgNotMatch") + " (inappropriate key algorithm: " + algorithm2 + " and signature algorithm: " + algorithm + ").");
                        }
                        this.B = ((GostPublicKey) publicKey).getSpec();
                        if (JCSPLogger.isFinerEnabled()) {
                            StringBuffer stringBuffer = new StringBuffer();
                            if (StrictModeHelper.warnIfKeyIsUntrusted(publicKey, ((JCSPPublicKeyInterface) this.B).isTrusted(), z4, stringBuffer)) {
                                JCSPLogger.warning(stringBuffer.toString());
                            }
                        }
                        this.initParams = this.B.getParams();
                    } else {
                        String algorithm3 = publicKey.getAlgorithm();
                        try {
                            if (!algorithm3.equalsIgnoreCase("RSA") && !algorithm3.equalsIgnoreCase("CP_RSA")) {
                                z2 = false;
                                boolean equalsIgnoreCase = algorithm3.equalsIgnoreCase("EC");
                                boolean equalsIgnoreCase2 = algorithm3.equalsIgnoreCase("ED");
                                byte[] encoded = publicKey.getEncoded();
                                boolean z5 = !(publicKey instanceof SpecKey) && (((((SpecKey) publicKey).getSpec() instanceof JCSPPublicKeyInterface) && ((JCSPPublicKeyInterface) ((SpecKey) publicKey).getSpec()).isTrusted()) || ((((SpecKey) publicKey).getSpec() instanceof PublicKeyInterface) && ((PublicKeyInterface) ((SpecKey) publicKey).getSpec()).isTrusted()));
                                if ((publicKey instanceof SpecKey) && (((SpecKey) publicKey).getSpec() instanceof JCSPPublicKeyInterface) && ((JCSPPublicKeyInterface) ((SpecKey) publicKey).getSpec()).isUseDefaultCSPProvider()) {
                                    z3 = true;
                                }
                                if (JCSPLogger.isFinerEnabled()) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    if (StrictModeHelper.warnIfKeyIsUntrusted(publicKey, z5, z4, stringBuffer2)) {
                                        JCSPLogger.warning(stringBuffer2.toString());
                                    }
                                }
                                PublicKeySpec publicKeySpec = new PublicKeySpec(encoded, z5, z3);
                                KeyInterface spec = (!z2 ? new RSAPublicKey(publicKeySpec) : equalsIgnoreCase ? new ECDSAPublicKey(publicKeySpec) : equalsIgnoreCase2 ? new EDDSAPublicKey(publicKeySpec) : new GostPublicKey(publicKeySpec)).getSpec();
                                this.B = spec;
                                this.initParams = spec.getParams();
                            }
                            PublicKeySpec publicKeySpec2 = new PublicKeySpec(encoded, z5, z3);
                            KeyInterface spec2 = (!z2 ? new RSAPublicKey(publicKeySpec2) : equalsIgnoreCase ? new ECDSAPublicKey(publicKeySpec2) : equalsIgnoreCase2 ? new EDDSAPublicKey(publicKeySpec2) : new GostPublicKey(publicKeySpec2)).getSpec();
                            this.B = spec2;
                            this.initParams = spec2.getParams();
                        } catch (InvalidAlgorithmParameterException unused) {
                            InvalidKeyException invalidKeyException = new InvalidKeyException(resource.getString("InvKeyType"));
                            JCSPLogger.warning(invalidKeyException);
                            throw invalidKeyException;
                        } catch (InvalidKeySpecException unused2) {
                            throw new InvalidKeyException(resource.getString("InvKeyType") + " " + publicKey);
                        }
                        z2 = true;
                        boolean equalsIgnoreCase3 = algorithm3.equalsIgnoreCase("EC");
                        boolean equalsIgnoreCase22 = algorithm3.equalsIgnoreCase("ED");
                        byte[] encoded2 = publicKey.getEncoded();
                        if (publicKey instanceof SpecKey) {
                        }
                        if (publicKey instanceof SpecKey) {
                            z3 = true;
                        }
                        if (JCSPLogger.isFinerEnabled()) {
                        }
                    }
                } catch (InvalidKeyException e2) {
                    b();
                    throw e2;
                }
            } catch (Error e3) {
                b();
                throw e3;
            } catch (RuntimeException e4) {
                b();
                throw e4;
            }
        } finally {
            JCSPLogger.exit();
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        try {
            try {
                if (algorithmParameterSpec == null) {
                    w511.x("Parameter is null");
                    return;
                }
                try {
                    if (this.G) {
                        throw new InvalidAlgorithmParameterException(resource.getString(C));
                    }
                    if (!(algorithmParameterSpec instanceof DigestParamsInterface) && !(algorithmParameterSpec instanceof DigestForSign) && !(algorithmParameterSpec instanceof SignatureParamsSpec) && !(algorithmParameterSpec instanceof LocalContextSpec)) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    if (this.digestType.equals("RawGOST") || this.digestType.equals("RawGOST_2012_256") || this.digestType.equals("RawGOST_2012_512")) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    if (algorithmParameterSpec instanceof DigestParamsInterface) {
                        JCSPLogger.warning("Digest parameters should match the key params. New digest params will not be applied.");
                    } else if (algorithmParameterSpec instanceof DigestForSign) {
                        MessageDigest digest = ((DigestForSign) algorithmParameterSpec).getDigest();
                        if (!validateSignDigestAlgorithms(getAlgorithm(), digest.getAlgorithm())) {
                            throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                        }
                        MessageDigest messageDigest = (MessageDigest) digest.clone();
                        if (!(messageDigest instanceof GostDigest)) {
                            throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                        }
                        this.H = true;
                        this.dataHash = (GostDigest) messageDigest;
                    } else if (algorithmParameterSpec instanceof LocalContextSpec) {
                        this.I = true;
                    } else if (algorithmParameterSpec instanceof SignatureParamsSpec) {
                        a(((SignatureParamsSpec) algorithmParameterSpec).getFlag());
                    }
                    JCSPLogger.exit();
                } catch (CloneNotSupportedException e2) {
                    JCSPLogger.warning(e2.getMessage(), (Throwable) e2);
                    throw new InvalidAlgorithmParameterException(e2);
                } catch (InvalidAlgorithmParameterException e3) {
                    JCSPLogger.warning(e3);
                    throw e3;
                }
            } catch (InvalidAlgorithmParameterException e4) {
                b();
                throw e4;
            }
        } catch (Error e5) {
            b();
            throw e5;
        } catch (RuntimeException e6) {
            b();
            throw e6;
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        SignValue signature;
        try {
            try {
                JCSPLogger.enter();
                try {
                    prepare();
                    if (!BaseGostDigest.USE_HASH_PERSONAL_CONTEXT && this.isGen && !this.H && !HKey.USE_LOCAL_HASH_CONTEXT && !this.I) {
                        this.dataHash.engineDigestWithoutClean();
                        signature = ((JCSPPrivateKeyInterface) this.B).signature((HHash) this.dataHash.getHash(), this.F);
                        this.dataHash.engineReset();
                        this.dataHash = null;
                        JCSPLogger.exit();
                        return signature.encode();
                    }
                    signature = ((JCSPPrivateKeyInterface) this.B).signature(this.dataHash.engineDigestWithCheck(), this.dataHash.getAlgorithmIdentifier(), this.F);
                    this.dataHash.engineReset();
                    this.dataHash = null;
                    JCSPLogger.exit();
                    return signature.encode();
                } catch (InvalidKeyException e2) {
                    JCSPLogger.warning(e2);
                    throw new SignatureException(e2);
                } catch (SignatureException e3) {
                    JCSPLogger.warning(e3);
                    throw e3;
                }
            } catch (SignatureException e4) {
                b();
                throw e4;
            }
        } catch (Error e5) {
            b();
            throw e5;
        } catch (RuntimeException e6) {
            b();
            throw e6;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) {
        try {
            prepare();
            this.G = true;
            this.dataHash.engineUpdate(b2);
        } catch (Error e2) {
            b();
            throw e2;
        } catch (RuntimeException e3) {
            b();
            throw e3;
        } catch (InvalidKeyException e4) {
            b();
            ny61.j(e4);
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr, int i2, int i3) throws SignatureException {
        boolean verifySignature;
        try {
            try {
                JCSPLogger.enter();
                try {
                    prepare();
                    int signatureLength = getSignatureLength(i3);
                    if (i3 < signatureLength || bArr.length - i2 < signatureLength) {
                        throw new SignatureException(resource.getString("InvSigLen"));
                    }
                    byte[] bArr2 = new byte[signatureLength];
                    System.arraycopy(bArr, i2, bArr2, 0, signatureLength);
                    GostSignature gostSignature = new GostSignature(bArr2);
                    if (!BaseGostDigest.USE_HASH_PERSONAL_CONTEXT && this.isGen && !this.H) {
                        this.dataHash.engineDigestWithoutClean();
                        verifySignature = ((JCSPPublicKeyInterface) this.B).verifySignature(gostSignature, (HHash) this.dataHash.getHash(), this.F);
                        this.dataHash.engineReset();
                        this.dataHash = null;
                        JCSPLogger.exit();
                        return verifySignature;
                    }
                    verifySignature = ((JCSPPublicKeyInterface) this.B).verifySignature(gostSignature, this.dataHash.engineDigestWithCheck(), this.dataHash.getAlgorithmIdentifier(), this.F);
                    this.dataHash.engineReset();
                    this.dataHash = null;
                    JCSPLogger.exit();
                    return verifySignature;
                } catch (InvalidKeyException e2) {
                    JCSPLogger.warning(e2);
                    throw new SignatureException(e2);
                } catch (SignatureException e3) {
                    JCSPLogger.warning(e3);
                    throw e3;
                }
            } catch (SignatureException e4) {
                b();
                throw e4;
            }
        } catch (Error e5) {
            b();
            throw e5;
        } catch (RuntimeException e6) {
            b();
            throw e6;
        }
    }

    public void finalize() throws Throwable {
    }

    @Override // java.security.Signature
    public String toString() {
        if (this.B == null) {
            return "Gost Signature\nUNINIIALIZED";
        }
        return "\n params: " + this.B.getParams().toString();
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateExtraAlgorithms(String str, String str2) {
        return false;
    }

    public void a(int i2) {
        this.F = i2;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i2, int i3) {
        try {
            prepare();
            this.G = true;
            this.dataHash.engineUpdate(bArr, i2, i3);
        } catch (Error e2) {
            b();
            throw e2;
        } catch (RuntimeException e3) {
            b();
            throw e3;
        } catch (InvalidKeyException e4) {
            b();
            ny61.j(e4);
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            return engineVerify(bArr, 0, bArr.length);
        } catch (Error e2) {
            this.b();
            throw e2;
        } catch (RuntimeException e3) {
            this.b();
            throw e3;
        } catch (SignatureException e4) {
            this.b();
            throw e4;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new InvalidParameterException(D);
    }
}
