package y6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f8790d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8791e;

    public a(IBinder iBinder, String str) {
        this.f8790d = iBinder;
        this.f8791e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8790d;
    }

    public final void b(Parcel parcel, int i10) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8790d.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
