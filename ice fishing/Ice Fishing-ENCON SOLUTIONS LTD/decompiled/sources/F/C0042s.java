package F;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0991b;
import n1.AbstractC0995f;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042s extends AbstractC0995f implements t1.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f546e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f547f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f548g;

    public /* synthetic */ C0042s(int i2, l1.d dVar) {
        super(i2, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        switch (this.f546e) {
            case 0:
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                int i2 = this.f547f;
                if (i2 == 0) {
                    R1.l.F(obj);
                    this.f547f = 1;
                    if (P.a((P) this.f548g, this) == enumC0985a) {
                        return enumC0985a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.l.F(obj);
                }
                return C0239i.f3393a;
            default:
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                int i3 = this.f547f;
                if (i3 == 0) {
                    R1.l.F(obj);
                    S s2 = (S) this.f548g;
                    this.f547f = 1;
                    s2.getClass();
                    obj = S.a(s2, this);
                    if (obj == enumC0985a2) {
                        return enumC0985a2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    R1.l.F(obj);
                }
                return obj;
        }
    }

    public final Object j(Object obj, Object obj2, AbstractC0991b abstractC0991b) {
        switch (this.f546e) {
            case 0:
                return new C0042s((P) this.f548g, abstractC0991b).g(C0239i.f3393a);
            default:
                ((Boolean) obj2).getClass();
                C0042s c0042s = new C0042s(3, abstractC0991b);
                c0042s.f548g = (S) obj;
                return c0042s.g(C0239i.f3393a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0042s(P p2, l1.d dVar) {
        super(3, dVar);
        this.f548g = p2;
    }
}
