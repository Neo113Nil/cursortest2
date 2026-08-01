package com.google.android.datatransport;

import android.graphics.Rect;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadPoolStructure {
    public final float WinterFlowHookDataSource;
    public final WinterFlowParserWebsocket WinterFlowRouterStructure;

    public WinterFlowThreadPoolStructure(Rect rect, float f) {
        this.WinterFlowRouterStructure = new WinterFlowParserWebsocket(rect);
        this.WinterFlowHookDataSource = f;
    }

    public final Rect WinterFlowRouterStructure() {
        WinterFlowParserWebsocket winterFlowParserWebsocket = this.WinterFlowRouterStructure;
        winterFlowParserWebsocket.getClass();
        return new Rect(winterFlowParserWebsocket.WinterFlowRouterStructure, winterFlowParserWebsocket.WinterFlowHookDataSource, winterFlowParserWebsocket.WinterFlowCacheManagerAgent, winterFlowParserWebsocket.WinterFlowArrayNetwork);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WinterFlowThreadPoolStructure.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        WinterFlowThreadPoolStructure winterFlowThreadPoolStructure = (WinterFlowThreadPoolStructure) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowThreadPoolStructure.WinterFlowRouterStructure) && this.WinterFlowHookDataSource == winterFlowThreadPoolStructure.WinterFlowHookDataSource;
    }

    public final int hashCode() {
        return Float.hashCode(this.WinterFlowHookDataSource) + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", density=");
        return WinterFlowResolverBackend.WinterFlowTransactionAgent(sb, this.WinterFlowHookDataSource, ')');
    }

    public WinterFlowThreadPoolStructure(WinterFlowParserWebsocket winterFlowParserWebsocket, float f) {
        this.WinterFlowRouterStructure = winterFlowParserWebsocket;
        this.WinterFlowHookDataSource = f;
    }
}
