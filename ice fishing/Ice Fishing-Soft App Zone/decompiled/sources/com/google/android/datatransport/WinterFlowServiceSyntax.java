package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceSyntax {
    public final WinterFlowCacheManagerConfiguration WinterFlowArrayNetwork;
    public int WinterFlowBandwidthObject = Integer.MIN_VALUE;
    public final WinterFlowConfigurationPipeline WinterFlowCacheManagerAgent;
    public final List WinterFlowHookDataSource;
    public final int[] WinterFlowOrchestrationSubsystem;
    public int WinterFlowResponseEngine;
    public final Object WinterFlowRouterRouter;
    public final int WinterFlowRouterStructure;
    public final int WinterFlowServerProtocol;
    public boolean WinterFlowServiceUtility;
    public final WinterFlowJSONProxy WinterFlowSyntax;
    public final int WinterFlowThreadListener;
    public final int WinterFlowTransactionAgent;
    public final long WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowServiceSyntax(int i, List list, WinterFlowConfigurationPipeline winterFlowConfigurationPipeline, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, int i2, int i3, int i4, long j, Object obj, Object obj2, WinterFlowJSONProxy winterFlowJSONProxy, long j2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = list;
        this.WinterFlowCacheManagerAgent = winterFlowConfigurationPipeline;
        this.WinterFlowArrayNetwork = winterFlowCacheManagerConfiguration;
        this.WinterFlowVariableVersionControl = i4;
        this.WinterFlowTransactionManagerStrategy = j;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowRouterRouter = obj2;
        this.WinterFlowSyntax = winterFlowJSONProxy;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            WinterFlowViewTesting winterFlowViewTesting = (WinterFlowViewTesting) list.get(i7);
            i5 += winterFlowViewTesting.WinterFlowTransactionManagerStrategy;
            i6 = Math.max(i6, winterFlowViewTesting.WinterFlowVariableVersionControl);
        }
        this.WinterFlowTransactionAgent = i5;
        int i8 = i5 + this.WinterFlowVariableVersionControl;
        this.WinterFlowServerProtocol = i8 >= 0 ? i8 : 0;
        this.WinterFlowThreadListener = i6;
        this.WinterFlowOrchestrationSubsystem = new int[this.WinterFlowHookDataSource.size() * 2];
    }

    public final void WinterFlowCacheManagerAgent(int i, int i2, int i3) {
        this.WinterFlowResponseEngine = i;
        this.WinterFlowBandwidthObject = i3;
        List list = this.WinterFlowHookDataSource;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            WinterFlowViewTesting winterFlowViewTesting = (WinterFlowViewTesting) list.get(i4);
            int i5 = i4 * 2;
            WinterFlowConfigurationPipeline winterFlowConfigurationPipeline = this.WinterFlowCacheManagerAgent;
            if (winterFlowConfigurationPipeline == null) {
                WinterFlowValidatorConsumer.WinterFlowHookDataSource("null horizontalAlignment when isVertical == true");
                throw new WinterFlowServerSystem();
            }
            int WinterFlowRouterStructure = winterFlowConfigurationPipeline.WinterFlowRouterStructure(winterFlowViewTesting.WinterFlowVariableVersionControl, i2, this.WinterFlowArrayNetwork);
            int[] iArr = this.WinterFlowOrchestrationSubsystem;
            iArr[i5] = WinterFlowRouterStructure;
            iArr[i5 + 1] = i;
            i += winterFlowViewTesting.WinterFlowTransactionManagerStrategy;
        }
    }

    public final void WinterFlowHookDataSource(WinterFlowDecoratorSessionManager winterFlowDecoratorSessionManager) {
        WinterFlowRouterValidator winterFlowRouterValidator = WinterFlowRouterValidator.WinterFlowResponseEngine;
        if (this.WinterFlowBandwidthObject == Integer.MIN_VALUE) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("position() should be called first");
        }
        List list = this.WinterFlowHookDataSource;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WinterFlowViewTesting winterFlowViewTesting = (WinterFlowViewTesting) list.get(i);
            int i2 = winterFlowViewTesting.WinterFlowTransactionManagerStrategy;
            long WinterFlowRouterStructure = WinterFlowRouterStructure(i);
            WinterFlowResolverBackend.WinterFlowBatchUI(((WinterFlowDatabaseSchemaStructure) this.WinterFlowSyntax.WinterFlowRouterStructure).WinterFlowUnitTestResponse(this.WinterFlowUnitTestResponse));
            long WinterFlowCacheManagerAgent = WinterFlowValidatorTesting.WinterFlowCacheManagerAgent(WinterFlowRouterStructure, this.WinterFlowTransactionManagerStrategy);
            int i3 = WinterFlowObjectComponent.WinterFlowHookDataSource;
            winterFlowDecoratorSessionManager.WinterFlowTransactionManagerStrategy(winterFlowViewTesting);
            winterFlowViewTesting.WinterFlowOrchestrationConfiguration(WinterFlowValidatorTesting.WinterFlowCacheManagerAgent(WinterFlowCacheManagerAgent, winterFlowViewTesting.WinterFlowSyntax), 0.0f, winterFlowRouterValidator);
        }
    }

    public final long WinterFlowRouterStructure(int i) {
        if (i == 0 && this.WinterFlowHookDataSource.size() == 0) {
            return this.WinterFlowResponseEngine & 4294967295L;
        }
        int[] iArr = this.WinterFlowOrchestrationSubsystem;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }
}
