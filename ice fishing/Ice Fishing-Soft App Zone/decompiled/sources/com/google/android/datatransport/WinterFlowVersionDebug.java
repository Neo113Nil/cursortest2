package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionDebug extends WinterFlowMicroserviceCloud {
    public final int WinterFlowResponseEngine;
    public final int WinterFlowSyntax;

    public WinterFlowVersionDebug(byte[] bArr, int i, int i2) {
        super(bArr);
        WinterFlowMicroserviceCloud.WinterFlowCacheManagerAgent(i, i + i2, bArr.length);
        this.WinterFlowSyntax = i;
        this.WinterFlowResponseEngine = i2;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceCloud
    public final byte WinterFlowRouterStructure(int i) {
        int i2 = this.WinterFlowResponseEngine;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.WinterFlowTransactionManagerStrategy[this.WinterFlowSyntax + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(WinterFlowResolverBackend.WinterFlowSyntax("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceCloud
    public final int WinterFlowTransactionManagerStrategy() {
        return this.WinterFlowSyntax;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceCloud
    public final byte WinterFlowUnitTestResponse(int i) {
        return this.WinterFlowTransactionManagerStrategy[this.WinterFlowSyntax + i];
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceCloud
    public final void WinterFlowVariableVersionControl(int i, byte[] bArr) {
        System.arraycopy(this.WinterFlowTransactionManagerStrategy, this.WinterFlowSyntax, bArr, 0, i);
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceCloud
    public final int size() {
        return this.WinterFlowResponseEngine;
    }
}
