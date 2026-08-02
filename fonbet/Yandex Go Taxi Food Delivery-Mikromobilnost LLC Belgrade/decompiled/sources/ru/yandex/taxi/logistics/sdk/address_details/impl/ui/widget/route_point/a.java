package ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point;

import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.window.e;
import com.google.ar.core.ImageMetadata;
import defpackage.a7u0;
import defpackage.aab1;
import defpackage.ace;
import defpackage.aii0;
import defpackage.aj00;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c36;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.ci91;
import defpackage.cj00;
import defpackage.cma1;
import defpackage.cms;
import defpackage.d41;
import defpackage.did;
import defpackage.dj00;
import defpackage.dk91;
import defpackage.dlb0;
import defpackage.dmh;
import defpackage.dms;
import defpackage.dmw0;
import defpackage.dur;
import defpackage.eab1;
import defpackage.ej00;
import defpackage.el51;
import defpackage.f530;
import defpackage.feg0;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fo1;
import defpackage.fzv;
import defpackage.g43;
import defpackage.gl51;
import defpackage.gv40;
import defpackage.gza1;
import defpackage.hc0;
import defpackage.j4z;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.l7l0;
import defpackage.lbb0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.lvi0;
import defpackage.ly3;
import defpackage.m4m0;
import defpackage.m71;
import defpackage.m7l0;
import defpackage.mhe;
import defpackage.mr1;
import defpackage.mt71;
import defpackage.n71;
import defpackage.n7l0;
import defpackage.nae;
import defpackage.nhl0;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.o71;
import defpackage.o8k0;
import defpackage.oa01;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.ohk0;
import defpackage.oz40;
import defpackage.ozg0;
import defpackage.p71;
import defpackage.pi6;
import defpackage.q71;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qjf0;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.rgb0;
import defpackage.rkb0;
import defpackage.rx21;
import defpackage.s3b1;
import defpackage.scc;
import defpackage.sfb1;
import defpackage.sic;
import defpackage.sls;
import defpackage.sm91;
import defpackage.so5;
import defpackage.t7l0;
import defpackage.teb;
import defpackage.tlb1;
import defpackage.tls;
import defpackage.tra1;
import defpackage.txq;
import defpackage.u7l0;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.ux20;
import defpackage.v7l0;
import defpackage.vnf0;
import defpackage.w511;
import defpackage.w7l0;
import defpackage.web1;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.x7l0;
import defpackage.xa6;
import defpackage.xab1;
import defpackage.ymb1;
import defpackage.ys0;
import defpackage.z910;
import defpackage.zdk0;
import defpackage.zi00;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zvr;
import defpackage.zx40;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;
import ru.yandex.taxi.logistics.sdk.address_details.impl.ui.widget.route_point.a;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(final d41 d41Var, boolean z, sls slsVar, sls slsVar2, sls slsVar3, fid fidVar, int i) {
        bts btsVar;
        boolean z2 = d41Var.f;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-952780088);
        int i2 = i | (btsVar2.k(d41Var) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | (btsVar2.e(slsVar2) ? 2048 : 1024) | (btsVar2.e(slsVar3) ? 16384 : 8192);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = (i2 & 7168) == 2048;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z3 || Q == o430Var) {
                Q = new RoutePointKt$Address$4$1(slsVar2, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            f530 f530Var = c530.a;
            if (z2 || !z) {
                btsVar2.e0(-793620752);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-793619643);
                Object Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                    Q2 = ly3.i(btsVar2);
                }
                zx40 zx40Var = (zx40) Q2;
                boolean z4 = (i2 & 896) == 256;
                Object Q3 = btsVar2.Q();
                if (z4 || Q3 == o430Var) {
                    Q3 = new n7l0(0, slsVar);
                    btsVar2.o0(Q3);
                }
                f530Var = q791.b(f530Var, zx40Var, null, false, null, null, (sls) Q3, 28);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(f530Var, 0.0f, false, 0.0f, null, wwg.S(-283099067, true, new wls() { // from class: o7l0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    d41 d41Var2 = d41Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(1 & intValue, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else if (!d41Var2.e) {
                                btsVar3.e0(1511676513);
                                beb1.d(d41Var2.d, btsVar3, 0);
                                btsVar3.t(false);
                                break;
                            } else {
                                btsVar3.e0(1511504370);
                                ocb1.c(ljs0.m(c530.a, 40.0f), 0.0f, 0L, 0L, ((YandexShapes) btsVar3.m(qm51.a)).d(), 0, null, btsVar3, 6, 110);
                                btsVar3.t(false);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                btsVar4.Y();
                                break;
                            } else {
                                web1.e(null, null, null, d41Var2.a, null, rx21.a(d41Var2.c, btsVar4), null, null, null, 0, false, 0, null, d41Var2.b, null, null, null, null, d41Var2.e, 0L, 0, false, 0, true, null, false, btsVar4, 0, 0, ImageMetadata.EDGE_MODE, 233799607);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), wwg.S(-1266092444, true, new wls() { // from class: o7l0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    d41 d41Var2 = d41Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj;
                            int intValue = ((Integer) obj2).intValue();
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(1 & intValue, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else if (!d41Var2.e) {
                                btsVar3.e0(1511676513);
                                beb1.d(d41Var2.d, btsVar3, 0);
                                btsVar3.t(false);
                                break;
                            } else {
                                btsVar3.e0(1511504370);
                                ocb1.c(ljs0.m(c530.a, 40.0f), 0.0f, 0L, 0L, ((YandexShapes) btsVar3.m(qm51.a)).d(), 0, null, btsVar3, 6, 110);
                                btsVar3.t(false);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                btsVar4.Y();
                                break;
                            } else {
                                web1.e(null, null, null, d41Var2.a, null, rx21.a(d41Var2.c, btsVar4), null, null, null, 0, false, 0, null, d41Var2.b, null, null, null, null, d41Var2.e, 0L, 0, false, 0, true, null, false, btsVar4, 0, 0, ImageMetadata.EDGE_MODE, 233799607);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), null, null, wwg.S(79894721, true, new mr1(d41Var, z, slsVar3, 22), btsVar2), null, (z2 || !z) ? oa01.c : d41Var.h ? oa01.c : oa01.a, false, btsVar, 807075840, 0, 5534);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 10, (cms) slsVar, (Object) d41Var, (Object) slsVar2, (Object) slsVar3, z);
        }
    }

    public static final void b(x7l0 x7l0Var, wls wlsVar, wls wlsVar2, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1828338349);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x7l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(new wu60(0L));
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            f530 o = an91.o(ljs0.c(c530.a, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            txq txqVar = x7l0Var.j;
            boolean z = x7l0Var.n;
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4);
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new u7l0(wlsVar, x7l0Var, 1);
                btsVar.o0(Q3);
            }
            sls slsVar = (sls) Q3;
            int i4 = i2;
            boolean z3 = ((i2 & 7168) == 2048) | (i3 == 4);
            Object Q4 = btsVar.Q();
            if (z3 || Q4 == o430Var) {
                Q4 = new l7l0(tlsVar, x7l0Var, 0);
                btsVar.o0(Q4);
            }
            g(o, txqVar, z, false, wlsVar2, slsVar, (sls) Q4, wwg.S(1883683565, true, new ls40(11, x7l0Var, oz40Var, oz40Var2), btsVar), btsVar, (57344 & (i4 << 6)) | 12582918, 8);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(x7l0Var, wlsVar, wlsVar2, tlsVar, i, 2);
        }
    }

    public static final void c(x7l0 x7l0Var, wls wlsVar, wls wlsVar2, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-125767706);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(x7l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            txq txqVar = x7l0Var.g;
            txq txqVar2 = x7l0Var.k;
            txq txqVar3 = x7l0Var.i;
            txq txqVar4 = x7l0Var.h;
            List g = scc.g(txqVar, txqVar4, txqVar3, txqVar2);
            if ((g instanceof Collection) && g.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it = g.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (((txq) it.next()).f == FieldVisibility.VISIBLE && (i3 = i3 + 1) < 0) {
                        scc.l();
                        throw null;
                    }
                }
            }
            if (Integer.MIN_VALUE <= i3 && i3 < 1) {
                btsVar.e0(-1533874340);
                btsVar.t(false);
            } else if (1 <= i3 && i3 < 3) {
                btsVar.e0(-1533811627);
                i(scc.g(txqVar, txqVar3, txqVar2, txqVar4), wlsVar, wlsVar2, x7l0Var.n, x7l0Var.c, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                btsVar.t(false);
            } else if (2 > i3 || i3 > Integer.MAX_VALUE) {
                btsVar.e0(-1532786116);
                btsVar.t(false);
            } else {
                btsVar.e0(-1533413835);
                List g2 = scc.g(txqVar, txqVar3);
                boolean z = x7l0Var.n;
                int i4 = x7l0Var.c;
                int i5 = i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND;
                i(g2, wlsVar, wlsVar2, z, i4, btsVar, i5);
                i(scc.g(txqVar2, txqVar4), wlsVar, wlsVar2, x7l0Var.n, x7l0Var.c, btsVar, i5);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(x7l0Var, wlsVar, wlsVar2, i, 21);
        }
    }

    public static final void d(int i, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-911606927);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            byk0 d = ((YandexShapes) btsVar.m(qm51.a)).d();
            boolean z2 = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new n7l0(2, slsVar);
                btsVar.o0(Q);
            }
            f530 d2 = q791.d(f530Var, false, null, null, (sls) Q, 15);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new teb(20);
                btsVar.o0(Q2);
            }
            f530 a = fnq0.a(d2, (tls) Q2);
            z910 d3 = pi6.d(z ? x4c.A : x4c.C, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, a);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d3);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d4);
            c530 c530Var = c530.a;
            f530 o2 = an91.o(c530Var, 0.0f, 0.0f, 0.0f, 6.0f, 7);
            a7u0 a7u0Var = gl51.a;
            f530 w = ljs0.w(m4m0.b(o2, ((el51) btsVar.m(a7u0Var)).b(), d), 3);
            z910 d5 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d6 = androidx.compose.ui.b.d(btsVar, w);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d5);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d6);
            ymb1.f(str, an91.l(c530Var, 10.0f, 8.0f), ((el51) btsVar.m(a7u0Var)).m(), null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar, (i2 >> 3) & 14, HProv.ALG_TYPE_SECURECHANNEL, 57336);
            btsVar = btsVar;
            btsVar.t(true);
            o4b1.b(mt71.m(ozg0.bubble_tail, 0, btsVar), null, gza1.b(c530Var, z ? -1.0f : 1.0f, 1.0f), null, null, 0.0f, new c36(((el51) btsVar.m(a7u0Var)).b(), 5), btsVar, 48, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new feg0(f530Var, str, z, slsVar, i);
        }
    }

    public static final void e(final f530 f530Var, final boolean z, final long j, final String str, final boolean z2, final sls slsVar, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1805794985);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.d(j) ? 256 : 128) | (btsVar.k(str) ? 2048 : 1024) | (btsVar.a(z2) ? 16384 : 8192);
        if (!btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            btsVar.Y();
        } else if (z) {
            btsVar.e0(-1972825114);
            e.b(z2 ? x4c.b : x4c.w, j, slsVar, null, wwg.S(607754159, true, new feg0(f530Var, str, z2, slsVar), btsVar), btsVar, ((i2 >> 3) & 112) | 24960, 8);
            btsVar.t(false);
        } else {
            btsVar.e0(-1972574293);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(z, j, str, z2, slsVar, i) { // from class: s7l0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;
                public final /* synthetic */ String w;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ sls y;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(196609);
                    a.e(f530.this, this.b, this.c, this.w, this.x, this.y, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void f(nae naeVar, boolean z, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar;
        f530 b;
        FieldVisibility fieldVisibility = naeVar.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1369760604);
        int i2 = i | (btsVar2.k(naeVar) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | (btsVar2.e(slsVar2) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object Q = btsVar2.Q();
            androidx.compose.runtime.internal.a aVar = null;
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new RoutePointKt$Contact$3$1(slsVar2, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            boolean z3 = naeVar.f && z;
            c530 c530Var = c530.a;
            if (z3) {
                btsVar2.e0(-2079936555);
                Object Q2 = btsVar2.Q();
                if (Q2 == o430Var) {
                    Q2 = ly3.i(btsVar2);
                }
                zx40 zx40Var = (zx40) Q2;
                boolean z4 = fieldVisibility == FieldVisibility.VISIBLE;
                boolean z5 = (i2 & 896) == 256;
                Object Q3 = btsVar2.Q();
                if (z5 || Q3 == o430Var) {
                    Q3 = new zvr(28, slsVar);
                    btsVar2.o0(Q3);
                }
                b = q791.b(c530Var, zx40Var, null, z4, null, null, (sls) Q3, 24);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-2079937716);
                btsVar2.t(false);
                b = c530Var;
            }
            f530 k = tra1.b(c530Var, fieldVisibility == FieldVisibility.VISIBLE ? 1.0f : 0.0f).k(b);
            androidx.compose.runtime.internal.a S = wwg.S(591063872, true, new lbb0(15, naeVar), btsVar2);
            String str = naeVar.b;
            if (str == null) {
                btsVar2.e0(-53113913);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-53113912);
                aVar = wwg.S(-686958134, true, new fzv(str, 23), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(k, 0.0f, false, 0.0f, null, null, S, aVar, null, wwg.S(-443683363, true, new mr1(naeVar, slsVar, z3), btsVar2), null, naeVar.e.equals(ace.a) ? oa01.a : oa01.c, false, btsVar, 806879232, 0, 5438);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(naeVar, z, slsVar, slsVar2, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(f530 f530Var, final txq txqVar, final boolean z, boolean z2, wls wlsVar, final sls slsVar, sls slsVar2, zls zlsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        sls slsVar3;
        int i5;
        dmw0 dmw0Var;
        int i6;
        zls zlsVar2;
        bts btsVar;
        boolean z4;
        sls slsVar4;
        aii0 v;
        zls zlsVar3;
        String str = txqVar.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1670504201);
        dmw0 dmw0Var2 = btsVar2.a;
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(txqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.a(z) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z3 = z2;
            i3 |= btsVar2.a(z3) ? 2048 : 1024;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar2.e(wlsVar) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= btsVar2.e(slsVar) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                slsVar3 = slsVar2;
                i3 |= btsVar2.e(slsVar3) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    dmw0Var = dmw0Var2;
                    i6 = i3 | 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        dmw0Var = dmw0Var2;
                        i3 |= btsVar2.e(zlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    } else {
                        dmw0Var = dmw0Var2;
                    }
                    i6 = i3;
                }
                if (btsVar2.V(i6 & 1, (i6 & 4793491) != 4793490)) {
                    final boolean z5 = i7 != 0 ? false : z3;
                    final sls slsVar5 = i4 != 0 ? null : slsVar3;
                    zls zlsVar4 = i5 != 0 ? null : zlsVar;
                    boolean k = btsVar2.k(str);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = f.j(str);
                        btsVar2.o0(Q);
                    }
                    final oz40 oz40Var = (oz40) Q;
                    f530 b = tra1.b(f530Var, txqVar.f == FieldVisibility.VISIBLE ? 1.0f : 0.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = androidx.compose.ui.b.d(btsVar2, b);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar6);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar2, wlsVar2, a);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar2, wlsVar3, o);
                    wls wlsVar4 = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar4);
                    }
                    wls wlsVar5 = d.d;
                    qje.W(btsVar2, wlsVar5, d);
                    boolean z6 = (i6 & 112) == 32;
                    Object Q2 = btsVar2.Q();
                    if (z6 || Q2 == o430Var) {
                        Q2 = new zdk0(8, wlsVar, txqVar, oz40Var);
                        btsVar2.o0(Q2);
                    }
                    final tls tlsVar = (tls) Q2;
                    c530 c530Var = c530.a;
                    f530 c = ljs0.c(c530Var, 1.0f);
                    zls zlsVar5 = zlsVar4;
                    lhl0 a2 = khl0.a(lr20.g, x4c.D, btsVar2, 6);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar2, c);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar6);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar2, a2);
                    qje.W(btsVar2, wlsVar3, o2);
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar2, hashCode2, wlsVar4);
                    }
                    qje.W(btsVar2, wlsVar5, d2);
                    f530 c2 = ljs0.c(c530Var, 1.0f);
                    nhl0 nhl0Var = nhl0.a;
                    boolean z7 = z5;
                    sls slsVar7 = slsVar5;
                    xab1.a(nhl0Var.a(c2, 1.0f, true), null, wwg.S(1760933543, true, new zls() { // from class: p7l0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Object c3;
                            txq txqVar2;
                            int i8;
                            dj6 dj6Var = (dj6) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                            }
                            boolean z8 = false;
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                Object Q3 = btsVar3.Q();
                                o430 o430Var2 = did.a;
                                if (Q3 == o430Var2) {
                                    Q3 = f.j(Boolean.FALSE);
                                    btsVar3.o0(Q3);
                                }
                                oz40 oz40Var2 = (oz40) Q3;
                                txq txqVar3 = txq.this;
                                String str2 = txqVar3.e;
                                if (str2 == null) {
                                    btsVar3.e0(1240773947);
                                    btsVar3.t(false);
                                    txqVar2 = txqVar3;
                                    i8 = 0;
                                } else {
                                    btsVar3.e0(1240773948);
                                    btsVar3.e0(40025194);
                                    fwi fwiVar = (fwi) btsVar3.m(j.h);
                                    boolean z9 = z5;
                                    boolean c4 = btsVar3.c(z9 ? 1 : -1);
                                    Object Q4 = btsVar3.Q();
                                    if (c4 || Q4 == o430Var2) {
                                        Q4 = new z5w(((fwiVar.f0(dj6Var.d() / 2.0f) * r6) << 32) | ((-fwiVar.f0(28.0f)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                        btsVar3.o0(Q4);
                                    }
                                    long j = ((z5w) Q4).a;
                                    btsVar3.t(false);
                                    Object Q5 = btsVar3.Q();
                                    if (Q5 == o430Var2) {
                                        Q5 = new nq5(slsVar, oz40Var2);
                                        btsVar3.o0(Q5);
                                    }
                                    sls slsVar8 = (sls) Q5;
                                    Object Q6 = btsVar3.Q();
                                    if (Q6 == o430Var2) {
                                        Q6 = new sz40(Boolean.FALSE);
                                        btsVar3.o0(Q6);
                                    }
                                    sz40 sz40Var = (sz40) Q6;
                                    Boolean bool = (Boolean) oz40Var2.getValue();
                                    bool.getClass();
                                    sz40Var.b(bool);
                                    zx01 O = bvf0.O(sz40Var, "Popup", btsVar3, 48, 0);
                                    gl11 gl11Var = gtq0.f;
                                    if (O.g()) {
                                        btsVar3.e0(1666853325);
                                        btsVar3.t(false);
                                        c3 = O.c();
                                    } else {
                                        btsVar3.e0(1666599280);
                                        boolean k2 = btsVar3.k(O);
                                        c3 = btsVar3.Q();
                                        if (k2 || c3 == o430Var2) {
                                            i2t0 D = tje.D();
                                            tls e = D != null ? D.e() : null;
                                            i2t0 O2 = tje.O(D);
                                            try {
                                                Object c5 = O.c();
                                                tje.W(D, O2, e);
                                                btsVar3.o0(c5);
                                                c3 = c5;
                                                z8 = false;
                                            } catch (Throwable th) {
                                                tje.W(D, O2, e);
                                                throw th;
                                            }
                                        }
                                        btsVar3.t(z8);
                                    }
                                    boolean booleanValue = ((Boolean) c3).booleanValue();
                                    btsVar3.e0(-1147472167);
                                    float f = booleanValue ? 1.0f : 0.0f;
                                    btsVar3.t(false);
                                    Float valueOf = Float.valueOf(f);
                                    boolean k3 = btsVar3.k(O);
                                    Object Q7 = btsVar3.Q();
                                    if (k3 || Q7 == o430Var2) {
                                        Q7 = f.d(new fw0(O, 6));
                                        btsVar3.o0(Q7);
                                    }
                                    boolean booleanValue2 = ((Boolean) ((m3u0) Q7).getValue()).booleanValue();
                                    btsVar3.e0(-1147472167);
                                    float f2 = booleanValue2 ? 1.0f : 0.0f;
                                    btsVar3.t(false);
                                    Float valueOf2 = Float.valueOf(f2);
                                    boolean k4 = btsVar3.k(O);
                                    Object Q8 = btsVar3.Q();
                                    if (k4 || Q8 == o430Var2) {
                                        Q8 = f.d(new fw0(O, 7));
                                        btsVar3.o0(Q8);
                                    }
                                    btsVar3.e0(-1797296076);
                                    txqVar2 = txqVar3;
                                    ck11 K = sb2.K(200, 0, null, 6);
                                    btsVar3.t(false);
                                    a.e(tra1.b(c530.a, ((Number) bvf0.s(O, valueOf, valueOf2, K, gl11Var, btsVar3, ImageMetadata.EDGE_MODE).A.getValue()).floatValue()), ((Boolean) oz40Var2.getValue()).booleanValue(), j, str2, z9, slsVar8, btsVar3, ImageMetadata.EDGE_MODE);
                                    btsVar3 = btsVar3;
                                    i8 = 0;
                                    btsVar3.t(false);
                                }
                                Object Q9 = btsVar3.Q();
                                if (Q9 == o430Var2) {
                                    Q9 = new q7l0(i8, slsVar5, oz40Var2);
                                    btsVar3.o0(Q9);
                                }
                                a.h((String) oz40Var.getValue(), txqVar2, z, tlsVar, (tls) Q9, btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT);
                            } else {
                                btsVar3.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar2), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 6);
                    if (zlsVar5 != null) {
                        btsVar2.e0(-1753157626);
                        zlsVar3 = zlsVar5;
                        zlsVar3.invoke(nhl0Var, btsVar2, Integer.valueOf(6 | ((i6 >> 18) & 112)));
                        btsVar2.t(false);
                    } else {
                        zlsVar3 = zlsVar5;
                        btsVar2.e0(-1753116303);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                    btsVar = btsVar2;
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14));
                    btsVar2.t(true);
                    zlsVar2 = zlsVar3;
                    z4 = z7;
                    slsVar4 = slsVar7;
                } else {
                    btsVar2.Y();
                    zlsVar2 = zlsVar;
                    btsVar = btsVar2;
                    z4 = z3;
                    slsVar4 = slsVar3;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new ux20(f530Var, txqVar, z, z4, wlsVar, slsVar, slsVar4, zlsVar2, i, i2);
                    return;
                }
                return;
            }
            slsVar3 = slsVar2;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if (btsVar2.V(i6 & 1, (i6 & 4793491) != 4793490)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z3 = z2;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        slsVar3 = slsVar2;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if (btsVar2.V(i6 & 1, (i6 & 4793491) != 4793490)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void h(String str, txq txqVar, boolean z, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        bts btsVar;
        int i2;
        int i3;
        boolean z2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(628766695);
        int i4 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(txqVar) ? 32 : 16) | (btsVar2.a(z) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i4 & 1, (i4 & 9363) != 9362)) {
            boolean a = btsVar2.a(str.length() == 0);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            androidx.compose.runtime.internal.a aVar = null;
            if (a || Q == o430Var) {
                Q = str.length() == 0 ? null : txqVar.b;
                btsVar2.o0(Q);
            }
            String str2 = (String) Q;
            f530 c = ljs0.c(c530.a, 1.0f);
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                i2 = i4;
                Q2 = new gv40(28, tlsVar2);
                btsVar2.o0(Q2);
            } else {
                i2 = i4;
            }
            f530 f = ci91.f(c, (tls) Q2);
            boolean z3 = (i2 & 112) == 32;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new ohk0(14, txqVar);
                btsVar2.o0(Q3);
            }
            f530 b = fnq0.b(f, false, (tls) Q3);
            int i5 = txqVar.d.a;
            boolean z4 = txqVar.f == FieldVisibility.VISIBLE;
            boolean z5 = txqVar.g || !z;
            long j = ldc.l;
            int i6 = i2;
            dmh d = tlb1.d(0L, 0L, j, j, 0L, 0L, btsVar2, 14155782, 2097055);
            lkx lkxVar = lkx.f;
            int i7 = w7l0.a[txqVar.h.ordinal()];
            if (i7 == 1) {
                i3 = 1;
            } else {
                if (i7 != 2) {
                    w511.b();
                    return;
                }
                i3 = 7;
            }
            lkx a2 = lkx.a(i3);
            if (str2 == null) {
                btsVar2.e0(1237404597);
                z2 = false;
            } else {
                z2 = false;
                btsVar2.e0(1237404598);
                aVar = wwg.S(-1510240866, true, new fzv(str2, 24), btsVar2);
            }
            btsVar2.t(z2);
            tlb1.b(str, tlsVar, b, z4, z5, null, aVar, wwg.S(-444257860, true, new lbb0(16, txqVar), btsVar2), false, null, a2, null, false, i5, null, null, d, null, btsVar2, (i6 & 14) | 12582912 | ((i6 >> 6) & 112), 0, 749344);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(str, txqVar, z, tlsVar, tlsVar2, i);
        }
    }

    public static final void i(List list, wls wlsVar, wls wlsVar2, boolean z, int i, fid fidVar, int i2) {
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1299664929);
        int i3 = (i2 & 6) == 0 ? (btsVar.e(list) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        wls wlsVar3 = wlsVar2;
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(wlsVar3) ? 256 : 128;
        }
        boolean z3 = z;
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.a(z3) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.c(i) ? 16384 : 8192;
        }
        boolean z4 = true;
        boolean z5 = false;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            f530 o = an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            wls wlsVar4 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar4);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1769557021);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    scc.m();
                    throw null;
                }
                txq txqVar = (txq) obj;
                if (txqVar.f == FieldVisibility.GONE) {
                    btsVar.e0(-48977617);
                    btsVar.t(z5);
                    z2 = z5;
                } else {
                    btsVar.e0(-49516738);
                    boolean z6 = i4 % 2 == 0 ? z4 : z5;
                    x2y x2yVar = new x2y(1.0f, z4);
                    boolean z7 = ((i3 & HProv.ALG_CLASS_ALL) == 16384) | ((i3 & 112) == 32 ? z4 : z5);
                    Object Q = btsVar.Q();
                    if (z7 || Q == did.a) {
                        Q = new ys0(wlsVar, i, 13);
                        btsVar.o0(Q);
                    }
                    boolean z8 = z6;
                    z2 = false;
                    g(x2yVar, txqVar, z3, z8, wlsVar3, (sls) Q, null, null, btsVar, ((i3 >> 3) & 896) | ((i3 << 6) & HProv.ALG_CLASS_ALL), 192);
                    btsVar.t(false);
                }
                wlsVar3 = wlsVar2;
                z3 = z;
                z5 = z2;
                i4 = i5;
                z4 = true;
            }
            btsVar.t(z5);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fo1(list, wlsVar, wlsVar2, z, i, i2, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0184, code lost:
    
        if (defpackage.jl40.l(r4.Q(), java.lang.Integer.valueOf(r5)) == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [bts, fid] */
    /* JADX WARN: Type inference failed for: r5v46, types: [int] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(x7l0 x7l0Var, dms dmsVar, zls zlsVar, tls tlsVar, tls tlsVar2, wls wlsVar, tls tlsVar3, wls wlsVar2, tls tlsVar4, tls tlsVar5, q71 q71Var, fid fidVar, int i) {
        int i2;
        x7l0 x7l0Var2;
        dms dmsVar2;
        wls wlsVar3;
        tls tlsVar6;
        wls wlsVar4;
        int i3;
        int i4;
        boolean z;
        c530 c530Var;
        int i5;
        boolean z2;
        ?? r5;
        tls tlsVar7 = tlsVar3;
        q71 q71Var2 = q71Var;
        int i6 = x7l0Var.c;
        ?? r4 = (bts) fidVar;
        r4.g0(1860248717);
        dmw0 dmw0Var = r4.a;
        if ((i & 6) == 0) {
            i2 = (r4.k(x7l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r4.e(dmsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r4.e(zlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= r4.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= r4.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= r4.e(wlsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= r4.e(tlsVar7) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= r4.e(wlsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= r4.e(tlsVar4) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i2 |= r4.e(tlsVar5) ? 536870912 : SelfTester_JCP.IMITA;
        }
        int i7 = r4.k(q71Var2) ? 4 : 2;
        int i8 = i2;
        if (r4.V(i8 & 1, ((i2 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            dur durVar = (dur) r4.m(j.i);
            Boolean valueOf = Boolean.valueOf(x7l0Var.n);
            int i9 = i8 & 14;
            boolean e = (i9 == 4) | r4.e(durVar);
            Object Q = r4.Q();
            Object obj = did.a;
            if (e || Q == obj) {
                Q = new RoutePointKt$RoutePoint$1$1(x7l0Var, durVar, null);
                r4.o0(Q);
            }
            zpn.e(r4, (wls) Q, valueOf);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, r4, 0);
            int hashCode = Long.hashCode(r4.T);
            r1b0 o = r4.o();
            c530 c530Var2 = c530.a;
            f530 d = androidx.compose.ui.b.d(r4, c530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            r4.i0();
            if (r4.S) {
                r4.n(slsVar);
            } else {
                r4.r0();
            }
            wls wlsVar5 = d.f;
            qje.W(r4, wlsVar5, a);
            wls wlsVar6 = d.e;
            qje.W(r4, wlsVar6, o);
            wls wlsVar7 = d.g;
            if (r4.S) {
                wlsVar4 = wlsVar5;
            } else {
                wlsVar4 = wlsVar5;
            }
            b64.z(hashCode, r4, hashCode, wlsVar7);
            wls wlsVar8 = d.d;
            qje.W(r4, wlsVar8, d);
            boolean c = r4.c(i6);
            Object Q2 = r4.Q();
            if (c || Q2 == obj) {
                Q2 = new o8k0(10, zlsVar, x7l0Var);
                r4.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            boolean c2 = r4.c(i6);
            Object Q3 = r4.Q();
            if (c2 || Q3 == obj) {
                Q3 = new l7l0(tlsVar, x7l0Var, 1);
                r4.o0(Q3);
            }
            sls slsVar3 = (sls) Q3;
            boolean c3 = r4.c(i6);
            Object Q4 = r4.Q();
            if (c3 || Q4 == obj) {
                Q4 = new l7l0(tlsVar2, x7l0Var, 2);
                r4.o0(Q4);
            }
            sls slsVar4 = (sls) Q4;
            boolean z3 = x7l0Var.e.g == FieldVisibility.VISIBLE;
            if (z3) {
                r4.e0(66234710);
                a(x7l0Var.e, x7l0Var.n, slsVar2, slsVar4, slsVar3, r4, 0);
                r4.t(false);
            } else {
                r4.e0(66520127);
                r4.t(false);
            }
            boolean z4 = x7l0Var.r != null && z3;
            boolean z5 = i9 == 4;
            boolean z6 = z3;
            Object Q5 = r4.Q();
            if (z5 || Q5 == obj) {
                Q5 = new m7l0(x7l0Var, 1);
                r4.o0(Q5);
            }
            f530 o2 = an91.o(rx21.c(c530Var2, z4, (tls) Q5), z6 ? 40.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14);
            sic a2 = qic.a(g43Var, so5Var, r4, 0);
            int hashCode2 = Long.hashCode(r4.T);
            r1b0 o3 = r4.o();
            f530 d2 = androidx.compose.ui.b.d(r4, o2);
            r4.i0();
            if (r4.S) {
                r4.n(slsVar);
            } else {
                r4.r0();
            }
            qje.W(r4, wlsVar4, a2);
            qje.W(r4, wlsVar6, o3);
            if (r4.S || !jl40.l(r4.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, r4, hashCode2, wlsVar7);
            }
            qje.W(r4, wlsVar8, d2);
            q71Var2 = q71Var;
            if ((q71Var2 instanceof o71) || (q71Var2 instanceof m71)) {
                tlsVar6 = tlsVar5;
                i3 = 4;
                r4.e0(87348045);
                dk91.a(0.0f, 6, 6, 0L, r4, an91.m(c530Var2, 16.0f, 0.0f, 2));
                i4 = 0;
                r4.t(false);
            } else {
                r4.e0(87081693);
                f530 m = an91.m(c530Var2, 16.0f, 0.0f, 2);
                i3 = 4;
                boolean z7 = ((i8 & 1879048192) == 536870912) | (i9 == 4);
                Object Q6 = r4.Q();
                if (z7 || Q6 == obj) {
                    tlsVar6 = tlsVar5;
                    Q6 = new l7l0(tlsVar6, x7l0Var, 3);
                    r4.o0(Q6);
                } else {
                    tlsVar6 = tlsVar5;
                }
                k(m, (sls) Q6, q71Var2, r4, ((i7 << 6) & 896) | 6);
                i4 = 0;
                r4.t(false);
            }
            boolean c4 = r4.c(i6);
            Object Q7 = r4.Q();
            if (c4 || Q7 == obj) {
                dmsVar2 = dmsVar;
                Q7 = new t7l0(i4, dmsVar2, x7l0Var);
                r4.o0(Q7);
            } else {
                dmsVar2 = dmsVar;
            }
            wls wlsVar9 = (wls) Q7;
            int i10 = ((i8 >> 18) & 112) | i9;
            c(x7l0Var, wlsVar2, wlsVar9, r4, i10);
            FieldVisibility fieldVisibility = x7l0Var.j.f;
            FieldVisibility fieldVisibility2 = FieldVisibility.GONE;
            if (fieldVisibility == fieldVisibility2) {
                r4.e0(88352073);
                z = false;
                r4.t(false);
                x7l0Var2 = x7l0Var;
                c530Var = c530Var2;
                i5 = i3;
            } else {
                z = false;
                r4.e0(88099330);
                c530Var = c530Var2;
                i5 = i3;
                b(x7l0Var, wlsVar2, wlsVar9, tlsVar4, r4, i10 | ((i8 >> 15) & 7168));
                x7l0Var2 = x7l0Var;
                r4.t(false);
            }
            rgb0 rgb0Var = x7l0Var2.m;
            if (rgb0Var == null) {
                r4.e0(88403625);
                r4.t(z);
                r5 = z;
            } else {
                dlb0 dlb0Var = rgb0Var.a;
                r4.e0(88403626);
                if (dlb0Var.a.isEmpty()) {
                    z2 = false;
                    r4.e0(-987115051);
                    r4.t(false);
                } else {
                    r4.e0(-987547501);
                    ru.yandex.taxi.logistics.sdk.photocomments.a.b(dlb0Var, PhotocommentsMode.MUTABLE, new rkb0(), an91.o(c530Var, 0.0f, 4.0f, 0.0f, 16.0f, 5), null, rgb0Var.c, null, null, r4, 3128, 208);
                    z2 = false;
                    r4.t(false);
                }
                r4.t(z2);
                r5 = z2;
            }
            boolean c5 = r4.c(i6);
            Object Q8 = r4.Q();
            if (c5 || Q8 == obj) {
                wlsVar3 = wlsVar;
                Q8 = new u7l0(wlsVar3, x7l0Var2, r5);
                r4.o0(Q8);
            } else {
                wlsVar3 = wlsVar;
            }
            sls slsVar5 = (sls) Q8;
            boolean c6 = r4.c(i6);
            Object Q9 = r4.Q();
            if (c6 || Q9 == obj) {
                tlsVar7 = tlsVar3;
                Q9 = new l7l0(tlsVar7, x7l0Var2, i5);
                r4.o0(Q9);
            } else {
                tlsVar7 = tlsVar3;
            }
            sls slsVar6 = (sls) Q9;
            if (x7l0Var2.l.c == fieldVisibility2) {
                r4.e0(89569257);
                r4.t(false);
            } else {
                r4.e0(89305943);
                f(x7l0Var2.l, x7l0Var2.n, slsVar5, slsVar6, r4, 0);
                r4.t(false);
            }
            r4.t(true);
            r4.t(true);
        } else {
            x7l0Var2 = x7l0Var;
            dmsVar2 = dmsVar;
            wlsVar3 = wlsVar;
            tlsVar6 = tlsVar5;
            r4.Y();
        }
        aii0 v = r4.v();
        if (v != null) {
            v.d = new v7l0(x7l0Var2, dmsVar2, zlsVar, tlsVar, tlsVar2, wlsVar3, tlsVar7, wlsVar2, tlsVar4, tlsVar6, q71Var2, i);
        }
    }

    public static final void k(f530 f530Var, sls slsVar, q71 q71Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        boolean z;
        long j;
        boolean z2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1432128466);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(q71Var) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            a7u0 a7u0Var = qm51.a;
            byk0 b = ((YandexShapes) btsVar2.m(a7u0Var)).b();
            float f = ((YandexShapes) btsVar2.m(a7u0Var)).c;
            c530 c530Var = c530.a;
            f530 l = ymb1.l(ljs0.c(ljs0.e(c530Var, 104.0f), 1.0f), b);
            btsVar2.c0(-1885905849, q71Var);
            boolean equals = q71Var.equals(n71.a);
            o430 o430Var = did.a;
            if (equals) {
                btsVar2.e0(1666466252);
                f530 k = f530Var.k(l);
                Object Q = btsVar2.Q();
                if (Q == o430Var) {
                    Q = new teb(20);
                    btsVar2.o0(Q);
                }
                ocb1.c(fnq0.a(k, (tls) Q), 0.0f, 0L, 0L, null, 0, null, btsVar2, 0, HProv.PP_DELETE_SAVED_PASSWD);
                btsVar2.t(false);
                z = false;
                btsVar = btsVar2;
            } else {
                z = false;
                if ((q71Var instanceof m71) || (q71Var instanceof o71)) {
                    btsVar = btsVar2;
                    btsVar.e0(1666785676);
                    btsVar.t(false);
                } else {
                    if (!(q71Var instanceof p71)) {
                        throw unr0.y(-1885904925, btsVar2, false);
                    }
                    btsVar2.e0(1666969661);
                    f530 k2 = f530Var.k(l);
                    a7u0 a7u0Var2 = gl51.a;
                    xa6 a = eab1.a(0.5f, ((el51) btsVar2.m(a7u0Var2)).d());
                    f530 b2 = aab1.b(k2, a.a, a.b, b);
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = new teb(20);
                        btsVar2.o0(Q2);
                    }
                    f530 a2 = fnq0.a(b2, (tls) Q2);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar2, a2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar2, wlsVar, d);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar2, wlsVar2, o);
                    wls wlsVar3 = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar3);
                    }
                    wls wlsVar4 = d.d;
                    qje.W(btsVar2, wlsVar4, d2);
                    f530 c = ljs0.c(c530Var, 1.0f);
                    boolean z3 = (i2 & 112) == 32;
                    Object Q3 = btsVar2.Q();
                    if (z3 || Q3 == o430Var) {
                        Q3 = new zvr(29, slsVar);
                        btsVar2.o0(Q3);
                    }
                    f530 d3 = q791.d(c, false, null, null, (sls) Q3, 15);
                    boolean b3 = ((i2 & 896) == 256) | btsVar2.b(f);
                    Object Q4 = btsVar2.Q();
                    if (b3 || Q4 == o430Var) {
                        Q4 = new qjf0(q71Var, f, 2);
                        btsVar2.o0(Q4);
                    }
                    btsVar = btsVar2;
                    s3b1.f(new j4z((tls) Q4, new uo5(0.0f, -0.15384616f), 14), d3, mhe.a, btsVar, 384, 0);
                    cj00 cj00Var = ((p71) q71Var).b;
                    if (cj00Var == null) {
                        btsVar.e0(-1330682589);
                        btsVar.t(false);
                        z = false;
                        z2 = true;
                    } else {
                        btsVar.e0(-1330682588);
                        f530 f2 = sm91.f(c530Var, 0.0f, 16.0f, 1);
                        z910 d4 = pi6.d(x4c.b, false);
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d5 = androidx.compose.ui.b.d(btsVar, f2);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar2);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar, d4);
                        qje.W(btsVar, wlsVar2, o2);
                        if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                            b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
                        }
                        qje.W(btsVar, wlsVar4, d5);
                        if (cj00Var instanceof ej00) {
                            btsVar.e0(-1411063894);
                            z = false;
                            sfb1.b(((ej00) cj00Var).a, ((el51) btsVar.m(a7u0Var2)).j(), btsVar, 0);
                            btsVar.t(false);
                        } else {
                            z = false;
                            if (cj00Var instanceof aj00) {
                                btsVar.e0(-1411056082);
                                sfb1.b(((aj00) cj00Var).a, ((el51) btsVar.m(a7u0Var2)).g(), btsVar, 0);
                                btsVar.t(false);
                            } else if (cj00Var instanceof zi00) {
                                btsVar.e0(-1411048282);
                                zi00 zi00Var = (zi00) cj00Var;
                                lvi0 lvi0Var = zi00Var.a;
                                ldc ldcVar = zi00Var.b;
                                if (ldcVar == null) {
                                    btsVar.e0(-1411043388);
                                    j = ((el51) btsVar.m(a7u0Var2)).j();
                                    z = false;
                                    btsVar.t(false);
                                } else {
                                    z = false;
                                    btsVar.e0(-1411044845);
                                    btsVar.t(false);
                                    j = ldcVar.a;
                                }
                                sfb1.b(lvi0Var, j, btsVar, z ? 1 : 0);
                                btsVar.t(z);
                            } else {
                                z = false;
                                if (!(cj00Var instanceof dj00)) {
                                    throw unr0.y(-1411065734, btsVar, false);
                                }
                                btsVar.e0(-1411039755);
                                sfb1.c(((dj00) cj00Var).a, 0, btsVar);
                                btsVar.t(false);
                            }
                        }
                        z2 = true;
                        btsVar.t(true);
                        btsVar.t(z);
                    }
                    btsVar.t(z2);
                    btsVar.t(z);
                }
            }
            btsVar.t(z);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0(f530Var, (Object) slsVar, (Object) q71Var, i, 22);
        }
    }
}
