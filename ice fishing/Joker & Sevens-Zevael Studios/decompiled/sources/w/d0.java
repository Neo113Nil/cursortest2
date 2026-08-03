package w;

import x1.f1;
import x1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends y0.m implements z1, x1.o {

    /* renamed from: w, reason: collision with root package name */
    public static final t0 f7401w = new t0();

    /* renamed from: u, reason: collision with root package name */
    public boolean f7402u;

    /* renamed from: v, reason: collision with root package name */
    public f1 f7403v;

    @Override // x1.o
    public final void g(f1 f1Var) {
        e0 r02;
        this.f7403v = f1Var;
        if (this.f7402u) {
            if (!f1Var.B0().f8456t) {
                e0 r03 = r0();
                if (r03 != null) {
                    r03.r0(null);
                    return;
                }
                return;
            }
            f1 f1Var2 = this.f7403v;
            if (f1Var2 == null || !f1Var2.B0().f8456t || (r02 = r0()) == null) {
                return;
            }
            r02.r0(this.f7403v);
        }
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // x1.z1
    public final Object r() {
        return f7401w;
    }

    public final e0 r0() {
        if (!this.f8456t) {
            return null;
        }
        z1 j3 = x1.f.j(this, e0.f7411v);
        if (j3 instanceof e0) {
            return (e0) j3;
        }
        return null;
    }
}
