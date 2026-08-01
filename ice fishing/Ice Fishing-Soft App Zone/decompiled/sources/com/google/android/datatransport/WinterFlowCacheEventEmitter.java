package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheEventEmitter implements WinterFlowEventEvent {
    public final /* synthetic */ int WinterFlowVariableVersionControl;
    public static final WinterFlowCacheEventEmitter WinterFlowTransactionManagerStrategy = new WinterFlowCacheEventEmitter(0);
    public static final WinterFlowCacheEventEmitter WinterFlowUnitTestResponse = new WinterFlowCacheEventEmitter(1);
    public static final WinterFlowCacheEventEmitter WinterFlowRouterRouter = new WinterFlowCacheEventEmitter(2);
    public static final WinterFlowCacheEventEmitter WinterFlowSyntax = new WinterFlowCacheEventEmitter(3);
    public static final WinterFlowCacheEventEmitter WinterFlowResponseEngine = new WinterFlowCacheEventEmitter(4);

    public /* synthetic */ WinterFlowCacheEventEmitter(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 1:
                WinterFlowResolverLibrary winterFlowResolverLibrary2 = (WinterFlowResolverLibrary) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary2.WinterFlowFrontendBackend(intValue2 & 1, (intValue2 & 3) != 2)) {
                    winterFlowResolverLibrary2.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 2:
                WinterFlowResolverLibrary winterFlowResolverLibrary3 = (WinterFlowResolverLibrary) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary3.WinterFlowFrontendBackend(intValue3 & 1, (intValue3 & 3) != 2)) {
                    winterFlowResolverLibrary3.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            case 3:
                WinterFlowResolverLibrary winterFlowResolverLibrary4 = (WinterFlowResolverLibrary) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (!winterFlowResolverLibrary4.WinterFlowFrontendBackend(intValue4 & 1, (intValue4 & 3) != 2)) {
                    winterFlowResolverLibrary4.WinterFlowQueueService();
                }
                return winterFlowAlgorithmSession;
            default:
                long j = ((WinterFlowInheritanceSubsystem) obj2).WinterFlowRouterStructure;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(WinterFlowInvokerComponent.WinterFlowConfiguration(j));
        }
    }
}
