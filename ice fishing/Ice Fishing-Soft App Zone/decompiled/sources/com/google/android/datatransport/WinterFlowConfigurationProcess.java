package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConfigurationProcess extends WinterFlowUIRouter implements WinterFlowCacheHelper {
    public static final WinterFlowConfigurationProcess WinterFlowRouterRouter = new WinterFlowConfigurationProcess(WinterFlowLoaderScheduler.WinterFlowVariableVersionControl, 0);

    public final WinterFlowConfigurationProcess WinterFlowHookDataSource(WinterFlowProtocolEntity winterFlowProtocolEntity, WinterFlowFunctionThreadPool winterFlowFunctionThreadPool) {
        WinterFlowSyntax WinterFlowRouterAdapter = this.WinterFlowVariableVersionControl.WinterFlowRouterAdapter(winterFlowProtocolEntity.hashCode(), 0, winterFlowProtocolEntity, winterFlowFunctionThreadPool);
        return WinterFlowRouterAdapter == null ? this : new WinterFlowConfigurationProcess((WinterFlowLoaderScheduler) WinterFlowRouterAdapter.WinterFlowHookDataSource, this.WinterFlowTransactionManagerStrategy + WinterFlowRouterAdapter.WinterFlowRouterStructure);
    }

    @Override // com.google.android.datatransport.WinterFlowUIRouter, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof WinterFlowProtocolEntity) {
            return super.containsKey((WinterFlowProtocolEntity) obj);
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowUIRouter, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof WinterFlowFunctionThreadPool) {
            return super.containsValue((WinterFlowFunctionThreadPool) obj);
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowUIRouter, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof WinterFlowProtocolEntity) {
            return (WinterFlowFunctionThreadPool) super.get((WinterFlowProtocolEntity) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof WinterFlowProtocolEntity) ? obj2 : (WinterFlowFunctionThreadPool) super.getOrDefault((WinterFlowProtocolEntity) obj, (WinterFlowFunctionThreadPool) obj2);
    }
}
