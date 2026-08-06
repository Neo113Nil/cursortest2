package F;

import h1.C0239i;
import n1.AbstractC0995f;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g extends AbstractC0995f implements t1.l {

    /* renamed from: e, reason: collision with root package name */
    public int f484e;

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        int i2 = this.f484e;
        if (i2 == 0) {
            R1.l.F(obj);
            this.f484e = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        R1.l.F(obj);
        return C0239i.f3393a;
    }

    @Override // t1.l
    public final Object invoke(Object obj) {
        C0031g c0031g = new C0031g(1, (l1.d) obj);
        C0239i c0239i = C0239i.f3393a;
        c0031g.g(c0239i);
        return c0239i;
    }
}
