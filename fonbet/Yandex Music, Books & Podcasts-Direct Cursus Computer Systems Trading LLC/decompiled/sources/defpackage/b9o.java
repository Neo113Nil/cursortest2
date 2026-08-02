package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b9o extends q9o {
    public static final b9o a = new b9o();

    @NotNull
    public static final Parcelable.Creator<b9o> CREATOR = new z8o(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b9o);
    }

    public final int hashCode() {
        return 441533166;
    }

    public final String toString() {
        return "SbpBankOpenFailed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
