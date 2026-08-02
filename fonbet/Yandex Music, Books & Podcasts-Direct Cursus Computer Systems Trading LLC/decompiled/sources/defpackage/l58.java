package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l58 implements j58 {

    @NotNull
    public static final Parcelable.Creator<l58> CREATOR = new vn7(7);
    public final h94 a;
    public final String b;
    public final boolean c;

    public l58(h94 h94Var, String str, boolean z) {
        h94Var.getClass();
        str.getClass();
        this.a = h94Var;
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
        if (!(obj instanceof l58)) {
            return false;
        }
        l58 l58Var = (l58) obj;
        return this.a == l58Var.a && Intrinsics.d(this.b, l58Var.b) && this.c == l58Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // defpackage.j58
    public final boolean r() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumOld(reason=");
        sb.append(this.a);
        sb.append(", albumId=");
        sb.append(this.b);
        sb.append(", available=");
        return ouj.r(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
