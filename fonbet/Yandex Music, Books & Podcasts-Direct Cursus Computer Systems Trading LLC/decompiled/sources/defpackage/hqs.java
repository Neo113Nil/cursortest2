package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class hqs implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<hqs> CREATOR = new b3s(7);
    public final boolean a;
    public final boolean b;

    public hqs(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqs)) {
            return false;
        }
        hqs hqsVar = (hqs) obj;
        return this.a == hqsVar.a && this.b == hqsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("LyricsInfo(hasAvailableTextLyrics=", this.a, ", hasAvailableSyncLyrics=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
