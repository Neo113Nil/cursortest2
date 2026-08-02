package ru.CryptoPro.JCP.Sign;

import defpackage.fq61;
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
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.Digest.DigestForSign;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.Digest.GostDigest2012_512;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Key.StrictModeHelper;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.DigestParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Starter;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public abstract class a extends AbstractSignature {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.Sign.resources.sign";
    public static final String INV_KEY_ALG = "AlgNotMatch";
    public static final String INV_KEY_TYPE = "InvKeyType";
    public static final String INV_PARAMS_TYPE = "InvParams";
    public static final String INV_SIG_LEN = "InvSigLen";
    public PublicKeyInterface J;
    public PrivateKeyInterface K;
    public boolean L;
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCP.Sign.resources.sign", Locale.getDefault());
    public static final byte[] test_hash = {53, 52, 69, 65, Alerts.alert_decode_error, 69, 66, 54, 68, 49, 52, 69, 52, 55, 49, 57, 67, 54, Alerts.alert_decrypt_error, 69, 55, 65, 67, 66, 52, 69, 65, 54, 49, 69, 66, 48};
    public static final byte[] test_sign = {1, 2, 3, 4, 5, 6, 7, 8, 9, PKIBody._CKUANN, PKIBody._CANN, 18, 19, 20, 21, 22, 23, 24, 25, BlobHeaderStructure.BLOB_VERSION, BlobHeaderStructure.KEXP15_BLOB_VERSION, 34, 35, 36, 37, 38, 39, Alerts.alert_handshake_failure, Alerts.alert_no_certificate, 48, 49, Alerts.alert_decode_error};
    public static final byte[] test_K = {-112, -13, -91, Alerts.alert_no_renegotiation, 67, -110, 66, -11, 24, Alerts.alert_unsupported_extension, -69, 34, 76, -114, 34, 56, PKIBody._CANN, -73, PKIBody._CKUANN, 92, Alerts.alert_no_renegotiation, -28, -11, 57, 8, 7, -26, 54, Alerts.alert_certificate_expired, -12, -57, Alerts.alert_bad_certificate};

    public a(String str, String str2) {
        super(str, str2);
        this.J = null;
        this.K = null;
        this.L = false;
        Starter.check(a.class);
    }

    public final void a() {
        if (!(this.signParams instanceof EllipticParamsInterface)) {
            throw new InvalidKeyException(resource.getString("NeedEllipticKey"));
        }
    }

    public final void c() {
        try {
            AlgorithmParameterSpec algorithmParameterSpec = this.initParams;
            if (algorithmParameterSpec == null) {
                throw new InvalidKeyException(resource.getString("InvParams"));
            }
            if (!(algorithmParameterSpec instanceof AlgIdInterface)) {
                throw new InvalidKeyException(resource.getString("InvParams"));
            }
            this.dataHash = getDigestObject();
            this.signParams = ((AlgIdInterface) this.initParams).getSignParams();
        } catch (Error e) {
            d();
            throw e;
        } catch (RuntimeException e2) {
            d();
            throw e2;
        } catch (InvalidKeyException e3) {
            d();
            throw e3;
        }
    }

    public final void d() {
        PrivateKeyInterface privateKeyInterface = this.K;
        if (privateKeyInterface != null) {
            privateKeyInterface.clear();
            this.K = null;
        }
        PublicKeyInterface publicKeyInterface = this.J;
        if (publicKeyInterface != null) {
            publicKeyInterface.clear();
            this.J = null;
        }
        AbstractGostDigest abstractGostDigest = this.dataHash;
        if (abstractGostDigest != null) {
            abstractGostDigest.engineReset();
            this.dataHash = null;
        }
        this.L = false;
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature, java.security.SignatureSpi
    public final Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public final void engineInitSign(PrivateKey privateKey) {
        try {
            try {
                try {
                    JCPLogger.enter();
                    String algorithm = getAlgorithm();
                    String algorithm2 = privateKey.getAlgorithm();
                    if (validateAlgorithms(algorithm, algorithm2)) {
                        PrivateKeyInterface extractSpec = InternalGostPrivateKey.extractSpec(privateKey);
                        this.K = extractSpec;
                        this.initParams = extractSpec.getParams();
                        c();
                        a();
                        return;
                    }
                    throw new InvalidKeyException(resource.getString("AlgNotMatch") + " (inappropriate key algorithm: " + algorithm2 + " and signature algorithm: " + algorithm + ").");
                } catch (RuntimeException e) {
                    d();
                    throw e;
                }
            } catch (Error e2) {
                d();
                throw e2;
            } catch (InvalidKeyException e3) {
                d();
                throw e3;
            }
        } finally {
            JCPLogger.exit();
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineInitVerify(PublicKey publicKey) {
        try {
            try {
                try {
                    try {
                        JCPLogger.enter();
                        boolean isStrictModeEnabled = KeyUsageControlUtility.isStrictModeEnabled();
                        try {
                            if (publicKey instanceof GostPublicKey) {
                                String algorithm = getAlgorithm();
                                String algorithm2 = publicKey.getAlgorithm();
                                if (!validateAlgorithms(algorithm, algorithm2)) {
                                    throw new InvalidKeyException(resource.getString("AlgNotMatch") + " (inappropriate key algorithm: " + algorithm2 + " and signature algorithm: " + algorithm + ").");
                                }
                                this.J = (PublicKeyInterface) ((GostPublicKey) publicKey).getSpec();
                                if (JCPLogger.isFinerEnabled()) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    if (StrictModeHelper.warnIfKeyIsUntrusted(publicKey, this.J.isTrusted(), isStrictModeEnabled, stringBuffer)) {
                                        JCPLogger.warning(stringBuffer.toString());
                                    }
                                }
                                this.initParams = this.J.getParams();
                                c();
                                a();
                            } else {
                                byte[] encoded = publicKey.getEncoded();
                                boolean z = (publicKey instanceof SpecKey) && (((SpecKey) publicKey).getSpec() instanceof PublicKeyInterface) && ((PublicKeyInterface) ((SpecKey) publicKey).getSpec()).isTrusted();
                                if (JCPLogger.isFinerEnabled()) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    if (StrictModeHelper.warnIfKeyIsUntrusted(publicKey, z, isStrictModeEnabled, stringBuffer2)) {
                                        JCPLogger.warning(stringBuffer2.toString());
                                    }
                                }
                                try {
                                    PublicKeyInterface publicKeyInterface = (PublicKeyInterface) new GostPublicKey(encoded, z).getSpec();
                                    this.J = publicKeyInterface;
                                    this.initParams = publicKeyInterface.getParams();
                                    c();
                                    a();
                                } catch (InvalidKeySpecException unused) {
                                    throw new InvalidKeyException(resource.getString("InvKeyType") + publicKey);
                                }
                            }
                        } catch (InvalidKeyException e) {
                            JCPLogger.warning(e);
                            throw e;
                        }
                    } catch (InvalidKeyException e2) {
                        d();
                        throw e2;
                    }
                } catch (RuntimeException e3) {
                    d();
                    throw e3;
                }
            } catch (Error e4) {
                d();
                throw e4;
            }
        } finally {
            JCPLogger.exit();
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            w511.x("Parameter is null");
            return;
        }
        try {
            try {
                JCPLogger.enter();
                try {
                    if (this.L) {
                        throw new InvalidAlgorithmParameterException(resource.getString("Updated"));
                    }
                    if (!(algorithmParameterSpec instanceof DigestParamsInterface) && !(algorithmParameterSpec instanceof DigestForSign)) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    if (this.digestType.equals("RawGOST") || this.digestType.equals("RawGOST_2012_256") || this.digestType.equals("RawGOST_2012_512")) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    if (algorithmParameterSpec instanceof DigestParamsInterface) {
                        AbstractGostDigest abstractGostDigest = this.dataHash;
                        if ((abstractGostDigest instanceof GostDigest) || (abstractGostDigest instanceof fq61)) {
                            JCPLogger.warning("Digest parameters should match key params. New digest params will not be applied.");
                            JCPLogger.exit();
                        }
                    }
                    if (!(algorithmParameterSpec instanceof DigestForSign)) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    MessageDigest digest = ((DigestForSign) algorithmParameterSpec).getDigest();
                    if (!(digest instanceof GostDigest) && !(digest instanceof fq61)) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    if (!validateSignDigestAlgorithms(getAlgorithm(), digest.getAlgorithm())) {
                        throw new InvalidAlgorithmParameterException(resource.getString("InvParams"));
                    }
                    this.dataHash = digest instanceof GostDigest ? (GostDigest) digest : (fq61) digest;
                    JCPLogger.exit();
                } catch (InvalidAlgorithmParameterException e) {
                    JCPLogger.warning(e);
                    throw e;
                }
            } catch (InvalidAlgorithmParameterException e2) {
                d();
                throw e2;
            }
        } catch (Error e3) {
            d();
            throw e3;
        } catch (RuntimeException e4) {
            d();
            throw e4;
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            try {
                JCPLogger.enter();
                try {
                    SignValue signature = this.K.signature(this.dataHash.engineDigestWithCheck());
                    this.dataHash.engineReset();
                    byte[] invByteOrderB = Array.invByteOrderB(signature.encode());
                    JCPLogger.exit();
                    return invByteOrderB;
                } catch (InvalidKeyException e) {
                    SignatureException signatureException = new SignatureException(e.getMessage());
                    signatureException.initCause(e);
                    JCPLogger.warning(signatureException);
                    throw signatureException;
                } catch (SignatureException e2) {
                    JCPLogger.warning(e2);
                    throw e2;
                }
            } catch (SignatureException e3) {
                d();
                throw e3;
            }
        } catch (Error e4) {
            d();
            throw e4;
        } catch (RuntimeException e5) {
            d();
            throw e5;
        }
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte b) {
        try {
            this.L = true;
            this.dataHash.engineUpdate(b);
        } catch (Error e) {
            d();
            throw e;
        } catch (RuntimeException e2) {
            d();
            throw e2;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr, int i, int i2) {
        try {
            try {
                JCPLogger.enter();
                try {
                    int signatureLength = getSignatureLength(i2);
                    if (i2 < signatureLength || bArr.length - i < signatureLength) {
                        throw new SignatureException(resource.getString("InvSigLen"));
                    }
                    byte[] bArr2 = new byte[signatureLength];
                    System.arraycopy(bArr, i, bArr2, 0, signatureLength);
                    GostSignature gostSignature = new GostSignature(bArr2);
                    byte[] engineDigestWithCheck = this.dataHash.engineDigestWithCheck();
                    this.dataHash.engineReset();
                    boolean verifySignature = this.J.verifySignature(gostSignature, engineDigestWithCheck);
                    JCPLogger.exit();
                    return verifySignature;
                } catch (InvalidKeyException e) {
                    JCPLogger.warning(e);
                    throw new SignatureException(e);
                } catch (SignatureException e2) {
                    JCPLogger.warning(e2);
                    throw e2;
                }
            } catch (SignatureException e3) {
                d();
                throw e3;
            }
        } catch (Error e4) {
            d();
            throw e4;
        } catch (RuntimeException e5) {
            d();
            throw e5;
        }
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public final AbstractGostDigest getDigestObject() {
        String digestType = getDigestType();
        if (digestType.equals("GenGOST_2012_256")) {
            GostDigest2012_256 gostDigest2012_256 = new GostDigest2012_256();
            gostDigest2012_256.reset();
            return gostDigest2012_256;
        }
        if (digestType.equals("GenGOST_2012_512")) {
            GostDigest2012_512 gostDigest2012_512 = new GostDigest2012_512();
            gostDigest2012_512.reset();
            return gostDigest2012_512;
        }
        if (digestType.equals("RawGOST")) {
            return new PrimitiveGostDigest();
        }
        if (digestType.equals("RawGOST_2012_256")) {
            return new PrimitiveGostDigest2012_256();
        }
        if (digestType.equals("RawGOST_2012_512")) {
            return new PrimitiveGostDigest2012_512();
        }
        GostDigest gostDigest = new GostDigest();
        gostDigest.reset(((AlgIdInterface) this.initParams).getDigestParams().getOID());
        return gostDigest;
    }

    @Override // java.security.Signature
    public String toString() {
        StringBuilder sb;
        ParamsInterface params;
        if (this.J != null) {
            sb = new StringBuilder("\n params: ");
            params = this.J.getParams();
        } else {
            if (this.K == null) {
                return "Gost Signature\nUNINIIALIZED";
            }
            sb = new StringBuilder("Gost Signature\n params: ");
            params = this.K.getParams();
        }
        sb.append(params.toString());
        return sb.toString();
    }

    @Override // java.security.SignatureSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        try {
            this.L = true;
            this.dataHash.engineUpdate(bArr, i, i2);
        } catch (Error e) {
            d();
            throw e;
        } catch (RuntimeException e2) {
            d();
            throw e2;
        }
    }

    @Override // java.security.SignatureSpi
    public final boolean engineVerify(byte[] bArr) {
        try {
            return engineVerify(bArr, 0, bArr.length);
        } catch (Error e) {
            this.d();
            throw e;
        } catch (RuntimeException e2) {
            this.d();
            throw e2;
        } catch (SignatureException e3) {
            this.d();
            throw e3;
        }
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public final AbstractGostDigest getDigestObject(KeyInterface keyInterface, boolean z) {
        return null;
    }

    @Override // java.security.SignatureSpi
    public final void engineSetParameter(String str, Object obj) {
        throw new InvalidParameterException("NotSupport");
    }
}
