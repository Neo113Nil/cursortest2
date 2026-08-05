package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ah {
    public final boolean MdtA4re8;
    public final String NCTxEWno;
    public final String qoPGr6Ce;

    public ah(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
        this.MdtA4re8 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, ahVar.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, ahVar.NCTxEWno) && this.MdtA4re8 == ahVar.MdtA4re8;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.MdtA4re8) + q70.MdtA4re8(this.NCTxEWno, this.qoPGr6Ce.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowItem(stage=" + this.qoPGr6Ce + ", detail=" + this.NCTxEWno + ", isLast=" + this.MdtA4re8 + ")";
    }
}
