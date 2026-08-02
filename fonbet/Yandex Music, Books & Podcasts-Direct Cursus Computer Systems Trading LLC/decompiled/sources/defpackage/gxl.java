package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gxl implements lxl {

    @NotNull
    public static final Parcelable.Creator<gxl> CREATOR = new tgk(22);
    public final long a;
    public final String b;

    public gxl(long j) {
        this.a = j;
        this.b = String.valueOf(j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxl) && this.a == ((gxl) obj).a;
    }

    @Override // defpackage.lxl
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "DatabaseId(nativeId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a);
    }
}
