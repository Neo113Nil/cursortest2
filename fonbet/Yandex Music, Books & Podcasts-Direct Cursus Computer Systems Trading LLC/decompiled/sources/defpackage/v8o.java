package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class v8o extends q9o {
    public static final v8o a = new v8o();

    @NotNull
    public static final Parcelable.Creator<v8o> CREATOR = new s2m(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v8o);
    }

    public final int hashCode() {
        return 1629289811;
    }

    public final String toString() {
        return "PaymentSuccess";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
