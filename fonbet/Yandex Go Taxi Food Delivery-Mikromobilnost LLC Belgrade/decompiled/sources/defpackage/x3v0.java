package defpackage;

/* loaded from: classes2.dex */
public final class x3v0 implements y3v0 {
    public final String a;
    public final long b;
    public final long c;

    public x3v0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3v0)) {
            return false;
        }
        x3v0 x3v0Var = (x3v0) obj;
        return jl40.l(this.a, x3v0Var.a) && this.b == x3v0Var.b && this.c == x3v0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebContent(webPageUrl=");
        sb.append(this.a);
        sb.append(", startedTimeoutMillis=");
        sb.append(this.b);
        sb.append(", loadedTimeoutMillis=");
        return b64.o(sb, this.c, ')');
    }
}
