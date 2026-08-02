package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.appcompat.app.TwilightManager$TwilightState;
import bo.app.ng$$ExternalSyntheticLambda0;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class AndroidPrefetchScheduler implements PrefetchScheduler, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long frameIntervalNs;
    public long frameStartTimeNanos;
    public boolean isActive;
    public boolean prefetchScheduled;
    public final View view;
    public final PriorityQueue prefetchRequests = new PriorityQueue(11, new ng$$ExternalSyntheticLambda0(2));
    public final Choreographer choreographer = Choreographer.getInstance();
    public final TwilightManager$TwilightState scope = new TwilightManager$TwilightState();

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r0 >= 30.0f) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidPrefetchScheduler(View view) {
        float f;
        this.view = view;
        if (frameIntervalNs == 0) {
            Display display = view.getDisplay();
            if (display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            frameIntervalNs = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.isActive = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.isActive) {
            this.frameStartTimeNanos = j;
            this.view.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.isActive = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.isActive = false;
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.prefetchRequests;
        if (!priorityQueue.isEmpty() && this.prefetchScheduled && this.isActive) {
            View view = this.view;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * frameIntervalNs) + nanos;
                TwilightManager$TwilightState twilightManager$TwilightState = this.scope;
                twilightManager$TwilightState.isNight = z;
                twilightManager$TwilightState.nextUpdate = Math.max(this.frameStartTimeNanos, nanos) + frameIntervalNs;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (twilightManager$TwilightState.isNight) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = runRequest();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = runRequest();
                    }
                }
                if (z2) {
                    this.choreographer.postFrameCallback(this);
                } else {
                    this.prefetchScheduled = false;
                }
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.prefetchScheduled = false;
    }

    public final boolean runRequest() {
        TwilightManager$TwilightState twilightManager$TwilightState = this.scope;
        long availableTimeNanos = twilightManager$TwilightState.availableTimeNanos();
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", availableTimeNanos);
        boolean z = true;
        if (availableTimeNanos > 0) {
            PriorityQueue priorityQueue = this.prefetchRequests;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((PriorityTask) peek).request.execute(twilightManager$TwilightState)) {
                priorityQueue.poll();
                z = false;
            }
            twilightManager$TwilightState.isNight = false;
        }
        return z;
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    public final void schedulePrefetch(PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl) {
        this.prefetchRequests.add(new PriorityTask(1, prefetchHandleProvider$HandleAndRequestImpl));
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }
}
