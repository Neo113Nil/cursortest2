package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class t95 extends v95 {
    public final String a;
    public final List b;

    public t95(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95)) {
            return false;
        }
        t95 t95Var = (t95) obj;
        return jl40.l(this.a, t95Var.a) && jl40.l(this.b, t95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("SortOptions(id=", this.a, ", options=", Extension.C_BRAKE, this.b);
    }
}
