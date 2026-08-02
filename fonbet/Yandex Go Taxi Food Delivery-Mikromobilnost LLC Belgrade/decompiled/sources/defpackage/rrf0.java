package defpackage;

import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.go.promocodes.c;
import kotlin.Pair;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes13.dex */
public final class rrf0 implements prf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ rrf0(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.prf0
    public final void B() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) h55Var;
                y50 y50Var = cVar.D;
                ((pux0) cVar.I).getClass();
                ((a60) y50Var).c(b64.j(pux0.c, "://paymentmethods"), v770.c);
                break;
            case 1:
                ((urf0) h55Var).r(new qu(i2));
                break;
            case 2:
                nm10 nm10Var = (nm10) ((h3y) ((fcj0) ((y4c0) h55Var).H).b).get();
                lv90.Companion.getClass();
                nm10Var.a(lv90.g);
                break;
            default:
                y4c0 y4c0Var = (y4c0) h55Var;
                y4c0Var.r(new qu(i2));
                ((pep0) ((oep0) y4c0Var.F)).f((m950) ((yvf0) y4c0Var.G).get(), tjv0.c, hxx.a);
                break;
        }
    }

    @Override // defpackage.prf0
    public final void Y(String str) {
        int i = this.a;
        int i2 = 9;
        v770 v770Var = v770.n;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) h55Var;
                cVar.r(new ugd0(13, cVar, str));
                break;
            case 1:
                ((urf0) h55Var).r(new qu(i2));
                break;
            case 2:
                ((a60) ((y50) ((y4c0) h55Var).E)).c(str, v770Var);
                break;
            default:
                y4c0 y4c0Var = (y4c0) h55Var;
                y4c0Var.r(new qu(i2));
                ((but0) y4c0Var.H).invoke(str, v770Var);
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((c) h55Var).r(new qu(i2));
                break;
            case 1:
                ((urf0) h55Var).r(new qu(i2));
                break;
            case 2:
                ((y4c0) h55Var).r(new qu(i2));
                break;
            default:
                ((y4c0) h55Var).r(new qu(i2));
                break;
        }
    }

    @Override // defpackage.prf0
    public final void e0(ynv0 ynv0Var) {
        int i = 9;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                cVar.F.b((m950) cVar.J.get(), new ore0(((c) this.b).E.a, "open summary from order from promocodes", ynv0Var));
                break;
            case 1:
                ((urf0) this.b).r(new qu(i));
                break;
            case 2:
                fcj0 fcj0Var = (fcj0) ((y4c0) this.b).H;
                ((pep0) ((oep0) fcj0Var.e)).f((m950) ((yvf0) fcj0Var.d).get(), new ore0(((dqe0) ((h3y) fcj0Var.c).get()).a, "open summary from scooters promocodes", ynv0Var), hxx.a);
                break;
            default:
                ((y4c0) this.b).r(new qu(i));
                break;
        }
    }

    @Override // defpackage.prf0
    public final void j0() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                c cVar = (c) h55Var;
                y50 y50Var = cVar.D;
                ((pux0) cVar.I).getClass();
                ((a60) y50Var).c(b64.j(pux0.c, "://addcreditcard"), v770.c);
                break;
            case 1:
                ((urf0) h55Var).r(new qu(i2));
                break;
            case 2:
                u500 u500Var = (u500) ((h3y) ((fcj0) ((y4c0) h55Var).H).a).get();
                hb0 hb0Var = u500Var.d;
                boolean z = !((i) ((cba0) u500Var.a.get())).f();
                m2v m2vVar = new m2v(((i) hb0Var.a).v.a());
                m2vVar.A(z);
                u500Var.d(MainMenuProcessor$MenuEntry.ADD_CARD, new Pair(m2vVar.e(), v770.x));
                break;
            default:
                y4c0 y4c0Var = (y4c0) h55Var;
                y4c0Var.r(new qu(i2));
                ((pep0) ((oep0) y4c0Var.F)).f((m950) ((yvf0) y4c0Var.G).get(), sjv0.a, hxx.a);
                break;
        }
    }
}
