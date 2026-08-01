package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerModule extends WinterFlowCacheRuntime {
    public final /* synthetic */ WinterFlowResolverProcess WinterFlowConcurrencyThread;
    public final /* synthetic */ int WinterFlowOrchestrationSubsystem;
    public final /* synthetic */ String WinterFlowSingletonPlatform;
    public final /* synthetic */ WinterFlowQuerySyntax WinterFlowVariableBandwidth;

    public /* synthetic */ WinterFlowControllerModule(WinterFlowResolverProcess winterFlowResolverProcess, String str, WinterFlowQuerySyntax winterFlowQuerySyntax, int i) {
        this.WinterFlowOrchestrationSubsystem = i;
        this.WinterFlowConcurrencyThread = winterFlowResolverProcess;
        this.WinterFlowSingletonPlatform = str;
        this.WinterFlowVariableBandwidth = winterFlowQuerySyntax;
    }

    public final void WinterFlowSessionManagerInterface(String str) {
        int i = this.WinterFlowOrchestrationSubsystem;
        WinterFlowQuerySyntax winterFlowQuerySyntax = this.WinterFlowVariableBandwidth;
        String str2 = this.WinterFlowSingletonPlatform;
        WinterFlowResolverProcess winterFlowResolverProcess = this.WinterFlowConcurrencyThread;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                LinkedHashMap linkedHashMap = winterFlowResolverProcess.WinterFlowHookDataSource;
                ArrayList arrayList = winterFlowResolverProcess.WinterFlowArrayNetwork;
                Object obj = linkedHashMap.get(str2);
                if (obj == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowTransactionAgent("Attempting to launch an unregistered ActivityResultLauncher with contract ", winterFlowQuerySyntax, " and input ", str, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue = ((Number) obj).intValue();
                arrayList.add(str2);
                try {
                    winterFlowResolverProcess.WinterFlowHookDataSource(intValue, winterFlowQuerySyntax, str);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str2);
                    throw e;
                }
            default:
                LinkedHashMap linkedHashMap2 = winterFlowResolverProcess.WinterFlowHookDataSource;
                ArrayList arrayList2 = winterFlowResolverProcess.WinterFlowArrayNetwork;
                Object obj2 = linkedHashMap2.get(str2);
                WinterFlowMapperProvider winterFlowMapperProvider = (WinterFlowMapperProvider) winterFlowQuerySyntax;
                if (obj2 == null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowTransactionAgent("Attempting to launch an unregistered ActivityResultLauncher with contract ", winterFlowMapperProvider, " and input ", str, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj2).intValue();
                arrayList2.add(str2);
                try {
                    winterFlowResolverProcess.WinterFlowHookDataSource(intValue2, winterFlowMapperProvider, str);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }
}
