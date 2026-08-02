package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class i2k implements htf {
    public final o3k a;
    public final int b;

    public i2k(o3k o3kVar, int i) {
        this.a = o3kVar;
        this.b = i;
    }

    @Override // defpackage.htf
    public final int a() {
        return this.a.n();
    }

    @Override // defpackage.htf
    public final int b() {
        int i;
        o3k o3kVar = this.a;
        if (o3kVar.l().a.size() == 0) {
            return 0;
        }
        y2k l = o3kVar.l();
        int g = (int) (l.e == bxj.a ? l.g() & 4294967295L : l.g() >> 32);
        int i2 = o3kVar.l().b + o3kVar.l().c;
        if (i2 != 0 && (i = g / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.htf
    public final boolean c() {
        return !this.a.l().a.isEmpty();
    }

    @Override // defpackage.htf
    public final int d() {
        return Math.max(0, this.a.e - this.b);
    }

    @Override // defpackage.htf
    public final int e() {
        return Math.min(r0.n() - 1, ((nfh) CollectionsKt.Y(this.a.l().a)).a + this.b);
    }
}
