package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererTransaction implements WinterFlowHookInheritance {
    public static final Object WinterFlowCacheManagerAgent = new Object();
    public volatile WinterFlowHookInheritance WinterFlowHookDataSource;
    public volatile Object WinterFlowRouterStructure = WinterFlowCacheManagerAgent;

    public WinterFlowRendererTransaction(WinterFlowHookInheritance winterFlowHookInheritance) {
        this.WinterFlowHookDataSource = winterFlowHookInheritance;
    }

    @Override // com.google.android.datatransport.WinterFlowHookInheritance
    public final Object get() {
        Object obj;
        Object obj2 = this.WinterFlowRouterStructure;
        Object obj3 = WinterFlowCacheManagerAgent;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.WinterFlowRouterStructure;
                if (obj == obj3) {
                    obj = this.WinterFlowHookDataSource.get();
                    this.WinterFlowRouterStructure = obj;
                    this.WinterFlowHookDataSource = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
