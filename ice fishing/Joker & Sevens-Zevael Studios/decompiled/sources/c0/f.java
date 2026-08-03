package c0;

import a0.l;
import ac.o;
import hc.j;
import p6.i;
import v1.p;
import x1.f1;
import x1.v;
import x1.z1;
import y0.m;
import yc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends m implements a, v, z1 {

    /* renamed from: w, reason: collision with root package name */
    public static final i f1191w = new i();

    /* renamed from: u, reason: collision with root package name */
    public x.i f1192u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1193v;

    public static final e1.c r0(f fVar, f1 f1Var, oc.a aVar) {
        e1.c cVar;
        if (fVar.f8456t && fVar.f1193v) {
            f1 u10 = x1.f.u(fVar);
            if (!f1Var.B0().f8456t) {
                f1Var = null;
            }
            if (f1Var != null && (cVar = (e1.c) aVar.invoke()) != null) {
                float f10 = u10.C(f1Var, false).f1931a;
                return cVar.e((Float.floatToRawIntBits(r4.f1932b) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
            }
        }
        return null;
    }

    @Override // c0.a
    public final Object E(f1 f1Var, oc.a aVar, j jVar) {
        Object e10 = a0.e(new e(this, f1Var, aVar, new l(this, f1Var, aVar), null), jVar);
        return e10 == gc.a.f2559g ? e10 : o.f277a;
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // x1.v
    public final void j(p pVar) {
        this.f1193v = true;
    }

    @Override // x1.z1
    public final Object r() {
        return f1191w;
    }
}
