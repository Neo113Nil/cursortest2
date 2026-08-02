package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class fkq {
    public static final float a = 52;
    public static final float b = 96;

    public static final void a(wn5 wn5Var, wn5 wn5Var2, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(430074622);
        if (((i | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci k = a.k(vciVar, 0.0f, -12, 1);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, k);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(-2049217087);
            wn5Var.invoke(oq5Var, 6);
            eta.p(vciVar, 4, oq5Var, false);
            wn5Var2.invoke(oq5Var, 6);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(wn5Var, wn5Var2, yciVar2, i, 15);
        }
    }

    public static final void b(String str, int i, um0 um0Var, d85 d85Var, hq5 hq5Var, int i2) {
        long j;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(456170150);
        int i3 = i2 | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.d(i) ? 32 : 16) | (oq5Var2.d(um0Var.ordinal()) ? 256 : 128) | (oq5Var2.f(d85Var) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            vm0 b2 = fn0.b(i, 0.0f, um0Var, oq5Var2, ((i3 >> 3) & 14) | (i3 & 896), 2);
            yci o = a.o(vci.a, 16, 0.0f, 2);
            boolean f = oq5Var2.f(b2);
            Object K = oq5Var2.K();
            if (f || K == gq5.a) {
                K = new a9q(b2, 7);
                oq5Var2.k0(K);
            }
            yci s = wyf.s(o, (Function0) K);
            ges j2 = nu0.j();
            if (d85Var == null) {
                oq5Var2.Z(292866196);
                j = kg5.r(R.color.text_primary_night, oq5Var2);
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(292865700);
                oq5Var2.p(false);
                j = d85Var.a;
            }
            oq5Var = oq5Var2;
            xv7.j(str, s, j, 0L, 0L, 3, 0L, 2, false, 3, 0, null, j2, oq5Var, i3 & 14, 3120, 55032);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(str, i, um0Var, d85Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ckq ckqVar, hvq hvqVar, um0 um0Var, d85 d85Var, yci yciVar, zsq zsqVar, Function0 function0, hq5 hq5Var, int i, int i2) {
        int i3;
        Function0 function02;
        boolean h;
        Object K;
        yci yciVar2;
        Function0 function03;
        xmn r;
        zsq zsqVar2 = zsqVar;
        ckqVar.getClass();
        hvqVar.getClass();
        um0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1066589259);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(ckqVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(hvqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(d85Var) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar2) : oq5Var.h(zsqVar2) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
        } else if ((1572864 & i) == 0) {
            function02 = function0;
            i4 |= oq5Var.h(function02) ? 1048576 : 524288;
            if ((599187 & i4) == 599186 || !oq5Var.z()) {
                if (i5 != 0) {
                    zsqVar2 = null;
                }
                Function0 function04 = i6 == 0 ? null : function02;
                h = ((458752 & i4) != 131072 || ((i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2))) | oq5Var.h(hvqVar);
                K = oq5Var.K();
                if (!h || K == gq5.a) {
                    K = new ko1(hvqVar, zsqVar2, 9);
                    oq5Var.k0(K);
                }
                vci vciVar = vci.a;
                yciVar2 = vciVar;
                bg3.a(com.yandex.music.core.ui.compose.a.b(vciVar, null, 0L, 0.0f, null, (Function2) K, 15), null, false, ild.C(1334150177, new mdn(um0Var, ckqVar, d85Var, function04), oq5Var), oq5Var, 3072, 6);
                function03 = function04;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
                function03 = function02;
            }
            zsq zsqVar3 = zsqVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new ou(ckqVar, hvqVar, um0Var, d85Var, yciVar2, zsqVar3, function03, i, i2);
                return;
            }
            return;
        }
        function02 = function0;
        if ((599187 & i4) == 599186) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        h = ((458752 & i4) != 131072 || ((i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar2))) | oq5Var.h(hvqVar);
        K = oq5Var.K();
        if (!h) {
        }
        K = new ko1(hvqVar, zsqVar2, 9);
        oq5Var.k0(K);
        vci vciVar2 = vci.a;
        yciVar2 = vciVar2;
        bg3.a(com.yandex.music.core.ui.compose.a.b(vciVar2, null, 0L, 0.0f, null, (Function2) K, 15), null, false, ild.C(1334150177, new mdn(um0Var, ckqVar, d85Var, function04), oq5Var), oq5Var, 3072, 6);
        function03 = function04;
        zsq zsqVar32 = zsqVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void d(String str, String str2, d85 d85Var, yci yciVar, hq5 hq5Var, int i) {
        long j;
        boolean z;
        oq5 oq5Var;
        vci vciVar;
        long j2;
        vci vciVar2;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(942183026);
        if (((i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16) | (oq5Var2.f(d85Var) ? 256 : 128) | 3072) & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i2 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar3 = vci.a;
            yci H = vnj.H(oq5Var2, vciVar3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            if (str2 == null) {
                oq5Var2.Z(993768844);
                oq5Var2.p(false);
                oq5Var = oq5Var2;
                z = false;
                vciVar = vciVar3;
            } else {
                oq5Var2.Z(993768845);
                yci o = a.o(vciVar3, 16, 0.0f, 2);
                ges j3 = nu0.j();
                if (d85Var == null) {
                    oq5Var2.Z(379011009);
                    j = ((dq0) oq5Var2.j(eq0.a)).b.a;
                    oq5Var2.p(false);
                } else {
                    oq5Var2.Z(379009986);
                    oq5Var2.p(false);
                    j = d85Var.a;
                }
                z = false;
                xv7.j(str2, o, j, 0L, 0L, 3, 0L, 2, false, 2, 0, null, j3, oq5Var2, 48, 3120, 55032);
                oq5Var = oq5Var2;
                vciVar = vciVar3;
                eta.p(vciVar, 8, oq5Var, false);
            }
            if (str == null) {
                oq5Var.Z(994252320);
                oq5Var.p(z);
                vciVar2 = vciVar;
            } else {
                oq5Var.Z(994252321);
                yci o2 = a.o(vciVar, 16, 0.0f, 2);
                ges e = nu0.e();
                if (d85Var == null) {
                    oq5Var.Z(733179338);
                    long j4 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(z);
                    j2 = j4;
                } else {
                    oq5Var.Z(733178315);
                    oq5Var.p(z);
                    j2 = d85Var.a;
                }
                oq5 oq5Var3 = oq5Var;
                vciVar2 = vciVar;
                xv7.j(str, o2, j2, 0L, 0L, 3, 0L, 2, false, 2, 0, null, e, oq5Var3, 48, 3120, 55032);
                oq5Var = oq5Var3;
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 23, str, str2, d85Var, yciVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0177, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(ckq ckqVar, boolean z, um0 um0Var, oxo oxoVar, Function0 function0, hq5 hq5Var, int i) {
        yci t;
        boolean f;
        Object K;
        int i2;
        boolean h;
        Object K2;
        boolean h2;
        Object K3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1295765826);
        int i3 = i | (oq5Var.f(ckqVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.d(um0Var.ordinal()) ? 256 : 128) | (oq5Var.h(oxoVar) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            Object obj = gq5.a;
            float f2 = a;
            if (z && !ckqVar.d) {
                oq5Var.Z(-1005996211);
                vm0 b2 = fn0.b(((Number) oxoVar.invoke()).intValue(), 0.0f, um0Var, oq5Var, i3 & 896, 2);
                String str = ckqVar.f;
                if (str == null) {
                    oq5Var.Z(-1005783180);
                } else {
                    oq5Var.Z(-1005783179);
                    htq htqVar = new htq(etq.b);
                    yci m = d.m(vciVar, f2);
                    boolean f3 = oq5Var.f(b2);
                    Object K4 = oq5Var.K();
                    if (f3 || K4 == obj) {
                        K4 = new a9q(b2, 3);
                        oq5Var.k0(K4);
                    }
                    ocg.e(str, htqVar, wyf.s(m, (Function0) K4), null, oq5Var, 0, 8);
                    oq5Var = oq5Var;
                }
                oq5Var.p(false);
                oq5Var.p(false);
            } else if (ckqVar.d) {
                oq5Var.Z(-1005345986);
                vm0 b3 = fn0.b(((Number) oxoVar.invoke()).intValue(), 0.0f, um0Var, oq5Var, i3 & 896, 2);
                Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                int n0 = (int) ((jx7) oq5Var.j(es5.h)).n0(32);
                Object K5 = oq5Var.K();
                if (K5 == obj) {
                    K5 = pl0.a(context, R.drawable.ic_trailer_anim_32);
                    oq5Var.k0(K5);
                }
                pl0 pl0Var = (pl0) K5;
                Object K6 = oq5Var.K();
                if (K6 == obj) {
                    K6 = new ekq(pl0Var);
                    oq5Var.k0(K6);
                }
                ekq ekqVar = (ekq) K6;
                Unit unit = Unit.a;
                boolean h3 = oq5Var.h(pl0Var) | oq5Var.h(ekqVar);
                Object K7 = oq5Var.K();
                if (h3 || K7 == obj) {
                    K7 = new xum(21, pl0Var, ekqVar);
                    oq5Var.k0(K7);
                }
                gld.k(unit, (Function1) K7, oq5Var);
                d85 d85Var = ckqVar.h;
                yci u = xp3.u(d.m(vciVar, f2), ugo.a);
                if (function0 != null) {
                    oq5Var.Z(-1003871626);
                    oq5Var.p(false);
                    t = androidx.compose.foundation.a.b(vciVar, ((ymk) function0.invoke()).c, vnj.i);
                } else if (d85Var != null) {
                    oq5Var.Z(-1003681317);
                    boolean f4 = oq5Var.f(d85Var);
                    Object K8 = oq5Var.K();
                    if (f4 || K8 == obj) {
                        K8 = new xpp(5, d85Var);
                        oq5Var.k0(K8);
                    }
                    t = wyf.t(vciVar, (Function0) K8);
                    oq5Var.p(false);
                    yci f5 = u.f(t);
                    f = oq5Var.f(b3);
                    K = oq5Var.K();
                    if (!f || K == obj) {
                        K = new a9q(b3, 4);
                        oq5Var.k0(K);
                    }
                    yci s = wyf.s(f5, (Function0) K);
                    kfh d = ug3.d(b2c.f, false);
                    i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, s);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.n0();
                    } else {
                        oq5Var.k(grbVar);
                    }
                    g0g.U(oq5Var, d, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    h = oq5Var.h(context) | oq5Var.d(n0);
                    K2 = oq5Var.K();
                    if (!h || K2 == obj) {
                        K2 = new qo1(context, n0, 7);
                        oq5Var.k0(K2);
                    }
                    Function1 function1 = (Function1) K2;
                    h2 = oq5Var.h(pl0Var);
                    K3 = oq5Var.K();
                    if (!h2 || K3 == obj) {
                        K3 = new kzp(10, pl0Var);
                        oq5Var.k0(K3);
                    }
                    androidx.compose.ui.viewinterop.a.a(48, 0, oq5Var, vciVar, function1, (Function1) K3);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1003544328);
                    oq5Var.p(false);
                    t = vciVar;
                    yci f52 = u.f(t);
                    f = oq5Var.f(b3);
                    K = oq5Var.K();
                    if (!f) {
                    }
                    K = new a9q(b3, 4);
                    oq5Var.k0(K);
                    yci s2 = wyf.s(f52, (Function0) K);
                    kfh d2 = ug3.d(b2c.f, false);
                    i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, s2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                    }
                    g0g.U(oq5Var, d2, wp5.f);
                    g0g.U(oq5Var, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (!oq5Var.O) {
                    }
                    ouj.x(i2, oq5Var, i2, kb5Var2);
                    g0g.U(oq5Var, H2, wp5.d);
                    h = oq5Var.h(context) | oq5Var.d(n0);
                    K2 = oq5Var.K();
                    if (!h) {
                    }
                    K2 = new qo1(context, n0, 7);
                    oq5Var.k0(K2);
                    Function1 function12 = (Function1) K2;
                    h2 = oq5Var.h(pl0Var);
                    K3 = oq5Var.K();
                    if (!h2) {
                    }
                    K3 = new kzp(10, pl0Var);
                    oq5Var.k0(K3);
                    androidx.compose.ui.viewinterop.a.a(48, 0, oq5Var, vciVar, function12, (Function1) K3);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                    oq5Var.p(false);
                }
            } else {
                oq5Var.Z(-1002803676);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(ckqVar, z, um0Var, oxoVar, function0, i);
        }
    }
}
