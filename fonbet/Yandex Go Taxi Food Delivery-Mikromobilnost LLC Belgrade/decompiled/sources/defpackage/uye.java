package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uye {
    public final long a;
    public final long b;
    public final long c;

    public uye(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uye)) {
            return false;
        }
        uye uyeVar = (uye) obj;
        return this.a == uyeVar.a && this.b == uyeVar.b && this.c == uyeVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "CountdownAnchor(targetMillis=", ", initialRemainingMs=");
        w.append(this.b);
        return g8e.l(this.c, ", anchorUptime=", Extension.C_BRAKE, w);
    }
}
