package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wd0 extends sd0 {
    public rd0 NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce = 1;

    public wd0(rd0 rd0Var) {
        this.NCTxEWno = rd0Var;
    }

    @Override // defpackage.sd0, defpackage.qd0
    public void qoPGr6Ce(rd0 rd0Var) {
        switch (this.qoPGr6Ce) {
            case 1:
                j1 j1Var = (j1) this.NCTxEWno;
                if (!j1Var.SgZGMMPL) {
                    j1Var.eIA6dogk();
                    j1Var.SgZGMMPL = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.qd0
    public final void wxUZMvaN(rd0 rd0Var) {
        switch (this.qoPGr6Ce) {
            case 0:
                this.NCTxEWno.lwWCatUu();
                rd0Var.WYNAV5pd(this);
                break;
            default:
                j1 j1Var = (j1) this.NCTxEWno;
                int i = j1Var.euDDoUNr - 1;
                j1Var.euDDoUNr = i;
                if (i == 0) {
                    j1Var.SgZGMMPL = false;
                    j1Var.OnDfzHZD();
                }
                rd0Var.WYNAV5pd(this);
                break;
        }
    }

    public /* synthetic */ wd0() {
    }
}
