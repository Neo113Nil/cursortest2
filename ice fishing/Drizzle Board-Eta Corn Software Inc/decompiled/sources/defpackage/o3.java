package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o3 {
    public boolean MdtA4re8;
    public n3 NCTxEWno;
    public boolean qoPGr6Ce;

    public final void qoPGr6Ce(n3 n3Var) {
        synchronized (this) {
            while (this.MdtA4re8) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.NCTxEWno == n3Var) {
                return;
            }
            this.NCTxEWno = n3Var;
            if (this.qoPGr6Ce) {
                n3Var.onCancel();
            }
        }
    }
}
