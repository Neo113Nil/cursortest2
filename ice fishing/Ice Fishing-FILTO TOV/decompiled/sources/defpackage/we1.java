package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class we1 {
    public final xe1 GWasM1elztuh = new xe1();

    public final void GWasM1elztuh(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        xe1 xe1Var = this.GWasM1elztuh;
        if (xe1Var != null) {
            if (xe1Var.xqGvceK5x) {
                xe1.GWasM1elztuh(autoCloseable);
                return;
            }
            synchronized (xe1Var.GWasM1elztuh) {
                autoCloseable2 = (AutoCloseable) xe1Var.Yi7zF1RB1.put(str, autoCloseable);
            }
            xe1.GWasM1elztuh(autoCloseable2);
        }
    }

    public final AutoCloseable X1lG3V04pd(String str) {
        AutoCloseable autoCloseable;
        xe1 xe1Var = this.GWasM1elztuh;
        if (xe1Var == null) {
            return null;
        }
        synchronized (xe1Var.GWasM1elztuh) {
            autoCloseable = (AutoCloseable) xe1Var.Yi7zF1RB1.get(str);
        }
        return autoCloseable;
    }

    public final void Yi7zF1RB1() {
        xe1 xe1Var = this.GWasM1elztuh;
        if (xe1Var != null && !xe1Var.xqGvceK5x) {
            xe1Var.xqGvceK5x = true;
            synchronized (xe1Var.GWasM1elztuh) {
                try {
                    Iterator it = xe1Var.Yi7zF1RB1.values().iterator();
                    while (it.hasNext()) {
                        xe1.GWasM1elztuh((AutoCloseable) it.next());
                    }
                    Iterator it2 = xe1Var.X1lG3V04pd.iterator();
                    while (it2.hasNext()) {
                        xe1.GWasM1elztuh((AutoCloseable) it2.next());
                    }
                    xe1Var.X1lG3V04pd.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        xqGvceK5x();
    }

    public void xqGvceK5x() {
    }
}
