package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: m.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4757r0 implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39490n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC4759s0 f39491u;

    public /* synthetic */ RunnableC4757r0(AbstractViewOnTouchListenerC4759s0 abstractViewOnTouchListenerC4759s0, int i) {
        this.f39490n = i;
        this.f39491u = abstractViewOnTouchListenerC4759s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39490n) {
            case 0:
                ViewParent parent = this.f39491u.f39500w.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC4759s0 abstractViewOnTouchListenerC4759s0 = this.f39491u;
                abstractViewOnTouchListenerC4759s0.a();
                View view = abstractViewOnTouchListenerC4759s0.f39500w;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC4759s0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC4759s0.f39503z = true;
                    break;
                }
                break;
        }
    }
}
