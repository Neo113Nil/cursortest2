package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.math.BigInteger;
import java.security.AlgorithmConstraints;
import java.security.CryptoPrimitive;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.EnumSet;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.net.ssl.SSLHandshakeException;
import ru.CryptoPro.ssl.util.KeyUtil;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_21 {
    public BigInteger a;
    public BigInteger b;
    public PrivateKey c;
    public BigInteger d;

    public final SecretKey a(BigInteger bigInteger, boolean z) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("DiffieHellman", cl_73.g("DiffieHellman"));
            DHPublicKeySpec dHPublicKeySpec = new DHPublicKeySpec(bigInteger, this.a, this.b);
            PublicKey generatePublic = keyFactory.generatePublic(dHPublicKeySpec);
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DiffieHellman", cpSSLConfig.getDefaultEncryptionSSLProvider());
            if (!z && !KeyUtil.isOracleJCEProvider(keyAgreement.getProvider().getName())) {
                try {
                    KeyUtil.validate(dHPublicKeySpec);
                } catch (InvalidKeyException e) {
                    throw new SSLHandshakeException(e.getMessage());
                }
            }
            keyAgreement.init(this.c);
            keyAgreement.doPhase(generatePublic, true);
            return keyAgreement.generateSecret("TlsPremasterSecret");
        } catch (GeneralSecurityException e2) {
            throw ((SSLHandshakeException) new SSLHandshakeException("Could not generate secret").initCause(e2));
        }
    }

    public final DHPublicKeySpec b(KeyPairGenerator keyPairGenerator) {
        DHPublicKeySpec dHPublicKeySpec;
        boolean isOracleJCEProvider = KeyUtil.isOracleJCEProvider(keyPairGenerator.getProvider().getName());
        for (int i = 0; i <= 2; i++) {
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            this.c = generateKeyPair.getPrivate();
            PublicKey publicKey = generateKeyPair.getPublic();
            if (publicKey instanceof DHPublicKey) {
                DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                DHParameterSpec params = dHPublicKey.getParams();
                dHPublicKeySpec = new DHPublicKeySpec(dHPublicKey.getY(), params.getP(), params.getG());
            } else {
                try {
                    dHPublicKeySpec = (DHPublicKeySpec) KeyFactory.getInstance("DH", cl_73.g("DH")).getKeySpec(publicKey, DHPublicKeySpec.class);
                } catch (Exception e) {
                    ny61.j(e);
                }
            }
            if (!isOracleJCEProvider) {
                try {
                    KeyUtil.validate(dHPublicKeySpec);
                } catch (InvalidKeyException e2) {
                    if (i == 2) {
                        throw e2;
                    }
                }
            }
            return dHPublicKeySpec;
        }
        return null;
    }

    public final void c(AlgorithmConstraints algorithmConstraints, BigInteger bigInteger) {
        try {
            if (algorithmConstraints.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), (DHPublicKey) KeyFactory.getInstance("DiffieHellman", cl_73.g("DiffieHellman")).generatePublic(new DHPublicKeySpec(bigInteger, this.a, this.b)))) {
            } else {
                throw new SSLHandshakeException("DHPublicKey does not comply to algorithm constraints");
            }
        } catch (GeneralSecurityException e) {
            throw ((SSLHandshakeException) new SSLHandshakeException("Could not generate DHPublicKey").initCause(e));
        }
    }
}
