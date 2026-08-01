package b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import h.AbstractActivityC0168i;
import java.util.concurrent.Executor;

/* renamed from: b.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0112h implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f2278b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0168i f2280d;

    /* renamed from: a, reason: collision with root package name */
    public final long f2277a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2279c = false;

    public ExecutorC0112h(AbstractActivityC0168i abstractActivityC0168i) {
        this.f2280d = abstractActivityC0168i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2278b = runnable;
        View decorView = this.f2280d.getWindow().getDecorView();
        if (!this.f2279c) {
            decorView.postOnAnimation(new D.a(11, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f2278b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2277a) {
                this.f2279c = false;
                this.f2280d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2278b = null;
        C0115k c0115k = this.f2280d.i;
        synchronized (c0115k.f2299b) {
            z2 = c0115k.f2298a;
        }
        if (z2) {
            this.f2279c = false;
            this.f2280d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2280d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
