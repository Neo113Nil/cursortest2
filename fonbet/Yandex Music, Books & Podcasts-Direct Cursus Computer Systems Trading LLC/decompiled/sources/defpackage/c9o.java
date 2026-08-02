package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class c9o extends q9o {
    public static final c9o a = new c9o();

    @NotNull
    public static final Parcelable.Creator<c9o> CREATOR = new z8o(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof c9o);
    }

    public final int hashCode() {
        return -888557301;
    }

    public final String toString() {
        return "SbpBankOpeningLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
