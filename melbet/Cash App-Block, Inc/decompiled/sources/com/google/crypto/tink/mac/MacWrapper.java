package com.google.crypto.tink.mac;

import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveConstructor$1;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.PrimitiveWrapper;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt;

/* loaded from: classes.dex */
public final class MacWrapper implements PrimitiveWrapper {
    public final /* synthetic */ int $r8$classId;
    public static final MacWrapper WRAPPER$1 = new MacWrapper(1);
    public static final MacWrapper WRAPPER = new MacWrapper(0);
    public static final PrimitiveConstructor$1 LEGACY_FULL_MAC_PRIMITIVE_CONSTRUCTOR = new PrimitiveConstructor$1(LegacyProtoKey.class, Mac.class, new MacWrapper$$ExternalSyntheticLambda0(0));

    public /* synthetic */ MacWrapper(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getInputPrimitiveClass() {
        switch (this.$r8$classId) {
            case 0:
                return Mac.class;
            default:
                return ChunkedMac.class;
        }
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Class getPrimitiveClass() {
        switch (this.$r8$classId) {
            case 0:
                return Mac.class;
            default:
                return ChunkedMac.class;
        }
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public final Object wrap(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        switch (this.$r8$classId) {
            case 0:
                return ConvertFromJavaKt.create(keysetHandle, primitiveRegistry$$ExternalSyntheticLambda0);
            default:
                return KTypesJvm.create(keysetHandle, primitiveRegistry$$ExternalSyntheticLambda0);
        }
    }
}
