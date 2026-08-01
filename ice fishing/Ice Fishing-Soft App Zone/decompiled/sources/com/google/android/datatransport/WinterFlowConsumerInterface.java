package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConsumerInterface {
    public final WinterFlowNodeSerializer WinterFlowArrayNetwork;
    public final WinterFlowConfigurationValidator WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowConsumerInterface(int i, long j, WinterFlowConfigurationValidator winterFlowConfigurationValidator, WinterFlowNodeSerializer winterFlowNodeSerializer) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = j;
        this.WinterFlowCacheManagerAgent = winterFlowConfigurationValidator;
        this.WinterFlowArrayNetwork = winterFlowNodeSerializer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowConsumerInterface)) {
            return false;
        }
        WinterFlowConsumerInterface winterFlowConsumerInterface = (WinterFlowConsumerInterface) obj;
        return this.WinterFlowRouterStructure == winterFlowConsumerInterface.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowConsumerInterface.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowConsumerInterface.WinterFlowCacheManagerAgent && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowConsumerInterface.WinterFlowArrayNetwork);
    }

    public final int hashCode() {
        int hashCode = (this.WinterFlowCacheManagerAgent.hashCode() + WinterFlowResolverBackend.WinterFlowVariableVersionControl(Integer.hashCode(this.WinterFlowRouterStructure) * 31, 31, this.WinterFlowHookDataSource)) * 31;
        WinterFlowNodeSerializer winterFlowNodeSerializer = this.WinterFlowArrayNetwork;
        return hashCode + (winterFlowNodeSerializer == null ? 0 : winterFlowNodeSerializer.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.WinterFlowRouterStructure + ", timestamp=" + this.WinterFlowHookDataSource + ", type=" + this.WinterFlowCacheManagerAgent + ", structureCompat=" + this.WinterFlowArrayNetwork + ')';
    }
}
