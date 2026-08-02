package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class s451 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rbv c;
    public final boolean d;
    public final boolean e;
    public final ColorModel f;
    public final ColorModel g;
    public final ColorModel h;
    public final p1b i;
    public final boolean j;

    public s451(Text.Constant constant, Text.Constant constant2, rbv rbvVar, boolean z, boolean z2, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, p1b p1bVar, boolean z3) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
        this.d = z;
        this.e = z2;
        this.f = colorModel;
        this.g = colorModel2;
        this.h = colorModel3;
        this.i = p1bVar;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s451) {
            s451 s451Var = (s451) obj;
            if (this.a.equals(s451Var.a) && this.b.equals(s451Var.b) && jl40.l(this.c, s451Var.c) && this.d == s451Var.d && this.e == s451Var.e && this.f.equals(s451Var.f) && this.g.equals(s451Var.g) && this.h.equals(s451Var.h) && this.i == s451Var.i && this.j == s451Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        rbv rbvVar = this.c;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + vfc.d(this.h, vfc.d(this.g, vfc.d(this.f, unr0.e(unr0.e((d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31, this.d), 31, this.e), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("State(title=", this.a, ", description=", this.b, ", image=");
        u.append(this.c);
        u.append(", checked=");
        u.append(this.d);
        u.append(", loading=");
        u.append(this.e);
        u.append(", backgroundColor=");
        u.append(this.f);
        u.append(", titleTextColor=");
        smw0.z(u, this.g, ", descriptionTextColor=", this.h, ", switchColor=");
        u.append(this.i);
        u.append(", enabled=");
        u.append(this.j);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
