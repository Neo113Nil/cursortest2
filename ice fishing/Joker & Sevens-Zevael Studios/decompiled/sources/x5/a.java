package x5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8358a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8359b;

    public a(int i10, long j3) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f8358a = i10;
        this.f8359b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v.f.a(this.f8358a, aVar.f8358a) && this.f8359b == aVar.f8359b;
    }

    public final int hashCode() {
        int d10 = (v.f.d(this.f8358a) ^ 1000003) * 1000003;
        long j3 = this.f8359b;
        return d10 ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i10 = this.f8358a;
        sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f8359b);
        sb.append("}");
        return sb.toString();
    }
}
