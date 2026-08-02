package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qf50 {
    public final xf50 a;
    public final boolean b;

    public qf50(xf50 xf50Var, boolean z) {
        this.a = xf50Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf50)) {
            return false;
        }
        qf50 qf50Var = (qf50) obj;
        return this.a.equals(qf50Var.a) && this.b == qf50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigatorSuggestsRootPayload(suggestsMode=" + this.a + ", showUserLocationPin=" + this.b + Extension.C_BRAKE;
    }
}
