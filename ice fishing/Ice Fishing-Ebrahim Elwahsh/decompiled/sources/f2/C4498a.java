package f2;

import java.util.HashMap;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4498a {

    /* renamed from: a, reason: collision with root package name */
    public final i2.a f37661a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f37662b;

    public C4498a(i2.a aVar, HashMap hashMap) {
        this.f37661a = aVar;
        this.f37662b = hashMap;
    }

    public final long a(W1.d dVar, long j9, int i) {
        long a9 = j9 - this.f37661a.a();
        C4499b c4499b = (C4499b) this.f37662b.get(dVar);
        long j10 = c4499b.f37663a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * r12))), a9), c4499b.f37664b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4498a)) {
            return false;
        }
        C4498a c4498a = (C4498a) obj;
        return this.f37661a.equals(c4498a.f37661a) && this.f37662b.equals(c4498a.f37662b);
    }

    public final int hashCode() {
        return ((this.f37661a.hashCode() ^ 1000003) * 1000003) ^ this.f37662b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f37661a + ", values=" + this.f37662b + "}";
    }
}
