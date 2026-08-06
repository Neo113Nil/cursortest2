package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class k3 implements defpackage.n11, android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback {
    public static long fNwYGHIYeJcR;
    public boolean GE9mJIPrb8gP;
    public long Ns0WNyEWdPsk;
    public boolean QiMR8OkAhezm;
    public final android.view.View WDYagTQQm9ns;
    public final java.util.PriorityQueue oh71FJcDz6S2 = new java.util.PriorityQueue(11, new defpackage.i3(0));
    public final android.view.Choreographer P05cfTpS5W5L = android.view.Choreographer.getInstance();
    public final defpackage.j3 e6mdH7fiFuta = new defpackage.j3();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k3(android.view.View view) {
        float f;
        this.WDYagTQQm9ns = view;
        if (fNwYGHIYeJcR == 0) {
            android.view.Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            fNwYGHIYeJcR = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.GE9mJIPrb8gP = true;
        }
    }

    @Override // defpackage.n11
    public final void ZpBGe2uQfcn8(defpackage.m11 m11Var) {
        this.oh71FJcDz6S2.add(new defpackage.d21(1, m11Var));
        if (this.QiMR8OkAhezm) {
            return;
        }
        this.QiMR8OkAhezm = true;
        this.WDYagTQQm9ns.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.GE9mJIPrb8gP) {
            this.Ns0WNyEWdPsk = j;
            this.WDYagTQQm9ns.post(this);
        }
    }

    public final boolean giKS3J6vZuNy() {
        defpackage.j3 j3Var = this.e6mdH7fiFuta;
        long ZpBGe2uQfcn8 = j3Var.ZpBGe2uQfcn8();
        defpackage.nn.Mearx7yMn90V("compose:lazy:prefetch:available_time_nanos", ZpBGe2uQfcn8);
        boolean z = true;
        if (ZpBGe2uQfcn8 > 0) {
            java.util.PriorityQueue priorityQueue = this.oh71FJcDz6S2;
            java.lang.Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((defpackage.d21) peek).giKS3J6vZuNy.fWTAfUmVKrZq(j3Var)) {
                priorityQueue.poll();
                z = false;
            }
            j3Var.ZpBGe2uQfcn8 = false;
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.GE9mJIPrb8gP = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.GE9mJIPrb8gP = false;
        this.WDYagTQQm9ns.removeCallbacks(this);
        this.P05cfTpS5W5L.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.PriorityQueue priorityQueue = this.oh71FJcDz6S2;
        if (!priorityQueue.isEmpty() && this.QiMR8OkAhezm && this.GE9mJIPrb8gP) {
            android.view.View view = this.WDYagTQQm9ns;
            if (view.getWindowVisibility() == 0) {
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = java.lang.System.nanoTime() > (2 * fNwYGHIYeJcR) + nanos;
                defpackage.j3 j3Var = this.e6mdH7fiFuta;
                j3Var.ZpBGe2uQfcn8 = z;
                j3Var.giKS3J6vZuNy = java.lang.Math.max(this.Ns0WNyEWdPsk, nanos) + fNwYGHIYeJcR;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (j3Var.ZpBGe2uQfcn8) {
                        android.os.Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = giKS3J6vZuNy();
                        } finally {
                            android.os.Trace.endSection();
                        }
                    } else {
                        z2 = giKS3J6vZuNy();
                    }
                }
                if (z2) {
                    this.P05cfTpS5W5L.postFrameCallback(this);
                } else {
                    this.QiMR8OkAhezm = false;
                }
                defpackage.nn.Mearx7yMn90V("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.QiMR8OkAhezm = false;
    }
}
