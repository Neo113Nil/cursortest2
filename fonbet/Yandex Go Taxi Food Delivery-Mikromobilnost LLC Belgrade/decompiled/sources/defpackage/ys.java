package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ys extends hka1 {
    public final long b;
    public final float c;

    public ys(long j, float f) {
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys)) {
            return false;
        }
        ys ysVar = (ys) obj;
        return ldc.c(this.b, ysVar.b) && y7m.b(this.c, ysVar.c);
    }

    public final int hashCode() {
        int i = ldc.n;
        return Float.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return unr0.p("Custom(backgroundColor=", ldc.i(this.b), ", cornerRadius=", y7m.c(this.c), Extension.C_BRAKE);
    }
}
