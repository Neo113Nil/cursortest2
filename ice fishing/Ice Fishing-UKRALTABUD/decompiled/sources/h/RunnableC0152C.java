package h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import g.ViewOnTouchListenerC0141a;

/* renamed from: h.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0152C implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0141a f2066g;

    public /* synthetic */ RunnableC0152C(ViewOnTouchListenerC0141a viewOnTouchListenerC0141a, int i2) {
        this.f2065f = i2;
        this.f2066g = viewOnTouchListenerC0141a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2065f) {
            case 0:
                ViewParent parent = this.f2066g.f1914d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0141a viewOnTouchListenerC0141a = this.f2066g;
                viewOnTouchListenerC0141a.a();
                View view = viewOnTouchListenerC0141a.f1914d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0141a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0141a.f1917g = true;
                    break;
                }
                break;
        }
    }
}
