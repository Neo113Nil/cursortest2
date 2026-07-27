package kotlin.text;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class CatchingFishMVPDaggerMVI extends CatchingFishKtorMVVMJUnit {
    public com.google.android.gms.common.internal.CatchingFishPagingLibrary CatchingFishOkHttp;
    public final int CatchingFishUnitTesting;

    public CatchingFishMVPDaggerMVI(com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.CatchingFishOkHttp = catchingFishPagingLibrary;
        this.CatchingFishUnitTesting = i;
    }

    @Override // kotlin.text.CatchingFishKtorMVVMJUnit
    public final boolean CatchingFishLayout(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) CatchingFishAdMobAppCompat.CatchingFishParcelableFAB(parcel, Bundle.CREATOR);
            CatchingFishAdMobAppCompat.CatchingFishSnackbar(parcel);
            CatchingFishToastHiltBundle.CatchingFishStateLiveData(this.CatchingFishOkHttp, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary = this.CatchingFishOkHttp;
            int i2 = this.CatchingFishUnitTesting;
            catchingFishPagingLibrary.getClass();
            CatchingFishGlideMVP catchingFishGlideMVP = new CatchingFishGlideMVP(catchingFishPagingLibrary, readInt, readStrongBinder, bundle);
            CatchingFishToastRoom catchingFishToastRoom = catchingFishPagingLibrary.CatchingFishDaggerWebsocket;
            catchingFishToastRoom.sendMessage(catchingFishToastRoom.obtainMessage(1, i2, -1, catchingFishGlideMVP));
            this.CatchingFishOkHttp = null;
        } else if (i == 2) {
            parcel.readInt();
            CatchingFishAdMobAppCompat.CatchingFishSnackbar(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            CatchingFishToastGoogleMaps catchingFishToastGoogleMaps = (CatchingFishToastGoogleMaps) CatchingFishAdMobAppCompat.CatchingFishParcelableFAB(parcel, CatchingFishToastGoogleMaps.CREATOR);
            CatchingFishAdMobAppCompat.CatchingFishSnackbar(parcel);
            com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary2 = this.CatchingFishOkHttp;
            CatchingFishToastHiltBundle.CatchingFishStateLiveData(catchingFishPagingLibrary2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            CatchingFishToastHiltBundle.CatchingFishAnimationMockk(catchingFishToastGoogleMaps);
            catchingFishPagingLibrary2.CatchingFishDaggerHiltFAB = catchingFishToastGoogleMaps;
            Bundle bundle2 = catchingFishToastGoogleMaps.CatchingFishReduxKtor;
            CatchingFishToastHiltBundle.CatchingFishStateLiveData(this.CatchingFishOkHttp, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.CatchingFishPagingLibrary catchingFishPagingLibrary3 = this.CatchingFishOkHttp;
            int i3 = this.CatchingFishUnitTesting;
            catchingFishPagingLibrary3.getClass();
            CatchingFishGlideMVP catchingFishGlideMVP2 = new CatchingFishGlideMVP(catchingFishPagingLibrary3, readInt2, readStrongBinder2, bundle2);
            CatchingFishToastRoom catchingFishToastRoom2 = catchingFishPagingLibrary3.CatchingFishDaggerWebsocket;
            catchingFishToastRoom2.sendMessage(catchingFishToastRoom2.obtainMessage(1, i3, -1, catchingFishGlideMVP2));
            this.CatchingFishOkHttp = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
