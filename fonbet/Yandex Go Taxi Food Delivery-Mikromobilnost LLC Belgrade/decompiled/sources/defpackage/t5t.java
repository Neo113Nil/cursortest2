package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class t5t {
    public final boolean a;

    public t5t(int i) {
        this.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5t) && this.a == ((t5t) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Params(readOnMainThread=", Extension.C_BRAKE, this.a);
    }

    public t5t() {
        this(0);
    }
}
