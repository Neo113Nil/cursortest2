package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorSessionManager implements WinterFlowVersionControlUtility {
    public final /* synthetic */ int WinterFlowRouterStructure;
    public static final WinterFlowProcessorSessionManager WinterFlowHookDataSource = new WinterFlowProcessorSessionManager(0);
    public static final WinterFlowProcessorSessionManager WinterFlowCacheManagerAgent = new WinterFlowProcessorSessionManager(1);

    public /* synthetic */ WinterFlowProcessorSessionManager(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionControlUtility
    public final WinterFlowTestingCloud WinterFlowRouterStructure(long j, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float WinterFlowUserManagerUserManager = winterFlowConcurrencyParser.WinterFlowUserManagerUserManager(30.0f);
                return new WinterFlowSchedulerStack(new WinterFlowVersionParser(0.0f, -WinterFlowUserManagerUserManager, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + WinterFlowUserManagerUserManager));
            case 1:
                float WinterFlowUserManagerUserManager2 = winterFlowConcurrencyParser.WinterFlowUserManagerUserManager(30.0f);
                return new WinterFlowSchedulerStack(new WinterFlowVersionParser(-WinterFlowUserManagerUserManager2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + WinterFlowUserManagerUserManager2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new WinterFlowSchedulerStack(WinterFlowHookProcessor.WinterFlowHookDataSource(0L, j));
        }
    }

    public String toString() {
        switch (this.WinterFlowRouterStructure) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
