package U0;

/* loaded from: classes.dex */
public final class k extends i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = i.f3158z;
        }
        if (!i.f3157y.c(this, null, obj)) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!i.f3157y.c(this, null, new c(th))) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean l(N3.a aVar) {
        c cVar;
        aVar.getClass();
        Object obj = this.f3159n;
        if (obj == null) {
            if (aVar.isDone()) {
                if (i.f3157y.c(this, null, i.f(aVar))) {
                    i.c(this);
                    return true;
                }
                return false;
            }
            f fVar = new f(this, aVar);
            if (i.f3157y.c(this, null, fVar)) {
                try {
                    aVar.a(fVar, j.f3162n);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Throwable unused) {
                        cVar = c.f3139b;
                    }
                    i.f3157y.c(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.f3159n;
        }
        if (obj instanceof a) {
            aVar.cancel(((a) obj).f3136a);
        }
        return false;
    }
}
