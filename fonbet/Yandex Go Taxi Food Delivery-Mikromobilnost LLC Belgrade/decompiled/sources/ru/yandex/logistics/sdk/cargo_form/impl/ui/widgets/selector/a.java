package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector;

import androidx.compose.ui.node.d;
import defpackage.a5p0;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.clb1;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g43;
import defpackage.gi0;
import defpackage.gl51;
import defpackage.gxv;
import defpackage.hlq0;
import defpackage.i43;
import defpackage.jl40;
import defpackage.jlq0;
import defpackage.jrv;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lrv;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.mb;
import defpackage.mt71;
import defpackage.n;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ogo0;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.r5a1;
import defpackage.rlq0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.teb;
import defpackage.tls;
import defpackage.to5;
import defpackage.uyo0;
import defpackage.v4v;
import defpackage.wls;
import defpackage.wzg0;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.ypu;
import defpackage.z910;
import defpackage.zgb1;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(v4v v4vVar, fid fidVar, int i) {
        v4v v4vVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1484771333);
        int i2 = (btsVar.k(v4vVar) ? 32 : 16) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ypu ypuVar = new ypu(x4c.H);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            v4vVar2 = v4vVar;
            s3b1.f(v4vVar2, ljs0.c(ypuVar.k(new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), 1.0f), null, btsVar, (i2 >> 3) & 14, 4);
        } else {
            v4vVar2 = v4vVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mb(v4vVar2, i, 19);
        }
    }

    public static final void b(jlq0 jlq0Var, f530 f530Var, boolean z, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1841238551);
        int i2 = i | (btsVar.k(jlq0Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            f530 u = r5a1.u(f530Var, jlq0Var.b, zx40Var, null, jlq0Var.c, new awk0(1), tlsVar);
            boolean z2 = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new uyo0(24, jlq0Var);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(u, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            int i3 = ((i2 << 6) & 896) | 54;
            int i4 = i2 << 3;
            d(zx40Var, jlq0Var, z, tlsVar, btsVar, i3 | (i4 & 7168) | (i4 & HProv.ALG_CLASS_ALL));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(jlq0Var, f530Var, z, tlsVar, i, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        if (defpackage.jl40.l(r13.Q(), java.lang.Integer.valueOf(r10)) == false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(rlq0 rlq0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        f530 f530Var;
        List<jlq0> list;
        List list2 = rlq0Var.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(162863474);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (i & 6) == 0 ? (btsVar.k(rlq0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (z || Q == obj) {
                Q = new SelectorKt$Selector$1$1(tlsVar, rlq0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            boolean c = btsVar.c(list2.size());
            Object Q2 = btsVar.Q();
            if (c || Q2 == obj) {
                Q2 = n.f(list2.size() != 2, btsVar);
            }
            oz40 oz40Var = (oz40) Q2;
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            f530 f530Var2 = c530.a;
            if (booleanValue) {
                btsVar.e0(1892988761);
                f530Var = pw91.l(f530Var2, pw91.o(btsVar), 14);
                btsVar.t(false);
            } else {
                btsVar.e0(1892990170);
                btsVar.t(false);
                f530Var = f530Var2;
            }
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int i4 = i3;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S) {
                list = list2;
            } else {
                list = list2;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.F, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            oeb1.c(btsVar, ljs0.q(f530Var2, 12.0f));
            btsVar.e0(-340942290);
            for (jlq0 jlq0Var : list) {
                f530 x2yVar = !((Boolean) oz40Var.getValue()).booleanValue() ? new x2y(1.0f, true) : f530Var2;
                boolean booleanValue2 = ((Boolean) oz40Var.getValue()).booleanValue();
                int i5 = i4;
                boolean k = ((i5 & 896) == 256) | btsVar.k(jlq0Var);
                Object Q3 = btsVar.Q();
                if (k || Q3 == obj) {
                    Q3 = new a5p0(12, tlsVar2, jlq0Var);
                    btsVar.o0(Q3);
                }
                bts btsVar2 = btsVar;
                b(jlq0Var, x2yVar, booleanValue2, (tls) Q3, btsVar2, 0);
                btsVar = btsVar2;
                obj = obj;
                f530Var2 = f530Var2;
                i4 = i5;
            }
            f530 f530Var3 = f530Var2;
            bts btsVar3 = btsVar;
            btsVar3.t(false);
            oeb1.c(btsVar3, ljs0.q(f530Var3, 12.0f));
            btsVar3.t(true);
            CharSequence charSequence = rlq0Var.d;
            if (charSequence == null) {
                btsVar3.e0(1589220056);
                btsVar3.t(false);
                btsVar = btsVar3;
            } else {
                btsVar3.e0(1589220057);
                btsVar = btsVar3;
                zgb1.a(charSequence, an91.l(f530Var3, 24.0f, 8.0f), 8388611, false, null, null, false, null, btsVar, 432, 248);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(rlq0Var, tlsVar, tlsVar2, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0165, code lost:
    
        if (defpackage.jl40.l(r14.Q(), java.lang.Integer.valueOf(r11)) == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(zx40 zx40Var, jlq0 jlq0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        zx40 zx40Var2;
        int i3;
        c530 c530Var;
        sls slsVar;
        wls wlsVar;
        float f;
        boolean z2;
        long k;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1302900952);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i4 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zx40Var2 = zx40Var;
            i2 |= btsVar.k(zx40Var2) ? 32 : 16;
        } else {
            zx40Var2 = zx40Var;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(jlq0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            c530 c530Var2 = c530.a;
            f530 o = an91.o(c530Var2, 0.0f, 32.0f, 0.0f, 0.0f, 13);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new hlq0(2);
                btsVar.o0(Q);
            }
            tls tlsVar2 = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new hlq0(3);
                btsVar.o0(Q2);
            }
            tls tlsVar3 = (tls) Q2;
            if (z) {
                o = o.k((f530) tlsVar2.invoke(o));
            } else if (tlsVar3 != null) {
                o = o.k((f530) tlsVar3.invoke(o));
            }
            f530 l = ymb1.l(ljs0.e(o, 147.0f), ((YandexShapes) btsVar.m(qm51.a)).b());
            a7u0 a7u0Var = gl51.a;
            f530 a = cj6Var.a(r5a1.v(m4m0.b(l, ((el51) btsVar.m(a7u0Var)).d(), qke.q), jlq0Var.b, zx40Var2, (jrv) btsVar.m(lrv.a), jlq0Var.c, null, tlsVar, 16), x4c.B);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o2);
            wls wlsVar4 = d.g;
            if (btsVar.S) {
                i3 = i2;
            } else {
                i3 = i2;
            }
            b64.z(hashCode, btsVar, hashCode, wlsVar4);
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d2);
            btsVar.t(true);
            f530 b = cj6Var.b(c530Var2);
            so5 so5Var = x4c.G;
            sic a2 = qic.a(lr20.d, so5Var, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a2);
            qje.W(btsVar, wlsVar3, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d3);
            a(jlq0Var.a, btsVar, 6);
            f530 g = ljs0.g(c530Var2, 43.0f, 0.0f, 2);
            g43 g43Var = lr20.c;
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, g);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a3);
            qje.W(btsVar, wlsVar3, o4);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d4);
            zgb1.a(jlq0Var.d, an91.m(c530Var2, 12.0f, 0.0f, 2), 8388611, false, null, null, false, null, btsVar, 1573296, 184);
            CharSequence charSequence = jlq0Var.e;
            if (charSequence == null) {
                btsVar.e0(-679057576);
                btsVar.t(false);
                c530Var = c530Var2;
            } else {
                btsVar.e0(-679057575);
                c530Var = c530Var2;
                zgb1.a(charSequence, an91.m(c530Var2, 12.0f, 0.0f, 2), 8388611, false, null, null, false, null, btsVar, 1573296, 184);
                btsVar.t(false);
            }
            btsVar.t(true);
            to5 to5Var = x4c.E;
            f530 o5 = an91.o(ljs0.c(ljs0.g(c530Var, 45.0f, 0.0f, 2), 1.0f), 12.0f, 0.0f, 6.0f, 0.0f, 10);
            lhl0 a4 = khl0.a(lr20.g, to5Var, btsVar, 54);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o6 = btsVar.o();
            f530 d5 = androidx.compose.ui.b.d(btsVar, o5);
            btsVar.i0();
            if (btsVar.S) {
                slsVar = slsVar2;
                btsVar.n(slsVar);
            } else {
                slsVar = slsVar2;
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a4);
            qje.W(btsVar, wlsVar3, o6);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode4))) {
                wlsVar = wlsVar4;
                b64.z(hashCode4, btsVar, hashCode4, wlsVar);
            } else {
                wlsVar = wlsVar4;
            }
            qje.W(btsVar, wlsVar5, d5);
            sic a5 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode5 = Long.hashCode(btsVar.T);
            r1b0 o7 = btsVar.o();
            f530 d6 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a5);
            qje.W(btsVar, wlsVar3, o7);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode5))) {
                b64.z(hashCode5, btsVar, hashCode5, wlsVar);
            }
            qje.W(btsVar, wlsVar5, d6);
            CharSequence charSequence2 = jlq0Var.f;
            if (charSequence2 == null) {
                btsVar.e0(1364999822);
                btsVar.t(false);
                f = 1.0f;
                z2 = true;
            } else {
                btsVar.e0(1364999823);
                f = 1.0f;
                z2 = true;
                zgb1.a(charSequence2, null, 0, false, null, null, false, null, btsVar, 1572864, 190);
                btsVar.t(false);
            }
            CharSequence charSequence3 = jlq0Var.g;
            if (charSequence3 == null) {
                btsVar.e0(1365207150);
                btsVar.t(false);
            } else {
                btsVar.e0(1365207151);
                zgb1.a(charSequence3, null, 0, false, null, null, false, null, btsVar, 1572864, 190);
                btsVar.t(false);
            }
            btsVar.t(z2);
            oeb1.c(btsVar, new x2y(f, z2));
            if (jlq0Var.c) {
                btsVar.e0(2054416716);
                k = ((el51) btsVar.m(a7u0Var)).p();
                btsVar.t(false);
            } else {
                btsVar.e0(2054489876);
                k = ((el51) btsVar.m(a7u0Var)).k();
                btsVar.t(false);
            }
            long j = k;
            f530 m = ljs0.m(c530Var, 32.0f);
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new teb(20);
                btsVar.o0(Q3);
            }
            clb1.a(fnq0.a(m, (tls) Q3), jlq0Var.b, jlq0Var.c, null, null, 0L, 0L, j, tlsVar, mt71.m(wzg0.ic_lock, 0, btsVar), 0, btsVar, (i3 << 12) & 234881024, 1144);
            btsVar = btsVar;
            btsVar.t(z2);
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) zx40Var, (Object) jlq0Var, z, tlsVar, i, 22);
        }
    }
}
