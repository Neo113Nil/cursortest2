package kotlin.text;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishToastGsonFlux implements CatchingFishCoroutineFlux, IInterface {
    public final IBinder CatchingFishEspressoTesting;

    public CatchingFishToastGsonFlux(IBinder iBinder) {
        this.CatchingFishEspressoTesting = iBinder;
    }

    public final Account CatchingFishParcelableFAB() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IAccountAccessor");
        obtain = Parcel.obtain();
        try {
            this.CatchingFishEspressoTesting.transact(2, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Account) CatchingFishAdMobAppCompat.CatchingFishParcelableFAB(obtain, Account.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.CatchingFishEspressoTesting;
    }
}
