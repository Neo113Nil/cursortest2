package f1;

import h1.C0239i;
import n1.AbstractC0995f;

/* renamed from: f1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158I extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2900g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158I(I.d dVar, long j2, l1.d dVar2) {
        super(2, dVar2);
        this.f2899f = dVar;
        this.f2900g = j2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0158I c0158i = new C0158I(this.f2899f, this.f2900g, dVar);
        c0158i.f2898e = obj;
        return c0158i;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        ((I.b) this.f2898e).d(this.f2899f, new Long(this.f2900g));
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        C0158I c0158i = (C0158I) b((I.b) obj, (l1.d) obj2);
        C0239i c0239i = C0239i.f3393a;
        c0158i.g(c0239i);
        return c0239i;
    }
}
