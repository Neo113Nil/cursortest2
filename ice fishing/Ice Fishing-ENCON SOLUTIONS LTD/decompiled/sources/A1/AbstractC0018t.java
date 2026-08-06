package A1;

import l1.AbstractC0981a;

/* renamed from: A1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018t extends AbstractC0981a implements l1.f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0017s f71b = new C0017s(l1.e.f8137a, r.f68e);

    public AbstractC0018t() {
        super(l1.e.f8137a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, t1.l] */
    @Override // l1.AbstractC0981a, l1.i
    public final l1.i c(l1.h key) {
        kotlin.jvm.internal.i.e(key, "key");
        boolean z2 = key instanceof C0017s;
        l1.j jVar = l1.j.f8138a;
        if (z2) {
            C0017s c0017s = (C0017s) key;
            l1.h hVar = this.f8133a;
            if ((hVar == c0017s || c0017s.f70b == hVar) && ((l1.g) c0017s.f69a.invoke(this)) != null) {
                return jVar;
            }
        } else if (l1.e.f8137a == key) {
            return jVar;
        }
        return this;
    }

    public abstract void j(l1.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.j, t1.l] */
    @Override // l1.AbstractC0981a, l1.i
    public final l1.g m(l1.h key) {
        l1.g gVar;
        kotlin.jvm.internal.i.e(key, "key");
        if (!(key instanceof C0017s)) {
            if (l1.e.f8137a == key) {
                return this;
            }
            return null;
        }
        C0017s c0017s = (C0017s) key;
        l1.h hVar = this.f8133a;
        if ((hVar == c0017s || c0017s.f70b == hVar) && (gVar = (l1.g) c0017s.f69a.invoke(this)) != null) {
            return gVar;
        }
        return null;
    }

    public boolean n() {
        return !(this instanceof k0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0022x.b(this);
    }
}
