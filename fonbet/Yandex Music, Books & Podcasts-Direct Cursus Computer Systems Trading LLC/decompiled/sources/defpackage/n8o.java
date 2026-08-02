package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class n8o extends q9o {
    public static final n8o a = new n8o();

    @NotNull
    public static final Parcelable.Creator<n8o> CREATOR = new s2m(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n8o);
    }

    public final int hashCode() {
        return 613056236;
    }

    public final String toString() {
        return "CardInputScreenLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
