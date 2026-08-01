package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerUtility {
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowTransactionManagerUtility(int i, int i2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        if (!(i >= 0)) {
            WinterFlowValidatorConsumer.WinterFlowRouterStructure("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        WinterFlowValidatorConsumer.WinterFlowRouterStructure("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowTransactionManagerUtility)) {
            return false;
        }
        WinterFlowTransactionManagerUtility winterFlowTransactionManagerUtility = (WinterFlowTransactionManagerUtility) obj;
        return this.WinterFlowRouterStructure == winterFlowTransactionManagerUtility.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowTransactionManagerUtility.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowHookDataSource) + (Integer.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", end=");
        return WinterFlowResolverBackend.WinterFlowServerProtocol(sb, this.WinterFlowHookDataSource, ')');
    }
}
