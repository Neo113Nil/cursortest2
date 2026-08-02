package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class eci implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<eci> CREATOR = new mmh(15);
    public final String a;
    public final String b;
    public final String c;
    public final f58 d;
    public final jyr e;

    public eci(String str, String str2, String str3, f58 f58Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f58Var;
        this.e = btf.b(new dmg(18, this));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eci)) {
            return false;
        }
        eci eciVar = (eci) obj;
        return Intrinsics.d(this.a, eciVar.a) && Intrinsics.d(this.b, eciVar.b) && Intrinsics.d(this.c, eciVar.c) && Intrinsics.d(this.d, eciVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        f58 f58Var = this.d;
        return hashCode + (f58Var != null ? f58Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ModalDisclaimer(reasonRaw=", this.a, ", title=", this.b, ", description=");
        m.append(this.c);
        m.append(", details=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        f58 f58Var = this.d;
        if (f58Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            f58Var.writeToParcel(parcel, i);
        }
    }
}
