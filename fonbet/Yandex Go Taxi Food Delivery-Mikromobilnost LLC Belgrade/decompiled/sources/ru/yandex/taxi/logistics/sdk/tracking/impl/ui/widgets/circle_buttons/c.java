package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons;

import defpackage.a7b;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cuj0;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dl51;
import defpackage.el51;
import defpackage.evu0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g0;
import defpackage.gl51;
import defpackage.gvu0;
import defpackage.j9a;
import defpackage.jl40;
import defpackage.jtb;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ltb;
import defpackage.lvi0;
import defpackage.ly3;
import defpackage.mr1;
import defpackage.mtb;
import defpackage.n8a;
import defpackage.o430;
import defpackage.ocb1;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qtb;
import defpackage.r1b0;
import defpackage.ra90;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.teb;
import defpackage.tls;
import defpackage.uh6;
import defpackage.uo5;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.y3b1;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zpn;
import defpackage.ztb;
import defpackage.zx40;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.c;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(final f530 f530Var, final sls slsVar, final String str, final Integer num, final boolean z, final long j, String str2, final long j2, final long j3, final boolean z2, fid fidVar, final int i) {
        String str3;
        uo5 uo5Var = x4c.w;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1112688739);
        int i2 = i | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.k(num) ? 2048 : 1024) | (btsVar.a(z) ? 16384 : 8192) | (btsVar.d(j) ? 131072 : 65536) | (btsVar.k(str2) ? 1048576 : 524288) | (btsVar.d(j2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.d(j3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.a(z2) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar.V(i2 & 1, (306783379 & i2) != 306783378)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            uo5 uo5Var2 = x4c.c;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            int i3 = i2 >> 3;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar, ljs0.m(an91.o(cj6Var.a(c530Var, uo5Var2), 0.0f, 2.0f, 0.0f, 0.0f, 13), 56.0f), cyk0.c(100.0f), j, 0L, null, null, null, z2, null, null, null, wwg.S(-116025636, true, new qtb(str, z, 0, num), btsVar), btsVar, ((i2 >> 6) & 7168) | (i3 & 14) | (i3 & 234881024), 384, 3824);
            btsVar = btsVar;
            if (!z || str2 == null) {
                str3 = str2;
                if (str3 != null) {
                    btsVar.e0(1440125512);
                    String A0 = str3.length() > 5 ? gvu0.A0(5, str3) : str3;
                    y3b1.c(A0, cj6Var.a(c530Var, uo5Var), j3, evu0.k0(A0).toString().length() == 0 ? dl51.x : j2, btsVar, (i2 >> 18) & 896, 16);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1440583909);
                    btsVar.t(false);
                }
            } else {
                btsVar.e0(1439894252);
                y3b1.b(str2, an91.m(cj6Var.a(c530Var, uo5Var), 3.0f, 0.0f, 2), 0L, 0L, btsVar, (i2 >> 18) & 14);
                str3 = str2;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            str3 = str2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final String str4 = str3;
            v.d = new wls(slsVar, str, num, z, j, str4, j2, j3, z2, i) { // from class: rtb
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ sls b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Integer w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ long y;
                public final /* synthetic */ String z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(7);
                    c.a(f530.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(String str, Integer num, boolean z, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(439559297);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.k(num) ? 32 : 16) | (btsVar2.a(z) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            ra90 lvi0Var = str != null ? new lvi0(str, null, null, null, null, 62) : num != null ? new cuj0(num.intValue(), null, Boolean.TRUE, null, 26) : null;
            boolean z2 = lvi0Var instanceof lvi0;
            f530 f530Var = c530.a;
            if (z2 && !z) {
                f530Var = an91.k(f530Var, 14.0f);
            }
            f530 f530Var2 = f530Var;
            if (lvi0Var == null) {
                btsVar2.e0(-443923081);
                btsVar2.t(false);
                btsVar = btsVar2;
            } else {
                btsVar2.e0(-443923080);
                btsVar = btsVar2;
                s3b1.f(lvi0Var, f530Var2, null, btsVar, 0, 4);
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(str, num, z, i, 6);
        }
    }

    public static final void c(f530 f530Var, mtb mtbVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar;
        String str;
        sls slsVar;
        Throwable th;
        o430 o430Var;
        int i3;
        f530 f530Var2;
        f530 f530Var3;
        String str2;
        long j;
        String str3;
        a7u0 a7u0Var;
        long j2;
        String str4 = mtbVar.a;
        ltb ltbVar = mtbVar.k;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1177584797);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(mtbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            int i4 = i2 & 112;
            boolean z2 = z | (i4 == 32);
            Object Q = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (z2 || Q == o430Var2) {
                Q = new CircleButtonsKt$CircleButtonWithText$1$1(tlsVar2, mtbVar, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            boolean k = btsVar2.k(ltbVar);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var2) {
                Q2 = new n8a(19, tlsVar, mtbVar);
                btsVar2.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var2) {
                Q3 = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q3;
            if (mtbVar.i) {
                slsVar = slsVar2;
                th = null;
                str = str4;
                o430Var = o430Var2;
                i3 = 32;
                f530Var2 = q791.b(f530Var, zx40Var, null, false, null, null, slsVar, 28);
            } else {
                str = str4;
                slsVar = slsVar2;
                th = null;
                o430Var = o430Var2;
                i3 = 32;
                f530Var2 = f530Var;
            }
            boolean k2 = btsVar2.k(slsVar) | (i4 == i3);
            Object Q4 = btsVar2.Q();
            if (k2 || Q4 == o430Var) {
                Q4 = new a7b(17, mtbVar, slsVar);
                btsVar2.o0(Q4);
            }
            f530 a = fnq0.a(f530Var2, (tls) Q4);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, a);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw th;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
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
            c530 c530Var = c530.a;
            f530 q = ljs0.q(ljs0.e(c530Var, 58.0f), 68.0f);
            String str5 = mtbVar.c;
            Integer num = mtbVar.d;
            boolean z3 = ltbVar instanceof jtb;
            btsVar2.e0(2011161093);
            a7u0 a7u0Var2 = gl51.a;
            long g = ((el51) btsVar2.m(a7u0Var2)).g();
            btsVar2.t(false);
            String str6 = mtbVar.b;
            ldc ldcVar = mtbVar.g;
            if (ldcVar == null) {
                btsVar2.e0(2011165535);
                long c = ((el51) btsVar2.m(a7u0Var2)).c();
                btsVar2.t(false);
                f530Var3 = q;
                str2 = str5;
                j = c;
            } else {
                f530Var3 = q;
                btsVar2.e0(2011164016);
                btsVar2.t(false);
                str2 = str5;
                j = ldcVar.a;
            }
            ldc ldcVar2 = mtbVar.h;
            if (ldcVar2 == null) {
                btsVar2.e0(2011168097);
                j2 = ((el51) btsVar2.m(a7u0Var2)).n();
                btsVar2.t(false);
                str3 = str2;
                a7u0Var = a7u0Var2;
            } else {
                str3 = str2;
                btsVar2.e0(2011166764);
                btsVar2.t(false);
                a7u0Var = a7u0Var2;
                j2 = ldcVar2.a;
            }
            a(f530Var3, slsVar, str3, num, z3, g, str6, j, j2, mtbVar.i, btsVar2, 6);
            btsVar = btsVar2;
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            if (str != null) {
                btsVar.e0(-2078137293);
                ymb1.f(evu0.k0(str).toString(), ocb1.f(c530Var, mtbVar.j, btsVar, 6), ((el51) btsVar.m(a7u0Var)).o(), null, null, null, 0L, uh6.E(14), 0L, new sjy0(3), 0, false, 3, null, null, btsVar, 12582912, HProv.ALG_TYPE_SECURECHANNEL, 56184);
                btsVar.t(false);
            } else {
                btsVar.e0(-2077829463);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) f530Var, tlsVar, (Object) mtbVar, (Object) tlsVar2, i, 11);
        }
    }

    public static final void d(ztb ztbVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1043962007);
        int i2 = i | (btsVar.k(ztbVar) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 16.0f, 0.0f, 16.0f, 5);
            lhl0 a = khl0.a(lr20.e, x4c.D, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(2103110773);
            for (mtb mtbVar : ztbVar.c) {
                f530 m = an91.m(ljs0.q(c530Var, 76.0f), 2.0f, 0.0f, 2);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new teb(20);
                    btsVar.o0(Q);
                }
                c(fnq0.b(m, true, (tls) Q), mtbVar, tlsVar, tlsVar2, btsVar, 3456);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(ztbVar, tlsVar, tlsVar2, i, 9);
        }
    }
}
