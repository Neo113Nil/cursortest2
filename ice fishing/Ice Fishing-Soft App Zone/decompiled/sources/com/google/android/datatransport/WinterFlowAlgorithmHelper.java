package com.google.android.datatransport;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowAlgorithmHelper {
    public final Map WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowAlgorithmHelper(String str, Map map) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = map;
    }

    public static WinterFlowAlgorithmHelper WinterFlowRouterStructure(String str) {
        return new WinterFlowAlgorithmHelper(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowAlgorithmHelper)) {
            return false;
        }
        WinterFlowAlgorithmHelper winterFlowAlgorithmHelper = (WinterFlowAlgorithmHelper) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowAlgorithmHelper.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowAlgorithmHelper.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.WinterFlowRouterStructure + ", properties=" + this.WinterFlowHookDataSource.values() + "}";
    }
}
