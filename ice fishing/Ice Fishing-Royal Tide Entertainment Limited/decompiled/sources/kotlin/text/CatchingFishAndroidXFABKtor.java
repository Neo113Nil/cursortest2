package kotlin.text;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXFABKtor implements CatchingFishLayoutHiltRoom, IInterface {
    public final IBinder CatchingFishEspressoTesting;

    public CatchingFishAndroidXFABKtor(IBinder iBinder) {
        this.CatchingFishEspressoTesting = iBinder;
    }

    public final Parcel CatchingFishParcelableFAB(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.CatchingFishEspressoTesting.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.CatchingFishEspressoTesting;
    }
}
