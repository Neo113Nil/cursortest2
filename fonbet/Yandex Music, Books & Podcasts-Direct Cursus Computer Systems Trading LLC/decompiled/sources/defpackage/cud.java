package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cud extends dud {
    public static final cud a = new cud();

    @NotNull
    public static final Parcelable.Creator<cud> CREATOR = new a5c(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cud);
    }

    public final int hashCode() {
        return 603778656;
    }

    public final String toString() {
        return "Undefined";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
