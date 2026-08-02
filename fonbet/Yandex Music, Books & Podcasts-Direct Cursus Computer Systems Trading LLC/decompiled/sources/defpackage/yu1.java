package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class yu1 implements IInterface {
    public final IBinder a;

    public yu1(IBinder iBinder) {
        iBinder.getClass();
        this.a = iBinder;
    }

    public final String R() {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        Parcel obtain2 = Parcel.obtain();
        obtain2.getClass();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean X() {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        Parcel obtain2 = Parcel.obtain();
        obtain2.getClass();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            obtain.writeInt(1);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
