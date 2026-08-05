package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l7 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable MdtA4re8;
    public final /* synthetic */ f4UNdked VgvYg0wo;
    public final long NCTxEWno = SystemClock.uptimeMillis() + 10000;
    public boolean wxUZMvaN = false;

    public l7(f4UNdked f4undked) {
        this.VgvYg0wo = f4undked;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.MdtA4re8 = runnable;
        View decorView = this.VgvYg0wo.getWindow().getDecorView();
        if (!this.wxUZMvaN) {
            decorView.postOnAnimation(new d3vfVszL(4, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.MdtA4re8;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.NCTxEWno) {
                this.wxUZMvaN = false;
                this.VgvYg0wo.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.MdtA4re8 = null;
        nk nkVar = this.VgvYg0wo.k3x7lurq;
        synchronized (nkVar.qoPGr6Ce) {
            z = nkVar.NCTxEWno;
        }
        if (z) {
            this.wxUZMvaN = false;
            this.VgvYg0wo.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.VgvYg0wo.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
