package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public abstract class DirectCryptoProvider extends BaseJWEProvider {
    public static final Set SUPPORTED_ALGORITHMS;

    static {
        Set set = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.DIR);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DirectCryptoProvider(SecretKey secretKey) {
        super(SUPPORTED_ALGORITHMS, r0, secretKey);
        Set set;
        byte[] encoded = secretKey.getEncoded();
        int length = encoded == null ? 0 : encoded.length * 8;
        if (length == 0) {
            set = EncryptionMethod.Family.AES_GCM;
        } else {
            set = (Set) ContentCryptoProvider.COMPATIBLE_ENCRYPTION_METHODS.get(Integer.valueOf(length));
            if (set == null) {
                throw new KeyLengthException("The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)");
            }
        }
    }
}
