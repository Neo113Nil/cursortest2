package defpackage;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class fsd implements Runnable, ka8 {
    public final Handler a;
    public final Runnable b;

    public fsd(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            y5g.g0(th);
        }
    }
}
