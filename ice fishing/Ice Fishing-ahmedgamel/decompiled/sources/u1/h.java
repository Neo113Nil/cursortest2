package u1;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h implements InterfaceC5066e {

    /* renamed from: b, reason: collision with root package name */
    public final P1.c f41011b = new P1.c();

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            P1.c cVar = this.f41011b;
            if (i >= cVar.f40276v) {
                return;
            }
            g gVar = (g) cVar.h(i);
            Object l9 = this.f41011b.l(i);
            f fVar = gVar.f41008b;
            if (gVar.f41010d == null) {
                gVar.f41010d = gVar.f41009c.getBytes(InterfaceC5066e.f41005a);
            }
            fVar.d(gVar.f41010d, l9, messageDigest);
            i++;
        }
    }

    public final Object c(g gVar) {
        P1.c cVar = this.f41011b;
        return cVar.containsKey(gVar) ? cVar.getOrDefault(gVar, null) : gVar.f41007a;
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f41011b.equals(((h) obj).f41011b);
        }
        return false;
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        return this.f41011b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f41011b + '}';
    }
}
