package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestModule extends WinterFlowDecoratorSessionManager {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;

    public /* synthetic */ WinterFlowRequestModule(int i, Object obj) {
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorSessionManager
    public final WinterFlowCacheManagerConfiguration WinterFlowCacheManagerAgent() {
        int i = this.WinterFlowTransactionManagerStrategy;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRequestUtility) obj).getLayoutDirection();
            default:
                return ((WinterFlowSyntaxTransactionManager) obj).getLayoutDirection();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowHookDataSource() {
        int i = this.WinterFlowTransactionManagerStrategy;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRequestUtility) obj).WinterFlowHookDataSource();
            default:
                return ((WinterFlowSyntaxTransactionManager) obj).getDensity().WinterFlowHookDataSource();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowRouterRouter() {
        int i = this.WinterFlowTransactionManagerStrategy;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRequestUtility) obj).WinterFlowRouterRouter();
            default:
                return ((WinterFlowSyntaxTransactionManager) obj).getDensity().WinterFlowRouterRouter();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorSessionManager
    public float WinterFlowRouterStructure(WinterFlowWorkerInvoker winterFlowWorkerInvoker) {
        float intBitsToFloat;
        int WinterFlowFrameworkTransaction;
        switch (this.WinterFlowTransactionManagerStrategy) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowEventEvent winterFlowEventEvent = winterFlowWorkerInvoker.WinterFlowRouterStructure;
                if (winterFlowEventEvent != null) {
                    return ((Number) winterFlowEventEvent.WinterFlowVariableVersionControl(this, Float.valueOf(Float.NaN))).floatValue();
                }
                WinterFlowRequestUtility winterFlowRequestUtility = (WinterFlowRequestUtility) this.WinterFlowUnitTestResponse;
                if (winterFlowRequestUtility.WinterFlowBandwidthObject) {
                    return Float.NaN;
                }
                WinterFlowRequestUtility winterFlowRequestUtility2 = winterFlowRequestUtility;
                while (true) {
                    WinterFlowListenerPlatform winterFlowListenerPlatform = winterFlowRequestUtility2.WinterFlowConcurrencyThread;
                    if (!Float.isNaN((winterFlowListenerPlatform == null || (WinterFlowFrameworkTransaction = WinterFlowProtocolPipeline.WinterFlowFrameworkTransaction((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform.WinterFlowHookDataSource, winterFlowWorkerInvoker)) < 0) ? Float.NaN : ((float[]) winterFlowListenerPlatform.WinterFlowCacheManagerAgent)[WinterFlowFrameworkTransaction])) {
                        winterFlowRequestUtility2.WinterFlowAPIFrontend(winterFlowRequestUtility.WinterFlowRefactoringThreadPool(), winterFlowWorkerInvoker);
                        WinterFlowAlgorithmHandler WinterFlowHookQuery = winterFlowRequestUtility2.WinterFlowHookQuery();
                        WinterFlowAlgorithmHandler WinterFlowHookQuery2 = winterFlowRequestUtility.WinterFlowHookQuery();
                        switch (winterFlowWorkerInvoker.WinterFlowHookDataSource) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                intBitsToFloat = Float.intBitsToFloat((int) (WinterFlowHookQuery2.WinterFlowConsumerUserManager(WinterFlowHookQuery, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (WinterFlowHookQuery.WinterFlowCacheManagerListener() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (WinterFlowHookQuery2.WinterFlowConsumerUserManager(WinterFlowHookQuery, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (WinterFlowHookQuery.WinterFlowCacheManagerListener() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    WinterFlowRequestUtility WinterFlowResolverListener = winterFlowRequestUtility2.WinterFlowResolverListener();
                    if (WinterFlowResolverListener == null) {
                        winterFlowRequestUtility2.WinterFlowAPIFrontend(winterFlowRequestUtility.WinterFlowRefactoringThreadPool(), winterFlowWorkerInvoker);
                        return Float.NaN;
                    }
                    winterFlowRequestUtility2 = WinterFlowResolverListener;
                }
                break;
            default:
                return super.WinterFlowRouterStructure(winterFlowWorkerInvoker);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorSessionManager
    public final int WinterFlowVariableVersionControl() {
        int i = this.WinterFlowTransactionManagerStrategy;
        Object obj = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowRequestUtility) obj).WinterFlowProxyStructure();
            default:
                return ((WinterFlowSyntaxTransactionManager) obj).getRoot().WinterFlowSoftwareEngine.WinterFlowOrchestrationSubsystem.WinterFlowVariableVersionControl;
        }
    }
}
