package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0280t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0282u0 f4025b;

    public /* synthetic */ RunnableC0280t0(AbstractViewOnTouchListenerC0282u0 abstractViewOnTouchListenerC0282u0, int i) {
        this.f4024a = i;
        this.f4025b = abstractViewOnTouchListenerC0282u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4024a) {
            case 0:
                ViewParent parent = this.f4025b.f4032d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0282u0 abstractViewOnTouchListenerC0282u0 = this.f4025b;
                abstractViewOnTouchListenerC0282u0.a();
                View view = abstractViewOnTouchListenerC0282u0.f4032d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0282u0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.f2111C0, RecyclerView.f2111C0, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0282u0.f4034g = true;
                    break;
                }
                break;
        }
    }
}
