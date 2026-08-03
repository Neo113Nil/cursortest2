package k0;

import f1.q;
import h2.h0;
import h2.s;
import h2.t;
import j0.f;
import j0.n;
import j0.r0;
import m0.e0;
import m0.r;
import m0.v1;
import m0.x1;
import m0.z;
import u0.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f3585a = new t(new s());

    public static final void a(long j3, h0 h0Var, d dVar, r rVar, int i10) {
        rVar.Z(-716124955);
        if ((((rVar.e(j3) ? 4 : 2) | i10 | (rVar.f(h0Var) ? 32 : 16)) & 147) == 146 && rVar.B()) {
            rVar.S();
        } else {
            e0 e0Var = r0.f3456a;
            z.b(new v1[]{n.f3409a.a(new q(j3)), e0Var.a(((h0) rVar.j(e0Var)).c(h0Var))}, dVar, rVar, 56);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new f(j3, h0Var, dVar, i10);
        }
    }
}
