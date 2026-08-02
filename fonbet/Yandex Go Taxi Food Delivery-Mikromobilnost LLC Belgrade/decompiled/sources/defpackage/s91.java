package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

/* loaded from: classes12.dex */
public final class s91 {
    public final ScreenEndpoint a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public s91(ScreenEndpoint screenEndpoint, String str, long j, long j2, String str2) {
        this.a = screenEndpoint;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s91)) {
            return false;
        }
        s91 s91Var = (s91) obj;
        return this.a == s91Var.a && jl40.l(this.b, s91Var.b) && this.c == s91Var.c && this.d == s91Var.d && this.e.equals(s91Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qv10.c(qv10.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PendingEndpointEvent(endpoint=");
        sb.append(this.a);
        sb.append(", intentUuid=");
        sb.append(this.b);
        sb.append(", completionTimeMs=");
        sb.append(this.c);
        x4e.A(this.d, ", durationMs=", ", traceId=", sb);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
