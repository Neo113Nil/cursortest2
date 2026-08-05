package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ c2 MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ a2(c2 c2Var, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.NCTxEWno;
        c2 c2Var = this.MdtA4re8;
        switch (i) {
            case 0:
                if (c2Var.VgvYg0wo > 0) {
                    c2Var.P7K7Inc8 = SystemClock.uptimeMillis();
                }
                c2Var.setVisibility(0);
                break;
            default:
                ((wd) c2Var.getCurrentDrawable()).wxUZMvaN(false, false, true);
                if ((c2Var.getProgressDrawable() == null || !c2Var.getProgressDrawable().isVisible()) && (c2Var.getIndeterminateDrawable() == null || !c2Var.getIndeterminateDrawable().isVisible())) {
                    c2Var.setVisibility(4);
                }
                c2Var.P7K7Inc8 = -1L;
                break;
        }
    }
}
