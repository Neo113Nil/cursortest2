package com.google.android.datatransport;

import android.os.Parcel;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyProcess implements WinterFlowEventPipeline {
    public final /* synthetic */ Object WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowConcurrencyProcess(Object obj) {
        this.WinterFlowVariableVersionControl = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowEventPipeline
    public void accept(Object obj, Object obj2) {
        WinterFlowArrayEngine winterFlowArrayEngine = (WinterFlowArrayEngine) obj2;
        WinterFlowGatewayResponse winterFlowGatewayResponse = (WinterFlowGatewayResponse) ((WinterFlowObjectAlgorithm) obj).WinterFlowRouterRouter();
        WinterFlowQueryLoader winterFlowQueryLoader = (WinterFlowQueryLoader) this.WinterFlowVariableVersionControl;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(winterFlowGatewayResponse.WinterFlowArrayNetwork);
        int i = WinterFlowListenerManager.WinterFlowRouterStructure;
        obtain.writeInt(1);
        winterFlowQueryLoader.writeToParcel(obtain, 0);
        try {
            winterFlowGatewayResponse.WinterFlowCacheManagerAgent.transact(1, obtain, null, 1);
            obtain.recycle();
            winterFlowArrayEngine.WinterFlowRouterStructure(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
