package f2;

import i2.InterfaceC4581a;
import java.util.HashMap;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4507a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4581a f37457a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f37458b;

    public C4507a(InterfaceC4581a interfaceC4581a, HashMap hashMap) {
        this.f37457a = interfaceC4581a;
        this.f37458b = hashMap;
    }

    public final long a(W1.d dVar, long j6, int i) {
        long g4 = j6 - this.f37457a.g();
        C4508b c4508b = (C4508b) this.f37458b.get(dVar);
        long j9 = c4508b.f37459a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j9 > 1 ? j9 : 2L) * r12))), g4), c4508b.f37460b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4507a)) {
            return false;
        }
        C4507a c4507a = (C4507a) obj;
        return this.f37457a.equals(c4507a.f37457a) && this.f37458b.equals(c4507a.f37458b);
    }

    public final int hashCode() {
        return ((this.f37457a.hashCode() ^ 1000003) * 1000003) ^ this.f37458b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f37457a + ", values=" + this.f37458b + "}";
    }
}
