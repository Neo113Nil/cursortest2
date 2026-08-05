package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ng0 {
    public final og0 qoPGr6Ce = new og0();

    public final AutoCloseable MdtA4re8(String str) {
        AutoCloseable autoCloseable;
        og0 og0Var = this.qoPGr6Ce;
        synchronized (og0Var.qoPGr6Ce) {
            autoCloseable = (AutoCloseable) og0Var.NCTxEWno.get(str);
        }
        return autoCloseable;
    }

    public final void NCTxEWno() {
        og0 og0Var = this.qoPGr6Ce;
        if (!og0Var.wxUZMvaN) {
            og0Var.wxUZMvaN = true;
            synchronized (og0Var.qoPGr6Ce) {
                try {
                    Iterator it = og0Var.NCTxEWno.values().iterator();
                    while (it.hasNext()) {
                        og0.qoPGr6Ce((AutoCloseable) it.next());
                    }
                    Iterator it2 = og0Var.MdtA4re8.iterator();
                    while (it2.hasNext()) {
                        og0.qoPGr6Ce((AutoCloseable) it2.next());
                    }
                    og0Var.MdtA4re8.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        wxUZMvaN();
    }

    public final void qoPGr6Ce(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        og0 og0Var = this.qoPGr6Ce;
        if (og0Var.wxUZMvaN) {
            og0.qoPGr6Ce(autoCloseable);
            return;
        }
        synchronized (og0Var.qoPGr6Ce) {
            autoCloseable2 = (AutoCloseable) og0Var.NCTxEWno.put(str, autoCloseable);
        }
        og0.qoPGr6Ce(autoCloseable2);
    }

    public void wxUZMvaN() {
    }
}
