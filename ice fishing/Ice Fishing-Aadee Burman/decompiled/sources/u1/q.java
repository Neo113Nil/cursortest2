package u1;

import java.security.MessageDigest;
import s1.InterfaceC4970e;

/* loaded from: classes.dex */
public final class q implements InterfaceC4970e {

    /* renamed from: b, reason: collision with root package name */
    public final Object f41150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41152d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f41153e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f41154f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4970e f41155g;

    /* renamed from: h, reason: collision with root package name */
    public final N1.c f41156h;
    public final s1.h i;

    /* renamed from: j, reason: collision with root package name */
    public int f41157j;

    public q(Object obj, InterfaceC4970e interfaceC4970e, int i, int i6, N1.c cVar, Class cls, Class cls2, s1.h hVar) {
        N1.g.c(obj, "Argument must not be null");
        this.f41150b = obj;
        this.f41155g = interfaceC4970e;
        this.f41151c = i;
        this.f41152d = i6;
        N1.g.c(cVar, "Argument must not be null");
        this.f41156h = cVar;
        N1.g.c(cls, "Resource class must not be null");
        this.f41153e = cls;
        N1.g.c(cls2, "Transcode class must not be null");
        this.f41154f = cls2;
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
        return this.f41150b.equals(qVar.f41150b) && this.f41155g.equals(qVar.f41155g) && this.f41152d == qVar.f41152d && this.f41151c == qVar.f41151c && this.f41156h.equals(qVar.f41156h) && this.f41153e.equals(qVar.f41153e) && this.f41154f.equals(qVar.f41154f) && this.i.equals(qVar.i);
    }

    @Override // s1.InterfaceC4970e
    public final int hashCode() {
        if (this.f41157j == 0) {
            int hashCode = this.f41150b.hashCode();
            this.f41157j = hashCode;
            int hashCode2 = ((((this.f41155g.hashCode() + (hashCode * 31)) * 31) + this.f41151c) * 31) + this.f41152d;
            this.f41157j = hashCode2;
            int hashCode3 = this.f41156h.hashCode() + (hashCode2 * 31);
            this.f41157j = hashCode3;
            int hashCode4 = this.f41153e.hashCode() + (hashCode3 * 31);
            this.f41157j = hashCode4;
            int hashCode5 = this.f41154f.hashCode() + (hashCode4 * 31);
            this.f41157j = hashCode5;
            this.f41157j = this.i.f40454b.hashCode() + (hashCode5 * 31);
        }
        return this.f41157j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f41150b + ", width=" + this.f41151c + ", height=" + this.f41152d + ", resourceClass=" + this.f41153e + ", transcodeClass=" + this.f41154f + ", signature=" + this.f41155g + ", hashCode=" + this.f41157j + ", transformations=" + this.f41156h + ", options=" + this.i + '}';
    }
}
