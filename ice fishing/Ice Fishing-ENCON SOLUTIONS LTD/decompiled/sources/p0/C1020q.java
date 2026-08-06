package p0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020q implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8405a;

    public C1020q(IBinder iBinder) {
        this.f8405a = iBinder;
    }

    public final void a(BinderC1023t binderC1023t, C1007d c1007d) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC1023t);
            obtain.writeInt(1);
            C.l.a(c1007d, obtain, 0);
            this.f8405a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8405a;
    }
}
