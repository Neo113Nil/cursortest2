package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class hi0 {
    public final boolean AvO7iQsrTN;
    public final y5 EljAMC1QTz;
    public final Context GWasM1elztuh;
    public boolean OOA6hdeuvCS;
    public final kp X1lG3V04pd;
    public final ph0 Yi7zF1RB1;
    public final Activity xqGvceK5x;

    public hi0(Context context) {
        Object obj;
        context.getClass();
        this.GWasM1elztuh = context;
        this.Yi7zF1RB1 = new ph0(this, new j4(this, 8));
        int i = 1;
        this.X1lG3V04pd = new kp(context, 1);
        Iterator it = x01.EXrPz3p7hFb(context, new bCsSzSHkbaQ(27)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.xqGvceK5x = (Activity) obj;
        this.EljAMC1QTz = new y5(i, this);
        this.AvO7iQsrTN = true;
        fj0 fj0Var = this.Yi7zF1RB1.mE4lRynR;
        fj0Var.GWasM1elztuh(new gi0(fj0Var));
        this.Yi7zF1RB1.mE4lRynR.GWasM1elztuh(new hOpoc9RpANL(this.GWasM1elztuh));
        new m71(new j4(this, 9));
    }

    public final void GWasM1elztuh() {
        ph0 ph0Var = this.Yi7zF1RB1;
        if (ph0Var.EljAMC1QTz.isEmpty()) {
            return;
        }
        xh0 encWxUiV2 = ph0Var.encWxUiV2();
        encWxUiV2.getClass();
        if (ph0Var.XnEVoBF0td1l(encWxUiV2.EljAMC1QTz.GWasM1elztuh, true, false)) {
            ph0Var.Yi7zF1RB1();
        }
    }
}
