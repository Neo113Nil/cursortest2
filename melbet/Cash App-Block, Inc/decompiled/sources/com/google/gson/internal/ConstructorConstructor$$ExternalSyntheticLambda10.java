package com.google.gson.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ConstructorConstructor$$ExternalSyntheticLambda10 implements ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Class f$0;

    public /* synthetic */ ConstructorConstructor$$ExternalSyntheticLambda10(Class cls, int i) {
        this.$r8$classId = i;
        this.f$0 = cls;
    }

    @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public final Object construct() {
        Object lambda$newUnsafeAllocator$19;
        int i = this.$r8$classId;
        Class cls = this.f$0;
        switch (i) {
            case 0:
                lambda$newUnsafeAllocator$19 = ConstructorConstructor.lambda$newUnsafeAllocator$19(cls);
                return lambda$newUnsafeAllocator$19;
            default:
                try {
                    return com.nimbusds.jose.shaded.gson.internal.UnsafeAllocator.INSTANCE.newInstance(cls);
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), (Throwable) e);
                    return null;
                }
        }
    }
}
