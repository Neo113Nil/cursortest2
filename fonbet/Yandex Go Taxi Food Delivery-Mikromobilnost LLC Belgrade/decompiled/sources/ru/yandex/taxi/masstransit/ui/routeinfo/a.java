package ru.yandex.taxi.masstransit.ui.routeinfo;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.aii0;
import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.e0h0;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gci0;
import defpackage.h9d;
import defpackage.hc1;
import defpackage.hk2;
import defpackage.i43;
import defpackage.jeb1;
import defpackage.jg0;
import defpackage.jo0;
import defpackage.khl0;
import defpackage.kk2;
import defpackage.l0;
import defpackage.lg6;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m5b1;
import defpackage.mhe;
import defpackage.mja1;
import defpackage.my6;
import defpackage.n6b1;
import defpackage.nc0;
import defpackage.nfj;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.ovi0;
import defpackage.oxv;
import defpackage.oz40;
import defpackage.q47;
import defpackage.qab1;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.qv30;
import defpackage.r1b0;
import defpackage.r2v0;
import defpackage.r3c0;
import defpackage.rv30;
import defpackage.sic;
import defpackage.sls;
import defpackage.so5;
import defpackage.sv30;
import defpackage.tje;
import defpackage.tls;
import defpackage.tv30;
import defpackage.uh6;
import defpackage.ulb1;
import defpackage.unr0;
import defpackage.up2;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.vu30;
import defpackage.vv30;
import defpackage.wg30;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wv30;
import defpackage.wwg;
import defpackage.wzr;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class a {
    public static final void a(q47 q47Var, String str, tls tlsVar, wls wlsVar, f530 f530Var, fid fidVar, int i) {
        String str2;
        wls wlsVar2;
        f530 f530Var2;
        int i2;
        c530 c530Var;
        o430 o430Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-88012652);
        int i3 = (i & 6) == 0 ? (btsVar.e(q47Var) ? 4 : 2) | i : i;
        int i4 = 32;
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= btsVar.k(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i5 = 256;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            wlsVar2 = wlsVar;
            i3 |= btsVar.e(wlsVar2) ? 2048 : 1024;
        } else {
            wlsVar2 = wlsVar;
        }
        int i6 = i3 | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i6 & 1, (i6 & 9363) != 9362)) {
            boolean c = btsVar.c(2) | btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (c || Q == o430Var2) {
                Q = new jg0(21);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar, c530Var2);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1577920636);
            for (my6 my6Var : q47Var.b) {
                sv30 sv30Var = (sv30) my6Var.e;
                if (sv30Var instanceof rv30) {
                    btsVar.e0(-1461448592);
                    boolean e = ((i6 & 896) == i5) | btsVar.e(sv30Var) | ((i6 & 112) == i4) | ((i6 & 7168) == 2048);
                    Object Q2 = btsVar.Q();
                    if (e || Q2 == o430Var2) {
                        String str3 = str2;
                        wls wlsVar3 = wlsVar2;
                        c530Var = c530Var2;
                        z = false;
                        jo0 jo0Var = new jo0(tlsVar, sv30Var, str3, wlsVar3, 24);
                        btsVar.o0(jo0Var);
                        Q2 = jo0Var;
                    } else {
                        c530Var = c530Var2;
                        z = false;
                    }
                    o430Var = o430Var2;
                    i2 = i5;
                    ulb1.a(null, false, null, (sls) Q2, wwg.S(-338222608, true, new wg30(5, my6Var), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                    btsVar.t(z);
                } else {
                    i2 = i5;
                    c530Var = c530Var2;
                    o430Var = o430Var2;
                    if (sv30Var instanceof qv30) {
                        btsVar.e0(-1461022249);
                        btsVar.t(false);
                    } else {
                        if (sv30Var != null) {
                            throw unr0.y(1061232597, btsVar, false);
                        }
                        btsVar.e0(-1461003401);
                        btsVar.t(false);
                    }
                }
                str2 = str;
                c530Var2 = c530Var;
                o430Var2 = o430Var;
                i5 = i2;
                i4 = 32;
                wlsVar2 = wlsVar;
            }
            f530Var2 = c530Var2;
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(q47Var, str, tlsVar, wlsVar, f530Var2, i);
        }
    }

    public static final void b(wv30 wv30Var, tls tlsVar, wls wlsVar, f530 f530Var, fid fidVar, int i) {
        so5 so5Var;
        wls wlsVar2;
        sls slsVar;
        wls wlsVar3;
        tls tlsVar2;
        wls wlsVar4;
        boolean z;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1816791114);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(wv30Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16) | (btsVar.e(wlsVar) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            i43 i43Var = new i43(16.0f, true, new quz(11));
            so5 so5Var2 = x4c.G;
            sic a = qic.a(i43Var, so5Var2, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            wls wlsVar5 = d.f;
            qje.W(btsVar, wlsVar5, a);
            wls wlsVar6 = d.e;
            qje.W(btsVar, wlsVar6, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar7 = d.g;
            qje.W(btsVar, wlsVar7, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar8 = d.d;
            qje.W(btsVar, wlsVar8, d);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a2 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar5, a2);
            qje.W(btsVar, wlsVar6, o2);
            vfc.v(hashCode2, btsVar, wlsVar7, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar8, d2);
            if (wv30Var.a != null) {
                btsVar.e0(2123822834);
                ovi0 a3 = mja1.a(wv30Var.a, null, 6);
                f530 l = ymb1.l(ljs0.m(an91.o(c530Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 48.0f), cyk0.c(4.0f));
                h9d.a.getClass();
                wlsVar4 = wlsVar7;
                wlsVar3 = wlsVar8;
                z = false;
                tlsVar2 = tlsVar3;
                z2 = true;
                so5Var = so5Var2;
                wlsVar2 = wlsVar6;
                slsVar = slsVar2;
                v0b1.a(a3, l, null, null, h9d.c, null, null, mhe.b, 0.0f, 0, btsVar, 12607872, 872);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                so5Var = so5Var2;
                wlsVar2 = wlsVar6;
                slsVar = slsVar2;
                wlsVar3 = wlsVar8;
                tlsVar2 = tlsVar3;
                wlsVar4 = wlsVar7;
                z = false;
                z2 = true;
                btsVar.e0(2124156797);
                e(btsVar, 0);
                btsVar.t(false);
            }
            f530 o3 = an91.o(new x2y(1.0f, z2), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            sic a4 = qic.a(lr20.e, so5Var, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d3 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar5, a4);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode3, btsVar, wlsVar4, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar3, d3);
            String str = wv30Var.b;
            ety0 ety0Var = xya1.e(btsVar).g.b;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            bts btsVar2 = btsVar;
            jeb1.f(str, null, appColor$Palette, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, ety0Var, btsVar2, 805306752, 48, 13818);
            d(wv30Var.c, xya1.e(btsVar2).h.a, appColor$Palette, null, btsVar2, 3456);
            btsVar = btsVar2;
            btsVar.t(z2);
            btsVar.t(z2);
            if (wv30Var.d.b.isEmpty()) {
                btsVar.e0(1988969826);
                btsVar.t(z);
            } else {
                btsVar.e0(1988770899);
                a(wv30Var.d, wv30Var.e, tlsVar, wlsVar, null, btsVar, (i2 << 3) & 8064);
                btsVar.t(z);
            }
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr((Object) wv30Var, (Object) tlsVar, (Object) wlsVar, (Object) f530Var, i, 17);
        }
    }

    public static final void c(wv30 wv30Var, tls tlsVar, f530 f530Var, tls tlsVar2, gci0 gci0Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1377654955);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar2.k(wv30Var) : btsVar2.e(wv30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.e(tlsVar2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= (32768 & i) == 0 ? btsVar2.k(gci0Var) : btsVar2.e(gci0Var) ? 16384 : 8192;
        }
        if (btsVar2.V(i3 & 1, (i3 & 9363) != 9362)) {
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 48, 0, 8189);
            lg6 c = qab1.c(a, new up2(zp2.d), null, btsVar2, 384, 0);
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            boolean k = btsVar2.k(fwiVar) | ((i3 & 7168) == 2048);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new MtRouteInfoModalKt$MtRouteInfoModal$2$1(fwiVar, tlsVar2, 140.0f, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, zy11.a);
            q47 q47Var = wv30Var.d;
            String str = wv30Var.e;
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && btsVar2.e(wv30Var))) | ((i3 & 112) == 32);
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Q2 = new MtRouteInfoModalKt$MtRouteInfoModal$3$1(wv30Var, tlsVar, null);
                btsVar2.o0(Q2);
            }
            zpn.f(q47Var, str, (wls) Q2, btsVar2);
            androidx.compose.runtime.internal.a S = wwg.S(-836884103, true, new nfj(27, gci0Var, tlsVar), btsVar2);
            h9d.a.getClass();
            c530 c530Var = c530.a;
            c.a(c530Var, a, c, false, false, null, null, S, null, null, h9d.b, wwg.S(2473995, true, new l0(18, wv30Var, tlsVar), btsVar2), btsVar2, ((i3 >> 6) & 14) | 12582912, 54, 888);
            btsVar = btsVar2;
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0((Object) wv30Var, (Object) tlsVar, f530Var2, (Object) tlsVar2, (Object) gci0Var, i, 23);
        }
    }

    public static final void d(vv30 vv30Var, ety0 ety0Var, wp2 wp2Var, f530 f530Var, fid fidVar, int i) {
        wp2 wp2Var2;
        f530 f530Var2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-852525806);
        int i2 = i | (btsVar.k(vv30Var) ? 4 : 2) | (btsVar.k(ety0Var) ? 32 : 16) | HProv.ALG_CLASS_DATA_ENCRYPT;
        int i3 = 0;
        boolean z2 = true;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Boolean bool = (Boolean) oz40Var2.getValue();
            bool.booleanValue();
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new MtRouteInfoModalKt$MtSubtitleText$1$1(oz40Var2, oz40Var, null);
                btsVar.o0(Q3);
            }
            zpn.e(btsVar, (wls) Q3, bool);
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            ArrayList arrayList = vv30Var.a;
            String str = vv30Var.b;
            boolean a = btsVar.a(booleanValue) | btsVar.k(arrayList) | btsVar.k(str);
            Object Q4 = btsVar.Q();
            if (a || Q4 == o430Var) {
                if (!((Boolean) oz40Var.getValue()).booleanValue() || str.length() <= 0) {
                    ArrayList arrayList2 = vv30Var.a;
                    hk2 hk2Var = new hk2(0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayList2.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        r2v0 r2v0Var = (r2v0) it.next();
                        String str2 = r2v0Var.a;
                        if (str2 != null) {
                            hk2Var.d(str2);
                        } else if (r2v0Var.b != null) {
                            String str3 = "icon_" + i4;
                            hk2Var.d("  ");
                            n6b1.a(hk2Var, str3, "�");
                            hk2Var.d("  ");
                            z = true;
                            linkedHashMap.put(str3, new oxv(new r3c0(4, uh6.E(7), uh6.E(8)), new androidx.compose.runtime.internal.a(872388226, new tv30(r2v0Var, i3), true)));
                            i4++;
                            i3 = 0;
                            z2 = z;
                        }
                        z = z2;
                        i3 = 0;
                        z2 = z;
                    }
                    Q4 = new Pair(hk2Var.i(), linkedHashMap);
                } else {
                    Q4 = new Pair(new kk2(str), kotlin.collections.b.f());
                }
                btsVar.o0(Q4);
            }
            Pair pair = (Pair) Q4;
            kk2 kk2Var = (kk2) pair.getFirst();
            Map map = (Map) pair.getSecond();
            wp2Var2 = wp2Var;
            ety0 a2 = ety0.a(ety0Var, tje.n(wp2Var2, btsVar), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
            Object Q5 = btsVar.Q();
            if (Q5 == o430Var) {
                Q5 = new hc1(oz40Var, oz40Var2, 2);
                btsVar.o0(Q5);
            }
            c530 c530Var = c530.a;
            m5b1.a(kk2Var, c530Var, a2, (tls) Q5, 2, false, 2, 0, map, null, btsVar, 1600560, 0, 1696);
            f530Var2 = c530Var;
        } else {
            wp2Var2 = wp2Var;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(vv30Var, ety0Var, wp2Var2, f530Var2, i, 16);
        }
    }

    public static final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-508987213);
        int i2 = 1;
        if (btsVar.V(i & 1, i != 0)) {
            o4b1.b(vfc.k(e0h0.ic_masstransit_logo, 0, -1411607277, btsVar, false), null, ymb1.l(ljs0.m(an91.o(c530.a, 4.0f, 0.0f, 0.0f, 0.0f, 14), 48.0f), cyk0.c(4.0f)), null, null, 0.0f, null, btsVar, 56, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vu30(i, i2);
        }
    }
}
