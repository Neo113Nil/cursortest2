package F;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* renamed from: F.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047x extends AbstractC0995f implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public int f563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047x(H h2, l1.d dVar) {
        super(1, dVar);
        this.f564f = h2;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f563e;
        if (i2 == 0) {
            R1.l.F(obj);
            this.f563e = 1;
            obj = this.f564f.invoke(this);
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

    @Override // t1.l
    public final Object invoke(Object obj) {
        return new C0047x(this.f564f, (l1.d) obj).g(C0239i.f3393a);
    }
}
