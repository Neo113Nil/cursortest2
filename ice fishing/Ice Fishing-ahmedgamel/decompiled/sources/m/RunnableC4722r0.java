package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: m.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4722r0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39288n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC4724s0 f39289u;

    public /* synthetic */ RunnableC4722r0(AbstractViewOnTouchListenerC4724s0 abstractViewOnTouchListenerC4724s0, int i) {
        this.f39288n = i;
        this.f39289u = abstractViewOnTouchListenerC4724s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39288n) {
            case 0:
                ViewParent parent = this.f39289u.f39298w.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC4724s0 abstractViewOnTouchListenerC4724s0 = this.f39289u;
                abstractViewOnTouchListenerC4724s0.a();
                View view = abstractViewOnTouchListenerC4724s0.f39298w;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC4724s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC4724s0.f39301z = true;
                    break;
                }
                break;
        }
    }
}
