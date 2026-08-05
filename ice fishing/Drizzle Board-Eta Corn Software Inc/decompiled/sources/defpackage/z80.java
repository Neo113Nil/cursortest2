package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z80 {
    public final long MdtA4re8;
    public final String NCTxEWno;
    public final String P7K7Inc8;
    public final long VgvYg0wo;
    public final String b2ZJblxo;
    public final long qoPGr6Ce;
    public final int wxUZMvaN;

    public z80(long j, String str, long j2, int i, long j3, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.qoPGr6Ce = j;
        this.NCTxEWno = str;
        this.MdtA4re8 = j2;
        this.wxUZMvaN = i;
        this.VgvYg0wo = j3;
        this.P7K7Inc8 = str2;
        this.b2ZJblxo = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80)) {
            return false;
        }
        z80 z80Var = (z80) obj;
        return this.qoPGr6Ce == z80Var.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, z80Var.NCTxEWno) && this.MdtA4re8 == z80Var.MdtA4re8 && this.wxUZMvaN == z80Var.wxUZMvaN && this.VgvYg0wo == z80Var.VgvYg0wo && fn.qoPGr6Ce(this.P7K7Inc8, z80Var.P7K7Inc8) && fn.qoPGr6Ce(this.b2ZJblxo, z80Var.b2ZJblxo);
    }

    public final int hashCode() {
        return this.b2ZJblxo.hashCode() + q70.MdtA4re8(this.P7K7Inc8, (Long.hashCode(this.VgvYg0wo) + q70.NCTxEWno(this.wxUZMvaN, (Long.hashCode(this.MdtA4re8) + q70.MdtA4re8(this.NCTxEWno, Long.hashCode(this.qoPGr6Ce) * 31, 31)) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "SprintRoundEntity(id=" + this.qoPGr6Ce + ", traitKey=" + this.NCTxEWno + ", elapsedMillis=" + this.MdtA4re8 + ", accuracyPercent=" + this.wxUZMvaN + ", finishedAt=" + this.VgvYg0wo + ", correctOrder=" + this.P7K7Inc8 + ", userOrder=" + this.b2ZJblxo + ")";
    }
}
