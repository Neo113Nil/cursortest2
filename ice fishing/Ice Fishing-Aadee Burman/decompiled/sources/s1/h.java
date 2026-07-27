package s1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final N1.c f40454b = new N1.c();

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            N1.c cVar = this.f40454b;
            if (i >= cVar.f40437v) {
                return;
            }
            g gVar = (g) cVar.h(i);
            Object l9 = this.f40454b.l(i);
            f fVar = gVar.f40451b;
            if (gVar.f40453d == null) {
                gVar.f40453d = gVar.f40452c.getBytes(InterfaceC4970e.f40448a);
            }
            fVar.h(gVar.f40453d, l9, messageDigest);
            i++;
        }
    }

    public final Object c(g gVar) {
        N1.c cVar = this.f40454b;
        return cVar.containsKey(gVar) ? cVar.getOrDefault(gVar, null) : gVar.f40450a;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f40454b.equals(((h) obj).f40454b);
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return this.f40454b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f40454b + '}';
    }
}
