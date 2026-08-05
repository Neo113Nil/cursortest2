package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class uc0 implements Runnable {
    public final /* synthetic */ Toolbar MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ uc0(Toolbar toolbar, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.NCTxEWno;
        Toolbar toolbar = this.MdtA4re8;
        switch (i) {
            case 0:
                xc0 xc0Var = toolbar.fVMzMhyS;
                cs csVar = xc0Var == null ? null : xc0Var.MdtA4re8;
                if (csVar != null) {
                    csVar.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.OnDfzHZD();
                break;
        }
    }
}
