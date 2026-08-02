package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zez0 implements bfz0 {
    public final long a;

    public zez0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zez0) && ldc.c(this.a, ((zez0) obj).a);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oyr.p("ComposeColorTint(color=", ldc.i(this.a), Extension.C_BRAKE);
    }
}
