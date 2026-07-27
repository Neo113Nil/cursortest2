package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishMoshiCustomView extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishMoshiCustomView> CREATOR = new CatchingFishSnackbarPayPal(26);
    public final int CatchingFishCloudMessaging;
    public final int CatchingFishDaggerWebsocket;
    public final int CatchingFishEspressoTesting;
    public final String CatchingFishFragmentHandler;
    public final String CatchingFishLayout;
    public final int CatchingFishReduxKtor;
    public final long CatchingFishViewModelFAB;
    public final long CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishMoshiCustomView(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = i3;
        this.CatchingFishViewModelScope = j;
        this.CatchingFishViewModelFAB = j2;
        this.CatchingFishLayout = str;
        this.CatchingFishFragmentHandler = str2;
        this.CatchingFishCloudMessaging = i4;
        this.CatchingFishEspressoTesting = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 4);
        parcel.writeInt(this.CatchingFishWorkManager);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 4, 8);
        parcel.writeLong(this.CatchingFishViewModelScope);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 5, 8);
        parcel.writeLong(this.CatchingFishViewModelFAB);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 6, this.CatchingFishLayout);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 7, this.CatchingFishFragmentHandler);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 8, 4);
        parcel.writeInt(this.CatchingFishCloudMessaging);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 9, 4);
        parcel.writeInt(this.CatchingFishEspressoTesting);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
