package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qh7 {
    public final cu11 a;
    public final List b;

    public qh7(cu11 cu11Var, List list) {
        this.a = cu11Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh7)) {
            return false;
        }
        qh7 qh7Var = (qh7) obj;
        return jl40.l(this.a, qh7Var.a) && jl40.l(this.b, qh7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CallHistoryDateGroup(date=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
