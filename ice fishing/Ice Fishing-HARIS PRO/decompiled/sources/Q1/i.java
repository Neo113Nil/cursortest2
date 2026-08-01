package Q1;

import L1.AbstractC0018t;

/* loaded from: classes.dex */
public final /* synthetic */ class i extends D1.c implements C1.a, I1.a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f952g;

    public i(j jVar) {
        super(jVar, AbstractC0018t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f952g = false;
    }

    public final I1.a b() {
        if (!this.f952g) {
            I1.a aVar = this.f153a;
            if (aVar != null) {
                return aVar;
            }
            D1.o.f171a.getClass();
            this.f153a = this;
        }
        return this;
    }

    @Override // C1.a
    public final Object c() {
        return this.f154b.getClass().getSimpleName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return a().equals(iVar.a()) && this.f156d.equals(iVar.f156d) && this.e.equals(iVar.e) && D1.i.a(this.f154b, iVar.f154b);
        }
        if (obj instanceof i) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + D1.h.b(this.f156d, a().hashCode() * 31, 31);
    }

    public final String toString() {
        I1.a b2 = b();
        return b2 != this ? b2.toString() : D1.h.h(new StringBuilder("property "), this.f156d, " (Kotlin reflection is not available)");
    }
}
