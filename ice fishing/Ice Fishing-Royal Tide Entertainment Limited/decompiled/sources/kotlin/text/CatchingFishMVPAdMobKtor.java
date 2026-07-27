package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishMVPAdMobKtor extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishMVPAdMobKtor> CREATOR = new CatchingFishSnackbarPayPal(20);
    public List CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;

    public CatchingFishMVPAdMobKtor(int i, List list) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishMVPRobolectric(parcel, 2, this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
