package U0;

/* loaded from: classes.dex */
public final class k extends i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = i.f3236z;
        }
        if (!i.f3235y.d(this, null, obj)) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!i.f3235y.d(this, null, new c(th))) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean l(J3.a aVar) {
        c cVar;
        aVar.getClass();
        Object obj = this.f3237n;
        if (obj == null) {
            if (aVar.isDone()) {
                if (i.f3235y.d(this, null, i.f(aVar))) {
                    i.b(this);
                    return true;
                }
                return false;
            }
            f fVar = new f(this, aVar);
            if (i.f3235y.d(this, null, fVar)) {
                try {
                    aVar.c(fVar, j.f3240n);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Throwable unused) {
                        cVar = c.f3218b;
                    }
                    i.f3235y.d(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.f3237n;
        }
        if (obj instanceof a) {
            aVar.cancel(((a) obj).f3215a);
        }
        return false;
    }
}
