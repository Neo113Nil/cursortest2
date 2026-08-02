package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x9q0 implements o4q0 {
    public final List a;
    public final w9q0 b;
    public final String c = "";

    public x9q0(List list, w9q0 w9q0Var) {
        this.a = list;
        this.b = w9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9q0)) {
            return false;
        }
        x9q0 x9q0Var = (x9q0) obj;
        return jl40.l(this.a, x9q0Var.a) && jl40.l(this.b, x9q0Var.b) && jl40.l(this.c, x9q0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w9q0 w9q0Var = this.b;
        return this.c.hashCode() + ((hashCode + (w9q0Var == null ? 0 : w9q0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentsSectionUiState(options=");
        sb.append(this.a);
        sb.append(", activeOption=");
        sb.append(this.b);
        sb.append(", property=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
