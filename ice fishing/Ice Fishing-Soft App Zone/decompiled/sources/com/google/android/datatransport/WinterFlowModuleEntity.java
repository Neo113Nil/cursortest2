package com.google.android.datatransport;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowModuleEntity extends WinterFlowNodeInheritance implements WinterFlowObjectSession {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowModuleEntity(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(1, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowTransactionAgent;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowTransactionOrchestration winterFlowTransactionOrchestration = (WinterFlowTransactionOrchestration) obj2;
                    this.WinterFlowResponseEngine = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) winterFlowTransactionOrchestration.WinterFlowVariableVersionControl.getValue()).edit();
                    LinkedHashSet linkedHashSet = winterFlowTransactionOrchestration.WinterFlowTransactionManagerStrategy;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            edit.remove((String) it.next());
                        }
                    }
                    if (!edit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) winterFlowTransactionOrchestration.WinterFlowVariableVersionControl.getValue()).getAll().isEmpty()) {
                        WinterFlowEventStructure.WinterFlowRouterStructure(winterFlowTransactionOrchestration.WinterFlowCacheManagerAgent, winterFlowTransactionOrchestration.WinterFlowArrayNetwork);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (winterFlowAlgorithmSession == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i2 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                return winterFlowAlgorithmSession;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    this.WinterFlowResponseEngine = 1;
                    Object WinterFlowUnitTestResponse = ((WinterFlowServiceProviderUtility) obj2).WinterFlowUnitTestResponse(this);
                    return WinterFlowUnitTestResponse == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowUnitTestResponse;
                }
                if (i3 == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return obj;
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowTransactionAgent;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowModuleEntity((WinterFlowTransactionOrchestration) obj2, winterFlowTransactionManagerLayer, 0).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return new WinterFlowModuleEntity((WinterFlowServiceProviderUtility) obj2, winterFlowTransactionManagerLayer, 1).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
