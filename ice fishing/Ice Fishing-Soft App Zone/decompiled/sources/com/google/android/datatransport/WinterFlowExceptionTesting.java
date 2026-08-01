package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionTesting extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowEventEvent WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowExceptionTesting(WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowServerProtocol = winterFlowEventEvent;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowEventEvent winterFlowEventEvent = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowExceptionTesting winterFlowExceptionTesting = new WinterFlowExceptionTesting(winterFlowEventEvent, winterFlowTransactionManagerLayer, 0);
                winterFlowExceptionTesting.WinterFlowTransactionAgent = obj;
                return winterFlowExceptionTesting;
            default:
                WinterFlowExceptionTesting winterFlowExceptionTesting2 = new WinterFlowExceptionTesting(winterFlowEventEvent, winterFlowTransactionManagerLayer, 1);
                winterFlowExceptionTesting2.WinterFlowTransactionAgent = obj;
                return winterFlowExceptionTesting2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowEventEvent winterFlowEventEvent = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) this.WinterFlowTransactionAgent;
                    this.WinterFlowResponseEngine = 1;
                    obj = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowDataSourceSerializer, this);
                    if (obj == winterFlowListenerJava) {
                        return winterFlowListenerJava;
                    }
                } else {
                    if (i2 != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                }
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer2 = (WinterFlowDataSourceSerializer) obj;
                winterFlowDataSourceSerializer2.getClass();
                ((AtomicBoolean) winterFlowDataSourceSerializer2.WinterFlowHookDataSource.WinterFlowTransactionManagerStrategy).set(true);
                return winterFlowDataSourceSerializer2;
            default:
                int i3 = this.WinterFlowResponseEngine;
                if (i3 == 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowDataSourceSerializer winterFlowDataSourceSerializer3 = new WinterFlowDataSourceSerializer(new LinkedHashMap(((WinterFlowDataSourceSerializer) this.WinterFlowTransactionAgent).WinterFlowRouterStructure()), false);
                    this.WinterFlowTransactionAgent = winterFlowDataSourceSerializer3;
                    this.WinterFlowResponseEngine = 1;
                    return winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowDataSourceSerializer3, this) == winterFlowListenerJava ? winterFlowListenerJava : winterFlowDataSourceSerializer3;
                }
                if (i3 != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer4 = (WinterFlowDataSourceSerializer) this.WinterFlowTransactionAgent;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                return winterFlowDataSourceSerializer4;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) obj;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = (WinterFlowTransactionManagerLayer) obj2;
        switch (i) {
        }
        return ((WinterFlowExceptionTesting) WinterFlowServerProtocol(winterFlowTransactionManagerLayer, winterFlowDataSourceSerializer)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
    }
}
