package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f4 extends sd0 {
    public final ViewGroup NCTxEWno;
    public boolean qoPGr6Ce = false;

    public f4(ViewGroup viewGroup) {
        this.NCTxEWno = viewGroup;
    }

    @Override // defpackage.sd0, defpackage.qd0
    public final void MdtA4re8() {
        e50.lDXGDhIF(this.NCTxEWno, true);
    }

    @Override // defpackage.sd0, defpackage.qd0
    public final void NCTxEWno() {
        e50.lDXGDhIF(this.NCTxEWno, false);
    }

    @Override // defpackage.sd0, defpackage.qd0
    public final void P7K7Inc8(rd0 rd0Var) {
        e50.lDXGDhIF(this.NCTxEWno, false);
        this.qoPGr6Ce = true;
    }

    @Override // defpackage.qd0
    public final void wxUZMvaN(rd0 rd0Var) {
        if (!this.qoPGr6Ce) {
            e50.lDXGDhIF(this.NCTxEWno, false);
        }
        rd0Var.WYNAV5pd(this);
    }
}
