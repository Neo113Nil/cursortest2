package defpackage;

import com.yandex.go.settings.hidephoneinfo.experiments.InAppOnlySettingsToggleExperiment;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;

/* loaded from: classes13.dex */
public final class sw2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ sw2(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void d() {
    }

    public final void a() {
        int i = this.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((uw2) h55Var).r(new qu(i2));
                break;
            default:
                ((rrj) h55Var).r(new qu(i2));
                break;
        }
    }

    public final void b() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                uw2 uw2Var = (uw2) h55Var;
                uw2Var.A((m950) uw2Var.M.get(), PushSettingsOpenReason.MENU, sy60.Q2);
                break;
            default:
                rrj rrjVar = (rrj) h55Var;
                ((gbr0) rrjVar.N).a();
                rrjVar.r(new hlq0(22));
                break;
        }
    }

    public final void c() {
        int i = this.a;
        c21 c21Var = sy60.Q2;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                uw2 uw2Var = (uw2) h55Var;
                uw2Var.z((m950) uw2Var.J.get(), c21Var);
                break;
            default:
                rrj rrjVar = (rrj) h55Var;
                rrjVar.z((m950) ((yvf0) rrjVar.G).get(), c21Var);
                break;
        }
    }

    public final void e() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                uw2 uw2Var = (uw2) h55Var;
                uw2Var.z((m950) uw2Var.N.get(), sy60.Q2);
                break;
            default:
                rrj rrjVar = (rrj) h55Var;
                ((gbr0) rrjVar.N).a();
                rrjVar.r(new hlq0(21));
                break;
        }
    }

    public final void f(InAppOnlySettingsToggleExperiment inAppOnlySettingsToggleExperiment, sls slsVar, sls slsVar2) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                uw2 uw2Var = (uw2) h55Var;
                uw2Var.A((m950) uw2Var.L.get(), new hiu(inAppOnlySettingsToggleExperiment), new rw2(0, slsVar, slsVar2));
                break;
            default:
                rrj rrjVar = (rrj) h55Var;
                rrjVar.A((m950) ((yvf0) rrjVar.I).get(), new hiu(inAppOnlySettingsToggleExperiment), new rw2(1, slsVar, slsVar2));
                break;
        }
    }

    public final void g() {
        ej1 b;
        ej1 b2;
        int i = this.a;
        c21 c21Var = sy60.Q2;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                uw2 uw2Var = (uw2) h55Var;
                b = ((pc60) uw2Var.K).b(false);
                uw2Var.A(b, new nc60((String) null), c21Var);
                break;
            default:
                rrj rrjVar = (rrj) h55Var;
                b2 = ((pc60) ((oc60) rrjVar.M)).b(false);
                rrjVar.A(b2, new nc60((String) null), c21Var);
                break;
        }
    }
}
