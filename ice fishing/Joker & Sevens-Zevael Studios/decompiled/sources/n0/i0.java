package n0;

import m0.m2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5008b;

    public i0(int i10, int i11) {
        this.f5007a = i10;
        this.f5008b = i11;
    }

    public abstract void a(k0 k0Var, m0.c cVar, m2 m2Var, x4.q qVar, j0 j0Var);

    public m0.a b(k0 k0Var) {
        return null;
    }

    public final String toString() {
        String c3 = pc.t.a(getClass()).c();
        return c3 == null ? "" : c3;
    }

    public /* synthetic */ i0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
