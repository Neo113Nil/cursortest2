package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final long f4418n = SystemClock.uptimeMillis() + 10000;

    /* renamed from: u, reason: collision with root package name */
    public Runnable f4419u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4420v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f4421w;

    public l(p pVar) {
        this.f4421w = pVar;
    }

    public final void a(View view) {
        if (this.f4420v) {
            return;
        }
        this.f4420v = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.h.e(runnable, "runnable");
        this.f4419u = runnable;
        View decorView = this.f4421w.getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (!this.f4420v) {
            decorView.postOnAnimation(new A3.p(11, this));
        } else if (kotlin.jvm.internal.h.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z6;
        Runnable runnable = this.f4419u;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4418n) {
                this.f4420v = false;
                this.f4421w.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4419u = null;
        x fullyDrawnReporter = this.f4421w.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.f4434a) {
            z6 = fullyDrawnReporter.f4435b;
        }
        if (z6) {
            this.f4420v = false;
            this.f4421w.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4421w.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
