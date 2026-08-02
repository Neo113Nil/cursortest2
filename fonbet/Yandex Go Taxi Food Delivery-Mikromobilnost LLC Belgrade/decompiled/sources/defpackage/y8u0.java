package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class y8u0 {
    public final boolean a;
    public final Set b;

    public y8u0(Set set, boolean z) {
        this.a = z;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8u0)) {
            return false;
        }
        y8u0 y8u0Var = (y8u0) obj;
        return this.a == y8u0Var.a && this.b.equals(y8u0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StatusRefreshPolicy(enabled=" + this.a + ", triggerStatuses=" + this.b + Extension.C_BRAKE;
    }
}
