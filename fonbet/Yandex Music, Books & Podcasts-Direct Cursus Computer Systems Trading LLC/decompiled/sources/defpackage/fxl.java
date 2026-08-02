package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fxl implements lxl {
    public static final fxl a = new fxl();

    @NotNull
    public static final Parcelable.Creator<fxl> CREATOR = new tgk(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fxl);
    }

    @Override // defpackage.lxl
    public final String getId() {
        return "chart";
    }

    public final int hashCode() {
        return 1664056480;
    }

    public final String toString() {
        return "Chart";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
