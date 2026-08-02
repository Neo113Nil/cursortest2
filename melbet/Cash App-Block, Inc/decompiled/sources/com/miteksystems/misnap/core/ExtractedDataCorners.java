package com.miteksystems.misnap.core;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ExtractedDataCorners {
    public static final Companion Companion = new Companion();
    public final int[][][] a;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/ExtractedDataCorners$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/ExtractedDataCorners;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ExtractedDataCorners$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExtractedDataCorners(int i, int[][][] iArr) {
        if ((i & 1) == 0) {
            this.a = new int[0][][];
        } else {
            this.a = iArr;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtractedDataCorners) && Intrinsics.areEqual(this.a, ((ExtractedDataCorners) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "ExtractedDataCorners(optionalData1Corners=" + Arrays.toString(this.a) + ')';
    }

    public ExtractedDataCorners(int[][][] iArr) {
        iArr.getClass();
        this.a = iArr;
    }
}
