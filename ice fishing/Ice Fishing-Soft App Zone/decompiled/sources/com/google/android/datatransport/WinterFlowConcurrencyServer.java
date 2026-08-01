package com.google.android.datatransport;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyServer {
    public final WinterFlowConcurrencyUnitTest WinterFlowRouterStructure;

    static {
        new LocaleList(new Locale[0]);
    }

    public WinterFlowConcurrencyServer(WinterFlowConcurrencyUnitTest winterFlowConcurrencyUnitTest) {
        this.WinterFlowRouterStructure = winterFlowConcurrencyUnitTest;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowConcurrencyServer) {
            return this.WinterFlowRouterStructure.equals(((WinterFlowConcurrencyServer) obj).WinterFlowRouterStructure);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.WinterFlowRouterStructure.hashCode();
    }

    public final String toString() {
        return this.WinterFlowRouterStructure.WinterFlowRouterStructure.toString();
    }
}
