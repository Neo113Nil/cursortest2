package com.google.crypto.tink.daead;

import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.daead.AesSivParameters;
import com.google.crypto.tink.internal.TinkBugException;

/* loaded from: classes.dex */
public abstract class PredefinedDeterministicAeadParameters {
    public static final AesSivParameters AES256_SIV;

    static {
        try {
            KeysetHandle builder = AesSivParameters.builder();
            builder.setKeySizeBytes(64);
            builder.annotationsMap = AesSivParameters.Variant.TINK;
            AES256_SIV = builder.m2033build();
        } catch (Exception e) {
            throw new TinkBugException(e);
        }
    }
}
