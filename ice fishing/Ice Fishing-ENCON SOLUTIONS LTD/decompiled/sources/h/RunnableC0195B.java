package h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: h.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0195B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f3132b;

    public /* synthetic */ RunnableC0195B(g.a aVar, int i2) {
        this.f3131a = i2;
        this.f3132b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3131a) {
            case 0:
                ViewParent parent = this.f3132b.f3001d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                g.a aVar = this.f3132b;
                aVar.a();
                View view = aVar.f3001d;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    aVar.f3004g = true;
                    break;
                }
                break;
        }
    }
}
