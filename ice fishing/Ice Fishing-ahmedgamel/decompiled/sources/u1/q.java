package u1;

import java.security.MessageDigest;
import s1.InterfaceC4970e;

/* loaded from: classes.dex */
public final class q implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f41153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41154c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41155d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f41156e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f41157f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4970e f41158g;

    /* renamed from: h, reason: collision with root package name */
    public final N1.c f41159h;
    public final s1.h i;

    /* renamed from: j, reason: collision with root package name */
    public int f41160j;

    public q(Object obj, InterfaceC4970e interfaceC4970e, int i, int i6, N1.c cVar, Class cls, Class cls2, s1.h hVar) {
        N1.g.c(obj, "Argument must not be null");
        this.f41153b = obj;
        this.f41158g = interfaceC4970e;
        this.f41154c = i;
        this.f41155d = i6;
        N1.g.c(cVar, "Argument must not be null");
        this.f41159h = cVar;
        N1.g.c(cls, "Resource class must not be null");
        this.f41156e = cls;
        N1.g.c(cls2, "Transcode class must not be null");
        this.f41157f = cls2;
        N1.g.c(hVar, "Argument must not be null");
        this.i = hVar;
    }

    @Override // s1.InterfaceC4970e
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // s1.InterfaceC4970e
    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f41153b.equals(qVar.f41153b) && this.f41158g.equals(qVar.f41158g) && this.f41155d == qVar.f41155d && this.f41154c == qVar.f41154c && this.f41159h.equals(qVar.f41159h) && this.f41156e.equals(qVar.f41156e) && this.f41157f.equals(qVar.f41157f) && this.i.equals(qVar.i);
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        if (this.f41160j == 0) {
            int hashCode = this.f41153b.hashCode();
            this.f41160j = hashCode;
            int hashCode2 = ((((this.f41158g.hashCode() + (hashCode * 31)) * 31) + this.f41154c) * 31) + this.f41155d;
            this.f41160j = hashCode2;
            int hashCode3 = this.f41159h.hashCode() + (hashCode2 * 31);
            this.f41160j = hashCode3;
            int hashCode4 = this.f41156e.hashCode() + (hashCode3 * 31);
            this.f41160j = hashCode4;
            int hashCode5 = this.f41157f.hashCode() + (hashCode4 * 31);
            this.f41160j = hashCode5;
            this.f41160j = this.i.f40457b.hashCode() + (hashCode5 * 31);
        }
        return this.f41160j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f41153b + ", width=" + this.f41154c + ", height=" + this.f41155d + ", resourceClass=" + this.f41156e + ", transcodeClass=" + this.f41157f + ", signature=" + this.f41158g + ", hashCode=" + this.f41160j + ", transformations=" + this.f41159h + ", options=" + this.i + '}';
    }
}
