package kotlin.text;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishEspressoGlide implements CatchingFishPayPalFluxGlide {
    public IBinder CatchingFishEspressoTesting;

    public final void CatchingFishParcelableFAB(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(CatchingFishPayPalFluxGlide.CatchingFishDaggerWebsocket);
            obtain.writeStringArray(strArr);
            this.CatchingFishEspressoTesting.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.CatchingFishEspressoTesting;
    }
}
