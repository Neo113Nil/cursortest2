package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kh {
    public final String NCTxEWno;
    public final String qoPGr6Ce;

    public kh(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, khVar.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, khVar.NCTxEWno);
    }

    public final int hashCode() {
        return this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31);
    }

    public final String toString() {
        return "FlowStep(stage=" + this.qoPGr6Ce + ", detail=" + this.NCTxEWno + ")";
    }
}
