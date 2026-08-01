package com.google.android.datatransport;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJavaModule implements WinterFlowWidgetResolver, IInterface {
    public final IBinder WinterFlowCacheManagerAgent;

    public WinterFlowJavaModule(IBinder iBinder) {
        this.WinterFlowCacheManagerAgent = iBinder;
    }

    public final Bundle WinterFlowRouterStructure(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = WinterFlowProviderMapper.WinterFlowRouterStructure;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.WinterFlowCacheManagerAgent.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.WinterFlowCacheManagerAgent;
    }
}
