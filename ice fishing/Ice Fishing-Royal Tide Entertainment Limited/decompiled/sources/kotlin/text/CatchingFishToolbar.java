package kotlin.text;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CatchingFishToolbar implements Parcelable {
    public static final Parcelable.Creator<CatchingFishToolbar> CREATOR = new CatchingFishSnackbarPayPal(0);
    public final Intent CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;

    public CatchingFishToolbar(Intent intent, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.CatchingFishReduxKtor;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.CatchingFishDaggerWebsocket);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(parcel, "dest");
        parcel.writeInt(this.CatchingFishReduxKtor);
        Intent intent = this.CatchingFishDaggerWebsocket;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
