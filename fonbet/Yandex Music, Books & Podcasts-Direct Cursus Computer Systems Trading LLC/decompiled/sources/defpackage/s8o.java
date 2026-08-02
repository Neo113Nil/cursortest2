package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class s8o extends q9o {
    public static final s8o a = new s8o();

    @NotNull
    public static final Parcelable.Creator<s8o> CREATOR = new s2m(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s8o);
    }

    public final int hashCode() {
        return 451586640;
    }

    public final String toString() {
        return "NewCardPaymentLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
