package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qd3 implements sd3 {
    public final List a;
    public final wp2 b;

    public qd3(List list, wp2 wp2Var) {
        this.a = list;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        return this.a.equals(qd3Var.a) && jl40.l(this.b, qd3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Gradient(colors=" + this.a + ", appColor=" + this.b + Extension.C_BRAKE;
    }
}
