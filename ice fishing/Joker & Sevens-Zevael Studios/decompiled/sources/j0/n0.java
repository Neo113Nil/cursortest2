package j0;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import m0.r1;
import y1.y0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0.n f3410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1.g0 f3411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f3412i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f3413j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f3414k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0.d f3415l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(y0.n nVar, f1.g0 g0Var, long j3, float f10, float f11, u0.d dVar) {
        super(2);
        this.f3410g = nVar;
        this.f3411h = g0Var;
        this.f3412i = j3;
        this.f3413j = f10;
        this.f3414k = f11;
        this.f3415l = dVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        m0.r rVar = (m0.r) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        ac.o oVar = ac.o.f277a;
        if (intValue == 2 && rVar.B()) {
            rVar.S();
            return oVar;
        }
        y0.n b2 = p0.b(this.f3410g, this.f3411h, p0.c(this.f3412i, this.f3413j, rVar), ((s2.c) rVar.j(y0.f8709h)).x(this.f3414k));
        e eVar = e.f3316j;
        AtomicInteger atomicInteger = e2.k.f1989a;
        y0.n d10 = b2.d(new AppendedSemanticsElement(eVar, false));
        m0 m0Var = new m0(2, 0, null);
        r1.g gVar = r1.u.f5994a;
        y0.n d11 = d10.d(new SuspendPointerInputElement(oVar, null, new r1.t(m0Var), 6));
        v1.e0 e10 = z.m.e(y0.c.f8419g, true);
        int hashCode = Long.hashCode(rVar.T);
        r1 l10 = rVar.l();
        y0.n o7 = uc.e.o(rVar, d11);
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
        this.f3415l.invoke(rVar, 0);
        rVar.q(true);
        return oVar;
    }
}
