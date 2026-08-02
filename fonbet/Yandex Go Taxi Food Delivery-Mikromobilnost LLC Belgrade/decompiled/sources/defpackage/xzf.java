package defpackage;

import android.app.Activity;
import android.content.Context;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.preorder.suggested.i;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class xzf implements mjp {
    public final i6r a;
    public final ddf b;
    public final m3o c;
    public final wzf w;
    public final nf x;

    public xzf(ddf ddfVar, m3o m3oVar, i6r i6rVar) {
        this.a = i6rVar;
        this.b = ddfVar;
        this.c = m3oVar;
        wzf wzfVar = new wzf(i6rVar, 7);
        this.w = wzfVar;
        wzf wzfVar2 = new wzf(i6rVar, 5);
        lf lfVar = new lf(wzfVar2, new wzf(i6rVar, 6), 9);
        wzf wzfVar3 = new wzf(i6rVar, 4);
        this.x = new nf(lfVar, new oe(wzfVar2, wzfVar3, new kpp0(wzfVar2, wzfVar3, wzfVar, 11), 7), 3);
    }

    @Override // defpackage.ww4
    public final d6v0 I0() {
        d6v0 I0 = ((c0g) this.a).I0();
        q5z.h(I0);
        return I0;
    }

    @Override // defpackage.ww4
    public final e8v0 L() {
        return ((c0g) this.a).L();
    }

    @Override // defpackage.ww4
    public final Activity N() {
        return ((c0g) this.a).w;
    }

    @Override // defpackage.f51
    public final pyv Z() {
        c0g c0gVar = (c0g) this.a;
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        hbm hbmVar = new hbm(H1);
        tk51 t1 = c0gVar.t1();
        q5z.h(t1);
        f m6 = c0gVar.m6();
        q5z.h(m6);
        return new bw0(hbmVar, t1, m6);
    }

    @Override // defpackage.f51
    public final ru.yandex.taxi.search.presenter.f a() {
        c0g c0gVar = (c0g) this.a;
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        tt2 k = c0gVar.k();
        q5z.h(k);
        b bVar = new b(H1, k, i5m.a(this.w));
        k7x0 s6 = c0gVar.s6();
        q5z.h(s6);
        w3b0 v1 = c0gVar.v1();
        q5z.h(v1);
        ddf ddfVar = this.b;
        ru.yandex.taxi.search.f a = k51.a(ddfVar, v1);
        hju hjuVar = new hju();
        zuj0 c = c0gVar.c();
        q5z.h(c);
        hjuVar.a = c;
        k3o k3oVar = this.c.a;
        gu11 B6 = c0gVar.B6();
        q5z.h(B6);
        c b = c0gVar.b();
        q5z.h(b);
        pdc F1 = c0gVar.F1();
        q5z.h(F1);
        v7b0 v7b0Var = new v7b0(s6, a, hjuVar, k3oVar, B6, b, F1);
        rwp0 rwp0Var = (rwp0) ddfVar.b;
        q5z.i(rwp0Var);
        q I5 = c0gVar.I5();
        q5z.h(I5);
        wiq0 c6 = c0gVar.c6();
        q5z.h(c6);
        com.yandex.go.navigation.screen.c S = c0gVar.S();
        q5z.h(S);
        ru.yandex.taxi.search.c cVar = new ru.yandex.taxi.search.c(I5, c6, S);
        c0g c0gVar2 = c0gVar.A;
        d0g d0gVar = c0gVar2.a;
        zzf zzfVar = d0gVar.a;
        k7x0 k7x0Var = (k7x0) zzfVar.M3.get();
        bgf bgfVar = (bgf) d0gVar.g2.get();
        po21 po21Var = (po21) zzfVar.Y1.get();
        c0g c0gVar3 = d0gVar.b;
        cgf cgfVar = new cgf(k7x0Var, bgfVar, po21Var, (atd0) c0gVar3.Ac.get(), (n) zzfVar.Q2.get(), c0gVar3.R5(), d0gVar.E());
        v7j0 X5 = c0gVar.X5();
        pc60 J5 = c0gVar.J5();
        oep0 a6 = c0gVar.a6();
        q5z.h(a6);
        wff wffVar = new wff(new o61((pho) c0gVar2.a.a.d0.get()));
        pho T1 = c0gVar.T1();
        q5z.h(T1);
        reu reuVar = new reu(23, new b1(T1));
        n v5 = c0gVar.v5();
        q5z.h(v5);
        lcz lczVar = new lcz(reuVar, v5);
        jc61 G6 = c0gVar.G6();
        q5z.h(G6);
        i a2 = G6.a(rwp0Var);
        rqo l1 = c0gVar.l1();
        q5z.h(l1);
        prj0 prj0Var = new prj0(l1);
        tt2 k2 = c0gVar.k();
        q5z.h(k2);
        w6r X = c0gVar.X();
        q5z.h(X);
        return new com.yandex.go.address.search.common.presenter.favorites.b(bVar, v7b0Var, rwp0Var, cVar, cgfVar, X5, J5, a6, wffVar, lczVar, a2, prj0Var, k2, X);
    }

    @Override // defpackage.ww4
    public final c b() {
        c b = ((c0g) this.a).b();
        q5z.h(b);
        return b;
    }

    @Override // defpackage.ww4
    public final zuj0 c() {
        zuj0 c = ((c0g) this.a).c();
        q5z.h(c);
        return c;
    }

    @Override // defpackage.ww4
    public final ney d() {
        ney d = ((c0g) this.a).d();
        q5z.h(d);
        return d;
    }

    @Override // defpackage.ww4
    public final pav e() {
        pav e = ((c0g) this.a).e();
        q5z.h(e);
        return e;
    }

    @Override // defpackage.f51
    public final yvf0 h0() {
        return this.x;
    }
}
