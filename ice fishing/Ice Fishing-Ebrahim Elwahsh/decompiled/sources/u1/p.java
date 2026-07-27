package u1;

import java.security.MessageDigest;
import s1.InterfaceC4992e;

/* loaded from: classes.dex */
public final class p implements InterfaceC4992e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f41167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41168c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41169d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f41170e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f41171f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4992e f41172g;

    /* renamed from: h, reason: collision with root package name */
    public final N1.c f41173h;
    public final s1.h i;

    /* renamed from: j, reason: collision with root package name */
    public int f41174j;

    public p(Object obj, InterfaceC4992e interfaceC4992e, int i, int i4, N1.c cVar, Class cls, Class cls2, s1.h hVar) {
        N1.g.c(obj, "Argument must not be null");
        this.f41167b = obj;
        this.f41172g = interfaceC4992e;
        this.f41168c = i;
        this.f41169d = i4;
        N1.g.c(cVar, "Argument must not be null");
        this.f41173h = cVar;
        N1.g.c(cls, "Resource class must not be null");
        this.f41170e = cls;
        N1.g.c(cls2, "Transcode class must not be null");
        this.f41171f = cls2;
        N1.g.c(hVar, "Argument must not be null");
        this.i = hVar;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f41167b.equals(pVar.f41167b) && this.f41172g.equals(pVar.f41172g) && this.f41169d == pVar.f41169d && this.f41168c == pVar.f41168c && this.f41173h.equals(pVar.f41173h) && this.f41170e.equals(pVar.f41170e) && this.f41171f.equals(pVar.f41171f) && this.i.equals(pVar.i);
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        if (this.f41174j == 0) {
            int hashCode = this.f41167b.hashCode();
            this.f41174j = hashCode;
            int hashCode2 = ((((this.f41172g.hashCode() + (hashCode * 31)) * 31) + this.f41168c) * 31) + this.f41169d;
            this.f41174j = hashCode2;
            int hashCode3 = this.f41173h.hashCode() + (hashCode2 * 31);
            this.f41174j = hashCode3;
            int hashCode4 = this.f41170e.hashCode() + (hashCode3 * 31);
            this.f41174j = hashCode4;
            int hashCode5 = this.f41171f.hashCode() + (hashCode4 * 31);
            this.f41174j = hashCode5;
            this.f41174j = this.i.f40426b.hashCode() + (hashCode5 * 31);
        }
        return this.f41174j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f41167b + ", width=" + this.f41168c + ", height=" + this.f41169d + ", resourceClass=" + this.f41170e + ", transcodeClass=" + this.f41171f + ", signature=" + this.f41172g + ", hashCode=" + this.f41174j + ", transformations=" + this.f41173h + ", options=" + this.i + '}';
    }
}
