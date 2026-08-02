package ru.CryptoPro.Crypto.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.Crypto.Starter;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.Key.GostExchPrivateKey;
import ru.CryptoPro.JCP.Key.GostKeyPairGenerator;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.InternalGostPrivateKey;
import ru.CryptoPro.JCP.Key.InternalKeyPairGenerator;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Random.AbstractBioRandom;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.CertifiedRandom;
import ru.CryptoPro.JCP.Random.RandomRefuseException;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptDhAllowedInterface;
import ru.CryptoPro.JCP.params.ExportableParameterInterface;
import ru.CryptoPro.JCP.params.PKUPSignatureInterface;
import ru.CryptoPro.JCP.params.PKUPSignatureSpec;
import ru.CryptoPro.JCP.spec.X509PublicKeySpec;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostExchKeyPairGenerator extends GostKeyPairGenerator {
    public GostExchKeyPairGenerator() {
        this(new AlgIdSpec(AlgIdSpec.getDHDefault()));
    }

    @Override // ru.CryptoPro.JCP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        KeyPair keyPair;
        PrivateKeySpec privateKeySpec;
        PublicKeyInterface generatePublic;
        JCPLogger.enter();
        try {
            InternalKeyPairGenerator.checkParams(this.params, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
        } catch (InvalidAlgorithmParameterException e) {
            GostKeyPairGenerator.throwEx(e);
        }
        CPRandom cPRandom = new CPRandom();
        for (int i = 0; i < 5; i++) {
            cPRandom.setRandomSeed(AbstractBioRandom.getBioRandomObject().getBioRandom(44));
            if (CertifiedRandom.getPRSGStatistics(cPRandom)) {
                try {
                    privateKeySpec = new PrivateKeySpec(this.params, cPRandom);
                    privateKeySpec.setDhAllowed();
                    if (!this.exportable) {
                        privateKeySpec.setNotExportable();
                    }
                    Extension extension = this.pKupExtension;
                    if (extension == null) {
                        extension = PKUPSignatureSpec.DEFAULT_PK_UP_EXT_EXC();
                    }
                    privateKeySpec.addExtension(extension);
                    generatePublic = privateKeySpec.generatePublic();
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    if (i == 4) {
                        GostKeyPairGenerator.throwEx(e);
                        keyPair = null;
                        JCPLogger.exit();
                        return keyPair;
                    }
                    JCPLogger.thrown(e);
                } catch (InvalidKeyException e3) {
                    e = e3;
                    if (i == 4) {
                        GostKeyPairGenerator.throwEx(e);
                        keyPair = null;
                        JCPLogger.exit();
                        return keyPair;
                    }
                    JCPLogger.thrown(e);
                } catch (KeyManagementException e4) {
                    e = e4;
                    if (i == 4) {
                        GostKeyPairGenerator.throwEx(e);
                        keyPair = null;
                        JCPLogger.exit();
                        return keyPair;
                    }
                    JCPLogger.thrown(e);
                } catch (InvalidKeySpecException e5) {
                    e = e5;
                    if (i == 4) {
                        GostKeyPairGenerator.throwEx(e);
                        keyPair = null;
                        JCPLogger.exit();
                        return keyPair;
                    }
                    JCPLogger.thrown(e);
                }
                if (!generatePublic.checkPublic()) {
                    throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("InvalidPublic"));
                }
                keyPair = new KeyPair(new GostPublicKey(generatePublic), new GostExchPrivateKey(privateKeySpec));
                JCPLogger.exit();
                return keyPair;
            }
            RandomRefuseException randomRefuseException = new RandomRefuseException();
            JCPLogger.thrown(randomRefuseException);
            if (i == 4) {
                throw randomRefuseException;
            }
        }
        keyPair = null;
        JCPLogger.exit();
        return keyPair;
    }

    @Override // ru.CryptoPro.JCP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        JCPLogger.enter();
        boolean z = true;
        boolean z2 = false;
        if (algorithmParameterSpec instanceof ExportableParameterInterface) {
            this.exportable = false;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof CryptDhAllowedInterface) {
            this.cryptDhAllowedForSignKey = true;
            z2 = true;
        }
        if (algorithmParameterSpec instanceof X509PublicKeySpec) {
            AlgIdInterface params = getParams((X509PublicKeySpec) algorithmParameterSpec, GostKeyPairGenerator.errorMessage1);
            InternalKeyPairGenerator.checkParams(params, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
            checkAdSaveParams(params, true);
            z2 = true;
        }
        if (algorithmParameterSpec instanceof PKUPSignatureInterface) {
            try {
                Extension exchangePKUPExtension = ((PKUPSignatureInterface) algorithmParameterSpec).getExchangePKUPExtension();
                if (exchangePKUPExtension != null) {
                    this.pKupExtension = exchangePKUPExtension;
                    z2 = true;
                }
            } catch (InvalidParameterException e) {
                JCPLogger.warning(e);
                throw e;
            }
        }
        if (algorithmParameterSpec instanceof AlgIdInterface) {
            AlgIdInterface algIdInterface = (AlgIdInterface) algorithmParameterSpec;
            InternalKeyPairGenerator.checkParams(algIdInterface, GostKeyPairGenerator.errorMessage2, GostKeyPairGenerator.errorMessage3);
            checkAdSaveParams(algIdInterface, true);
        } else {
            z = z2;
        }
        if (z) {
            JCPLogger.exit();
        } else {
            InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException(GostKeyPairGenerator.errorMessage2);
            JCPLogger.warning(invalidAlgorithmParameterException);
            throw invalidAlgorithmParameterException;
        }
    }

    public GostExchKeyPairGenerator(String str, AlgIdInterface algIdInterface) {
        super(str, algIdInterface);
        Starter.check(GostExchKeyPairGenerator.class);
    }

    public GostExchKeyPairGenerator(AlgIdInterface algIdInterface) {
        this("GOST3410DHEL", algIdInterface);
        Starter.check(GostExchKeyPairGenerator.class);
    }
}
