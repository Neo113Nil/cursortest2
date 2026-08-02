package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class o9o extends q9o {
    public static final o9o a = new o9o();

    @NotNull
    public static final Parcelable.Creator<o9o> CREATOR = new z8o(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o9o);
    }

    public final int hashCode() {
        return -1785592277;
    }

    public final String toString() {
        return "VerificationLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
