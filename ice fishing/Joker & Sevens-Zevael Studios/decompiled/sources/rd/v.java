package rd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import h2.h0;
import j0.r0;
import j0.s0;
import j0.t0;
import java.util.ArrayList;
import m0.r1;
import m0.x2;
import org.fortheloss.st.R;
import u.l0;
import z.g0;
import z.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6199g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6200h;

    public /* synthetic */ v(int i10, int i11) {
        this.f6199g = i11;
        this.f6200h = i10;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10 = this.f6199g;
        ac.o oVar = ac.o.f277a;
        int i11 = this.f6200h;
        y0.k kVar = y0.k.f8442a;
        switch (i10) {
            case 0:
                m0.r rVar = (m0.r) obj2;
                int intValue = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue & 17) != 16 || !rVar.B()) {
                    float f10 = 8;
                    y0.n g8 = androidx.compose.foundation.layout.b.g(kVar, 16, f10);
                    i0 a6 = g0.a(z.i.f8959a, y0.c.f8429q, rVar, 48);
                    int o7 = m0.z.o(rVar);
                    r1 l10 = rVar.l();
                    y0.n o10 = uc.e.o(rVar, g8);
                    x1.j.f8084f.getClass();
                    x1.z zVar = x1.i.f8076b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(zVar);
                    } else {
                        rVar.l0();
                    }
                    m0.z.w(a6, rVar, x1.i.f8079e);
                    m0.z.w(l10, rVar, x1.i.f8078d);
                    x1.h hVar = x1.i.f8080f;
                    if (rVar.S || !pc.j.a(rVar.M(), Integer.valueOf(o7))) {
                        a4.d.p(o7, rVar, o7, hVar);
                    }
                    m0.z.w(o10, rVar, x1.i.f8077c);
                    l0.a(i7.b.B(R.drawable.chips, rVar), "image chips", androidx.compose.foundation.layout.b.h(kVar, 40), null, v1.j.f7083b, 0.0f, rVar, 25008, 104);
                    u2.b.g(rVar, androidx.compose.foundation.layout.b.j(f10));
                    r0.b("+" + i11, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(t0.f3483a)).f3472j, ee.a.f2156c, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar, 0, 65534);
                    rVar.q(true);
                    break;
                } else {
                    rVar.S();
                    break;
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m0.r rVar2 = (m0.r) obj2;
                int intValue2 = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue2 & 17) != 16 || !rVar2.B()) {
                    y0.n g10 = androidx.compose.foundation.layout.b.g(kVar, 16, 8);
                    i0 a8 = g0.a(z.i.f8959a, y0.c.f8429q, rVar2, 48);
                    int o11 = m0.z.o(rVar2);
                    r1 l11 = rVar2.l();
                    y0.n o12 = uc.e.o(rVar2, g10);
                    x1.j.f8084f.getClass();
                    x1.z zVar2 = x1.i.f8076b;
                    rVar2.b0();
                    if (rVar2.S) {
                        rVar2.k(zVar2);
                    } else {
                        rVar2.l0();
                    }
                    m0.z.w(a8, rVar2, x1.i.f8079e);
                    m0.z.w(l11, rVar2, x1.i.f8078d);
                    x1.h hVar2 = x1.i.f8080f;
                    if (rVar2.S || !pc.j.a(rVar2.M(), Integer.valueOf(o11))) {
                        a4.d.p(o11, rVar2, o11, hVar2);
                    }
                    m0.z.w(o12, rVar2, x1.i.f8077c);
                    rVar2.X(-1520621028);
                    for (int i12 = 0; i12 < i11; i12++) {
                        l1.f fVar = v6.a.f7302c;
                        if (fVar == null) {
                            l1.e eVar = new l1.e("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i13 = l1.h0.f4034a;
                            f1.i0 i0Var = new f1.i0(f1.q.f2277b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new l1.n(12.0f, 21.35f));
                            arrayList.add(new l1.u(-1.45f, -1.32f));
                            arrayList.add(new l1.k(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f));
                            arrayList.add(new l1.k(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f));
                            arrayList.add(new l1.s(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f));
                            arrayList.add(new l1.k(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f));
                            arrayList.add(new l1.k(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f));
                            arrayList.add(new l1.s(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f));
                            arrayList.add(new l1.m(12.0f, 21.35f));
                            arrayList.add(l1.j.f4042c);
                            l1.e.a(eVar, arrayList, i0Var);
                            fVar = eVar.b();
                            v6.a.f7302c = fVar;
                        }
                        j0.u.b(fVar, "Life", androidx.compose.foundation.layout.b.h(kVar, 24), ee.a.f2154a, rVar2, 432, 0);
                        rVar2.X(-1520612796);
                        if (i12 < i11 - 1) {
                            u2.b.g(rVar2, androidx.compose.foundation.layout.b.j(4));
                        }
                        rVar2.q(false);
                    }
                    rVar2.q(false);
                    rVar2.q(true);
                    break;
                } else {
                    rVar2.S();
                    break;
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                m0.r rVar3 = (m0.r) obj2;
                int intValue3 = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue3 & 17) != 16 || !rVar3.B()) {
                    float f11 = 8;
                    y0.n g11 = androidx.compose.foundation.layout.b.g(kVar, 16, f11);
                    i0 a10 = g0.a(z.i.f8959a, y0.c.f8429q, rVar3, 48);
                    int o13 = m0.z.o(rVar3);
                    r1 l12 = rVar3.l();
                    y0.n o14 = uc.e.o(rVar3, g11);
                    x1.j.f8084f.getClass();
                    x1.z zVar3 = x1.i.f8076b;
                    rVar3.b0();
                    if (rVar3.S) {
                        rVar3.k(zVar3);
                    } else {
                        rVar3.l0();
                    }
                    m0.z.w(a10, rVar3, x1.i.f8079e);
                    m0.z.w(l12, rVar3, x1.i.f8078d);
                    x1.h hVar3 = x1.i.f8080f;
                    if (rVar3.S || !pc.j.a(rVar3.M(), Integer.valueOf(o13))) {
                        a4.d.p(o13, rVar3, o13, hVar3);
                    }
                    m0.z.w(o14, rVar3, x1.i.f8077c);
                    x2 x2Var = t0.f3483a;
                    r0.b("Score:", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar3.j(x2Var)).f3473k, f1.q.f2278c, 0L, null, null, 0L, 0L, null, 16777214), rVar3, 6, 65534);
                    u2.b.g(rVar3, androidx.compose.foundation.layout.b.j(f11));
                    r0.b(String.valueOf(i11), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar3.j(x2Var)).f3468f, ee.a.f2156c, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar3, 0, 65534);
                    rVar3.q(true);
                    break;
                } else {
                    rVar3.S();
                    break;
                }
                break;
            default:
                m0.r rVar4 = (m0.r) obj2;
                int intValue4 = ((Number) obj3).intValue();
                pc.j.e((z.s) obj, "$this$Card");
                if ((intValue4 & 17) != 16 || !rVar4.B()) {
                    float f12 = 8;
                    y0.n g12 = androidx.compose.foundation.layout.b.g(kVar, 16, f12);
                    i0 a11 = g0.a(z.i.f8959a, y0.c.f8429q, rVar4, 48);
                    int o15 = m0.z.o(rVar4);
                    r1 l13 = rVar4.l();
                    y0.n o16 = uc.e.o(rVar4, g12);
                    x1.j.f8084f.getClass();
                    x1.z zVar4 = x1.i.f8076b;
                    rVar4.b0();
                    if (rVar4.S) {
                        rVar4.k(zVar4);
                    } else {
                        rVar4.l0();
                    }
                    m0.z.w(a11, rVar4, x1.i.f8079e);
                    m0.z.w(l13, rVar4, x1.i.f8078d);
                    x1.h hVar4 = x1.i.f8080f;
                    if (rVar4.S || !pc.j.a(rVar4.M(), Integer.valueOf(o15))) {
                        a4.d.p(o15, rVar4, o15, hVar4);
                    }
                    m0.z.w(o16, rVar4, x1.i.f8077c);
                    l0.a(i7.b.B(R.drawable.chips, rVar4), "image chips", androidx.compose.foundation.layout.b.h(kVar, 40), null, v1.j.f7083b, 0.0f, rVar4, 25008, 104);
                    u2.b.g(rVar4, androidx.compose.foundation.layout.b.j(f12));
                    r0.b(String.valueOf(i11), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar4.j(t0.f3483a)).f3470h, ee.a.f2156c, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar4, 0, 65534);
                    rVar4.q(true);
                    break;
                } else {
                    rVar4.S();
                    break;
                }
                break;
        }
        return oVar;
    }
}
