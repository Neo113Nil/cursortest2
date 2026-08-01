package com.google.android.datatransport;

import android.content.Context;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRequestStructure extends WinterFlowUserManagerAdapter {
    public final String WinterFlowArrayNetwork;
    public final WinterFlowFunctionProcessor WinterFlowCacheManagerAgent;
    public final WinterFlowFunctionProcessor WinterFlowHookDataSource;
    public final Context WinterFlowRouterStructure;

    public WinterFlowRequestStructure(Context context, WinterFlowFunctionProcessor winterFlowFunctionProcessor, WinterFlowFunctionProcessor winterFlowFunctionProcessor2, String str) {
        if (context == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null applicationContext");
            throw null;
        }
        this.WinterFlowRouterStructure = context;
        if (winterFlowFunctionProcessor == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null wallClock");
            throw null;
        }
        this.WinterFlowHookDataSource = winterFlowFunctionProcessor;
        if (winterFlowFunctionProcessor2 == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null monotonicClock");
            throw null;
        }
        this.WinterFlowCacheManagerAgent = winterFlowFunctionProcessor2;
        if (str != null) {
            this.WinterFlowArrayNetwork = str;
        } else {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowUserManagerAdapter) {
            WinterFlowRequestStructure winterFlowRequestStructure = (WinterFlowRequestStructure) ((WinterFlowUserManagerAdapter) obj);
            if (this.WinterFlowRouterStructure.equals(winterFlowRequestStructure.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowRequestStructure.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent.equals(winterFlowRequestStructure.WinterFlowCacheManagerAgent) && this.WinterFlowArrayNetwork.equals(winterFlowRequestStructure.WinterFlowArrayNetwork)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowArrayNetwork.hashCode() ^ ((((((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003) ^ this.WinterFlowHookDataSource.hashCode()) * 1000003) ^ this.WinterFlowCacheManagerAgent.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CreationContext{applicationContext=" + this.WinterFlowRouterStructure + ", wallClock=" + this.WinterFlowHookDataSource + ", monotonicClock=" + this.WinterFlowCacheManagerAgent + ", backendName=" + this.WinterFlowArrayNetwork + "}";
    }
}
