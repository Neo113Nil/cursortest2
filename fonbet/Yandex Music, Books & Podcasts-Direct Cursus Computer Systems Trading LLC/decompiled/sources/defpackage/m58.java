package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m58 implements l3j, q58 {

    @NotNull
    public static final Parcelable.Creator<m58> CREATOR = new vn7(8);
    public final hs5 a;
    public final String b;
    public final boolean c;

    public m58(hs5 hs5Var, String str, boolean z) {
        hs5Var.getClass();
        str.getClass();
        this.a = hs5Var;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m58)) {
            return false;
        }
        m58 m58Var = (m58) obj;
        return Intrinsics.d(this.a, m58Var.a) && Intrinsics.d(this.b, m58Var.b) && this.c == m58Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistNew(disclaimer=");
        sb.append(this.a);
        sb.append(", artistId=");
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
