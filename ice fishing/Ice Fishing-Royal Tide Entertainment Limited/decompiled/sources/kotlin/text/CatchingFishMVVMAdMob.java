package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishMVVMAdMob implements Parcelable {
    public static final Parcelable.Creator<CatchingFishMVVMAdMob> CREATOR = new CatchingFishSnackbarPayPal(18);
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public boolean CatchingFishViewModelScope;
    public int[] CatchingFishWorkManager;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.CatchingFishReduxKtor + ", mGapDir=" + this.CatchingFishDaggerWebsocket + ", mHasUnwantedGapAfter=" + this.CatchingFishViewModelScope + ", mGapPerSpan=" + Arrays.toString(this.CatchingFishWorkManager) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.CatchingFishReduxKtor);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        parcel.writeInt(this.CatchingFishViewModelScope ? 1 : 0);
        int[] iArr = this.CatchingFishWorkManager;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.CatchingFishWorkManager);
        }
    }
}
