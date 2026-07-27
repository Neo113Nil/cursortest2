package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishMVVMIntent extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishMVVMIntent> CREATOR = new CatchingFishSnackbarPayPal(23);
    public final String CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;
    public final boolean CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;

    public CatchingFishMVVMIntent(int i, String str, long j, int i2, boolean z) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = str;
        this.CatchingFishWorkManager = j;
        this.CatchingFishViewModelScope = i2;
        this.CatchingFishViewModelFAB = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 2, this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 8);
        parcel.writeLong(this.CatchingFishWorkManager);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 4, 4);
        parcel.writeInt(this.CatchingFishViewModelScope);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 5, 4);
        parcel.writeInt(this.CatchingFishViewModelFAB ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
