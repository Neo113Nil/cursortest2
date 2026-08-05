package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f2 {
    public final tg0 qoPGr6Ce;
    public int NCTxEWno = 0;
    public int MdtA4re8 = -1;
    public int wxUZMvaN = -1;

    public f2(tg0 tg0Var) {
        this.qoPGr6Ce = tg0Var;
    }

    public final void MdtA4re8(int i, int i2) {
        qoPGr6Ce();
        ((jp) this.qoPGr6Ce.MdtA4re8).qoPGr6Ce.qoPGr6Ce(i, i2);
    }

    public final void NCTxEWno(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.NCTxEWno == 3 && i <= (i4 = this.wxUZMvaN + (i3 = this.MdtA4re8)) && (i5 = i + i2) >= i3) {
            this.MdtA4re8 = Math.min(i, i3);
            this.wxUZMvaN = Math.max(i4, i5) - this.MdtA4re8;
        } else {
            qoPGr6Ce();
            this.MdtA4re8 = i;
            this.wxUZMvaN = i2;
            this.NCTxEWno = 3;
        }
    }

    public final void qoPGr6Ce() {
        int i = this.NCTxEWno;
        if (i == 0) {
            return;
        }
        tg0 tg0Var = this.qoPGr6Ce;
        if (i == 1) {
            tg0Var.Mq3SeTnW(this.MdtA4re8, this.wxUZMvaN);
        } else if (i == 2) {
            tg0Var.SgZGMMPL(this.MdtA4re8, this.wxUZMvaN);
        } else if (i == 3) {
            ((jp) tg0Var.MdtA4re8).qoPGr6Ce.NCTxEWno(this.MdtA4re8, this.wxUZMvaN);
        }
        this.NCTxEWno = 0;
    }
}
