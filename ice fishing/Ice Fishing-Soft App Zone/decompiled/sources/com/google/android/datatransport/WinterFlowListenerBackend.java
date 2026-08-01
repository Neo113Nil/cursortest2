package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerBackend implements WinterFlowFunctionThreadPool {
    public final WinterFlowResolverSubsystem WinterFlowRouterStructure;

    public WinterFlowListenerBackend(WinterFlowResolverSubsystem winterFlowResolverSubsystem) {
        this.WinterFlowRouterStructure = winterFlowResolverSubsystem;
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionThreadPool
    public final Object WinterFlowRouterStructure(WinterFlowConfigurationProcess winterFlowConfigurationProcess) {
        return this.WinterFlowRouterStructure.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowListenerBackend) && this.WinterFlowRouterStructure == ((WinterFlowListenerBackend) obj).WinterFlowRouterStructure;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.WinterFlowRouterStructure + ')';
    }
}
