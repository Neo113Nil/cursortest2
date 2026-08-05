package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class NCTxEWno implements zg0 {
    public final /* synthetic */ ActionBarContextView MdtA4re8;
    public int NCTxEWno;
    public boolean qoPGr6Ce = false;

    public NCTxEWno(ActionBarContextView actionBarContextView) {
        this.MdtA4re8 = actionBarContextView;
    }

    @Override // defpackage.zg0
    public final void MdtA4re8() {
        super/*android.view.View*/.setVisibility(0);
        this.qoPGr6Ce = false;
    }

    @Override // defpackage.zg0
    public final void NCTxEWno() {
        this.qoPGr6Ce = true;
    }

    @Override // defpackage.zg0
    public final void qoPGr6Ce() {
        if (this.qoPGr6Ce) {
            return;
        }
        ActionBarContextView actionBarContextView = this.MdtA4re8;
        actionBarContextView.b2ZJblxo = null;
        super/*android.view.View*/.setVisibility(this.NCTxEWno);
    }
}
