package kotlin.text;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishFragmentJUnit extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishFragmentJUnit> CREATOR = new CatchingFishRoomKtorToast(0);
    public final Intent CatchingFishReduxKtor;

    public CatchingFishFragmentJUnit(Intent intent) {
        this.CatchingFishReduxKtor = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 1, this.CatchingFishReduxKtor, i);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
