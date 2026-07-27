package K0;

/* renamed from: K0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0043t extends v0.a implements v0.f {

    /* renamed from: g, reason: collision with root package name */
    public static final C0042s f532g = new C0042s(v0.e.f3008f, r.f529g);

    public AbstractC0043t() {
        super(v0.e.f3008f);
    }

    public abstract void c(v0.i iVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof j0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [D0.l, E0.j] */
    @Override // v0.a, v0.i
    public final v0.i g(v0.h hVar) {
        E0.i.e(hVar, "key");
        boolean z2 = hVar instanceof C0042s;
        v0.j jVar = v0.j.f3009f;
        if (z2) {
            C0042s c0042s = (C0042s) hVar;
            v0.h hVar2 = this.f3004f;
            if ((hVar2 == c0042s || c0042s.f531g == hVar2) && ((v0.g) c0042s.f530f.i(this)) != null) {
                return jVar;
            }
        } else if (v0.e.f3008f == hVar) {
            return jVar;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [D0.l, E0.j] */
    @Override // v0.a, v0.i
    public final v0.g i(v0.h hVar) {
        v0.g gVar;
        E0.i.e(hVar, "key");
        if (!(hVar instanceof C0042s)) {
            if (v0.e.f3008f == hVar) {
                return this;
            }
            return null;
        }
        C0042s c0042s = (C0042s) hVar;
        v0.h hVar2 = this.f3004f;
        if ((hVar2 == c0042s || c0042s.f531g == hVar2) && (gVar = (v0.g) c0042s.f530f.i(this)) != null) {
            return gVar;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0046w.b(this);
    }
}
