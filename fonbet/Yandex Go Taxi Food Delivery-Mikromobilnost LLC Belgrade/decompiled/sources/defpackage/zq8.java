package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zq8 extends ye0 {
    public final String b;
    public final Map c;

    public zq8(String str, Map map) {
        super("care.insuranceWebViewOnPayment");
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq8)) {
            return false;
        }
        zq8 zq8Var = (zq8) obj;
        return this.b.equals(zq8Var.b) && this.c.equals(zq8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("InsuranceWebViewOnPayment(type=", this.b, ", additionalData=", Extension.C_BRAKE, this.c);
    }
}
