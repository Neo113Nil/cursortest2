package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class gi implements Runnable {
    public final /* synthetic */ hi MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ gi(hi hiVar, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = hiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.NCTxEWno;
        hi hiVar = this.MdtA4re8;
        switch (i) {
            case 0:
                ViewParent parent = hiVar.VgvYg0wo.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                hiVar.qoPGr6Ce();
                View view = hiVar.VgvYg0wo;
                if (view.isEnabled() && !view.isLongClickable() && hiVar.MdtA4re8()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    hiVar.Qr9iLBAD = true;
                    break;
                }
                break;
        }
    }
}
