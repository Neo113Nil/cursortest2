package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l8o extends q9o {
    public static final l8o a = new l8o();

    @NotNull
    public static final Parcelable.Creator<l8o> CREATOR = new s2m(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l8o);
    }

    public final int hashCode() {
        return -1713994403;
    }

    public final String toString() {
        return "CardBindingLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
