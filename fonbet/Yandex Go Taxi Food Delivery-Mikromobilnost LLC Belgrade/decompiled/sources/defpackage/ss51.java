package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ss51 {
    public final long a;

    public ss51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss51) && ldc.c(this.a, ((ss51) obj).a);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return oyr.p("YbNewMainOtherColors(skeletonStatic=", ldc.i(this.a), Extension.C_BRAKE);
    }
}
