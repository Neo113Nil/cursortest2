package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class ssc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tsc b;

    public /* synthetic */ ssc(tsc tscVar, int i) {
        this.a = i;
        this.b = tscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ViewParent parent = this.b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                tsc tscVar = this.b;
                tscVar.c();
                View view = tscVar.d;
                if (view.isEnabled() && !view.isLongClickable() && tscVar.e()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    tscVar.g = true;
                    break;
                }
                break;
        }
    }
}
