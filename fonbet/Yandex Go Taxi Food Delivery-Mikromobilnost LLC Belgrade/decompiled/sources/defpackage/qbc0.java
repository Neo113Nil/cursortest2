package defpackage;

import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class qbc0 {
    public final i5t0 a;
    public final List b;
    public final Set c;

    public qbc0(i5t0 i5t0Var, List list, Set set) {
        this.a = i5t0Var;
        this.b = list;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbc0)) {
            return false;
        }
        qbc0 qbc0Var = (qbc0) obj;
        return jl40.l(this.a, qbc0Var.a) && this.b.equals(qbc0Var.b) && this.c.equals(qbc0Var.c);
    }

    public final int hashCode() {
        i5t0 i5t0Var = this.a;
        return this.c.hashCode() + unr0.c((i5t0Var == null ? 0 : i5t0Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateResult(info=");
        sb.append(this.a);
        sb.append(", addedPinsDelta=");
        sb.append(this.b);
        sb.append(", removedPinsDelta=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }
}
