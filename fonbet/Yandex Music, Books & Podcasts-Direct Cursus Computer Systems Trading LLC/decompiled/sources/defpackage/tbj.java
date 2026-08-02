package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tbj implements ubj {
    public static final tbj a = new tbj();

    @NotNull
    public static final Parcelable.Creator<tbj> CREATOR = new mmh(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tbj);
    }

    public final int hashCode() {
        return -123328583;
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
