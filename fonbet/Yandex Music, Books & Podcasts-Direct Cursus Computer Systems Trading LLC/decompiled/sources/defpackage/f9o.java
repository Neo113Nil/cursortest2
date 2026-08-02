package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class f9o extends q9o {
    public static final f9o a = new f9o();

    @NotNull
    public static final Parcelable.Creator<f9o> CREATOR = new z8o(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f9o);
    }

    public final int hashCode() {
        return -1361285591;
    }

    public final String toString() {
        return "SbpBindingSuccess";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
