package defpackage;

import android.content.Context;
import com.yandex.go.shortcuts.impl.interactors.d;
import com.yandex.go.shortcuts.impl.interactors.w;
import com.yandex.go.shortcuts.impl.repository.j;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.multiorder.e;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes14.dex */
public final class t9g implements c4s0 {
    public final s9g A;
    public final x2g B;
    public final r9g C;
    public final n3w D;
    public final x2g E;
    public final r9g F;
    public final r9g G;
    public final n3w H;
    public final xvf0 I;
    public final s9g J;
    public final x2g K;
    public final vo3 L;
    public final r9g M;
    public final r9g N;
    public final r9g O;
    public final x2g P;
    public final r9g Q;
    public final r9g R;
    public final n3w S;
    public final x2g T;
    public final r9g U;
    public final r9g V;
    public final y500 W;
    public final xvf0 Z;
    public final v2g a;
    public final elo0 a0;
    public final x2s0 b;
    public final s9g b0;
    public final p2s0 c;
    public final xvf0 c0;
    public final n3w d0;
    public final r9g e0;
    public final x2g f0;
    public final x2g g0;
    public final w7y0 h0;
    public final r9g i0;
    public final r9g j0;
    public final n3w k0;
    public final h0l0 l0;
    public final s9g m0;
    public final xv8 n0;
    public final s9g o0;
    public final n3w p0;
    public final r9g q0;
    public final r9g r0;
    public final ur3 s0;
    public final eqh t0;
    public final mvy u0;
    public final b900 v0;
    public final x2g w;
    public final k4 w0;
    public final r9g x;
    public final x2g y;
    public final r9g z;

    public t9g(v2g v2gVar, x2s0 x2s0Var, p2s0 p2s0Var, Context context, n050 n050Var, yb00 yb00Var, e eVar, kgt0 kgt0Var, sit sitVar) {
        this.a = v2gVar;
        this.b = x2s0Var;
        this.c = p2s0Var;
        this.w = new x2g(v2gVar, 18);
        this.x = new r9g(v2gVar, 1);
        this.y = new x2g(v2gVar, 21);
        this.z = new r9g(v2gVar, 7);
        this.A = new s9g(v2gVar, 4);
        this.B = new x2g(v2gVar, 22);
        this.C = new r9g(v2gVar, 17);
        this.D = n3w.a(yb00Var);
        this.E = new x2g(v2gVar, 28);
        this.F = new r9g(v2gVar, 26);
        this.G = new r9g(v2gVar, 6);
        n3w a = n3w.a(p2s0Var);
        this.H = a;
        this.I = i5m.b(new qx5(a, (xvf0) this.D, 8));
        xvf0 a2 = dhs0.a(fcu.a);
        s9g s9gVar = new s9g(v2gVar, 8);
        this.J = s9gVar;
        xvf0 a3 = dhs0.a(new f9t(a2, s9gVar, 16));
        x2g x2gVar = new x2g(v2gVar, 20);
        x2g x2gVar2 = new x2g(v2gVar, 29);
        r9g r9gVar = new r9g(v2gVar, 15);
        x2g x2gVar3 = new x2g(v2gVar, 24);
        this.K = x2gVar3;
        this.L = new vo3(this.E, this.F, this.G, this.I, a3, x2gVar, x2gVar2, kjv0.a, r9gVar, x2gVar3, new r9g(v2gVar, 25), 5);
        this.M = new r9g(v2gVar, 4);
        this.N = new r9g(v2gVar, 0);
        this.O = new r9g(v2gVar, 12);
        this.P = new x2g(v2gVar, 26);
        this.Q = new r9g(v2gVar, 28);
        this.R = new r9g(v2gVar, 10);
        this.S = n3w.a(x2s0Var);
        this.T = new x2g(v2gVar, 27);
        this.U = new r9g(v2gVar, 27);
        this.V = new r9g(v2gVar, 13);
        y500 y500Var = new y500(this.Q, 11);
        this.W = y500Var;
        this.Z = i5m.b(new h0z(this.V, i5m.b(new h1t(y500Var, 29)), 6));
        this.a0 = new elo0(new r9g(v2gVar, 8), this.Q, 23);
        this.b0 = new s9g(v2gVar, 7);
        this.c0 = i5m.b(s0s0.a);
        this.d0 = n3w.a(eVar);
        this.e0 = new r9g(v2gVar, 20);
        this.f0 = new x2g(v2gVar, 16);
        x2g x2gVar4 = new x2g(v2gVar, 19);
        this.g0 = x2gVar4;
        this.h0 = new w7y0(x2gVar4, 2);
        this.i0 = new r9g(v2gVar, 21);
        this.j0 = new r9g(v2gVar, 22);
        this.k0 = n3w.a(kgt0Var);
        this.l0 = new h0l0(this.e0, this.W, j8y0.a, this.f0, this.h0, this.i0, this.j0, this.k0, this.R, new v8c0(n3w.a(sitVar), 16), 10);
        this.m0 = new s9g(v2gVar, 0);
        this.n0 = new xv8(this.U, this.Z, this.a0, this.b0, this.c0, this.d0, this.Q, this.l0, this.m0, n3w.a(n050Var), new uzu0(new x2g(v2gVar, 23), 19), new r9g(v2gVar, 5), this.R, 13);
        this.o0 = new s9g(v2gVar, 6);
        this.p0 = n3w.a(this);
        r9g r9gVar2 = new r9g(v2gVar, 11);
        r9g r9gVar3 = new r9g(v2gVar, 19);
        x2g x2gVar5 = new x2g(v2gVar, 25);
        r9g r9gVar4 = new r9g(v2gVar, 23);
        this.q0 = r9gVar4;
        r9g r9gVar5 = new r9g(v2gVar, 2);
        r9g r9gVar6 = new r9g(v2gVar, 3);
        this.r0 = r9gVar6;
        this.s0 = new ur3(this.w, this.f0, r9gVar2, r9gVar3, x2gVar5, r9gVar4, r9gVar5, r9gVar6, this.Q, new r9g(v2gVar, 18), onv0.a, this.z, this.o0, new x2g(v2gVar, 17), this.g0, 6);
        this.t0 = new eqh();
        this.u0 = new mvy(this.Q, 9);
        this.v0 = new b900(this.r0, this.q0, new r9g(v2gVar, 14), this.o0, new s9g(v2gVar, 5), new r9g(v2gVar, 16), new r9g(v2gVar, 24), 24);
        elo0 elo0Var = new elo0(n3w.a(context), new r9g(v2gVar, 29), 24);
        s9g s9gVar2 = new s9g(v2gVar, 1);
        n3w n3wVar = this.p0;
        ur3 ur3Var = this.s0;
        eqh eqhVar = this.t0;
        k4 k4Var = new k4((xvf0) n3wVar, (xvf0) ur3Var, (xvf0) eqhVar, (xvf0) t1s0.a, this.Z, (xvf0) this.u0, this.I, (xvf0) this.v0, (xvf0) elo0Var, (xvf0) q1s0.a, (xvf0) s9gVar2, 11, false);
        this.w0 = k4Var;
        r9g r9gVar7 = this.x;
        n3w n3wVar2 = this.S;
        n3w n3wVar3 = this.H;
        x2g x2gVar6 = this.T;
        xv8 xv8Var = this.n0;
        s9g s9gVar3 = this.o0;
        r9g r9gVar8 = this.Q;
        eqh.a(eqhVar, i5m.b(new npi(this.w, r9gVar7, this.y, this.z, this.A, this.B, this.C, this.D, this.L, this.J, this.M, p7r.a, this.N, this.O, this.P, r9gVar8, this.K, this.R, new h0l0(r9gVar7, n3wVar2, n3wVar3, x2gVar6, xv8Var, s9gVar3, r9gVar8, k4Var, this.m0, s9gVar2), new r9g(v2gVar, 9), new s9g(v2gVar, 2), new s9g(v2gVar, 3))));
    }

    @Override // defpackage.c4s0
    public final a A0() {
        return this.a.A0();
    }

    @Override // defpackage.c4s0
    public final pdc M() {
        return this.a.M();
    }

    @Override // defpackage.c4s0
    public final c M0() {
        return this.a.M0();
    }

    @Override // defpackage.c4s0
    public final gnu0 O() {
        return this.a.O();
    }

    @Override // defpackage.c4s0
    public final tse P0() {
        return this.a.P0();
    }

    @Override // defpackage.c4s0
    public final pqv R0() {
        return this.a.R0();
    }

    @Override // defpackage.c4s0
    public final w6r X() {
        return this.a.X();
    }

    @Override // defpackage.c4s0
    public final o3s0 a0() {
        return this.a.a0();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final ru.yandex.taxi.widget.c b() {
        return this.a.b();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final zuj0 c() {
        return this.a.c();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final ney d() {
        return this.a.d();
    }

    @Override // defpackage.c4s0
    public final w d0() {
        return this.a.d0();
    }

    @Override // defpackage.c4s0
    public final ck31 d1() {
        return this.a.d1();
    }

    @Override // defpackage.c4s0, defpackage.ww4
    public final pav e() {
        return this.a.e();
    }

    @Override // defpackage.c4s0
    public final ru.yandex.taxi.widget.utils.e f() {
        return this.a.f();
    }

    @Override // defpackage.c4s0
    public final t4s0 g0() {
        return this.a.g0();
    }

    @Override // defpackage.c4s0
    public final wr00 h() {
        return this.a.h();
    }

    @Override // defpackage.c4s0
    public final wa90 i0() {
        return this.a.i0();
    }

    @Override // defpackage.c4s0
    public final j800 i1() {
        return this.a.i1();
    }

    @Override // defpackage.c4s0
    public final tt2 k() {
        return this.a.k();
    }

    @Override // defpackage.c4s0
    public final jc00 l0() {
        return this.a.l0();
    }

    @Override // defpackage.c4s0
    public final rqo l1() {
        return this.a.l1();
    }

    @Override // defpackage.c4s0
    public final b8r m() {
        return this.a.m();
    }

    @Override // defpackage.c4s0
    public final Context n0() {
        return this.a.n0();
    }

    @Override // defpackage.c4s0
    public final ms2 n1() {
        return this.a.n1();
    }

    @Override // defpackage.c4s0
    public final za90 o() {
        return this.a.o();
    }

    @Override // defpackage.c4s0
    public final xdf o1() {
        return this.a.o1();
    }

    @Override // defpackage.c4s0
    public final k3s0 q() {
        return this.a.q();
    }

    @Override // defpackage.c4s0
    public final com.yandex.go.lifecycle.processor.e t() {
        return this.a.t();
    }

    @Override // defpackage.c4s0
    public final j u0() {
        return this.a.u0();
    }

    @Override // defpackage.c4s0
    public final s721 v() {
        return this.a.v();
    }

    @Override // defpackage.c4s0
    public final d w0() {
        return this.a.w0();
    }

    @Override // defpackage.c4s0
    public final jx70 x() {
        return this.a.x();
    }

    @Override // defpackage.c4s0
    public final c4r0 x0() {
        return this.a.x0();
    }
}
