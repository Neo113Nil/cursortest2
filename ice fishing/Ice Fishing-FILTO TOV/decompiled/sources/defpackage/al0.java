package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class al0 implements OnBackAnimationCallback {
    public final /* synthetic */ yk0 GWasM1elztuh;

    public al0(yk0 yk0Var) {
        this.GWasM1elztuh = yk0Var;
    }

    public final void onBackCancelled() {
        yk0 yk0Var = this.GWasM1elztuh;
        rx0 rx0Var = yk0Var.GWasM1elztuh;
        if (rx0Var == null) {
            o4.jivtDDk9H("This input is not added to any dispatcher.");
            return;
        }
        if (!yk0Var.Yi7zF1RB1) {
            rx0Var.EljAMC1QTz(yk0Var, null);
        }
        aj0 aj0Var = (aj0) rx0Var.EljAMC1QTz;
        aj0Var.getClass();
        if (yk0Var.equals(aj0Var.encWxUiV2) && -1 == aj0Var.AvO7iQsrTN) {
            xi0 xi0Var = aj0Var.EljAMC1QTz;
            if (xi0Var == null) {
                xi0Var = aj0Var.X1lG3V04pd(-1);
            }
            aj0Var.EljAMC1QTz = null;
            aj0Var.AvO7iQsrTN = 0;
            aj0Var.encWxUiV2 = null;
            if (xi0Var != null) {
                xi0Var.GWasM1elztuh();
            }
            p51 p51Var = aj0Var.GWasM1elztuh;
            p51Var.getClass();
            p51Var.JFJ3QoxA(null, bj0.GWasM1elztuh);
        }
        yk0Var.Yi7zF1RB1 = false;
    }

    public final void onBackInvoked() {
        this.GWasM1elztuh.GWasM1elztuh();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        vi0 GWasM1elztuh = o50.GWasM1elztuh(backEvent);
        yk0 yk0Var = this.GWasM1elztuh;
        rx0 rx0Var = yk0Var.GWasM1elztuh;
        if (rx0Var == null) {
            o4.jivtDDk9H("This input is not added to any dispatcher.");
            return;
        }
        if (yk0Var.Yi7zF1RB1) {
            aj0 aj0Var = (aj0) rx0Var.EljAMC1QTz;
            aj0Var.getClass();
            if (yk0Var.equals(aj0Var.encWxUiV2) && -1 == aj0Var.AvO7iQsrTN) {
                xi0 xi0Var = aj0Var.EljAMC1QTz;
                if (xi0Var == null) {
                    xi0Var = aj0Var.X1lG3V04pd(-1);
                }
                if (xi0Var != null) {
                    xi0Var.X1lG3V04pd(GWasM1elztuh);
                }
                p51 p51Var = aj0Var.GWasM1elztuh;
                cj0 cj0Var = new cj0(GWasM1elztuh);
                p51Var.getClass();
                p51Var.JFJ3QoxA(null, cj0Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        vi0 GWasM1elztuh = o50.GWasM1elztuh(backEvent);
        yk0 yk0Var = this.GWasM1elztuh;
        rx0 rx0Var = yk0Var.GWasM1elztuh;
        if (rx0Var == null) {
            o4.jivtDDk9H("This input is not added to any dispatcher.");
        } else {
            if (yk0Var.Yi7zF1RB1) {
                return;
            }
            rx0Var.EljAMC1QTz(yk0Var, GWasM1elztuh);
            yk0Var.Yi7zF1RB1 = true;
        }
    }
}
