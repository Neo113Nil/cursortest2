package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class up2 implements wp2 {
    public static final long b = ldc.m;
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ up2(long j) {
        this.a = j;
    }

    public static String a(long j) {
        return oyr.p("Fixed(value=", ldc.i(j), Extension.C_BRAKE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof up2) {
            return ldc.c(this.a, ((up2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = ldc.n;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
