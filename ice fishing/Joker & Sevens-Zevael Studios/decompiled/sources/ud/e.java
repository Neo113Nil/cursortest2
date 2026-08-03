package ud;

import ac.o;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k2.l;
import m0.r;
import m0.r1;
import m0.x2;
import m0.z;
import pc.j;
import y0.k;
import y0.n;
import z.g0;
import z.i0;
import z.j0;
import z.q;
import z.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f6752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6753i;

    public /* synthetic */ e(String str, Object obj, int i10) {
        this.f6751g = i10;
        this.f6752h = str;
        this.f6753i = obj;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f6751g) {
            case 0:
                r rVar = (r) obj2;
                int intValue = ((Number) obj3).intValue();
                j.e((s) obj, "$this$Card");
                if ((intValue & 17) == 16 && rVar.B()) {
                    rVar.S();
                } else {
                    k kVar = k.f8442a;
                    n f10 = androidx.compose.foundation.layout.b.f(kVar, 16);
                    String str = (String) this.f6753i;
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
                    x2 x2Var = t0.f3483a;
                    r0.b(this.f6752h, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3469g, ee.a.f2155b, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar, 0, 65534);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 8));
                    r0.b(str, null, 0L, 0L, 0L, null, ((s0) rVar.j(x2Var)).f3472j.f2675b.f2698c, 0, false, 0, 0, h0.a(((s0) rVar.j(x2Var)).f3473k, f1.q.f2279d, 0L, null, null, 0L, 0L, null, 16777214), rVar, 0, 64510);
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
                    n f11 = androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.b.b(1.0f), 16);
                    y0.e eVar = y0.c.f8429q;
                    zd.c cVar = (zd.c) this.f6753i;
                    i0 a8 = g0.a(z.i.f8959a, eVar, rVar2, 48);
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
                    x1.h hVar2 = x1.i.f8079e;
                    z.w(a8, rVar2, hVar2);
                    x1.h hVar3 = x1.i.f8078d;
                    z.w(l11, rVar2, hVar3);
                    x1.h hVar4 = x1.i.f8080f;
                    if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(o11))) {
                        a4.d.p(o11, rVar2, o11, hVar4);
                    }
                    x1.h hVar5 = x1.i.f8077c;
                    z.w(o12, rVar2, hVar5);
                    x2 x2Var2 = t0.f3483a;
                    r0.b(this.f6752h, androidx.compose.foundation.layout.b.j(48), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((s0) rVar2.j(x2Var2)).f3467e, rVar2, 48, 65532);
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.j(8));
                    n a10 = j0.a();
                    z.r a11 = q.a(z.i.f8960b, y0.c.f8430r, rVar2, 0);
                    int o13 = z.o(rVar2);
                    r1 l12 = rVar2.l();
                    n o14 = uc.e.o(rVar2, a10);
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(zVar2);
                    } else {
                        rVar2.l0();
                    }
                    z.w(a11, rVar2, hVar2);
                    z.w(l12, rVar2, hVar3);
                    if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(o13))) {
                        a4.d.p(o13, rVar2, o13, hVar4);
                    }
                    z.w(o14, rVar2, hVar5);
                    r0.b(a4.d.g("Score: ", cVar.f9187b), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var2)).f3470h, ee.a.f2156c, 0L, l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 0, 65534);
                    float f12 = 4;
                    k kVar2 = k.f8442a;
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar2, f12));
                    String h10 = a4.d.h("💰 ", cVar.f9188c, " chips earned");
                    h0 h0Var = ((s0) rVar2.j(x2Var2)).f3474l;
                    long j3 = f1.q.f2278c;
                    r0.b(h10, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(h0Var, j3, 0L, null, null, 0L, 0L, null, 16777214), rVar2, 0, 65534);
                    u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar2, f12));
                    String format = new SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()).format(new Date(cVar.f9189d));
                    j.d(format, "format(...)");
                    r0.b(format, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var2)).f3474l, j3, 0L, null, null, 0L, 0L, null, 16777214), rVar2, 0, 65534);
                    rVar2.q(true);
                    rVar2.q(true);
                }
                break;
        }
        return o.f277a;
    }
}
