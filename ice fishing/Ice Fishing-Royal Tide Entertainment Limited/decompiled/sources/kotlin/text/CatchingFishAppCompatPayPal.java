package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatPayPal extends CatchingFishViewStateFlow {
    public static final Parcelable.Creator<CatchingFishAppCompatPayPal> CREATOR = new CatchingFishRoomKtorToast(3);
    public final int CatchingFishDaggerWebsocket;
    public final String CatchingFishReduxKtor;
    public final boolean CatchingFishViewModelScope;
    public final long CatchingFishWorkManager;

    public CatchingFishAppCompatPayPal(String str, int i, long j, boolean z) {
        this.CatchingFishReduxKtor = str;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = j;
        this.CatchingFishViewModelScope = z;
    }

    public final long CatchingFishParcelableFAB() {
        long j = this.CatchingFishWorkManager;
        return j == -1 ? this.CatchingFishDaggerWebsocket : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CatchingFishAppCompatPayPal) {
            CatchingFishAppCompatPayPal catchingFishAppCompatPayPal = (CatchingFishAppCompatPayPal) obj;
            if (CatchingFishLayoutRoom.CatchingFishOkHttp(this.CatchingFishReduxKtor, catchingFishAppCompatPayPal.CatchingFishReduxKtor) && CatchingFishParcelableFAB() == catchingFishAppCompatPayPal.CatchingFishParcelableFAB() && this.CatchingFishViewModelScope == catchingFishAppCompatPayPal.CatchingFishViewModelScope) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishReduxKtor, Long.valueOf(CatchingFishParcelableFAB()), Boolean.valueOf(this.CatchingFishViewModelScope)});
    }

    public final String toString() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(this);
        catchingFishViewModelIntent.CatchingFishSnackbar(this.CatchingFishReduxKtor, "name");
        catchingFishViewModelIntent.CatchingFishSnackbar(Long.valueOf(CatchingFishParcelableFAB()), "version");
        catchingFishViewModelIntent.CatchingFishSnackbar(Boolean.valueOf(this.CatchingFishViewModelScope), "is_fully_rolled_out");
        return catchingFishViewModelIntent.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 1, this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 2, 4);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        long CatchingFishParcelableFAB = CatchingFishParcelableFAB();
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 3, 8);
        parcel.writeLong(CatchingFishParcelableFAB);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 4, 4);
        parcel.writeInt(this.CatchingFishViewModelScope ? 1 : 0);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }

    public CatchingFishAppCompatPayPal(String str) {
        this(str, -1, 1L, false);
    }
}
