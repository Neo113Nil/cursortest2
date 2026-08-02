package ru.yandex.taxi.masstransit.detailedroute.ui.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.a7y;
import defpackage.ai30;
import defpackage.aii0;
import defpackage.aj31;
import defpackage.an91;
import defpackage.bj6;
import defpackage.bms;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.ctq;
import defpackage.cyk0;
import defpackage.d0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.f530;
import defpackage.ffx;
import defpackage.fid;
import defpackage.fsk0;
import defpackage.fwi;
import defpackage.ger;
import defpackage.gwc;
import defpackage.h111;
import defpackage.hja1;
import defpackage.i43;
import defpackage.j690;
import defpackage.jeb1;
import defpackage.k0v;
import defpackage.k3r;
import defpackage.kdc;
import defpackage.khl0;
import defpackage.kiu;
import defpackage.kj6;
import defpackage.ku30;
import defpackage.l8v;
import defpackage.lg6;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lm30;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.mhe;
import defpackage.mob1;
import defpackage.nih;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ocb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pf6;
import defpackage.pi6;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.qor;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.squ;
import defpackage.tls;
import defpackage.to5;
import defpackage.tra1;
import defpackage.tse;
import defpackage.u07;
import defpackage.u92;
import defpackage.uic;
import defpackage.uo5;
import defpackage.up2;
import defpackage.vfc;
import defpackage.vg0;
import defpackage.vg30;
import defpackage.vpa1;
import defpackage.vs9;
import defpackage.w01;
import defpackage.w2o;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.x8d;
import defpackage.xg30;
import defpackage.xya1;
import defpackage.ye5;
import defpackage.ypu;
import defpackage.z910;
import defpackage.zg30;
import defpackage.zmo;
import defpackage.zpn;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.c;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes6.dex */
public abstract class c {
    public static final void a(final bj6 bj6Var, final gwc gwcVar, final MtFloatingButtonState mtFloatingButtonState, final boolean z, final tls tlsVar, fid fidVar, final int i) {
        int i2;
        MtFloatingButtonState mtFloatingButtonState2;
        gwc gwcVar2;
        tls tlsVar2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        o430 o430Var;
        int i3;
        boolean z2;
        boolean z3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2023804459);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(gwcVar) : btsVar2.e(gwcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.c(mtFloatingButtonState.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 16384 : 8192;
        }
        if (!btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            mtFloatingButtonState2 = mtFloatingButtonState;
            gwcVar2 = gwcVar;
            tlsVar2 = tlsVar;
            btsVar = btsVar2;
            btsVar.Y();
        } else {
            if (!z) {
                v = btsVar2.v();
                if (v != null) {
                    final int i4 = 1;
                    wlsVar = new wls() { // from class: tg30
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    int O = vng.O(i6 | 1);
                                    c.a(bj6Var, gwcVar, mtFloatingButtonState, z, tlsVar, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    int O2 = vng.O(i6 | 1);
                                    c.a(bj6Var, gwcVar, mtFloatingButtonState, z, tlsVar, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            uo5 uo5Var = x4c.A;
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(bj6Var.a(c530Var, uo5Var), 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            to5 to5Var = x4c.F;
            lhl0 a = khl0.a(lr20.g, to5Var, btsVar2, 54);
            int i5 = i2;
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar2 = androidx.compose.ui.node.d.f;
            qje.W(btsVar2, wlsVar2, a);
            wls wlsVar3 = androidx.compose.ui.node.d.e;
            qje.W(btsVar2, wlsVar3, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar4 = androidx.compose.ui.node.d.g;
            qje.W(btsVar2, wlsVar4, valueOf);
            tls tlsVar3 = androidx.compose.ui.node.d.h;
            qje.M(btsVar2, tlsVar3);
            wls wlsVar5 = androidx.compose.ui.node.d.d;
            qje.W(btsVar2, wlsVar5, d);
            int i6 = i5 & HProv.ALG_CLASS_ALL;
            boolean z4 = i6 == 16384;
            Object Q = btsVar2.Q();
            o430 o430Var2 = did.a;
            if (z4 || Q == o430Var2) {
                Q = new kiu(20, tlsVar);
                btsVar2.o0(Q);
            }
            ButtonSize buttonSize = ButtonSize.M;
            btsVar = btsVar2;
            vpa1.a(c530Var, false, buttonSize, (sls) Q, wwg.S(367939781, false, zg30.a, btsVar2), btsVar, 24960, 2);
            lhl0 a2 = khl0.a(new i43(8.0f, true, new quz(11)), to5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a2);
            qje.W(btsVar, wlsVar3, o3);
            vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar5, d2);
            gwcVar2 = gwcVar;
            if (gwcVar2.a) {
                btsVar.e0(-224254789);
                i3 = i6;
                boolean z5 = i3 == 16384;
                Object Q2 = btsVar.Q();
                o430Var = o430Var2;
                if (z5 || Q2 == o430Var) {
                    tlsVar2 = tlsVar;
                    Q2 = new kiu(16, tlsVar2);
                    btsVar.o0(Q2);
                } else {
                    tlsVar2 = tlsVar;
                }
                vpa1.a(null, false, buttonSize, (sls) Q2, wwg.S(1277298302, true, new ctq(29, gwcVar2), btsVar), btsVar, 24960, 3);
                z2 = false;
                btsVar.t(false);
            } else {
                tlsVar2 = tlsVar;
                o430Var = o430Var2;
                i3 = i6;
                z2 = false;
                btsVar.e0(-223950865);
                btsVar.t(false);
            }
            mtFloatingButtonState2 = mtFloatingButtonState;
            boolean z6 = mtFloatingButtonState2 == MtFloatingButtonState.FOCUS_ROUTE ? true : z2;
            boolean a3 = btsVar.a(z6) | (i3 == 16384 ? true : z2);
            Object Q3 = btsVar.Q();
            if (a3 || Q3 == o430Var) {
                z3 = true;
                Q3 = new nih(z6, tlsVar2, 1);
                btsVar.o0(Q3);
            } else {
                z3 = true;
            }
            vpa1.a(null, false, buttonSize, (sls) Q3, wwg.S(-1824003997, z3, new kj6(z6, 3), btsVar), btsVar, 24960, 3);
            btsVar.t(z3);
            btsVar.t(z3);
        }
        v = btsVar.v();
        if (v != null) {
            final int i7 = 0;
            final MtFloatingButtonState mtFloatingButtonState3 = mtFloatingButtonState2;
            final gwc gwcVar3 = gwcVar2;
            final tls tlsVar4 = tlsVar2;
            wlsVar = new wls() { // from class: tg30
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i7;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).intValue();
                            int O = vng.O(i62 | 1);
                            c.a(bj6Var, gwcVar3, mtFloatingButtonState3, z, tlsVar4, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            int O2 = vng.O(i62 | 1);
                            c.a(bj6Var, gwcVar3, mtFloatingButtonState3, z, tlsVar4, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(lm30 lm30Var, tls tlsVar, aj31 aj31Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1239510063);
        int i2 = (btsVar.e(lm30Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.k(aj31Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ocb1.a(null, false, null, false, false, null, 0.0f, 0, wwg.S(-402440654, true, new vg30(lm30Var, aj31Var, tlsVar), btsVar), btsVar, 805306368, 511);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vg30(lm30Var, tlsVar, aj31Var, i);
        }
    }

    public static final void c(final ai30 ai30Var, final tls tlsVar, final tls tlsVar2, final aj31 aj31Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1942849316);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(ai30Var) : btsVar.e(ai30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(aj31Var) : btsVar.e(aj31Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            rzo.b(null, "default", wwg.S(1033221184, true, new wls() { // from class: ru.yandex.taxi.masstransit.detailedroute.ui.v2.a
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    bts btsVar2;
                    int a;
                    float f;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                        final boolean c = hja1.c(btsVar3);
                        final wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar3, 48, 0, 8189);
                        float f2 = ((Configuration) btsVar3.m(AndroidCompositionLocals_androidKt.a)).screenHeightDp / 2.0f;
                        if (c) {
                            btsVar3.e0(-1338002337);
                            btsVar3.t(false);
                            a = -1;
                            f = f2;
                            btsVar2 = btsVar3;
                        } else {
                            btsVar3.e0(-1337957821);
                            btsVar2 = btsVar3;
                            a = ger.a(a2, 72.0f, false, btsVar2, 48, 14);
                            f = f2;
                            ger.a(a2, f, true, btsVar2, 384, 12);
                            btsVar2.t(false);
                        }
                        final int i3 = a;
                        Boolean valueOf = Boolean.valueOf(c);
                        boolean a3 = btsVar2.a(c) | btsVar2.k(a2);
                        Object Q = btsVar2.Q();
                        Object obj3 = did.a;
                        if (a3 || Q == obj3) {
                            Q = new MtDetailedRouteScreenKt$MtDetailedRouteScreen$1$1$1(c, a2, null);
                            btsVar2.o0(Q);
                        }
                        zpn.e(btsVar2, (wls) Q, valueOf);
                        float w0 = ((fwi) btsVar2.m(androidx.compose.ui.platform.j.h)).w0(f);
                        boolean k = btsVar2.k(a2) | btsVar2.b(w0);
                        Object Q2 = btsVar2.Q();
                        if (k || Q2 == obj3) {
                            Q2 = jeb1.g(androidx.compose.runtime.f.d(new k0v(a2, w0, 1)));
                            btsVar2.o0(Q2);
                        }
                        qor qorVar = (qor) Q2;
                        boolean k2 = btsVar2.k(qorVar);
                        Object Q3 = btsVar2.Q();
                        if (k2 || Q3 == obj3) {
                            Q3 = new lg6(AppColor$Palette.Fog, qorVar, null);
                            btsVar2.o0(Q3);
                        }
                        lg6 lg6Var = (lg6) Q3;
                        Object Q4 = btsVar2.Q();
                        if (Q4 == obj3) {
                            Q4 = androidx.compose.runtime.f.j(Boolean.FALSE);
                            btsVar2.o0(Q4);
                        }
                        oz40 oz40Var = (oz40) Q4;
                        final tls tlsVar3 = tls.this;
                        boolean k3 = btsVar2.k(tlsVar3);
                        Object Q5 = btsVar2.Q();
                        if (k3 || Q5 == obj3) {
                            Q5 = new d0(tlsVar3, oz40Var, 6);
                            btsVar2.o0(Q5);
                        }
                        tls tlsVar4 = (tls) Q5;
                        boolean k4 = btsVar2.k(a2) | btsVar2.b(w0) | btsVar2.c(i3);
                        Object Q6 = btsVar2.Q();
                        if (k4 || Q6 == obj3) {
                            Q6 = androidx.compose.runtime.f.d(new pf6(a2, w0, i3));
                            btsVar2.o0(Q6);
                        }
                        m3u0 m3u0Var = (m3u0) Q6;
                        final androidx.compose.foundation.lazy.b a4 = a7y.a(0, 3, btsVar2);
                        k3r k3rVar = ljs0.c;
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar2, k3rVar);
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
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                        final ai30 ai30Var2 = ai30Var;
                        androidx.compose.runtime.internal.a S = wwg.S(-124963161, true, new qk30(25, ai30Var2, tlsVar3, m3u0Var), btsVar2);
                        androidx.compose.runtime.internal.a S2 = wwg.S(-558919674, true, new vg0((Object) ai30Var2, tlsVar3, (Object) aj31Var, tlsVar4, (Object) a4, 7), btsVar2);
                        final tls tlsVar5 = tlsVar2;
                        androidx.compose.runtime.internal.a S3 = wwg.S(-725030054, true, new bms() { // from class: yg30
                            @Override // defpackage.bms
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                j690 j690Var = (j690) obj5;
                                fid fidVar3 = (fid) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                if ((intValue2 & 48) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(j690Var) ? 32 : 16;
                                }
                                bts btsVar4 = (bts) fidVar3;
                                if (btsVar4.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                                    c.e(ai30.this, tlsVar3, j690Var, a2, i3, c, tlsVar5, a4, btsVar4, 8 | ((intValue2 << 3) & 896));
                                } else {
                                    btsVar4.Y();
                                }
                                return zy11.a;
                            }
                        }, btsVar2);
                        bts btsVar4 = btsVar2;
                        com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a2, lg6Var, false, false, null, null, null, S, null, S2, S3, btsVar4, 100663296, 54, 761);
                        ku30 ku30Var = ai30Var2.h;
                        boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                        Object Q7 = btsVar4.Q();
                        if (Q7 == obj3) {
                            Q7 = new w01(15, oz40Var);
                            btsVar4.o0(Q7);
                        }
                        ru.yandex.taxi.masstransit.geopayment.purchase.b.b(ku30Var, booleanValue, tlsVar4, (sls) Q7, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL);
                        btsVar4.t(true);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(ai30Var, tlsVar, tlsVar2, aj31Var, i, 9);
        }
    }

    public static final void d(h111 h111Var, f530 f530Var, fid fidVar, int i) {
        boolean z;
        boolean z2;
        wp2 wp2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(942211102);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.e(h111Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            UiStateDrawableWrapper uiStateDrawableWrapper = h111Var.a;
            UiStateDrawableWrapper uiStateDrawableWrapper2 = h111Var.b;
            boolean k = btsVar.k(uiStateDrawableWrapper);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                UiStateDrawableWrapper uiStateDrawableWrapper3 = h111Var.a;
                Drawable drawable = uiStateDrawableWrapper3 != null ? uiStateDrawableWrapper3.getDrawable() : null;
                Q = (drawable == null || drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? null : new u92(ffx.d0(drawable, 0, 0, 7));
                btsVar.o0(Q);
            }
            l8v l8vVar = (l8v) Q;
            boolean k2 = btsVar.k(uiStateDrawableWrapper2);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Drawable drawable2 = uiStateDrawableWrapper2 != null ? uiStateDrawableWrapper2.getDrawable() : null;
                u92 u92Var = (drawable2 == null || drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) ? null : new u92(ffx.d0(drawable2, 0, 0, 7));
                btsVar.o0(u92Var);
                Q2 = u92Var;
            }
            l8v l8vVar2 = (l8v) Q2;
            if (l8vVar == null) {
                btsVar.e0(511807712);
                z = false;
                btsVar.t(false);
            } else {
                btsVar.e0(511807713);
                o4b1.c(l8vVar, null, ljs0.n(an91.k(tra1.b(c530Var, h111Var.f ? 1.0f : 0.5f), 6.0f), 36.0f, 24.0f), null, mhe.a, 0.0f, null, 0, btsVar, 24624, 232);
                z = false;
                btsVar.t(false);
            }
            if (l8vVar2 == null) {
                btsVar.e0(512146418);
                btsVar.t(z);
            } else {
                btsVar.e0(512146419);
                o4b1.c(l8vVar2, null, cj6.a.a(bzk0.c(c530Var, AppColor$Palette.BgFloating, cyk0.c(25.0f)), x4c.w), null, null, 0.0f, null, 0, btsVar, 48, 248);
                btsVar.t(false);
            }
            btsVar.t(true);
            kdc kdcVar = h111Var.e;
            if (kdcVar != null) {
                btsVar.e0(-1840034995);
                long d4 = rzo.d(s8o.m(kdcVar, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)));
                int i3 = up2.c;
                z2 = false;
                btsVar.t(false);
                wp2Var = new up2(d4);
            } else {
                z2 = false;
                btsVar.e0(-1839954240);
                btsVar.t(false);
                wp2Var = AppColor$Palette.Text;
            }
            qgy.b(h111Var.c, h111Var.d.toString(), new ypu(x4c.H), wp2Var, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, 0, 0, 12144);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg30(h111Var, f530Var, i, 0);
        }
    }

    public static final void e(ai30 ai30Var, tls tlsVar, j690 j690Var, final wg6 wg6Var, final int i, boolean z, tls tlsVar2, androidx.compose.foundation.lazy.b bVar, fid fidVar, int i2) {
        int i3;
        bts btsVar;
        tls tlsVar3 = tlsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-532163581);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? btsVar2.k(ai30Var) : btsVar2.e(ai30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar2.e(tlsVar3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar2.k(j690Var) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(wg6Var) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.c(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar2.a(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= btsVar2.e(tlsVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= btsVar2.k(bVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (btsVar2.V(i3 & 1, (4793491 & i3) != 4793490)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = androidx.compose.runtime.f.d(new vs9(bVar, 11));
                btsVar2.o0(Q);
            }
            final m3u0 m3u0Var = (m3u0) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = androidx.compose.runtime.f.d(new sls() { // from class: ug30
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i5;
                        boolean z2 = true;
                        m3u0 m3u0Var2 = m3u0Var;
                        int i7 = i;
                        wg6 wg6Var2 = wg6Var;
                        switch (i6) {
                            case 0:
                                int i8 = ((dtr0) wg6Var2.g.getValue()).a;
                                if (i8 == i7) {
                                    z2 = false;
                                } else if (i8 == -2) {
                                    z2 = ((Boolean) m3u0Var2.getValue()).booleanValue();
                                }
                                return Boolean.valueOf(z2);
                            default:
                                if (!((Boolean) m3u0Var2.getValue()).booleanValue() && ((dtr0) wg6Var2.g.getValue()).a != i7) {
                                    z2 = false;
                                }
                                return Boolean.valueOf(z2);
                        }
                    }
                });
                btsVar2.o0(Q2);
            }
            final m3u0 m3u0Var2 = (m3u0) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = androidx.compose.runtime.f.d(new sls() { // from class: ug30
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i4;
                        boolean z2 = true;
                        m3u0 m3u0Var22 = m3u0Var2;
                        int i7 = i;
                        wg6 wg6Var2 = wg6Var;
                        switch (i6) {
                            case 0:
                                int i8 = ((dtr0) wg6Var2.g.getValue()).a;
                                if (i8 == i7) {
                                    z2 = false;
                                } else if (i8 == -2) {
                                    z2 = ((Boolean) m3u0Var22.getValue()).booleanValue();
                                }
                                return Boolean.valueOf(z2);
                            default:
                                if (!((Boolean) m3u0Var22.getValue()).booleanValue() && ((dtr0) wg6Var2.g.getValue()).a != i7) {
                                    z2 = false;
                                }
                                return Boolean.valueOf(z2);
                        }
                    }
                });
                btsVar2.o0(Q3);
            }
            m3u0 m3u0Var3 = (m3u0) Q3;
            f530 j = an91.j(an91.o(ljs0.u(ljs0.c(c530.a, 1.0f), null, 3), 0.0f, 8.0f, 0.0f, 0.0f, 13), j690Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int i6 = i3;
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, j);
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
            mob1.a(ai30Var.a, ai30Var.b, ((Boolean) m3u0Var2.getValue()).booleanValue(), btsVar2, 0);
            boolean booleanValue = ((Boolean) m3u0Var3.getValue()).booleanValue();
            w2o a2 = androidx.compose.animation.k.d(sb2.K(200, 0, null, 6), null, 14).a(androidx.compose.animation.k.e(sb2.K(200, 0, null, 6), 2));
            zmo a3 = androidx.compose.animation.k.l(sb2.K(200, 0, null, 6), null, 14).a(androidx.compose.animation.k.f(sb2.K(200, 0, null, 6), 2));
            x8d.a.getClass();
            androidx.compose.animation.g.b(uic.a, booleanValue, null, a2, a3, null, x8d.c, btsVar2, 1600518, 18);
            btsVar = btsVar2;
            Object Q4 = btsVar.Q();
            if (Q4 == o430Var) {
                Q4 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q4);
            }
            tlsVar3 = tlsVar;
            sb2.b(fsk0.a.a(null), wwg.S(136816697, true, new ye5(ai30Var, tlsVar3, (tse) Q4, bVar, z, wg6Var, i), btsVar), btsVar, 56);
            int i7 = i6 & 7168;
            int i8 = 57344 & i6;
            boolean z2 = (i8 == 16384) | (i7 == 2048) | ((3670016 & i6) == 1048576);
            Object Q5 = btsVar.Q();
            if (z2 || Q5 == o430Var) {
                Q5 = new MtDetailedRouteScreenKt$SheetBody$1$2$1(i, wg6Var, tlsVar2, null);
                btsVar.o0(Q5);
            }
            zy11 zy11Var = zy11.a;
            zpn.e(btsVar, (wls) Q5, zy11Var);
            boolean z3 = (i8 == 16384) | (i7 == 2048) | ((i6 & 112) == 32);
            Object Q6 = btsVar.Q();
            if (z3 || Q6 == o430Var) {
                Q6 = new MtDetailedRouteScreenKt$SheetBody$1$3$1(i, wg6Var, tlsVar3, null);
                btsVar.o0(Q6);
            }
            zpn.e(btsVar, (wls) Q6, zy11Var);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new u07(ai30Var, tlsVar3, j690Var, wg6Var, i, z, tlsVar2, bVar, i2);
        }
    }
}
