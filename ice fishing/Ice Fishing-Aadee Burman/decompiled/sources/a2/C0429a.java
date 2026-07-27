package a2;

import u.AbstractC5049e;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4314a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4315b;

    public C0429a(int i, long j6) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f4314a = i;
        this.f4315b = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0429a)) {
            return false;
        }
        C0429a c0429a = (C0429a) obj;
        return AbstractC5049e.a(this.f4314a, c0429a.f4314a) && this.f4315b == c0429a.f4315b;
    }

    public final int hashCode() {
        int d2 = (AbstractC5049e.d(this.f4314a) ^ 1000003) * 1000003;
        long j6 = this.f4315b;
        return d2 ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f4314a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f4315b);
        sb.append("}");
        return sb.toString();
    }
}
