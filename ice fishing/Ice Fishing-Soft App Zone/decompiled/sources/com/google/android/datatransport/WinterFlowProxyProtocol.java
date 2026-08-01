package com.google.android.datatransport;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyProtocol implements IInterface {
    public final IBinder WinterFlowCacheManagerAgent;

    public WinterFlowProxyProtocol(IBinder iBinder) {
        this.WinterFlowCacheManagerAgent = iBinder;
    }

    public final void WinterFlowRouterStructure(WinterFlowAdapterLayer winterFlowAdapterLayer, WinterFlowManagerProcess winterFlowManagerProcess) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(winterFlowAdapterLayer);
            obtain.writeInt(1);
            WinterFlowStackFramework.WinterFlowRouterStructure(winterFlowManagerProcess, obtain, 0);
            this.WinterFlowCacheManagerAgent.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.WinterFlowCacheManagerAgent;
    }
}
