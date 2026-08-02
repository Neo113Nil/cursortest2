package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class z8i0 {
    public final Text.Resource a;
    public final Text.Resource b;
    public final Text.Resource c;
    public final Text.Resource d;
    public final rbv e;
    public final z1x0 f;

    public z8i0(Text.Resource resource, Text.Resource resource2, Text.Resource resource3, Text.Resource resource4, nbv nbvVar, z1x0 z1x0Var, int i) {
        nbvVar = (i & 16) != 0 ? null : nbvVar;
        z1x0Var = (i & 32) != 0 ? null : z1x0Var;
        this.a = resource;
        this.b = resource2;
        this.c = resource3;
        this.d = resource4;
        this.e = nbvVar;
        this.f = z1x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8i0)) {
            return false;
        }
        z8i0 z8i0Var = (z8i0) obj;
        return this.a.equals(z8i0Var.a) && this.b.equals(z8i0Var.b) && this.c.equals(z8i0Var.c) && this.d.equals(z8i0Var.d) && jl40.l(this.e, z8i0Var.e) && jl40.l(this.f, z8i0Var.f);
    }

    public final int hashCode() {
        int b = uw51.b(this.d, uw51.b(this.c, uw51.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
        rbv rbvVar = this.e;
        int hashCode = (b + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        z1x0 z1x0Var = this.f;
        return hashCode + (z1x0Var != null ? z1x0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RationaleDialog(title=" + this.a + ", description=" + this.b + ", allowButtonText=" + this.c + ", disallowButtonText=" + this.d + ", image=" + this.e + ", statusBarColorsModel=" + this.f + Extension.C_BRAKE;
    }
}
