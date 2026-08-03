package u;

import m0.l1;
import m0.z0;
import v.e1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f6590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6591h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pc.k f6592i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f6593j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0.q f6594k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0.d f6595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(e1 e1Var, Object obj, oc.c cVar, m mVar, w0.q qVar, u0.d dVar) {
        super(2);
        this.f6590g = e1Var;
        this.f6591h = obj;
        this.f6592i = (pc.k) cVar;
        this.f6593j = mVar;
        this.f6594k = qVar;
        this.f6595l = dVar;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [oc.c, pc.k] */
    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        m0.r rVar = (m0.r) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rVar.B()) {
            rVar.S();
        } else {
            Object M = rVar.M();
            ?? r12 = this.f6592i;
            m mVar = this.f6593j;
            z0 z0Var = m0.l.f4646a;
            if (M == z0Var) {
                M = (u) r12.invoke(mVar);
                rVar.i0(M);
            }
            u uVar = (u) M;
            e1 e1Var = this.f6590g;
            v.z0 f10 = e1Var.f();
            l1 l1Var = e1Var.f6826d;
            Object c3 = f10.c();
            Object obj3 = this.f6591h;
            boolean g8 = rVar.g(pc.j.a(c3, obj3));
            Object M2 = rVar.M();
            if (g8 || M2 == z0Var) {
                M2 = pc.j.a(e1Var.f().c(), obj3) ? g0.f6599b : ((u) r12.invoke(mVar)).f6642b;
                rVar.i0(M2);
            }
            g0 g0Var = (g0) M2;
            Object M3 = rVar.M();
            if (M3 == z0Var) {
                M3 = new j(pc.j.a(obj3, l1Var.getValue()));
                rVar.i0(M3);
            }
            j jVar = (j) M3;
            f0 f0Var = uVar.f6641a;
            boolean h10 = rVar.h(uVar);
            Object M4 = rVar.M();
            if (h10 || M4 == z0Var) {
                M4 = new c(uVar);
                rVar.i0(M4);
            }
            y0.n a6 = androidx.compose.ui.layout.a.a((oc.f) M4);
            jVar.f6608a.setValue(Boolean.valueOf(pc.j.a(obj3, l1Var.getValue())));
            y0.n d10 = a6.d(jVar);
            boolean h11 = rVar.h(obj3);
            Object M5 = rVar.M();
            if (h11 || M5 == z0Var) {
                M5 = new d(0, obj3);
                rVar.i0(M5);
            }
            oc.c cVar = (oc.c) M5;
            boolean f11 = rVar.f(g0Var);
            Object M6 = rVar.M();
            if (f11 || M6 == z0Var) {
                M6 = new a1.g(3, g0Var);
                rVar.i0(M6);
            }
            androidx.compose.animation.a.a(e1Var, cVar, d10, f0Var, g0Var, (oc.e) M6, u0.e.e(-616195562, new e(this.f6594k, obj3, mVar, this.f6595l), rVar), rVar, 12582912);
        }
        return ac.o.f277a;
    }
}
