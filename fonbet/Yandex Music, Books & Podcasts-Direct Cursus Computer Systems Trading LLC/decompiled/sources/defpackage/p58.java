package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class p58 implements n58 {

    @NotNull
    public static final Parcelable.Creator<p58> CREATOR = new vn7(10);
    public final h94 a;
    public final String b;
    public final dg2 c;

    public p58(h94 h94Var, String str, dg2 dg2Var) {
        h94Var.getClass();
        str.getClass();
        dg2Var.getClass();
        this.a = h94Var;
        this.b = str;
        this.c = dg2Var;
    }

    @Override // defpackage.n58
    public final dg2 S() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p58)) {
            return false;
        }
        p58 p58Var = (p58) obj;
        return this.a == p58Var.a && Intrinsics.d(this.b, p58Var.b) && this.c == p58Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TrackOld(reason=" + this.a + ", trackId=" + this.b + ", trackAvailable=" + this.c + ")";
    }

    @Override // defpackage.n58
    public final String u() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
