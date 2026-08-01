package com.google.android.datatransport;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBandwidthComponent implements WinterFlowBandwidthRefactoring, IInterface {
    public final IBinder WinterFlowCacheManagerAgent;

    public WinterFlowBandwidthComponent(IBinder iBinder) {
        this.WinterFlowCacheManagerAgent = iBinder;
    }

    public final Account WinterFlowRouterStructure() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.WinterFlowCacheManagerAgent.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) WinterFlowRouterScheduler.WinterFlowRouterStructure(obtain, Account.CREATOR);
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
