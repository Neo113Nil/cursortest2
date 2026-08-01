package com.google.android.datatransport;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowStackLibrary extends Binder implements IInterface {
    public final /* synthetic */ int WinterFlowCacheManagerAgent = 0;

    public WinterFlowStackLibrary(String str) {
        attachInterface(this, str);
    }

    public boolean WinterFlowTransactionManagerStrategy(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.WinterFlowCacheManagerAgent;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.WinterFlowCacheManagerAgent) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                WinterFlowManagerStructure winterFlowManagerStructure = (WinterFlowManagerStructure) this;
                switch (i) {
                    case 3:
                        WinterFlowListenerManager.WinterFlowHookDataSource(parcel);
                        break;
                    case 4:
                        WinterFlowListenerManager.WinterFlowHookDataSource(parcel);
                        break;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        WinterFlowListenerManager.WinterFlowHookDataSource(parcel);
                        break;
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowListenerManager.WinterFlowHookDataSource(parcel);
                        break;
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        WinterFlowRouterQueue winterFlowRouterQueue = (WinterFlowRouterQueue) WinterFlowListenerManager.WinterFlowRouterStructure(parcel, WinterFlowRouterQueue.CREATOR);
                        WinterFlowListenerManager.WinterFlowHookDataSource(parcel);
                        winterFlowManagerStructure.WinterFlowVariableVersionControl.post(new WinterFlowProtocolThread(2, winterFlowManagerStructure, winterFlowRouterQueue));
                        break;
                    case 9:
                        WinterFlowListenerManager.WinterFlowHookDataSource(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return WinterFlowTransactionManagerStrategy(i, parcel, parcel2);
        }
    }

    public /* synthetic */ WinterFlowStackLibrary() {
    }
}
