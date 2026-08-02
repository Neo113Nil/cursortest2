package ru.CryptoPro.JCP.Key;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import ru.CryptoPro.JCP.Util.HexDumpEncoder;
import ru.CryptoPro.JCP.Util.TrustSource;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GostKeyFactory extends KeyFactorySpi {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        JCPLogger.enter();
        if (!(keySpec instanceof PrivateKeyInterface)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        try {
            GostPrivateKey gostPrivateKey = new GostPrivateKey((PrivateKeyInterface) keySpec);
            JCPLogger.exit();
            return gostPrivateKey;
        } catch (InvalidKeySpecException e) {
            JCPLogger.warning(e);
            throw e;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) {
        GostPublicKey gostPublicKey;
        JCPLogger.enter();
        if (!(keySpec instanceof PublicKeyInterface) && !(keySpec instanceof X509EncodedKeySpec) && !(keySpec instanceof PrivateKeyInterface)) {
            InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
            JCPLogger.thrown(invalidKeySpecException);
            throw invalidKeySpecException;
        }
        boolean isFinerEnabled = JCPLogger.isFinerEnabled();
        try {
            if (keySpec instanceof PublicKeyInterface) {
                gostPublicKey = new GostPublicKey((PublicKeyInterface) keySpec);
            } else if (keySpec instanceof PrivateKeyInterface) {
                try {
                    PublicKeyInterface generatePublic = ((PrivateKeyInterface) keySpec).generatePublic();
                    if (isFinerEnabled) {
                        String encodeWithEnd = new HexDumpEncoder().encodeWithEnd(ByteBuffer.wrap(generatePublic.encode()));
                        JCPLogger.finer(("Creating trusted public key from private key, is trusted: " + generatePublic.isTrusted() + "\n") + encodeWithEnd);
                    }
                    gostPublicKey = new GostPublicKey(generatePublic);
                } catch (Exception e) {
                    JCPLogger.warning("keySpec.generatePublic() error", (Throwable) e);
                    InvalidKeySpecException invalidKeySpecException2 = new InvalidKeySpecException();
                    invalidKeySpecException2.initCause(e);
                    throw invalidKeySpecException2;
                }
            } else {
                try {
                    byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
                    try {
                        TrustSource.TrustSourceData isTrusted = KeyUsageControlUtility.isStrictModeEnabled() ? TrustSource.isTrusted(isFinerEnabled) : TrustSource.TRUSTED;
                        if (isFinerEnabled) {
                            String encodeWithEnd2 = new HexDumpEncoder().encodeWithEnd(ByteBuffer.wrap(encoded));
                            if (!KeyUsageControlUtility.isStrictModeEnabled() || isTrusted.isTrusted) {
                                JCPLogger.finer("Import of trusted public key as X509EncodedKeySpec: \n" + encodeWithEnd2 + isTrusted.logData);
                            } else {
                                JCPLogger.warning(("Import of untrusted public key as X509EncodedKeySpec in strict mode;\nsource keySpec class: " + keySpec.getClass().getCanonicalName() + ", format: " + ((X509EncodedKeySpec) keySpec).getFormat() + "\n") + encodeWithEnd2 + isTrusted.logData);
                            }
                        }
                        gostPublicKey = new GostPublicKey(GostPublicKey.a(encoded, isTrusted.isTrusted));
                    } catch (Exception e2) {
                        JCPLogger.warning("decode error:", Integer.valueOf(encoded.length));
                        JCPLogger.warning(e2);
                        JCPLogger.fine("engineGeneratePublic: encoded:", encoded);
                        InvalidKeySpecException invalidKeySpecException3 = new InvalidKeySpecException();
                        invalidKeySpecException3.initCause(e2);
                        throw invalidKeySpecException3;
                    }
                } catch (Exception e3) {
                    JCPLogger.warning("keySpec.getEncoded() error", (Throwable) e3);
                    InvalidKeySpecException invalidKeySpecException4 = new InvalidKeySpecException();
                    invalidKeySpecException4.initCause(e3);
                    throw invalidKeySpecException4;
                }
            }
            JCPLogger.exit();
            return gostPublicKey;
        } catch (InvalidKeySpecException e4) {
            JCPLogger.warning(e4);
            throw e4;
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        KeyInterface spec;
        JCPLogger.enter();
        if ((key instanceof GostPublicKey) && PublicKeyInterface.class.isAssignableFrom(cls)) {
            spec = ((GostPublicKey) key).getSpec();
        } else {
            if (!(key instanceof GostPrivateKey) || !PrivateKeyInterface.class.isAssignableFrom(cls)) {
                InvalidKeySpecException invalidKeySpecException = new InvalidKeySpecException();
                JCPLogger.thrown(invalidKeySpecException);
                throw invalidKeySpecException;
            }
            spec = ((GostPrivateKey) key).getSpec();
        }
        JCPLogger.exit();
        return spec;
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        throw new InvalidKeyException(InternalGostPrivateKey.resource.getString("NotSupp"));
    }
}
