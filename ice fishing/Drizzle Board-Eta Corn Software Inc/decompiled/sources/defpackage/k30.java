package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k30 implements Serializable {
    public final Throwable NCTxEWno;

    public k30(Throwable th) {
        th.getClass();
        this.NCTxEWno = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k30) {
            return fn.qoPGr6Ce(this.NCTxEWno, ((k30) obj).NCTxEWno);
        }
        return false;
    }

    public final int hashCode() {
        return this.NCTxEWno.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.NCTxEWno + ')';
    }
}
