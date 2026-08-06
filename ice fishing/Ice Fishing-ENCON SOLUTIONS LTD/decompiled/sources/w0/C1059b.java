package w0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059b implements d, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8514a;

    public C1059b(IBinder iBinder) {
        this.f8514a = iBinder;
    }

    public final Parcel a(Parcel parcel, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f8514a.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8514a;
    }
}
