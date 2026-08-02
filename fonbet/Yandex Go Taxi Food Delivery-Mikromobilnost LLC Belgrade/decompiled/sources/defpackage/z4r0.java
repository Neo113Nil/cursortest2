package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class z4r0 implements g5r0 {
    public final String a;
    public final String b;
    public final List c;
    public final sls d;
    public final Integer e;

    public z4r0(String str, String str2, List list, sls slsVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = slsVar;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4r0)) {
            return false;
        }
        z4r0 z4r0Var = (z4r0) obj;
        return jl40.l(this.a, z4r0Var.a) && jl40.l(this.b, z4r0Var.b) && this.c.equals(z4r0Var.c) && this.d.equals(z4r0Var.d) && this.e.equals(z4r0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nnm.a(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionButtonsSetting(title=", this.a, ", subtitle=", this.b, ", buttons=");
        v.append(this.c);
        v.append(", onClick=");
        v.append(this.d);
        v.append(", iconRes=");
        return oo31.j(v, this.e, Extension.C_BRAKE);
    }
}
