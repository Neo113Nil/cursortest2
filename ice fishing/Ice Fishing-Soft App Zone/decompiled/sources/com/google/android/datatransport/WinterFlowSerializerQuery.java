package com.google.android.datatransport;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerQuery extends WinterFlowTransactionVariable {
    public WinterFlowNodeSerializer WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource = "SaveableStateHolder_BackStackEntryKey";

    public WinterFlowSerializerQuery(WinterFlowOrchestrationMapper winterFlowOrchestrationMapper) {
        Object obj;
        winterFlowOrchestrationMapper.getClass();
        WinterFlowRequestEngine winterFlowRequestEngine = winterFlowOrchestrationMapper.WinterFlowHookDataSource;
        LinkedHashMap linkedHashMap = (LinkedHashMap) winterFlowRequestEngine.WinterFlowVariableVersionControl;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) winterFlowRequestEngine.WinterFlowRouterRouter;
        try {
            WinterFlowHandlerPlatform winterFlowHandlerPlatform = (WinterFlowHandlerPlatform) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (winterFlowHandlerPlatform == null || (obj = winterFlowHandlerPlatform.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) winterFlowRequestEngine.WinterFlowUnitTestResponse).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.WinterFlowHookDataSource;
            str2.getClass();
            if (str != null) {
                ArrayList arrayList = WinterFlowSchedulerRuntime.WinterFlowRouterStructure;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(str)) {
                        }
                    }
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterAdapter("Can't put value with type ", str.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = WinterFlowSchedulerRuntime.WinterFlowRouterStructure;
            Object obj3 = winterFlowOrchestrationMapper.WinterFlowRouterStructure.get(str2);
            WinterFlowSyntaxConsumer winterFlowSyntaxConsumer = obj3 instanceof WinterFlowSyntaxConsumer ? (WinterFlowSyntaxConsumer) obj3 : null;
            if (winterFlowSyntaxConsumer != null) {
                WinterFlowMiddlewareService.WinterFlowServiceUtility().getClass();
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter(WinterFlowResolverBackend.WinterFlowResponseEngine("Cannot invoke ", "setValue", " on a background thread"));
                }
                winterFlowSyntaxConsumer.WinterFlowVariableVersionControl++;
                winterFlowSyntaxConsumer.WinterFlowCacheManagerAgent = str;
                if (winterFlowSyntaxConsumer.WinterFlowTransactionManagerStrategy) {
                    winterFlowSyntaxConsumer.WinterFlowUnitTestResponse = true;
                } else {
                    winterFlowSyntaxConsumer.WinterFlowTransactionManagerStrategy = true;
                    do {
                        winterFlowSyntaxConsumer.WinterFlowUnitTestResponse = false;
                        WinterFlowJSONSystem winterFlowJSONSystem = winterFlowSyntaxConsumer.WinterFlowHookDataSource;
                        winterFlowJSONSystem.getClass();
                        WinterFlowRendererPackage winterFlowRendererPackage = new WinterFlowRendererPackage(winterFlowJSONSystem);
                        winterFlowJSONSystem.WinterFlowVariableVersionControl.put(winterFlowRendererPackage, Boolean.FALSE);
                        while (winterFlowRendererPackage.hasNext()) {
                            winterFlowSyntaxConsumer.WinterFlowRouterStructure((WinterFlowInvokerMechanism) ((Map.Entry) winterFlowRendererPackage.next()).getValue());
                            if (winterFlowSyntaxConsumer.WinterFlowUnitTestResponse) {
                                break;
                            }
                        }
                    } while (winterFlowSyntaxConsumer.WinterFlowUnitTestResponse);
                    winterFlowSyntaxConsumer.WinterFlowTransactionManagerStrategy = false;
                }
            }
            winterFlowRequestEngine.WinterFlowThreadListener(str, str2);
        }
        this.WinterFlowCacheManagerAgent = str;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionVariable
    public final void WinterFlowArrayNetwork() {
        WinterFlowNodeSerializer winterFlowNodeSerializer = this.WinterFlowArrayNetwork;
        if (winterFlowNodeSerializer == null) {
            WinterFlowManagerRequest.WinterFlowCloudMicroservice("saveableStateHolderRef");
            throw null;
        }
        WinterFlowRefactoringServer winterFlowRefactoringServer = (WinterFlowRefactoringServer) ((WeakReference) winterFlowNodeSerializer.WinterFlowVariableVersionControl).get();
        if (winterFlowRefactoringServer != null) {
            winterFlowRefactoringServer.WinterFlowRouterStructure(this.WinterFlowCacheManagerAgent);
        }
        WinterFlowNodeSerializer winterFlowNodeSerializer2 = this.WinterFlowArrayNetwork;
        if (winterFlowNodeSerializer2 != null) {
            ((WeakReference) winterFlowNodeSerializer2.WinterFlowVariableVersionControl).clear();
        } else {
            WinterFlowManagerRequest.WinterFlowCloudMicroservice("saveableStateHolderRef");
            throw null;
        }
    }
}
