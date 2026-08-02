package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.PrimitiveWrapper;
import kotlin.reflect.KClasses;

/* loaded from: classes.dex */
public final class DeterministicAeadWrapper implements PrimitiveWrapper {
    public static final DeterministicAeadWrapper WRAPPER = new DeterministicAeadWrapper();
    public static final PrimitiveConstructor$1 LEGACY_FULL_DAEAD_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(LegacyProtoKey.class, DeterministicAead.class, new AesSivKeyManager$$ExternalSyntheticLambda0(17));

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getInputPrimitiveClass() {
        return DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getPrimitiveClass() {
        return DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Object wrap(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        return KClasses.create(keysetHandle, primitiveRegistry$$ExternalSyntheticLambda0);
    }
}
