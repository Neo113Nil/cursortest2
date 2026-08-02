package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class r451 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rbv c;
    public final boolean d;
    public final ColorModel e;
    public final ColorModel f;
    public final ColorModel g;
    public final ColorModel h;
    public final ColorModel i;
    public final Text.Constant j;

    public r451(Text.Constant constant, Text.Constant constant2, rbv rbvVar, boolean z, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, Text.Constant constant3) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
        this.d = z;
        this.e = colorModel;
        this.f = colorModel2;
        this.g = colorModel3;
        this.h = colorModel4;
        this.i = colorModel5;
        this.j = constant3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r451)) {
            return false;
        }
        r451 r451Var = (r451) obj;
        return this.a.equals(r451Var.a) && this.b.equals(r451Var.b) && jl40.l(this.c, r451Var.c) && this.d == r451Var.d && this.e.equals(r451Var.e) && this.f.equals(r451Var.f) && this.g.equals(r451Var.g) && jl40.l(this.h, r451Var.h) && jl40.l(this.i, r451Var.i) && this.j.equals(r451Var.j);
    }

    public final int hashCode() {
        int d = xvz.d(this.b, this.a.hashCode() * 31, 31);
        rbv rbvVar = this.c;
        int d2 = vfc.d(this.g, vfc.d(this.f, vfc.d(this.e, unr0.e((d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31, this.d), 31), 31), 31);
        ColorModel colorModel = this.h;
        int hashCode = (d2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.i;
        return this.j.hashCode() + ((hashCode + (colorModel2 != null ? colorModel2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("State(title=", this.a, ", description=", this.b, ", image=");
        u.append(this.c);
        u.append(", loading=");
        u.append(this.d);
        u.append(", backgroundColor=");
        smw0.z(u, this.e, ", titleTextColor=", this.f, ", descriptionTextColor=");
        smw0.z(u, this.g, ", buttonBackgroundColor=", this.h, ", buttonTextColor=");
        u.append(this.i);
        u.append(", buttonText=");
        u.append(this.j);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
