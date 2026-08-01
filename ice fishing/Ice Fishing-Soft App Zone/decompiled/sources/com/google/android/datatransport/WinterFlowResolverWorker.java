package com.google.android.datatransport;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverWorker extends WinterFlowDeserializationNetwork {
    public final PointerInputEventHandler WinterFlowCacheManagerAgent;
    public final Object WinterFlowHookDataSource;
    public final Object WinterFlowRouterStructure;

    public WinterFlowResolverWorker(Object obj, WinterFlowPackageProcess winterFlowPackageProcess, PointerInputEventHandler pointerInputEventHandler, int i) {
        winterFlowPackageProcess = (i & 2) != 0 ? null : winterFlowPackageProcess;
        this.WinterFlowRouterStructure = obj;
        this.WinterFlowHookDataSource = winterFlowPackageProcess;
        this.WinterFlowCacheManagerAgent = pointerInputEventHandler;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final WinterFlowUserManagerController WinterFlowArrayNetwork() {
        return new WinterFlowDatabaseEntity(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, this.WinterFlowCacheManagerAgent);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationNetwork
    public final void WinterFlowVariableVersionControl(WinterFlowUserManagerController winterFlowUserManagerController) {
        WinterFlowDatabaseEntity winterFlowDatabaseEntity = (WinterFlowDatabaseEntity) winterFlowUserManagerController;
        Object obj = winterFlowDatabaseEntity.WinterFlowVariableBandwidth;
        Object obj2 = this.WinterFlowRouterStructure;
        boolean z = !WinterFlowManagerRequest.WinterFlowThreadListener(obj, obj2);
        winterFlowDatabaseEntity.WinterFlowVariableBandwidth = obj2;
        Object obj3 = winterFlowDatabaseEntity.WinterFlowBatchUI;
        Object obj4 = this.WinterFlowHookDataSource;
        if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj3, obj4)) {
            z = true;
        }
        winterFlowDatabaseEntity.WinterFlowBatchUI = obj4;
        Class<?> cls = winterFlowDatabaseEntity.WinterFlowRouterAdapter.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.WinterFlowCacheManagerAgent;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            winterFlowDatabaseEntity.WinterFlowUIPlatform();
        }
        winterFlowDatabaseEntity.WinterFlowRouterAdapter = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowResolverWorker)) {
            return false;
        }
        WinterFlowResolverWorker winterFlowResolverWorker = (WinterFlowResolverWorker) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowResolverWorker.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowResolverWorker.WinterFlowHookDataSource) && this.WinterFlowCacheManagerAgent == winterFlowResolverWorker.WinterFlowCacheManagerAgent;
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowRouterStructure.hashCode() * 31;
        Object obj = this.WinterFlowHookDataSource;
        return this.WinterFlowCacheManagerAgent.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
