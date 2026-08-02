package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o58 implements n58, l3j {

    @NotNull
    public static final Parcelable.Creator<o58> CREATOR = new vn7(9);
    public final hs5 a;
    public final String b;
    public final dg2 c;

    public o58(hs5 hs5Var, String str, dg2 dg2Var) {
        hs5Var.getClass();
        str.getClass();
        dg2Var.getClass();
        this.a = hs5Var;
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
        if (!(obj instanceof o58)) {
            return false;
        }
        o58 o58Var = (o58) obj;
        return Intrinsics.d(this.a, o58Var.a) && Intrinsics.d(this.b, o58Var.b) && this.c == o58Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TrackNew(disclaimer=" + this.a + ", trackId=" + this.b + ", trackAvailable=" + this.c + ")";
    }

    @Override // defpackage.n58
    public final String u() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
