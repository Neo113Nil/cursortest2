package com.gamericefishpro.space.d7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;

    public d(int i, int i2, int i3, int i4, String title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.a = i;
        this.b = title;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && Intrinsics.a(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + com.gamericefishpro.space.m5.a.t(this.e, com.gamericefishpro.space.m5.a.t(this.d, y0.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31);
    }

    public final String toString() {
        return "FishLevelEntity(level=" + this.a + ", title=" + this.b + ", isLocked=" + this.c + ", stars=" + this.d + ", bestScore=" + this.e + ", coinsEarned=" + this.f + ")";
    }
}
