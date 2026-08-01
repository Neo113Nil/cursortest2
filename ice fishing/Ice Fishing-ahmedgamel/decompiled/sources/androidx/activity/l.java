package androidx.activity;

import D.RunnableC0282a;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final long f4450n = SystemClock.uptimeMillis() + 10000;

    /* renamed from: u, reason: collision with root package name */
    public Runnable f4451u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4452v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f4453w;

    public l(p pVar) {
        this.f4453w = pVar;
    }

    public final void a(View view) {
        if (this.f4452v) {
            return;
        }
        this.f4452v = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.h.e(runnable, "runnable");
        this.f4451u = runnable;
        View decorView = this.f4453w.getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (!this.f4452v) {
            decorView.postOnAnimation(new RunnableC0282a(10, this));
        } else if (kotlin.jvm.internal.h.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f4451u;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4450n) {
                this.f4452v = false;
                this.f4453w.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4451u = null;
        x fullyDrawnReporter = this.f4453w.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f4466a) {
            z3 = fullyDrawnReporter.f4467b;
        }
        if (z3) {
            this.f4452v = false;
            this.f4453w.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4453w.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
