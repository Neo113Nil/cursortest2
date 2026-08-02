package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class e9o extends q9o {
    public static final e9o a = new e9o();

    @NotNull
    public static final Parcelable.Creator<e9o> CREATOR = new z8o(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e9o);
    }

    public final int hashCode() {
        return 842534754;
    }

    public final String toString() {
        return "SbpBindingLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
