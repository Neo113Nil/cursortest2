package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qnf implements snf {
    public static final qnf a = new qnf();

    @NotNull
    public static final Parcelable.Creator<qnf> CREATOR = new pnf(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qnf);
    }

    public final int hashCode() {
        return -2112333429;
    }

    public final String toString() {
        return "LastVibe";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
