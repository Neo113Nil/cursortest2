package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zj3 {
    public final boolean a;

    public zj3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj3) && this.a == ((zj3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Configuration(isLimitedPassportAllowed=", Extension.C_BRAKE, this.a);
    }

    public zj3() {
        this(true);
    }
}
