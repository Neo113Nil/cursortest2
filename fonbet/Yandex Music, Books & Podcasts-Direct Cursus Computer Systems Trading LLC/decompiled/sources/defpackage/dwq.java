package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class dwq extends zvq {
    public static final dwq a = new dwq();

    @NotNull
    public static final Parcelable.Creator<dwq> CREATOR = new bwp(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dwq);
    }

    public final int hashCode() {
        return -966074876;
    }

    public final String toString() {
        return "SlidesScreenUser";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
