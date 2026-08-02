package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sb01 implements tb01 {
    public final s7u0 a;
    public final List b;
    public final List c;

    public sb01(s7u0 s7u0Var, List list, List list2) {
        this.a = s7u0Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb01)) {
            return false;
        }
        sb01 sb01Var = (sb01) obj;
        return jl40.l(this.a, sb01Var.a) && jl40.l(this.b, sb01Var.b) && jl40.l(this.c, sb01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(stationsUiState=");
        sb.append(this.a);
        sb.append(", schedules=");
        sb.append(this.b);
        sb.append(", actionButtons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
