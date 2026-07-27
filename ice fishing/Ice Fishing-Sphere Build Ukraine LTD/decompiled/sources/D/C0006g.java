package D;

import t0.C0252g;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends x0.f implements D0.l {

    /* renamed from: i, reason: collision with root package name */
    public int f189i;

    @Override // D0.l
    public final Object i(Object obj) {
        C0006g c0006g = new C0006g(1, (v0.d) obj);
        C0252g c0252g = C0252g.f2994a;
        c0006g.n(c0252g);
        return c0252g;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        int i2 = this.f189i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f189i = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.g.z(obj);
        return C0252g.f2994a;
    }
}
