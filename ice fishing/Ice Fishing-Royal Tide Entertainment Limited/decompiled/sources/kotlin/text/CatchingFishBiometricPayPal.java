package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishBiometricPayPal implements Parcelable {
    public static final Parcelable.Creator<CatchingFishBiometricPayPal> CREATOR = new CatchingFishSnackbarPayPal(19);
    public boolean CatchingFishCloudMessaging;
    public int CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public ArrayList CatchingFishFragmentHandler;
    public int[] CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public int CatchingFishReduxKtor;
    public int CatchingFishViewModelFAB;
    public int[] CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.CatchingFishReduxKtor);
        parcel.writeInt(this.CatchingFishDaggerWebsocket);
        parcel.writeInt(this.CatchingFishWorkManager);
        if (this.CatchingFishWorkManager > 0) {
            parcel.writeIntArray(this.CatchingFishViewModelScope);
        }
        parcel.writeInt(this.CatchingFishViewModelFAB);
        if (this.CatchingFishViewModelFAB > 0) {
            parcel.writeIntArray(this.CatchingFishLayout);
        }
        parcel.writeInt(this.CatchingFishCloudMessaging ? 1 : 0);
        parcel.writeInt(this.CatchingFishEspressoTesting ? 1 : 0);
        parcel.writeInt(this.CatchingFishOkHttp ? 1 : 0);
        parcel.writeList(this.CatchingFishFragmentHandler);
    }
}
