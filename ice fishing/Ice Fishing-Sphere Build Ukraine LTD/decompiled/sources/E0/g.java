package E0;

import t0.InterfaceC0246a;

/* loaded from: classes.dex */
public abstract class g extends c implements f, I0.a, InterfaceC0246a {

    /* renamed from: k, reason: collision with root package name */
    public final int f305k;

    /* renamed from: l, reason: collision with root package name */
    public final int f306l;

    public g(int i2, Class cls, String str, String str2, int i3) {
        this(i2, b.f294e, cls, str, str2, i3);
    }

    @Override // E0.c
    public final I0.a b() {
        q.f314a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f298h.equals(gVar.f298h) && this.f299i.equals(gVar.f299i) && this.f306l == gVar.f306l && this.f305k == gVar.f305k && this.f296f.equals(gVar.f296f) && c().equals(gVar.c());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        I0.a aVar = this.f295e;
        if (aVar == null) {
            b();
            this.f295e = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // E0.f
    public final int g() {
        return this.f305k;
    }

    public final int hashCode() {
        c();
        return this.f299i.hashCode() + ((this.f298h.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        I0.a aVar = this.f295e;
        if (aVar == null) {
            b();
            this.f295e = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f298h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f305k = i2;
        this.f306l = 0;
    }
}
