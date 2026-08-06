package f1;

import A1.InterfaceC0020v;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: f1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160K extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0161L f2906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2908h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160K(C0161L c0161l, String str, String str2, l1.d dVar) {
        super(2, dVar);
        this.f2906f = c0161l;
        this.f2907g = str;
        this.f2908h = str2;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new C0160K(this.f2906f, this.f2907g, this.f2908h, dVar);
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f2905e;
        if (i2 == 0) {
            R1.l.F(obj);
            this.f2905e = 1;
            if (C0161L.i(this.f2906f, this.f2907g, this.f2908h, this) == enumC0985a) {
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
        return ((C0160K) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
