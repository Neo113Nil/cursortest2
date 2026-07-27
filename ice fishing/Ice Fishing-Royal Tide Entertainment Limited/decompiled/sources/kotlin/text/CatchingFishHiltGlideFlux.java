package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class CatchingFishHiltGlideFlux extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishHiltGlideFlux> CREATOR = new CatchingFishSnackbarPayPal(25);
    public final ConnectionResult CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final CatchingFishWidgetFABGlide CatchingFishWorkManager;

    public CatchingFishHiltGlideFlux(int i, ConnectionResult connectionResult, CatchingFishWidgetFABGlide catchingFishWidgetFABGlide) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = connectionResult;
        this.CatchingFishWorkManager = catchingFishWidgetFABGlide;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 2, this.CatchingFishDaggerWebsocket, i);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 3, this.CatchingFishWorkManager, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
