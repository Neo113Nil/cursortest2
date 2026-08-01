package s1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final N1.c f40457b = new N1.c();

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            N1.c cVar = this.f40457b;
            if (i >= cVar.f40440v) {
                return;
            }
            g gVar = (g) cVar.h(i);
            Object l9 = this.f40457b.l(i);
            f fVar = gVar.f40454b;
            if (gVar.f40456d == null) {
                gVar.f40456d = gVar.f40455c.getBytes(InterfaceC4970e.f40451a);
            }
            fVar.h(gVar.f40456d, l9, messageDigest);
            i++;
        }
    }

    public final Object c(g gVar) {
        N1.c cVar = this.f40457b;
        return cVar.containsKey(gVar) ? cVar.getOrDefault(gVar, null) : gVar.f40453a;
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f40457b.equals(((h) obj).f40457b);
        }
        return false;
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        return this.f40457b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f40457b + '}';
    }
}
