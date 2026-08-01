package com.google.android.datatransport;

import android.app.job.JobParameters;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import androidx.activity.ComponentActivity;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowControllerManager implements Runnable {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowControllerManager(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((ActivityHandler) this.WinterFlowTransactionManagerStrategy).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.WinterFlowUnitTestResponse);
                return;
            case 1:
                ((ActivityHandler) this.WinterFlowTransactionManagerStrategy).lambda$new$2((AdjustConfig) this.WinterFlowUnitTestResponse);
                return;
            case 2:
                WinterFlowProtocolDecorator.WinterFlowHookDataSource((WinterFlowVariableAgent) this.WinterFlowTransactionManagerStrategy, (LongSparseArray) this.WinterFlowUnitTestResponse);
                return;
            case 3:
                ComponentActivity componentActivity = (ComponentActivity) this.WinterFlowTransactionManagerStrategy;
                WinterFlowViewRenderer winterFlowViewRenderer = (WinterFlowViewRenderer) this.WinterFlowUnitTestResponse;
                int i = ComponentActivity.WinterFlowBackendCacheManager;
                componentActivity.WinterFlowVariableVersionControl.WinterFlowRouterStructure(new WinterFlowRouterNetwork(winterFlowViewRenderer, componentActivity));
                return;
            case 4:
                WinterFlowProcessorListener winterFlowProcessorListener = (WinterFlowProcessorListener) this.WinterFlowTransactionManagerStrategy;
                WinterFlowHookInheritance winterFlowHookInheritance = (WinterFlowHookInheritance) this.WinterFlowUnitTestResponse;
                if (winterFlowProcessorListener.WinterFlowHookDataSource != WinterFlowProcessorListener.WinterFlowArrayNetwork) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("provide() can be called only once.");
                    return;
                }
                synchronized (winterFlowProcessorListener) {
                    winterFlowEventEmitterOrchestration = winterFlowProcessorListener.WinterFlowRouterStructure;
                    winterFlowProcessorListener.WinterFlowRouterStructure = null;
                    winterFlowProcessorListener.WinterFlowHookDataSource = winterFlowHookInheritance;
                }
                winterFlowEventEmitterOrchestration.getClass();
                return;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowFrameworkXML winterFlowFrameworkXML = (WinterFlowFrameworkXML) this.WinterFlowTransactionManagerStrategy;
                WinterFlowHookInheritance winterFlowHookInheritance2 = (WinterFlowHookInheritance) this.WinterFlowUnitTestResponse;
                synchronized (winterFlowFrameworkXML) {
                    try {
                        if (winterFlowFrameworkXML.WinterFlowHookDataSource == null) {
                            winterFlowFrameworkXML.WinterFlowRouterStructure.add(winterFlowHookInheritance2);
                        } else {
                            winterFlowFrameworkXML.WinterFlowHookDataSource.add(winterFlowHookInheritance2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowProxyTool winterFlowProxyTool = (WinterFlowProxyTool) this.WinterFlowTransactionManagerStrategy;
                Runnable runnable = (Runnable) this.WinterFlowUnitTestResponse;
                Process.setThreadPriority(winterFlowProxyTool.WinterFlowCacheManagerAgent);
                StrictMode.ThreadPolicy threadPolicy = winterFlowProxyTool.WinterFlowArrayNetwork;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                Callable callable = (Callable) this.WinterFlowTransactionManagerStrategy;
                WinterFlowJSONDecorator winterFlowJSONDecorator = (WinterFlowJSONDecorator) this.WinterFlowUnitTestResponse;
                try {
                    Object call = callable.call();
                    WinterFlowGatewayStructure winterFlowGatewayStructure = (WinterFlowGatewayStructure) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy;
                    if (call == null) {
                        call = WinterFlowThreadHelper.WinterFlowTransactionAgent;
                    }
                    if (WinterFlowThreadHelper.WinterFlowResponseEngine.WinterFlowBatchUI(winterFlowGatewayStructure, null, call)) {
                        WinterFlowThreadHelper.WinterFlowCacheManagerAgent(winterFlowGatewayStructure);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    winterFlowJSONDecorator.WinterFlowVariableBandwidth(e);
                    return;
                }
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.WinterFlowTransactionManagerStrategy;
                WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) this.WinterFlowUnitTestResponse;
                try {
                    winterFlowArrayEngine.WinterFlowRouterStructure(firebaseMessaging.WinterFlowRouterStructure());
                    return;
                } catch (Exception e2) {
                    winterFlowArrayEngine.WinterFlowRouterStructure.WinterFlowResponseEngine(e2);
                    return;
                }
            case 9:
                WinterFlowControllerXML winterFlowControllerXML = (WinterFlowControllerXML) this.WinterFlowTransactionManagerStrategy;
                WinterFlowArrayEngine winterFlowArrayEngine2 = (WinterFlowArrayEngine) this.WinterFlowUnitTestResponse;
                try {
                    winterFlowArrayEngine2.WinterFlowRouterStructure(winterFlowControllerXML.WinterFlowHookDataSource());
                    return;
                } catch (Exception e3) {
                    winterFlowArrayEngine2.WinterFlowRouterStructure.WinterFlowResponseEngine(e3);
                    return;
                }
            case 10:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.WinterFlowTransactionManagerStrategy;
                JobParameters jobParameters = (JobParameters) this.WinterFlowUnitTestResponse;
                int i2 = JobInfoSchedulerService.WinterFlowVariableVersionControl;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 11:
                Runnable runnable2 = (Runnable) this.WinterFlowTransactionManagerStrategy;
                WinterFlowWorkerStructure winterFlowWorkerStructure = (WinterFlowWorkerStructure) this.WinterFlowUnitTestResponse;
                try {
                    runnable2.run();
                    return;
                } finally {
                    winterFlowWorkerStructure.WinterFlowRouterStructure();
                }
            default:
                WinterFlowAlgorithmSyntax winterFlowAlgorithmSyntax = (WinterFlowAlgorithmSyntax) this.WinterFlowTransactionManagerStrategy;
                WinterFlowDatabaseUtility winterFlowDatabaseUtility = (WinterFlowDatabaseUtility) this.WinterFlowUnitTestResponse;
                if (winterFlowAlgorithmSyntax.WinterFlowUnitTestResponse) {
                    return;
                }
                winterFlowAlgorithmSyntax.WinterFlowRouterRouter = winterFlowDatabaseUtility;
                winterFlowDatabaseUtility.WinterFlowRouterStructure(winterFlowAlgorithmSyntax);
                return;
        }
    }
}
