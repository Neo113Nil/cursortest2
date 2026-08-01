package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowDecoratorSessionManager implements WinterFlowConcurrencyParser {
    public boolean WinterFlowVariableVersionControl;

    public static void WinterFlowBatchUI(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager, WinterFlowViewTesting winterFlowViewTesting, int i, int i2, WinterFlowObjectSession winterFlowObjectSession, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = WinterFlowObjectComponent.WinterFlowHookDataSource;
            winterFlowObjectSession = WinterFlowRouterValidator.WinterFlowResponseEngine;
        }
        winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
        winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent((i2 & 4294967295L) | (i << 32), winterFlowViewTesting.WinterFlowSyntax), 0.0f, winterFlowObjectSession);
    }

    public static void WinterFlowConcurrencyThread(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager, WinterFlowViewTesting winterFlowViewTesting, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (winterFlowDecoratorSessionManager.WinterFlowCacheManagerAgent() == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl || winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl() == 0) {
            winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
            winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent(j, winterFlowViewTesting.WinterFlowSyntax), 0.0f, null);
        } else {
            int WinterFlowVariableVersionControl = (winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl() - winterFlowViewTesting.WinterFlowVariableVersionControl) - ((int) (j >> 32));
            winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
            winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent((WinterFlowVariableVersionControl << 32) | (((int) (j & 4294967295L)) & 4294967295L), winterFlowViewTesting.WinterFlowSyntax), 0.0f, null);
        }
    }

    public static void WinterFlowResponseEngine(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager, WinterFlowViewTesting winterFlowViewTesting, long j) {
        winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
        winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent(j, winterFlowViewTesting.WinterFlowSyntax), 0.0f, null);
    }

    public static void WinterFlowSyntax(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager, WinterFlowViewTesting winterFlowViewTesting, int i, int i2) {
        winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
        winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent((i2 & 4294967295L) | (i << 32), winterFlowViewTesting.WinterFlowSyntax), 0.0f, null);
    }

    public static void WinterFlowVariableBandwidth(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager, WinterFlowViewTesting winterFlowViewTesting, int i, int i2) {
        int i3 = WinterFlowObjectComponent.WinterFlowHookDataSource;
        WinterFlowRouterValidator winterFlowRouterValidator = WinterFlowRouterValidator.WinterFlowResponseEngine;
        long j = (i << 32) | (i2 & 4294967295L);
        if (winterFlowDecoratorSessionManager.WinterFlowCacheManagerAgent() == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl || winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl() == 0) {
            winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
            winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent(j, winterFlowViewTesting.WinterFlowSyntax), 0.0f, winterFlowRouterValidator);
        } else {
            int WinterFlowVariableVersionControl = (winterFlowDecoratorSessionManager.WinterFlowVariableVersionControl() - winterFlowViewTesting.WinterFlowVariableVersionControl) - ((int) (j >> 32));
            winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
            winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent((WinterFlowVariableVersionControl << 32) | (((int) (j & 4294967295L)) & 4294967295L), winterFlowViewTesting.WinterFlowSyntax), 0.0f, winterFlowRouterValidator);
        }
    }

    public abstract WinterFlowCacheManagerConfiguration WinterFlowCacheManagerAgent();

    public float WinterFlowRouterStructure(WinterFlowWorkerInvoker winterFlowWorkerInvoker) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WinterFlowTransactionManagerStrategy(WinterFlowViewTesting winterFlowViewTesting) {
        if (winterFlowViewTesting instanceof WinterFlowJavaFunction) {
            ((WinterFlowJavaFunction) winterFlowViewTesting).WinterFlowConcurrencyThread(this.WinterFlowVariableVersionControl);
        }
    }

    public abstract int WinterFlowVariableVersionControl();
}
