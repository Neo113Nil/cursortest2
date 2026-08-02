package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class q8o extends q9o {
    public static final q8o a = new q8o();

    @NotNull
    public static final Parcelable.Creator<q8o> CREATOR = new s2m(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q8o);
    }

    public final int hashCode() {
        return -464637527;
    }

    public final String toString() {
        return "IPaymentLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
