package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vw implements OnBackAnimationCallback {
    public final /* synthetic */ ok MdtA4re8;
    public final /* synthetic */ zk NCTxEWno;
    public final /* synthetic */ zk qoPGr6Ce;
    public final /* synthetic */ ok wxUZMvaN;

    public vw(zk zkVar, zk zkVar2, ok okVar, ok okVar2) {
        this.qoPGr6Ce = zkVar;
        this.NCTxEWno = zkVar2;
        this.MdtA4re8 = okVar;
        this.wxUZMvaN = okVar2;
    }

    public final void onBackCancelled() {
        this.wxUZMvaN.qoPGr6Ce();
    }

    public final void onBackInvoked() {
        this.MdtA4re8.qoPGr6Ce();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.NCTxEWno.ow5vqvCr(new l1(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.qoPGr6Ce.ow5vqvCr(new l1(backEvent));
    }
}
