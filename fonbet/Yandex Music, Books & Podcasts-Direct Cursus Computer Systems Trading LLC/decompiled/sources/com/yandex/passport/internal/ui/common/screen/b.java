package com.yandex.passport.internal.ui.common.screen;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.R;
import defpackage.a0g;
import defpackage.agr;
import defpackage.b2c;
import defpackage.fae;
import defpackage.ff7;
import defpackage.g0g;
import defpackage.gct;
import defpackage.gq5;
import defpackage.grb;
import defpackage.gut;
import defpackage.gz2;
import defpackage.hq5;
import defpackage.i95;
import defpackage.ild;
import defpackage.j95;
import defpackage.kb5;
import defpackage.lho;
import defpackage.mf3;
import defpackage.nho;
import defpackage.o9s;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.p91;
import defpackage.qld;
import defpackage.qx0;
import defpackage.rdt;
import defpackage.rh1;
import defpackage.rvf;
import defpackage.sa5;
import defpackage.ta5;
import defpackage.u1g;
import defpackage.ugo;
import defpackage.uu0;
import defpackage.uwf;
import defpackage.vav;
import defpackage.vci;
import defpackage.vdt;
import defpackage.vnj;
import defpackage.w4k;
import defpackage.wa5;
import defpackage.wcs;
import defpackage.wp5;
import defpackage.xmn;
import defpackage.xp5;
import defpackage.yci;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(String str, String str2, String str3, Throwable th, yci yciVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        boolean z;
        Object rh1Var;
        int i3;
        int i4;
        boolean z2;
        vci vciVar;
        String str4;
        vci vciVar2;
        float f;
        agr agrVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-155821276);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(th) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = 16;
            yci t = androidx.compose.foundation.layout.d.t(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(yciVar, uwf.r(oq5Var).I, ugo.a(f2)), f2, 8, f2, f2), 0.0f, 360, 1);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, t);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            String str5 = "Error(" + th.getMessage() + ')';
            vci vciVar3 = vci.a;
            yci d = androidx.compose.foundation.layout.d.d(vciVar3, 1.0f);
            nho a2 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            String M = rvf.M(R.string.passport_error_slab_hint_text, oq5Var);
            agr agrVar2 = vdt.a;
            wcs.b(M, null, uwf.r(oq5Var).f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var.j(agrVar2)).l, oq5Var, 0, 0, 65530);
            int i7 = i2 & 14;
            boolean f3 = ((i2 & 896) == 256) | ((458752 & i2) == 131072) | (i7 == 4) | oq5Var.f(str5) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (f3 || K == gq5.a) {
                z = true;
                i3 = 4;
                i4 = i2;
                z2 = false;
                vciVar = vciVar3;
                rh1Var = new rh1(function1, str3, str, str5, str2, 13);
                str4 = str5;
                oq5Var.k0(rh1Var);
            } else {
                z = true;
                i4 = i2;
                z2 = false;
                str4 = str5;
                i3 = 4;
                rh1Var = K;
                vciVar = vciVar3;
            }
            vci vciVar4 = vciVar;
            boolean z3 = z2;
            ff7.n((Function0) rh1Var, null, false, null, a.a, oq5Var, 196608, 30);
            oq5Var.p(z);
            wcs.b(str3, null, uwf.r(oq5Var).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var.j(agrVar2)).l, oq5Var, (i4 >> 6) & 14, 0, 65530);
            oq5 oq5Var2 = oq5Var;
            float f4 = i3;
            u1g.l(oq5Var2, androidx.compose.foundation.layout.d.m(vciVar4, f4));
            if (str != null) {
                oq5Var2.Z(1999338811);
                agrVar = agrVar2;
                wcs.b(str, null, uwf.r(oq5Var2).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var2.j(agrVar2)).l, oq5Var2, i7, 0, 65530);
                oq5Var2 = oq5Var2;
                f = f4;
                vciVar2 = vciVar4;
                u1g.l(oq5Var2, androidx.compose.foundation.layout.d.m(vciVar2, f));
                z3 = false;
            } else {
                vciVar2 = vciVar4;
                f = f4;
                agrVar = agrVar2;
                oq5Var2.Z(1993514996);
            }
            oq5Var2.p(z3);
            agr agrVar3 = agrVar;
            oq5 oq5Var3 = oq5Var2;
            wcs.b(str4, null, uwf.r(oq5Var2).a, 0L, null, 0L, null, 0L, 0, false, 3, 0, ((rdt) oq5Var2.j(agrVar3)).l, oq5Var3, 0, 3072, 57338);
            u1g.l(oq5Var3, androidx.compose.foundation.layout.d.m(vciVar2, f));
            wcs.b(str2, null, uwf.r(oq5Var3).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((rdt) oq5Var3.j(agrVar3)).l, oq5Var3, (i4 >> 3) & 14, 0, 65530);
            oq5Var = oq5Var3;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(str, str2, str3, th, yciVar, function1, i, 22);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if ((r35 & 16) != 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(boolean z, Function0 function0, yci yciVar, String str, String str2, hq5 hq5Var, int i, int i2) {
        int i3;
        String str3;
        int i4;
        String str4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-726448797);
        if ((i & 6) == 0) {
            i3 = i | (oq5Var.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i8 = i3 | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 8) == 0) {
            str3 = str;
            if (oq5Var.f(str3)) {
                i4 = 2048;
                int i9 = i8 | i4;
                if ((i2 & 16) != 0) {
                    str4 = str2;
                    if (oq5Var.f(str4)) {
                        i5 = 16384;
                        i6 = i9 | i5;
                        if ((i6 & 9363) == 9362 || !oq5Var.z()) {
                            oq5Var.U();
                            if ((i & 1) != 0 || oq5Var.y()) {
                                if ((i2 & 8) != 0) {
                                    str3 = rvf.M(R.string.passport_webview_unexpected_error_text, oq5Var);
                                    i6 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    str4 = rvf.M(R.string.passport_webview_cancel_button_text, oq5Var);
                                    i6 &= -57345;
                                }
                                int i10 = i6;
                                String str5 = str3;
                                String str6 = str4;
                                oq5Var.q();
                                ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                                i7 = oq5Var.P;
                                androidx.compose.runtime.internal.a l = oq5Var.l();
                                yci H = vnj.H(oq5Var, yciVar);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var.d0();
                                if (oq5Var.O) {
                                    oq5Var.k(grbVar);
                                } else {
                                    oq5Var.n0();
                                }
                                g0g.U(oq5Var, a, wp5.f);
                                g0g.U(oq5Var, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                                    ouj.x(i7, oq5Var, i7, kb5Var);
                                }
                                g0g.U(oq5Var, H, wp5.d);
                                w4k E = a0g.E(R.drawable.passport_domik_webam_unexpected_error, 0, oq5Var);
                                agr agrVar = j95.a;
                                fae.a(E, null, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 0.0f, 8, 7), ((i95) oq5Var.j(agrVar)).a, oq5Var, 432, 0);
                                wcs.b(str5, null, ((i95) oq5Var.j(agrVar)).a, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).k, oq5Var, (i10 >> 9) & 14, 0, 65018);
                                oq5Var = oq5Var;
                                if (z) {
                                    oq5Var.Z(-1667115156);
                                    boolean z3 = (i10 & 112) == 32;
                                    Object K = oq5Var.K();
                                    if (z3 || K == gq5.a) {
                                        K = new gct(29, function0);
                                        oq5Var.k0(K);
                                    }
                                    qld.u((Function0) K, null, false, null, null, null, ild.C(1984252081, new mf3(str6, 17), oq5Var), oq5Var, 805306368);
                                    oq5Var = oq5Var;
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    oq5Var.Z(-1670517623);
                                }
                                oq5Var.p(z2);
                                oq5Var.p(true);
                                str4 = str6;
                                str3 = str5;
                            } else {
                                oq5Var.S();
                                if ((i2 & 8) != 0) {
                                    i6 &= -7169;
                                }
                            }
                        } else {
                            oq5Var.S();
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new p91(z, function0, yciVar, str3, str4, i, i2);
                            return;
                        }
                        return;
                    }
                } else {
                    str4 = str2;
                }
                i5 = RemoteCameraConfig.Notification.ID;
                i6 = i9 | i5;
                if ((i6 & 9363) == 9362) {
                }
                oq5Var.U();
                if ((i & 1) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                int i102 = i6;
                String str52 = str3;
                String str62 = str4;
                oq5Var.q();
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, yciVar);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i7, oq5Var, i7, kb5Var2);
                g0g.U(oq5Var, H2, wp5.d);
                w4k E2 = a0g.E(R.drawable.passport_domik_webam_unexpected_error, 0, oq5Var);
                agr agrVar2 = j95.a;
                fae.a(E2, null, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 0.0f, 8, 7), ((i95) oq5Var.j(agrVar2)).a, oq5Var, 432, 0);
                wcs.b(str52, null, ((i95) oq5Var.j(agrVar2)).a, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).k, oq5Var, (i102 >> 9) & 14, 0, 65018);
                oq5Var = oq5Var;
                if (z) {
                }
                oq5Var.p(z2);
                oq5Var.p(true);
                str4 = str62;
                str3 = str52;
                r = oq5Var.r();
                if (r != null) {
                }
            }
        } else {
            str3 = str;
        }
        i4 = 1024;
        int i92 = i8 | i4;
        if ((i2 & 16) != 0) {
        }
        i5 = RemoteCameraConfig.Notification.ID;
        i6 = i92 | i5;
        if ((i6 & 9363) == 9362) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        int i1022 = i6;
        String str522 = str3;
        String str622 = str4;
        oq5Var.q();
        ta5 a22 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, yciVar);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var22);
        g0g.U(oq5Var, H22, wp5.d);
        w4k E22 = a0g.E(R.drawable.passport_domik_webam_unexpected_error, 0, oq5Var);
        agr agrVar22 = j95.a;
        fae.a(E22, null, androidx.compose.foundation.layout.a.q(vci.a, 0.0f, 0.0f, 0.0f, 8, 7), ((i95) oq5Var.j(agrVar22)).a, oq5Var, 432, 0);
        wcs.b(str522, null, ((i95) oq5Var.j(agrVar22)).a, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, ((rdt) oq5Var.j(vdt.a)).k, oq5Var, (i1022 >> 9) & 14, 0, 65018);
        oq5Var = oq5Var;
        if (z) {
        }
        oq5Var.p(z2);
        oq5Var.p(true);
        str4 = str622;
        str3 = str522;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void c(c cVar, Function0 function0, Function1 function1, hq5 hq5Var, int i) {
        Function0 function02;
        oq5 oq5Var;
        function0.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-256182684);
        int i2 = (oq5Var2.h(cVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= oq5Var2.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            vci vciVar = vci.a;
            yci m = androidx.compose.foundation.layout.a.m(gut.r1(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), ((i95) oq5Var2.j(j95.a)).n, vnj.i)), 16);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            yci d = androidx.compose.foundation.layout.d.d(vciVar, 1.0f);
            wa5 wa5Var = wa5.a;
            u1g.l(oq5Var2, wa5Var.b(1.0f, d, true));
            boolean z = cVar.e;
            gz2 gz2Var = b2c.o;
            int i4 = i2;
            b(z, function02, wa5Var.a(vciVar, gz2Var), null, null, oq5Var2, i2 & 112, 24);
            u1g.l(oq5Var2, wa5Var.b(1.0f, androidx.compose.foundation.layout.d.d(vciVar, 1.0f), true));
            String str = cVar.c;
            String str2 = cVar.d;
            String str3 = cVar.b;
            if (!cVar.f) {
                str3 = null;
            }
            a(str3, str, str2, cVar.a, wa5Var.a(vciVar, gz2Var), function1, oq5Var2, (i4 << 9) & 458752);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vav(cVar, function0, function1, i, 2);
        }
    }
}
