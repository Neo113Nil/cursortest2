package F;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040p(P p2, l1.d dVar) {
        super(2, dVar);
        this.f542f = p2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0040p(this.f542f, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f541e;
        if (i2 == 0) {
            R1.l.F(obj);
            this.f541e = 1;
            if (P.c(this.f542f, this) == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0040p) b((D1.e) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
