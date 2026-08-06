package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class tw0 implements ww0 {
    public final d GWasM1elztuh;
    public Bundle X1lG3V04pd;
    public boolean Yi7zF1RB1;
    public final m71 xqGvceK5x;

    public tw0(d dVar, ff1 ff1Var) {
        dVar.getClass();
        this.GWasM1elztuh = dVar;
        this.xqGvceK5x = new m71(new o1(12, ff1Var));
    }

    @Override // defpackage.ww0
    public final Bundle GWasM1elztuh() {
        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        Bundle bundle = this.X1lG3V04pd;
        if (bundle != null) {
            jivtDDk9H.putAll(bundle);
        }
        for (Map.Entry entry : ((uw0) this.xqGvceK5x.getValue()).Yi7zF1RB1.entrySet()) {
            String str = (String) entry.getKey();
            Bundle GWasM1elztuh = ((zc) ((pw0) entry.getValue()).Yi7zF1RB1.OOA6hdeuvCS).GWasM1elztuh();
            if (!GWasM1elztuh.isEmpty()) {
                str.getClass();
                jivtDDk9H.putBundle(str, GWasM1elztuh);
            }
        }
        this.Yi7zF1RB1 = false;
        return jivtDDk9H;
    }

    public final void Yi7zF1RB1() {
        if (this.Yi7zF1RB1) {
            return;
        }
        Bundle rQPn8YBR = this.GWasM1elztuh.rQPn8YBR("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        Bundle bundle = this.X1lG3V04pd;
        if (bundle != null) {
            jivtDDk9H.putAll(bundle);
        }
        if (rQPn8YBR != null) {
            jivtDDk9H.putAll(rQPn8YBR);
        }
        this.X1lG3V04pd = jivtDDk9H;
        this.Yi7zF1RB1 = true;
    }
}
