package defpackage;

import flex.logger.FlexLogLevel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zx31 {
    public final String a;
    public final FlexLogLevel b;

    public zx31(String str, FlexLogLevel flexLogLevel) {
        this.a = str;
        this.b = flexLogLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx31)) {
            return false;
        }
        zx31 zx31Var = (zx31) obj;
        return this.a.equals(zx31Var.a) && this.b == zx31Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Issue(message=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
