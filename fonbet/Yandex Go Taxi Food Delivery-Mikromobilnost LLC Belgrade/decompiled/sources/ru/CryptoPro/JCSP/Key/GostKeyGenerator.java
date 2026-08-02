package ru.CryptoPro.JCSP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyManagementException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;
import ru.CryptoPro.JCP.spec.NameAlgIdSpecForeign;
import ru.CryptoPro.JCP.spec.ProviderParameterInterface;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.Starter;
import ru.CryptoPro.JCSP.params.PasswordParamsInterface;

/* loaded from: classes4.dex */
public abstract class GostKeyGenerator extends KeyGeneratorSpi {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCSP.Key.resources.key";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.JCSP.Key.resources.key", Locale.getDefault());
    protected int algId;
    protected AlgIdInterface allParams;
    protected CryptParamsInterface cryptParams;
    protected PasswordParamsInterface passwordParams = null;
    protected int keyLength = 0;
    protected boolean exportable = true;
    protected boolean createInKeyContainer = false;
    protected EllipticParamsInterface signParams = null;

    public GostKeyGenerator() {
        this.algId = 0;
        Starter.check(GostKeyGenerator.class);
        this.allParams = new AlgIdSpec((OID) null);
        this.algId = 26142;
    }

    public static void throwEx(Throwable th) {
        ProviderException providerException = new ProviderException(resource.getString("KeyCreateError"));
        providerException.initCause(th);
        JCSPLogger.fatal(providerException);
        throw providerException;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        SecretKey secretKey;
        JCSPSecretKeySpec create;
        JCSPLogger.enter();
        int i = 0;
        while (true) {
            secretKey = null;
            if (i >= 5) {
                break;
            }
            try {
                boolean z = this.createInKeyContainer;
                int i2 = this.algId;
                if (!z) {
                    create = SecretKeyImpl.create(i2, this.exportable, this.allParams, this.signParams);
                    create.setKeyLength(this.keyLength);
                    if (!isTlsMasterKey()) {
                    }
                    secretKey = GostSecretKey.getInstance(create);
                    break;
                }
                create = JCSPSecretKeySpec.getInstance(i2, this.allParams, this.exportable);
                PasswordParamsInterface passwordParamsInterface = this.passwordParams;
                char[] password = passwordParamsInterface == null ? null : passwordParamsInterface.getPassword();
                byte[] array = password == null ? null : CPString.getArray(new String(password));
                AlgIdInterface algIdInterface = this.allParams;
                String providerName = algIdInterface instanceof ProviderParameterInterface ? ((ProviderParameterInterface) algIdInterface).getProviderName() : null;
                boolean z2 = this.passwordParams != null;
                create.setKeyLength(this.keyLength);
                int i3 = this.algId;
                AlgIdInterface algIdInterface2 = this.allParams;
                create.create(HKey.getKeyAlgorithmGroup(i3, algIdInterface2 != null ? HProv.getInstanceByParamSet(algIdInterface2).getProvType() : 24), array, z2, this.algId, providerName, false);
                create.setParams(this.cryptParams);
                secretKey = GostSecretKey.getInstance(create);
                break;
                break;
            } catch (KeyManagementException e) {
                e = e;
                if (i == 4) {
                    break;
                }
                JCSPLogger.thrown(e);
                i++;
            } catch (UnrecoverableKeyException e2) {
                e = e2;
                if (i == 4) {
                    break;
                }
                JCSPLogger.thrown(e);
                i++;
            }
            i++;
        }
        throwEx(e);
        JCSPLogger.exit();
        return secretKey;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        JCSPLogger.enter();
        if (algorithmParameterSpec != null) {
            boolean z = algorithmParameterSpec instanceof CryptParamsInterface;
            if (!z && !(algorithmParameterSpec instanceof AlgIdInterface) && !(algorithmParameterSpec instanceof EllipticParamsInterface) && !(algorithmParameterSpec instanceof ExportableParameterInterface) && !(algorithmParameterSpec instanceof PasswordParamsInterface)) {
                InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(resource.getString("GenKeyErr") + ", parameters = " + algorithmParameterSpec);
                JCSPLogger.warning(invalidAlgorithmParameterException);
                throw invalidAlgorithmParameterException;
            }
            if (algorithmParameterSpec instanceof EllipticParamsInterface) {
                this.signParams = (EllipticParamsInterface) algorithmParameterSpec;
            } else if (z) {
                this.cryptParams = (CryptParamsInterface) algorithmParameterSpec;
            } else if (algorithmParameterSpec instanceof PasswordParamsInterface) {
                this.passwordParams = (PasswordParamsInterface) algorithmParameterSpec;
            } else if (algorithmParameterSpec instanceof ExportableParameterInterface) {
                this.exportable = false;
            } else {
                AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
                boolean z2 = algIdInterface instanceof NameAlgIdSpecForeign;
                if (z2) {
                    NameAlgIdSpecForeign nameAlgIdSpecForeign = (NameAlgIdSpecForeign) algIdInterface;
                    this.allParams = new NameAlgIdSpecForeign(this.allParams.getOID(), nameAlgIdSpecForeign.getName(), nameAlgIdSpecForeign.isOnlyStoreType(), nameAlgIdSpecForeign.getProviderName());
                } else {
                    this.allParams = algIdInterface;
                }
                this.signParams = (EllipticParamsInterface) algIdInterface.getSignParams();
                if ((algIdInterface instanceof NameAlgIdSpec) || z2) {
                    this.createInKeyContainer = true;
                }
            }
        }
        JCSPLogger.exit();
    }

    public boolean isTlsMasterKey() {
        return false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
    }
}
