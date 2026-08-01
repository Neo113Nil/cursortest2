package D1;

/* loaded from: classes.dex */
public abstract class g extends c implements f, I1.a, t1.a {

    /* renamed from: g, reason: collision with root package name */
    public final int f162g;

    /* renamed from: h, reason: collision with root package name */
    public final int f163h;

    public g(int i, Class cls, String str, String str2, int i2) {
        this(i, b.f152a, cls, str, str2, i2);
    }

    public final I1.a b() {
        o.f171a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f156d.equals(gVar.f156d) && this.e.equals(gVar.e) && this.f163h == gVar.f163h && this.f162g == gVar.f162g && i.a(this.f154b, gVar.f154b) && a().equals(gVar.a());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        I1.a aVar = this.f153a;
        if (aVar == null) {
            b();
            this.f153a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // D1.f
    public final int f() {
        return this.f162g;
    }

    public final int hashCode() {
        a();
        return this.e.hashCode() + h.b(this.f156d, a().hashCode() * 31, 31);
    }

    public final String toString() {
        I1.a aVar = this.f153a;
        if (aVar == null) {
            b();
            this.f153a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f156d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : h.g("function ", str, " (Kotlin reflection is not available)");
    }

    public g(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.f162g = i;
        this.f163h = 0;
    }
}
