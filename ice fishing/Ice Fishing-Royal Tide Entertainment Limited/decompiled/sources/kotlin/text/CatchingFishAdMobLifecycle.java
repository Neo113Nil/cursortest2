package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishAdMobLifecycle extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishAdMobLifecycle> CREATOR = new CatchingFishRoomKtorToast(1);
    public final boolean CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final int CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    public CatchingFishAdMobLifecycle(int i, int i2, int i3, boolean z, boolean z2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishWorkManager = z2;
        this.CatchingFishViewModelScope = i2;
        this.CatchingFishViewModelFAB = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(this.CatchingFishDaggerWebsocket ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 4);
        parcel.writeInt(this.CatchingFishWorkManager ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 4, 4);
        parcel.writeInt(this.CatchingFishViewModelScope);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 5, 4);
        parcel.writeInt(this.CatchingFishViewModelFAB);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
