package E0;

/* loaded from: classes.dex */
public abstract class g extends c implements f, H0.a, t0.a {

    /* renamed from: l, reason: collision with root package name */
    public final int f304l;

    /* renamed from: m, reason: collision with root package name */
    public final int f305m;

    public g(int i2, Class cls, String str, String str2, int i3) {
        this(i2, b.f293f, cls, str, str2, i3);
    }

    @Override // E0.c
    public final H0.a b() {
        q.f313a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f297i.equals(gVar.f297i) && this.f298j.equals(gVar.f298j) && this.f305m == gVar.f305m && this.f304l == gVar.f304l && this.f295g.equals(gVar.f295g) && c().equals(gVar.c());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        H0.a aVar = this.f294f;
        if (aVar == null) {
            b();
            this.f294f = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // E0.f
    public final int g() {
        return this.f304l;
    }

    public final int hashCode() {
        c();
        return this.f298j.hashCode() + ((this.f297i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        H0.a aVar = this.f294f;
        if (aVar == null) {
            b();
            this.f294f = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f297i;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f304l = i2;
        this.f305m = 0;
    }
}
