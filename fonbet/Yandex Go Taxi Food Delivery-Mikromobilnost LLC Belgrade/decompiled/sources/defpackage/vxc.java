package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class vxc {
    public final String a;
    public final String b;
    public final List c;

    public vxc(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxc)) {
            return false;
        }
        vxc vxcVar = (vxc) obj;
        return jl40.l(this.a, vxcVar.a) && jl40.l(this.b, vxcVar.b) && jl40.l(this.c, vxcVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(b64.v("ComplementAttributes(name=", this.a, ", description=", this.b, ", paymentTypes="), this.c, Extension.C_BRAKE);
    }
}
