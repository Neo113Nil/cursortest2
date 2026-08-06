package F;

import a.AbstractC0083a;
import h1.C0239i;
import java.util.List;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f469e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f471g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029e(List list, l1.d dVar) {
        super(2, dVar);
        this.f471g = list;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0029e c0029e = new C0029e(this.f471g, dVar);
        c0029e.f470f = obj;
        return c0029e;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f469e;
        if (i2 == 0) {
            R1.l.F(obj);
            C0036l c0036l = (C0036l) this.f470f;
            this.f469e = 1;
            if (AbstractC0083a.a(this.f471g, c0036l, this) == enumC0985a) {
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
        return ((C0029e) b((C0036l) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
