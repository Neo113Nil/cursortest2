package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class wvq extends zvq {
    public static final wvq a = new wvq();

    @NotNull
    public static final Parcelable.Creator<wvq> CREATOR = new bwp(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wvq);
    }

    public final int hashCode() {
        return -966382426;
    }

    public final String toString() {
        return "SlidesScreenKids";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
