package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXGradle extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishAndroidXGradle> CREATOR = new CatchingFishRoomKtorToast(7);
    public final boolean CatchingFishDaggerWebsocket;
    public final int[] CatchingFishLayout;
    public final CatchingFishAdMobLifecycle CatchingFishReduxKtor;
    public final int CatchingFishViewModelFAB;
    public final int[] CatchingFishViewModelScope;
    public final boolean CatchingFishWorkManager;

    public CatchingFishAndroidXGradle(CatchingFishAdMobLifecycle catchingFishAdMobLifecycle, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.CatchingFishReduxKtor = catchingFishAdMobLifecycle;
        this.CatchingFishDaggerWebsocket = z;
        this.CatchingFishWorkManager = z2;
        this.CatchingFishViewModelScope = iArr;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishCardViewRealm(parcel, 1, this.CatchingFishReduxKtor, i);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(this.CatchingFishDaggerWebsocket ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 4);
        parcel.writeInt(this.CatchingFishWorkManager ? 1 : 0);
        int[] iArr = this.CatchingFishViewModelScope;
        if (iArr != null) {
            int CatchingFishJobScheduler2 = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 4);
            parcel.writeIntArray(iArr);
            CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler2);
        }
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 5, 4);
        parcel.writeInt(this.CatchingFishViewModelFAB);
        int[] iArr2 = this.CatchingFishLayout;
        if (iArr2 != null) {
            int CatchingFishJobScheduler3 = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 6);
            parcel.writeIntArray(iArr2);
            CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler3);
        }
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
