package E0;

/* loaded from: classes.dex */
public abstract class m extends c implements H0.c {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f309l;

    public m(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f309l = false;
    }

    public final H0.a d() {
        if (this.f309l) {
            return this;
        }
        H0.a aVar = this.f294f;
        if (aVar != null) {
            return aVar;
        }
        H0.a b2 = b();
        this.f294f = b2;
        return b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return c().equals(mVar.c()) && this.f297i.equals(mVar.f297i) && this.f298j.equals(mVar.f298j) && this.f295g.equals(mVar.f295g);
        }
        if (obj instanceof H0.c) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f298j.hashCode() + ((this.f297i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        H0.a d2 = d();
        if (d2 != this) {
            return d2.toString();
        }
        return "property " + this.f297i + " (Kotlin reflection is not available)";
    }
}
