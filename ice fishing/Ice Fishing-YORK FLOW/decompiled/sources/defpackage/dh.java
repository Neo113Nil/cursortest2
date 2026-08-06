package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dh implements android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable, java.util.concurrent.Executor {
    public final /* synthetic */ defpackage.gh P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public final long WDYagTQQm9ns = android.os.SystemClock.uptimeMillis() + 10000;
    public java.lang.Runnable oh71FJcDz6S2;

    public dh(defpackage.gh ghVar) {
        this.P05cfTpS5W5L = ghVar;
    }

    public final void ZpBGe2uQfcn8(android.view.View view) {
        if (this.QiMR8OkAhezm) {
            return;
        }
        this.QiMR8OkAhezm = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        this.oh71FJcDz6S2 = runnable;
        android.view.View decorView = this.P05cfTpS5W5L.getWindow().getDecorView();
        decorView.getClass();
        if (!this.QiMR8OkAhezm) {
            decorView.postOnAnimation(new defpackage.gUjdnLbkVAaA(5, this));
        } else if (defpackage.ma0.QiMR8OkAhezm(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        java.lang.Runnable runnable = this.oh71FJcDz6S2;
        if (runnable == null) {
            if (android.os.SystemClock.uptimeMillis() > this.WDYagTQQm9ns) {
                this.QiMR8OkAhezm = false;
                this.P05cfTpS5W5L.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.oh71FJcDz6S2 = null;
        defpackage.m10 m10Var = (defpackage.m10) this.P05cfTpS5W5L.Ns0WNyEWdPsk.getValue();
        synchronized (m10Var.ZpBGe2uQfcn8) {
            z = m10Var.giKS3J6vZuNy;
        }
        if (z) {
            this.QiMR8OkAhezm = false;
            this.P05cfTpS5W5L.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.P05cfTpS5W5L.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
