package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u1 {
    public final boolean MdtA4re8;
    public final int NCTxEWno;
    public final int qoPGr6Ce;

    public u1(int i, int i2, boolean z) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.qoPGr6Ce == u1Var.qoPGr6Ce && this.NCTxEWno == u1Var.NCTxEWno && this.MdtA4re8 == u1Var.MdtA4re8;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.MdtA4re8) + q70.NCTxEWno(this.NCTxEWno, Integer.hashCode(this.qoPGr6Ce) * 31, 31);
    }

    public final String toString() {
        return "BadgeItem(nameRes=" + this.qoPGr6Ce + ", emojiRes=" + this.NCTxEWno + ", unlocked=" + this.MdtA4re8 + ")";
    }
}
