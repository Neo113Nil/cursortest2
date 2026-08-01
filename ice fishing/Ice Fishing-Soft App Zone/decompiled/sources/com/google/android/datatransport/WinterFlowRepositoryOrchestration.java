package com.google.android.datatransport;

import android.os.Message;
import android.webkit.WebView;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRepositoryOrchestration {
    public final Message WinterFlowHookDataSource;
    public final WebView WinterFlowRouterStructure;

    public WinterFlowRepositoryOrchestration(WebView webView, Message message) {
        this.WinterFlowRouterStructure = webView;
        this.WinterFlowHookDataSource = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowRepositoryOrchestration)) {
            return false;
        }
        WinterFlowRepositoryOrchestration winterFlowRepositoryOrchestration = (WinterFlowRepositoryOrchestration) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowRepositoryOrchestration.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowRepositoryOrchestration.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "CreateWindowInfo(oldView=" + this.WinterFlowRouterStructure + ", msg=" + this.WinterFlowHookDataSource + ")";
    }
}
