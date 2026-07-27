package kotlin.text;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishGlideEspresso implements Parcelable {
    public static final Parcelable.Creator<CatchingFishGlideEspresso> CREATOR = new CatchingFishSnackbarPayPal(9);
    public final Intent CatchingFishDaggerWebsocket;
    public final IntentSender CatchingFishReduxKtor;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishGlideEspresso(IntentSender intentSender, Intent intent, int i, int i2) {
        this.CatchingFishReduxKtor = intentSender;
        this.CatchingFishDaggerWebsocket = intent;
        this.CatchingFishWorkManager = i;
        this.CatchingFishViewModelScope = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(parcel, "dest");
        parcel.writeParcelable(this.CatchingFishReduxKtor, i);
        parcel.writeParcelable(this.CatchingFishDaggerWebsocket, i);
        parcel.writeInt(this.CatchingFishWorkManager);
        parcel.writeInt(this.CatchingFishViewModelScope);
    }
}
