package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class uy5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<uy5> CREATOR = new kg4(12);
    public final int a;
    public final String b;
    public final String c;

    public uy5(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy5)) {
            return false;
        }
        uy5 uy5Var = (uy5) obj;
        return this.a == uy5Var.a && Intrinsics.d(this.b, uy5Var.b) && Intrinsics.d(this.c, uy5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(k5r.r(this.a, "ConcertPrice(value=", ", currency=", this.b, ", currencySymbol="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
