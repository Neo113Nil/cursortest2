package com.google.android.datatransport;

import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchUtility extends WinterFlowConcurrencyQueue {
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final WinterFlowParserThread WinterFlowVariableVersionControl;

    public WinterFlowBatchUtility(WinterFlowParserThread winterFlowParserThread, int i, int i2) {
        this.WinterFlowVariableVersionControl = winterFlowParserThread;
        this.WinterFlowTransactionManagerStrategy = i;
        WinterFlowQuerySyntax.WinterFlowVariableVersionControl(i, i2, winterFlowParserThread.WinterFlowRouterStructure());
        this.WinterFlowUnitTestResponse = i2 - i;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, this.WinterFlowUnitTestResponse);
        return this.WinterFlowVariableVersionControl.get(this.WinterFlowTransactionManagerStrategy + i);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final List subList(int i, int i2) {
        WinterFlowQuerySyntax.WinterFlowVariableVersionControl(i, i2, this.WinterFlowUnitTestResponse);
        int i3 = this.WinterFlowTransactionManagerStrategy;
        return new WinterFlowBatchUtility(this.WinterFlowVariableVersionControl, i + i3, i3 + i2);
    }
}
