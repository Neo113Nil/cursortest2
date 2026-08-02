package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class IMultiInstanceInvalidationService$Stub$Proxy implements IMultiInstanceInvalidationService {
    public IBinder mRemote;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.mRemote;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void broadcastInvalidation(String[] strArr, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMultiInstanceInvalidationService.DESCRIPTOR);
            obtain.writeInt(i);
            obtain.writeStringArray(strArr);
            this.mRemote.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMultiInstanceInvalidationService.DESCRIPTOR);
            obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
            obtain.writeString(str);
            this.mRemote.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMultiInstanceInvalidationService.DESCRIPTOR);
            obtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
            obtain.writeInt(i);
            this.mRemote.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
