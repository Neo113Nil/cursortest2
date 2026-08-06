package defpackage;

/* loaded from: classes.dex */
public final class d3 implements defpackage.kx0, android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback {
    public static long JlrlGoKF;
    public boolean AARZUJiTa;
    public boolean SH1y5HwkJhh;
    public final android.view.View adDC3e2L;
    public long ez2rX8ReCYw;
    public final java.util.PriorityQueue xiZrDbcSW0 = new java.util.PriorityQueue(11, new defpackage.b3(0));
    public final android.view.Choreographer EXtogiMhuM = android.view.Choreographer.getInstance();
    public final defpackage.c3 riuEU0zW4 = new defpackage.c3();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d3(android.view.View view) {
        float f;
        this.adDC3e2L = view;
        if (JlrlGoKF == 0) {
            android.view.Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            JlrlGoKF = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.SH1y5HwkJhh = true;
        }
    }

    @Override // defpackage.kx0
    public final void IHQe1A4L2xu(defpackage.jx0 jx0Var) {
        this.xiZrDbcSW0.add(new defpackage.tx0(1, jx0Var));
        if (this.AARZUJiTa) {
            return;
        }
        this.AARZUJiTa = true;
        this.adDC3e2L.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.SH1y5HwkJhh) {
            this.ez2rX8ReCYw = j;
            this.adDC3e2L.post(this);
        }
    }

    public final boolean oh6vYeIP() {
        defpackage.c3 c3Var = this.riuEU0zW4;
        long IHQe1A4L2xu = c3Var.IHQe1A4L2xu();
        defpackage.fm.WLpAkxCo("compose:lazy:prefetch:available_time_nanos", IHQe1A4L2xu);
        boolean z = true;
        if (IHQe1A4L2xu > 0) {
            java.util.PriorityQueue priorityQueue = this.xiZrDbcSW0;
            java.lang.Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((defpackage.tx0) peek).oh6vYeIP.r1MBDhnF(c3Var)) {
                priorityQueue.poll();
                z = false;
            }
            c3Var.IHQe1A4L2xu = false;
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.SH1y5HwkJhh = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.SH1y5HwkJhh = false;
        this.adDC3e2L.removeCallbacks(this);
        this.EXtogiMhuM.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.PriorityQueue priorityQueue = this.xiZrDbcSW0;
        if (!priorityQueue.isEmpty() && this.AARZUJiTa && this.SH1y5HwkJhh) {
            android.view.View view = this.adDC3e2L;
            if (view.getWindowVisibility() == 0) {
                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = java.lang.System.nanoTime() > (2 * JlrlGoKF) + nanos;
                defpackage.c3 c3Var = this.riuEU0zW4;
                c3Var.IHQe1A4L2xu = z;
                c3Var.oh6vYeIP = java.lang.Math.max(this.ez2rX8ReCYw, nanos) + JlrlGoKF;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (c3Var.IHQe1A4L2xu) {
                        android.os.Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = oh6vYeIP();
                        } finally {
                            android.os.Trace.endSection();
                        }
                    } else {
                        z2 = oh6vYeIP();
                    }
                }
                if (z2) {
                    this.EXtogiMhuM.postFrameCallback(this);
                } else {
                    this.AARZUJiTa = false;
                }
                defpackage.fm.WLpAkxCo("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.AARZUJiTa = false;
    }
}
