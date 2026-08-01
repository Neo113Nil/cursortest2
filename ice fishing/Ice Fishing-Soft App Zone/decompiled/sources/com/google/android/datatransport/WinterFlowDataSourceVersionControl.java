package com.google.android.datatransport;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDataSourceVersionControl implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDataSourceVersionControl(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        int i = 7;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowCacheRuntime.WinterFlowStrategyTool((WinterFlowAdapterResponse) this.WinterFlowTransactionManagerStrategy, null, new WinterFlowWorkerJSON((WinterFlowHandlerInvoker) this.WinterFlowUnitTestResponse, null), 1);
                return new WinterFlowObjectProcessor(1);
            case 1:
                WinterFlowCacheManagerMicroservice winterFlowCacheManagerMicroservice = (WinterFlowCacheManagerMicroservice) this.WinterFlowUnitTestResponse;
                winterFlowCacheManagerMicroservice.WinterFlowSoftwareProtocol(new WinterFlowClassStrategy(new WinterFlowDataSourceVersionControl(4, Thread.currentThread(), (WinterFlowAdapterResponse) this.WinterFlowTransactionManagerStrategy, false)));
                return new WinterFlowBandwidthSoftware(7, winterFlowCacheManagerMicroservice);
            case 2:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) this.WinterFlowUnitTestResponse;
                WinterFlowHandlerInvoker winterFlowHandlerInvoker2 = (WinterFlowHandlerInvoker) this.WinterFlowTransactionManagerStrategy;
                winterFlowHandlerInvoker.WinterFlowResponseEngine.add(winterFlowHandlerInvoker2);
                return new WinterFlowIDERepository(5, winterFlowHandlerInvoker, winterFlowHandlerInvoker2);
            case 3:
                return new WinterFlowIDERepository(6, (WinterFlowHandlerInvoker) this.WinterFlowUnitTestResponse, (WinterFlowListenerSyntax) this.WinterFlowTransactionManagerStrategy);
            case 4:
                Object obj2 = this.WinterFlowUnitTestResponse;
                WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowTransactionManagerStrategy;
                WinterFlowObjectUI winterFlowObjectUI = (WinterFlowObjectUI) obj;
                if (obj2 == Thread.currentThread()) {
                    winterFlowObjectUI.WinterFlowRouterStructure();
                } else {
                    WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowAdapterResponse, null, new WinterFlowQueueLayer(winterFlowObjectUI, winterFlowTransactionManagerLayer, 2), 3);
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = (WinterFlowCacheManagerVersionControl) this.WinterFlowTransactionManagerStrategy;
                WinterFlowMapperParser winterFlowMapperParser = (WinterFlowMapperParser) this.WinterFlowUnitTestResponse;
                WinterFlowControllerInvoker winterFlowControllerInvoker = (WinterFlowControllerInvoker) obj;
                synchronized (((WinterFlowAlgorithmDebug) winterFlowCacheManagerVersionControl.WinterFlowTransactionManagerStrategy)) {
                    try {
                        boolean WinterFlowHookDataSource = winterFlowControllerInvoker.WinterFlowHookDataSource();
                        WinterFlowThreadNode winterFlowThreadNode = (WinterFlowThreadNode) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse;
                        if (WinterFlowHookDataSource) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowJSONRepository winterFlowJSONRepository = (WinterFlowJSONRepository) this.WinterFlowTransactionManagerStrategy;
                WinterFlowObjectSession winterFlowObjectSession = (WinterFlowObjectSession) this.WinterFlowUnitTestResponse;
                ((Long) obj).getClass();
                float f = winterFlowJSONRepository.WinterFlowVariableVersionControl;
                winterFlowJSONRepository.WinterFlowVariableVersionControl = 0.0f;
                winterFlowObjectSession.WinterFlowUnitTestResponse(Float.valueOf(f));
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            default:
                WinterFlowBandwidthProcess winterFlowBandwidthProcess = (WinterFlowBandwidthProcess) this.WinterFlowTransactionManagerStrategy;
                View view = (View) this.WinterFlowUnitTestResponse;
                WinterFlowResponseOrchestration winterFlowResponseOrchestration = winterFlowBandwidthProcess.WinterFlowRouterAdapter;
                if (winterFlowBandwidthProcess.WinterFlowBatchUI == 0) {
                    int i2 = WinterFlowIDEComponent.WinterFlowRouterStructure;
                    WinterFlowIDEEvent.WinterFlowHookDataSource(view, winterFlowResponseOrchestration);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(winterFlowResponseOrchestration);
                    WinterFlowValidatorEngine.WinterFlowRouterStructure(view, winterFlowResponseOrchestration);
                }
                winterFlowBandwidthProcess.WinterFlowBatchUI++;
                return new WinterFlowIDERepository(i, winterFlowBandwidthProcess, view);
        }
    }

    public /* synthetic */ WinterFlowDataSourceVersionControl(int i, Object obj, Object obj2, boolean z) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
    }
}
