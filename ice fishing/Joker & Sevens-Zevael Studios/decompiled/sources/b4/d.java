package b4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f959d;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f959d;
    }

    public final void b(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.f959d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
