package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xlq implements qep {
    public final boolean a;
    public final int b;
    public final int c;
    public final ydp d;
    public final idp e;

    public xlq(boolean z, int i, int i2, ydp ydpVar, idp idpVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = ydpVar;
        this.e = idpVar;
    }

    @Override // defpackage.qep
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.qep
    public final idp b() {
        return this.e;
    }

    @Override // defpackage.qep
    public final idp c() {
        return this.e;
    }

    @Override // defpackage.qep
    public final int d() {
        return this.c;
    }

    @Override // defpackage.qep
    public final iu6 e() {
        int i = this.b;
        int i2 = this.c;
        return i < i2 ? iu6.b : i > i2 ? iu6.a : this.e.b();
    }

    @Override // defpackage.qep
    public final int f() {
        return 1;
    }

    @Override // defpackage.qep
    public final ydp h() {
        return this.d;
    }

    @Override // defpackage.qep
    public final idp i() {
        return this.e;
    }

    @Override // defpackage.qep
    public final idp j() {
        return this.e;
    }

    @Override // defpackage.qep
    public final int k() {
        return this.b;
    }

    @Override // defpackage.qep
    public final boolean l(qep qepVar) {
        if (this.d == null || qepVar == null || !(qepVar instanceof xlq) || this.b != qepVar.k() || this.c != qepVar.d() || this.a != qepVar.a()) {
            return true;
        }
        idp idpVar = ((xlq) qepVar).e;
        idp idpVar2 = this.e;
        return (idpVar2.a == idpVar.a && idpVar2.c == idpVar.c && idpVar2.d == idpVar.d) ? false : true;
    }

    @Override // defpackage.qep
    public final yoi m(ydp ydpVar) {
        boolean z = ydpVar.c;
        xdp xdpVar = ydpVar.b;
        xdp xdpVar2 = ydpVar.a;
        if ((!z && xdpVar2.b > xdpVar.b) || (z && xdpVar2.b <= xdpVar.b)) {
            ydpVar = ydp.a(ydpVar, null, null, !z, 3);
        }
        long j = this.e.a;
        yoi yoiVar = yug.a;
        yoi yoiVar2 = new yoi();
        yoiVar2.h(j, ydpVar);
        return yoiVar2;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + e() + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.qep
    public final void g(Function1 function1) {
    }
}
