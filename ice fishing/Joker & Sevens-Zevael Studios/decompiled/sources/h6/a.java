package h6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements c, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f2863d;

    public a(IBinder iBinder) {
        this.f2863d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2863d;
    }

    public final Bundle b(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i10 = s5.a.f6451a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.f2863d.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }
}
