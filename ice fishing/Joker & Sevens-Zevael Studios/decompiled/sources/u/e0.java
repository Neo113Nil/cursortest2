package u;

import v.e1;
import v.x0;
import v.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 extends y0.m implements x1.w {

    /* renamed from: u, reason: collision with root package name */
    public e1 f6584u;

    /* renamed from: v, reason: collision with root package name */
    public g0 f6585v;

    /* renamed from: w, reason: collision with root package name */
    public oc.a f6586w;

    /* renamed from: x, reason: collision with root package name */
    public w f6587x;

    /* renamed from: y, reason: collision with root package name */
    public long f6588y;

    /* renamed from: z, reason: collision with root package name */
    public y0.f f6589z;

    @Override // x1.w
    public final v1.f0 e(x1.o0 o0Var, v1.d0 d0Var, long j3) {
        if (this.f6584u.c() == this.f6584u.f6826d.getValue()) {
            this.f6589z = null;
        } else if (this.f6589z == null) {
            if (this.f6584u.f().b(v.f6645g, v.f6646h)) {
                o0 o0Var2 = this.f6585v.f6601a;
            } else {
                o0 o0Var3 = this.f6585v.f6601a;
            }
            this.f6589z = y0.c.f8419g;
        }
        boolean t3 = o0Var.t();
        bc.w wVar = bc.w.f1068g;
        if (t3) {
            v1.j0 e10 = d0Var.e(j3);
            long e11 = i7.b.e(e10.f7085g, e10.f7086h);
            this.f6588y = e11;
            return o0Var.H((int) (e11 >> 32), (int) (4294967295L & e11), wVar, new c1.h(e10, 2));
        }
        if (!((Boolean) this.f6586w.invoke()).booleanValue()) {
            v1.j0 e12 = d0Var.e(j3);
            return o0Var.H(e12.f7085g, e12.f7086h, wVar, new c1.h(e12, 3));
        }
        w wVar2 = this.f6587x;
        y0 y0Var = wVar2.f6649a;
        y0 y0Var2 = wVar2.f6650b;
        e1 e1Var = wVar2.f6651c;
        f0 f0Var = wVar2.f6652d;
        g0 g0Var = wVar2.f6653e;
        y0 y0Var3 = wVar2.f6654f;
        x0 a6 = y0Var != null ? y0Var.a(new y(f0Var, g0Var, 0), new y(f0Var, g0Var, 1)) : null;
        x0 a8 = y0Var2 != null ? y0Var2.a(new y(f0Var, g0Var, 2), new y(f0Var, g0Var, 3)) : null;
        if (e1Var.c() == v.f6645g) {
            o0 o0Var4 = g0Var.f6601a;
        } else {
            o0 o0Var5 = g0Var.f6601a;
        }
        a0.r rVar = new a0.r(a6, a8, y0Var3 != null ? y0Var3.a(x.f6657j, new a0.r(r4, f0Var, g0Var, 5)) : null, 4);
        v1.j0 e13 = d0Var.e(j3);
        long e14 = i7.b.e(e13.f7085g, e13.f7086h);
        long j6 = !s2.k.a(this.f6588y, t.f6640a) ? this.f6588y : e14;
        long d10 = s2.b.d(j3, e14);
        y0.f fVar = this.f6589z;
        return o0Var.H((int) (d10 >> 32), (int) (d10 & 4294967295L), wVar, new c0(e13, s2.i.c(fVar != null ? fVar.a(j6, d10, s2.l.f6396g) : 0L, 0L), 0L, rVar, 0));
    }

    @Override // y0.m
    public final void j0() {
        this.f6588y = t.f6640a;
    }
}
