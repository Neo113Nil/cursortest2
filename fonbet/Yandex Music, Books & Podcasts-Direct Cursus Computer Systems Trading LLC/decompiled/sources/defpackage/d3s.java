package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d3s implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d3s> CREATOR = new b3s(0);
    public final String a;
    public final String b;
    public final String c;

    public d3s(String str, String str2, String str3) {
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
        if (!(obj instanceof d3s)) {
            return false;
        }
        d3s d3sVar = (d3s) obj;
        return Intrinsics.d(this.a, d3sVar.a) && Intrinsics.d(this.b, d3sVar.b) && Intrinsics.d(this.c, d3sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(f1d.m("Tag(id=", this.a, ", value=", this.b, ", name="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
