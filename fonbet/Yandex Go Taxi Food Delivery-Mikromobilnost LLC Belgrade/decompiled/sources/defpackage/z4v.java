package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z4v implements b5v {
    public final long a;

    public z4v(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4v) && ldc.c(this.a, ((z4v) obj).a);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oyr.p("ComposeColorBackground(color=", ldc.i(this.a), Extension.C_BRAKE);
    }
}
