package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x1v0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final boolean c;
    public final boolean d;
    public final ColorModel.Attr e;
    public final ColorModel.Attr f;
    public final ColorModel.Attr g;
    public final p1b h;
    public final boolean i;

    public x1v0(Text.Constant constant, Text.Constant constant2, boolean z, boolean z2, ColorModel.Attr attr, ColorModel.Attr attr2, ColorModel.Attr attr3, p1b p1bVar, boolean z3) {
        this.a = constant;
        this.b = constant2;
        this.c = z;
        this.d = z2;
        this.e = attr;
        this.f = attr2;
        this.g = attr3;
        this.h = p1bVar;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1v0) {
            x1v0 x1v0Var = (x1v0) obj;
            if (this.a.equals(x1v0Var.a) && this.b.equals(x1v0Var.b) && this.c == x1v0Var.c && this.d == x1v0Var.d && this.e.equals(x1v0Var.e) && this.f.equals(x1v0Var.f) && this.g.equals(x1v0Var.g) && this.h == x1v0Var.h && this.i == x1v0Var.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.e(xvz.d(this.b, this.a.hashCode() * 31, 961), 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("State(title=", this.a, ", description=", this.b, ", image=null, checked=");
        nnm.v(", loading=", ", backgroundColor=", u, this.c, this.d);
        u.append(this.e);
        u.append(", titleTextColor=");
        u.append(this.f);
        u.append(", descriptionTextColor=");
        u.append(this.g);
        u.append(", switchColor=");
        u.append(this.h);
        u.append(", enabled=");
        return x4e.i(u, this.i, Extension.C_BRAKE);
    }
}
