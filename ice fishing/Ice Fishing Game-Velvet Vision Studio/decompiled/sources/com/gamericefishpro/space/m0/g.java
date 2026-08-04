package com.gamericefishpro.space.m0;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final String a;
    public String b;
    public boolean c = false;
    public d d = null;

    public g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.a, gVar.a) && Intrinsics.a(this.b, gVar.b) && this.c == gVar.c && Intrinsics.a(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = y0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        d dVar = this.d;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
