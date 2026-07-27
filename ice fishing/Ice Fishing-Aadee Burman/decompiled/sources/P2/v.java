package P2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f2553n;

    public v(IBinder iBinder) {
        this.f2553n = iBinder;
    }

    public final void S(A a9, C0378h c0378h) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(a9);
            obtain.writeInt(1);
            B8.d.a(c0378h, obtain, 0);
            this.f2553n.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2553n;
    }
}
