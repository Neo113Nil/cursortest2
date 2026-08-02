package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class vy2 extends l9 {

    @NonNull
    public static final Parcelable.Creator<vy2> CREATOR = new onv(15);
    public final uy2 a;
    public final ry2 b;
    public final String c;
    public final boolean d;
    public final int e;
    public final ty2 f;
    public final sy2 g;
    public final boolean h;

    public vy2(uy2 uy2Var, ry2 ry2Var, String str, boolean z, int i, ty2 ty2Var, sy2 sy2Var, boolean z2) {
        y1g.G(uy2Var);
        this.a = uy2Var;
        y1g.G(ry2Var);
        this.b = ry2Var;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = ty2Var == null ? new ty2(false, null, null) : ty2Var;
        this.g = sy2Var == null ? new sy2(false, null) : sy2Var;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vy2)) {
            return false;
        }
        vy2 vy2Var = (vy2) obj;
        return ldg.s(this.a, vy2Var.a) && ldg.s(this.b, vy2Var.b) && ldg.s(this.f, vy2Var.f) && ldg.s(this.g, vy2Var.g) && ldg.s(this.c, vy2Var.c) && this.d == vy2Var.d && this.e == vy2Var.e && this.h == vy2Var.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.i0(parcel, 2, this.b, i);
        o8g.j0(parcel, 3, this.c);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.d ? 1 : 0);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.e);
        o8g.i0(parcel, 6, this.f, i);
        o8g.i0(parcel, 7, this.g, i);
        o8g.q0(8, 4, parcel);
        parcel.writeInt(this.h ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
