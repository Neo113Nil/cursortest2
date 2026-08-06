package f1;

import A1.InterfaceC0020v;
import h1.C0239i;
import java.util.List;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: f1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180n extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0161L f2947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f2948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0180n(C0161L c0161l, List list, l1.d dVar) {
        super(2, dVar);
        this.f2947f = c0161l;
        this.f2948g = list;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0180n(this.f2947f, this.f2948g, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f2946e;
        if (i2 == 0) {
            R1.l.F(obj);
            this.f2946e = 1;
            obj = C0161L.o(this.f2947f, this.f2948g, this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return obj;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0180n) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
