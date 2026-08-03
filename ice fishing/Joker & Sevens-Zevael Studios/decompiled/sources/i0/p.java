package i0;

import s.a0;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class p extends y0.m implements x1.k, x1.n, x1.v {
    public float A;
    public boolean C;

    /* renamed from: u, reason: collision with root package name */
    public final y.i f2987u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2988v;

    /* renamed from: w, reason: collision with root package name */
    public final float f2989w;

    /* renamed from: x, reason: collision with root package name */
    public final f8.c f2990x;

    /* renamed from: y, reason: collision with root package name */
    public final j0.o f2991y;

    /* renamed from: z, reason: collision with root package name */
    public a0.u f2992z;
    public long B = 0;
    public final a0 D = new a0();

    public p(y.i iVar, boolean z10, float f10, f8.c cVar, j0.o oVar) {
        this.f2987u = iVar;
        this.f2988v = z10;
        this.f2989w = f10;
        this.f2990x = cVar;
        this.f2991y = oVar;
    }

    @Override // x1.n
    public final void b(i0 i0Var) {
        i0Var.a();
        a0.u uVar = this.f2992z;
        if (uVar != null) {
            uVar.d(i0Var, this.A, this.f2990x.q());
        }
        s0(i0Var);
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // y0.m
    public final void j0() {
        yc.a0.q(f0(), null, new c0.d(this, null, 3), 3);
    }

    public abstract void r0(y.k kVar, long j3, float f10);

    @Override // x1.v
    public final void s(long j3) {
        this.C = true;
        s2.c cVar = x1.f.v(this).B;
        this.B = i7.b.F(j3);
        float f10 = this.f2989w;
        this.A = Float.isNaN(f10) ? k.a(cVar, this.f2988v, this.B) : cVar.x(f10);
        a0 a0Var = this.D;
        Object[] objArr = a0Var.f6219a;
        int i10 = a0Var.f6220b;
        for (int i11 = 0; i11 < i10; i11++) {
            t0((y.m) objArr[i11]);
        }
        a0Var.c();
    }

    public abstract void s0(i0 i0Var);

    public final void t0(y.m mVar) {
        if (mVar instanceof y.k) {
            r0((y.k) mVar, this.B, this.A);
        } else if (mVar instanceof y.l) {
            u0(((y.l) mVar).f8415a);
        } else if (mVar instanceof y.j) {
            u0(((y.j) mVar).f8413a);
        }
    }

    public abstract void u0(y.k kVar);
}
