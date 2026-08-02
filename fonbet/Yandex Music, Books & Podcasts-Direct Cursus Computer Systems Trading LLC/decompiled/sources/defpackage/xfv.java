package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class xfv implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<xfv> CREATOR = new b3s(27);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public /* synthetic */ xfv(int i) {
        this(null, true, false, false, (i & 8) == 0, (i & 16) == 0, (i & 64) == 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfv)) {
            return false;
        }
        xfv xfvVar = (xfv) obj;
        return this.a == xfvVar.a && this.b == xfvVar.b && this.c == xfvVar.c && this.d == xfvVar.d && this.e == xfvVar.e && Intrinsics.d(this.f, xfvVar.f) && this.g == xfvVar.g;
    }

    public final int hashCode() {
        int e = k5r.e(k5r.e(k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder j = eta.j("WebViewSettings(javaScriptEnabled=", this.a, ", allowContentAccess=", this.b, ", allowFileAccess=");
        dfi.t(j, this.c, ", domStorageEnabled=", this.d, ", databaseEnabled=");
        j.append(this.e);
        j.append(", userAgentString=");
        j.append(this.f);
        j.append(", builtInZoomControls=");
        return ouj.r(j, this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public xfv(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = str;
        this.g = z6;
    }
}
