package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ow0 implements kw0, yw0 {
    public d AvO7iQsrTN;
    public w90 EljAMC1QTz;
    public final /* synthetic */ lw0 OOA6hdeuvCS;

    public ow0(lw0 lw0Var) {
        this.OOA6hdeuvCS = lw0Var;
        Object EljAMC1QTz = lw0Var.EljAMC1QTz("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = EljAMC1QTz instanceof Bundle ? (Bundle) EljAMC1QTz : null;
        if (bundle != null) {
            encWxUiV2(bundle);
        }
        lw0Var.GWasM1elztuh("androidx.savedstate.SavedStateRegistry", new o1(11, this));
    }

    @Override // defpackage.t90
    public final w90 AvO7iQsrTN() {
        w90 w90Var = this.EljAMC1QTz;
        if (w90Var != null) {
            return w90Var;
        }
        w90 w90Var2 = new w90(this, false);
        this.EljAMC1QTz = w90Var2;
        return w90Var2;
    }

    @Override // defpackage.kw0
    public final Object EljAMC1QTz(String str) {
        return this.OOA6hdeuvCS.EljAMC1QTz(str);
    }

    @Override // defpackage.kw0
    public final f4 GWasM1elztuh(String str, wu wuVar) {
        return this.OOA6hdeuvCS.GWasM1elztuh(str, wuVar);
    }

    @Override // defpackage.kw0
    public final Map OOA6hdeuvCS() {
        return this.OOA6hdeuvCS.OOA6hdeuvCS();
    }

    @Override // defpackage.yw0
    public final d X1lG3V04pd() {
        return (d) encWxUiV2(null).AvO7iQsrTN;
    }

    public final d encWxUiV2(Bundle bundle) {
        d dVar = this.AvO7iQsrTN;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(new xw0(this, new o1(13, this)), 18);
        this.AvO7iQsrTN = dVar2;
        dVar2.Mjvvu5DE(bundle);
        return dVar2;
    }

    @Override // defpackage.kw0
    public final boolean xqGvceK5x(Object obj) {
        return this.OOA6hdeuvCS.xqGvceK5x(obj);
    }
}
