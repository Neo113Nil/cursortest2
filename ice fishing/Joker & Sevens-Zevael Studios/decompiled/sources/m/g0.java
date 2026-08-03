package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l.a f4299h;

    public /* synthetic */ g0(l.a aVar, int i10) {
        this.f4298g = i10;
        this.f4299h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4298g) {
            case 0:
                ViewParent parent = this.f4299h.f3651j.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                l.a aVar = this.f4299h;
                aVar.a();
                View view = aVar.f3651j;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    aVar.f3654m = true;
                    break;
                }
                break;
        }
    }
}
