package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class tgu {
    public final String a;
    public final pim b;
    public final pim c;
    public final pim d;
    public final pim e;
    public final pim f;
    public final pim g;
    public final pim h;
    public final pim i;
    public final pim j;
    public final pim k;
    public final pim l;
    public final pim m;
    public final pim n;
    public final pim o;
    public final pim p;
    public final pim q;
    public final pim r;
    public final pim s;

    public tgu(String str, pim pimVar, pim pimVar2, pim pimVar3, pim pimVar4, pim pimVar5, pim pimVar6, pim pimVar7, pim pimVar8, pim pimVar9, pim pimVar10, pim pimVar11, pim pimVar12, pim pimVar13, pim pimVar14, pim pimVar15, pim pimVar16, pim pimVar17, pim pimVar18) {
        this.a = str;
        this.b = pimVar;
        this.c = pimVar2;
        this.d = pimVar3;
        this.e = pimVar4;
        this.f = pimVar5;
        this.g = pimVar6;
        this.h = pimVar7;
        this.i = pimVar8;
        this.j = pimVar9;
        this.k = pimVar10;
        this.l = pimVar11;
        this.m = pimVar12;
        this.n = pimVar13;
        this.o = pimVar14;
        this.p = pimVar15;
        this.q = pimVar16;
        this.r = pimVar17;
        this.s = pimVar18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgu)) {
            return false;
        }
        tgu tguVar = (tgu) obj;
        return Intrinsics.d(this.a, tguVar.a) && Intrinsics.d(this.b, tguVar.b) && Intrinsics.d(this.c, tguVar.c) && Intrinsics.d(this.d, tguVar.d) && Intrinsics.d(this.e, tguVar.e) && Intrinsics.d(this.f, tguVar.f) && Intrinsics.d(this.g, tguVar.g) && Intrinsics.d(this.h, tguVar.h) && Intrinsics.d(this.i, tguVar.i) && Intrinsics.d(this.j, tguVar.j) && Intrinsics.d(this.k, tguVar.k) && Intrinsics.d(this.l, tguVar.l) && Intrinsics.d(this.m, tguVar.m) && Intrinsics.d(this.n, tguVar.n) && Intrinsics.d(this.o, tguVar.o) && Intrinsics.d(this.p, tguVar.p) && Intrinsics.d(this.q, tguVar.q) && Intrinsics.d(this.r, tguVar.r) && Intrinsics.d(this.s, tguVar.s);
    }

    public final int hashCode() {
        String str = this.a;
        return this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewPreCreationProfile(id=" + this.a + ", text=" + this.b + ", image=" + this.c + ", gifImage=" + this.d + ", overlapContainer=" + this.e + ", linearContainer=" + this.f + ", wrapContainer=" + this.g + ", grid=" + this.h + ", gallery=" + this.i + ", pager=" + this.j + ", tab=" + this.k + ", state=" + this.l + ", custom=" + this.m + ", indicator=" + this.n + ", slider=" + this.o + ", input=" + this.p + ", select=" + this.q + ", video=" + this.r + ", switch=" + this.s + ')';
    }
}
