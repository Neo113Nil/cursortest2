package d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: g, reason: collision with root package name */
    public final long f1498g = SystemClock.uptimeMillis() + 10000;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f1499h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1501j;

    public m(MainActivity mainActivity) {
        this.f1501j = mainActivity;
    }

    public final void a(View view) {
        if (this.f1500i) {
            return;
        }
        this.f1500i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        pc.j.e(runnable, "runnable");
        this.f1499h = runnable;
        View decorView = this.f1501j.getWindow().getDecorView();
        pc.j.d(decorView, "getDecorView(...)");
        if (!this.f1500i) {
            decorView.postOnAnimation(new a1.a(6, this));
        } else if (pc.j.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z10;
        Runnable runnable = this.f1499h;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1498g) {
                this.f1500i = false;
                this.f1501j.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1499h = null;
        p pVar = (p) this.f1501j.f1516m.getValue();
        synchronized (pVar.f1528a) {
            z10 = pVar.f1529b;
        }
        if (z10) {
            this.f1500i = false;
            this.f1501j.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1501j.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
