package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONUtility extends WinterFlowNodeInheritance implements WinterFlowEventEvent {
    public /* synthetic */ Object WinterFlowResponseEngine;
    public final /* synthetic */ Object WinterFlowServerProtocol;
    public final /* synthetic */ int WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowJSONUtility(Object obj, Object obj2, Object obj3, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, int i) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = obj;
        this.WinterFlowTransactionAgent = obj2;
        this.WinterFlowServerProtocol = obj3;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final WinterFlowTransactionManagerLayer WinterFlowServerProtocol(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, Object obj) {
        int i = this.WinterFlowSyntax;
        Object obj2 = this.WinterFlowServerProtocol;
        Object obj3 = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowJSONUtility((WinterFlowThreadPoolGateway) this.WinterFlowResponseEngine, (WinterFlowJavaSubsystem) obj3, (WinterFlowPackageResolver) obj2, winterFlowTransactionManagerLayer, 0);
            case 1:
                return new WinterFlowJSONUtility((WinterFlowConcurrencyParser) this.WinterFlowResponseEngine, (WinterFlowObjectLayer) obj3, (WinterFlowDecoratorAdapter) obj2, winterFlowTransactionManagerLayer, 1);
            default:
                WinterFlowJSONUtility winterFlowJSONUtility = new WinterFlowJSONUtility((WinterFlowNetworkFramework) obj3, (Long) obj2, winterFlowTransactionManagerLayer);
                winterFlowJSONUtility.WinterFlowResponseEngine = obj;
                return winterFlowJSONUtility;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowVersionLayer
    public final Object WinterFlowServiceUtility(Object obj) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowServerProtocol;
        Object obj3 = this.WinterFlowTransactionAgent;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowJavaSubsystem winterFlowJavaSubsystem = (WinterFlowJavaSubsystem) obj3;
                WinterFlowPackageResolver winterFlowPackageResolver = (WinterFlowPackageResolver) obj2;
                for (WinterFlowLibrarySessionManager winterFlowLibrarySessionManager : (Set) ((WinterFlowThreadPoolGateway) this.WinterFlowResponseEngine).getValue()) {
                    if (!((List) winterFlowJavaSubsystem.WinterFlowHookDataSource().WinterFlowVariableVersionControl.WinterFlowVariableVersionControl.getValue()).contains(winterFlowLibrarySessionManager) && !winterFlowPackageResolver.contains(winterFlowLibrarySessionManager)) {
                        winterFlowJavaSubsystem.WinterFlowHookDataSource().WinterFlowCacheManagerAgent(winterFlowLibrarySessionManager);
                    }
                }
                break;
            case 1:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowConcurrencyParser winterFlowConcurrencyParser = (WinterFlowConcurrencyParser) this.WinterFlowResponseEngine;
                WinterFlowObjectLayer winterFlowObjectLayer = (WinterFlowObjectLayer) obj3;
                WinterFlowDecoratorAdapter winterFlowDecoratorAdapter = (WinterFlowDecoratorAdapter) obj2;
                WinterFlowConcurrencyParser winterFlowConcurrencyParser2 = winterFlowDecoratorAdapter.WinterFlowRouterStructure;
                long j = winterFlowDecoratorAdapter.WinterFlowHookDataSource;
                winterFlowObjectLayer.WinterFlowUnitTestResponse(winterFlowConcurrencyParser.WinterFlowUserManagerUserManager(WinterFlowHandlerConsumer.WinterFlowArrayNetwork(j) ? winterFlowConcurrencyParser2.WinterFlowArrayFramework(WinterFlowHandlerConsumer.WinterFlowRouterRouter(j)) : Float.POSITIVE_INFINITY) - winterFlowConcurrencyParser.WinterFlowUserManagerUserManager(75.0f));
                break;
            default:
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                WinterFlowDataSourceSerializer winterFlowDataSourceSerializer = (WinterFlowDataSourceSerializer) this.WinterFlowResponseEngine;
                winterFlowDataSourceSerializer.getClass();
                winterFlowDataSourceSerializer.WinterFlowArrayNetwork((WinterFlowNetworkFramework) obj3, (Long) obj2);
                break;
        }
        return winterFlowAlgorithmSession;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowSyntax;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowJSONUtility) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
            case 1:
                ((WinterFlowJSONUtility) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowAdapterResponse) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
            default:
                ((WinterFlowJSONUtility) WinterFlowServerProtocol((WinterFlowTransactionManagerLayer) obj2, (WinterFlowDataSourceSerializer) obj)).WinterFlowServiceUtility(winterFlowAlgorithmSession);
                break;
        }
        return winterFlowAlgorithmSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowJSONUtility(WinterFlowNetworkFramework winterFlowNetworkFramework, Long l, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        super(2, winterFlowTransactionManagerLayer);
        this.WinterFlowSyntax = 2;
        this.WinterFlowTransactionAgent = winterFlowNetworkFramework;
        this.WinterFlowServerProtocol = l;
    }
}
