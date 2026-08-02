package ru.CryptoPro.ssl;

import defpackage.ny61;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.net.ssl.SSLHandshakeException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_25 {
    public PrivateKey a;
    public ECPublicKey b;

    public cl_25(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", cl_73.g("EC"));
            keyPairGenerator.initialize(eCParameterSpec, secureRandom);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            this.a = generateKeyPair.getPrivate();
            this.b = (ECPublicKey) generateKeyPair.getPublic();
        } catch (GeneralSecurityException e) {
            ny61.n("Could not generate DH keypair", e);
            throw null;
        }
    }

    public final SecretKey a(PublicKey publicKey) {
        try {
            boolean z = cl_73.a;
            KeyAgreement keyAgreement = KeyAgreement.getInstance(JCP.ECDH_NAME, cpSSLConfig.getDefaultEncryptionSSLProvider());
            keyAgreement.init(this.a);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret("TlsPremasterSecret");
        } catch (GeneralSecurityException e) {
            throw ((SSLHandshakeException) new SSLHandshakeException("Could not generate secret").initCause(e));
        }
    }
}
