package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class j9o extends q9o {
    public static final j9o a = new j9o();

    @NotNull
    public static final Parcelable.Creator<j9o> CREATOR = new z8o(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof j9o);
    }

    public final int hashCode() {
        return 506906817;
    }

    public final String toString() {
        return "SbpPaymentLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
