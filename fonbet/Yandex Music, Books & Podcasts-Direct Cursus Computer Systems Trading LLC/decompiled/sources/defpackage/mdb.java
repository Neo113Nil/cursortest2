package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mdb implements odb {
    public static final mdb a = new mdb();

    @NotNull
    public static final Parcelable.Creator<mdb> CREATOR = new vn7(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mdb);
    }

    public final int hashCode() {
        return 1725284411;
    }

    public final String toString() {
        return "ChangeUser";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
