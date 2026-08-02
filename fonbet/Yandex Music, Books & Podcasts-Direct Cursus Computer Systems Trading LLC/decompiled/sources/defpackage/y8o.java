package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class y8o extends q9o {
    public static final y8o a = new y8o();

    @NotNull
    public static final Parcelable.Creator<y8o> CREATOR = new s2m(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y8o);
    }

    public final int hashCode() {
        return 754824083;
    }

    public final String toString() {
        return "PreselectLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
