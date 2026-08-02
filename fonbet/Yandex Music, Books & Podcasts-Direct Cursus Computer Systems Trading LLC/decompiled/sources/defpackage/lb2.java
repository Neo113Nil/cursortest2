package defpackage;

/* loaded from: classes.dex */
public final class lb2 {
    public final int a;
    public final long b;

    public lb2(int i, long j) {
        if (i == 0) {
            jj4.j("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2Var = (lb2) obj;
        return ouj.a(this.a, lb2Var.a) && this.b == lb2Var.b;
    }

    public final int hashCode() {
        int D = (ouj.D(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return D ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return hrg.m(this.b, "}", sb);
    }
}
