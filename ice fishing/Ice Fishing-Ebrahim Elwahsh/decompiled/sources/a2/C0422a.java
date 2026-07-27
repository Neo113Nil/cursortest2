package a2;

import u.AbstractC5088e;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4363a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4364b;

    public C0422a(int i, long j9) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f4363a = i;
        this.f4364b = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0422a)) {
            return false;
        }
        C0422a c0422a = (C0422a) obj;
        return AbstractC5088e.a(this.f4363a, c0422a.f4363a) && this.f4364b == c0422a.f4364b;
    }

    public final int hashCode() {
        int d2 = (AbstractC5088e.d(this.f4363a) ^ 1000003) * 1000003;
        long j9 = this.f4364b;
        return d2 ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f4363a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f4364b);
        sb.append("}");
        return sb.toString();
    }
}
