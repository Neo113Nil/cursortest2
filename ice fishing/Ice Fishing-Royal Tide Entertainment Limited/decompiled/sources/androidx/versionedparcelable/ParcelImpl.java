package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.text.CatchingFishParcelableMVP;
import kotlin.text.CatchingFishParcelableToast;
import kotlin.text.CatchingFishSnackbarPayPal;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new CatchingFishSnackbarPayPal(14);
    public final CatchingFishParcelableToast CatchingFishReduxKtor;

    public ParcelImpl(Parcel parcel) {
        this.CatchingFishReduxKtor = new CatchingFishParcelableMVP(parcel).CatchingFishViewModelScope();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new CatchingFishParcelableMVP(parcel).CatchingFishLayout(this.CatchingFishReduxKtor);
    }
}
