package E0;

/* loaded from: classes.dex */
public abstract class m extends c implements I0.c {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f310k;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f310k = false;
    }

    public final I0.a d() {
        if (this.f310k) {
            return this;
        }
        I0.a aVar = this.f295e;
        if (aVar != null) {
            return aVar;
        }
        I0.a b2 = b();
        this.f295e = b2;
        return b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return c().equals(mVar.c()) && this.f298h.equals(mVar.f298h) && this.f299i.equals(mVar.f299i) && this.f296f.equals(mVar.f296f);
        }
        if (obj instanceof I0.c) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f299i.hashCode() + ((this.f298h.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        I0.a d2 = d();
        if (d2 != this) {
            return d2.toString();
        }
        return "property " + this.f298h + " (Kotlin reflection is not available)";
    }
}
