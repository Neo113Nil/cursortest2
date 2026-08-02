package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class vc6 implements ad6 {
    public static final vc6 a = new vc6();

    @NotNull
    public static final Parcelable.Creator<vc6> CREATOR = new kg4(15);

    @Override // defpackage.ad6
    public final String R() {
        return "alice-pro";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vc6);
    }

    public final int hashCode() {
        return -1007157938;
    }

    public final String toString() {
        return "AlicePro";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
