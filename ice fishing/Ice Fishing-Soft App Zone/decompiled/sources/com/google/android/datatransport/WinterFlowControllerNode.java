package com.google.android.datatransport;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerNode extends WinterFlowServerTesting {
    final /* synthetic */ WinterFlowConcurrencyEventEmitter this$0;

    /* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
    public static final class WinterFlowSyntaxEvent extends WinterFlowServerTesting {
        final /* synthetic */ WinterFlowConcurrencyEventEmitter this$0;

        public WinterFlowSyntaxEvent(WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter) {
            this.this$0 = winterFlowConcurrencyEventEmitter;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.WinterFlowCacheManagerAgent();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter = this.this$0;
            int i = winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl + 1;
            winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl = i;
            if (i == 1 && winterFlowConcurrencyEventEmitter.WinterFlowRouterRouter) {
                winterFlowConcurrencyEventEmitter.WinterFlowResponseEngine.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_START);
                winterFlowConcurrencyEventEmitter.WinterFlowRouterRouter = false;
            }
        }
    }

    public WinterFlowControllerNode(WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter) {
        this.this$0 = winterFlowConcurrencyEventEmitter;
    }

    @Override // com.google.android.datatransport.WinterFlowServerTesting, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((WinterFlowRefactoringSessionManager) findFragmentByTag).WinterFlowVariableVersionControl = this.this$0.WinterFlowServerProtocol;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowServerTesting, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter = this.this$0;
        int i = winterFlowConcurrencyEventEmitter.WinterFlowTransactionManagerStrategy - 1;
        winterFlowConcurrencyEventEmitter.WinterFlowTransactionManagerStrategy = i;
        if (i == 0) {
            Handler handler = winterFlowConcurrencyEventEmitter.WinterFlowSyntax;
            handler.getClass();
            handler.postDelayed(winterFlowConcurrencyEventEmitter.WinterFlowTransactionAgent, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        WinterFlowBackendSubsystem.WinterFlowSyntax(activity, new WinterFlowSyntaxEvent(this.this$0));
    }

    @Override // com.google.android.datatransport.WinterFlowServerTesting, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter = this.this$0;
        int i = winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl - 1;
        winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl = i;
        if (i == 0 && winterFlowConcurrencyEventEmitter.WinterFlowUnitTestResponse) {
            winterFlowConcurrencyEventEmitter.WinterFlowResponseEngine.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_STOP);
            winterFlowConcurrencyEventEmitter.WinterFlowRouterRouter = true;
        }
    }
}
