package kotlin.text;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishRealmFragment implements Parcelable {
    public static final Parcelable.Creator<CatchingFishRealmFragment> CREATOR = new CatchingFishSnackbarPayPal(5);
    public final long CatchingFishReduxKtor;

    public CatchingFishRealmFragment(long j) {
        this.CatchingFishReduxKtor = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishRealmFragment) && this.CatchingFishReduxKtor == ((CatchingFishRealmFragment) obj).CatchingFishReduxKtor;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.CatchingFishReduxKtor)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.CatchingFishReduxKtor);
    }
}
