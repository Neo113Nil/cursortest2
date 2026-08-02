package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class IMultiInstanceInvalidationCallback$Stub$Proxy implements IMultiInstanceInvalidationCallback {
    public IBinder mRemote;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.mRemote;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void onInvalidation(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.DESCRIPTOR);
            obtain.writeStringArray(strArr);
            this.mRemote.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
