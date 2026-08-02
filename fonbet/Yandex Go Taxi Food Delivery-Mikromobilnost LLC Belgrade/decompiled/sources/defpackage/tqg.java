package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class tqg {
    public final long a;
    public final long b;
    public final boolean c;

    public tqg(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqg)) {
            return false;
        }
        tqg tqgVar = (tqg) obj;
        return this.a == tqgVar.a && this.b == tqgVar.b && this.c == tqgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "DateCond(minMs=", ", maxMs=");
        w.append(this.b);
        w.append(", ignore=");
        w.append(this.c);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }
}
