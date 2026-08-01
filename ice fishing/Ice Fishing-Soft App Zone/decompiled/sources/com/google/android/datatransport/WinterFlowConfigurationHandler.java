package com.google.android.datatransport;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import com.google.android.datatransport.WinterFlowRefactoringSessionManager;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowConfigurationHandler {
    public static void WinterFlowHookDataSource(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            WinterFlowRefactoringSessionManager.WinterFlowSyntaxEvent.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new WinterFlowRefactoringSessionManager.WinterFlowSyntaxEvent());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new WinterFlowRefactoringSessionManager(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void WinterFlowRouterStructure(Activity activity, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess) {
        winterFlowMicroserviceProcess.getClass();
        if (activity instanceof WinterFlowDecoratorVersion) {
            WinterFlowDatabaseUtility WinterFlowUnitTestResponse = ((WinterFlowDecoratorVersion) activity).WinterFlowUnitTestResponse();
            if (WinterFlowUnitTestResponse instanceof WinterFlowDatabaseUtility) {
                WinterFlowUnitTestResponse.WinterFlowArrayNetwork(winterFlowMicroserviceProcess);
            }
        }
    }
}
