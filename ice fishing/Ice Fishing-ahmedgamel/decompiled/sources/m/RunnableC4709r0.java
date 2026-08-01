package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: m.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4709r0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39219n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC4711s0 f39220u;

    public /* synthetic */ RunnableC4709r0(AbstractViewOnTouchListenerC4711s0 abstractViewOnTouchListenerC4711s0, int i) {
        this.f39219n = i;
        this.f39220u = abstractViewOnTouchListenerC4711s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39219n) {
            case 0:
                ViewParent parent = this.f39220u.f39229w.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC4711s0 abstractViewOnTouchListenerC4711s0 = this.f39220u;
                abstractViewOnTouchListenerC4711s0.a();
                View view = abstractViewOnTouchListenerC4711s0.f39229w;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC4711s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC4711s0.f39232z = true;
                    break;
                }
                break;
        }
    }
}
