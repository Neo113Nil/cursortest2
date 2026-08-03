package z4;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.f9128m;
        }
        if (!h.f9127l.c(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!h.f9127l.c(this, null, new b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean k(h7.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f9129g;
        if (obj == null) {
            if (aVar.isDone()) {
                if (h.f9127l.c(this, null, h.f(aVar))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, aVar);
            if (h.f9127l.c(this, null, eVar)) {
                try {
                    aVar.a(eVar, i.f9132g);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Throwable unused) {
                        bVar = b.f9109b;
                    }
                    h.f9127l.c(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f9129g;
        }
        if (obj instanceof a) {
            aVar.cancel(((a) obj).f9107a);
        }
        return false;
    }
}
