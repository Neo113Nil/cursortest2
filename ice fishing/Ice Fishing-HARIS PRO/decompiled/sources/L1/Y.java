package L1;

/* loaded from: classes.dex */
public class Y extends T implements v1.d, r {

    /* renamed from: c, reason: collision with root package name */
    public final v1.i f550c;

    public Y(v1.i iVar, boolean z2) {
        super(z2);
        t((K) iVar.e(C0016q.f576b));
        this.f550c = iVar.f(this);
    }

    @Override // v1.d
    public final void b(Object obj) {
        Object A2;
        Throwable a2 = t1.f.a(obj);
        if (a2 != null) {
            obj = new C0009j(a2, false);
        }
        do {
            A2 = A(q(), obj);
            if (A2 == AbstractC0018t.f579c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0009j c0009j = obj instanceof C0009j ? (C0009j) obj : null;
                throw new IllegalStateException(str, c0009j != null ? c0009j.f565a : null);
            }
        } while (A2 == AbstractC0018t.e);
    }

    @Override // v1.d
    public final v1.i h() {
        return this.f550c;
    }

    @Override // L1.T
    public final String j() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // L1.T
    public final boolean r(Throwable th) {
        AbstractC0018t.b(th, this.f550c);
        return true;
    }

    @Override // L1.T
    public final void s(C0011l c0011l) {
        AbstractC0018t.b(c0011l, this.f550c);
    }

    @Override // L1.T
    public final void w(Object obj) {
        if (obj instanceof C0009j) {
            C0009j c0009j = (C0009j) obj;
            Throwable th = c0009j.f565a;
            c0009j.getClass();
            C0009j.f564b.get(c0009j);
        }
    }
}
