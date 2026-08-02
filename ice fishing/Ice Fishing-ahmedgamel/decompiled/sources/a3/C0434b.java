package a3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0434b implements InterfaceC0436d, IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f4299n;

    public C0434b(IBinder iBinder) {
        this.f4299n = iBinder;
    }

    public final Parcel S(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f4299n.transact(i, parcel, obtain, 0);
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
        return this.f4299n;
    }
}
