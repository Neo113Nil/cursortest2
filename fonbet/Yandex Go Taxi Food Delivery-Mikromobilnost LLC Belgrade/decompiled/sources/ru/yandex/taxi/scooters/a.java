package ru.yandex.taxi.scooters;

import defpackage.ako0;
import defpackage.bko0;
import defpackage.bv8;
import defpackage.cym0;
import defpackage.d6o0;
import defpackage.dpb;
import defpackage.e6o0;
import defpackage.elo0;
import defpackage.epb;
import defpackage.f6o0;
import defpackage.fcj0;
import defpackage.fva0;
import defpackage.g6o0;
import defpackage.gnn0;
import defpackage.gus;
import defpackage.h55;
import defpackage.h7g;
import defpackage.i5m;
import defpackage.i7g;
import defpackage.ia80;
import defpackage.ii9;
import defpackage.iym0;
import defpackage.j6o0;
import defpackage.j7g;
import defpackage.jpj0;
import defpackage.k7g;
import defpackage.l6o0;
import defpackage.lgn0;
import defpackage.lym0;
import defpackage.m6o0;
import defpackage.m950;
import defpackage.mam0;
import defpackage.mo30;
import defpackage.n3w;
import defpackage.n5o0;
import defpackage.nym0;
import defpackage.p7g;
import defpackage.pen0;
import defpackage.pzf;
import defpackage.pzn0;
import defpackage.qgn0;
import defpackage.s3f0;
import defpackage.sin0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.tje;
import defpackage.v5o0;
import defpackage.w511;
import defpackage.xvf0;
import defpackage.ymn0;
import defpackage.yvf0;
import defpackage.zof0;
import defpackage.zuo0;
import defpackage.zz7;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;
import ru.yandex.taxi.scooters.presentation.loading.b;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final fva0 D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final sin0 H;
    public final yvf0 I;
    public final v5o0 J;
    public final gnn0 K;
    public final qgn0 L;
    public final yvf0 M;
    public b N;

    public a(fva0 fva0Var, zof0 zof0Var, bv8 bv8Var, ii9 ii9Var, sin0 sin0Var, mam0 mam0Var, v5o0 v5o0Var, gnn0 gnn0Var, qgn0 qgn0Var, i7g i7gVar) {
        super(null);
        this.D = fva0Var;
        this.E = zof0Var;
        this.F = bv8Var;
        this.G = ii9Var;
        this.H = sin0Var;
        this.I = mam0Var;
        this.J = v5o0Var;
        this.K = gnn0Var;
        this.L = qgn0Var;
        this.M = i7gVar;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        g6o0 g6o0Var = (g6o0) obj;
        boolean z = g6o0Var instanceof e6o0;
        v5o0 v5o0Var = this.J;
        if (z) {
            tje.N(o(), null, null, new ScootersOrderRouter$listenOrderCompletionDirectives$$inlined$collectIn$1(e.c(v5o0Var.a), null, this), 3);
            Q(((e6o0) g6o0Var).a);
        } else if (g6o0Var instanceof d6o0) {
            tje.N(o(), null, null, new ScootersOrderRouter$listenOrderCompletionDirectives$$inlined$collectIn$1(e.c(v5o0Var.a), null, this), 3);
            P(new j6o0(this, 0));
        } else {
            if (!(g6o0Var instanceof f6o0)) {
                w511.b();
                return;
            }
            zuo0 zuo0Var = ((f6o0) g6o0Var).a;
            b bVar = (b) this.E.get();
            this.N = bVar;
            z(bVar, new mo30(29, this));
            tje.N(o(), null, null, new ScootersOrderRouter$loadAndShowFinishInfo$1(this, zuo0Var, null), 3);
        }
        this.H.a.a(sin0.b(g6o0Var));
    }

    public final void P(sls slsVar) {
        p7g p7gVar = ((h7g) this.M.get()).a;
        n3w a = n3w.a(new ako0(new gus(p7gVar.Y5, p7gVar.Z5)));
        n3w a2 = n3w.a(new bko0(new zz7(p7gVar.Y5, p7gVar.Z5)));
        xvf0 b = i5m.b(cym0.a);
        n3w a3 = n3w.a(new nym0(new pzf(a, a2, p7gVar.i, p7gVar.h2, p7gVar.O2, p7gVar.a6, p7gVar.P2, p7gVar.P, p7gVar.K2, p7gVar.s0, p7gVar.z4, p7gVar.h3, b)));
        elo0 elo0Var = new elo0(p7gVar.q4, new s3f0(p7gVar.P, p7gVar.m3, b, 20), 11);
        k7g k7gVar = p7gVar.h2;
        j7g j7gVar = p7gVar.F;
        int i = 21;
        z((iym0) i5m.b(new s3f0(p7gVar.b0, p7gVar.J2, i5m.b(new ia80(p7gVar.I, p7gVar.p2, a3, n3w.a(new lym0(new fcj0(j7gVar, p7gVar.j2, p7gVar.L2, new jpj0(k7gVar, j7gVar, elo0Var, i), p7gVar.B2))))), i)).get(), new l6o0(this, slsVar));
    }

    public final void Q(pen0 pen0Var) {
        ((n5o0) this.L.b).b("Perf.ScootersDetailedOrderRouter.Launch");
        D((m950) this.G.get(), new lgn0(pen0Var), new m6o0(this));
    }

    public final void R(ymn0 ymn0Var, final boolean z) {
        if (z) {
            j(dpb.a);
        } else {
            b bVar = this.N;
            if (bVar != null) {
                j(new epb(bVar));
                this.N = null;
            }
        }
        if (ymn0Var == null) {
            if (z) {
                r(new pzn0(11));
            }
        } else {
            FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = ymn0Var.a.f;
            fva0.f(this.D, feedbackSettingsParams$Screen == FeedbackSettingsParams$Screen.FINISH_CARD ? "ScootersFeedbackFinishCard" : "ScootersFeedbackCancelCard", PerformanceAnalytics$Type.Loading, 0L, 4);
            this.K.a.b(gnn0.a(feedbackSettingsParams$Screen));
            A((m950) this.F.get(), ymn0Var, new sy60() { // from class: k6o0
                @Override // defpackage.sy60
                public final void a() {
                    if (z) {
                        this.r(new pzn0(13));
                    }
                }
            });
        }
    }
}
