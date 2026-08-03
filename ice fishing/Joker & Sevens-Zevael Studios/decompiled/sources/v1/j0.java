package v1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: g, reason: collision with root package name */
    public int f7085g;

    /* renamed from: h, reason: collision with root package name */
    public int f7086h;

    /* renamed from: i, reason: collision with root package name */
    public long f7087i;

    /* renamed from: j, reason: collision with root package name */
    public long f7088j = l0.f7096a;

    /* renamed from: k, reason: collision with root package name */
    public long f7089k = 0;

    public j0() {
        long j3 = 0;
        this.f7087i = (j3 & 4294967295L) | (j3 << 32);
    }

    public int I() {
        return (int) (this.f7087i & 4294967295L);
    }

    public int K() {
        return (int) (this.f7087i >> 32);
    }

    public final void M() {
        this.f7085g = uc.e.h((int) (this.f7087i >> 32), s2.a.j(this.f7088j), s2.a.h(this.f7088j));
        this.f7086h = uc.e.h((int) (this.f7087i & 4294967295L), s2.a.i(this.f7088j), s2.a.g(this.f7088j));
        int i10 = this.f7085g;
        long j3 = this.f7087i;
        this.f7089k = (((i10 - ((int) (j3 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j3 & 4294967295L))) / 2));
    }

    public abstract void P(long j3, float f10, oc.c cVar);

    public final void Q(long j3) {
        if (s2.k.a(this.f7087i, j3)) {
            return;
        }
        this.f7087i = j3;
        M();
    }

    public final void S(long j3) {
        if (s2.a.b(this.f7088j, j3)) {
            return;
        }
        this.f7088j = j3;
        M();
    }

    public abstract Object g();
}
