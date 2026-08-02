package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class RSACryptoProvider extends BaseJWEProvider {
    public static final Set SUPPORTED_ALGORITHMS;

    static {
        Set set = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.RSA1_5);
        linkedHashSet.add(JWEAlgorithm.RSA_OAEP);
        linkedHashSet.add(JWEAlgorithm.RSA_OAEP_256);
        linkedHashSet.add(JWEAlgorithm.RSA_OAEP_384);
        linkedHashSet.add(JWEAlgorithm.RSA_OAEP_512);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }
}
