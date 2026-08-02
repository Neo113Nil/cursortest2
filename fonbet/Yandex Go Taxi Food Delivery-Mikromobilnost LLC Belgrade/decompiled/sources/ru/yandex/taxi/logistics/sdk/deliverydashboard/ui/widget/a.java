package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import defpackage.aa01;
import defpackage.aii0;
import defpackage.an51;
import defpackage.an91;
import defpackage.b64;
import defpackage.bhy;
import defpackage.bts;
import defpackage.byk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.ehy;
import defpackage.el51;
import defpackage.et0;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.foj;
import defpackage.fwi;
import defpackage.gl51;
import defpackage.h0;
import defpackage.hoj;
import defpackage.hzr;
import defpackage.iwc0;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.koj;
import defpackage.ky;
import defpackage.ldc;
import defpackage.lhg;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.loj;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.mhg;
import defpackage.moj;
import defpackage.n;
import defpackage.nc0;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.ome;
import defpackage.ooi;
import defpackage.oz40;
import defpackage.pa31;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.s3b1;
import defpackage.sic;
import defpackage.sls;
import defpackage.sq0;
import defpackage.srk0;
import defpackage.sty0;
import defpackage.tls;
import defpackage.tq0;
import defpackage.tra1;
import defpackage.tse0;
import defpackage.uh6;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.v4v;
import defpackage.vg0;
import defpackage.w3b1;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsy0;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xm91;
import defpackage.y7m;
import defpackage.ymb1;
import defpackage.ymj;
import defpackage.z910;
import defpackage.zls;
import defpackage.zm51;
import defpackage.zpn;
import defpackage.zy11;
import defpackage.zyd;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.state.CouponSize;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.ProgressBarSize;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, ky kyVar, f530 f530Var, String str2, Object obj, aa01 aa01Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        String str3;
        int i5;
        int i6;
        Object obj2;
        int i7;
        bts btsVar;
        f530 f530Var3;
        String str4;
        Object obj3;
        aii0 v;
        int i8;
        String str5;
        Object obj4;
        ky kyVar2;
        Object sq0Var;
        lhg lhgVar;
        String str6;
        boolean z;
        String str7;
        Object obj5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1317520044);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(kyVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i5 = i3 | HProv.ALG_TYPE_SECURECHANNEL;
                str3 = str2;
            } else {
                str3 = str2;
                i5 = i3 | (btsVar2.k(str3) ? 2048 : 1024);
            }
            i6 = i2 & 16;
            if (i6 == 0) {
                i7 = i5 | HProv.ALG_CLASS_DATA_ENCRYPT;
                obj2 = obj;
            } else {
                obj2 = obj;
                i7 = i5 | (btsVar2.e(obj2) ? 16384 : 8192);
            }
            if ((196608 & i) == 0) {
                i7 |= btsVar2.k(aa01Var) ? 131072 : 65536;
            }
            if (btsVar2.V(i7 & 1, (74899 & i7) == 74898)) {
                btsVar = btsVar2;
                btsVar.Y();
                f530Var3 = f530Var2;
                str4 = str3;
                obj3 = obj2;
            } else {
                f530 f530Var4 = i9 != 0 ? c530.a : f530Var2;
                if (i4 != 0) {
                    str3 = null;
                }
                Object obj6 = i6 != 0 ? null : obj2;
                ky kyVar3 = aa01Var != null ? aa01Var.a : null;
                String str8 = aa01Var != null ? aa01Var.b : null;
                Object obj7 = aa01Var != null ? aa01Var.c : null;
                lhg lhgVar2 = (lhg) btsVar2.m(mhg.a);
                int i10 = i7 & 7168;
                boolean e = btsVar2.e(lhgVar2) | (i10 == 2048) | btsVar2.e(obj6);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    i8 = i7;
                    Q = new AddressButtonKt$AddressButton$1$1(lhgVar2, str3, obj6, null);
                    btsVar2.o0(Q);
                } else {
                    i8 = i7;
                }
                zpn.e(btsVar2, (wls) Q, kyVar);
                boolean k = btsVar2.k(kyVar3) | btsVar2.e(lhgVar2) | btsVar2.k(str8) | btsVar2.e(obj7);
                Object Q2 = btsVar2.Q();
                if (k || Q2 == o430Var) {
                    ky kyVar4 = kyVar3;
                    str5 = str8;
                    obj4 = obj7;
                    Q2 = new AddressButtonKt$AddressButton$2$1(kyVar4, lhgVar2, str5, obj4, null);
                    kyVar2 = kyVar4;
                    btsVar2.o0(Q2);
                } else {
                    kyVar2 = kyVar3;
                    str5 = str8;
                    obj4 = obj7;
                }
                zpn.e(btsVar2, (wls) Q2, kyVar2);
                f530 e2 = ljs0.e(ljs0.c(f530Var4, 1.0f), 48.0f);
                int i11 = 4;
                boolean z2 = (i8 & 14) == 4;
                Object Q3 = btsVar2.Q();
                if (z2 || Q3 == o430Var) {
                    Q3 = new h0(str, i11);
                    btsVar2.o0(Q3);
                }
                f530 b = fnq0.b(e2, false, (tls) Q3);
                byk0 b2 = ((YandexShapes) btsVar2.m(qm51.a)).b();
                long g = ((el51) btsVar2.m(gl51.a)).g();
                String str9 = kyVar.a;
                uo5 uo5Var = x4c.x;
                ky kyVar5 = kyVar2;
                boolean e3 = btsVar2.e(lhgVar2) | (i10 == 2048) | btsVar2.e(obj6) | ((i8 & 112) == 32);
                Object Q4 = btsVar2.Q();
                if (e3 || Q4 == o430Var) {
                    lhgVar = lhgVar2;
                    str6 = str9;
                    String str10 = str3;
                    z = true;
                    sq0Var = new sq0(lhgVar, str10, obj6, kyVar, 0);
                    str7 = str10;
                    obj5 = obj6;
                    btsVar2.o0(sq0Var);
                } else {
                    sq0Var = Q4;
                    obj5 = obj6;
                    str6 = str9;
                    lhgVar = lhgVar2;
                    str7 = str3;
                    z = true;
                }
                btsVar = btsVar2;
                ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) sq0Var, b, b2, g, 0L, null, null, null, true, str6, uo5Var, null, wwg.S(1181359541, z, new vg0(kyVar5, str, lhgVar, str5, obj4, 1), btsVar2), btsVar, 0, 390, 2288);
                f530Var3 = f530Var4;
                str4 = str7;
                obj3 = obj5;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new tq0(str, kyVar, f530Var3, str4, obj3, aa01Var, i, i2);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (btsVar2.V(i7 & 1, (74899 & i7) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(v4v v4vVar, wsy0 wsy0Var, fid fidVar, int i) {
        int i2;
        boolean z;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1184129152);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(v4vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wsy0Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            if (v4vVar == null) {
                btsVar.e0(1832702847);
                btsVar.t(false);
            } else {
                btsVar.e0(1832702848);
                s3b1.f(v4vVar, tra1.b(ljs0.v(an91.o(c530Var, 0.0f, 0.0f, 10.0f, 0.0f, 11), null, 3), 1.0f), null, btsVar, 48, 4);
                btsVar.t(false);
            }
            if (wsy0Var == null) {
                btsVar.e0(1832947654);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(1832947655);
                z = true;
                String str = wsy0Var.a;
                long E = uh6.E(19);
                lzr lzrVar = wsy0Var.b;
                long j2 = wsy0Var.d;
                int i3 = wsy0Var.c;
                ldc ldcVar = wsy0Var.f;
                if (ldcVar == null) {
                    btsVar.e0(822397474);
                    j = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(false);
                } else {
                    btsVar.e0(822396389);
                    btsVar.t(false);
                    j = ldcVar.a;
                }
                ymb1.e(str, null, j, null, lzrVar, new hzr(i3), j2, E, 0L, null, 0, false, 0, null, null, btsVar, 12582912, 0, 65290);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(v4vVar, wsy0Var, i, 13);
        }
    }

    public static final void c(wsy0 wsy0Var, wsy0 wsy0Var2, wsy0 wsy0Var3, v4v v4vVar, wsy0 wsy0Var4, CouponSize couponSize, hoj hojVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-160535274);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(wsy0Var) ? 4 : 2) | (btsVar.k(wsy0Var2) ? 32 : 16) | (btsVar.k(wsy0Var3) ? 256 : 128) | (btsVar.k(v4vVar) ? 2048 : 1024) | (btsVar.k(wsy0Var4) ? 16384 : 8192) | (btsVar.c(couponSize.ordinal()) ? 131072 : 65536) | (btsVar.k(hojVar) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (599187 & i2) != 599186)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.g, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            f530 o2 = an91.o(n.d(btsVar, d, wlsVar4, 1.0f, false), 12.0f, 12.0f, 12.0f, 0.0f, 8);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(new y7m(0.0f));
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            boolean k = btsVar.k(fwiVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ooi(fwiVar, oz40Var, 1);
                btsVar.o0(Q2);
            }
            e(xm91.b(c530Var, (tls) Q2), wsy0Var, wsy0Var2, wsy0Var3, couponSize, btsVar, ((i2 << 3) & 8176) | (57344 & (i2 >> 3)));
            btsVar = btsVar;
            float f = 55.0f - ((y7m) oz40Var.getValue()).a;
            float f2 = f >= 0.0f ? f : 0.0f;
            if (v4vVar == null && wsy0Var4 == null) {
                btsVar.e0(-593192174);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-593462649);
                int i3 = moj.a[couponSize.ordinal()];
                if (i3 == 1) {
                    btsVar.e0(-573331733);
                    z = true;
                    oeb1.c(btsVar, new x2y(1.0f, true));
                    btsVar.t(false);
                } else {
                    if (i3 != 2) {
                        throw unr0.y(-573333285, btsVar, false);
                    }
                    tse0.s(btsVar, -573327072, c530Var, f2, btsVar);
                    btsVar.t(false);
                    z = true;
                }
                btsVar.t(false);
            }
            b(v4vVar, wsy0Var4, btsVar, (i2 >> 9) & HProv.PP_DELETE_SAVED_PASSWD);
            ly3.B(c530Var, 12.0f, btsVar, z);
            if (hojVar instanceof hoj) {
                btsVar.e0(346809840);
                ru.yandex.taxi.logistics.sdk.mission_details.ui.a.a(hojVar.a, new pa31(x4c.E), ProgressBarSize.S, btsVar, 384, 0);
                btsVar.t(false);
            } else {
                btsVar.e0(347053190);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new et0(wsy0Var, wsy0Var2, wsy0Var3, v4vVar, wsy0Var4, couponSize, hojVar, i, 6);
        }
    }

    public static final void d(foj fojVar, fid fidVar, int i) {
        bts btsVar;
        f530 e;
        f530 f530Var;
        long j;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1633799512);
        int i2 = (btsVar2.k(fojVar) ? 4 : 2) | i;
        int i3 = 1;
        int i4 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            CouponSize couponSize = fojVar.h;
            ky kyVar = fojVar.d;
            int i5 = moj.a[couponSize.ordinal()];
            c530 c530Var = c530.a;
            if (i5 == 1) {
                e = ljs0.e(an91.m(c530Var, 8.0f, 0.0f, 2), 246.0f);
            } else {
                if (i5 != 2) {
                    w511.b();
                    return;
                }
                e = an91.m(c530Var, 8.0f, 0.0f, 2);
            }
            lhg lhgVar = (lhg) btsVar2.m(mhg.a);
            int i6 = i2 & 14;
            boolean e2 = btsVar2.e(lhgVar) | (i6 == 4);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (e2 || Q == o430Var) {
                Q = new DiscountCouponsListWidgetKt$DiscountCoupon$1$1(lhgVar, fojVar, null);
                btsVar2.o0(Q);
            }
            zpn.e(btsVar2, (wls) Q, fojVar);
            boolean z = kyVar != null;
            byk0 b = ((YandexShapes) btsVar2.m(qm51.a)).b();
            long c = ((el51) btsVar2.m(gl51.a)).c();
            w3b1 w3b1Var = fojVar.g;
            ldc b2 = w3b1Var != null ? w3b1Var.b() : null;
            if (b2 == null) {
                btsVar2.e0(1876721903);
                f530Var = e;
                j = ((ldc) btsVar2.m(srk0.a)).a;
                btsVar2.t(false);
            } else {
                f530Var = e;
                btsVar2.e0(1876720167);
                btsVar2.t(false);
                j = b2.a;
            }
            String str = kyVar != null ? kyVar.a : null;
            boolean e3 = (i6 == 4) | btsVar2.e(lhgVar);
            Object Q2 = btsVar2.Q();
            if (e3 || Q2 == o430Var) {
                Q2 = new ymj(i3, fojVar, lhgVar);
                btsVar2.o0(Q2);
            }
            f530 f530Var2 = f530Var;
            btsVar = btsVar2;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, f530Var2, b, c, j, null, null, null, z, str, null, null, wwg.S(-2004423833, true, new koj(fojVar, i4), btsVar2), btsVar, 0, 384, 3296);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new loj(fojVar, i, 0);
        }
    }

    public static final void e(f530 f530Var, wsy0 wsy0Var, wsy0 wsy0Var2, wsy0 wsy0Var3, CouponSize couponSize, fid fidVar, int i) {
        int i2;
        bts btsVar;
        int i3;
        f530 f530Var2;
        long j;
        oz40 oz40Var;
        c530 c530Var;
        int i4;
        oz40 oz40Var2;
        float f;
        boolean z;
        int i5;
        c530 c530Var2;
        oz40 oz40Var3;
        long j2;
        long j3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(232334513);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(wsy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.k(wsy0Var2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(wsy0Var3) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.c(couponSize.ordinal()) ? 16384 : 8192;
        }
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            int i6 = moj.a[couponSize.ordinal()];
            if (i6 == 1) {
                i3 = 10;
            } else {
                if (i6 != 2) {
                    w511.b();
                    return;
                }
                i3 = 8;
            }
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
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(new y7m(0.0f));
                btsVar2.o0(Q);
            }
            oz40 oz40Var4 = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(new y7m(0.0f));
                btsVar2.o0(Q2);
            }
            oz40 oz40Var5 = (oz40) Q2;
            c530 c530Var3 = c530.a;
            if (wsy0Var == null) {
                btsVar2.e0(-1506715375);
                btsVar2.t(false);
                btsVar = btsVar2;
                i4 = i3;
                oz40Var2 = oz40Var4;
                z = false;
                f = 0.0f;
                oz40Var = oz40Var5;
                c530Var = c530Var3;
                i5 = 3;
            } else {
                btsVar2.e0(-1506715374);
                boolean k = btsVar2.k(fwiVar);
                Object Q3 = btsVar2.Q();
                if (k || Q3 == o430Var) {
                    Q3 = new ooi(fwiVar, oz40Var4, 2);
                    btsVar2.o0(Q3);
                }
                f530 b = xm91.b(c530Var3, (tls) Q3);
                String str = wsy0Var.a;
                lzr lzrVar = wsy0Var.b;
                long j4 = wsy0Var.d;
                int i7 = wsy0Var.c;
                long w = uh6.w(-0.01d);
                ldc ldcVar = wsy0Var.f;
                if (ldcVar == null) {
                    btsVar2.e0(-455954156);
                    j = ((el51) btsVar2.m(gl51.a)).n();
                    btsVar2.t(false);
                    f530Var2 = b;
                } else {
                    f530Var2 = b;
                    btsVar2.e0(-455955334);
                    btsVar2.t(false);
                    j = ldcVar.a;
                }
                oz40Var = oz40Var5;
                c530Var = c530Var3;
                i4 = i3;
                oz40Var2 = oz40Var4;
                f = 0.0f;
                z = false;
                ymb1.e(str, f530Var2, j, null, lzrVar, new hzr(i7), j4, 0L, w, null, 0, false, 3, null, g(((zm51) btsVar2.m(an51.a)).f), btsVar2, 0, HProv.ALG_TYPE_SECURECHANNEL, 24200);
                i5 = 3;
                btsVar = btsVar2;
                btsVar.t(false);
            }
            if (wsy0Var2 == null) {
                btsVar.e0(-1506022556);
                btsVar.t(z);
                oz40Var3 = oz40Var;
                c530Var2 = c530Var;
            } else {
                long j5 = wsy0Var2.d;
                btsVar.e0(-1506022555);
                float c = ((y7m) oz40Var2.getValue()).a - ((float) (sty0.c(j5) * 0.2d));
                float f2 = c < f ? f : c;
                oz40Var.setValue(new y7m(sty0.c(j5) + i4 + f2));
                c530 c530Var4 = c530Var;
                f530 o2 = an91.o(c530Var4, 0.0f, f2, 0.0f, 0.0f, 13);
                c530Var2 = c530Var4;
                String str2 = wsy0Var2.a;
                lzr lzrVar2 = wsy0Var2.b;
                long j6 = wsy0Var2.d;
                int i8 = wsy0Var2.c;
                ldc ldcVar2 = wsy0Var2.f;
                if (ldcVar2 == null) {
                    btsVar.e0(1215255133);
                    j2 = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(z);
                    oz40Var3 = oz40Var;
                } else {
                    btsVar.e0(1215254048);
                    btsVar.t(z);
                    oz40Var3 = oz40Var;
                    j2 = ldcVar2.a;
                }
                bts btsVar3 = btsVar;
                ymb1.i(str2, o2, j2, lzrVar2, new hzr(i8), j6, 0L, 0L, 0, false, 1, null, g(((zm51) btsVar.m(an51.a)).a), btsVar3, 0, HProv.ALG_TYPE_SECURECHANNEL, 24456);
                btsVar = btsVar3;
                btsVar.t(z);
            }
            if (wsy0Var3 == null) {
                btsVar.e0(-1505287639);
                btsVar.t(z);
            } else {
                btsVar.e0(-1505287638);
                float max = Math.max(((y7m) oz40Var2.getValue()).a, ((y7m) oz40Var3.getValue()).a);
                f530 o3 = an91.o(c530Var2, 0.0f, (float) (max > f ? max - (sty0.c(wsy0Var3.d) * 0.2d) : 0.0d), 0.0f, 0.0f, 13);
                String str3 = wsy0Var3.a;
                lzr lzrVar3 = wsy0Var3.b;
                long j7 = wsy0Var3.d;
                int i9 = wsy0Var3.c;
                ldc ldcVar3 = wsy0Var3.f;
                if (ldcVar3 == null) {
                    btsVar.e0(1080671996);
                    j3 = ((el51) btsVar.m(gl51.a)).n();
                    btsVar.t(z);
                } else {
                    btsVar.e0(1080670911);
                    btsVar.t(z);
                    j3 = ldcVar3.a;
                }
                bts btsVar4 = btsVar;
                ymb1.f(str3, o3, j3, null, lzrVar3, new hzr(i9), j7, 0L, 0L, null, 0, false, i5, null, g(((zm51) btsVar.m(an51.a)).g), btsVar4, 0, HProv.ALG_TYPE_SECURECHANNEL, 24456);
                btsVar = btsVar4;
                btsVar.t(z);
            }
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var, (Object) wsy0Var, (Object) wsy0Var2, (Object) wsy0Var3, (Object) couponSize, i, 13);
        }
    }

    public static final void f(f530 f530Var, final wsy0 wsy0Var, final long j, final wsy0 wsy0Var2, final long j2, final ky kyVar, final v4v v4vVar, final ome omeVar, final String str, final Object obj, fid fidVar, final int i) {
        final String str2;
        final f530 f530Var2;
        f530 f530Var3;
        f530 f530Var4;
        char c;
        final lhg lhgVar;
        Object obj2 = obj;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1919088068);
        int i2 = i | 6 | (btsVar.k(wsy0Var) ? 32 : 16) | (btsVar.d(j) ? 256 : 128) | (btsVar.k(wsy0Var2) ? 2048 : 1024) | (btsVar.d(j2) ? 16384 : 8192) | (btsVar.k(kyVar) ? 131072 : 65536) | (btsVar.k(v4vVar) ? 1048576 : 524288) | (btsVar.k(omeVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.k(str) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.e(obj2) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar.V(i2 & 1, (306783379 & i2) != 306783378)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = c530.a;
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
            }
            btsVar.u();
            lhg lhgVar2 = (lhg) btsVar.m(mhg.a);
            f530 e = ljs0.e(ljs0.c(an91.n(f530Var3, 8.0f, 4.0f, 8.0f, 4.0f), 1.0f), 56.0f);
            byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
            long j3 = ldc.l;
            String str3 = kyVar.a;
            int i3 = i2 & 234881024;
            boolean e2 = btsVar.e(lhgVar2) | (i3 == 67108864) | btsVar.e(obj2) | ((i2 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e2 || Q == o430Var) {
                f530Var4 = f530Var3;
                c = 0;
                sq0 sq0Var = new sq0(lhgVar2, str, obj2, kyVar, 2);
                lhgVar = lhgVar2;
                btsVar.o0(sq0Var);
                Q = sq0Var;
            } else {
                lhgVar = lhgVar2;
                c = 0;
                f530Var4 = f530Var3;
            }
            lhg lhgVar3 = lhgVar;
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q, e, b, j3, 0L, null, null, null, true, str3, null, null, wwg.S(1928608699, true, new zls() { // from class: bof0
                @Override // defpackage.zls
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    a S;
                    fid fidVar2 = (fid) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        btsVar2.e0(1404305332);
                        lhg lhgVar4 = lhgVar;
                        boolean e3 = btsVar2.e(lhgVar4);
                        String str4 = str;
                        boolean k = e3 | btsVar2.k(str4);
                        Object obj6 = obj;
                        boolean e4 = k | btsVar2.e(obj6);
                        ky kyVar2 = ky.this;
                        boolean k2 = e4 | btsVar2.k(kyVar2);
                        Object Q2 = btsVar2.Q();
                        if (k2 || Q2 == did.a) {
                            vqy vqyVar = new vqy(lhgVar4, str4, obj6, kyVar2, 20);
                            btsVar2.o0(vqyVar);
                            Q2 = vqyVar;
                        }
                        f530 b2 = fnq0.b(c530.a, false, (tls) Q2);
                        btsVar2.t(false);
                        v4v v4vVar2 = v4vVar;
                        if (v4vVar2 == null) {
                            btsVar2.e0(1404713291);
                            btsVar2.t(false);
                            S = null;
                        } else {
                            btsVar2.e0(1404713292);
                            S = wwg.S(454889874, true, new mb(v4vVar2, 18), btsVar2);
                            btsVar2.t(false);
                        }
                        a aVar = S;
                        a S2 = wwg.S(-912484521, true, new vk4(wsy0Var, wsy0Var2, j, j2), btsVar2);
                        ome omeVar2 = omeVar;
                        web1.c(b2, 56.0f, false, 0.0f, null, aVar, S2, null, null, wwg.S(-162180684, true, new nau(kyVar2, omeVar2), btsVar2), null, omeVar2 == null ? oa01.a : oa01.c, false, btsVar2, 806879232, 0, 5532);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 384, 3312);
            obj2 = obj;
            boolean e3 = btsVar.e(lhgVar3) | (i3 == 67108864) | btsVar.e(obj2);
            Object Q2 = btsVar.Q();
            if (e3 || Q2 == o430Var) {
                str2 = str;
                Q2 = new PromoKt$Promo$3$1(lhgVar3, str2, obj2, null);
                btsVar.o0(Q2);
            } else {
                str2 = str;
            }
            zpn.e(btsVar, (wls) Q2, zy11.a);
            f530Var2 = f530Var4;
        } else {
            str2 = str;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final Object obj3 = obj2;
            v.d = new wls(wsy0Var, j, wsy0Var2, j2, kyVar, v4vVar, omeVar, str2, obj3, i) { // from class: cof0
                public final /* synthetic */ ome A;
                public final /* synthetic */ String B;
                public final /* synthetic */ Object C;
                public final /* synthetic */ wsy0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ wsy0 w;
                public final /* synthetic */ long x;
                public final /* synthetic */ ky y;
                public final /* synthetic */ v4v z;

                @Override // defpackage.wls
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int O = vng.O(1);
                    ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a.f(f530.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj4, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final ety0 g(ety0 ety0Var) {
        return ety0Var.d(new ety0(0L, 0L, null, null, null, null, 0L, 0, 0L, new iwc0(false), new ehy(bhy.b, 17, 0), 15204351));
    }
}
