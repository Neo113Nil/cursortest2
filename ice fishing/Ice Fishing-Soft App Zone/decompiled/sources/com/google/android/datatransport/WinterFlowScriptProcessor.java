package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptProcessor implements WinterFlowConcurrencyParser {
    public final /* synthetic */ WinterFlowRequestUtility WinterFlowRouterRouter;
    public long WinterFlowTransactionManagerStrategy = 9223372034707292159L;
    public long WinterFlowUnitTestResponse = 0;
    public boolean WinterFlowVariableVersionControl;

    public WinterFlowScriptProcessor(WinterFlowRequestUtility winterFlowRequestUtility) {
        this.WinterFlowRouterRouter = winterFlowRequestUtility;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowHookDataSource() {
        return this.WinterFlowRouterRouter.WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyParser
    public final float WinterFlowRouterRouter() {
        return this.WinterFlowRouterRouter.WinterFlowRouterRouter();
    }

    public final void WinterFlowRouterStructure(WinterFlowWorkerInvoker winterFlowWorkerInvoker, float f) {
        WinterFlowRequestUtility winterFlowRequestUtility = this.WinterFlowRouterRouter;
        WinterFlowListenerPlatform winterFlowListenerPlatform = winterFlowRequestUtility.WinterFlowConcurrencyThread;
        if (winterFlowListenerPlatform == null) {
            winterFlowListenerPlatform = new WinterFlowListenerPlatform();
            winterFlowRequestUtility.WinterFlowConcurrencyThread = winterFlowListenerPlatform;
        }
        int WinterFlowFrameworkTransaction = WinterFlowProtocolPipeline.WinterFlowFrameworkTransaction((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform.WinterFlowHookDataSource, winterFlowWorkerInvoker);
        if (WinterFlowFrameworkTransaction >= 0) {
            float[] fArr = (float[]) winterFlowListenerPlatform.WinterFlowCacheManagerAgent;
            if (fArr[WinterFlowFrameworkTransaction] != f) {
                fArr[WinterFlowFrameworkTransaction] = f;
                ((byte[]) winterFlowListenerPlatform.WinterFlowArrayNetwork)[WinterFlowFrameworkTransaction] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) winterFlowListenerPlatform.WinterFlowArrayNetwork;
                if (bArr[WinterFlowFrameworkTransaction] == 2) {
                    bArr[WinterFlowFrameworkTransaction] = 0;
                    return;
                }
                return;
            }
        }
        int i = winterFlowListenerPlatform.WinterFlowRouterStructure;
        WinterFlowWorkerInvoker[] winterFlowWorkerInvokerArr = (WinterFlowWorkerInvoker[]) winterFlowListenerPlatform.WinterFlowHookDataSource;
        if (i == winterFlowWorkerInvokerArr.length) {
            int i2 = i * 2;
            winterFlowListenerPlatform.WinterFlowHookDataSource = (WinterFlowWorkerInvoker[]) Arrays.copyOf(winterFlowWorkerInvokerArr, i2);
            winterFlowListenerPlatform.WinterFlowCacheManagerAgent = Arrays.copyOf((float[]) winterFlowListenerPlatform.WinterFlowCacheManagerAgent, i2);
            winterFlowListenerPlatform.WinterFlowArrayNetwork = Arrays.copyOf((byte[]) winterFlowListenerPlatform.WinterFlowArrayNetwork, i2);
        }
        ((WinterFlowWorkerInvoker[]) winterFlowListenerPlatform.WinterFlowHookDataSource)[i] = winterFlowWorkerInvoker;
        ((byte[]) winterFlowListenerPlatform.WinterFlowArrayNetwork)[i] = 3;
        ((float[]) winterFlowListenerPlatform.WinterFlowCacheManagerAgent)[i] = f;
        winterFlowListenerPlatform.WinterFlowRouterStructure++;
    }
}
