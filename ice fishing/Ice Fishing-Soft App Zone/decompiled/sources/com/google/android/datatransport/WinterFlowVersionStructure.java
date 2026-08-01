package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionStructure extends WinterFlowSoftwareSubsystem {
    public WinterFlowProxyValidator WinterFlowResponseEngine;
    public final long WinterFlowRouterRouter;
    public float WinterFlowSyntax;
    public final long WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse = 1;
    public final WinterFlowSoftwareUserManager WinterFlowVariableVersionControl;

    public WinterFlowVersionStructure(WinterFlowSoftwareUserManager winterFlowSoftwareUserManager) {
        int i;
        long width = (winterFlowSoftwareUserManager.WinterFlowRouterStructure.getWidth() << 32) | (winterFlowSoftwareUserManager.WinterFlowRouterStructure.getHeight() & 4294967295L);
        this.WinterFlowVariableVersionControl = winterFlowSoftwareUserManager;
        this.WinterFlowTransactionManagerStrategy = width;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > winterFlowSoftwareUserManager.WinterFlowRouterStructure.getWidth() || i > winterFlowSoftwareUserManager.WinterFlowRouterStructure.getHeight()) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Failed requirement.");
            throw null;
        }
        this.WinterFlowRouterRouter = width;
        this.WinterFlowSyntax = 1.0f;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final long WinterFlowArrayNetwork() {
        return WinterFlowServerManager.WinterFlowUserManagerUserManager(this.WinterFlowRouterRouter);
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final void WinterFlowHookDataSource(WinterFlowProxyValidator winterFlowProxyValidator) {
        this.WinterFlowResponseEngine = winterFlowProxyValidator;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final void WinterFlowRouterStructure(float f) {
        this.WinterFlowSyntax = f;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareSubsystem
    public final void WinterFlowVariableVersionControl(WinterFlowParserUserManager winterFlowParserUserManager) {
        int round = Math.round(Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (winterFlowParserUserManager.WinterFlowArrayNetwork() & 4294967295L)));
        WinterFlowParserUserManager.WinterFlowThreadPoolEventEmitter(winterFlowParserUserManager, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, (round << 32) | (round2 & 4294967295L), this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowUnitTestResponse, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionStructure)) {
            return false;
        }
        WinterFlowVersionStructure winterFlowVersionStructure = (WinterFlowVersionStructure) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowVersionStructure.WinterFlowVariableVersionControl) && WinterFlowValidatorTesting.WinterFlowRouterStructure(0L, 0L) && WinterFlowJavaEntity.WinterFlowRouterStructure(this.WinterFlowTransactionManagerStrategy, winterFlowVersionStructure.WinterFlowTransactionManagerStrategy) && this.WinterFlowUnitTestResponse == winterFlowVersionStructure.WinterFlowUnitTestResponse;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowUnitTestResponse) + WinterFlowResolverBackend.WinterFlowVariableVersionControl(WinterFlowResolverBackend.WinterFlowVariableVersionControl(this.WinterFlowVariableVersionControl.hashCode() * 31, 31, 0L), 31, this.WinterFlowTransactionManagerStrategy);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", srcOffset=");
        sb.append((Object) WinterFlowValidatorTesting.WinterFlowArrayNetwork(0L));
        sb.append(", srcSize=");
        sb.append((Object) WinterFlowJavaEntity.WinterFlowHookDataSource(this.WinterFlowTransactionManagerStrategy));
        sb.append(", filterQuality=");
        int i = this.WinterFlowUnitTestResponse;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
