package b4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends Binder implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f979d;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f979d = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        d dVar = null;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    dVar = new d();
                    dVar.f959d = readStrongBinder;
                } else {
                    dVar = (d) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            pc.j.e(dVar, "callback");
            int i12 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f979d;
                synchronized (multiInstanceInvalidationService.f739i) {
                    try {
                        int i13 = multiInstanceInvalidationService.f737g + 1;
                        multiInstanceInvalidationService.f737g = i13;
                        if (multiInstanceInvalidationService.f739i.register(dVar, Integer.valueOf(i13))) {
                            multiInstanceInvalidationService.f738h.put(Integer.valueOf(i13), readString);
                            i12 = i13;
                        } else {
                            multiInstanceInvalidationService.f737g--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i12);
            return true;
        }
        if (i10 == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof d)) {
                    dVar = new d();
                    dVar.f959d = readStrongBinder2;
                } else {
                    dVar = (d) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            pc.j.e(dVar, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f979d;
            synchronized (multiInstanceInvalidationService2.f739i) {
                multiInstanceInvalidationService2.f739i.unregister(dVar);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 3) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        pc.j.e(createStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f979d;
        synchronized (multiInstanceInvalidationService3.f739i) {
            String str = (String) multiInstanceInvalidationService3.f738h.get(Integer.valueOf(readInt2));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int beginBroadcast = multiInstanceInvalidationService3.f739i.beginBroadcast();
                for (int i14 = 0; i14 < beginBroadcast; i14++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.f739i.getBroadcastCookie(i14);
                        pc.j.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService3.f738h.get(num);
                        if (readInt2 != intValue && str.equals(str2)) {
                            try {
                                ((d) multiInstanceInvalidationService3.f739i.getBroadcastItem(i14)).b(createStringArray);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService3.f739i.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
