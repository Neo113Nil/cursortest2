package com.gamericefishpro.space.d7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final int i;

    public o(int i, String iceId, String fishSource, String fishData, String fishId, String iceFishingApp, boolean z, boolean z2, int i2) {
        Intrinsics.checkNotNullParameter(iceId, "iceId");
        Intrinsics.checkNotNullParameter(fishSource, "fishSource");
        Intrinsics.checkNotNullParameter(fishData, "fishData");
        Intrinsics.checkNotNullParameter(fishId, "fishId");
        Intrinsics.checkNotNullParameter(iceFishingApp, "iceFishingApp");
        this.a = i;
        this.b = iceId;
        this.c = fishSource;
        this.d = fishData;
        this.e = fishId;
        this.f = iceFishingApp;
        this.g = z;
        this.h = z2;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && Intrinsics.a(this.b, oVar.b) && Intrinsics.a(this.c, oVar.c) && Intrinsics.a(this.d, oVar.d) && Intrinsics.a(this.e, oVar.e) && Intrinsics.a(this.f, oVar.f) && this.g == oVar.g && this.h == oVar.h && this.i == oVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + y0.c(y0.c((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "IceStartupParamsEntity(id=" + this.a + ", iceId=" + this.b + ", fishSource=" + this.c + ", fishData=" + this.d + ", fishId=" + this.e + ", iceFishingApp=" + this.f + ", isOnboarded=" + this.g + ", notificationPermissionRequested=" + this.h + ", notificationPermissionRequestCount=" + this.i + ")";
    }
}
