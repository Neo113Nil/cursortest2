package com.nimbusds.jose.crypto.impl;

import com.google.mlkit.vision.text.Text;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.KeyLengthException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public abstract class MACProvider extends Text.TextBase {
    public static final Set SUPPORTED_ALGORITHMS;
    public final SecretKey secretKey;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.HS256);
        linkedHashSet.add(JWSAlgorithm.HS384);
        linkedHashSet.add(JWSAlgorithm.HS512);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MACProvider(SecretKey secretKey) {
        super(r0);
        Set set;
        if (secretKey.getEncoded() != null) {
            byte[] encoded = secretKey.getEncoded();
            int length = encoded == null ? 0 : encoded.length * 8;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (length >= 256) {
                linkedHashSet.add(JWSAlgorithm.HS256);
            }
            if (length >= 384) {
                linkedHashSet.add(JWSAlgorithm.HS384);
            }
            if (length >= 512) {
                linkedHashSet.add(JWSAlgorithm.HS512);
            }
            set = Collections.unmodifiableSet(linkedHashSet);
        } else {
            set = SUPPORTED_ALGORITHMS;
        }
        if (secretKey.getEncoded() != null) {
            byte[] encoded2 = secretKey.getEncoded();
            if ((encoded2 != null ? encoded2.length * 8 : 0) < 256) {
                throw new KeyLengthException("The secret length must be at least 256 bits");
            }
        }
        this.secretKey = secretKey;
    }
}
