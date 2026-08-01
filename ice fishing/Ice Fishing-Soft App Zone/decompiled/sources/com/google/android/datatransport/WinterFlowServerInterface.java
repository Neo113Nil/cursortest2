package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerInterface {
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;

    public WinterFlowServerInterface(long j, long j2) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowServerInterface)) {
            return false;
        }
        WinterFlowServerInterface winterFlowServerInterface = (WinterFlowServerInterface) obj;
        long j = winterFlowServerInterface.WinterFlowRouterStructure;
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowRouterStructure, j) && WinterFlowUnitTestSoftware.WinterFlowRouterStructure(this.WinterFlowHookDataSource, winterFlowServerInterface.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return Long.hashCode(this.WinterFlowHookDataSource) + (Long.hashCode(this.WinterFlowRouterStructure) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        WinterFlowResolverBackend.WinterFlowSingletonPlatform(this.WinterFlowRouterStructure, sb, ", selectionBackgroundColor=");
        sb.append((Object) WinterFlowInheritanceSubsystem.WinterFlowRouterRouter(this.WinterFlowHookDataSource));
        sb.append(')');
        return sb.toString();
    }
}
