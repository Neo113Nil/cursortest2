package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class gxp extends jxp {

    @NotNull
    public static final Parcelable.Creator<gxp> CREATOR = new bwp(5);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public gxp(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        eta.r(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxp)) {
            return false;
        }
        gxp gxpVar = (gxp) obj;
        return Intrinsics.d(this.a, gxpVar.a) && Intrinsics.d(this.b, gxpVar.b) && Intrinsics.d(this.c, gxpVar.c) && Intrinsics.d(this.d, gxpVar.d) && this.e == gxpVar.e && this.f == gxpVar.f && Intrinsics.d(this.g, gxpVar.g);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlaylistId(id=", this.a, ", ownerLogin=", this.b, ", ownerId=");
        su4.v(m, this.c, ", kind=", this.d, ", isChart=");
        dfi.t(m, this.e, ", withTrailerOpen=", this.f, ", uuid=");
        return su4.o(m, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g);
    }
}
