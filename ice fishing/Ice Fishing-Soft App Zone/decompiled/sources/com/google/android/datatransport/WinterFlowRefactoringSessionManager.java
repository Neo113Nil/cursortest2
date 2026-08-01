package com.google.android.datatransport;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowRefactoringSessionManager extends Fragment {
    public static final /* synthetic */ int WinterFlowTransactionManagerStrategy = 0;
    public WinterFlowJSONDecorator WinterFlowVariableVersionControl;

    /* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
    public static final class WinterFlowSyntaxEvent implements Application.ActivityLifecycleCallbacks {
        public static final WinterFlowProviderMicroservice Companion = new WinterFlowProviderMicroservice();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new WinterFlowSyntaxEvent());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, WinterFlowMicroserviceProcess.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, WinterFlowMicroserviceProcess.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, WinterFlowMicroserviceProcess.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, WinterFlowMicroserviceProcess.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, WinterFlowMicroserviceProcess.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = WinterFlowRefactoringSessionManager.WinterFlowTransactionManagerStrategy;
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, WinterFlowMicroserviceProcess.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    public final void WinterFlowRouterStructure(WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            WinterFlowConfigurationHandler.WinterFlowRouterStructure(activity, winterFlowMicroserviceProcess);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        WinterFlowRouterStructure(WinterFlowMicroserviceProcess.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        WinterFlowRouterStructure(WinterFlowMicroserviceProcess.ON_DESTROY);
        this.WinterFlowVariableVersionControl = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        WinterFlowRouterStructure(WinterFlowMicroserviceProcess.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowVariableVersionControl;
        if (winterFlowJSONDecorator != null) {
            ((WinterFlowConcurrencyEventEmitter) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy).WinterFlowCacheManagerAgent();
        }
        WinterFlowRouterStructure(WinterFlowMicroserviceProcess.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        WinterFlowJSONDecorator winterFlowJSONDecorator = this.WinterFlowVariableVersionControl;
        if (winterFlowJSONDecorator != null) {
            WinterFlowConcurrencyEventEmitter winterFlowConcurrencyEventEmitter = (WinterFlowConcurrencyEventEmitter) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
            int i = winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl + 1;
            winterFlowConcurrencyEventEmitter.WinterFlowVariableVersionControl = i;
            if (i == 1 && winterFlowConcurrencyEventEmitter.WinterFlowRouterRouter) {
                winterFlowConcurrencyEventEmitter.WinterFlowResponseEngine.WinterFlowArrayNetwork(WinterFlowMicroserviceProcess.ON_START);
                winterFlowConcurrencyEventEmitter.WinterFlowRouterRouter = false;
            }
        }
        WinterFlowRouterStructure(WinterFlowMicroserviceProcess.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        WinterFlowRouterStructure(WinterFlowMicroserviceProcess.ON_STOP);
    }
}
