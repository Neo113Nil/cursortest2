package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lc0 implements k9 {
    public final ThreadLocal NCTxEWno;

    public lc0(ThreadLocal threadLocal) {
        this.NCTxEWno = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc0) && fn.qoPGr6Ce(this.NCTxEWno, ((lc0) obj).NCTxEWno);
    }

    public final int hashCode() {
        return this.NCTxEWno.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.NCTxEWno + ')';
    }
}
