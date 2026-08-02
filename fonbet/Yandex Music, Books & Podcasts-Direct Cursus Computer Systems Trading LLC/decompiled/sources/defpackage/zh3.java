package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zh3 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zh3> CREATOR = new i02(15);
    public final String a;
    public final String b;
    public final String c;

    public zh3(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh3)) {
            return false;
        }
        zh3 zh3Var = (zh3) obj;
        return Intrinsics.d(this.a, zh3Var.a) && Intrinsics.d(this.b, zh3Var.b) && Intrinsics.d(this.c, zh3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(f1d.m("BrowserCard(number=", this.a, ", expirationMonth=", this.b, ", expirationYear="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
