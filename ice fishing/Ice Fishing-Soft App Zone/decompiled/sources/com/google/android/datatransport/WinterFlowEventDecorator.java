package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventDecorator extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowEventDecorator(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowTransactionAgent = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEventDecorator winterFlowEventDecorator = new WinterFlowEventDecorator((WinterFlowConfigurationSubsystem) obj2, winterFlowTransactionManagerLayer, 0);
                winterFlowEventDecorator.WinterFlowResponseEngine = obj;
                return winterFlowEventDecorator;
            case 1:
                WinterFlowEventDecorator winterFlowEventDecorator2 = new WinterFlowEventDecorator((WinterFlowValidatorBandwidth) obj2, winterFlowTransactionManagerLayer, 1);
                winterFlowEventDecorator2.WinterFlowResponseEngine = obj;
                return winterFlowEventDecorator2;
            case 2:
                WinterFlowEventDecorator winterFlowEventDecorator3 = new WinterFlowEventDecorator((WinterFlowOrchestrationBandwidth) obj2, winterFlowTransactionManagerLayer, 2);
                winterFlowEventDecorator3.WinterFlowResponseEngine = obj;
                return winterFlowEventDecorator3;
            default:
                WinterFlowEventDecorator winterFlowEventDecorator4 = new WinterFlowEventDecorator((Set) obj2, winterFlowTransactionManagerLayer, 3);
                winterFlowEventDecorator4.WinterFlowResponseEngine = obj;
                return winterFlowEventDecorator4;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = (List) this.WinterFlowResponseEngine;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                ((WinterFlowConfigurationSubsystem) obj2).WinterFlowVariableVersionControl.WinterFlowResponseEngine(list);
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowValidatorBandwidth winterFlowValidatorBandwidth = (WinterFlowValidatorBandwidth) this.WinterFlowResponseEngine;
                return Boolean.valueOf((winterFlowValidatorBandwidth instanceof WinterFlowDebugMechanism) && winterFlowValidatorBandwidth.WinterFlowRouterStructure <= ((WinterFlowValidatorBandwidth) obj2).WinterFlowRouterStructure);
            case 2:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowAdapterResponse winterFlowAdapterResponse = (WinterFlowAdapterResponse) this.WinterFlowResponseEngine;
                WinterFlowOrchestrationBandwidth winterFlowOrchestrationBandwidth = (WinterFlowOrchestrationBandwidth) obj2;
                WinterFlowDatabaseUtility winterFlowDatabaseUtility = winterFlowOrchestrationBandwidth.WinterFlowVariableVersionControl;
                if (winterFlowDatabaseUtility.WinterFlowSyntax.compareTo(WinterFlowDatabaseProtocol.WinterFlowTransactionManagerStrategy) >= 0) {
                    winterFlowDatabaseUtility.WinterFlowRouterStructure(winterFlowOrchestrationBandwidth);
                } else {
                    WinterFlowInvokerComponent.WinterFlowThreadListener(winterFlowAdapterResponse.WinterFlowRouterRouter(), null);
                }
                return winterFlowAlgorithmSession;
            default:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                Set keySet = ((WinterFlowDataSourceSerializer) this.WinterFlowResponseEngine).WinterFlowRouterStructure().keySet();
                ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((WinterFlowNetworkFramework) it.next()).WinterFlowRouterStructure);
                }
                Set set = (Set) obj2;
                if (set != WinterFlowExceptionMechanism.WinterFlowRouterStructure) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it2 = set2.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    r2 = false;
                }
                return Boolean.valueOf(r2);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowEventDecorator) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (List) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return winterFlowAlgorithmSession;
            case 1:
                return ((WinterFlowEventDecorator) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowValidatorBandwidth) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            case 2:
                ((WinterFlowEventDecorator) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                return winterFlowAlgorithmSession;
            default:
                return ((WinterFlowEventDecorator) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowDataSourceSerializer) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
