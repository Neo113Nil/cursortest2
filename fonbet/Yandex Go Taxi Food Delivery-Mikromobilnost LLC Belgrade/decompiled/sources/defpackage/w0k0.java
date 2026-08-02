package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class w0k0 implements a1k0 {
    public final long a;

    public w0k0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0k0) && this.a == ((w0k0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return qv10.k(this.a, "FixedDelay(delayMs=", Extension.C_BRAKE);
    }
}
