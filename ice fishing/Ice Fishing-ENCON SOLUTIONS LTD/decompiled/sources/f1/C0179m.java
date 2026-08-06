package f1;

import h1.C0239i;
import n1.AbstractC0995f;

/* renamed from: f1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179m extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179m(I.d dVar, String str, l1.d dVar2) {
        super(2, dVar2);
        this.f2944f = dVar;
        this.f2945g = str;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0179m c0179m = new C0179m(this.f2944f, this.f2945g, dVar);
        c0179m.f2943e = obj;
        return c0179m;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        ((I.b) this.f2943e).d(this.f2944f, this.f2945g);
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        C0179m c0179m = (C0179m) b((I.b) obj, (l1.d) obj2);
        C0239i c0239i = C0239i.f3393a;
        c0179m.g(c0239i);
        return c0239i;
    }
}
