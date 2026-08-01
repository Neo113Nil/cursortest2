package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowLibraryStrategy extends WinterFlowRuntimeComponent implements WinterFlowNodeSyntax {
    public final boolean WinterFlowTransactionAgent;

    public WinterFlowLibraryStrategy(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.WinterFlowTransactionAgent = false;
    }

    public final WinterFlowDatabaseFramework WinterFlowRouterRouter() {
        if (this.WinterFlowTransactionAgent) {
            return this;
        }
        WinterFlowDatabaseFramework winterFlowDatabaseFramework = this.WinterFlowVariableVersionControl;
        if (winterFlowDatabaseFramework != null) {
            return winterFlowDatabaseFramework;
        }
        WinterFlowDatabaseFramework WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent();
        this.WinterFlowVariableVersionControl = WinterFlowCacheManagerAgent;
        return WinterFlowCacheManagerAgent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowLibraryStrategy) {
            WinterFlowLibraryStrategy winterFlowLibraryStrategy = (WinterFlowLibraryStrategy) obj;
            return WinterFlowTransactionManagerStrategy().equals(winterFlowLibraryStrategy.WinterFlowTransactionManagerStrategy()) && this.WinterFlowRouterRouter.equals(winterFlowLibraryStrategy.WinterFlowRouterRouter) && this.WinterFlowSyntax.equals(winterFlowLibraryStrategy.WinterFlowSyntax) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowTransactionManagerStrategy, winterFlowLibraryStrategy.WinterFlowTransactionManagerStrategy);
        }
        if (obj instanceof WinterFlowNodeSyntax) {
            return obj.equals(WinterFlowRouterRouter());
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowSyntax.hashCode() + ((this.WinterFlowRouterRouter.hashCode() + (WinterFlowTransactionManagerStrategy().hashCode() * 31)) * 31);
    }

    public final String toString() {
        WinterFlowDatabaseFramework WinterFlowRouterRouter = WinterFlowRouterRouter();
        if (WinterFlowRouterRouter != this) {
            return WinterFlowRouterRouter.toString();
        }
        return "property " + this.WinterFlowRouterRouter + " (Kotlin reflection is not available)";
    }
}
