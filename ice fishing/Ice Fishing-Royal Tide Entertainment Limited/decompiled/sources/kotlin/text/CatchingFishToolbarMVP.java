package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishToolbarMVP extends View.BaseSavedState {
    public static final Parcelable.Creator<CatchingFishToolbarMVP> CREATOR = new CatchingFishSnackbarPayPal(1);
    public boolean CatchingFishReduxKtor;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.CatchingFishReduxKtor ? (byte) 1 : (byte) 0);
    }
}
