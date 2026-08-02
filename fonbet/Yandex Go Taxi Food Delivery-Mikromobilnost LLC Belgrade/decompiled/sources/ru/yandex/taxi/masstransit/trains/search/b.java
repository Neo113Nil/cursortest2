package ru.yandex.taxi.masstransit.trains.search;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.adb1;
import defpackage.aii0;
import defpackage.an91;
import defpackage.au2;
import defpackage.b3z0;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.crb1;
import defpackage.cyk0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.ec01;
import defpackage.f530;
import defpackage.fc01;
import defpackage.fid;
import defpackage.g43;
import defpackage.gji0;
import defpackage.jeb1;
import defpackage.k3r;
import defpackage.lao0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.nc01;
import defpackage.nvi0;
import defpackage.nvs0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.or9;
import defpackage.pi6;
import defpackage.qed;
import defpackage.qic;
import defpackage.qje;
import defpackage.qke;
import defpackage.qpm0;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.rmy0;
import defpackage.s8y;
import defpackage.ses;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uj91;
import defpackage.us4;
import defpackage.vfc;
import defpackage.vwp0;
import defpackage.vxd;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.y76;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.yrl;
import defpackage.yur;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes6.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(nc01 nc01Var, tpr tprVar, tls tlsVar, fid fidVar, int i) {
        o430 o430Var;
        tls tlsVar2;
        String str;
        boolean z;
        Object Q;
        String str2;
        boolean z2;
        Object Q2;
        boolean z3;
        Object Q3;
        boolean z4;
        Object Q4;
        sls slsVar;
        boolean z5;
        Object Q5;
        sls slsVar2;
        nc01 nc01Var2 = nc01Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1774822044);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(nc01Var2) ? 4 : 2) | (btsVar.k(tprVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q6 = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q6 == o430Var2) {
                Q6 = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q6;
            Object Q7 = btsVar.Q();
            if (Q7 == o430Var2) {
                Q7 = vfc.g(btsVar);
            }
            yur yurVar2 = (yur) Q7;
            StationSearchOpenReason stationSearchOpenReason = nc01Var2.i;
            int i3 = i2 & 14;
            boolean z6 = i3 == 4;
            Object Q8 = btsVar.Q();
            if (z6 || Q8 == o430Var2) {
                Q8 = new TrainStationSearchModalKt$Content$1$1(nc01Var2, yurVar, yurVar2, null);
                btsVar.o0(Q8);
            }
            zpn.e(btsVar, (wls) Q8, stationSearchOpenReason);
            boolean z7 = (i2 & 112) == 32;
            Object Q9 = btsVar.Q();
            if (z7 || Q9 == o430Var2) {
                Q9 = new TrainStationSearchModalKt$Content$2$1(tprVar, yurVar, yurVar2, null);
                btsVar.o0(Q9);
            }
            zpn.e(btsVar, (wls) Q9, zy11.a);
            k3r k3rVar = ljs0.c;
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            gji0 gji0Var = qke.q;
            f530 c = bzk0.c(k3rVar, appColor$Palette, gji0Var);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar3 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
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
            tls tlsVar3 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 l = ymb1.l(ljs0.c(c530.a, 1.0f), cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3));
            AppColor$Palette appColor$Palette2 = AppColor$Palette.Background;
            f530 c2 = bzk0.c(l, appColor$Palette2, gji0Var);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            int i4 = i2 & 896;
            boolean z8 = i4 == 256;
            Object Q10 = btsVar.Q();
            if (z8) {
                o430Var = o430Var2;
            } else {
                o430Var = o430Var2;
                if (Q10 != o430Var) {
                    tlsVar2 = tlsVar;
                    c((sls) Q10, btsVar, 0);
                    vwp0 vwp0Var = nc01Var.a;
                    CharSequence charSequence = vwp0Var.a;
                    String str3 = vwp0Var.b;
                    String str4 = vwp0Var.c;
                    boolean z9 = vwp0Var.d;
                    nvi0 nvi0Var = vwp0Var.f;
                    nvi0 nvi0Var2 = vwp0Var.g;
                    au2 au2Var = vwp0Var.h;
                    vwp0 vwp0Var2 = nc01Var.b;
                    CharSequence charSequence2 = vwp0Var2.a;
                    str = vwp0Var2.b;
                    String str5 = vwp0Var2.c;
                    boolean z10 = vwp0Var2.d;
                    nvi0 nvi0Var3 = vwp0Var2.f;
                    nvi0 nvi0Var4 = vwp0Var2.g;
                    au2 au2Var2 = vwp0Var2.h;
                    String str6 = nc01Var.f;
                    String str7 = nc01Var.g;
                    z = i4 != 256;
                    Q = btsVar.Q();
                    if (!z || Q == o430Var) {
                        str2 = str;
                        Q = new ec01(0, tlsVar2);
                        btsVar.o0(Q);
                    } else {
                        str2 = str;
                    }
                    tls tlsVar4 = (tls) Q;
                    z2 = i4 != 256;
                    Q2 = btsVar.Q();
                    if (!z2 || Q2 == o430Var) {
                        Q2 = new fc01(0, tlsVar2);
                        btsVar.o0(Q2);
                    }
                    sls slsVar4 = (sls) Q2;
                    z3 = i4 != 256;
                    Q3 = btsVar.Q();
                    if (!z3 || Q3 == o430Var) {
                        Q3 = new ec01(1, tlsVar2);
                        btsVar.o0(Q3);
                    }
                    tls tlsVar5 = (tls) Q3;
                    z4 = i4 != 256;
                    Q4 = btsVar.Q();
                    if (!z4 || Q4 == o430Var) {
                        Q4 = new fc01(1, tlsVar2);
                        btsVar.o0(Q4);
                    }
                    slsVar = (sls) Q4;
                    z5 = i4 != 256;
                    Q5 = btsVar.Q();
                    if (!z5 || Q5 == o430Var) {
                        slsVar2 = slsVar;
                        Q5 = new fc01(2, tlsVar2);
                        btsVar.o0(Q5);
                    } else {
                        slsVar2 = slsVar;
                    }
                    nc01Var2 = nc01Var;
                    o430 o430Var3 = o430Var;
                    ru.yandex.taxi.masstransit.ui.a.g(charSequence, str3, str4, z9, nvi0Var, nvi0Var2, au2Var, yurVar, tlsVar4, null, slsVar4, charSequence2, str2, str5, z10, nvi0Var3, nvi0Var4, au2Var2, yurVar2, tlsVar5, null, slsVar2, (sls) Q5, true, str6, str7, btsVar, 100663302);
                    btsVar = btsVar;
                    btsVar.t(true);
                    uj91.b(null, null, btsVar, 0, 3);
                    if (nc01Var2.c.isEmpty()) {
                        btsVar.e0(-446353781);
                        f530 c3 = bzk0.c(k3rVar, appColor$Palette2, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12));
                        boolean z11 = (i4 == 256) | (i3 == 4);
                        Object Q11 = btsVar.Q();
                        if (z11 || Q11 == o430Var3) {
                            Q11 = new rmy0(21, nc01Var2, tlsVar);
                            btsVar.o0(Q11);
                        }
                        adb1.a(c3, null, null, null, null, null, false, null, (tls) Q11, btsVar, 0, 510);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-446445603);
                        b(nc01Var2.d, btsVar, 0);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                }
            }
            tlsVar2 = tlsVar;
            Q10 = new lao0(29, tlsVar2);
            btsVar.o0(Q10);
            c((sls) Q10, btsVar, 0);
            vwp0 vwp0Var3 = nc01Var.a;
            CharSequence charSequence3 = vwp0Var3.a;
            String str32 = vwp0Var3.b;
            String str42 = vwp0Var3.c;
            boolean z92 = vwp0Var3.d;
            nvi0 nvi0Var5 = vwp0Var3.f;
            nvi0 nvi0Var22 = vwp0Var3.g;
            au2 au2Var3 = vwp0Var3.h;
            vwp0 vwp0Var22 = nc01Var.b;
            CharSequence charSequence22 = vwp0Var22.a;
            str = vwp0Var22.b;
            String str52 = vwp0Var22.c;
            boolean z102 = vwp0Var22.d;
            nvi0 nvi0Var32 = vwp0Var22.f;
            nvi0 nvi0Var42 = vwp0Var22.g;
            au2 au2Var22 = vwp0Var22.h;
            String str62 = nc01Var.f;
            String str72 = nc01Var.g;
            if (i4 != 256) {
            }
            Q = btsVar.Q();
            if (z) {
            }
            str2 = str;
            Q = new ec01(0, tlsVar2);
            btsVar.o0(Q);
            tls tlsVar42 = (tls) Q;
            if (i4 != 256) {
            }
            Q2 = btsVar.Q();
            if (!z2) {
            }
            Q2 = new fc01(0, tlsVar2);
            btsVar.o0(Q2);
            sls slsVar42 = (sls) Q2;
            if (i4 != 256) {
            }
            Q3 = btsVar.Q();
            if (!z3) {
            }
            Q3 = new ec01(1, tlsVar2);
            btsVar.o0(Q3);
            tls tlsVar52 = (tls) Q3;
            if (i4 != 256) {
            }
            Q4 = btsVar.Q();
            if (!z4) {
            }
            Q4 = new fc01(1, tlsVar2);
            btsVar.o0(Q4);
            slsVar = (sls) Q4;
            if (i4 != 256) {
            }
            Q5 = btsVar.Q();
            if (z5) {
            }
            slsVar2 = slsVar;
            Q5 = new fc01(2, tlsVar2);
            btsVar.o0(Q5);
            nc01Var2 = nc01Var;
            o430 o430Var32 = o430Var;
            ru.yandex.taxi.masstransit.ui.a.g(charSequence3, str32, str42, z92, nvi0Var5, nvi0Var22, au2Var3, yurVar, tlsVar42, null, slsVar42, charSequence22, str2, str52, z102, nvi0Var32, nvi0Var42, au2Var22, yurVar2, tlsVar52, null, slsVar2, (sls) Q5, true, str62, str72, btsVar, 100663302);
            btsVar = btsVar;
            btsVar.t(true);
            uj91.b(null, null, btsVar, 0, 3);
            if (nc01Var2.c.isEmpty()) {
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) nc01Var2, (Object) tprVar, tlsVar, i, 22);
        }
    }

    public static final void b(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1568734300);
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 k = an91.k(bzk0.c(ljs0.c, AppColor$Palette.Background, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 16.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            jeb1.f(str, null, AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.b, btsVar, (i2 & 14) | 384, 0, 16250);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, 9);
        }
    }

    public static final void c(sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-986778786);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.runtime.internal.a S = wwg.S(1052554479, true, new us4(13, slsVar), btsVar);
            qed.a.getClass();
            crb1.c(null, S, null, qed.b, null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new us4(slsVar, i, 14);
        }
    }

    public static final void d(nvi0 nvi0Var, CharSequence charSequence, boolean z, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1433777509);
        int i2 = 16;
        int i3 = i | (btsVar.k(nvi0Var) ? 4 : 2) | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            ydb1.a(f530Var, wwg.S(-664903375, true, new ses(nvi0Var, i4), btsVar), wwg.S(1568515692, true, new or9(i2, charSequence), btsVar), null, null, null, null, false, btsVar, ((i3 >> 9) & 14) | 432, 248);
            if (z) {
                btsVar.e0(-215171611);
                yrl.e(null, null, btsVar, 0, 7);
                btsVar.t(false);
            } else {
                btsVar.e0(-215138937);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(nvi0Var, charSequence, z, f530Var, i, 21);
        }
    }

    public static final void e(boolean z, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2126335398);
        int i2 = (btsVar.a(z) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            ydb1.a(null, s8y.a, y76.a, null, null, null, null, false, btsVar, 0, 249);
            if (z) {
                btsVar.e0(814937894);
                yrl.e(null, null, btsVar, 0, 7);
                btsVar.t(false);
            } else {
                btsVar.e0(814970568);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vxd(z, i, 10);
        }
    }

    public static final void f(nc01 nc01Var, tpr tprVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1860920612);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(nc01Var) : btsVar.e(nc01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(tprVar) : btsVar.e(tprVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            qy20.a(null, null, null, false, wwg.S(-82001926, true, new ls40(nc01Var, tlsVar, tprVar, 26), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(nc01Var, tprVar, tlsVar, i, 5);
        }
    }
}
