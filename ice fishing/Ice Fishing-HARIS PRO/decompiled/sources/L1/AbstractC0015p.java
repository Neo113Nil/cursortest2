package L1;

/* renamed from: L1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0015p extends v1.a implements v1.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0014o f574b = new C0014o(v1.e.f4496a, C0013n.f571b);

    public AbstractC0015p() {
        super(v1.e.f4496a);
    }

    public abstract void b(v1.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [C1.l, D1.j] */
    @Override // v1.a, v1.i
    public final v1.i c(v1.h hVar) {
        D1.i.e(hVar, "key");
        boolean z2 = hVar instanceof C0014o;
        v1.j jVar = v1.j.f4497a;
        if (z2) {
            C0014o c0014o = (C0014o) hVar;
            v1.h hVar2 = this.f4490a;
            if ((hVar2 == c0014o || c0014o.f573b == hVar2) && ((v1.g) c0014o.f572a.g(this)) != null) {
                return jVar;
            }
        } else if (v1.e.f4496a == hVar) {
            return jVar;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [C1.l, D1.j] */
    @Override // v1.a, v1.i
    public final v1.g e(v1.h hVar) {
        v1.g gVar;
        D1.i.e(hVar, "key");
        if (!(hVar instanceof C0014o)) {
            if (v1.e.f4496a == hVar) {
                return this;
            }
            return null;
        }
        C0014o c0014o = (C0014o) hVar;
        v1.h hVar2 = this.f4490a;
        if ((hVar2 == c0014o || c0014o.f573b == hVar2) && (gVar = (v1.g) c0014o.f572a.g(this)) != null) {
            return gVar;
        }
        return null;
    }

    public boolean g() {
        return !(this instanceof b0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0018t.a(this);
    }
}
