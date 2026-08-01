package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProviderMechanism {
    public final double WinterFlowArrayNetwork;
    public final double WinterFlowCacheManagerAgent;
    public final double WinterFlowHookDataSource;
    public final double WinterFlowRouterStructure;
    public final double WinterFlowTransactionManagerStrategy;
    public final double WinterFlowUnitTestResponse;
    public final double WinterFlowVariableVersionControl;

    public WinterFlowProviderMechanism(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.WinterFlowRouterStructure = d;
        this.WinterFlowHookDataSource = d2;
        this.WinterFlowCacheManagerAgent = d3;
        this.WinterFlowArrayNetwork = d4;
        this.WinterFlowVariableVersionControl = d5;
        this.WinterFlowTransactionManagerStrategy = d6;
        this.WinterFlowUnitTestResponse = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowProviderMechanism)) {
            return false;
        }
        WinterFlowProviderMechanism winterFlowProviderMechanism = (WinterFlowProviderMechanism) obj;
        return Double.compare(this.WinterFlowRouterStructure, winterFlowProviderMechanism.WinterFlowRouterStructure) == 0 && Double.compare(this.WinterFlowHookDataSource, winterFlowProviderMechanism.WinterFlowHookDataSource) == 0 && Double.compare(this.WinterFlowCacheManagerAgent, winterFlowProviderMechanism.WinterFlowCacheManagerAgent) == 0 && Double.compare(this.WinterFlowArrayNetwork, winterFlowProviderMechanism.WinterFlowArrayNetwork) == 0 && Double.compare(this.WinterFlowVariableVersionControl, winterFlowProviderMechanism.WinterFlowVariableVersionControl) == 0 && Double.compare(this.WinterFlowTransactionManagerStrategy, winterFlowProviderMechanism.WinterFlowTransactionManagerStrategy) == 0 && Double.compare(this.WinterFlowUnitTestResponse, winterFlowProviderMechanism.WinterFlowUnitTestResponse) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.WinterFlowUnitTestResponse) + ((Double.hashCode(this.WinterFlowTransactionManagerStrategy) + ((Double.hashCode(this.WinterFlowVariableVersionControl) + ((Double.hashCode(this.WinterFlowArrayNetwork) + ((Double.hashCode(this.WinterFlowCacheManagerAgent) + ((Double.hashCode(this.WinterFlowHookDataSource) + (Double.hashCode(this.WinterFlowRouterStructure) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.WinterFlowRouterStructure + ", a=" + this.WinterFlowHookDataSource + ", b=" + this.WinterFlowCacheManagerAgent + ", c=" + this.WinterFlowArrayNetwork + ", d=" + this.WinterFlowVariableVersionControl + ", e=" + this.WinterFlowTransactionManagerStrategy + ", f=" + this.WinterFlowUnitTestResponse + ')';
    }

    public /* synthetic */ WinterFlowProviderMechanism(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
