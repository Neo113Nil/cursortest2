package defpackage;

import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class jo {
    public final List MdtA4re8;
    public final List NCTxEWno;
    public final int P7K7Inc8;
    public final int VgvYg0wo;
    public final int b2ZJblxo;
    public final List qoPGr6Ce;
    public final int wxUZMvaN;

    public jo(List list, List list2, List list3, int i, int i2, int i3, int i4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.qoPGr6Ce = list;
        this.NCTxEWno = list2;
        this.MdtA4re8 = list3;
        this.wxUZMvaN = i;
        this.VgvYg0wo = i2;
        this.P7K7Inc8 = i3;
        this.b2ZJblxo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return fn.qoPGr6Ce(this.qoPGr6Ce, joVar.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, joVar.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, joVar.MdtA4re8) && this.wxUZMvaN == joVar.wxUZMvaN && this.VgvYg0wo == joVar.VgvYg0wo && this.P7K7Inc8 == joVar.P7K7Inc8 && this.b2ZJblxo == joVar.b2ZJblxo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b2ZJblxo) + q70.NCTxEWno(this.P7K7Inc8, q70.NCTxEWno(this.VgvYg0wo, q70.NCTxEWno(this.wxUZMvaN, (this.MdtA4re8.hashCode() + ((this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "LedgerState(badges=" + this.qoPGr6Ce + ", averages=" + this.NCTxEWno + ", ratings=" + this.MdtA4re8 + ", basesOpened=" + this.wxUZMvaN + ", basesTotal=" + this.VgvYg0wo + ", cuisinesOpened=" + this.P7K7Inc8 + ", cuisinesTotal=" + this.b2ZJblxo + ")";
    }
}
