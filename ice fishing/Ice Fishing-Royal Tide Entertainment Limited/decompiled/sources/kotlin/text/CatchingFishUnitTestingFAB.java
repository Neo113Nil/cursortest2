package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishUnitTestingFAB implements Parcelable {
    public static final Parcelable.Creator<CatchingFishUnitTestingFAB> CREATOR = new CatchingFishSnackbarPayPal(6);
    public int CatchingFishDaggerWebsocket;
    public String CatchingFishReduxKtor;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.CatchingFishReduxKtor);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
    }
}
