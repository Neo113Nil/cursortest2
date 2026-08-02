package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l9o extends q9o {
    public static final l9o a = new l9o();

    @NotNull
    public static final Parcelable.Creator<l9o> CREATOR = new z8o(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l9o);
    }

    public final int hashCode() {
        return -500077251;
    }

    public final String toString() {
        return "SelectMethodScreenLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
