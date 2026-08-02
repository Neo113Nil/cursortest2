package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rl41 {
    public final String a;
    public final Map b;

    public rl41(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl41)) {
            return false;
        }
        rl41 rl41Var = (rl41) obj;
        return jl40.l(this.a, rl41Var.a) && this.b.equals(rl41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("UrlWithHeaders(url=", this.a, ", headers=", Extension.C_BRAKE, this.b);
    }
}
