package com.gamericefishpro.space.s5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Binder implements e {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, e.c);
    }

    @Override // com.gamericefishpro.space.s5.e
    public final void A(int i, String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.i) {
            try {
                String str = (String) multiInstanceInvalidationService.e.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.i.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.i.getBroadcastCookie(i2);
                        Intrinsics.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.e.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((d) multiInstanceInvalidationService.i.getBroadcastItem(i2)).j(tables);
                                Unit unit = Unit.a;
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.i.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.i.finishBroadcast();
                Unit unit2 = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = e.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d callback = null;
        d callback2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                A(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(d.b);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.d = strongBinder;
                    callback2 = cVar;
                } else {
                    callback2 = (d) iInterfaceQueryLocalInterface;
                }
            }
            int i3 = parcel.readInt();
            Intrinsics.checkNotNullParameter(callback2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
            synchronized (multiInstanceInvalidationService.i) {
                multiInstanceInvalidationService.i.unregister(callback2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(d.b);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.d = strongBinder2;
                callback = cVar2;
            } else {
                callback = (d) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i4 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.i) {
                try {
                    int i5 = multiInstanceInvalidationService2.d + 1;
                    multiInstanceInvalidationService2.d = i5;
                    if (multiInstanceInvalidationService2.i.register(callback, Integer.valueOf(i5))) {
                        multiInstanceInvalidationService2.e.put(Integer.valueOf(i5), string);
                        i4 = i5;
                    } else {
                        multiInstanceInvalidationService2.d--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i4);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
