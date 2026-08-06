package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xw0 {
    public boolean AvO7iQsrTN;
    public Bundle EljAMC1QTz;
    public final yw0 GWasM1elztuh;
    public boolean OOA6hdeuvCS;
    public final o1 Yi7zF1RB1;
    public final x51 X1lG3V04pd = new x51(4);
    public final LinkedHashMap xqGvceK5x = new LinkedHashMap();
    public boolean encWxUiV2 = true;

    public xw0(yw0 yw0Var, o1 o1Var) {
        this.GWasM1elztuh = yw0Var;
        this.Yi7zF1RB1 = o1Var;
    }

    public final void GWasM1elztuh() {
        yw0 yw0Var = this.GWasM1elztuh;
        if (yw0Var.AvO7iQsrTN().encWxUiV2 != m90.EljAMC1QTz) {
            o4.jivtDDk9H("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.OOA6hdeuvCS) {
                o4.jivtDDk9H("SavedStateRegistry was already attached.");
                return;
            }
            this.Yi7zF1RB1.GWasM1elztuh();
            yw0Var.AvO7iQsrTN().GWasM1elztuh(new lh0(1, this));
            this.OOA6hdeuvCS = true;
        }
    }
}
