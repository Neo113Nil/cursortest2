package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class cs3 implements Parcelable {
    public static final Parcelable.Creator<cs3> CREATOR = new i02(16);
    public final sdi a;
    public final sdi b;
    public final vd7 c;
    public final sdi d;
    public final int e;
    public final int f;
    public final int g;

    public cs3(sdi sdiVar, sdi sdiVar2, vd7 vd7Var, sdi sdiVar3, int i) {
        Objects.requireNonNull(sdiVar, "start cannot be null");
        Objects.requireNonNull(sdiVar2, "end cannot be null");
        Objects.requireNonNull(vd7Var, "validator cannot be null");
        this.a = sdiVar;
        this.b = sdiVar2;
        this.d = sdiVar3;
        this.e = i;
        this.c = vd7Var;
        if (sdiVar3 != null && sdiVar.a.compareTo(sdiVar3.a) > 0) {
            xq0.x("start Month cannot be after current Month");
            throw null;
        }
        if (sdiVar3 != null && sdiVar3.a.compareTo(sdiVar2.a) > 0) {
            xq0.x("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > fut.c(null).getMaximum(7)) {
            xq0.x("firstDayOfWeek is not valid");
            throw null;
        }
        this.g = sdiVar.e(sdiVar2) + 1;
        this.f = (sdiVar2.c - sdiVar.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs3)) {
            return false;
        }
        cs3 cs3Var = (cs3) obj;
        return this.a.equals(cs3Var.a) && this.b.equals(cs3Var.b) && Objects.equals(this.d, cs3Var.d) && this.e == cs3Var.e && this.c.equals(cs3Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
