package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class quf implements htf {
    public final fvf a;

    public quf(fvf fvfVar) {
        this.a = fvfVar;
    }

    @Override // defpackage.htf
    public final int a() {
        return this.a.j().n;
    }

    @Override // defpackage.htf
    public final int b() {
        int i;
        fvf fvfVar = this.a;
        if (fvfVar.j().k.isEmpty()) {
            return 0;
        }
        bvf j = fvfVar.j();
        int g = (int) (j.p == bxj.a ? j.g() & 4294967295L : j.g() >> 32);
        int U = avf.U(fvfVar.j());
        if (U != 0 && (i = g / U) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.htf
    public final boolean c() {
        return !this.a.j().k.isEmpty();
    }

    @Override // defpackage.htf
    public final int d() {
        return Math.max(0, this.a.h());
    }

    @Override // defpackage.htf
    public final int e() {
        return Math.min(a() - 1, ((cvf) CollectionsKt.Y(this.a.j().k)).a);
    }
}
