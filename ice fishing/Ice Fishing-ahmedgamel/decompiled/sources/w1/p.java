package w1;

import java.security.MessageDigest;
import u1.InterfaceC5066e;

/* loaded from: classes.dex */
public final class p implements InterfaceC5066e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f41536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41537c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41538d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f41539e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f41540f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC5066e f41541g;

    /* renamed from: h, reason: collision with root package name */
    public final P1.c f41542h;
    public final u1.h i;

    /* renamed from: j, reason: collision with root package name */
    public int f41543j;

    public p(Object obj, InterfaceC5066e interfaceC5066e, int i, int i4, P1.c cVar, Class cls, Class cls2, u1.h hVar) {
        P1.g.c(obj, "Argument must not be null");
        this.f41536b = obj;
        this.f41541g = interfaceC5066e;
        this.f41537c = i;
        this.f41538d = i4;
        P1.g.c(cVar, "Argument must not be null");
        this.f41542h = cVar;
        P1.g.c(cls, "Resource class must not be null");
        this.f41539e = cls;
        P1.g.c(cls2, "Transcode class must not be null");
        this.f41540f = cls2;
        P1.g.c(hVar, "Argument must not be null");
        this.i = hVar;
    }

    @Override // u1.InterfaceC5066e
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // u1.InterfaceC5066e
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f41536b.equals(pVar.f41536b) && this.f41541g.equals(pVar.f41541g) && this.f41538d == pVar.f41538d && this.f41537c == pVar.f41537c && this.f41542h.equals(pVar.f41542h) && this.f41539e.equals(pVar.f41539e) && this.f41540f.equals(pVar.f41540f) && this.i.equals(pVar.i);
    }

    @Override // u1.InterfaceC5066e
    public final int hashCode() {
        if (this.f41543j == 0) {
            int hashCode = this.f41536b.hashCode();
            this.f41543j = hashCode;
            int hashCode2 = ((((this.f41541g.hashCode() + (hashCode * 31)) * 31) + this.f41537c) * 31) + this.f41538d;
            this.f41543j = hashCode2;
            int hashCode3 = this.f41542h.hashCode() + (hashCode2 * 31);
            this.f41543j = hashCode3;
            int hashCode4 = this.f41539e.hashCode() + (hashCode3 * 31);
            this.f41543j = hashCode4;
            int hashCode5 = this.f41540f.hashCode() + (hashCode4 * 31);
            this.f41543j = hashCode5;
            this.f41543j = this.i.f41011b.hashCode() + (hashCode5 * 31);
        }
        return this.f41543j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f41536b + ", width=" + this.f41537c + ", height=" + this.f41538d + ", resourceClass=" + this.f41539e + ", transcodeClass=" + this.f41540f + ", signature=" + this.f41541g + ", hashCode=" + this.f41543j + ", transformations=" + this.f41542h + ", options=" + this.i + '}';
    }
}
