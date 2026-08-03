package ud;

import ac.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.q;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import k2.l;
import m0.r;
import m0.r1;
import m0.x2;
import m0.z;
import org.fortheloss.st.R;
import pc.j;
import u.l0;
import y0.k;
import y0.n;
import z.c0;
import z.g0;
import z.i0;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6755h;

    public /* synthetic */ f(int i10, Object obj) {
        this.f6754g = i10;
        this.f6755h = obj;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f6754g;
        o oVar = o.f277a;
        Object obj4 = this.f6755h;
        switch (i10) {
            case 0:
                r rVar = (r) obj2;
                int intValue = ((Number) obj3).intValue();
                j.e((s) obj, "$this$Card");
                if ((intValue & 17) != 16 || !rVar.B()) {
                    n f10 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 16);
                    oc.a aVar = (oc.a) obj4;
                    i0 a6 = g0.a(z.i.f8959a, y0.c.f8429q, rVar, 48);
                    int o7 = z.o(rVar);
                    r1 l10 = rVar.l();
                    n o10 = uc.e.o(rVar, f10);
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(zVar);
                    } else {
                        rVar.l0();
                    }
                    z.w(a6, rVar, x1.i.f8079e);
                    z.w(l10, rVar, x1.i.f8078d);
                    x1.h hVar = x1.i.f8080f;
                    if (rVar.S || !j.a(rVar.M(), Integer.valueOf(o7))) {
                        a4.d.p(o7, rVar, o7, hVar);
                    }
                    z.w(o10, rVar, x1.i.f8077c);
                    g.a(aVar, rVar, 0);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.j(8));
                    r0.b("GAME RULES", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(t0.f3483a)).f3467e, ee.a.f2155b, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar, 6, 65534);
                    rVar.q(true);
                    break;
                } else {
                    rVar.S();
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                r rVar2 = (r) obj2;
                int intValue2 = ((Number) obj3).intValue();
                j.e((s) obj, "$this$Card");
                if ((intValue2 & 17) != 16 || !rVar2.B()) {
                    n f11 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 16);
                    oc.a aVar2 = (oc.a) obj4;
                    i0 a8 = g0.a(z.i.f8959a, y0.c.f8429q, rVar2, 48);
                    int o11 = z.o(rVar2);
                    r1 l11 = rVar2.l();
                    n o12 = uc.e.o(rVar2, f11);
                    x1.j.f8084f.getClass();
                    x1.z zVar2 = x1.i.f8076b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(zVar2);
                    } else {
                        rVar2.l0();
                    }
                    z.w(a8, rVar2, x1.i.f8079e);
                    z.w(l11, rVar2, x1.i.f8078d);
                    x1.h hVar2 = x1.i.f8080f;
                    if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(o11))) {
                        a4.d.p(o11, rVar2, o11, hVar2);
                    }
                    z.w(o12, rVar2, x1.i.f8077c);
                    float f12 = j0.b.f3291a;
                    float f13 = 0;
                    j0.g0.a(aVar2, null, false, d0.e.a(f13), j0.b.a(q.f2282g, rVar2), null, new c0(f13, f13, f13, f13), zd.b.f9185a, rVar2, 818085888);
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.j(8));
                    r0.b("BEST SCORES", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(t0.f3483a)).f3467e, ee.a.f2155b, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 6, 65534);
                    rVar2.q(true);
                    break;
                } else {
                    rVar2.S();
                    break;
                }
                break;
            default:
                r rVar3 = (r) obj2;
                int intValue3 = ((Number) obj3).intValue();
                j.e((s) obj, "$this$Card");
                if ((intValue3 & 17) != 16 || !rVar3.B()) {
                    n f14 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 16);
                    y0.d dVar = y0.c.f8431s;
                    z.c cVar = z.i.f8961c;
                    String str = (String) obj4;
                    z.r a10 = z.q.a(cVar, dVar, rVar3, 54);
                    int o13 = z.o(rVar3);
                    r1 l12 = rVar3.l();
                    n o14 = uc.e.o(rVar3, f14);
                    x1.j.f8084f.getClass();
                    x1.z zVar3 = x1.i.f8076b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(zVar3);
                    } else {
                        rVar3.l0();
                    }
                    x1.h hVar3 = x1.i.f8079e;
                    z.w(a10, rVar3, hVar3);
                    x1.h hVar4 = x1.i.f8078d;
                    z.w(l12, rVar3, hVar4);
                    x1.h hVar5 = x1.i.f8080f;
                    if (rVar3.S || !j.a(rVar3.M(), Integer.valueOf(o13))) {
                        a4.d.p(o13, rVar3, o13, hVar5);
                    }
                    x1.h hVar6 = x1.i.f8077c;
                    z.w(o14, rVar3, hVar6);
                    x2 x2Var = t0.f3483a;
                    r0.b("You have chips:", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar3.j(x2Var)).f3474l, q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar3, 0, 65534);
                    k kVar = k.f8442a;
                    u2.b.g(rVar3, androidx.compose.foundation.layout.b.c(kVar, 6));
                    i0 a11 = g0.a(cVar, y0.c.f8429q, rVar3, 54);
                    int o15 = z.o(rVar3);
                    r1 l13 = rVar3.l();
                    n o16 = uc.e.o(rVar3, kVar);
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(zVar3);
                    } else {
                        rVar3.l0();
                    }
                    z.w(a11, rVar3, hVar3);
                    z.w(l13, rVar3, hVar4);
                    if (rVar3.S || !j.a(rVar3.M(), Integer.valueOf(o15))) {
                        a4.d.p(o15, rVar3, o15, hVar5);
                    }
                    z.w(o16, rVar3, hVar6);
                    l0.a(i7.b.B(R.drawable.chips, rVar3), "image chips", androidx.compose.foundation.layout.b.h(kVar, 40), null, v1.j.f7083b, 0.0f, rVar3, 25008, 104);
                    u2.b.g(rVar3, androidx.compose.foundation.layout.b.j(8));
                    r0.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar3.j(x2Var)).f3468f, ee.a.f2156c, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar3, 0, 65534);
                    rVar3.q(true);
                    rVar3.q(true);
                    break;
                } else {
                    rVar3.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
