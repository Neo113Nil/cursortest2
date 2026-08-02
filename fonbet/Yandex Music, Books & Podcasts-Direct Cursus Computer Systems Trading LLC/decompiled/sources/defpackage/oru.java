package defpackage;

import androidx.fragment.app.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes4.dex */
public final class oru implements nru {
    public final t a;
    public final uru b;
    public final lru c;
    public final lpu d;
    public final nmj e;
    public final fkn f;
    public final dkn g;
    public final dkn h;

    public oru(t tVar, uru uruVar, lru lruVar, lpu lpuVar, nmj nmjVar) {
        nmjVar.getClass();
        this.a = tVar;
        this.b = uruVar;
        this.c = lruVar;
        this.d = lpuVar;
        this.e = nmjVar;
        this.f = uruVar.u;
        this.g = uruVar.q;
        this.h = uruVar.s;
    }

    @Override // defpackage.nru
    public final void a() {
        this.b.K();
    }

    @Override // defpackage.nru
    public final u0q b() {
        return this.g;
    }

    @Override // defpackage.nru
    public final void c() {
        this.c.a.getOnBackPressedDispatcher().d();
    }

    @Override // defpackage.nru
    public final jmj d(oq5 oq5Var) {
        oq5Var.Z(-402821089);
        boolean h = oq5Var.h(this);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new ti1(14, this);
            oq5Var.k0(K);
        }
        jmj b = this.e.b((dmj) K, this.a, null, 1, oq5Var, 36224);
        oq5Var.p(false);
        return b;
    }

    @Override // defpackage.nru
    public final void e(hsu hsuVar) {
        uru uruVar = this.b;
        rmb.j(uruVar.o.B(), wjb.MultivibeActionScreen, y7g.I(0, 0, ""), null, 12);
        uruVar.r.a(new hru(hsuVar));
    }

    @Override // defpackage.nru
    public final u0q f() {
        return this.h;
    }

    @Override // defpackage.nru
    public final void g(gsu gsuVar, String str) {
        gsuVar.getClass();
        str.getClass();
        String obj = StringsKt.t0(str).toString();
        if (Intrinsics.d(obj, gsuVar.b) || obj.length() == 0) {
            return;
        }
        uru uruVar = this.b;
        rar rarVar = uruVar.x;
        if (rarVar == null || !rarVar.b()) {
            uruVar.x = x97.y(ot0.F(uruVar), null, null, new h0t(uruVar, gsuVar, obj, null, 12), 3);
        }
    }

    @Override // defpackage.nru
    public final vdr getState() {
        return this.f;
    }

    @Override // defpackage.nru
    public final void h(hsu hsuVar, boolean z, String str, int i) {
        str.getClass();
        uiq uiqVar = this.b.o;
        uiqVar.getClass();
        weo.H(uiqVar.B(), uiq.u(hsuVar, i), z, str, null);
    }

    @Override // defpackage.nru
    public final void i() {
        t tVar = this.c.a;
        int i = SearchActivity.Z;
        tVar.startActivity(rvf.F(tVar, c0p.c, p0p.a));
    }

    @Override // defpackage.nru
    public final void j(hsu hsuVar) {
        uru uruVar = this.b;
        rar rarVar = uruVar.y;
        if (rarVar == null || !rarVar.b()) {
            uruVar.y = x97.y(ot0.F(uruVar), null, null, new npt(uruVar, hsuVar, (Continuation) null, 18), 3);
        }
    }

    @Override // defpackage.nru
    public final void k(gsu gsuVar) {
        gsuVar.getClass();
        this.b.r.a(new gru(gsuVar));
    }

    @Override // defpackage.nru
    public final void l() {
        this.b.J(new lgq(1, this.d, lpu.class, "showSystemSharingBottomSheet", "showSystemSharingBottomSheet(Ljava/lang/String;)V", 0, 24));
    }

    @Override // defpackage.nru
    public final void m(hsu hsuVar, int i) {
        uru uruVar = this.b;
        uiq uiqVar = uruVar.o;
        if (hsuVar instanceof fsu) {
            uruVar.p.a(new ipu(((fsu) hsuVar).a));
            uiqVar.getClass();
            rmb.j(uiqVar.B(), wjb.MultivibeAloneScreen, uiq.u(hsuVar, i), null, 12);
            return;
        }
        if (!(hsuVar instanceof gsu)) {
            b6e.s();
            return;
        }
        gsu gsuVar = (gsu) hsuVar;
        boolean z = gsuVar.e == mhi.b;
        uiqVar.getClass();
        rmb.a(uiqVar.B(), z ? sjb.Pause : sjb.Play, uiq.u(hsuVar, i), null, 10);
        g0l g0lVar = uruVar.m;
        s9p s9pVar = gsuVar.f.b;
        kxi kxiVar = uruVar.n;
        u5l b = uiqVar.B().b(uiq.u(hsuVar, i));
        qfn qfnVar = new qfn("radio-mobile-wave_for_two-multiwave-default");
        evk evkVar = new evk(25);
        g0lVar.getClass();
        kxiVar.getClass();
        n7q c = g0lVar.c(false);
        if (c instanceof szu) {
            s9p i0 = hdg.i0(((szu) c).a);
            if (i0 != null ? i0.b(s9pVar) : false) {
                g0l.d(g0lVar);
                return;
            }
        }
        g0l.s(g0lVar, s9pVar, kxiVar, b, qfnVar, b0l.b, q0q.a, null, evkVar, 128);
    }
}
