package j0;

import androidx.compose.material3.MinimumInteractiveModifier;
import m0.r1;
import m0.x2;
import y1.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0.n f3418g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1.g0 f3419h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f3420i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f3421j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y.i f3422k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f3423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ oc.a f3424m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f3425n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u0.d f3426o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(y0.n nVar, f1.g0 g0Var, long j3, float f10, y.i iVar, boolean z10, oc.a aVar, float f11, u0.d dVar) {
        super(2);
        this.f3418g = nVar;
        this.f3419h = g0Var;
        this.f3420i = j3;
        this.f3421j = f10;
        this.f3422k = iVar;
        this.f3423l = z10;
        this.f3424m = aVar;
        this.f3425n = f11;
        this.f3426o = dVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        m0.r rVar = (m0.r) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rVar.B()) {
            rVar.S();
        } else {
            x2 x2Var = v.f3485a;
            y0.n c3 = androidx.compose.foundation.a.c(p0.b(this.f3418g.d(MinimumInteractiveModifier.f569a), this.f3419h, p0.c(this.f3420i, this.f3421j, rVar), ((s2.c) rVar.j(y0.f8709h)).x(this.f3425n)), this.f3422k, h0.a(0.0f, rVar, 0, 7), this.f3423l, null, this.f3424m, 24);
            v1.e0 e10 = z.m.e(y0.c.f8419g, true);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            y0.n o7 = uc.e.o(rVar, c3);
            x1.j.f8084f.getClass();
            x1.z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(e10, rVar, x1.i.f8079e);
            m0.z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            m0.z.w(o7, rVar, x1.i.f8077c);
            this.f3426o.invoke(rVar, 0);
            rVar.q(true);
        }
        return ac.o.f277a;
    }
}
