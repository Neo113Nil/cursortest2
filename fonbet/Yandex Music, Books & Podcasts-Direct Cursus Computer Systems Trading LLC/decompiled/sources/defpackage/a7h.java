package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a7h implements b7h {
    public static final a7h a = new a7h();

    @NotNull
    public static final Parcelable.Creator<a7h> CREATOR = new pnf(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a7h);
    }

    public final int hashCode() {
        return 1108399949;
    }

    public final String toString() {
        return "WaveGroups";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
