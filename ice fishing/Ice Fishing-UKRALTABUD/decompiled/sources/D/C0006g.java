package D;

/* renamed from: D.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends x0.f implements D0.l {

    /* renamed from: j, reason: collision with root package name */
    public int f189j;

    @Override // D0.l
    public final Object i(Object obj) {
        C0006g c0006g = new C0006g(1, (v0.d) obj);
        t0.g gVar = t0.g.f2989a;
        c0006g.n(gVar);
        return gVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        int i2 = this.f189j;
        if (i2 == 0) {
            o.g.C(obj);
            this.f189j = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.g.C(obj);
        return t0.g.f2989a;
    }
}
