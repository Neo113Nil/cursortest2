package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.ColdActivity;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowBatchConsumer implements WinterFlowEventEvent {
    public final /* synthetic */ ColdActivity WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowBatchConsumer(ColdActivity coldActivity, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = coldActivity;
    }

    @Override // com.google.android.datatransport.WinterFlowEventEvent
    public final Object WinterFlowVariableVersionControl(Object obj, Object obj2) {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        ColdActivity coldActivity = this.WinterFlowTransactionManagerStrategy;
        int i2 = 0;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = ColdActivity.WinterFlowUserManagerUserManager;
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(1 & intValue, (intValue & 3) != 2)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    break;
                } else {
                    WinterFlowMicroserviceMechanism winterFlowMicroserviceMechanism = WinterFlowCacheRuntime.WinterFlowThreadListener;
                    WeakHashMap weakHashMap = WinterFlowBandwidthProcess.WinterFlowSerializerStructure;
                    WinterFlowDecoratorRouter.WinterFlowRouterStructure(winterFlowMicroserviceMechanism, null, null, null, null, 0, 0L, 0L, new WinterFlowCompilerThread(new WinterFlowCompilerThread(new WinterFlowCompilerThread(WinterFlowDecoratorUI.WinterFlowBandwidthObject(winterFlowResolverLibrary).WinterFlowVariableVersionControl, WinterFlowDecoratorUI.WinterFlowBandwidthObject(winterFlowResolverLibrary).WinterFlowTransactionManagerStrategy), WinterFlowDecoratorUI.WinterFlowBandwidthObject(winterFlowResolverLibrary).WinterFlowCacheManagerAgent), WinterFlowDecoratorUI.WinterFlowBandwidthObject(winterFlowResolverLibrary).WinterFlowHookDataSource), WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(-1383429672, new WinterFlowUnitTestUtility(0, coldActivity), winterFlowResolverLibrary), winterFlowResolverLibrary, 805306374, 254);
                    break;
                }
            default:
                WinterFlowResolverLibrary winterFlowResolverLibrary2 = (WinterFlowResolverLibrary) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = ColdActivity.WinterFlowUserManagerUserManager;
                if (!winterFlowResolverLibrary2.WinterFlowFrontendBackend(1 & intValue2, (intValue2 & 3) != 2)) {
                    winterFlowResolverLibrary2.WinterFlowQueueService();
                    break;
                } else {
                    WinterFlowFrameworkDeployment.WinterFlowRouterStructure(false, false, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(-693591097, new WinterFlowBatchConsumer(coldActivity, i2), winterFlowResolverLibrary2), winterFlowResolverLibrary2, 384);
                    break;
                }
        }
        return winterFlowAlgorithmSession;
    }
}
