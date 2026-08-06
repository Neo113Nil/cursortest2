package defpackage;

/* loaded from: classes.dex */
public final class kf implements android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable, java.util.concurrent.Executor {
    public boolean AARZUJiTa;
    public final /* synthetic */ com.corsair.ledger.MainActivity EXtogiMhuM;
    public final long adDC3e2L = android.os.SystemClock.uptimeMillis() + 10000;
    public java.lang.Runnable xiZrDbcSW0;

    public kf(com.corsair.ledger.MainActivity mainActivity) {
        this.EXtogiMhuM = mainActivity;
    }

    public final void IHQe1A4L2xu(android.view.View view) {
        if (this.AARZUJiTa) {
            return;
        }
        this.AARZUJiTa = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        this.xiZrDbcSW0 = runnable;
        android.view.View decorView = this.EXtogiMhuM.getWindow().getDecorView();
        decorView.getClass();
        if (!this.AARZUJiTa) {
            decorView.postOnAnimation(new defpackage.cnag84Bm(4, this));
        } else if (defpackage.x70.QoRHpC4k(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        java.lang.Runnable runnable = this.xiZrDbcSW0;
        if (runnable == null) {
            if (android.os.SystemClock.uptimeMillis() > this.adDC3e2L) {
                this.AARZUJiTa = false;
                this.EXtogiMhuM.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.xiZrDbcSW0 = null;
        defpackage.uz uzVar = (defpackage.uz) this.EXtogiMhuM.ez2rX8ReCYw.getValue();
        synchronized (uzVar.IHQe1A4L2xu) {
            z = uzVar.oh6vYeIP;
        }
        if (z) {
            this.AARZUJiTa = false;
            this.EXtogiMhuM.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.EXtogiMhuM.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
