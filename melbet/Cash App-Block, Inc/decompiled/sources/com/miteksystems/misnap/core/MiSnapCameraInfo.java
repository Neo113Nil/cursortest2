package com.miteksystems.misnap.core;

import android.util.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class MiSnapCameraInfo {
    public static final Companion Companion = new Companion();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Size d;
    public final Size e;
    public final Size f;
    public final String g;
    public final String h;
    public final Size i;
    public final Size j;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapCameraInfo$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MiSnapCameraInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MiSnapCameraInfo(int i, boolean z, boolean z2, boolean z3, Size size, Size size2, Size size3, String str, String str2, Size size4, Size size5) {
        if (255 != (i & 255)) {
            TuplesKt.throwMissingFieldException(i, 255, MiSnapCameraInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = size;
        this.e = size2;
        this.f = size3;
        this.g = str;
        this.h = str2;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = size4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = size5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiSnapCameraInfo)) {
            return false;
        }
        MiSnapCameraInfo miSnapCameraInfo = (MiSnapCameraInfo) obj;
        return this.a == miSnapCameraInfo.a && this.b == miSnapCameraInfo.b && this.c == miSnapCameraInfo.c && Intrinsics.areEqual(this.d, miSnapCameraInfo.d) && Intrinsics.areEqual(this.e, miSnapCameraInfo.e) && Intrinsics.areEqual(this.f, miSnapCameraInfo.f) && Intrinsics.areEqual(this.g, miSnapCameraInfo.g) && Intrinsics.areEqual(this.h, miSnapCameraInfo.h) && Intrinsics.areEqual(this.i, miSnapCameraInfo.i) && Intrinsics.areEqual(this.j, miSnapCameraInfo.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        boolean z2 = this.b;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.c;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((i4 + (z3 ? 1 : z3 ? 1 : 0)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
        Size size = this.i;
        int hashCode = (m + (size == null ? 0 : size.hashCode())) * 31;
        Size size2 = this.j;
        return hashCode + (size2 != null ? size2.hashCode() : 0);
    }

    public final String toString() {
        return "MiSnapCameraInfo(supportsAutoAnalysis=" + this.a + ", supportsAutoFocus=" + this.b + ", supportsTorch=" + this.c + ", supportedPreviewSize=" + this.d + ", supportedImageAnalysisSize=" + this.e + ", supportedPictureSize=" + this.f + ", deviceHardwareLevel=" + this.g + ", facingDirection=" + this.h + ", supportedImageAnalysisHighResolutionSize=" + this.i + ", supportedPictureHighResolutionSize=" + this.j + ')';
    }

    public MiSnapCameraInfo(boolean z, boolean z2, boolean z3, Size size, Size size2, Size size3, String str, String str2, Size size4, Size size5) {
        size.getClass();
        size2.getClass();
        size3.getClass();
        str.getClass();
        str2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = size;
        this.e = size2;
        this.f = size3;
        this.g = str;
        this.h = str2;
        this.i = size4;
        this.j = size5;
    }
}
