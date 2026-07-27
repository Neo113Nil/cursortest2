package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreLayout implements Parcelable {
    public static final Parcelable.Creator<CatchingFishDataStoreLayout> CREATOR = new CatchingFishSnackbarPayPal(7);
    public ArrayList CatchingFishCloudMessaging;
    public ArrayList CatchingFishDaggerWebsocket;
    public ArrayList CatchingFishFragmentHandler;
    public ArrayList CatchingFishLayout;
    public ArrayList CatchingFishReduxKtor;
    public String CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public CatchingFishViewUnitTesting[] CatchingFishWorkManager;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.CatchingFishReduxKtor);
        parcel.writeStringList(this.CatchingFishDaggerWebsocket);
        parcel.writeTypedArray(this.CatchingFishWorkManager, i);
        parcel.writeInt(this.CatchingFishViewModelScope);
        parcel.writeString(this.CatchingFishViewModelFAB);
        parcel.writeStringList(this.CatchingFishLayout);
        parcel.writeTypedList(this.CatchingFishFragmentHandler);
        parcel.writeTypedList(this.CatchingFishCloudMessaging);
    }
}
