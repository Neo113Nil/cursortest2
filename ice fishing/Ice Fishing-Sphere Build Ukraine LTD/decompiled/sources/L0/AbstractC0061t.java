package L0;

/* renamed from: L0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0061t extends v0.a implements v0.f {

    /* renamed from: f, reason: collision with root package name */
    public static final C0060s f680f = new C0060s(v0.e.f3013e, r.f677f);

    public AbstractC0061t() {
        super(v0.e.f3013e);
    }

    public abstract void c(v0.i iVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof j0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [D0.l, E0.j] */
    @Override // v0.a, v0.i
    public final v0.i g(v0.h hVar) {
        E0.i.e(hVar, "key");
        boolean z2 = hVar instanceof C0060s;
        v0.j jVar = v0.j.f3014e;
        if (z2) {
            C0060s c0060s = (C0060s) hVar;
            v0.h hVar2 = this.f3009e;
            if ((hVar2 == c0060s || c0060s.f679f == hVar2) && ((v0.g) c0060s.f678e.i(this)) != null) {
                return jVar;
            }
        } else if (v0.e.f3013e == hVar) {
            return jVar;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [D0.l, E0.j] */
    @Override // v0.a, v0.i
    public final v0.g i(v0.h hVar) {
        v0.g gVar;
        E0.i.e(hVar, "key");
        if (!(hVar instanceof C0060s)) {
            if (v0.e.f3013e == hVar) {
                return this;
            }
            return null;
        }
        C0060s c0060s = (C0060s) hVar;
        v0.h hVar2 = this.f3009e;
        if ((hVar2 == c0060s || c0060s.f679f == hVar2) && (gVar = (v0.g) c0060s.f678e.i(this)) != null) {
            return gVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0064w.b(this);
    }
}
