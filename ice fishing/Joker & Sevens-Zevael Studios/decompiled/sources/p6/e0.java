package p6;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e0 implements g, IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final IBinder f5577d;

    public e0(IBinder iBinder) {
        this.f5577d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5577d;
    }

    public final Account b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f5577d.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) a7.b.a(obtain, Account.CREATOR);
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            obtain.recycle();
        }
    }
}
