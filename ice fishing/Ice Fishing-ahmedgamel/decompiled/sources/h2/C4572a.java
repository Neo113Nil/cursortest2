package h2;

import java.util.HashMap;
import k2.InterfaceC4642a;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4572a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4642a f38081a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38082b;

    public C4572a(InterfaceC4642a interfaceC4642a, HashMap hashMap) {
        this.f38081a = interfaceC4642a;
        this.f38082b = hashMap;
    }

    public final long a(Y1.d dVar, long j6, int i) {
        long f2 = j6 - this.f38081a.f();
        C4573b c4573b = (C4573b) this.f38082b.get(dVar);
        long j9 = c4573b.f38083a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j9 > 1 ? j9 : 2L) * r12))), f2), c4573b.f38084b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4572a)) {
            return false;
        }
        C4572a c4572a = (C4572a) obj;
        return this.f38081a.equals(c4572a.f38081a) && this.f38082b.equals(c4572a.f38082b);
    }

    public final int hashCode() {
        return ((this.f38081a.hashCode() ^ 1000003) * 1000003) ^ this.f38082b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f38081a + ", values=" + this.f38082b + "}";
    }
}
