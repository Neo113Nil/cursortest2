package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cbu;
import defpackage.cma1;
import defpackage.ctq;
import defpackage.did;
import defpackage.dmw0;
import defpackage.etm;
import defpackage.evu0;
import defpackage.f530;
import defpackage.fa01;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g8e;
import defpackage.ga01;
import defpackage.ha01;
import defpackage.ha91;
import defpackage.hi91;
import defpackage.ia01;
import defpackage.iws;
import defpackage.ja01;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.lc0;
import defpackage.lhl0;
import defpackage.lo1;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.o430;
import defpackage.ocb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q791;
import defpackage.q7d;
import defpackage.q9n;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rzh0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.teb;
import defpackage.tls;
import defpackage.tra1;
import defpackage.u531;
import defpackage.uh6;
import defpackage.unr0;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ya2;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zyd;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(cbu cbuVar, sls slsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-953322725);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(cbuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 d = q791.d(c530Var, false, null, null, slsVar, 15);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new iws(16);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(d, false, (tls) Q);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d2);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d3);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new teb(20);
                btsVar.o0(Q2);
            }
            f530 d4 = hi91.d(fnq0.b(c530Var, true, (tls) Q2), true, null, 2);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d5 = androidx.compose.ui.b.d(btsVar, d4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            b(an91.o(c530Var, 16.0f, 20.0f, 0.0f, 12.0f, 4).k(new x2y(1.0f, true)), cbuVar.c, cbuVar.d, cbuVar.f, cbuVar.h, cbuVar.g, btsVar, 0);
            ja01 ja01Var = cbuVar.e;
            if (ja01Var == null) {
                btsVar.e0(-126843135);
                btsVar.t(false);
                tlsVar2 = tlsVar;
            } else {
                btsVar.e0(-126843134);
                tlsVar2 = tlsVar;
                c(ja01Var, tlsVar2, btsVar, 48);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(cbuVar, slsVar, tlsVar2, i, 21);
        }
    }

    public static final void b(f530 f530Var, String str, String str2, boolean z, String str3, String str4, fid fidVar, int i) {
        bts btsVar;
        int i2;
        boolean z2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(159516656);
        int i3 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.a(z) ? 2048 : 1024) | (btsVar2.k(str3) ? 16384 : 8192) | (btsVar2.k(str4) ? 131072 : 65536);
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.j(null);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            if (z || jl40.l((String) oz40Var.getValue(), str3)) {
                btsVar2.e0(1927269298);
                btsVar2.t(false);
            } else {
                btsVar2.e0(1927191457);
                ((View) btsVar2.m(AndroidCompositionLocals_androidKt.f)).announceForAccessibility(str3);
                btsVar2.t(false);
            }
            oz40Var.setValue(str3);
            boolean z3 = ((i3 & 7168) == 2048) | ((458752 & i3) == 131072);
            Object Q2 = btsVar2.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new lo1(z, str4, 9);
                btsVar2.o0(Q2);
            }
            f530 a = fnq0.a(f530Var, (tls) Q2);
            sic a2 = qic.a(lr20.e, x4c.G, btsVar2, 6);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            if (str != null) {
                btsVar2.e0(-974723843);
                i2 = i3;
                z2 = false;
                ymb1.c(str, ocb1.f(c530.a, z, btsVar2, ((i3 >> 6) & 112) | 6), 0L, null, lzr.E, 0L, 0L, 0L, null, 0, false, 4, null, null, btsVar2, ((i3 >> 3) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, HProv.ALG_TYPE_SECURECHANNEL, 57324);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                i2 = i3;
                z2 = false;
                btsVar.e0(-974528760);
                btsVar.t(false);
            }
            if (str2 != null) {
                btsVar.e0(-974494598);
                bts btsVar3 = btsVar;
                ymb1.f(str2, null, 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 4, null, null, btsVar3, (i2 >> 6) & 14, HProv.ALG_TYPE_SECURECHANNEL, 57342);
                btsVar = btsVar3;
                btsVar.t(z2);
            } else {
                btsVar.e0(-974388888);
                btsVar.t(z2);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ya2(f530Var, str, str2, z, str3, str4, i);
        }
    }

    public static final void c(ja01 ja01Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1241568445);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(ja01Var) : btsVar.e(ja01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ja01Var instanceof ha01;
            c530 c530Var = c530.a;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(692973265);
                f530 d = hi91.d(an91.l(c530Var, 12.0f, 14.0f), false, null, 3);
                Object Q = btsVar.Q();
                if (Q == o430Var) {
                    Q = new iws(18);
                    btsVar.o0(Q);
                }
                f530 b = fnq0.b(d, false, (tls) Q);
                u531 u531Var = ((ha01) ja01Var).a;
                String str = u531Var.a;
                String str2 = u531Var.b;
                q7d.a.getClass();
                tlsVar2 = tlsVar;
                ha91.e(b, str, str2, tlsVar2, q7d.b, btsVar, ((i2 << 6) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT);
                btsVar.t(false);
            } else {
                if (ja01Var instanceof ia01) {
                    btsVar.e0(693458477);
                    d(an91.l(c530Var, 12.0f, 19.0f), ((ia01) ja01Var).a, 0L, btsVar, 0);
                    btsVar.t(false);
                } else if (ja01Var instanceof ga01) {
                    btsVar.e0(693718102);
                    s3b1.f(((ga01) ja01Var).a, an91.l(c530Var, 16.0f, 16.0f), null, btsVar, 0, 4);
                    btsVar = btsVar;
                    btsVar.t(false);
                } else {
                    if (!(ja01Var instanceof fa01)) {
                        throw unr0.y(853637296, btsVar, false);
                    }
                    btsVar.e0(693920904);
                    f530 d2 = hi91.d(an91.l(c530Var, 12.0f, 14.0f), false, null, 3);
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        Q2 = new iws(19);
                        btsVar.o0(Q2);
                    }
                    f530 b2 = fnq0.b(d2, false, (tls) Q2);
                    u531 u531Var2 = ((fa01) ja01Var).b;
                    tlsVar2 = tlsVar;
                    ha91.e(b2, u531Var2.a, u531Var2.b, tlsVar2, wwg.S(-1281160457, true, new ctq(9, ja01Var), btsVar), btsVar, ((i2 << 6) & 7168) | HProv.ALG_CLASS_DATA_ENCRYPT);
                    btsVar.t(false);
                }
                tlsVar2 = tlsVar;
            }
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(ja01Var, tlsVar2, i, 27);
        }
    }

    public static final void d(f530 f530Var, long j, long j2, fid fidVar, int i) {
        bts btsVar;
        long j3;
        long j4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-55217085);
        int i2 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.d(j) ? 32 : 16) | 384;
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar2.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = Long.valueOf(vng.I() - j);
                btsVar2.o0(Q);
            }
            long longValue = ((Number) Q).longValue();
            Object Q2 = btsVar2.Q();
            if (Q2 == obj) {
                Q2 = androidx.compose.runtime.f.j(Long.valueOf(longValue));
                btsVar2.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            Long valueOf = Long.valueOf(longValue);
            Object Q3 = btsVar2.Q();
            if (Q3 == obj) {
                Q3 = new HeaderKt$StopWatch$1$1(oz40Var, longValue, 1000L, null);
                j4 = 1000;
                btsVar2.o0(Q3);
            } else {
                j4 = 1000;
            }
            zpn.f(valueOf, 1000L, (wls) Q3, btsVar2);
            String N = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf((((Number) oz40Var.getValue()).longValue() / 1000) / 60));
            String N2 = evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf((((Number) oz40Var.getValue()).longValue() / 1000) % 60));
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
            c530 c530Var = c530.a;
            f530 b = tra1.b(c530Var, 0.0f);
            lzr lzrVar = lzr.E;
            ymb1.e("00:00", b, 0L, null, lzrVar, null, 0L, uh6.E(21), 0L, null, 0, false, 0, null, null, btsVar2, 12607542, 0, 65388);
            Object e = ohb1.e(btsVar2, rzh0.accessibility_minutes);
            Object e2 = ohb1.e(btsVar2, rzh0.accessibility_seconds);
            boolean k = btsVar2.k(N) | btsVar2.k(e) | btsVar2.k(N2) | btsVar2.k(e2);
            Object Q4 = btsVar2.Q();
            if (k || Q4 == obj) {
                Q4 = new lc0(N, e, N2, e2, 20);
                btsVar2.o0(Q4);
            }
            ymb1.e(g8e.p(N, ":", N2), fnq0.b(c530Var, false, (tls) Q4), 0L, null, lzrVar, null, 0L, uh6.E(21), 0L, null, 0, false, 0, null, null, btsVar2, 12607488, 0, 65388);
            btsVar = btsVar2;
            btsVar.t(true);
            j3 = j4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            j3 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q9n(i, 1, j, j3, f530Var);
        }
    }
}
