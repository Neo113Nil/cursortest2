package ru.CryptoPro.JCP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.KeyPair;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Random.AbstractBioRandom;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.Random.RandomRefuseException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptDhAllowedInterface;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.PKUPSignatureInterface;
import ru.CryptoPro.JCP.params.PKUPSignatureSpec;
import ru.CryptoPro.JCP.spec.X509PublicKeySpec;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Starter;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public class GostKeyPairGenerator extends InternalKeyPairGenerator {
    public static final String CREATION_ERR = "KeyCreateError";
    public static final String INV_KEY_LEN = "InvalidKeyLen";
    public static final String INV_PUB = "InvalidPublic";
    public static final String errorMessage1;
    public static final String errorMessage2;
    public static final String errorMessage3;
    public static final byte[] test_X;
    public static final byte[] test_Y;
    protected Extension pKupExtension;

    static {
        ResourceBundle resourceBundle = InternalGostPrivateKey.resource;
        errorMessage1 = resourceBundle.getString(InternalGostPrivateKey.NOT_ELLIPTIC);
        errorMessage2 = resourceBundle.getString(InternalGostPrivateKey.NOT_GOST);
        errorMessage3 = resourceBundle.getString(InternalGostPrivateKey.INVALID_CIPHER);
        test_X = new byte[]{Alerts.alert_protocol_version, 48, 68, 56, 49, 67, Alerts.alert_decode_error, 56, 55, Alerts.alert_decode_error, 65, 49, 52, 66, Alerts.alert_decode_error, 53, 68, Alerts.alert_decode_error, 53, 66, 69, 48, 54, 52, 48, 56, 48, 56, 69, 49, 54, 48};
        test_Y = new byte[]{-18, 25, 2, -92, 6, -110, -46, 115, -19, -63, -75, -83, -59, 95, -111, 18, -114, 53, -7, -47, 101, -6, -103, 1, -54, -16, PKIBody._RP, 39, 1, -117, -90, -33, Alerts.alert_decode_error, 69, 25, -63, 26, Alerts.alert_unsupported_extension, 39, 37, 38, 88, -100, -42, -26, -94, -19, -38, -81, -31, -61, 8, 18, 89, -66, -97, -50, -26, 103, -94, Alerts.alert_unrecognized_name, 31, 67, 82};
    }

    public GostKeyPairGenerator() {
        this(new AlgIdSpec((OID) null));
        this.cryptDhAllowedForSignKey = true;
    }

    public static void throwEx(Throwable th) {
        ProviderException providerException = new ProviderException(InternalGostPrivateKey.resource.getString("KeyCreateError"));
        providerException.initCause(th);
        JCPLogger.fatal(providerException);
        throw providerException;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        KeyPair keyPair;
        Throwable e;
        PrivateKeySpec privateKeySpec;
        PublicKeyInterface generatePublic;
        JCPLogger.enter();
        try {
            InternalKeyPairGenerator.checkParams(this.params, errorMessage2, errorMessage3);
        } catch (InvalidAlgorithmParameterException e2) {
            throwEx(e2);
        }
        CPRandom cPRandom = new CPRandom();
        KeyPair keyPair2 = null;
        for (int i = 0; i < 5; i++) {
            cPRandom.setRandomSeed(AbstractBioRandom.getBioRandomObject().getBioRandom(44));
            if (CertifiedRandom.getPRSGStatistics(cPRandom)) {
                try {
                    privateKeySpec = new PrivateKeySpec(this.params, cPRandom);
                    generatePublic = privateKeySpec.generatePublic();
                } catch (InvalidAlgorithmParameterException e3) {
                    keyPair = keyPair2;
                    e = e3;
                } catch (InvalidKeyException e4) {
                    keyPair = keyPair2;
                    e = e4;
                } catch (KeyManagementException e5) {
                    keyPair = keyPair2;
                    e = e5;
                } catch (InvalidKeySpecException e6) {
                    keyPair = keyPair2;
                    e = e6;
                }
                if (!generatePublic.checkPublic()) {
                    throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
                }
                keyPair = new KeyPair(new GostPublicKey(generatePublic), new GostPrivateKey(privateKeySpec));
                try {
                    if (!this.exportable) {
                        privateKeySpec.setNotExportable();
                    }
                    if (this.cryptDhAllowedForSignKey) {
                        privateKeySpec.setDhAllowed();
                    }
                    Extension extension = this.pKupExtension;
                    if (extension == null) {
                        extension = PKUPSignatureSpec.DEFAULT_PK_UP_EXT_SIG();
                    }
                    privateKeySpec.addExtension(extension);
                } catch (InvalidAlgorithmParameterException e7) {
                    e = e7;
                    if (i == 4) {
                        throwEx(e);
                        keyPair2 = keyPair;
                        JCPLogger.exit();
                        return keyPair2;
                    }
                    JCPLogger.thrown(e);
                    keyPair2 = keyPair;
                } catch (InvalidKeyException e8) {
                    e = e8;
                    if (i == 4) {
                        throwEx(e);
                        keyPair2 = keyPair;
                        JCPLogger.exit();
                        return keyPair2;
                    }
                    JCPLogger.thrown(e);
                    keyPair2 = keyPair;
                } catch (KeyManagementException e9) {
                    e = e9;
                    if (i == 4) {
                        throwEx(e);
                        keyPair2 = keyPair;
                        JCPLogger.exit();
                        return keyPair2;
                    }
                    JCPLogger.thrown(e);
                    keyPair2 = keyPair;
                } catch (InvalidKeySpecException e10) {
                    e = e10;
                    if (i == 4) {
                        throwEx(e);
                        keyPair2 = keyPair;
                        JCPLogger.exit();
                        return keyPair2;
                    }
                    JCPLogger.thrown(e);
                    keyPair2 = keyPair;
                }
                keyPair2 = keyPair;
                break;
            }
            RandomRefuseException randomRefuseException = new RandomRefuseException();
            JCPLogger.thrown(randomRefuseException);
            if (i == 4) {
                throw randomRefuseException;
            }
        }
        JCPLogger.exit();
        return keyPair2;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        boolean z;
        JCPLogger.enter();
        boolean z2 = true;
        if (algorithmParameterSpec instanceof ExportableParameterInterface) {
            this.exportable = false;
            z = true;
        } else {
            z = false;
        }
        if (algorithmParameterSpec instanceof CryptDhAllowedInterface) {
            this.cryptDhAllowedForSignKey = true;
            z = true;
        }
        if (algorithmParameterSpec instanceof X509PublicKeySpec) {
            AlgIdInterface params = getParams((X509PublicKeySpec) algorithmParameterSpec, errorMessage1);
            String str = errorMessage2;
            InternalKeyPairGenerator.checkParams(params, str, errorMessage3);
            if (params.getOID().equals(AlgIdSpec.OID_98) || params.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) || params.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(str);
                JCPLogger.warning(invalidAlgorithmParameterException);
                throw invalidAlgorithmParameterException;
            }
            checkAdSaveParams(params, false);
            z = true;
        }
        if (algorithmParameterSpec instanceof PKUPSignatureInterface) {
            try {
                Extension signaturePKUPExtension = ((PKUPSignatureInterface) algorithmParameterSpec).getSignaturePKUPExtension();
                if (signaturePKUPExtension != null) {
                    this.pKupExtension = signaturePKUPExtension;
                    z = true;
                }
            } catch (InvalidParameterException e) {
                JCPLogger.warning(e);
                throw e;
            }
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
            String str2 = errorMessage2;
            InternalKeyPairGenerator.checkParams(algIdInterface, str2, errorMessage3);
            if (algIdInterface.getOID().equals(AlgIdSpec.OID_98) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                InvalidAlgorithmParameterException invalidAlgorithmParameterException2 = new InvalidAlgorithmParameterException(str2);
                JCPLogger.warning(invalidAlgorithmParameterException2);
                throw invalidAlgorithmParameterException2;
            }
            checkAdSaveParams(algIdInterface, false);
        } else {
            z2 = z;
        }
        if (z2) {
            JCPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException3 = new InvalidAlgorithmParameterException(errorMessage2);
            JCPLogger.warning(invalidAlgorithmParameterException3);
            throw invalidAlgorithmParameterException3;
        }
    }

    public GostKeyPairGenerator(String str) {
        this(str, new AlgIdSpec((OID) null));
    }

    public GostKeyPairGenerator(String str, AlgIdInterface algIdInterface) {
        super(str);
        Starter.check(GostKeyPairGenerator.class);
        this.params = algIdInterface;
    }

    public GostKeyPairGenerator(AlgIdInterface algIdInterface) {
        this(JCP.GOST_EL_DEGREE_NAME, algIdInterface);
        this.cryptDhAllowedForSignKey = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        JCPLogger.enter();
        if (i != 512) {
            JCPLogger.warning(new InvalidParameterException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 64));
        }
        JCPLogger.exit();
    }
}
