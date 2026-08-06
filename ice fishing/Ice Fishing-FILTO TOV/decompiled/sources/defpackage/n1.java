package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n1 implements rr0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long E7jCp8Ls;
    public boolean AvO7iQsrTN;
    public boolean JFJ3QoxA;
    public final View OOA6hdeuvCS;
    public long rQPn8YBR;
    public final PriorityQueue EljAMC1QTz = new PriorityQueue(11, new l1(0));
    public final Choreographer encWxUiV2 = Choreographer.getInstance();
    public final m1 mOu10nynGul = new m1();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n1(View view) {
        float f;
        this.OOA6hdeuvCS = view;
        if (E7jCp8Ls == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            E7jCp8Ls = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.JFJ3QoxA = true;
        }
    }

    @Override // defpackage.rr0
    public final void GWasM1elztuh(qr0 qr0Var) {
        this.EljAMC1QTz.add(new zr0(1, qr0Var));
        if (this.AvO7iQsrTN) {
            return;
        }
        this.AvO7iQsrTN = true;
        this.OOA6hdeuvCS.post(this);
    }

    public final boolean Yi7zF1RB1() {
        m1 m1Var = this.mOu10nynGul;
        long GWasM1elztuh = m1Var.GWasM1elztuh();
        rj0.DmJncFq5("compose:lazy:prefetch:available_time_nanos", GWasM1elztuh);
        boolean z = true;
        if (GWasM1elztuh > 0) {
            PriorityQueue priorityQueue = this.EljAMC1QTz;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((zr0) peek).Yi7zF1RB1.X1lG3V04pd(m1Var)) {
                priorityQueue.poll();
                z = false;
            }
            m1Var.GWasM1elztuh = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.JFJ3QoxA) {
            this.rQPn8YBR = j;
            this.OOA6hdeuvCS.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.JFJ3QoxA = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.JFJ3QoxA = false;
        this.OOA6hdeuvCS.removeCallbacks(this);
        this.encWxUiV2.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.EljAMC1QTz;
        if (!priorityQueue.isEmpty() && this.AvO7iQsrTN && this.JFJ3QoxA) {
            View view = this.OOA6hdeuvCS;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * E7jCp8Ls) + nanos;
                m1 m1Var = this.mOu10nynGul;
                m1Var.GWasM1elztuh = z;
                m1Var.Yi7zF1RB1 = Math.max(this.rQPn8YBR, nanos) + E7jCp8Ls;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (m1Var.GWasM1elztuh) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = Yi7zF1RB1();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = Yi7zF1RB1();
                    }
                }
                if (z2) {
                    this.encWxUiV2.postFrameCallback(this);
                } else {
                    this.AvO7iQsrTN = false;
                }
                rj0.DmJncFq5("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.AvO7iQsrTN = false;
    }
}
