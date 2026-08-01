package com.google.android.datatransport;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionInheritance implements WinterFlowProviderConcurrency, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long WinterFlowServerProtocol;
    public boolean WinterFlowResponseEngine;
    public long WinterFlowTransactionAgent;
    public boolean WinterFlowUnitTestResponse;
    public final View WinterFlowVariableVersionControl;
    public final PriorityQueue WinterFlowTransactionManagerStrategy = new PriorityQueue(11, new WinterFlowVariableEntity(0));
    public final Choreographer WinterFlowRouterRouter = Choreographer.getInstance();
    public final WinterFlowDeserializationSessionManager WinterFlowSyntax = new WinterFlowDeserializationSessionManager();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowSessionInheritance(View view) {
        float f;
        this.WinterFlowVariableVersionControl = view;
        if (WinterFlowServerProtocol == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            WinterFlowServerProtocol = (long) (1.0E9f / f);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.WinterFlowResponseEngine = true;
        }
    }

    public final boolean WinterFlowHookDataSource() {
        WinterFlowDeserializationSessionManager winterFlowDeserializationSessionManager = this.WinterFlowSyntax;
        long WinterFlowRouterStructure = winterFlowDeserializationSessionManager.WinterFlowRouterStructure();
        WinterFlowTestingCloud.WinterFlowCompilerHandler("compose:lazy:prefetch:available_time_nanos", WinterFlowRouterStructure);
        boolean z = true;
        if (WinterFlowRouterStructure > 0) {
            PriorityQueue priorityQueue = this.WinterFlowTransactionManagerStrategy;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((WinterFlowHandlerDeserialization) peek).WinterFlowHookDataSource.WinterFlowHookDataSource(winterFlowDeserializationSessionManager)) {
                priorityQueue.poll();
                z = false;
            }
            winterFlowDeserializationSessionManager.WinterFlowRouterStructure = false;
        }
        return z;
    }

    @Override // com.google.android.datatransport.WinterFlowProviderConcurrency
    public final void WinterFlowRouterStructure(WinterFlowServerJava winterFlowServerJava) {
        this.WinterFlowTransactionManagerStrategy.add(new WinterFlowHandlerDeserialization(1, winterFlowServerJava));
        if (this.WinterFlowUnitTestResponse) {
            return;
        }
        this.WinterFlowUnitTestResponse = true;
        this.WinterFlowVariableVersionControl.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.WinterFlowResponseEngine) {
            this.WinterFlowTransactionAgent = j;
            this.WinterFlowVariableVersionControl.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.WinterFlowResponseEngine = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.WinterFlowResponseEngine = false;
        this.WinterFlowVariableVersionControl.removeCallbacks(this);
        this.WinterFlowRouterRouter.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.WinterFlowTransactionManagerStrategy;
        if (!priorityQueue.isEmpty() && this.WinterFlowUnitTestResponse && this.WinterFlowResponseEngine) {
            View view = this.WinterFlowVariableVersionControl;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * WinterFlowServerProtocol) + nanos;
                WinterFlowDeserializationSessionManager winterFlowDeserializationSessionManager = this.WinterFlowSyntax;
                winterFlowDeserializationSessionManager.WinterFlowRouterStructure = z;
                winterFlowDeserializationSessionManager.WinterFlowHookDataSource = Math.max(this.WinterFlowTransactionAgent, nanos) + WinterFlowServerProtocol;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (winterFlowDeserializationSessionManager.WinterFlowRouterStructure) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = WinterFlowHookDataSource();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = WinterFlowHookDataSource();
                    }
                }
                if (z2) {
                    this.WinterFlowRouterRouter.postFrameCallback(this);
                } else {
                    this.WinterFlowUnitTestResponse = false;
                }
                WinterFlowTestingCloud.WinterFlowCompilerHandler("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.WinterFlowUnitTestResponse = false;
    }
}
