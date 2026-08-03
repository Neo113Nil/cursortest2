package x6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f8370d;

    public b(IBinder iBinder) {
        this.f8370d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8370d;
    }

    public final Parcel b(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8370d.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
