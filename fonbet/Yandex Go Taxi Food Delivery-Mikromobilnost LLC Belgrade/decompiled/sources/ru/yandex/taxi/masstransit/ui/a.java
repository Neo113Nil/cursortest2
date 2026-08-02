package ru.yandex.taxi.masstransit.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.apn0;
import defpackage.au2;
import defpackage.awk0;
import defpackage.b0b1;
import defpackage.bgc;
import defpackage.bq2;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fhy;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g8r0;
import defpackage.gaf0;
import defpackage.ghy;
import defpackage.gi91;
import defpackage.gv9;
import defpackage.heb1;
import defpackage.heg0;
import defpackage.hoy0;
import defpackage.jct0;
import defpackage.jeb1;
import defpackage.kct0;
import defpackage.khl0;
import defpackage.l0;
import defpackage.lg6;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.n;
import defpackage.n7l0;
import defpackage.nvi0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pf6;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qor;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.sya1;
import defpackage.tdd;
import defpackage.tls;
import defpackage.up2;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.yrl;
import defpackage.yur;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.ui.a;

/* loaded from: classes6.dex */
public abstract class a {
    public static final void a(final f530 f530Var, final String str, final String str2, final String str3, final boolean z, final nvi0 nvi0Var, final nvi0 nvi0Var2, final au2 au2Var, final tls tlsVar, final sls slsVar, final String str4, fid fidVar, final int i, final int i2) {
        int i3;
        int i4;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1826150438);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.k(str2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar2.k(str3) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar2.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.k(nvi0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= btsVar2.k(nvi0Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= btsVar2.k(au2Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar2.e(tlsVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar2.a(false) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar2.e(slsVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar2.k(str4) ? 32 : 16;
        }
        int i5 = i3;
        if (btsVar2.V(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            btsVar2.a0();
            if ((i & 1) != 0 && !btsVar2.C()) {
                btsVar2.Y();
            }
            btsVar2.u();
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                int length = str.length();
                Q2 = f.j(new hoy0(str, eja1.c(length, length), 4));
                btsVar2.o0(Q2);
            }
            oz40 oz40Var = (oz40) Q2;
            Boolean bool = (Boolean) androidx.compose.foundation.interaction.a.b(zx40Var, btsVar2, 6).getValue();
            boolean booleanValue = bool.booleanValue();
            boolean z2 = (i5 & 112) == 32;
            Object Q3 = btsVar2.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new SourceDestinationKt$AddressInput$3$1(oz40Var, str, null);
                btsVar2.o0(Q3);
            }
            int i6 = i5 >> 3;
            zpn.e(btsVar2, (wls) Q3, str);
            int i7 = 14;
            boolean a = ((i4 & 14) == 4) | btsVar2.a(booleanValue);
            Object Q4 = btsVar2.Q();
            if (a || Q4 == o430Var) {
                Q4 = new SourceDestinationKt$AddressInput$4$1(booleanValue, slsVar, null);
                btsVar2.o0(Q4);
            }
            zpn.e(btsVar2, (wls) Q4, bool);
            hoy0 hoy0Var = (hoy0) oz40Var.getValue();
            wp2 up2Var = (booleanValue || z) ? AppColor$Palette.Text : new up2(bq2.b);
            fhy fhyVar = ghy.b;
            boolean z3 = (i5 & 234881024) == 67108864;
            Object Q5 = btsVar2.Q();
            if (z3 || Q5 == o430Var) {
                Q5 = new d0(oz40Var, tlsVar, i7);
                btsVar2.o0(Q5);
            }
            btsVar = btsVar2;
            heb1.a(hoy0Var, (tls) Q5, f530Var, false, null, up2Var, null, null, str3, null, str2, null, null, null, null, false, null, 0.0f, fhyVar, null, null, null, false, 2, 0, zx40Var, null, null, wwg.S(-1805857493, true, new gv9(z, nvi0Var, nvi0Var2, au2Var, 5), btsVar2), null, wwg.S(2094616080, true, new l0(29, str4, tlsVar), btsVar2), btsVar, ((i5 << 6) & 896) | ((i5 >> 15) & HProv.ALG_CLASS_ALL) | (1879048192 & (i5 << 18)), i6 & 112, 806903808, 1526199720);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ict0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    int O2 = vng.O(i2);
                    a.a(f530.this, str, str2, str3, z, nvi0Var, nvi0Var2, au2Var, tlsVar, slsVar, str4, (fid) obj, O, O2);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(boolean z, boolean z2, nvi0 nvi0Var, nvi0 nvi0Var2, au2 au2Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1923657013);
        int i2 = (btsVar.a(z) ? 4 : 2) | i | (btsVar.a(z2) ? 32 : 16) | (btsVar.k(nvi0Var) ? 256 : 128) | (btsVar.k(nvi0Var2) ? 2048 : 1024) | (btsVar.k(au2Var) ? 16384 : 8192);
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.Y();
        } else if (z && z2 && nvi0Var2 != null) {
            btsVar.e0(82783384);
            c(nvi0Var2, au2Var, btsVar, (i2 >> 9) & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else if (z && nvi0Var != null) {
            btsVar.e0(82887420);
            d(nvi0Var, au2Var, btsVar, ((i2 >> 9) & 112) | ((i2 >> 6) & 14));
            btsVar.t(false);
        } else if (z2 && nvi0Var2 != null) {
            btsVar.e0(82991053);
            h(nvi0Var2, btsVar, (i2 >> 9) & 14);
            btsVar.t(false);
        } else if (nvi0Var != null) {
            btsVar.e0(83061423);
            h(nvi0Var, btsVar, (i2 >> 6) & 14);
            btsVar.t(false);
        } else {
            btsVar.e0(83117285);
            f(au2Var, AppColor$Palette.Text, btsVar, ((i2 >> 12) & 14) | 48);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jct0(z, z2, nvi0Var, nvi0Var2, au2Var, i);
        }
    }

    public static final void c(nvi0 nvi0Var, au2 au2Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(762399914);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nvi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(au2Var) ? 32 : 16;
        }
        byte b = 0;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 k = an91.k(bzk0.c(ljs0.m(an91.k(c530.a, 8.0f), 40.0f), AppColor$Palette.Control, cyk0.c(12.0f)), 10.0f);
            tdd.a.getClass();
            v0b1.a(nvi0Var, k, null, tdd.b, wwg.S(2006925690, true, new heg0(au2Var, i3, b), btsVar), null, null, null, 0.0f, 0, btsVar, (i2 & 14) | 27648, 996);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kct0(nvi0Var, au2Var, i, b);
        }
    }

    public static final void d(nvi0 nvi0Var, au2 au2Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1392567308);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nvi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(au2Var) ? 32 : 16;
        }
        byte b = 0;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 k = an91.k(bzk0.c(ljs0.m(an91.k(c530.a, 8.0f), 40.0f), AppColor$Palette.Control, cyk0.c(12.0f)), 10.0f);
            tdd.a.getClass();
            v0b1.a(nvi0Var, k, null, tdd.c, wwg.S(2059783388, true, new heg0(au2Var, i3, b), btsVar), null, null, null, 0.0f, 0, btsVar, (i2 & 14) | 27648, 996);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kct0(nvi0Var, au2Var, i, i4);
        }
    }

    public static final void e(au2 au2Var, fid fidVar, int i) {
        au2 au2Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1199717997);
        int i2 = (btsVar.k(au2Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            au2Var2 = au2Var;
            sya1.a(au2Var2, an91.k(bzk0.c(ljs0.m(an91.k(c530.a, 8.0f), 40.0f), AppColor$Palette.Control, cyk0.c(12.0f)), 10.0f), null, AppColor$Palette.Text, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 4);
        } else {
            au2Var2 = au2Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new heg0(au2Var2, i);
        }
    }

    public static final void f(au2 au2Var, wp2 wp2Var, fid fidVar, int i) {
        int i2;
        au2 au2Var2;
        wp2 wp2Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(159110193);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(au2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wp2Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            au2Var2 = au2Var;
            wp2Var2 = wp2Var;
            sya1.a(au2Var2, ljs0.m(an91.k(c530.a, 16.0f), 24.0f), null, wp2Var2, btsVar, (i2 & 14) | 48 | ((i2 << 6) & 7168), 4);
        } else {
            au2Var2 = au2Var;
            wp2Var2 = wp2Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(au2Var2, wp2Var2, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final CharSequence charSequence, final String str, final String str2, final boolean z, final nvi0 nvi0Var, final nvi0 nvi0Var2, final au2 au2Var, final yur yurVar, final tls tlsVar, sls slsVar, final sls slsVar2, final CharSequence charSequence2, final String str3, final String str4, final boolean z2, final nvi0 nvi0Var3, final nvi0 nvi0Var4, final au2 au2Var2, final yur yurVar2, final tls tlsVar2, sls slsVar3, final sls slsVar4, sls slsVar5, final boolean z3, final String str5, String str6, fid fidVar, final int i) {
        sls slsVar6;
        String str7;
        sls slsVar7;
        final sls slsVar8;
        Object obj;
        boolean z4;
        Object Q;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1208601126);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(str) ? 256 : 128) | (btsVar.k(str2) ? 2048 : 1024) | (btsVar.a(z) ? 16384 : 8192) | (btsVar.k(nvi0Var) ? 131072 : 65536) | (btsVar.k(nvi0Var2) ? 1048576 : 524288);
        boolean k = btsVar.k(au2Var);
        int i3 = SelfTester_JCP.ENCRYPT_CBC;
        int i4 = i2 | (k ? SelfTester_JCP.ENCRYPT_CNT : 4194304) | (btsVar.e(tlsVar) ? 536870912 : SelfTester_JCP.IMITA);
        int i5 = 805306374 | (btsVar.e(slsVar2) ? 32 : 16) | (btsVar.k(charSequence2) ? 256 : 128) | (btsVar.k(str3) ? 2048 : 1024) | (btsVar.k(str4) ? 16384 : 8192) | (btsVar.a(z2) ? 131072 : 65536) | (btsVar.k(nvi0Var3) ? 1048576 : 524288) | (btsVar.k(nvi0Var4) ? SelfTester_JCP.ENCRYPT_CNT : 4194304) | (btsVar.k(au2Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        int i6 = (btsVar.e(tlsVar2) ? 4 : 2) | 196656 | (btsVar.e(slsVar4) ? 256 : 128) | (btsVar.e(slsVar5) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT | (btsVar.k(str5) ? 1048576 : 524288);
        if (btsVar.k(str6)) {
            i3 = SelfTester_JCP.ENCRYPT_CNT;
        }
        int i7 = i6 | i3;
        if (btsVar.V(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (4793491 & i7) == 4793490) ? false : true)) {
            Object Q2 = btsVar.Q();
            Object obj2 = did.a;
            if (Q2 == obj2) {
                Q2 = new bgc(12);
                btsVar.o0(Q2);
            }
            slsVar7 = (sls) Q2;
            Object Q3 = btsVar.Q();
            if (Q3 == obj2) {
                Q3 = new bgc(12);
                btsVar.o0(Q3);
            }
            sls slsVar9 = (sls) Q3;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar10 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar10);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            x2y d2 = n.d(btsVar, d, wlsVar4, 1.0f, true);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, d2);
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar10);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            int i8 = i4 >> 3;
            int i9 = i5 >> 3;
            int i10 = (i7 >> 15) & 112;
            a(q791.d(gi91.b(ljs0.c(c530Var, 1.0f), yurVar), true, null, null, slsVar7, 14), charSequence.toString(), str2, str, z, nvi0Var, nvi0Var2, au2Var, tlsVar, slsVar2, str5, btsVar, (i8 & 234881024) | (i8 & 896) | ((i4 << 3) & 7168) | (i4 & HProv.ALG_CLASS_ALL) | (i4 & ImageMetadata.JPEG_GPS_COORDINATES) | (i4 & 3670016) | (i4 & 29360128) | 805306368, (i9 & 14) | i10);
            int i11 = 7;
            yrl.e(null, null, btsVar, 0, 7);
            a(q791.d(gi91.b(ljs0.c(c530Var, 1.0f), yurVar2), true, null, null, slsVar9, 14), charSequence2.toString(), str4, str3, z2, nvi0Var3, nvi0Var4, au2Var2, tlsVar2, slsVar4, str5, btsVar, ((i5 >> 6) & 896) | (i5 & 7168) | (i9 & HProv.ALG_CLASS_ALL) | (i9 & ImageMetadata.JPEG_GPS_COORDINATES) | (i9 & 3670016) | (i9 & 29360128) | ((i7 << 24) & 234881024) | 805306368, ((i7 >> 6) & 14) | i10);
            btsVar.t(true);
            if (z3) {
                btsVar.e0(2031222067);
                au2 c2 = b0b1.c();
                boolean z5 = (i7 & 29360128) == 8388608;
                Object Q4 = btsVar.Q();
                if (z5) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (Q4 != obj) {
                        str7 = str6;
                        f530 o3 = an91.o(fnq0.b(c530Var, false, (tls) Q4), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                        z4 = (i7 & 7168) != 2048;
                        Q = btsVar.Q();
                        if (!z4 || Q == obj) {
                            slsVar6 = slsVar5;
                            Q = new n7l0(9, slsVar6);
                            btsVar.o0(Q);
                        } else {
                            slsVar6 = slsVar5;
                        }
                        sya1.a(c2, q791.b(o3, null, null, false, null, new awk0(0), (sls) Q, 12), null, null, btsVar, 0, 12);
                        btsVar.t(false);
                    }
                }
                str7 = str6;
                Q4 = new g8r0(str7, i11);
                btsVar.o0(Q4);
                f530 o32 = an91.o(fnq0.b(c530Var, false, (tls) Q4), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                if ((i7 & 7168) != 2048) {
                }
                Q = btsVar.Q();
                if (z4) {
                }
                slsVar6 = slsVar5;
                Q = new n7l0(9, slsVar6);
                btsVar.o0(Q);
                sya1.a(c2, q791.b(o32, null, null, false, null, new awk0(0), (sls) Q, 12), null, null, btsVar, 0, 12);
                btsVar.t(false);
            } else {
                slsVar6 = slsVar5;
                str7 = str6;
                btsVar.e0(2031515172);
                btsVar.t(false);
            }
            btsVar.t(true);
            slsVar8 = slsVar9;
        } else {
            slsVar6 = slsVar5;
            str7 = str6;
            btsVar.Y();
            slsVar7 = slsVar;
            slsVar8 = slsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final String str8 = str7;
            final sls slsVar11 = slsVar6;
            final sls slsVar12 = slsVar7;
            v.d = new wls(charSequence, str, str2, z, nvi0Var, nvi0Var2, au2Var, yurVar, tlsVar, slsVar12, slsVar2, charSequence2, str3, str4, z2, nvi0Var3, nvi0Var4, au2Var2, yurVar2, tlsVar2, slsVar8, slsVar4, slsVar11, z3, str5, str8, i) { // from class: hct0
                public final /* synthetic */ yur A;
                public final /* synthetic */ tls B;
                public final /* synthetic */ sls C;
                public final /* synthetic */ sls D;
                public final /* synthetic */ CharSequence E;
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ nvi0 I;
                public final /* synthetic */ nvi0 J;
                public final /* synthetic */ au2 K;
                public final /* synthetic */ yur L;
                public final /* synthetic */ tls M;
                public final /* synthetic */ sls N;
                public final /* synthetic */ sls O;
                public final /* synthetic */ sls P;
                public final /* synthetic */ boolean Q;
                public final /* synthetic */ String R;
                public final /* synthetic */ String S;
                public final /* synthetic */ CharSequence a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ nvi0 x;
                public final /* synthetic */ nvi0 y;
                public final /* synthetic */ au2 z;

                @Override // defpackage.wls
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int O = vng.O(100663303);
                    a.g(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (fid) obj3, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void h(nvi0 nvi0Var, fid fidVar, int i) {
        int i2;
        nvi0 nvi0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1824108914);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nvi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = ljs0.m(an91.k(c530.a, 16.0f), 24.0f);
            tdd.a.getClass();
            nvi0Var2 = nvi0Var;
            v0b1.a(nvi0Var2, m, null, tdd.d, tdd.e, null, null, null, 0.0f, 0, btsVar, (i2 & 14) | 27696, 996);
        } else {
            nvi0Var2 = nvi0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(nvi0Var2, i, 9);
        }
    }

    public static final lg6 i(wg6 wg6Var, int i, up2 up2Var, tls tlsVar, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        float w0 = ((fwi) btsVar.m(j.h)).w0(20.0f);
        boolean z = (((i2 & 14) ^ 6) > 4 && btsVar.k(wg6Var)) || (i2 & 6) == 4;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (z || Q == o430Var) {
            Q = jeb1.g(f.d(new pf6(wg6Var, i, w0, 0)));
            btsVar.o0(Q);
        }
        qor qorVar = (qor) Q;
        boolean k = btsVar.k(qorVar) | ((((i2 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) > 2048 && btsVar.k(tlsVar)) || (i2 & HProv.ALG_TYPE_SECURECHANNEL) == 2048);
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = new BottomSheetExtensionsKt$rememberMtBottomSheetScrim$1$1(qorVar, tlsVar, null);
            btsVar.o0(Q2);
        }
        zpn.e(btsVar, (wls) Q2, zy11.a);
        boolean z2 = ((((i2 & 896) ^ 384) > 256 && btsVar.k(up2Var)) || (i2 & 384) == 256) | ((((57344 & i2) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.k(null)) || (i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384);
        Object Q3 = btsVar.Q();
        if (z2 || Q3 == o430Var) {
            Q3 = new lg6(up2Var, qorVar, null);
            btsVar.o0(Q3);
        }
        return (lg6) Q3;
    }
}
