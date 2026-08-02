package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rc5 implements pc5 {
    public final nc5 a;
    public final x1u b;
    public final oc5 c;
    public final vdr d;
    public final vdr e;
    public final fkn f;

    public rc5(nc5 nc5Var, x1u x1uVar, mm6 mm6Var, oc5 oc5Var) {
        x1uVar.getClass();
        this.a = nc5Var;
        this.b = x1uVar;
        this.c = oc5Var;
        Continuation continuation = null;
        this.d = sk3.a0(mm6Var, new u21(10, new u21(7, nc5Var.b.d, nc5Var, x1uVar), new d64(nc5Var.a.c(), 8), new ib3(3, 1, continuation)));
        this.e = sk3.a0(mm6Var, zsd.M0(zsd.b0(new cz(((oq7) nc5Var.e.getValue()).a.c, x1uVar, 25)), new l1(continuation, this, 15)));
        this.f = lg3.u0(nc5Var.c.x(x1uVar), mm6Var, j1g.b);
    }

    @Override // defpackage.pc5
    public final void a() {
        this.c.i(this.b);
    }

    @Override // defpackage.pc5
    public final vdr b() {
        return this.f;
    }

    @Override // defpackage.pc5
    public final vdr c() {
        return this.e;
    }

    @Override // defpackage.pc5
    public final boolean d() {
        return this.c.h(this.b);
    }

    @Override // defpackage.pc5
    public final void e() {
        this.c.e(this.b);
    }

    @Override // defpackage.pc5
    public final void f(boolean z) {
        this.c.k(this.b, z);
    }

    @Override // defpackage.pc5
    public final vdr h() {
        return this.d;
    }

    @Override // defpackage.pc5
    public final boolean i() {
        return false;
    }
}
