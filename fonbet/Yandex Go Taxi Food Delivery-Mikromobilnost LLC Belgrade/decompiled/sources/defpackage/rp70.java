package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.CancelRules;
import com.yandex.go.taxi.order.models.api.response.s;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class rp70 {
    public final ob0 a;
    public final zuj0 b;
    public final apf c;
    public final ci70 d;
    public final xdf e;
    public boolean f;

    public rp70(ob0 ob0Var, zuj0 zuj0Var, apf apfVar, ci70 ci70Var, xdf xdfVar) {
        this.a = ob0Var;
        this.b = zuj0Var;
        this.c = apfVar;
        this.d = ci70Var;
        this.e = xdfVar;
    }

    public static boolean c(TaxiOrder taxiOrder) {
        DriveState driveState = taxiOrder.h.b;
        s sVar = CancelRules.Companion;
        CancelRules cancelRules = taxiOrder.h.a;
        sVar.getClass();
        return (cancelRules == null || "free".equals(cancelRules.b) || driveState == DriveState.FAILED) ? false : true;
    }

    public final String a(Dialog.a aVar) {
        String str = aVar != null ? aVar.b : null;
        return (str == null || evu0.J(str)) ? b(kyh0.dialog_common_ok) : str;
    }

    public final String b(int i) {
        return ((avj0) this.b).h(i);
    }

    public final void d(o2y0 o2y0Var, int i, Runnable runnable, String str, sf30 sf30Var) {
        tdj tdjVar = new tdj(o2y0Var);
        tdjVar.c = b(i);
        tdjVar.a(new h2r(19, runnable, sf30Var));
        if (str != null) {
            tdjVar.i = str;
        }
        this.c.l(tdjVar);
    }
}
