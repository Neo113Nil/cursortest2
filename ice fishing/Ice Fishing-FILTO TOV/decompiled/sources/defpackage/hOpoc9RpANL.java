package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
@dj0("activity")
/* loaded from: classes.dex */
public class hOpoc9RpANL extends ej0 {
    public final Activity X1lG3V04pd;

    public hOpoc9RpANL(Context context) {
        Object obj;
        context.getClass();
        Iterator it = x01.EXrPz3p7hFb(context, new bCsSzSHkbaQ(0)).iterator();
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
        this.X1lG3V04pd = (Activity) obj;
    }

    @Override // defpackage.ej0
    public final boolean EljAMC1QTz() {
        Activity activity = this.X1lG3V04pd;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // defpackage.ej0
    public final xh0 GWasM1elztuh() {
        return new gHe2tSmr6w(this);
    }

    @Override // defpackage.ej0
    public final xh0 X1lG3V04pd(xh0 xh0Var) {
        throw new IllegalStateException(("Destination " + ((gHe2tSmr6w) xh0Var).EljAMC1QTz.GWasM1elztuh + " does not have an Intent set.").toString());
    }
}
