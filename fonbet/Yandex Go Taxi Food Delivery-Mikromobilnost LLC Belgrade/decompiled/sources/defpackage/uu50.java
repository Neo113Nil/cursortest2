package defpackage;

import com.yandex.plus.core.network.header.NetworkHeader$Name$Loggable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class uu50 {
    public final tu50 a;
    public final String b;

    public uu50(tu50 tu50Var, String str) {
        this.a = tu50Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu50)) {
            return false;
        }
        uu50 uu50Var = (uu50) obj;
        return this.a.equals(uu50Var.a) && jl40.l(this.b, uu50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        tu50 tu50Var = this.a;
        return tu50Var + Extension.COLON_SPACE + (tu50Var.b != NetworkHeader$Name$Loggable.NOT_LOGGABLE ? this.b : "(hidden)");
    }
}
