package com.nimbusds.jose.crypto.impl;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jca.JWEJCAContext;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public abstract class BaseJWEProvider {
    public static final Set ACCEPTABLE_CEK_ALGS = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));
    public final Set algs;
    public final SecretKey cek;
    public final Set encs;
    public final JWEJCAContext jcaContext = new JWEJCAContext(0);

    public BaseJWEProvider(Set set, Set set2, SecretKey secretKey) {
        if (set == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The supported JWE algorithm set must not be null");
            throw null;
        }
        this.algs = Collections.unmodifiableSet(set);
        if (set2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The supported encryption methods must not be null");
            throw null;
        }
        this.encs = set2;
        if (secretKey == null || set.size() <= 1 || (secretKey.getAlgorithm() != null && ACCEPTABLE_CEK_ALGS.contains(secretKey.getAlgorithm()))) {
            this.cek = secretKey;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
            throw null;
        }
    }

    public final SecretKey getCEK(EncryptionMethod encryptionMethod) {
        SecretKey secretKey = this.cek;
        if (secretKey != null || encryptionMethod == null) {
            return secretKey;
        }
        SecureRandom secureRandom = new SecureRandom();
        Set set = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
        if (!set.contains(encryptionMethod)) {
            throw new JOSEException(ECDH.unsupportedEncryptionMethod(encryptionMethod, set));
        }
        byte[] bArr = new byte[encryptionMethod.cekBitLength / 8];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }
}
