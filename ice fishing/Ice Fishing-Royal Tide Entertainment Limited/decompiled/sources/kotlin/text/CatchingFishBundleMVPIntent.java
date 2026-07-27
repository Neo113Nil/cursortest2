package kotlin.text;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishBundleMVPIntent implements IInterface {
    public final IBinder CatchingFishEspressoTesting;

    public CatchingFishBundleMVPIntent(IBinder iBinder) {
        this.CatchingFishEspressoTesting = iBinder;
    }

    public final void CatchingFishParcelableFAB(CatchingFishMVPDaggerMVI catchingFishMVPDaggerMVI, CatchingFishGradleRealm catchingFishGradleRealm) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(catchingFishMVPDaggerMVI);
            obtain.writeInt(1);
            CatchingFishRoomKtorToast.CatchingFishParcelableFAB(catchingFishGradleRealm, obtain, 0);
            this.CatchingFishEspressoTesting.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.CatchingFishEspressoTesting;
    }
}
