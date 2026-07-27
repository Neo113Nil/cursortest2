package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowRoom extends View.BaseSavedState {
    public static final Parcelable.Creator<CatchingFishStateFlowRoom> CREATOR = new CatchingFishSnackbarPayPal(11);
    public int CatchingFishReduxKtor;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.CatchingFishReduxKtor;
        return CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.CatchingFishReduxKtor));
    }
}
