package com.google.crypto.tink.aead;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.PrimitiveWrapper;
import kotlin.ranges.ClosedRange;

/* loaded from: classes.dex */
public final class AeadWrapper implements PrimitiveWrapper {
    public static final AeadWrapper WRAPPER = new AeadWrapper();
    public static final PrimitiveConstructor$1 LEGACY_FULL_AEAD_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(LegacyProtoKey.class, Aead.class, new a$$ExternalSyntheticBUOutline0());

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getInputPrimitiveClass() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getPrimitiveClass() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Object wrap(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        return ClosedRange.DefaultImpls.create(keysetHandle, primitiveRegistry$$ExternalSyntheticLambda0);
    }
}
