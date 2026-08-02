package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class rmf0 {
    public final String a;
    public final List b;

    public rmf0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmf0)) {
            return false;
        }
        rmf0 rmf0Var = (rmf0) obj;
        return jl40.l(this.a, rmf0Var.a) && jl40.l(this.b, rmf0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nnm.h("PromoCodeSection(title=", this.a, ", items=", Extension.C_BRAKE, this.b);
    }
}
