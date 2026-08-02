package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jy implements ky {
    public static final jy a = new jy();

    @NotNull
    public static final Parcelable.Creator<jy> CREATOR = new l(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jy);
    }

    public final int hashCode() {
        return 364919039;
    }

    public final String toString() {
        return "Online";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
