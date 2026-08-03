package c6;

import java.util.HashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f6.a f1236a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1237b;

    public b(f6.a aVar, HashMap hashMap) {
        this.f1236a = aVar;
        this.f1237b = hashMap;
    }

    public final long a(t5.d dVar, long j3, int i10) {
        long a6 = j3 - this.f1236a.a();
        c cVar = (c) this.f1237b.get(dVar);
        long j6 = cVar.f1238a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * r12))), a6), cVar.f1239b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1236a.equals(bVar.f1236a) && this.f1237b.equals(bVar.f1237b);
    }

    public final int hashCode() {
        return ((this.f1236a.hashCode() ^ 1000003) * 1000003) ^ this.f1237b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f1236a + ", values=" + this.f1237b + "}";
    }
}
