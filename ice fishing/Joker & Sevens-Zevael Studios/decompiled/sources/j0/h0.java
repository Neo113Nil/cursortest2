package j0;

import m0.d1;
import m0.x2;
import v.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f3341a = new x2(k.f3393o);

    /* renamed from: b, reason: collision with root package name */
    public static final m0.e0 f3342b = new m0.e0(k.f3392n);

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f3343c;

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f3344d;

    static {
        long j3 = f1.q.f2283h;
        f3343c = new i0(true, Float.NaN, j3);
        f3344d = new i0(false, Float.NaN, j3);
    }

    public static final w.i0 a(float f10, m0.r rVar, int i10, int i11) {
        w.i0 i0Var;
        boolean z10 = true;
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j3 = f1.q.f2283h;
        rVar.X(-1280632857);
        if (((Boolean) rVar.j(f3341a)).booleanValue()) {
            h1 h1Var = i0.o.f2986a;
            d1 u10 = m0.z.u(new f1.q(j3), rVar);
            boolean z12 = (((i10 & 14) ^ 6) > 4 && rVar.g(z11)) || (i10 & 6) == 4;
            if ((((i10 & 112) ^ 48) <= 32 || !rVar.c(f10)) && (i10 & 48) != 32) {
                z10 = false;
            }
            boolean z13 = z12 | z10;
            Object M = rVar.M();
            if (z13 || M == m0.l.f4646a) {
                M = new i0.e(z11, f10, u10);
                rVar.i0(M);
            }
            i0Var = (i0.e) M;
        } else if (s2.f.a(f10, Float.NaN) && f1.q.c(j3, j3)) {
            i0Var = z11 ? f3343c : f3344d;
        } else {
            i0Var = new i0(z11, f10, j3);
        }
        rVar.q(false);
        return i0Var;
    }
}
