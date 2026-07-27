package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishCardViewOkHttp implements Parcelable {
    public static final Parcelable.Creator<CatchingFishCardViewOkHttp> CREATOR = new CatchingFishSnackbarPayPal(4);
    public final CatchingFishLiveDataMVI CatchingFishDaggerWebsocket;
    public final int CatchingFishFragmentHandler;
    public final int CatchingFishLayout;
    public final CatchingFishLiveDataMVI CatchingFishReduxKtor;
    public final int CatchingFishViewModelFAB;
    public final CatchingFishLiveDataMVI CatchingFishViewModelScope;
    public final CatchingFishRealmFragment CatchingFishWorkManager;

    public CatchingFishCardViewOkHttp(CatchingFishLiveDataMVI catchingFishLiveDataMVI, CatchingFishLiveDataMVI catchingFishLiveDataMVI2, CatchingFishRealmFragment catchingFishRealmFragment, CatchingFishLiveDataMVI catchingFishLiveDataMVI3, int i) {
        Objects.requireNonNull(catchingFishLiveDataMVI, "start cannot be null");
        Objects.requireNonNull(catchingFishLiveDataMVI2, "end cannot be null");
        Objects.requireNonNull(catchingFishRealmFragment, "validator cannot be null");
        this.CatchingFishReduxKtor = catchingFishLiveDataMVI;
        this.CatchingFishDaggerWebsocket = catchingFishLiveDataMVI2;
        this.CatchingFishViewModelScope = catchingFishLiveDataMVI3;
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishWorkManager = catchingFishRealmFragment;
        if (catchingFishLiveDataMVI3 != null && catchingFishLiveDataMVI.CatchingFishReduxKtor.compareTo(catchingFishLiveDataMVI3.CatchingFishReduxKtor) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (catchingFishLiveDataMVI3 != null && catchingFishLiveDataMVI3.CatchingFishReduxKtor.compareTo(catchingFishLiveDataMVI2.CatchingFishReduxKtor) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > CatchingFishDaggerHiltMVP.CatchingFishCoroutine(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.CatchingFishFragmentHandler = catchingFishLiveDataMVI.CatchingFishReduxKtor(catchingFishLiveDataMVI2) + 1;
        this.CatchingFishLayout = (catchingFishLiveDataMVI2.CatchingFishWorkManager - catchingFishLiveDataMVI.CatchingFishWorkManager) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishCardViewOkHttp)) {
            return false;
        }
        CatchingFishCardViewOkHttp catchingFishCardViewOkHttp = (CatchingFishCardViewOkHttp) obj;
        return this.CatchingFishReduxKtor.equals(catchingFishCardViewOkHttp.CatchingFishReduxKtor) && this.CatchingFishDaggerWebsocket.equals(catchingFishCardViewOkHttp.CatchingFishDaggerWebsocket) && Objects.equals(this.CatchingFishViewModelScope, catchingFishCardViewOkHttp.CatchingFishViewModelScope) && this.CatchingFishViewModelFAB == catchingFishCardViewOkHttp.CatchingFishViewModelFAB && this.CatchingFishWorkManager.equals(catchingFishCardViewOkHttp.CatchingFishWorkManager);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishViewModelScope, Integer.valueOf(this.CatchingFishViewModelFAB), this.CatchingFishWorkManager});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.CatchingFishReduxKtor, 0);
        parcel.writeParcelable(this.CatchingFishDaggerWebsocket, 0);
        parcel.writeParcelable(this.CatchingFishViewModelScope, 0);
        parcel.writeParcelable(this.CatchingFishWorkManager, 0);
        parcel.writeInt(this.CatchingFishViewModelFAB);
    }
}
