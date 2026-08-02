package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class rva0 {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final long e;

    public rva0(Long l, Long l2, Long l3, Long l4, long j) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rva0)) {
            return false;
        }
        rva0 rva0Var = (rva0) obj;
        return jl40.l(this.a, rva0Var.a) && jl40.l(this.b, rva0Var.b) && jl40.l(this.c, rva0Var.c) && jl40.l(this.d, rva0Var.d) && this.e == rva0Var.e;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        return Long.hashCode(this.e) + ((hashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenFullyLoadedMetrics(decodingDurationMs=");
        sb.append(this.a);
        sb.append(", firstByteDurationMs=");
        sb.append(this.b);
        sb.append(", networkRequestDurationMs=");
        sb.append(this.c);
        sb.append(", renderingDurationMs=");
        sb.append(this.d);
        sb.append(", totalDurationMs=");
        return oyr.n(this.e, Extension.C_BRAKE, sb);
    }
}
