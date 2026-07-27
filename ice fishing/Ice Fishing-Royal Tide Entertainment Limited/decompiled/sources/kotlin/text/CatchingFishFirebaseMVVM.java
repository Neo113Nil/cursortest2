package kotlin.text;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseMVVM implements CatchingFishPayPalGlide, IInterface {
    public final IBinder CatchingFishEspressoTesting;

    public CatchingFishFirebaseMVVM(IBinder iBinder) {
        this.CatchingFishEspressoTesting = iBinder;
    }

    public final Bundle CatchingFishParcelableFAB(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i = CatchingFishMVICameraX.CatchingFishParcelableFAB;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.CatchingFishEspressoTesting.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
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
