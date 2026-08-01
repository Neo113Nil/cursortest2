package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEAgent extends WinterFlowExceptionTool {
    public final byte[] WinterFlowVariableVersionControl;

    public WinterFlowIDEAgent(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.WinterFlowVariableVersionControl = bArr;
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionTool
    public final byte[] WinterFlowUnitTestResponse() {
        return this.WinterFlowVariableVersionControl;
    }
}
