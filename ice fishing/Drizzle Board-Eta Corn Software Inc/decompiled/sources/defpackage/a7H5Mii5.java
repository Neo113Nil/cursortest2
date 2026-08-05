package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a7H5Mii5 implements OnBackInvokedCallback {
    public final /* synthetic */ Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ a7H5Mii5(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    public final void onBackInvoked() {
        int i = this.qoPGr6Ce;
        Object obj = this.NCTxEWno;
        switch (i) {
            case 0:
                ((SJ7tYVsF) obj).i7xS8jrb();
                break;
            case 1:
                ((ok) obj).qoPGr6Ce();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
