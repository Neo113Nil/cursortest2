package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes5.dex */
public final class tuh implements suh {
    public final wiq0 a;
    public final wt90 b;
    public final uq1 c;
    public final ut90 d;
    public final e e;

    public tuh(wiq0 wiq0Var, wt90 wt90Var, uq1 uq1Var, ut90 ut90Var, e eVar) {
        this.a = wiq0Var;
        this.b = wt90Var;
        this.c = uq1Var;
        this.d = ut90Var;
        this.e = eVar;
    }

    public final void a(sls slsVar) {
        pex0 m = ((k) this.a).m();
        TariffOrderFlow tariffOrderFlow = m != null ? m.u0 : null;
        TariffOrderFlow tariffOrderFlow2 = TariffOrderFlow.DELIVERY_FLOW;
        wt90 wt90Var = this.b;
        if (tariffOrderFlow != tariffOrderFlow2 || !this.e.b() || !((Boolean) wt90Var.b.getValue()).booleanValue()) {
            slsVar.invoke();
            wt90Var.a(false);
            return;
        }
        bmh bmhVar = new bmh(1, slsVar, this);
        bgc bgcVar = new bgc(12);
        ut90 ut90Var = this.d;
        hx40 hx40Var = ut90Var.b().g;
        String Y = d6z.Y(ut90Var.b(), hx40Var.a);
        String str = hx40Var.b;
        String Y2 = str != null ? d6z.Y(ut90Var.b(), str) : null;
        String Y3 = d6z.Y(ut90Var.b(), hx40Var.c);
        String Y4 = d6z.Y(ut90Var.b(), hx40Var.d);
        AlertDialog buttonsOrientation = this.c.a().setTitle(Y).setMessage(Y2).setPositiveButton(Y3, new oxe(28, bmhVar)).setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL);
        buttonsOrientation.setNegativeButton(Y4, new vpa(4, bgcVar));
        buttonsOrientation.show();
    }
}
