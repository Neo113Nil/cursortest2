package defpackage;

import com.yandex.go.taxi.summary.shared.analytics.TrapModeCloseReason;
import java.util.HashMap;
import ru.yandex.taxi.logistics.utils.a;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class uet0 {
    public final wc11 a;
    public final xcv0 b;
    public final oep0 c;
    public final arv0 d;
    public final yvf0 e;
    public final a f;
    public final mf4 g;
    public final u670 h;
    public final rft0 i;
    public final c9l0 j;
    public final net0 k;
    public final ou7 l;
    public final h3y m;
    public final r n;
    public final tft0 o;
    public final ah00 p;
    public final h3y q;

    public uet0(wc11 wc11Var, xcv0 xcv0Var, oep0 oep0Var, arv0 arv0Var, yvf0 yvf0Var, a aVar, mf4 mf4Var, u670 u670Var, rft0 rft0Var, c9l0 c9l0Var, net0 net0Var, ou7 ou7Var, h3y h3yVar, r rVar, tft0 tft0Var, ah00 ah00Var, h3y h3yVar2) {
        this.a = wc11Var;
        this.b = xcv0Var;
        this.c = oep0Var;
        this.d = arv0Var;
        this.e = yvf0Var;
        this.f = aVar;
        this.g = mf4Var;
        this.h = u670Var;
        this.i = rft0Var;
        this.j = c9l0Var;
        this.k = net0Var;
        this.l = ou7Var;
        this.m = h3yVar;
        this.n = rVar;
        this.o = tft0Var;
        this.p = ah00Var;
        this.q = h3yVar2;
    }

    public final void a() {
        c9l0 c9l0Var = this.j;
        if (c9l0Var.b()) {
            c9l0Var.a.a().c(RouteSelectorModalView.class, true, null);
        }
        ((qht0) this.i).b.Z();
        this.k.d();
        if (this.l.b()) {
            ((wit0) this.o.a(true)).c(((gh00) this.p).e.b(), "auto", PositionInitAction.MAP);
        }
        ((xvw) this.m.get()).a();
        this.n.g();
    }

    public final void b(bov0 bov0Var, boolean z) {
        if (!c(bov0Var) && (bov0Var == null || !(bov0Var.c instanceof ziv0) || !this.g.a())) {
            ((xit0) this.q.get()).a();
            a();
        }
        if (z) {
            String str = ((a7t0) this.d).a().b;
            xcv0 xcv0Var = this.b;
            xcv0Var.a.a("Summary.Exit.BackButton", nnm.m(xcv0Var, "summary_state", str), 2, new HashMap());
            this.a.a(TrapModeCloseReason.BACK_BUTTON);
        }
    }

    public final boolean c(bov0 bov0Var) {
        final int i = 0;
        final int i2 = 1;
        return this.h.a(bov0Var, new sls(this) { // from class: tet0
            public final /* synthetic */ uet0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                uet0 uet0Var = this.b;
                switch (i3) {
                    case 0:
                        a.a(uet0Var.f, new x5s0(2, uet0Var));
                        break;
                    default:
                        ((qht0) uet0Var.i).b.r(new qu(9));
                        break;
                }
                return zy11Var;
            }
        }, new p9t0(2, this), new sls(this) { // from class: tet0
            public final /* synthetic */ uet0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                uet0 uet0Var = this.b;
                switch (i3) {
                    case 0:
                        a.a(uet0Var.f, new x5s0(2, uet0Var));
                        break;
                    default:
                        ((qht0) uet0Var.i).b.r(new qu(9));
                        break;
                }
                return zy11Var;
            }
        });
    }
}
