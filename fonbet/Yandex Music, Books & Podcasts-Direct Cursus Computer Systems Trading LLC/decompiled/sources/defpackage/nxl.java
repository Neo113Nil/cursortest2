package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nxl implements oxl {
    public static final nxl a = new nxl();

    @NotNull
    public static final Parcelable.Creator<nxl> CREATOR = new tgk(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof nxl);
    }

    public final int hashCode() {
        return -1531438759;
    }

    public final String toString() {
        return "Online";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
