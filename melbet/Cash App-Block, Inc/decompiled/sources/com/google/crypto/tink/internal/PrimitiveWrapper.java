package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeysetHandle;

/* loaded from: classes.dex */
public interface PrimitiveWrapper {
    Class getInputPrimitiveClass();

    Class getPrimitiveClass();

    Object wrap(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0);
}
