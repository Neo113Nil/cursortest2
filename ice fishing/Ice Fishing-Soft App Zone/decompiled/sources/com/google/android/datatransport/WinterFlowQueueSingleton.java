package com.google.android.datatransport;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueSingleton implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final /* synthetic */ ComponentActivity WinterFlowRouterRouter;
    public Runnable WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl = SystemClock.uptimeMillis() + 10000;

    public WinterFlowQueueSingleton(ComponentActivity componentActivity) {
        this.WinterFlowRouterRouter = componentActivity;
    }

    public final void WinterFlowRouterStructure(View view) {
        if (this.WinterFlowUnitTestResponse) {
            return;
        }
        this.WinterFlowUnitTestResponse = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.WinterFlowTransactionManagerStrategy = runnable;
        View decorView = this.WinterFlowRouterRouter.getWindow().getDecorView();
        decorView.getClass();
        if (!this.WinterFlowUnitTestResponse) {
            decorView.postOnAnimation(new WinterFlowServerConcurrency(3, this));
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.WinterFlowTransactionManagerStrategy;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.WinterFlowVariableVersionControl) {
                this.WinterFlowUnitTestResponse = false;
                this.WinterFlowRouterRouter.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.WinterFlowTransactionManagerStrategy = null;
        WinterFlowWorkerEncryption winterFlowWorkerEncryption = (WinterFlowWorkerEncryption) this.WinterFlowRouterRouter.WinterFlowTransactionAgent.getValue();
        synchronized (winterFlowWorkerEncryption.WinterFlowRouterStructure) {
            z = winterFlowWorkerEncryption.WinterFlowHookDataSource;
        }
        if (z) {
            this.WinterFlowUnitTestResponse = false;
            this.WinterFlowRouterRouter.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WinterFlowRouterRouter.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
