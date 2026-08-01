package com.google.android.datatransport;

import android.database.SQLException;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDatabaseSchemaAgent extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public int WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowGatewaySession WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowDatabaseSchemaAgent(WinterFlowGatewaySession winterFlowGatewaySession, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowServerProtocol = winterFlowGatewaySession;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowGatewaySession winterFlowGatewaySession = this.WinterFlowServerProtocol;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDatabaseSchemaAgent winterFlowDatabaseSchemaAgent = new WinterFlowDatabaseSchemaAgent(winterFlowGatewaySession, winterFlowTransactionManagerLayer, 0);
                winterFlowDatabaseSchemaAgent.WinterFlowTransactionAgent = obj;
                return winterFlowDatabaseSchemaAgent;
            default:
                WinterFlowDatabaseSchemaAgent winterFlowDatabaseSchemaAgent2 = new WinterFlowDatabaseSchemaAgent(winterFlowGatewaySession, winterFlowTransactionManagerLayer, 1);
                winterFlowDatabaseSchemaAgent2.WinterFlowTransactionAgent = obj;
                return winterFlowDatabaseSchemaAgent2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        WinterFlowRequestProvider winterFlowRequestProvider;
        int i = this.WinterFlowSyntax;
        WinterFlowGatewaySession winterFlowGatewaySession = this.WinterFlowServerProtocol;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = this.WinterFlowResponseEngine;
                if (i2 != 0) {
                    if (i2 == 1) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowDatabaseSchemaModule winterFlowDatabaseSchemaModule = (WinterFlowDatabaseSchemaModule) this.WinterFlowTransactionAgent;
                this.WinterFlowResponseEngine = 1;
                Object WinterFlowRouterStructure = winterFlowGatewaySession.WinterFlowRouterStructure(winterFlowDatabaseSchemaModule, this);
                return WinterFlowRouterStructure == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowRouterStructure;
            default:
                int i3 = this.WinterFlowResponseEngine;
                try {
                    if (i3 == 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowRequestProvider = (WinterFlowRequestProvider) this.WinterFlowTransactionAgent;
                        this.WinterFlowTransactionAgent = winterFlowRequestProvider;
                        this.WinterFlowResponseEngine = 1;
                        obj = winterFlowRequestProvider.WinterFlowArrayNetwork(this);
                        if (obj == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                                return (Set) obj;
                            }
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        winterFlowRequestProvider = (WinterFlowRequestProvider) this.WinterFlowTransactionAgent;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        WinterFlowAdapter winterFlowAdapter = WinterFlowAdapter.WinterFlowTransactionManagerStrategy;
                        WinterFlowDatabaseSchemaAgent winterFlowDatabaseSchemaAgent = new WinterFlowDatabaseSchemaAgent(winterFlowGatewaySession, winterFlowTransactionManagerLayer, 0);
                        this.WinterFlowTransactionAgent = null;
                        this.WinterFlowResponseEngine = 2;
                        obj = winterFlowRequestProvider.WinterFlowCacheManagerAgent(winterFlowAdapter, winterFlowDatabaseSchemaAgent, this);
                        if (obj == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        return (Set) obj;
                    }
                } catch (SQLException unused) {
                }
                return WinterFlowCacheTool.WinterFlowVariableVersionControl;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowDatabaseSchemaAgent) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowDatabaseSchemaModule) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
            default:
                return ((WinterFlowDatabaseSchemaAgent) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowRequestProvider) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
        }
    }
}
