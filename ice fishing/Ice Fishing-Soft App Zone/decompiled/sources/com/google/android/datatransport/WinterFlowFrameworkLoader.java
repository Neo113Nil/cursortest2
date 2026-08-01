package com.google.android.datatransport;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkLoader implements WinterFlowTransactionPlatform {
    public final float WinterFlowArrayNetwork;
    public final WinterFlowBackendBatch WinterFlowBandwidthObject;
    public final boolean WinterFlowCacheManagerAgent;
    public final int WinterFlowConcurrencyThread;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowOrchestrationSubsystem;
    public final long WinterFlowResponseEngine;
    public final WinterFlowAdapterResponse WinterFlowRouterRouter;
    public final WinterFlowServiceSyntax WinterFlowRouterStructure;
    public final int WinterFlowServerProtocol;
    public final int WinterFlowServiceUtility;
    public final WinterFlowConcurrencyParser WinterFlowSyntax;
    public final int WinterFlowThreadListener;
    public final List WinterFlowTransactionAgent;
    public final float WinterFlowTransactionManagerStrategy;
    public final boolean WinterFlowUnitTestResponse;
    public final WinterFlowTransactionPlatform WinterFlowVariableVersionControl;

    public WinterFlowFrameworkLoader(WinterFlowServiceSyntax winterFlowServiceSyntax, int i, boolean z, float f, WinterFlowTransactionPlatform winterFlowTransactionPlatform, float f2, boolean z2, WinterFlowAdapterResponse winterFlowAdapterResponse, WinterFlowConcurrencyParser winterFlowConcurrencyParser, long j, List list, int i2, int i3, int i4, WinterFlowBackendBatch winterFlowBackendBatch, int i5, int i6) {
        this.WinterFlowRouterStructure = winterFlowServiceSyntax;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = z;
        this.WinterFlowArrayNetwork = f;
        this.WinterFlowVariableVersionControl = winterFlowTransactionPlatform;
        this.WinterFlowTransactionManagerStrategy = f2;
        this.WinterFlowUnitTestResponse = z2;
        this.WinterFlowRouterRouter = winterFlowAdapterResponse;
        this.WinterFlowSyntax = winterFlowConcurrencyParser;
        this.WinterFlowResponseEngine = j;
        this.WinterFlowTransactionAgent = list;
        this.WinterFlowServerProtocol = i2;
        this.WinterFlowThreadListener = i3;
        this.WinterFlowServiceUtility = i4;
        this.WinterFlowBandwidthObject = winterFlowBackendBatch;
        this.WinterFlowOrchestrationSubsystem = i5;
        this.WinterFlowConcurrencyThread = i6;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final WinterFlowObjectSession WinterFlowArrayNetwork() {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final int WinterFlowCacheManagerAgent() {
        return this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final void WinterFlowHookDataSource() {
        this.WinterFlowVariableVersionControl.WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final Map WinterFlowRouterStructure() {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterStructure();
    }

    public final WinterFlowFrameworkLoader WinterFlowTransactionManagerStrategy(int i, boolean z) {
        WinterFlowServiceSyntax winterFlowServiceSyntax;
        if (this.WinterFlowUnitTestResponse) {
            return null;
        }
        List list = this.WinterFlowTransactionAgent;
        if (list.isEmpty() || (winterFlowServiceSyntax = this.WinterFlowRouterStructure) == null) {
            return null;
        }
        int i2 = winterFlowServiceSyntax.WinterFlowServerProtocol;
        int i3 = this.WinterFlowHookDataSource - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        WinterFlowServiceSyntax winterFlowServiceSyntax2 = (WinterFlowServiceSyntax) WinterFlowSerializerUtility.WinterFlowStrategyHook(list);
        WinterFlowServiceSyntax winterFlowServiceSyntax3 = (WinterFlowServiceSyntax) WinterFlowSerializerUtility.WinterFlowThreadPoolEventEmitter(list);
        if (winterFlowServiceSyntax2.WinterFlowServiceUtility || winterFlowServiceSyntax3.WinterFlowServiceUtility) {
            return null;
        }
        int i4 = winterFlowServiceSyntax2.WinterFlowResponseEngine;
        int i5 = this.WinterFlowThreadListener;
        int i6 = this.WinterFlowServerProtocol;
        if (i < 0) {
            if (Math.min((i4 + winterFlowServiceSyntax2.WinterFlowServerProtocol) - i6, (winterFlowServiceSyntax3.WinterFlowResponseEngine + winterFlowServiceSyntax3.WinterFlowServerProtocol) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - winterFlowServiceSyntax3.WinterFlowResponseEngine) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            WinterFlowServiceSyntax winterFlowServiceSyntax4 = (WinterFlowServiceSyntax) list.get(i7);
            winterFlowServiceSyntax4.getClass();
            int[] iArr = winterFlowServiceSyntax4.WinterFlowOrchestrationSubsystem;
            if (!winterFlowServiceSyntax4.WinterFlowServiceUtility) {
                winterFlowServiceSyntax4.WinterFlowResponseEngine += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = winterFlowServiceSyntax4.WinterFlowHookDataSource.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        WinterFlowResolverBackend.WinterFlowBatchUI(((WinterFlowDatabaseSchemaStructure) winterFlowServiceSyntax4.WinterFlowSyntax.WinterFlowRouterStructure).WinterFlowUnitTestResponse(winterFlowServiceSyntax4.WinterFlowUnitTestResponse));
                    }
                }
            }
        }
        return new WinterFlowFrameworkLoader(this.WinterFlowRouterStructure, i3, this.WinterFlowCacheManagerAgent || i > 0, i, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, list, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, this.WinterFlowServiceUtility, this.WinterFlowBandwidthObject, this.WinterFlowOrchestrationSubsystem, this.WinterFlowConcurrencyThread);
    }

    public final long WinterFlowUnitTestResponse() {
        WinterFlowTransactionPlatform winterFlowTransactionPlatform = this.WinterFlowVariableVersionControl;
        return (winterFlowTransactionPlatform.WinterFlowVariableVersionControl() << 32) | (winterFlowTransactionPlatform.WinterFlowCacheManagerAgent() & 4294967295L);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final int WinterFlowVariableVersionControl() {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl();
    }
}
