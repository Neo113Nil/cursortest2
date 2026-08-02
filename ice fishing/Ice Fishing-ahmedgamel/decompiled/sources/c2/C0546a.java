package c2;

import u.AbstractC5050e;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5710b;

    public C0546a(int i, long j6) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f5709a = i;
        this.f5710b = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0546a)) {
            return false;
        }
        C0546a c0546a = (C0546a) obj;
        return AbstractC5050e.a(this.f5709a, c0546a.f5709a) && this.f5710b == c0546a.f5710b;
    }

    public final int hashCode() {
        int d9 = (AbstractC5050e.d(this.f5709a) ^ 1000003) * 1000003;
        long j6 = this.f5710b;
        return d9 ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f5709a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f5710b);
        sb.append("}");
        return sb.toString();
    }
}
