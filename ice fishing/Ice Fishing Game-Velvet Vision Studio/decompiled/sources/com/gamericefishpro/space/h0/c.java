package com.gamericefishpro.space.h0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long A;
    public final View d;
    public boolean i;
    public boolean y;
    public long z;
    public final PriorityQueue e = new PriorityQueue(11, new a(0));
    public final Choreographer v = Choreographer.getInstance();
    public final b w = new b();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public c(View view) {
        float refreshRate;
        this.d = view;
        if (A == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            A = (long) (1000000000 / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.y = true;
        }
    }

    @Override // com.gamericefishpro.space.h0.a1
    public void a(y0 y0Var) {
        this.e.add(new d1(1, y0Var));
        if (this.i) {
            return;
        }
        this.i = true;
        this.d.post(this);
    }

    public final boolean b() {
        b bVar = this.w;
        long jA = bVar.a();
        com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:available_time_nanos", jA);
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.e;
            Object objPeek = priorityQueue.peek();
            Intrinsics.b(objPeek);
            if (!((d1) objPeek).b.c(bVar)) {
                priorityQueue.poll();
                z = false;
            }
            bVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.y) {
            this.z = j;
            this.d.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.y = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.y = false;
        this.d.removeCallbacks(this);
        this.v.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.e;
        if (!priorityQueue.isEmpty() && this.i && this.y) {
            View view = this.d;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (((long) 2) * A) + nanos;
                b bVar = this.w;
                bVar.a = z;
                bVar.b = Math.max(this.z, nanos) + A;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (bVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.v.postFrameCallback(this);
                } else {
                    this.i = false;
                }
                com.gamericefishpro.space.i.a.S("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.i = false;
    }
}
