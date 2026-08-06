package p0;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z0.AbstractC1102a;

/* renamed from: p0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003C implements InterfaceC1008e, IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8341a;

    public C1003C(IBinder iBinder) {
        this.f8341a = iBinder;
    }

    public final Account a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.f8341a.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) AbstractC1102a.a(obtain, Account.CREATOR);
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8341a;
    }
}
