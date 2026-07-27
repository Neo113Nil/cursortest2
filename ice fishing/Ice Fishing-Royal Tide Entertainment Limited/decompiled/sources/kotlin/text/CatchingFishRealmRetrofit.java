package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishRealmRetrofit implements Parcelable {
    public static final Parcelable.Creator<CatchingFishRealmRetrofit> CREATOR = new CatchingFishSnackbarPayPal(10);
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.CatchingFishReduxKtor);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        parcel.writeInt(this.CatchingFishWorkManager ? 1 : 0);
    }
}
