package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iy implements ky {
    public static final iy a = new iy();

    @NotNull
    public static final Parcelable.Creator<iy> CREATOR = new l(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof iy);
    }

    public final int hashCode() {
        return -360243245;
    }

    public final String toString() {
        return "Downloaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
