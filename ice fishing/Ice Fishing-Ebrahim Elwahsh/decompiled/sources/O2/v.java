package O2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class v implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f2481n;

    public v(IBinder iBinder) {
        this.f2481n = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2481n;
    }

    public final void i0(A a9, C0371h c0371h) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(a9);
            obtain.writeInt(1);
            F0.a.a(c0371h, obtain, 0);
            this.f2481n.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
