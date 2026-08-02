package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c44 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c44> CREATOR = new i02(23);
    public final f24 a;
    public final String b;
    public final boolean c;
    public final int d;

    public c44(f24 f24Var, String str, boolean z, int i) {
        f24Var.getClass();
        str.getClass();
        this.a = f24Var;
        this.b = str;
        this.c = z;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c44)) {
            return false;
        }
        c44 c44Var = (c44) obj;
        return this.a == c44Var.a && Intrinsics.d(this.b, c44Var.b) && this.c == c44Var.c && this.d == c44Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "CarouselPinSectionData(type=" + this.a + ", title=" + this.b + ", pinned=" + this.c + ", position=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }
}
