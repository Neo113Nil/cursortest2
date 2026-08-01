package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerAdapter extends WinterFlowJavaHook {
    public final WinterFlowBatchStructure WinterFlowHookDataSource;
    public final WinterFlowListenerHelper WinterFlowRouterStructure;

    public WinterFlowControllerAdapter(WinterFlowListenerHelper winterFlowListenerHelper, WinterFlowBatchStructure winterFlowBatchStructure) {
        this.WinterFlowRouterStructure = winterFlowListenerHelper;
        this.WinterFlowHookDataSource = winterFlowBatchStructure;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowJavaHook) {
            WinterFlowJavaHook winterFlowJavaHook = (WinterFlowJavaHook) obj;
            WinterFlowListenerHelper winterFlowListenerHelper = this.WinterFlowRouterStructure;
            if (winterFlowListenerHelper != null ? winterFlowListenerHelper.equals(((WinterFlowControllerAdapter) winterFlowJavaHook).WinterFlowRouterStructure) : ((WinterFlowControllerAdapter) winterFlowJavaHook).WinterFlowRouterStructure == null) {
                WinterFlowBatchStructure winterFlowBatchStructure = this.WinterFlowHookDataSource;
                if (winterFlowBatchStructure != null ? winterFlowBatchStructure.equals(((WinterFlowControllerAdapter) winterFlowJavaHook).WinterFlowHookDataSource) : ((WinterFlowControllerAdapter) winterFlowJavaHook).WinterFlowHookDataSource == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        WinterFlowListenerHelper winterFlowListenerHelper = this.WinterFlowRouterStructure;
        int hashCode = ((winterFlowListenerHelper == null ? 0 : winterFlowListenerHelper.hashCode()) ^ 1000003) * 1000003;
        WinterFlowBatchStructure winterFlowBatchStructure = this.WinterFlowHookDataSource;
        return hashCode ^ (winterFlowBatchStructure != null ? winterFlowBatchStructure.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.WinterFlowRouterStructure + ", mobileSubtype=" + this.WinterFlowHookDataSource + "}";
    }
}
