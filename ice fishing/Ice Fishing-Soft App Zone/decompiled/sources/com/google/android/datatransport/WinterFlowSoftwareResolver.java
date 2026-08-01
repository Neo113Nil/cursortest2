package com.google.android.datatransport;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareResolver extends Binder implements WinterFlowDebugProcess {
    public final /* synthetic */ MultiInstanceInvalidationService WinterFlowCacheManagerAgent;

    public WinterFlowSoftwareResolver(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.WinterFlowCacheManagerAgent = multiInstanceInvalidationService;
        attachInterface(this, WinterFlowDebugProcess.WinterFlowHookDataSource);
    }

    @Override // com.google.android.datatransport.WinterFlowDebugProcess
    public final void WinterFlowVariableVersionControl(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.WinterFlowCacheManagerAgent;
        synchronized (multiInstanceInvalidationService.WinterFlowUnitTestResponse) {
            try {
                String str = (String) multiInstanceInvalidationService.WinterFlowTransactionManagerStrategy.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.WinterFlowUnitTestResponse.beginBroadcast();
                int i2 = 0;
                while (true) {
                    WinterFlowProcessorQuery winterFlowProcessorQuery = multiInstanceInvalidationService.WinterFlowUnitTestResponse;
                    if (i2 >= beginBroadcast) {
                        winterFlowProcessorQuery.finishBroadcast();
                        return;
                    }
                    try {
                        Object broadcastCookie = winterFlowProcessorQuery.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.WinterFlowTransactionManagerStrategy.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((WinterFlowVersionProvider) multiInstanceInvalidationService.WinterFlowUnitTestResponse.getBroadcastItem(i2)).WinterFlowHookDataSource(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.WinterFlowUnitTestResponse.finishBroadcast();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = WinterFlowDebugProcess.WinterFlowHookDataSource;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        WinterFlowVersionProvider winterFlowVersionProvider = null;
        WinterFlowVersionProvider winterFlowVersionProvider2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                WinterFlowVariableVersionControl(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(WinterFlowVersionProvider.WinterFlowRouterStructure);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof WinterFlowVersionProvider)) {
                    WinterFlowDebugSystem winterFlowDebugSystem = new WinterFlowDebugSystem();
                    winterFlowDebugSystem.WinterFlowCacheManagerAgent = readStrongBinder;
                    winterFlowVersionProvider2 = winterFlowDebugSystem;
                } else {
                    winterFlowVersionProvider2 = (WinterFlowVersionProvider) queryLocalInterface;
                }
            }
            int readInt = parcel.readInt();
            winterFlowVersionProvider2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.WinterFlowCacheManagerAgent;
            synchronized (multiInstanceInvalidationService.WinterFlowUnitTestResponse) {
                multiInstanceInvalidationService.WinterFlowUnitTestResponse.unregister(winterFlowVersionProvider2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(WinterFlowVersionProvider.WinterFlowRouterStructure);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof WinterFlowVersionProvider)) {
                WinterFlowDebugSystem winterFlowDebugSystem2 = new WinterFlowDebugSystem();
                winterFlowDebugSystem2.WinterFlowCacheManagerAgent = readStrongBinder2;
                winterFlowVersionProvider = winterFlowDebugSystem2;
            } else {
                winterFlowVersionProvider = (WinterFlowVersionProvider) queryLocalInterface2;
            }
        }
        String readString = parcel.readString();
        winterFlowVersionProvider.getClass();
        int i3 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.WinterFlowCacheManagerAgent;
            synchronized (multiInstanceInvalidationService2.WinterFlowUnitTestResponse) {
                try {
                    int i4 = multiInstanceInvalidationService2.WinterFlowVariableVersionControl + 1;
                    multiInstanceInvalidationService2.WinterFlowVariableVersionControl = i4;
                    if (multiInstanceInvalidationService2.WinterFlowUnitTestResponse.register(winterFlowVersionProvider, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService2.WinterFlowTransactionManagerStrategy.put(Integer.valueOf(i4), readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService2.WinterFlowVariableVersionControl--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i3);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
