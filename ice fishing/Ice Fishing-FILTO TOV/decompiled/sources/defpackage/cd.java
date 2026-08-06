package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cd implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public boolean AvO7iQsrTN;
    public Runnable EljAMC1QTz;
    public final long OOA6hdeuvCS = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ fd encWxUiV2;

    public cd(fd fdVar) {
        this.encWxUiV2 = fdVar;
    }

    public final void GWasM1elztuh(View view) {
        if (this.AvO7iQsrTN) {
            return;
        }
        this.AvO7iQsrTN = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.EljAMC1QTz = runnable;
        View decorView = this.encWxUiV2.getWindow().getDecorView();
        decorView.getClass();
        if (!this.AvO7iQsrTN) {
            decorView.postOnAnimation(new uFEq9NpZ(4, this));
        } else if (o30.rQPn8YBR(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.EljAMC1QTz;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.OOA6hdeuvCS) {
                this.AvO7iQsrTN = false;
                this.encWxUiV2.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.EljAMC1QTz = null;
        vu vuVar = (vu) this.encWxUiV2.rQPn8YBR.getValue();
        synchronized (vuVar.GWasM1elztuh) {
            z = vuVar.Yi7zF1RB1;
        }
        if (z) {
            this.AvO7iQsrTN = false;
            this.encWxUiV2.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.encWxUiV2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
