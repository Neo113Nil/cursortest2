package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishFragmentGradle implements Parcelable {
    public static final Parcelable.Creator<CatchingFishFragmentGradle> CREATOR = new CatchingFishSnackbarPayPal(3);
    public final ArrayList CatchingFishDaggerWebsocket;
    public final ArrayList CatchingFishReduxKtor;

    public CatchingFishFragmentGradle(Parcel parcel) {
        this.CatchingFishReduxKtor = parcel.createStringArrayList();
        this.CatchingFishDaggerWebsocket = parcel.createTypedArrayList(CatchingFishViewUnitTesting.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.CatchingFishReduxKtor);
        parcel.writeTypedList(this.CatchingFishDaggerWebsocket);
    }
}
