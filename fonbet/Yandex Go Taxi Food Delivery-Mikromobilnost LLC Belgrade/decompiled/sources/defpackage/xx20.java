package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xx20 extends zx20 {
    public final String a;
    public final List b;
    public final List c;

    public xx20(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.zx20
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx20)) {
            return false;
        }
        xx20 xx20Var = (xx20) obj;
        return jl40.l(this.a, xx20Var.a) && jl40.l(this.b, xx20Var.b) && jl40.l(this.c, xx20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ly3.s(xvz.r("FiltersModal(id=", this.a, ", blocks=", this.b, ", buttons="), this.c, Extension.C_BRAKE);
    }
}
