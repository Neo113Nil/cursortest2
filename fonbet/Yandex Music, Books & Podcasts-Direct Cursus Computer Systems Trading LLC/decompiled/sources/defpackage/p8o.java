package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class p8o extends q9o {
    public static final p8o a = new p8o();

    @NotNull
    public static final Parcelable.Creator<p8o> CREATOR = new s2m(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p8o);
    }

    public final int hashCode() {
        return 1989632579;
    }

    public final String toString() {
        return "CvvScreenLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
