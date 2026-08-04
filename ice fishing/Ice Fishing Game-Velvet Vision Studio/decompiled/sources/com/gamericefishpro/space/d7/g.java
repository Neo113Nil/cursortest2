package com.gamericefishpro.space.d7;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final long e;

    public g(String id, String title, String description, boolean z, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.a = id;
        this.b = title;
        this.c = description;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.a, gVar.a) && Intrinsics.a(this.b, gVar.b) && Intrinsics.a(this.c, gVar.c) && this.d == gVar.d && this.e == gVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + y0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "IceAchievementEntity(id=" + this.a + ", title=" + this.b + ", description=" + this.c + ", isUnlocked=" + this.d + ", unlockedAt=" + this.e + ")";
    }
}
