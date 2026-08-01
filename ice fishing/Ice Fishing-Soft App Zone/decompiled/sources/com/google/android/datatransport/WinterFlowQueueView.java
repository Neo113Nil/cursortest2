package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueueView {
    public final boolean WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final boolean WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final boolean WinterFlowVariableVersionControl;

    public WinterFlowQueueView(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3) {
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = z2;
        this.WinterFlowCacheManagerAgent = i;
        this.WinterFlowArrayNetwork = z3;
        this.WinterFlowVariableVersionControl = z4;
        this.WinterFlowTransactionManagerStrategy = i2;
        this.WinterFlowUnitTestResponse = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WinterFlowQueueView)) {
            return false;
        }
        WinterFlowQueueView winterFlowQueueView = (WinterFlowQueueView) obj;
        return this.WinterFlowRouterStructure == winterFlowQueueView.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowQueueView.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowQueueView.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowQueueView.WinterFlowArrayNetwork && this.WinterFlowVariableVersionControl == winterFlowQueueView.WinterFlowVariableVersionControl && this.WinterFlowTransactionManagerStrategy == winterFlowQueueView.WinterFlowTransactionManagerStrategy && this.WinterFlowUnitTestResponse == winterFlowQueueView.WinterFlowUnitTestResponse;
    }

    public final int hashCode() {
        return ((((((((((((((((this.WinterFlowRouterStructure ? 1 : 0) * 31) + (this.WinterFlowHookDataSource ? 1 : 0)) * 31) + this.WinterFlowCacheManagerAgent) * 923521) + (this.WinterFlowArrayNetwork ? 1 : 0)) * 31) + (this.WinterFlowVariableVersionControl ? 1 : 0)) * 31) + this.WinterFlowTransactionManagerStrategy) * 31) + this.WinterFlowUnitTestResponse) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(WinterFlowQueueView.class.getSimpleName());
        sb.append("(");
        if (this.WinterFlowRouterStructure) {
            sb.append("launchSingleTop ");
        }
        if (this.WinterFlowHookDataSource) {
            sb.append("restoreState ");
        }
        int i = this.WinterFlowUnitTestResponse;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        return sb.toString();
    }
}
