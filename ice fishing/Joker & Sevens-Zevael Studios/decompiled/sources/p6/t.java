package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f5642d;

    public t(IBinder iBinder) {
        this.f5642d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5642d;
    }

    public final void b(w wVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(wVar);
            obtain.writeInt(1);
            e7.c.a(fVar, obtain, 0);
            this.f5642d.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
