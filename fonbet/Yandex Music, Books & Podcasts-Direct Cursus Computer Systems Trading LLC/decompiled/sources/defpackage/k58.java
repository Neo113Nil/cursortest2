package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k58 implements j58, l3j {

    @NotNull
    public static final Parcelable.Creator<k58> CREATOR = new vn7(6);
    public final hs5 a;
    public final String b;
    public final boolean c;

    public k58(hs5 hs5Var, String str, boolean z) {
        hs5Var.getClass();
        str.getClass();
        this.a = hs5Var;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.j58
    public final String M() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k58)) {
            return false;
        }
        k58 k58Var = (k58) obj;
        return Intrinsics.d(this.a, k58Var.a) && Intrinsics.d(this.b, k58Var.b) && this.c == k58Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.j58
    public final boolean r() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumNew(disclaimer=");
        sb.append(this.a);
        sb.append(", albumId=");
        sb.append(this.b);
        sb.append(", available=");
        return ouj.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
