package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class yia0 {
    public final String a;
    public final Map b;

    public yia0(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yia0)) {
            return false;
        }
        yia0 yia0Var = (yia0) obj;
        return jl40.l(this.a, yia0Var.a) && jl40.l(this.b, yia0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("PaymentSdkEvent(eventName=", this.a, ", eventParams=", Extension.C_BRAKE, this.b);
    }
}
