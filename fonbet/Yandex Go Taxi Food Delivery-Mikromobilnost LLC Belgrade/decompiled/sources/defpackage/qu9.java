package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qu9 {
    public final boolean a;
    public final boolean b;
    public final List c;

    public qu9(boolean z, boolean z2, List list) {
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu9)) {
            return false;
        }
        qu9 qu9Var = (qu9) obj;
        return this.a == qu9Var.a && this.b == qu9Var.b && jl40.l(this.c, qu9Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        List list = this.c;
        return e + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return ly3.s(qv10.u("DiscountsToggle(enabled=", ", selected=", ", paymentMethodIds=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
