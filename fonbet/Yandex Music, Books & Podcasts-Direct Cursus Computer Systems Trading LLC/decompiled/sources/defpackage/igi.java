package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class igi extends Binder implements j9e {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public igi(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, j9e.e);
    }

    @Override // defpackage.j9e
    public final void A0(String[] strArr, int i) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
        synchronized (multiInstanceInvalidationService.c) {
            String str = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
            int i2 = 0;
            while (true) {
                jgi jgiVar = multiInstanceInvalidationService.c;
                if (i2 >= beginBroadcast) {
                    jgiVar.finishBroadcast();
                    return;
                }
                try {
                    Object broadcastCookie = jgiVar.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.b.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((i9e) multiInstanceInvalidationService.c.getBroadcastItem(i2)).i(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.c.finishBroadcast();
                    throw th;
                }
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = j9e.e;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        i9e i9eVar = null;
        i9e i9eVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                A0(parcel.createStringArray(), parcel.readInt());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(i9e.d);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof i9e)) {
                    h9e h9eVar = new h9e();
                    h9eVar.a = readStrongBinder;
                    i9eVar2 = h9eVar;
                } else {
                    i9eVar2 = (i9e) queryLocalInterface;
                }
            }
            int readInt = parcel.readInt();
            i9eVar2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
            synchronized (multiInstanceInvalidationService.c) {
                multiInstanceInvalidationService.c.unregister(i9eVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(i9e.d);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof i9e)) {
                h9e h9eVar2 = new h9e();
                h9eVar2.a = readStrongBinder2;
                i9eVar = h9eVar2;
            } else {
                i9eVar = (i9e) queryLocalInterface2;
            }
        }
        String readString = parcel.readString();
        i9eVar.getClass();
        int i3 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
            synchronized (multiInstanceInvalidationService2.c) {
                try {
                    int i4 = multiInstanceInvalidationService2.a + 1;
                    multiInstanceInvalidationService2.a = i4;
                    if (multiInstanceInvalidationService2.c.register(i9eVar, Integer.valueOf(i4))) {
                        multiInstanceInvalidationService2.b.put(Integer.valueOf(i4), readString);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService2.a--;
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
