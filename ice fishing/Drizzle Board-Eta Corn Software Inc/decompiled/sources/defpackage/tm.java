package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tm {
    public final Object NCTxEWno;
    public final int qoPGr6Ce;

    public tm(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm)) {
            return false;
        }
        tm tmVar = (tm) obj;
        return this.qoPGr6Ce == tmVar.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, tmVar.NCTxEWno);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.qoPGr6Ce) * 31;
        Object obj = this.NCTxEWno;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.qoPGr6Ce + ", value=" + this.NCTxEWno + ')';
    }
}
