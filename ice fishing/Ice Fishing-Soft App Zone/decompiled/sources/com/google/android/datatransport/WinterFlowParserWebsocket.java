package com.google.android.datatransport;

import android.graphics.Rect;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserWebsocket {
    public final int WinterFlowArrayNetwork;
    public final int WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    static {
        new WinterFlowParserWebsocket(0, 0, 0, 0);
    }

    public WinterFlowParserWebsocket(int i, int i2, int i3, int i4) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = i3;
        this.WinterFlowArrayNetwork = i4;
        if (i > i3) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WinterFlowParserWebsocket.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        WinterFlowParserWebsocket winterFlowParserWebsocket = (WinterFlowParserWebsocket) obj;
        return this.WinterFlowRouterStructure == winterFlowParserWebsocket.WinterFlowRouterStructure && this.WinterFlowHookDataSource == winterFlowParserWebsocket.WinterFlowHookDataSource && this.WinterFlowCacheManagerAgent == winterFlowParserWebsocket.WinterFlowCacheManagerAgent && this.WinterFlowArrayNetwork == winterFlowParserWebsocket.WinterFlowArrayNetwork;
    }

    public final int hashCode() {
        return (((((this.WinterFlowRouterStructure * 31) + this.WinterFlowHookDataSource) * 31) + this.WinterFlowCacheManagerAgent) * 31) + this.WinterFlowArrayNetwork;
    }

    public final String toString() {
        return WinterFlowParserWebsocket.class.getSimpleName() + " { [" + this.WinterFlowRouterStructure + ',' + this.WinterFlowHookDataSource + ',' + this.WinterFlowCacheManagerAgent + ',' + this.WinterFlowArrayNetwork + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinterFlowParserWebsocket(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
