package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowJSONModule {
    public int WinterFlowArrayNetwork;
    public boolean WinterFlowCacheManagerAgent;
    public long WinterFlowHookDataSource;
    public WinterFlowSingletonNode WinterFlowRouterStructure;

    public WinterFlowJSONModule(long j, WinterFlowSingletonNode winterFlowSingletonNode) {
        int i;
        int numberOfTrailingZeros;
        this.WinterFlowRouterStructure = winterFlowSingletonNode;
        this.WinterFlowHookDataSource = j;
        WinterFlowSessionManagerAgent winterFlowSessionManagerAgent = WinterFlowVersionProtocol.WinterFlowRouterStructure;
        if (j != 0) {
            WinterFlowSingletonNode WinterFlowArrayNetwork = WinterFlowArrayNetwork();
            long j2 = WinterFlowArrayNetwork.WinterFlowUnitTestResponse;
            long[] jArr = WinterFlowArrayNetwork.WinterFlowRouterRouter;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = WinterFlowArrayNetwork.WinterFlowTransactionManagerStrategy;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = WinterFlowArrayNetwork.WinterFlowVariableVersionControl;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                i = WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(j);
            }
        } else {
            i = -1;
        }
        this.WinterFlowArrayNetwork = i;
    }

    public static void WinterFlowConcurrencyThread(WinterFlowJSONModule winterFlowJSONModule) {
        WinterFlowVersionProtocol.WinterFlowHookDataSource.WinterFlowMapperProtocol(winterFlowJSONModule);
    }

    public WinterFlowSingletonNode WinterFlowArrayNetwork() {
        return this.WinterFlowRouterStructure;
    }

    public final void WinterFlowBandwidthObject() {
        int i = this.WinterFlowArrayNetwork;
        if (i >= 0) {
            WinterFlowVersionProtocol.WinterFlowBatchUI(i);
            this.WinterFlowArrayNetwork = -1;
        }
    }

    public void WinterFlowBatchUI(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract void WinterFlowCacheManagerAgent();

    public void WinterFlowHookDataSource() {
        WinterFlowVersionProtocol.WinterFlowArrayNetwork = WinterFlowVersionProtocol.WinterFlowArrayNetwork.WinterFlowCacheManagerAgent(WinterFlowUnitTestResponse());
    }

    public void WinterFlowOrchestrationSubsystem() {
        WinterFlowBandwidthObject();
    }

    public final WinterFlowJSONModule WinterFlowResponseEngine() {
        WinterFlowObjectPackage winterFlowObjectPackage = WinterFlowVersionProtocol.WinterFlowHookDataSource;
        WinterFlowJSONModule winterFlowJSONModule = (WinterFlowJSONModule) winterFlowObjectPackage.get();
        winterFlowObjectPackage.WinterFlowMapperProtocol(this);
        return winterFlowJSONModule;
    }

    public abstract WinterFlowJSONModule WinterFlowRouterAdapter(WinterFlowObjectSession winterFlowObjectSession);

    public int WinterFlowRouterRouter() {
        return 0;
    }

    public final void WinterFlowRouterStructure() {
        synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
            WinterFlowHookDataSource();
            WinterFlowOrchestrationSubsystem();
        }
    }

    public abstract void WinterFlowServerProtocol();

    public abstract void WinterFlowServiceUtility(WinterFlowOrchestrationTool winterFlowOrchestrationTool);

    public void WinterFlowSingletonPlatform(WinterFlowSingletonNode winterFlowSingletonNode) {
        this.WinterFlowRouterStructure = winterFlowSingletonNode;
    }

    public abstract WinterFlowObjectSession WinterFlowSyntax();

    public abstract void WinterFlowThreadListener();

    public abstract void WinterFlowTransactionAgent();

    public abstract boolean WinterFlowTransactionManagerStrategy();

    public long WinterFlowUnitTestResponse() {
        return this.WinterFlowHookDataSource;
    }

    public void WinterFlowVariableBandwidth(long j) {
        this.WinterFlowHookDataSource = j;
    }

    public abstract WinterFlowObjectSession WinterFlowVariableVersionControl();
}
