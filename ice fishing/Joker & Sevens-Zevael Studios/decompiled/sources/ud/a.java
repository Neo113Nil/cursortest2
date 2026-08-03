package ud;

import ac.o;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import k2.l;
import m0.r;
import m0.r1;
import m0.x2;
import m0.z;
import pc.j;
import y0.k;
import y0.n;
import z.q;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oc.f {

    /* renamed from: h, reason: collision with root package name */
    public static final a f6743h = new a(0);

    /* renamed from: i, reason: collision with root package name */
    public static final a f6744i = new a(1);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6745g;

    public /* synthetic */ a(int i10) {
        this.f6745g = i10;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f6745g) {
            case 0:
                r rVar = (r) obj2;
                int intValue = ((Number) obj3).intValue();
                j.e((s) obj, "$this$Card");
                if ((intValue & 17) == 16 && rVar.B()) {
                    rVar.S();
                } else {
                    k kVar = k.f8442a;
                    n f10 = androidx.compose.foundation.layout.b.f(kVar, 16);
                    z.r a6 = q.a(z.i.f8960b, y0.c.f8430r, rVar, 0);
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
                    h0 h0Var = ((s0) rVar.j(t0.f3483a)).f3469g;
                    long j3 = ee.a.f2156c;
                    r0.b("📊 Scoring", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var, j3, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar, 6, 65534);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 12));
                    g.e("7️⃣", "Tap on SEVEN", "+1 Point", ee.a.f2154a, rVar, 3510);
                    float f11 = 8;
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f11));
                    g.e("🃏", "Tap on JOKER", "+2 Points + 1 Chip", ee.a.f2155b, rVar, 3510);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, f11));
                    g.e("💰", "Every 10 Points", "+1 Chip", j3, rVar, 3510);
                    rVar.q(true);
                }
                break;
            default:
                r rVar2 = (r) obj2;
                int intValue2 = ((Number) obj3).intValue();
                j.e((s) obj, "$this$Card");
                if ((intValue2 & 17) == 16 && rVar2.B()) {
                    rVar2.S();
                } else {
                    k kVar2 = k.f8442a;
                    n f12 = androidx.compose.foundation.layout.b.f(kVar2, 16);
                    z.r a8 = q.a(z.i.f8960b, y0.c.f8430r, rVar2, 0);
                    int o11 = z.o(rVar2);
                    r1 l11 = rVar2.l();
                    n o12 = uc.e.o(rVar2, f12);
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
                    x2 x2Var = t0.f3483a;
                    r0.b("💡 Tips", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var)).f3469g, ee.a.f2157d, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 6, 65534);
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar2, 8));
                    r0.b("• Focus on target cards (7 and Joker)\n• Don't tap non-target cards\n• Use power-ups strategically\n• Stay calm as difficulty increases", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var)).f3473k, f1.q.f2279d, 0L, null, null, 0L, 0L, null, 16777214), rVar2, 6, 65534);
                    rVar2.q(true);
                }
                break;
        }
        return o.f277a;
    }
}
