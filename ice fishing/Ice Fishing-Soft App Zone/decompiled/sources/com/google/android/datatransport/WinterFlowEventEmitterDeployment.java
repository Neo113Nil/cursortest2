package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowEventEmitterDeployment implements WinterFlowFrontendAgent {
    public final long WinterFlowTransactionManagerStrategy;
    public final WinterFlowFrontendAgent WinterFlowVariableVersionControl;

    public WinterFlowEventEmitterDeployment(WinterFlowFrontendAgent winterFlowFrontendAgent, long j) {
        this.WinterFlowVariableVersionControl = winterFlowFrontendAgent;
        this.WinterFlowTransactionManagerStrategy = j;
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public final WinterFlowConfigurationResponse WinterFlowBandwidthObject(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        long j2 = this.WinterFlowTransactionManagerStrategy;
        return j < j2 ? winterFlowConfigurationResponse3 : this.WinterFlowVariableVersionControl.WinterFlowBandwidthObject(j - j2, winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public final boolean WinterFlowRouterStructure() {
        return this.WinterFlowVariableVersionControl.WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public final WinterFlowConfigurationResponse WinterFlowSyntax(long j, WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        long j2 = this.WinterFlowTransactionManagerStrategy;
        return j < j2 ? winterFlowConfigurationResponse : this.WinterFlowVariableVersionControl.WinterFlowSyntax(j - j2, winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3);
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendAgent
    public final long WinterFlowVariableVersionControl(WinterFlowConfigurationResponse winterFlowConfigurationResponse, WinterFlowConfigurationResponse winterFlowConfigurationResponse2, WinterFlowConfigurationResponse winterFlowConfigurationResponse3) {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(winterFlowConfigurationResponse, winterFlowConfigurationResponse2, winterFlowConfigurationResponse3) + this.WinterFlowTransactionManagerStrategy;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowEventEmitterDeployment)) {
            return false;
        }
        WinterFlowEventEmitterDeployment winterFlowEventEmitterDeployment = (WinterFlowEventEmitterDeployment) obj;
        return winterFlowEventEmitterDeployment.WinterFlowTransactionManagerStrategy == this.WinterFlowTransactionManagerStrategy && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowEventEmitterDeployment.WinterFlowVariableVersionControl, this.WinterFlowVariableVersionControl);
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowTransactionManagerStrategy) + (this.WinterFlowVariableVersionControl.hashCode() * 31);
    }
}
