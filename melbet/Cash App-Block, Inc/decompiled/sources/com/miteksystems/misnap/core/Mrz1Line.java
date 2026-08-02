package com.miteksystems.misnap.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class Mrz1Line extends Mrz {
    public static final Companion Companion = new Companion();
    public final String b;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/Mrz1Line$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Mrz1Line;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Mrz1Line$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Mrz1Line(int i, String str) {
        if (1 == (i & 1)) {
            this.b = str;
        } else {
            TuplesKt.throwMissingFieldException(i, 1, Mrz1Line$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mrz1Line) && Intrinsics.areEqual(this.b, ((Mrz1Line) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("Mrz1Line(mrzString="), this.b, ')');
    }

    public Mrz1Line(String str) {
        str.getClass();
        this.b = str;
    }
}
