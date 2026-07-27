package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishDaggerFirebase extends View.BaseSavedState {
    public static final Parcelable.Creator<CatchingFishDaggerFirebase> CREATOR = new CatchingFishSnackbarPayPal(13);
    public int CatchingFishReduxKtor;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.CatchingFishReduxKtor + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.CatchingFishReduxKtor);
    }
}
