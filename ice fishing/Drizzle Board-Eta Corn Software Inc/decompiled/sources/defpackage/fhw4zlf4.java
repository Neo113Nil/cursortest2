package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fhw4zlf4 implements Runnable {
    public final /* synthetic */ SJ7tYVsF MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ fhw4zlf4(SJ7tYVsF sJ7tYVsF, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = sJ7tYVsF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.NCTxEWno;
        SJ7tYVsF sJ7tYVsF = this.MdtA4re8;
        switch (i) {
            case 0:
                if ((sJ7tYVsF.VGmz0ccI & 1) != 0) {
                    sJ7tYVsF.I5GHvsYW(0);
                }
                if ((sJ7tYVsF.VGmz0ccI & 4096) != 0) {
                    sJ7tYVsF.I5GHvsYW(108);
                }
                sJ7tYVsF.ESscZ9M1 = false;
                sJ7tYVsF.VGmz0ccI = 0;
                break;
            default:
                sJ7tYVsF.FySoLYna.showAtLocation(sJ7tYVsF.RXQxj5Oe, 55, 0, 0);
                xg0 xg0Var = sJ7tYVsF.WYNAV5pd;
                if (xg0Var != null) {
                    xg0Var.NCTxEWno();
                }
                if (!sJ7tYVsF.lwWCatUu || (viewGroup = sJ7tYVsF.U0LaHZX7) == null || !viewGroup.isLaidOut()) {
                    sJ7tYVsF.RXQxj5Oe.setAlpha(1.0f);
                    sJ7tYVsF.RXQxj5Oe.setVisibility(0);
                    break;
                } else {
                    sJ7tYVsF.RXQxj5Oe.setAlpha(0.0f);
                    xg0 qoPGr6Ce = hg0.qoPGr6Ce(sJ7tYVsF.RXQxj5Oe);
                    qoPGr6Ce.qoPGr6Ce(1.0f);
                    sJ7tYVsF.WYNAV5pd = qoPGr6Ce;
                    qoPGr6Ce.wxUZMvaN(new n5CPt0tX(0, this));
                    break;
                }
        }
    }
}
