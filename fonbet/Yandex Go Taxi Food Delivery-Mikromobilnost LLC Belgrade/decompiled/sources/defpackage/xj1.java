package defpackage;

import com.ybsdk.api.entities.YBProduct;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xj1 {
    public final String a;
    public final List b;
    public final YBProduct c;

    public xj1(String str, List list, YBProduct yBProduct) {
        this.a = str;
        this.b = list;
        this.c = yBProduct;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj1)) {
            return false;
        }
        xj1 xj1Var = (xj1) obj;
        return jl40.l(this.a, xj1Var.a) && this.b.equals(xj1Var.b) && this.c == xj1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = xvz.r("AgreementEntity(id=", this.a, ", accessors=", this.b, ", product=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
