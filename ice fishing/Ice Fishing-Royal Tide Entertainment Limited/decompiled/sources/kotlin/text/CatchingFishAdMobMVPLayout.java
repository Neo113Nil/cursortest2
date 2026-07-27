package kotlin.text;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishAdMobMVPLayout extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishAdMobMVPLayout> CREATOR = new CatchingFishSnackbarPayPal(21);
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final Intent CatchingFishWorkManager;

    public CatchingFishAdMobMVPLayout(int i, int i2, Intent intent) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 3, this.CatchingFishWorkManager, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
