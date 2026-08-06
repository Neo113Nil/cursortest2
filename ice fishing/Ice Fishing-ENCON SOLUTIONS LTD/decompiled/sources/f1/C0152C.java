package f1;

import h1.C0239i;
import n1.AbstractC0995f;

/* renamed from: f1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152C extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152C(I.d dVar, boolean z2, l1.d dVar2) {
        super(2, dVar2);
        this.f2877f = dVar;
        this.f2878g = z2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0152C c0152c = new C0152C(this.f2877f, this.f2878g, dVar);
        c0152c.f2876e = obj;
        return c0152c;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        ((I.b) this.f2876e).d(this.f2877f, Boolean.valueOf(this.f2878g));
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        C0152C c0152c = (C0152C) b((I.b) obj, (l1.d) obj2);
        C0239i c0239i = C0239i.f3393a;
        c0152c.g(c0239i);
        return c0239i;
    }
}
