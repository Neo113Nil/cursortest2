package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowTransactionManagerBackend {
    public final int WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowTransactionManagerBackend(String str, long j, int i) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = j;
        this.WinterFlowCacheManagerAgent = i;
        if (str.length() == 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract long WinterFlowArrayNetwork(float f, float f2, float f3);

    public boolean WinterFlowCacheManagerAgent() {
        return false;
    }

    public abstract float WinterFlowHookDataSource(int i);

    public abstract float WinterFlowRouterStructure(int i);

    public abstract long WinterFlowTransactionManagerStrategy(float f, float f2, float f3, float f4, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend);

    public abstract float WinterFlowVariableVersionControl(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend = (WinterFlowTransactionManagerBackend) obj;
        if (this.WinterFlowCacheManagerAgent == winterFlowTransactionManagerBackend.WinterFlowCacheManagerAgent && this.WinterFlowRouterStructure.equals(winterFlowTransactionManagerBackend.WinterFlowRouterStructure)) {
            return WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(this.WinterFlowHookDataSource, winterFlowTransactionManagerBackend.WinterFlowHookDataSource);
        }
        return false;
    }

    public int hashCode() {
        return WinterFlowResolverBackend.WinterFlowVariableVersionControl(this.WinterFlowRouterStructure.hashCode() * 31, 31, this.WinterFlowHookDataSource) + this.WinterFlowCacheManagerAgent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.WinterFlowRouterStructure);
        sb.append(" (id=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", model=");
        long j = this.WinterFlowHookDataSource;
        sb.append((Object) (WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(j, 12884901888L) ? "Rgb" : WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(j, 12884901889L) ? "Xyz" : WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(j, 12884901890L) ? "Lab" : WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
