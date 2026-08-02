package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a58 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a58> CREATOR = new vn7(4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final f58 f;

    public a58(String str, String str2, String str3, String str4, String str5, f58 f58Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = f58Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a58)) {
            return false;
        }
        a58 a58Var = (a58) obj;
        return Intrinsics.d(this.a, a58Var.a) && Intrinsics.d(this.b, a58Var.b) && Intrinsics.d(this.c, a58Var.c) && Intrinsics.d(this.d, a58Var.d) && Intrinsics.d(this.e, a58Var.e) && Intrinsics.d(this.f, a58Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f58 f58Var = this.f;
        return hashCode3 + (f58Var != null ? f58Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Disclaimer(id=", this.a, ", type=", this.b, ", reason=");
        su4.v(m, this.c, ", title=", this.d, ", description=");
        m.append(this.e);
        m.append(", details=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        f58 f58Var = this.f;
        if (f58Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f58Var.writeToParcel(parcel, i);
        }
    }
}
