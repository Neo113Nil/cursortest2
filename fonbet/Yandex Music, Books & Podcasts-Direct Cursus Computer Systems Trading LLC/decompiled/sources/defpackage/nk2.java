package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class nk2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<nk2> CREATOR = new i02(8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public nk2(String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk2)) {
            return false;
        }
        nk2 nk2Var = (nk2) obj;
        return Intrinsics.d(this.a, nk2Var.a) && Intrinsics.d(this.b, nk2Var.b) && Intrinsics.d(this.c, nk2Var.c) && Intrinsics.d(this.d, nk2Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ouj.q(f1d.m("BandLink(title=", this.a, ", subtitle=", this.b, ", url="), this.c, ", imageUrl=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
