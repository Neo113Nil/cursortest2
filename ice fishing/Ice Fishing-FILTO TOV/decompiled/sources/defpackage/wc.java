package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements wu {
    public final /* synthetic */ fd EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ wc(fd fdVar, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = fdVar;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        int i = this.OOA6hdeuvCS;
        fd fdVar = this.EljAMC1QTz;
        switch (i) {
            case 0:
                fdVar.reportFullyDrawn();
                return kc1.GWasM1elztuh;
            case 1:
                return new vu(fdVar.JFJ3QoxA, new wc(fdVar, 0));
            case 2:
                fm fmVar = new fm();
                fdVar.GWasM1elztuh().xqGvceK5x(fmVar);
                return fmVar;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return new zw0(fdVar.getApplication(), fdVar, fdVar.getIntent() != null ? fdVar.getIntent().getExtras() : null);
            default:
                hl0 hl0Var = new hl0(new uFEq9NpZ(3, fdVar));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (o30.rQPn8YBR(Looper.myLooper(), Looper.getMainLooper())) {
                        fdVar.OOA6hdeuvCS.GWasM1elztuh(new xc(hl0Var, fdVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new t(1, fdVar, hl0Var));
                    }
                }
                return hl0Var;
        }
    }
}
