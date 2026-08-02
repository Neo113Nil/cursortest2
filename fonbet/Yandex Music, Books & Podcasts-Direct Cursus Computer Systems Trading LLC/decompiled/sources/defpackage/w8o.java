package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class w8o extends q9o {
    public static final w8o a = new w8o();

    @NotNull
    public static final Parcelable.Creator<w8o> CREATOR = new s2m(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w8o);
    }

    public final int hashCode() {
        return -1270200466;
    }

    public final String toString() {
        return "PrepareForPayment";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
