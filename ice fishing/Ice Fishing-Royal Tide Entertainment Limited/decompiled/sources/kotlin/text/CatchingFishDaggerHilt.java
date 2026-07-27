package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class CatchingFishDaggerHilt implements Parcelable {
    public final Parcelable CatchingFishReduxKtor;
    public static final CatchingFishViewModel CatchingFishDaggerWebsocket = new CatchingFishViewModel();
    public static final Parcelable.Creator<CatchingFishDaggerHilt> CREATOR = new CatchingFishReduxHilt(1);

    public CatchingFishDaggerHilt() {
        this.CatchingFishReduxKtor = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.CatchingFishReduxKtor, i);
    }

    public CatchingFishDaggerHilt(Parcelable parcelable) {
        if (parcelable != null) {
            this.CatchingFishReduxKtor = parcelable == CatchingFishDaggerWebsocket ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public CatchingFishDaggerHilt(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.CatchingFishReduxKtor = readParcelable == null ? CatchingFishDaggerWebsocket : readParcelable;
    }
}
