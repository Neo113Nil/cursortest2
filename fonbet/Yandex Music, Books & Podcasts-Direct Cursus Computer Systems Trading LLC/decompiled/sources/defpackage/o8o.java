package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class o8o extends q9o {
    public static final o8o a = new o8o();

    @NotNull
    public static final Parcelable.Creator<o8o> CREATOR = new s2m(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o8o);
    }

    public final int hashCode() {
        return 2062665099;
    }

    public final String toString() {
        return "ChallengerScreenLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
