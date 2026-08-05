package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w80 {
    public final long MdtA4re8;
    public final i90 NCTxEWno;
    public final ArrayList P7K7Inc8;
    public final long VgvYg0wo;
    public final ArrayList b2ZJblxo;
    public final long qoPGr6Ce;
    public final int wxUZMvaN;

    public w80(long j, i90 i90Var, long j2, int i, long j3, ArrayList arrayList, ArrayList arrayList2) {
        this.qoPGr6Ce = j;
        this.NCTxEWno = i90Var;
        this.MdtA4re8 = j2;
        this.wxUZMvaN = i;
        this.VgvYg0wo = j3;
        this.P7K7Inc8 = arrayList;
        this.b2ZJblxo = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w80)) {
            return false;
        }
        w80 w80Var = (w80) obj;
        return this.qoPGr6Ce == w80Var.qoPGr6Ce && this.NCTxEWno == w80Var.NCTxEWno && this.MdtA4re8 == w80Var.MdtA4re8 && this.wxUZMvaN == w80Var.wxUZMvaN && this.VgvYg0wo == w80Var.VgvYg0wo && this.P7K7Inc8.equals(w80Var.P7K7Inc8) && this.b2ZJblxo.equals(w80Var.b2ZJblxo);
    }

    public final int hashCode() {
        return this.b2ZJblxo.hashCode() + ((this.P7K7Inc8.hashCode() + ((Long.hashCode(this.VgvYg0wo) + q70.NCTxEWno(this.wxUZMvaN, (Long.hashCode(this.MdtA4re8) + ((this.NCTxEWno.hashCode() + (Long.hashCode(this.qoPGr6Ce) * 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SprintRound(id=" + this.qoPGr6Ce + ", trait=" + this.NCTxEWno + ", elapsedMillis=" + this.MdtA4re8 + ", accuracyPercent=" + this.wxUZMvaN + ", finishedAt=" + this.VgvYg0wo + ", correctOrder=" + this.P7K7Inc8 + ", userOrder=" + this.b2ZJblxo + ")";
    }
}
