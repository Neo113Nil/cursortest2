package ru.CryptoPro.JCSP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.InternalKeyPairGenerator;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptDhAllowedInterface;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.MarkExportableParameterSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;
import ru.CryptoPro.JCP.spec.X509PublicKeySpec;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfig;
import ru.CryptoPro.JCSP.Starter;
import ru.CryptoPro.JCSP.params.CopyRNDSpec;
import ru.CryptoPro.JCSP.params.PasswordParamsInterface;

/* loaded from: classes4.dex */
public abstract class GostKeyPairGenerator extends InternalKeyPairGenerator {
    public static final String CREATION_ERR = "KeyCreateError";
    public static final String INV_KEY_LEN = "InvalidKeyLen";
    public static final String INV_PUB = "InvalidPublic";
    public static final String errorMessage1;
    public static final String errorMessage2;
    public static final String errorMessage3;
    protected boolean copyRnd;
    protected boolean exchange;
    protected PasswordParamsInterface passw;
    protected boolean userEnteredPassword;

    static {
        ResourceBundle resourceBundle = InternalGostPrivateKey.resource;
        errorMessage1 = resourceBundle.getString(InternalGostPrivateKey.NOT_ELLIPTIC);
        errorMessage2 = resourceBundle.getString(InternalGostPrivateKey.NOT_GOST);
        errorMessage3 = resourceBundle.getString(InternalGostPrivateKey.INVALID_CIPHER);
    }

    public GostKeyPairGenerator(String str) {
        super(str);
        this.passw = null;
        this.userEnteredPassword = false;
        this.exchange = false;
        this.copyRnd = false;
        Starter.check(GostKeyPairGenerator.class);
        this.params = new AlgIdSpec((OID) null);
        this.cryptDhAllowedForSignKey = true;
    }

    public static void throwEx(Throwable th) {
        ProviderException providerException = new ProviderException(InternalGostPrivateKey.resource.getString("KeyCreateError"));
        providerException.initCause(th);
        JCSPLogger.fatal(providerException);
        throw providerException;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        PublicKeySpec publicKeySpec;
        JCSPLogger.enter();
        try {
            InternalKeyPairGenerator.checkParams(this.params, errorMessage2, errorMessage3);
        } catch (InvalidAlgorithmParameterException e) {
            throwEx(e);
        }
        AbstractKeySpec exchPrivateKeySpec = this.exchange ? new ExchPrivateKeySpec(this.params, this.exportable, true, false) : new PrivateKeySpec(this.params, this.exportable, this.cryptDhAllowedForSignKey, false);
        KeyPair keyPair = null;
        try {
            PasswordParamsInterface passwordParamsInterface = this.passw;
            char[] password = passwordParamsInterface == null ? null : passwordParamsInterface.getPassword();
            byte[] array = password == null ? null : CPString.getArray(new String(password));
            AlgIdInterface algIdInterface = this.params;
            exchPrivateKeySpec.create(KeyStoreConfig.getInstance(), array, this.userEnteredPassword, 0, algIdInterface instanceof NameAlgIdSpec ? ((NameAlgIdSpec) algIdInterface).getProviderName() : null, this.copyRnd);
            publicKeySpec = (PublicKeySpec) exchPrivateKeySpec.generatePublic();
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | UnrecoverableKeyException | InvalidKeySpecException e2) {
            throwEx(e2);
        }
        if (!publicKeySpec.checkPublic()) {
            throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
        }
        keyPair = new KeyPair(new GostPublicKey(publicKeySpec), this.exchange ? new GostExchPrivateKey(exchPrivateKeySpec) : new GostPrivateKey(exchPrivateKeySpec));
        JCSPLogger.exit();
        return keyPair;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        boolean z = true;
        boolean z2 = false;
        if (algorithmParameterSpec instanceof ExportableParameterInterface) {
            this.exportable = false;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof MarkExportableParameterSpec) {
            this.exportable = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof PasswordParamsInterface) {
            this.passw = (PasswordParamsInterface) algorithmParameterSpec;
            this.userEnteredPassword = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof CryptDhAllowedInterface) {
            this.cryptDhAllowedForSignKey = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof CopyRNDSpec) {
            this.copyRnd = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof X509PublicKeySpec) {
            AlgIdInterface params = getParams((X509PublicKeySpec) algorithmParameterSpec, errorMessage1);
            String str = errorMessage2;
            InternalKeyPairGenerator.checkParams(params, str, errorMessage3);
            if (params.getOID().equals(AlgIdSpec.OID_98) || params.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) || params.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(str);
                JCSPLogger.warning(invalidAlgorithmParameterException);
                throw invalidAlgorithmParameterException;
            }
            checkAdSaveParams(params, this.exchange);
            z2 = true;
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
            String str2 = errorMessage2;
            InternalKeyPairGenerator.checkParams(algIdInterface, str2, errorMessage3);
            if (algIdInterface.getOID().equals(AlgIdSpec.OID_98) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
                InvalidAlgorithmParameterException invalidAlgorithmParameterException2 = new InvalidAlgorithmParameterException(str2);
                JCSPLogger.warning(invalidAlgorithmParameterException2);
                throw invalidAlgorithmParameterException2;
            }
            checkAdSaveParams(algIdInterface, this.exchange);
        } else {
            z = z2;
        }
        if (z) {
            JCSPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException3 = new InvalidAlgorithmParameterException(errorMessage2);
            JCSPLogger.warning(invalidAlgorithmParameterException3);
            throw invalidAlgorithmParameterException3;
        }
    }

    public GostKeyPairGenerator(AlgIdInterface algIdInterface, String str) {
        super(str);
        this.passw = null;
        this.userEnteredPassword = false;
        this.exchange = false;
        this.copyRnd = false;
        Starter.check(GostKeyPairGenerator.class);
        this.params = algIdInterface;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        JCSPLogger.enter();
        if (i != 512) {
            JCSPLogger.warning(new InvalidParameterException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 64));
        }
        JCSPLogger.exit();
    }
}
