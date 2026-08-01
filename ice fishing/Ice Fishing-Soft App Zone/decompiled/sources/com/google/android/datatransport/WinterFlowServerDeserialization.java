package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerDeserialization {
    public static boolean WinterFlowHookDataSource(int i, WinterFlowProviderEntity winterFlowProviderEntity, Object obj) {
        WinterFlowWorkerCompiler winterFlowWorkerCompiler = (WinterFlowWorkerCompiler) winterFlowProviderEntity.WinterFlowArrayNetwork;
        int i2 = winterFlowProviderEntity.WinterFlowRouterStructure;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            winterFlowProviderEntity.WinterFlowConsumerUserManager(0);
            ((WinterFlowFrameworkRenderer) obj).WinterFlowCacheManagerAgent(i3 << 3, Long.valueOf(winterFlowWorkerCompiler.WinterFlowVariableBandwidth()));
            return true;
        }
        if (i4 == 1) {
            winterFlowProviderEntity.WinterFlowConsumerUserManager(1);
            ((WinterFlowFrameworkRenderer) obj).WinterFlowCacheManagerAgent((i3 << 3) | 1, Long.valueOf(winterFlowWorkerCompiler.WinterFlowOrchestrationSubsystem()));
            return true;
        }
        if (i4 == 2) {
            ((WinterFlowFrameworkRenderer) obj).WinterFlowCacheManagerAgent((i3 << 3) | 2, winterFlowProviderEntity.WinterFlowUnitTestResponse());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw WinterFlowRouterAgent.WinterFlowHookDataSource();
            }
            winterFlowProviderEntity.WinterFlowConsumerUserManager(5);
            ((WinterFlowFrameworkRenderer) obj).WinterFlowCacheManagerAgent(5 | (i3 << 3), Integer.valueOf(winterFlowWorkerCompiler.WinterFlowBandwidthObject()));
            return true;
        }
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = new WinterFlowFrameworkRenderer(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new WinterFlowRouterAgent("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (winterFlowProviderEntity.WinterFlowRouterStructure() != Integer.MAX_VALUE && WinterFlowHookDataSource(i7, winterFlowProviderEntity, winterFlowFrameworkRenderer)) {
        }
        if (i6 != winterFlowProviderEntity.WinterFlowRouterStructure) {
            throw new WinterFlowRouterAgent("Protocol message end-group tag did not match expected tag.");
        }
        if (winterFlowFrameworkRenderer.WinterFlowVariableVersionControl) {
            winterFlowFrameworkRenderer.WinterFlowVariableVersionControl = false;
        }
        ((WinterFlowFrameworkRenderer) obj).WinterFlowCacheManagerAgent(i5 | 3, winterFlowFrameworkRenderer);
        return true;
    }

    public static WinterFlowFrameworkRenderer WinterFlowRouterStructure(Object obj) {
        WinterFlowDecoratorResponse winterFlowDecoratorResponse = (WinterFlowDecoratorResponse) obj;
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer = winterFlowDecoratorResponse.unknownFields;
        if (winterFlowFrameworkRenderer != WinterFlowFrameworkRenderer.WinterFlowTransactionManagerStrategy) {
            return winterFlowFrameworkRenderer;
        }
        WinterFlowFrameworkRenderer winterFlowFrameworkRenderer2 = new WinterFlowFrameworkRenderer(0, new int[8], new Object[8], true);
        winterFlowDecoratorResponse.unknownFields = winterFlowFrameworkRenderer2;
        return winterFlowFrameworkRenderer2;
    }
}
