package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount;

import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gl51;
import defpackage.i43;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.oa01;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qm51;
import defpackage.qoj;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.s09;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.teb;
import defpackage.tls;
import defpackage.tse0;
import defpackage.v4v;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.ymj;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zvi;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(final qoj qojVar, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        long j;
        o430 o430Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1900675730);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (i & 6) == 0 ? (btsVar.k(qojVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = ((i2 & 896) == 256) | (i3 == 4);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (z || Q == o430Var2) {
                Q = new DiscountKt$Discount$1$1(tlsVar2, qojVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            c530 c530Var = c530.a;
            f530 l = ymb1.l(an91.m(c530Var, 16.0f, 0.0f, 2), ((YandexShapes) btsVar.m(qm51.a)).b());
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var2) {
                Q2 = new ymj(3, tlsVar, qojVar);
                btsVar.o0(Q2);
            }
            f530 d = q791.d(l, true, null, null, (sls) Q2, 14);
            ldc ldcVar = qojVar.d;
            if (ldcVar == null) {
                btsVar.e0(-1188259244);
                j = ((el51) btsVar.m(gl51.a)).c();
                btsVar.t(false);
            } else {
                btsVar.e0(-1188260608);
                btsVar.t(false);
                j = ldcVar.a;
            }
            f530 e = ljs0.e(m4m0.b(d, j, qke.q), 40.0f);
            boolean z3 = i3 == 4;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var2) {
                Q3 = new zvi(8, qojVar);
                btsVar.o0(Q3);
            }
            f530 b = fnq0.b(e, false, (tls) Q3);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b);
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
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            v4v v4vVar = qojVar.c;
            if (v4vVar == null) {
                btsVar.e0(-752710358);
                btsVar.t(false);
                o430Var = o430Var2;
            } else {
                btsVar.e0(-752710357);
                f530 q = ljs0.q(c530Var, 72.0f);
                z910 d3 = pi6.d(x4c.y, false);
                o430Var = o430Var2;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d4 = androidx.compose.ui.b.d(btsVar, q);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d3);
                qje.W(btsVar, wlsVar2, o2);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d4);
                s3b1.f(v4vVar, null, null, btsVar, 0, 6);
                btsVar.t(true);
                i43 i43Var = new i43(3.0f, true, new quz(11));
                f530 v = ljs0.v(c530Var, null, 1);
                sic a2 = qic.a(i43Var, x4c.G, btsVar, 6);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d5 = androidx.compose.ui.b.d(btsVar, v);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a2);
                qje.W(btsVar, wlsVar2, o3);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
                }
                qje.W(btsVar, wlsVar4, d5);
                btsVar.e0(1519018952);
                for (int i4 = 0; i4 < 6; i4++) {
                    pi6.a(ljs0.m(m4m0.b(c530Var, ((el51) btsVar.m(gl51.a)).c(), cyk0.a), 5.0f), btsVar, 0);
                }
                tse0.t(btsVar, false, true, false);
            }
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = new teb(20);
                btsVar.o0(Q4);
            }
            final int i5 = 0;
            final int i6 = 1;
            web1.c(fnq0.a(c530Var, (tls) Q4), 40.0f, false, 0.0f, null, null, wwg.S(2009113126, true, new wls() { // from class: poj
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    qoj qojVar2 = qojVar;
                    switch (i7) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                zgb1.a(qojVar2.e, null, 0, false, null, null, false, new jrn(1), btsVar2, 12582912, HProv.PP_DELETE_SAVED_PASSWD);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(1 & intValue2, (intValue2 & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                v4v v4vVar2 = qojVar2.f;
                                if (v4vVar2 != null) {
                                    btsVar3.e0(-1614842773);
                                    s3b1.f(v4vVar2, null, null, btsVar3, 0, 6);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(-1614842774);
                                    btsVar3.t(false);
                                    break;
                                }
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, wwg.S(-248747389, true, new wls() { // from class: poj
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    zy11 zy11Var = zy11.a;
                    qoj qojVar2 = qojVar;
                    switch (i7) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else {
                                zgb1.a(qojVar2.e, null, 0, false, null, null, false, new jrn(1), btsVar2, 12582912, HProv.PP_DELETE_SAVED_PASSWD);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(1 & intValue2, (intValue2 & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else {
                                v4v v4vVar2 = qojVar2.f;
                                if (v4vVar2 != null) {
                                    btsVar3.e0(-1614842773);
                                    s3b1.f(v4vVar2, null, null, btsVar3, 0, 6);
                                    btsVar3.t(false);
                                    break;
                                } else {
                                    btsVar3.e0(-1614842774);
                                    btsVar3.t(false);
                                    break;
                                }
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, oa01.a, false, btsVar, 806879232, 0, 5564);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new s09((Object) qojVar, (Object) tlsVar, (Object) tlsVar2, i, 27);
        }
    }
}
