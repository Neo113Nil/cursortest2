package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class g9o extends q9o {
    public static final g9o a = new g9o();

    @NotNull
    public static final Parcelable.Creator<g9o> CREATOR = new z8o(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g9o);
    }

    public final int hashCode() {
        return -176317984;
    }

    public final String toString() {
        return "SbpChooserScreenLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
