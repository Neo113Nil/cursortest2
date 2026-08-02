package ru.CryptoPro.Crypto.Key;

import defpackage.ny61;
import defpackage.ss61;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyManagementException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import ru.CryptoPro.Crypto.Starter;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostKeyGenerator extends KeyGeneratorSpi {
    public static final String BUNDLE_NAME = "ru.CryptoPro.Crypto.Key.resources.key";
    public static final String NO_CIPHER_LIC = "NoCipherLicense";
    public static final ResourceBundle resource = ResourceBundle.getBundle("ru.CryptoPro.Crypto.Key.resources.key", Locale.getDefault());
    protected CryptParamsInterface params;

    public GostKeyGenerator() {
        Starter.check(GostKeyGenerator.class);
        this.params = CryptParamsSpec.getInstance();
    }

    public static void throwEx(Throwable th) {
        ProviderException providerException = new ProviderException(resource.getString("KeyCreateErr"));
        providerException.initCause(th);
        JCPLogger.fatal(providerException);
        throw providerException;
    }

    public SecretKeyInterface createSpec(RandomInterface randomInterface) throws KeyManagementException {
        return new SecretKeySpec(this.params, randomInterface);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        GostSecretKey gostSecretKey;
        if (!ss61.a) {
            ny61.g(resource.getString("NoCipherLicense"));
            return null;
        }
        JCPLogger.enter();
        int i = 0;
        while (true) {
            if (i >= 5) {
                break;
            }
            try {
                gostSecretKey = new GostSecretKey(createSpec(new CPRandom()));
                break;
            } catch (KeyManagementException e) {
                if (i == 4) {
                    throwEx(e);
                    break;
                }
                JCPLogger.thrown(e);
                i++;
            }
        }
        gostSecretKey = null;
        JCPLogger.exit();
        return gostSecretKey;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        JCPLogger.enter();
        boolean z = algorithmParameterSpec instanceof CryptParamsInterface;
        if (!z && !(algorithmParameterSpec instanceof AlgIdInterface)) {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(resource.getString("GenKeyErr"));
            JCPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
        if (!z) {
            algorithmParameterSpec = ((AlgIdInterface) algorithmParameterSpec).getCryptParams();
        }
        this.params = (CryptParamsInterface) algorithmParameterSpec;
        JCPLogger.exit();
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        if (ss61.a) {
            return;
        }
        ny61.g("License doesn't permit cryptographic operation");
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
    }
}
