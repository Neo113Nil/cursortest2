package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowThreadVersionControl implements WinterFlowOrchestrationTool {
    public final WinterFlowFunctionEncryption WinterFlowVariableVersionControl = new WinterFlowFunctionEncryption(0);

    public final boolean WinterFlowTransactionManagerStrategy(int i) {
        return (this.WinterFlowVariableVersionControl.get() & i) != 0;
    }

    public final void WinterFlowUnitTestResponse(int i) {
        WinterFlowFunctionEncryption winterFlowFunctionEncryption;
        int i2;
        do {
            winterFlowFunctionEncryption = this.WinterFlowVariableVersionControl;
            i2 = winterFlowFunctionEncryption.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!winterFlowFunctionEncryption.compareAndSet(i2, i2 | i));
    }
}
