package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.music.core.ui.compose.b;
import java.text.DecimalFormat;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class zo1 {
    public static final float a = 117;

    public static final void a(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-914013680);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
        } else {
            i3 = i4 | (oq5Var.g(z) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z2 = i5 != 0 ? true : z;
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i6 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i7 = (i3 >> 3) & 14;
            ivf.k(i7, 0, oq5Var, xp3.u(androidx.compose.foundation.layout.a.d(d.d(vciVar, 1.0f), 1.0f), ugo.a), z2);
            u1g.l(oq5Var, d.e(vciVar, 8));
            int i8 = 48 | i7;
            ivf.l(z2, d.r(vciVar, 32), nu0.j(), oq5Var, i8, 0);
            ivf.l(z2, d.r(vciVar, 92), nu0.j(), oq5Var, i8, 0);
            ivf.l(z2, d.r(vciVar, 72), nu0.i(), oq5Var, i8, 0);
            oq5Var.p(true);
            z = z2;
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(yciVar, z, i, i2);
        }
    }

    public static final void b(bp1 bp1Var, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        bp1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2016772649);
        int i2 = (oq5Var.h(bp1Var) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            aqi O = gld.O(bp1Var.c, oq5Var);
            q0k a2 = androidx.compose.foundation.layout.a.a(8, 0.0f, 2);
            boolean f = oq5Var.f(O) | oq5Var.h(bp1Var);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new kc(23, O, bp1Var);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            weo.h(yciVar2, null, a2, null, null, null, false, (Function1) K, oq5Var, ((i2 >> 3) & 14) | 384, 250);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(bp1Var, yciVar2, i, 29);
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1941997427);
        if (((i | 6) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f = a;
            vci vciVar = vci.a;
            float f2 = 8;
            yci o = androidx.compose.foundation.layout.a.o(d.r(vciVar, f), f2, 0.0f, 2);
            q0k a2 = androidx.compose.foundation.layout.a.a(f2, 0.0f, 2);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ci1(24);
                oq5Var.k0(K);
            }
            weo.h(o, null, a2, null, null, null, false, (Function1) K, oq5Var, 100663680, 250);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(so1 so1Var, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function03;
        long f;
        String format;
        int i4;
        kb5 kb5Var;
        boolean booleanValue;
        Function0 function04;
        kb5 kb5Var2;
        u51 u51Var;
        kb5 kb5Var3;
        vci vciVar;
        kb5 kb5Var4;
        grb grbVar;
        kb5 kb5Var5;
        oq5 oq5Var;
        int i5;
        oq5 oq5Var2;
        kf4 kf4Var;
        boolean z;
        int i6;
        boolean f2;
        Object K;
        oq5 oq5Var3;
        Function0 function05;
        xmn r;
        so1Var.getClass();
        function0.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-1056068420);
        if ((i & 6) == 0) {
            i3 = (oq5Var4.h(so1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var4.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var4.f(yciVar) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function03 = function02;
            i3 |= oq5Var4.h(function03) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !oq5Var4.z()) {
                Function0 function06 = i7 == 0 ? null : function03;
                oq5Var4.Z(-1269463672);
                long j = so1Var.d;
                u51 u51Var2 = so1Var.a;
                f = nsa.f(j) / 60000;
                if (f > 45) {
                    format = String.format("%d %s", Arrays.copyOf(new Object[]{Long.valueOf(f), gdg.K(oq5Var4).getQuantityString(R.plurals.number_of_minutes, (int) f)}, 2));
                } else {
                    double c = eeh.c(f / 30.0d) * 0.5d;
                    format = String.format("%s %s", Arrays.copyOf(new Object[]{new DecimalFormat("#.#").format(c), gdg.K(oq5Var4).getQuantityString(R.plurals.number_of_hours, (int) (c + 0.5d))}, 2));
                }
                String str = format;
                oq5Var4.p(false);
                yci i8 = androidx.compose.foundation.a.i(yciVar, null, irf.S(function06, oq5Var4, (i3 >> 9) & 14), function0, 47);
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var4, 48);
                i4 = oq5Var4.P;
                a l = oq5Var4.l();
                yci H = vnj.H(oq5Var4, i8);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.n0();
                } else {
                    oq5Var4.k(grbVar2);
                }
                kb5 kb5Var6 = wp5.f;
                g0g.U(oq5Var4, a2, kb5Var6);
                kb5 kb5Var7 = wp5.e;
                g0g.U(oq5Var4, l, kb5Var7);
                kb5Var = wp5.g;
                if (!oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var4, i4, kb5Var);
                }
                kb5 kb5Var8 = wp5.d;
                g0g.U(oq5Var4, H, kb5Var8);
                booleanValue = ((Boolean) oq5Var4.j(koe.a)).booleanValue();
                vci vciVar2 = vci.a;
                if (booleanValue) {
                    oq5Var4.Z(471961379);
                    function04 = function06;
                    kb5Var2 = kb5Var8;
                    u51Var = u51Var2;
                    kb5Var3 = kb5Var7;
                    vciVar = vciVar2;
                    kb5Var4 = kb5Var;
                    grbVar = grbVar2;
                    kb5Var5 = kb5Var6;
                    p1g.a(kg5.M(u51Var2.c, WebPath$Storage.AVATARS).getPathForSize(wct.s()), null, androidx.compose.ui.platform.a.a(xp3.u(androidx.compose.foundation.layout.a.d(d.d(vciVar2, 1.0f), 1.0f), ugo.a), "artist_top_cover"), null, null, null, null, 0.0f, null, 0, oq5Var4, 48, 1016);
                    oq5Var = oq5Var4;
                    oq5Var.p(false);
                } else {
                    oq5Var4.Z(471700576);
                    ug3.a(androidx.compose.foundation.a.b(xp3.u(androidx.compose.foundation.layout.a.d(d.d(vciVar2, 1.0f), 1.0f), ugo.a), ((dq0) oq5Var4.j(eq0.a)).a.a, vnj.i), oq5Var4, 0);
                    oq5Var4.p(false);
                    function04 = function06;
                    u51Var = u51Var2;
                    kb5Var3 = kb5Var7;
                    vciVar = vciVar2;
                    kb5Var4 = kb5Var;
                    kb5Var5 = kb5Var6;
                    kb5Var2 = kb5Var8;
                    oq5Var = oq5Var4;
                    grbVar = grbVar2;
                }
                u1g.l(oq5Var, d.e(vciVar, 8));
                yci g = d.g(vciVar, 20, 0.0f, 2);
                hz2 hz2Var = b2c.l;
                x2i x2iVar = qx0.a;
                nho a3 = lho.a(x2iVar, hz2Var, oq5Var, 48);
                i5 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, g);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var5);
                g0g.U(oq5Var, l2, kb5Var3);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var4);
                }
                kb5 kb5Var9 = kb5Var2;
                g0g.U(oq5Var, H2, kb5Var9);
                String valueOf = String.valueOf(so1Var.c);
                ges j2 = nu0.j();
                agr agrVar = eq0.a;
                oq5Var2 = oq5Var;
                kb5 kb5Var10 = kb5Var4;
                kb5 kb5Var11 = kb5Var5;
                kb5 kb5Var12 = kb5Var3;
                xcs.b(valueOf, androidx.compose.ui.platform.a.a(vciVar, "artist_top_position"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j2, oq5Var2, 48, 0, 65528);
                kf4Var = so1Var.b;
                if (kf4Var != null) {
                    oq5Var2.Z(-918472044);
                    z = false;
                } else {
                    z = false;
                    oq5Var2.Z(-918472043);
                    leu.e(kf4Var, b.c(androidx.compose.ui.platform.a.a(vciVar, "artist_top_progress"), "artist_top_progress_state", kf4Var), oq5Var2, 0);
                }
                oq5Var2.p(z);
                oq5Var2.p(true);
                float f3 = 2;
                u1g.l(oq5Var2, d.e(vciVar, f3));
                xcs.b(u51Var.b, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "artist_top_name"), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 48, 3120, 54776);
                u1g.l(oq5Var2, d.e(vciVar, f3));
                nho a4 = lho.a(x2iVar, hz2Var, oq5Var2, 48);
                i6 = oq5Var2.P;
                a l3 = oq5Var2.l();
                yci H3 = vnj.H(oq5Var2, vciVar);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.n0();
                } else {
                    oq5Var2.k(grbVar);
                }
                g0g.U(oq5Var2, a4, kb5Var11);
                g0g.U(oq5Var2, l3, kb5Var12);
                if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var2, i6, kb5Var10);
                }
                g0g.U(oq5Var2, H3, kb5Var9);
                String N = rvf.N(R.string.player_progress_description, new Object[]{str}, oq5Var2);
                ges i9 = nu0.i();
                long j3 = ((dq0) oq5Var2.j(agrVar)).b.b;
                f2 = oq5Var2.f(N);
                K = oq5Var2.K();
                if (!f2 || K == gq5.a) {
                    K = new wq(N, 4);
                    oq5Var2.k0(K);
                }
                xcs.b(str, nfp.a(vciVar, (Function1) K), j3, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i9, oq5Var2, 0, 3120, 55288);
                oq5Var3 = oq5Var2;
                oq5Var3.p(true);
                oq5Var3.p(true);
                function05 = function04;
            } else {
                oq5Var4.S();
                oq5Var3 = oq5Var4;
                function05 = function03;
            }
            r = oq5Var3.r();
            if (r == null) {
                r.d = new hq(so1Var, function0, yciVar, function05, i, i2, 4);
                return;
            }
            return;
        }
        function03 = function02;
        if ((i3 & 1171) == 1170) {
        }
        if (i7 == 0) {
        }
        oq5Var4.Z(-1269463672);
        long j4 = so1Var.d;
        u51 u51Var22 = so1Var.a;
        f = nsa.f(j4) / 60000;
        if (f > 45) {
        }
        String str2 = format;
        oq5Var4.p(false);
        yci i82 = androidx.compose.foundation.a.i(yciVar, null, irf.S(function06, oq5Var4, (i3 >> 9) & 14), function0, 47);
        ta5 a22 = sa5.a(qx0.c, b2c.o, oq5Var4, 48);
        i4 = oq5Var4.P;
        a l4 = oq5Var4.l();
        yci H4 = vnj.H(oq5Var4, i82);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var4.d0();
        if (oq5Var4.O) {
        }
        kb5 kb5Var62 = wp5.f;
        g0g.U(oq5Var4, a22, kb5Var62);
        kb5 kb5Var72 = wp5.e;
        g0g.U(oq5Var4, l4, kb5Var72);
        kb5Var = wp5.g;
        if (!oq5Var4.O) {
        }
        ouj.x(i4, oq5Var4, i4, kb5Var);
        kb5 kb5Var82 = wp5.d;
        g0g.U(oq5Var4, H4, kb5Var82);
        booleanValue = ((Boolean) oq5Var4.j(koe.a)).booleanValue();
        vci vciVar22 = vci.a;
        if (booleanValue) {
        }
        u1g.l(oq5Var, d.e(vciVar, 8));
        yci g2 = d.g(vciVar, 20, 0.0f, 2);
        hz2 hz2Var2 = b2c.l;
        x2i x2iVar2 = qx0.a;
        nho a32 = lho.a(x2iVar2, hz2Var2, oq5Var, 48);
        i5 = oq5Var.P;
        a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, g2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a32, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var3);
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var4);
        kb5 kb5Var92 = kb5Var2;
        g0g.U(oq5Var, H22, kb5Var92);
        String valueOf2 = String.valueOf(so1Var.c);
        ges j22 = nu0.j();
        agr agrVar2 = eq0.a;
        oq5Var2 = oq5Var;
        kb5 kb5Var102 = kb5Var4;
        kb5 kb5Var112 = kb5Var5;
        kb5 kb5Var122 = kb5Var3;
        xcs.b(valueOf2, androidx.compose.ui.platform.a.a(vciVar, "artist_top_position"), ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j22, oq5Var2, 48, 0, 65528);
        kf4Var = so1Var.b;
        if (kf4Var != null) {
        }
        oq5Var2.p(z);
        oq5Var2.p(true);
        float f32 = 2;
        u1g.l(oq5Var2, d.e(vciVar, f32));
        xcs.b(u51Var.b, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "artist_top_name"), ((dq0) oq5Var2.j(agrVar2)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 48, 3120, 54776);
        u1g.l(oq5Var2, d.e(vciVar, f32));
        nho a42 = lho.a(x2iVar2, hz2Var2, oq5Var2, 48);
        i6 = oq5Var2.P;
        a l32 = oq5Var2.l();
        yci H32 = vnj.H(oq5Var2, vciVar);
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, a42, kb5Var112);
        g0g.U(oq5Var2, l32, kb5Var122);
        if (!oq5Var2.O) {
        }
        ouj.x(i6, oq5Var2, i6, kb5Var102);
        g0g.U(oq5Var2, H32, kb5Var92);
        String N2 = rvf.N(R.string.player_progress_description, new Object[]{str2}, oq5Var2);
        ges i92 = nu0.i();
        long j32 = ((dq0) oq5Var2.j(agrVar2)).b.b;
        f2 = oq5Var2.f(N2);
        K = oq5Var2.K();
        if (!f2) {
        }
        K = new wq(N2, 4);
        oq5Var2.k0(K);
        xcs.b(str2, nfp.a(vciVar, (Function1) K), j32, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, i92, oq5Var2, 0, 3120, 55288);
        oq5Var3 = oq5Var2;
        oq5Var3.p(true);
        oq5Var3.p(true);
        function05 = function04;
        r = oq5Var3.r();
        if (r == null) {
        }
    }
}
