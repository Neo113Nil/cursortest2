package com.miteksystems.misnap.camera.a;

import android.util.Size;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final Size a;
    public final Size b;
    public final Size c;
    public final int d;
    public final boolean e;
    public final Size f;
    public final Size g;

    public e(MiSnapCameraInfo miSnapCameraInfo, int i, boolean z) {
        Size size = miSnapCameraInfo.d;
        Size size2 = miSnapCameraInfo.e;
        Size size3 = miSnapCameraInfo.f;
        Size size4 = miSnapCameraInfo.i;
        Size size5 = miSnapCameraInfo.j;
        size.getClass();
        size2.getClass();
        size3.getClass();
        this.a = size;
        this.b = size2;
        this.c = size3;
        this.d = i;
        this.e = z;
        this.f = size4;
        this.g = size5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.a, eVar.a) && Intrinsics.areEqual(this.b, eVar.b) && Intrinsics.areEqual(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && Intrinsics.areEqual(this.f, eVar.f) && Intrinsics.areEqual(this.g, eVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (m + i) * 31;
        Size size = this.f;
        int hashCode = (i2 + (size == null ? 0 : size.hashCode())) * 31;
        Size size2 = this.g;
        return hashCode + (size2 != null ? size2.hashCode() : 0);
    }

    public final String toString() {
        return "CameraInternalSettings(previewSize=" + this.a + ", imageAnalysisSize=" + this.b + ", pictureSize=" + this.c + ", rotation=" + this.d + ", enableOutputRotation=" + this.e + ", imageAnalysisHighResolutionSize=" + this.f + ", pictureHighResolutionSize=" + this.g + ')';
    }
}
