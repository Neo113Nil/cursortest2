package ru.yandex.taxi.logistics.sdk.courier_comment_view;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b0;
import defpackage.b64;
import defpackage.bhh;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cms;
import defpackage.d3i;
import defpackage.did;
import defpackage.eja1;
import defpackage.f3i;
import defpackage.f530;
import defpackage.f89;
import defpackage.fid;
import defpackage.gi91;
import defpackage.gxv;
import defpackage.hoy0;
import defpackage.i43;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.le;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.o12;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.q0;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tlb1;
import defpackage.tls;
import defpackage.us4;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.yur;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.a;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(int i, fid fidVar, sls slsVar, sls slsVar2, String str, String str2) {
        bts btsVar;
        int i2;
        c530 c530Var;
        bts btsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-436298299);
        int i3 = i | (btsVar3.k(str) ? 4 : 2) | (btsVar3.e(slsVar) ? 32 : 16) | (btsVar3.k(str2) ? 256 : 128) | (btsVar3.e(slsVar2) ? 2048 : 1024);
        if (btsVar3.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var2 = c530.a;
            f530 m = an91.m(c530Var2, 8.0f, 0.0f, 2);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar3, 6);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d = b.d(btsVar3, m);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar3.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar3);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, d.f, a);
            qje.W(btsVar3, d.e, o);
            wls wlsVar = d.g;
            if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar3, hashCode, wlsVar);
            }
            qje.W(btsVar3, d.d, d);
            if (str2.length() <= 0 || slsVar2 == null) {
                i2 = i3;
                c530Var = c530Var2;
                btsVar2 = btsVar3;
                btsVar2.e0(878484217);
                btsVar2.t(false);
            } else {
                btsVar3.e0(878138908);
                f530 e = ljs0.e(c530Var2, 56.0f);
                if (1.0f <= 0.0d) {
                    gxv.a("invalid weight; must be greater than zero");
                }
                i2 = i3;
                btsVar2 = btsVar3;
                c530Var = c530Var2;
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.b(slsVar2, e.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, 0L, 0L, null, null, null, false, str2, null, null, wwg.S(174825509, true, new le(str2, 18), btsVar3), btsVar2, ((i3 >> 9) & 14) | ((i3 << 21) & 1879048192), 384, 3580);
                btsVar2.t(false);
            }
            f530 e2 = ljs0.e(c530Var, 56.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            bts btsVar4 = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar, e2.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, 0L, 0L, null, false, str, null, null, wwg.S(-664087584, true, new le(str, 19), btsVar2), btsVar4, ((i2 >> 3) & 14) | ((i2 << 27) & 1879048192), 3580);
            btsVar = btsVar4;
            btsVar.t(true);
        } else {
            btsVar = btsVar3;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o12(str, slsVar, str2, slsVar2, i);
        }
    }

    public static final void b(String str, String str2, Integer num, tls tlsVar, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-358066525);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.a(false) ? 256 : 128) | (btsVar.k(num) ? 2048 : 1024) | (btsVar.e(tlsVar) ? 16384 : 8192) | (btsVar.e(slsVar) ? 131072 : 65536);
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(new hoy0(str2, eja1.c(str2.length(), str2.length()), 4));
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new DeliveryCourierCommentKt$CommentInput$1$1(yurVar, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, zy11.a);
            hoy0 hoy0Var = (hoy0) oz40Var.getValue();
            f530 b = gi91.b(ljs0.c(an91.o(c530.a, 16.0f, 0.0f, 16.0f, 0.0f, 10), 1.0f), yurVar);
            boolean z = ((i2 & HProv.ALG_CLASS_ALL) == 16384) | ((i2 & 7168) == 2048);
            Object Q4 = btsVar.Q();
            if (z || Q4 == o430Var) {
                Q4 = new f89(20, num, tlsVar, oz40Var);
                btsVar.o0(Q4);
            }
            tlb1.a(0, 817889280, 0, 523640, btsVar, (tls) Q4, null, wwg.S(1152970104, true, new q0(str, 17), btsVar), wwg.S(1243030394, true, new us4(4, slsVar), btsVar), null, null, b, null, null, null, hoy0Var, null, null, false, false, false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) str, (Object) str2, (Object) num, tlsVar, (cms) slsVar, i, 11);
        }
    }

    public static final void c(f3i f3iVar, final ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.a aVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(11821390);
        int i2 = (btsVar2.k(f3iVar) ? 4 : 2) | i | (btsVar2.k(aVar) ? 32 : 16);
        final int i3 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
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
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            oeb1.c(btsVar2, ljs0.e(c530Var, 20.0f));
            e(f3iVar.a, btsVar2, 0);
            oeb1.c(btsVar2, ljs0.e(c530Var, 12.0f));
            d(f3iVar.b, btsVar2, 0);
            oeb1.c(btsVar2, ljs0.e(c530Var, 12.0f));
            String str = f3iVar.c;
            String str2 = f3iVar.w;
            Integer num = f3iVar.z;
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new bhh(12, aVar);
                btsVar2.o0(Q);
            }
            tls tlsVar = (tls) Q;
            boolean z2 = i4 == 32;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new sls() { // from class: c3i
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = r2;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        switch (i5) {
                            case 0:
                                aVar2.getClass();
                                break;
                            default:
                                aVar2.a();
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q2);
            }
            b(str, str2, num, tlsVar, (sls) Q2, btsVar2, 0);
            oeb1.c(btsVar2, ljs0.e(c530Var, 16.0f));
            String str3 = f3iVar.x;
            String str4 = f3iVar.y;
            sls b = aVar.b();
            r8 = i4 == 32 ? 1 : 0;
            Object Q3 = btsVar2.Q();
            if (r8 != 0 || Q3 == o430Var) {
                Q3 = new sls() { // from class: c3i
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        a aVar2 = aVar;
                        switch (i5) {
                            case 0:
                                aVar2.getClass();
                                break;
                            default:
                                aVar2.a();
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q3);
            }
            a(0, btsVar2, (sls) Q3, b, str3, str4);
            btsVar = btsVar2;
            ly3.B(c530Var, 8.0f, btsVar, true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d3i(f3iVar, aVar, i);
        }
    }

    public static final void d(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(443846617);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.e(str, an91.o(c530.a, 16.0f, 0.0f, 16.0f, 0.0f, 10), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | 48, 0, 65532);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 16);
        }
    }

    public static final void e(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(240478077);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.j(str, an91.o(c530.a, 16.0f, 0.0f, 16.0f, 0.0f, 10), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | 24624, 0, 65516);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 15);
        }
    }
}
