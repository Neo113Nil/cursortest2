package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class tuq extends zvq {
    public static final tuq a = new tuq();

    @NotNull
    public static final Parcelable.Creator<tuq> CREATOR = new bwp(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof tuq);
    }

    public final int hashCode() {
        return -1261344122;
    }

    public final String toString() {
        return "SlidesDebug";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
