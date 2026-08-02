package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes11.dex */
public abstract class sob1 {
    public static final void a(km30 km30Var, sls slsVar, int i, fid fidVar, int i2) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1767862925);
        int i3 = (btsVar.e(km30Var) ? 4 : 2) | i2 | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.c(i) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            int i4 = t9u.c;
            sy2.a(btsVar);
            int i5 = s9u.a[srt.a(btsVar).ordinal()];
            if (i5 == 1) {
                j = t9u.a;
            } else {
                if (i5 != 2) {
                    w511.b();
                    return;
                }
                j = t9u.b;
            }
            long j2 = j;
            pi6.a(ljs0.e(m4m0.a(c2, zoy0.G(scc.g(new ldc(ldc.b(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.b(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.l)), 0.0f, 0.0f, 14), null, 6), 123.0f), btsVar, 0);
            ydb1.a(an91.o(an91.o(an91.m(c530Var, 0.0f, 0.0f, 3), 0.0f, ((fwi) btsVar.m(j.h)).H(i), 0.0f, 0.0f, 13), 12.0f, 0.0f, 64.0f, 0.0f, 10), wwg.S(1395235441, true, new wg30(3, km30Var), btsVar), wwg.S(2130524374, true, new nfj(24, km30Var, slsVar), btsVar), null, null, null, null, false, btsVar, 432, 248);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(km30Var, slsVar, i, i2);
        }
    }

    public static final void b(w611 w611Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1679576259);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(w611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            c530 c530Var = c530.a;
            pi6.a(ljs0.n(c530Var, 56.0f, 36.0f), btsVar, 6);
            int i5 = i2 & 896;
            boolean e = btsVar.e(context) | (i5 == 256) | btsVar.e(w611Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new zjy0(i3, context, tlsVar, w611Var);
                btsVar.o0(Q);
            }
            f530 a2 = fnq0.a(c530Var, (tls) Q);
            ButtonSize buttonSize = ButtonSize.XS;
            boolean e2 = btsVar.e(w611Var) | (i5 == 256);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new yyy0(tlsVar, w611Var, i4);
                btsVar.o0(Q2);
            }
            ulb1.a(a2, false, buttonSize, (sls) Q2, wwg.S(-2010054718, true, new jvx0(5, w611Var), btsVar), btsVar, 24960, 2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) w611Var, f530Var, (Object) tlsVar, i, 28);
        }
    }
}
