package c1;

import a0.a0;
import pc.j;
import pc.k;
import s2.l;
import x1.h1;
import x1.i0;
import x1.n;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends m implements h1, a, n {

    /* renamed from: u, reason: collision with root package name */
    public final d f1200u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1201v;

    /* renamed from: w, reason: collision with root package name */
    public final a0 f1202w;

    public c(d dVar, a0 a0Var) {
        this.f1200u = dVar;
        this.f1202w = a0Var;
        dVar.f1203g = this;
    }

    @Override // x1.h1
    public final void C() {
        r0();
    }

    @Override // x1.n
    public final void X() {
        r0();
    }

    @Override // x1.l
    public final void a() {
        r0();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [oc.c, pc.k] */
    @Override // x1.n
    public final void b(i0 i0Var) {
        boolean z10 = this.f1201v;
        d dVar = this.f1200u;
        if (!z10) {
            dVar.f1204h = null;
            x1.f.s(this, new b(0, this, dVar));
            if (dVar.f1204h == null) {
                throw a4.d.e("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f1201v = true;
        }
        f8.c cVar = dVar.f1204h;
        j.b(cVar);
        ((k) cVar.f2340h).invoke(i0Var);
    }

    @Override // x1.l
    public final void b0() {
        r0();
    }

    @Override // c1.a
    public final s2.c c() {
        return x1.f.v(this).B;
    }

    @Override // c1.a
    public final long d() {
        return i7.b.F(x1.f.t(this, 128).f7087i);
    }

    @Override // c1.a
    public final l getLayoutDirection() {
        return x1.f.v(this).C;
    }

    @Override // y0.m
    public final void l0() {
        r0();
    }

    public final void r0() {
        this.f1201v = false;
        this.f1200u.f1204h = null;
        x1.f.m(this);
    }

    @Override // y0.m
    public final void k0() {
    }
}
