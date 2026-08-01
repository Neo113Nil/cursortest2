package com.google.android.datatransport;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlDeserialization {
    public final Method WinterFlowHookDataSource;
    public final int WinterFlowRouterStructure;

    public WinterFlowVersionControlDeserialization(int i, Method method) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionControlDeserialization)) {
            return false;
        }
        WinterFlowVersionControlDeserialization winterFlowVersionControlDeserialization = (WinterFlowVersionControlDeserialization) obj;
        return this.WinterFlowRouterStructure == winterFlowVersionControlDeserialization.WinterFlowRouterStructure && this.WinterFlowHookDataSource.getName().equals(winterFlowVersionControlDeserialization.WinterFlowHookDataSource.getName());
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.getName().hashCode() + (this.WinterFlowRouterStructure * 31);
    }
}
