package Y2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class b implements d, IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f3946n;

    public b(IBinder iBinder) {
        this.f3946n = iBinder;
    }

    public final Parcel S(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f3946n.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e9) {
                obtain.recycle();
                throw e9;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3946n;
    }
}
