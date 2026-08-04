package com.gamericefishpro.space.d;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long d = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable e;
    public boolean i;
    public final /* synthetic */ k v;

    public h(k kVar) {
        this.v = kVar;
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.i) {
            return;
        }
        this.i = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.e = runnable;
        View decorView = this.v.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (!this.i) {
            decorView.postOnAnimation(new com.appsflyer.a(1, this));
        } else if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.d) {
                this.i = false;
                this.v.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.e = null;
        m mVar = (m) this.v.z.getValue();
        synchronized (mVar.b) {
            z = mVar.c;
        }
        if (z) {
            this.i = false;
            this.v.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.v.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
