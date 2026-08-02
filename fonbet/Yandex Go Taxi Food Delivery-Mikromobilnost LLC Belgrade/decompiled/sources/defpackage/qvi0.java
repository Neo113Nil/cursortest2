package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qvi0 {
    public final ovi0 a;
    public final int b;

    public qvi0(ovi0 ovi0Var, int i) {
        this.a = ovi0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvi0)) {
            return false;
        }
        qvi0 qvi0Var = (qvi0) obj;
        return this.a.equals(qvi0Var.a) && this.b == qvi0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteImageWithFallback(remoteImage=" + this.a + ", fallbackImageRes=" + this.b + Extension.C_BRAKE;
    }
}
