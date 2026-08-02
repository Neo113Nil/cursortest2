package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vxz0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final rbv c;
    public final Text.Constant d;
    public final String e;

    public vxz0(Text.Constant constant, Text.Constant constant2, rbv rbvVar, Text.Constant constant3, String str) {
        this.a = constant;
        this.b = constant2;
        this.c = rbvVar;
        this.d = constant3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxz0)) {
            return false;
        }
        vxz0 vxz0Var = (vxz0) obj;
        return this.a.equals(vxz0Var.a) && this.b.equals(vxz0Var.b) && this.c.equals(vxz0Var.c) && this.d.equals(vxz0Var.d) && jl40.l(this.e, vxz0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xvz.d(this.d, ly3.c(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder u = ly3.u("TopupNoticeDeprecatedEntity(title=", this.a, ", description=", this.b, ", image=");
        u.append(this.c);
        u.append(", buttonText=");
        u.append(this.d);
        u.append(", action=");
        return oyr.t(u, this.e, Extension.C_BRAKE);
    }
}
