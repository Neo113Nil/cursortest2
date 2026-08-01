package com.google.android.datatransport;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowProcessorStructure implements WinterFlowObjectSession {
    public final /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ Serializable WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowProcessorStructure(Object obj, Object obj2, Serializable serializable, Object obj3, Object obj4, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowRouterRouter = serializable;
        this.WinterFlowSyntax = obj3;
        this.WinterFlowResponseEngine = obj4;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        List list;
        int i = this.WinterFlowVariableVersionControl;
        Object obj2 = this.WinterFlowResponseEngine;
        Object obj3 = this.WinterFlowSyntax;
        Serializable serializable = this.WinterFlowRouterRouter;
        Object obj4 = this.WinterFlowUnitTestResponse;
        Object obj5 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowBackendPackage winterFlowBackendPackage = (WinterFlowBackendPackage) obj5;
                WinterFlowResolverProcess winterFlowResolverProcess = (WinterFlowResolverProcess) obj4;
                String str = (String) serializable;
                WinterFlowMapperProvider winterFlowMapperProvider = (WinterFlowMapperProvider) obj3;
                WinterFlowExceptionBandwidth winterFlowExceptionBandwidth = new WinterFlowExceptionBandwidth(0, (WinterFlowThreadPoolGateway) obj2);
                Bundle bundle = winterFlowResolverProcess.WinterFlowUnitTestResponse;
                str.getClass();
                winterFlowResolverProcess.WinterFlowCacheManagerAgent(str);
                winterFlowResolverProcess.WinterFlowVariableVersionControl.put(str, new WinterFlowRefactoringAPI(winterFlowExceptionBandwidth, winterFlowMapperProvider));
                LinkedHashMap linkedHashMap = winterFlowResolverProcess.WinterFlowTransactionManagerStrategy;
                if (linkedHashMap.containsKey(str)) {
                    Object obj6 = linkedHashMap.get(str);
                    linkedHashMap.remove(str);
                    winterFlowExceptionBandwidth.WinterFlowTransactionManagerStrategy(obj6);
                }
                WinterFlowScriptVersion winterFlowScriptVersion = (WinterFlowScriptVersion) WinterFlowServerManager.WinterFlowBatchUI(bundle, str);
                if (winterFlowScriptVersion != null) {
                    bundle.remove(str);
                    winterFlowExceptionBandwidth.WinterFlowTransactionManagerStrategy(winterFlowMapperProvider.WinterFlowEventEmitterController(winterFlowScriptVersion.WinterFlowTransactionManagerStrategy, winterFlowScriptVersion.WinterFlowVariableVersionControl));
                }
                winterFlowBackendPackage.WinterFlowRouterStructure = new WinterFlowControllerModule(winterFlowResolverProcess, str, winterFlowMapperProvider, 1);
                return new WinterFlowBandwidthSoftware(0, winterFlowBackendPackage);
            case 1:
                WinterFlowRouterOrchestration winterFlowRouterOrchestration = (WinterFlowRouterOrchestration) obj5;
                WinterFlowBandwidthCache winterFlowBandwidthCache = (WinterFlowBandwidthCache) obj4;
                WinterFlowAdapterInheritance winterFlowAdapterInheritance = (WinterFlowAdapterInheritance) serializable;
                WinterFlowTransactionManagerService winterFlowTransactionManagerService = (WinterFlowTransactionManagerService) obj3;
                WinterFlowInterfaceProcessor winterFlowInterfaceProcessor = (WinterFlowInterfaceProcessor) obj2;
                float floatValue = ((Float) obj).floatValue();
                WinterFlowIDEVariable WinterFlowUnitTestResponse = WinterFlowRouterOrchestration.WinterFlowUnitTestResponse(winterFlowRouterOrchestration.WinterFlowUnitTestResponse);
                if (WinterFlowUnitTestResponse != null) {
                    WinterFlowAlgorithmArray winterFlowAlgorithmArray = winterFlowRouterOrchestration.WinterFlowVariableVersionControl;
                    long j = WinterFlowUnitTestResponse.WinterFlowHookDataSource;
                    long j2 = WinterFlowUnitTestResponse.WinterFlowRouterStructure;
                    ((WinterFlowConcurrencyProxy) winterFlowAlgorithmArray.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((WinterFlowConcurrencyProxy) winterFlowAlgorithmArray.WinterFlowUnitTestResponse).WinterFlowRouterStructure(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    WinterFlowIDEVariable WinterFlowRouterStructure = ((WinterFlowIDEVariable) winterFlowBandwidthCache.WinterFlowVariableVersionControl).WinterFlowRouterStructure(WinterFlowUnitTestResponse);
                    winterFlowBandwidthCache.WinterFlowVariableVersionControl = WinterFlowRouterStructure;
                    winterFlowAdapterInheritance.WinterFlowVariableVersionControl = winterFlowTransactionManagerService.WinterFlowSyntax(winterFlowTransactionManagerService.WinterFlowVariableVersionControl(WinterFlowRouterStructure.WinterFlowRouterStructure));
                    winterFlowInterfaceProcessor.WinterFlowVariableVersionControl = !WinterFlowCloudStack.WinterFlowCacheManagerListener(r14 - floatValue);
                }
                return Boolean.valueOf(WinterFlowUnitTestResponse != null);
            default:
                ArrayList arrayList = (ArrayList) obj4;
                WinterFlowTransactionInterface winterFlowTransactionInterface = (WinterFlowTransactionInterface) serializable;
                WinterFlowProcessorProtocol winterFlowProcessorProtocol = (WinterFlowProcessorProtocol) obj3;
                Bundle bundle2 = (Bundle) obj2;
                WinterFlowLibrarySessionManager winterFlowLibrarySessionManager = (WinterFlowLibrarySessionManager) obj;
                winterFlowLibrarySessionManager.getClass();
                ((WinterFlowInterfaceProcessor) obj5).WinterFlowVariableVersionControl = true;
                int indexOf = arrayList.indexOf(winterFlowLibrarySessionManager);
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    list = arrayList.subList(winterFlowTransactionInterface.WinterFlowVariableVersionControl, i2);
                    winterFlowTransactionInterface.WinterFlowVariableVersionControl = i2;
                } else {
                    list = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
                }
                winterFlowProcessorProtocol.WinterFlowRouterStructure(winterFlowLibrarySessionManager.WinterFlowTransactionManagerStrategy, bundle2, winterFlowLibrarySessionManager, list);
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        }
    }
}
