package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class mnv extends rnv {
    public static final mnv a = new mnv();

    @NotNull
    public static final Parcelable.Creator<mnv> CREATOR = new b3s(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mnv);
    }

    public final int hashCode() {
        return -2080345598;
    }

    public final String toString() {
        return "DefaultLibraryRecently";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
