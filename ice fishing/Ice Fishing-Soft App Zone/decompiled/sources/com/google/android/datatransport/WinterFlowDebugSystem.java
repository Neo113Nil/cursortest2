package com.google.android.datatransport;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugSystem implements WinterFlowVersionProvider {
    public IBinder WinterFlowCacheManagerAgent;

    @Override // com.google.android.datatransport.WinterFlowVersionProvider
    public final void WinterFlowHookDataSource(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(WinterFlowVersionProvider.WinterFlowRouterStructure);
            obtain.writeStringArray(strArr);
            this.WinterFlowCacheManagerAgent.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.WinterFlowCacheManagerAgent;
    }
}
