package ud;

import ac.o;
import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.foundation.layout.FillElement;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import e2.v;
import f1.d0;
import f1.q;
import h2.h0;
import h2.u;
import j0.g0;
import j0.r0;
import j0.s0;
import j0.t0;
import java.util.List;
import m0.l;
import m0.r;
import m0.r1;
import m0.s;
import m0.x1;
import m0.x2;
import m0.z0;
import org.fortheloss.st.R;
import pc.j;
import pc.t;
import rd.p;
import s.a0;
import u.l0;
import v1.e0;
import w.b1;
import w.k0;
import x1.z;
import y0.k;
import y0.n;
import z.i0;
import z.j0;
import z.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class g {
    public static final void a(oc.a aVar, r rVar, int i10) {
        r rVar2;
        j.e(aVar, "onClick");
        rVar.Z(1311984150);
        int i11 = (rVar.h(aVar) ? 4 : 2) | i10;
        if ((i11 & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            n h10 = androidx.compose.foundation.layout.b.h(k.f8442a, 48);
            rVar.X(413237866);
            Object M = rVar.M();
            z0 z0Var = l.f4646a;
            if (M == z0Var) {
                M = new y.i();
                rVar.i0(M);
            }
            y.i iVar = (y.i) M;
            rVar.q(false);
            rVar.X(413240716);
            boolean z10 = (i11 & 14) == 4;
            Object M2 = rVar.M();
            if (z10 || M2 == z0Var) {
                M2 = new rd.h(aVar, 2);
                rVar.i0(M2);
            }
            rVar.q(false);
            n c3 = androidx.compose.foundation.a.c(h10, iVar, null, false, null, (oc.a) M2, 28);
            e0 e10 = m.e(y0.c.f8419g, false);
            int hashCode = Long.hashCode(rVar.T);
            r1 l10 = rVar.l();
            n o7 = uc.e.o(rVar, c3);
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(zVar);
            } else {
                rVar.l0();
            }
            m0.z.w(e10, rVar, x1.i.f8079e);
            m0.z.w(l10, rVar, x1.i.f8078d);
            x1.h hVar = x1.i.f8080f;
            if (rVar.S || !j.a(rVar.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar, hashCode, hVar);
            }
            m0.z.w(o7, rVar, x1.i.f8077c);
            rVar2 = rVar;
            l0.a(i7.b.B(R.drawable.btn_back, rVar), "Back", androidx.compose.foundation.layout.b.f542b, null, v1.j.f7083b, 0.0f, rVar2, 25008, 104);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new d(i10, 2, aVar);
        }
    }

    public static final void b(String str, String str2, r rVar, int i10) {
        r rVar2;
        rVar.Z(1558173599);
        if ((i10 & 19) == 18 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), d0.e.a(16), g0.d(q.b(ee.a.f2157d, 0.1f), rVar, 6), g0.e(62, 4), u0.e.e(-1904872851, new e(str, str2, 0), rVar), rVar2, 196614, 16);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new s(i10, 4, str, str2);
        }
    }

    public static final void c(oc.a aVar, r rVar, int i10) {
        r rVar2;
        rVar.Z(-1371143688);
        if ((((rVar.h(aVar) ? 4 : 2) | i10) & 3) == 2 && rVar.B()) {
            rVar.S();
            rVar2 = rVar;
        } else {
            float f10 = 24;
            rVar2 = rVar;
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), d0.e.b(f10, f10), g0.d(ee.a.f2162i, rVar, 6), g0.e(62, 8), u0.e.e(-305810490, new f(0, aVar), rVar), rVar2, 196614, 16);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new d(i10, 1, aVar);
        }
    }

    public static final void d(oc.a aVar, r rVar, int i10) {
        r rVar2 = rVar;
        rVar2.Z(430298811);
        int i11 = (rVar2.h(aVar) ? 4 : 2) | i10;
        if ((i11 & 3) == 2 && rVar2.B()) {
            rVar2.S();
        } else {
            k1.b B = i7.b.B(R.drawable.app_background, rVar2);
            FillElement fillElement = androidx.compose.foundation.layout.b.f542b;
            n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(fillElement, B, v1.j.f7082a, 0.0f, null, 54), q.b(d0.c(4278911008L), 0.55f), d0.f2219a);
            z.b bVar = z.i.f8960b;
            y0.d dVar = y0.c.f8430r;
            z.r a8 = z.q.a(bVar, dVar, rVar2, 0);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            n o7 = uc.e.o(rVar2, a6);
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            x1.h hVar = x1.i.f8079e;
            m0.z.w(a8, rVar2, hVar);
            x1.h hVar2 = x1.i.f8078d;
            m0.z.w(l10, rVar2, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            m0.z.w(o7, rVar2, hVar4);
            c(aVar, rVar2, i11 & 14);
            Object[] objArr = new Object[0];
            v0.j jVar = b1.f7381i;
            boolean d10 = rVar2.d(0);
            Object M = rVar2.M();
            if (d10 || M == l.f4646a) {
                M = new k0(0, 2);
                rVar2.i0(M);
            }
            rVar2 = rVar;
            n k3 = uc.e.k(fillElement, new androidx.compose.foundation.d((b1) v0.k.b(objArr, jVar, null, (oc.a) M, rVar, 0, 4)));
            float f10 = 16;
            n f11 = androidx.compose.foundation.layout.b.f(k3, f10);
            z.r a10 = z.q.a(bVar, dVar, rVar2, 0);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            n o10 = uc.e.o(rVar2, f11);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            m0.z.w(a10, rVar2, hVar);
            m0.z.w(l11, rVar2, hVar2);
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            m0.z.w(o10, rVar2, hVar4);
            b("🎯 Objective", "Score as many points as possible by tapping on target cards (7 and Joker) while avoiding all other cards!", rVar2, 54);
            k kVar = k.f8442a;
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, f10));
            b("❤️ Lives", "You start with 3 lives. Lose a life by:\n• Tapping on a non-target card\n• Missing a target card (7 or Joker)", rVar2, 54);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, f10));
            n b2 = androidx.compose.foundation.layout.b.b(1.0f);
            d0.d a11 = d0.e.a(f10);
            long j3 = ee.a.f2157d;
            float f12 = 4;
            g0.b(b2, a11, g0.d(q.b(j3, 0.1f), rVar2, 6), g0.e(62, f12), b.f6746a, rVar2, 196614, 16);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, f10));
            b("⚡ Power-Ups", "Buy power-ups in the Shop with your chips:\n\n⏱️ Time Slow - Slows down cards for 5 seconds\n\n🛡️ Error Shield - Protects from one mistake\n\n🧲 Joker Magnet - Increases Joker spawn rate for 10 seconds", rVar2, 54);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, f10));
            b("📈 Difficulty", "The game gets harder as you score more points:\n• Cards appear faster\n• Cards stay on screen for less time\n• Multiple cards may appear at once", rVar2, 54);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, f10));
            g0.b(androidx.compose.foundation.layout.b.b(1.0f), d0.e.a(f10), g0.d(q.b(j3, 0.1f), rVar2, 6), g0.e(62, f12), b.f6747b, rVar2, 196614, 16);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, 32));
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new d(i10, 0, aVar);
        }
    }

    public static final void e(String str, String str2, String str3, long j3, r rVar, int i10) {
        r rVar2 = rVar;
        rVar2.Z(1297637061);
        if ((i10 & 1171) == 1170 && rVar2.B()) {
            rVar2.S();
        } else {
            n b2 = androidx.compose.foundation.layout.b.b(1.0f);
            i0 a6 = z.g0.a(z.i.f8959a, y0.c.f8429q, rVar2, 48);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            n o7 = uc.e.o(rVar2, b2);
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            x1.h hVar = x1.i.f8079e;
            m0.z.w(a6, rVar2, hVar);
            x1.h hVar2 = x1.i.f8078d;
            m0.z.w(l10, rVar2, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            m0.z.w(o7, rVar2, hVar4);
            x2 x2Var = t0.f3483a;
            r0.b(str, androidx.compose.foundation.layout.b.j(48), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((s0) rVar2.j(x2Var)).f3468f, rVar2, 54, 65532);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.j(8));
            n a8 = j0.a();
            z.r a10 = z.q.a(z.i.f8960b, y0.c.f8430r, rVar2, 0);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            n o10 = uc.e.o(rVar2, a8);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            m0.z.w(a10, rVar2, hVar);
            m0.z.w(l11, rVar2, hVar2);
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            m0.z.w(o10, rVar2, hVar4);
            r0.b(str2, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var)).f3473k, q.f2279d, 0L, null, null, 0L, 0L, null, 16777214), rVar2, 6, 65534);
            r0.b(str3, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar2.j(x2Var)).f3474l, j3, 0L, k2.l.f3614k, null, 0L, 0L, null, 16777210), rVar2, 6, 65534);
            rVar2 = rVar2;
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new sd.e(str, str2, str3, j3, i10);
        }
    }

    public static final void f(int i10, r rVar) {
        r rVar2 = rVar;
        rVar2.Z(-1135809085);
        if (i10 == 0 && rVar2.B()) {
            rVar2.S();
        } else {
            rVar2.X(-2113358137);
            Object M = rVar2.M();
            z0 z0Var = l.f4646a;
            if (M == z0Var) {
                M = v.d.a(1.0f);
                rVar2.i0(M);
            }
            v.c cVar = (v.c) M;
            rVar2.q(false);
            rVar2.X(-2113356633);
            Object M2 = rVar2.M();
            if (M2 == z0Var) {
                M2 = v.d.a(0.0f);
                rVar2.i0(M2);
            }
            v.c cVar2 = (v.c) M2;
            rVar2.q(false);
            rVar2.X(-2113354408);
            boolean h10 = rVar2.h(cVar) | rVar2.h(cVar2);
            Object M3 = rVar2.M();
            if (h10 || M3 == z0Var) {
                M3 = new ae.d(cVar, cVar2, null);
                rVar2.i0(M3);
            }
            rVar2.q(false);
            m0.z.f(o.f277a, rVar2, (oc.e) M3);
            n a6 = androidx.compose.foundation.a.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.f542b, i7.b.B(R.drawable.background, rVar2), v1.j.f7082a, 0.0f, null, 54), q.b(d0.c(4278911008L), 0.55f), d0.f2219a);
            e0 e10 = m.e(y0.c.f8423k, false);
            int hashCode = Long.hashCode(rVar2.T);
            r1 l10 = rVar2.l();
            n o7 = uc.e.o(rVar2, a6);
            x1.j.f8084f.getClass();
            z zVar = x1.i.f8076b;
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            x1.h hVar = x1.i.f8079e;
            m0.z.w(e10, rVar2, hVar);
            x1.h hVar2 = x1.i.f8078d;
            m0.z.w(l10, rVar2, hVar2);
            x1.h hVar3 = x1.i.f8080f;
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode))) {
                a4.d.p(hashCode, rVar2, hashCode, hVar3);
            }
            x1.h hVar4 = x1.i.f8077c;
            m0.z.w(o7, rVar2, hVar4);
            z.r a8 = z.q.a(z.i.f8961c, y0.c.f8431s, rVar2, 54);
            int hashCode2 = Long.hashCode(rVar2.T);
            r1 l11 = rVar2.l();
            k kVar = k.f8442a;
            n o10 = uc.e.o(rVar2, kVar);
            rVar2.b0();
            if (rVar2.S) {
                rVar2.k(zVar);
            } else {
                rVar2.l0();
            }
            m0.z.w(a8, rVar2, hVar);
            m0.z.w(l11, rVar2, hVar2);
            if (rVar2.S || !j.a(rVar2.M(), Integer.valueOf(hashCode2))) {
                a4.d.p(hashCode2, rVar2, hashCode2, hVar3);
            }
            m0.z.w(o10, rVar2, hVar4);
            k1.b B = i7.b.B(R.drawable.logo, rVar2);
            n h11 = androidx.compose.foundation.layout.b.h(kVar, 260);
            rVar2.X(-998587826);
            boolean h12 = rVar2.h(cVar) | rVar2.h(cVar2);
            Object M4 = rVar2.M();
            if (h12 || M4 == z0Var) {
                M4 = new p(cVar, cVar2, 2);
                rVar2.i0(M4);
            }
            rVar2.q(false);
            l0.a(B, "logo image", androidx.compose.ui.graphics.a.a(h11, (oc.c) M4), null, v1.j.f7083b, 0.0f, rVar2, 24624, 104);
            u2.b.g(rVar2, androidx.compose.foundation.layout.b.c(kVar, 56));
            n B2 = x4.f.B(androidx.compose.foundation.layout.b.c(androidx.compose.foundation.layout.b.b(0.5f), 8), d0.e.a(6));
            long c3 = d0.c(4294916923L);
            long j3 = q.f2279d;
            j0.e0.a(B2, c3, q.b(j3, 0.3f), 0, 0.0f, rVar, 432);
            u2.b.g(rVar, androidx.compose.foundation.layout.b.c(kVar, 16));
            r0.b("Loading...", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, h0.a(((s0) rVar.j(t0.f3483a)).f3472j, j3, 0L, null, null, 0L, 0L, null, 16777214), rVar, 6, 65534);
            rVar2 = rVar;
            rVar2.q(true);
            rVar2.q(true);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new u(i10, 29);
        }
    }

    public static final void g(long j3, x.e0 e0Var) {
        if (e0Var == x.e0.f7769g) {
            if (s2.a.g(j3) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (s2.a.h(j3) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final x4.j h(x4.p pVar) {
        j.e(pVar, "<this>");
        return new x4.j(pVar.f8322a, pVar.f8341t);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0349 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(ViewStructure viewStructure, x1.g0 g0Var, AutofillId autofillId, String str, f2.a aVar) {
        int i10;
        long j3;
        long j6;
        long j10;
        char c3;
        g2.a aVar2;
        e2.g gVar;
        h2.e eVar;
        z0.c cVar;
        boolean z10;
        z0.m mVar;
        Boolean bool;
        boolean z11;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        boolean z12;
        String x10;
        String[] l10;
        String[] l11;
        s.g0 g0Var2;
        long[] jArr;
        Object[] objArr;
        Integer num3;
        long[] jArr2;
        Object[] objArr2;
        s.g0 g0Var3;
        g2.a aVar3;
        e2.g gVar2;
        h2.e eVar2;
        int i11;
        Integer num4 = 1;
        v vVar = e2.s.f2025a;
        v vVar2 = e2.i.f1959a;
        e2.j u10 = g0Var.u();
        int i12 = 2;
        int i13 = 8;
        if (u10 == null || (g0Var3 = u10.f1985g) == null) {
            i10 = 2;
            j3 = 128;
            j6 = 255;
            j10 = -9187201950435737472L;
            c3 = 7;
            aVar2 = null;
            gVar = null;
            eVar = null;
            cVar = null;
            z10 = false;
            mVar = null;
            bool = null;
            z11 = false;
            num = null;
        } else {
            j3 = 128;
            Object[] objArr3 = g0Var3.f6267b;
            Object[] objArr4 = g0Var3.f6268c;
            long[] jArr3 = g0Var3.f6266a;
            j6 = 255;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                cVar = null;
                z10 = false;
                aVar3 = null;
                mVar = null;
                bool = null;
                gVar2 = null;
                z11 = false;
                num = null;
                eVar2 = null;
                j10 = -9187201950435737472L;
                while (true) {
                    long j11 = jArr3[i14];
                    i10 = i12;
                    c3 = 7;
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j11 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                Object obj = objArr3[i17];
                                Object obj2 = objArr4[i17];
                                v vVar3 = (v) obj;
                                i11 = i13;
                                if (j.a(vVar3, e2.s.f2042r)) {
                                    j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentDataType");
                                    cVar = (z0.c) obj2;
                                } else if (j.a(vVar3, e2.s.f2025a)) {
                                    j.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                    CharSequence charSequence = (String) bc.m.U((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (j.a(vVar3, e2.s.f2041q)) {
                                    j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.autofill.ContentType");
                                    mVar = (z0.m) obj2;
                                } else if (j.a(vVar3, e2.s.C)) {
                                    j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString");
                                    eVar2 = (h2.e) obj2;
                                } else if (j.a(vVar3, e2.s.f2035k)) {
                                    j.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (j.a(vVar3, e2.s.K)) {
                                    j.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                                    num = (Integer) obj2;
                                } else if (j.a(vVar3, e2.s.G)) {
                                    z11 = true;
                                } else if (j.a(vVar3, e2.s.f2046v)) {
                                    j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.Role");
                                    gVar2 = (e2.g) obj2;
                                } else if (j.a(vVar3, e2.s.E)) {
                                    j.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                    bool = (Boolean) obj2;
                                } else if (j.a(vVar3, e2.s.F)) {
                                    j.c(obj2, "null cannot be cast to non-null type androidx.compose.ui.state.ToggleableState");
                                    aVar3 = (g2.a) obj2;
                                } else if (j.a(vVar3, e2.i.f1960b)) {
                                    viewStructure.setClickable(true);
                                } else if (j.a(vVar3, e2.i.f1961c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (j.a(vVar3, e2.i.f1979u)) {
                                    viewStructure.setFocusable(true);
                                } else if (j.a(vVar3, e2.i.f1968j)) {
                                    z10 = true;
                                }
                            } else {
                                i11 = i13;
                            }
                            j11 >>= i11;
                            i16++;
                            i13 = i11;
                        }
                        if (i15 != i13) {
                            break;
                        }
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    i12 = i10;
                    i13 = 8;
                }
            } else {
                i10 = 2;
                j10 = -9187201950435737472L;
                c3 = 7;
                cVar = null;
                z10 = false;
                aVar3 = null;
                mVar = null;
                bool = null;
                gVar2 = null;
                z11 = false;
                num = null;
                eVar2 = null;
            }
            aVar2 = aVar3;
            gVar = gVar2;
            eVar = eVar2;
        }
        e2.j u11 = g0Var.u();
        if (u11 != null && u11.f1987i && !u11.f1988j) {
            u11 = u11.a();
            a0 a0Var = new a0(((o0.b) g0Var.m()).f5128g.f5136i);
            a0Var.b(g0Var.m());
            while (a0Var.h()) {
                x1.g0 g0Var4 = (x1.g0) a0Var.j(a0Var.f6220b - 1);
                e2.j u12 = g0Var4.u();
                if (u12 != null && !u12.f1987i) {
                    u11.c(u12);
                    if (!u12.f1988j) {
                        a0Var.b(g0Var4.m());
                    }
                }
            }
        }
        if (u11 != null && (g0Var2 = u11.f1985g) != null) {
            Object[] objArr5 = g0Var2.f6267b;
            Object[] objArr6 = g0Var2.f6268c;
            long[] jArr4 = g0Var2.f6266a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i18 = 0;
                list = null;
                while (true) {
                    long j12 = jArr4[i18];
                    if ((((~j12) << c3) & j12 & j10) != j10) {
                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j12 & j6) < j3) {
                                int i21 = (i18 << 3) + i20;
                                Object obj3 = objArr5[i21];
                                num3 = num4;
                                Object obj4 = objArr6[i21];
                                jArr2 = jArr4;
                                v vVar4 = (v) obj3;
                                objArr2 = objArr5;
                                if (j.a(vVar4, e2.s.f2033i)) {
                                    viewStructure.setEnabled(false);
                                } else if (j.a(vVar4, e2.s.f2049y)) {
                                    j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString>");
                                    list = (List) obj4;
                                }
                            } else {
                                num3 = num4;
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j12 >>= 8;
                            i20++;
                            jArr4 = jArr2;
                            objArr5 = objArr2;
                            num4 = num3;
                        }
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                        if (i19 != 8) {
                            break;
                        }
                    } else {
                        num2 = num4;
                        jArr = jArr4;
                        objArr = objArr5;
                    }
                    if (i18 == length2) {
                        break;
                    }
                    i18++;
                    jArr4 = jArr;
                    objArr5 = objArr;
                    num4 = num2;
                }
                Integer valueOf2 = Integer.valueOf(g0Var.f8042h);
                if (g0Var.s() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (cVar == null && !z10) ? aVar2 == null ? Integer.valueOf(i10) : null : num2;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (mVar != null && (l11 = uc.e.l(mVar)) != null) {
                    viewStructure.setAutofillHints(l11);
                }
                aVar.f2293a.f(g0Var.f8042h, new i4.b(i10, viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (aVar2 != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(aVar2 == g2.a.f2504g);
                } else if (bool != null && (gVar == null || gVar.f1956a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                z0.m.f9064a.getClass();
                z12 = !z11 || (mVar == null && (l10 = uc.e.l(mVar)) != null && bc.l.Z(l10, (String) bc.l.X(uc.e.l(z0.l.f9063b))) >= 0);
                if (z12) {
                    viewStructure.setDataIsSensitive(true);
                }
                viewStructure.setVisibility(g0Var.I.f7989d.J0() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String str2 = "";
                    for (int i22 = 0; i22 < size; i22++) {
                        str2 = str2 + ((h2.e) list.get(i22)).f2648h + '\n';
                    }
                    viewStructure.setText(str2);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((o0.b) g0Var.m()).isEmpty() && gVar != null && (x10 = y1.e0.x(gVar.f1956a)) != null) {
                    viewStructure.setClassName(x10);
                }
                if (z10) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        viewStructure.setMaxTextLength(num.intValue());
                    }
                    if (eVar != null) {
                        viewStructure.setAutofillValue(AutofillValue.forText(eVar.f2648h));
                    }
                    if (z12) {
                        viewStructure.setInputType(129);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        num2 = num4;
        list = null;
        Integer valueOf22 = Integer.valueOf(g0Var.f8042h);
        if (g0Var.s() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (cVar == null) {
            if (valueOf != null) {
            }
            if (mVar != null) {
                viewStructure.setAutofillHints(l11);
            }
            aVar.f2293a.f(g0Var.f8042h, new i4.b(i10, viewStructure));
            if (bool != null) {
            }
            if (aVar2 != null) {
            }
            z0.m.f9064a.getClass();
            if (z11) {
            }
            if (z12) {
            }
            viewStructure.setVisibility(g0Var.I.f7989d.J0() ? 4 : 0);
            if (list != null) {
            }
            if (((o0.b) g0Var.m()).isEmpty()) {
                viewStructure.setClassName(x10);
            }
            if (z10) {
            }
        }
        if (valueOf != null) {
        }
        if (mVar != null) {
        }
        aVar.f2293a.f(g0Var.f8042h, new i4.b(i10, viewStructure));
        if (bool != null) {
        }
        if (aVar2 != null) {
        }
        z0.m.f9064a.getClass();
        if (z11) {
        }
        if (z12) {
        }
        viewStructure.setVisibility(g0Var.I.f7989d.J0() ? 4 : 0);
        if (list != null) {
        }
        if (((o0.b) g0Var.m()).isEmpty()) {
        }
        if (z10) {
        }
    }

    public static final androidx.lifecycle.t0 j(Class cls, y0 y0Var, ub.f fVar, x3.b bVar, r rVar) {
        x0 e10;
        pc.e a6 = t.a(cls);
        if (fVar != null) {
            x0 g8 = y0Var.g();
            j.e(g8, "store");
            j.e(bVar, "extras");
            e10 = new x0(g8, fVar, bVar);
        } else if (y0Var instanceof androidx.lifecycle.k) {
            x0 g10 = y0Var.g();
            v0 d10 = ((androidx.lifecycle.k) y0Var).d();
            j.e(g10, "store");
            j.e(d10, "factory");
            j.e(bVar, "extras");
            e10 = new x0(g10, d10, bVar);
        } else {
            e10 = u7.d.e(y0Var, null, 6);
        }
        return e10.b(a6);
    }
}
