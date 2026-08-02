package ru.CryptoPro.JCP.Key;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyManagementException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Random.AbstractBioRandom;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Random.RandomRefuseException;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.PKUPSignatureSpec;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class GostKeyPairGenerator2012_512 extends GostKeyPairGenerator {
    public GostKeyPairGenerator2012_512() {
        super(JCP.GOST_EL_2012_512_NAME, new AlgIdSpec(AlgIdSpec.OID_PARAMS_SIG_2012_512));
    }

    @Override // ru.CryptoPro.JCP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
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
                byte[] bArr = new byte[88];
                byte[] bArr2 = new byte[44];
                byte[] bArr3 = new byte[44];
                AbstractBioRandom.getBioRandomObject().getBioRandom(88).getRandomSeed(bArr);
                System.arraycopy(bArr, 0, bArr2, 0, 44);
                System.arraycopy(bArr, 44, bArr3, 0, 44);
                try {
                    try {
                        privateKeySpec = new PrivateKeySpec(this.params, cPRandom, bArr2, bArr3);
                        Array.clear(bArr);
                        Array.clear(bArr2);
                        Array.clear(bArr3);
                        generatePublic = privateKeySpec.generatePublic();
                    } catch (RandomRefuseException e3) {
                        if (i == 4) {
                            throw e3;
                        }
                        Array.clear(bArr);
                        Array.clear(bArr2);
                        Array.clear(bArr3);
                    }
                } catch (Throwable th) {
                    Array.clear(bArr);
                    Array.clear(bArr2);
                    Array.clear(bArr3);
                    throw th;
                }
            } catch (InvalidAlgorithmParameterException e4) {
                keyPair = keyPair2;
                e = e4;
            } catch (InvalidKeyException e5) {
                keyPair = keyPair2;
                e = e5;
            } catch (KeyManagementException e6) {
                keyPair = keyPair2;
                e = e6;
            } catch (InvalidKeySpecException e7) {
                keyPair = keyPair2;
                e = e7;
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
            } catch (InvalidAlgorithmParameterException e8) {
                e = e8;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
                    keyPair2 = keyPair;
                    JCPLogger.exit();
                    return keyPair2;
                }
                JCPLogger.thrown(e);
                keyPair2 = keyPair;
            } catch (InvalidKeyException e9) {
                e = e9;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
                    keyPair2 = keyPair;
                    JCPLogger.exit();
                    return keyPair2;
                }
                JCPLogger.thrown(e);
                keyPair2 = keyPair;
            } catch (KeyManagementException e10) {
                e = e10;
                if (i == 4) {
                    GostKeyPairGenerator.throwEx(e);
                    keyPair2 = keyPair;
                    JCPLogger.exit();
                    return keyPair2;
                }
                JCPLogger.thrown(e);
                keyPair2 = keyPair;
            } catch (InvalidKeySpecException e11) {
                e = e11;
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

    @Override // ru.CryptoPro.JCP.Key.GostKeyPairGenerator, java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        JCPLogger.enter();
        if (i != 1024) {
            JCPLogger.warning(new InvalidParameterException(InternalGostPrivateKey.resource.getString("InvalidKeyLen") + 128));
        }
        JCPLogger.exit();
    }
}
