package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s02 extends l9 {

    @NonNull
    public static final Parcelable.Creator<s02> CREATOR = new oex(13);
    public final ju1 a;
    public final Boolean b;
    public final mtt c;
    public final z1o d;

    public s02(String str, String str2, Boolean bool, String str3) {
        ju1 a;
        z1o z1oVar = null;
        if (str == null) {
            a = null;
        } else {
            try {
                a = ju1.a(str);
            } catch (iu1 | j3x | y1o e) {
                xq0.t(e);
                throw null;
            }
        }
        this.a = a;
        this.b = bool;
        this.c = str2 == null ? null : mtt.a(str2);
        if (str3 != null) {
            z1oVar = z1o.a(str3);
        }
        this.d = z1oVar;
    }

    public final z1o d() {
        z1o z1oVar = this.d;
        if (z1oVar != null) {
            return z1oVar;
        }
        Boolean bool = this.b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return z1o.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s02)) {
            return false;
        }
        s02 s02Var = (s02) obj;
        return ldg.s(this.a, s02Var.a) && ldg.s(this.b, s02Var.b) && ldg.s(this.c, s02Var.c) && ldg.s(d(), s02Var.d());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, d()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder u = ouj.u("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        u.append(this.b);
        u.append(", \n requireUserVerification=");
        u.append(valueOf2);
        u.append(", \n residentKeyRequirement=");
        return su4.o(u, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        ju1 ju1Var = this.a;
        o8g.j0(parcel, 2, ju1Var == null ? null : ju1Var.a);
        o8g.a0(parcel, 3, this.b);
        mtt mttVar = this.c;
        o8g.j0(parcel, 4, mttVar == null ? null : mttVar.a);
        z1o d = d();
        o8g.j0(parcel, 5, d != null ? d.a : null);
        o8g.p0(parcel, o0);
    }
}
