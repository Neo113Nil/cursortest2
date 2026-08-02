package ru.CryptoPro.Crypto.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.KeyPair;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.Key.GostExchPrivateKey;
import ru.CryptoPro.JCP.Key.GostKeyPairGenerator;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.InternalKeyPairGenerator;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostEphExchKeyPairGenerator extends GostExchKeyPairGenerator {
    public GostEphExchKeyPairGenerator() {
        this.exportable = false;
    }

    @Override // ru.CryptoPro.Crypto.Key.GostExchKeyPairGenerator, ru.CryptoPro.JCP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        KeyPair keyPair;
        Throwable e;
        PrivateKeySpec privateKeySpec;
        PublicKeyInterface generatePublic;
        JCPLogger.enter();
        try {
            InternalKeyPairGenerator.checkParams(this.params, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
        } catch (InvalidAlgorithmParameterException e2) {
            GostKeyPairGenerator.throwEx(e2);
        }
        CPRandom cPRandom = new CPRandom();
        KeyPair keyPair2 = null;
        for (int i = 0; i < 5; i++) {
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
            keyPair = new KeyPair(new GostPublicKey(generatePublic), new GostExchPrivateKey(privateKeySpec));
            try {
                privateKeySpec.setNotWriteAvailable();
                privateKeySpec.setDhAllowed();
            } catch (InvalidAlgorithmParameterException e7) {
                e = e7;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
                    keyPair2 = keyPair;
                    JCPLogger.exit();
                    return keyPair2;
                }
                JCPLogger.thrown(e);
                keyPair2 = keyPair;
            } catch (InvalidKeyException e8) {
                e = e8;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
                    keyPair2 = keyPair;
                    JCPLogger.exit();
                    return keyPair2;
                }
                JCPLogger.thrown(e);
                keyPair2 = keyPair;
            } catch (KeyManagementException e9) {
                e = e9;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
                    keyPair2 = keyPair;
                    JCPLogger.exit();
                    return keyPair2;
                }
                JCPLogger.thrown(e);
                keyPair2 = keyPair;
            } catch (InvalidKeySpecException e10) {
                e = e10;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
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
        JCPLogger.exit();
        return keyPair2;
    }

    public GostEphExchKeyPairGenerator(String str, AlgIdInterface algIdInterface) {
        super(str, algIdInterface);
        this.exportable = false;
    }
}
