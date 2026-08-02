package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class ma1 {
    public static final float a = 32;
    public static final float b = 52;
    public static final float c = 29;
    public static final float d = 20;
    public static final float e = 4;

    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ld1 ld1Var, kd1 kd1Var, w41 w41Var, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        xmn r;
        bs1 bs1Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-259235120);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(ld1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(kd1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(w41Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                vci vciVar = vci.a;
                yci yciVar4 = i4 != 0 ? vciVar : yciVar2;
                yci a2 = a.a(yciVar4, "artist_icon");
                kfh d2 = ug3.d(b2c.b, false);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                boolean booleanValue = ((Boolean) oq5Var.j(koe.a)).booleanValue();
                b bVar = b.a;
                if (booleanValue) {
                    oq5Var.Z(-746383998);
                    ug3.a(androidx.compose.foundation.a.b(bVar.b(vciVar), d85.d, vnj.i), oq5Var, 0);
                } else {
                    oq5Var.Z(-752031144);
                }
                oq5Var.p(false);
                sdr sdrVar = null;
                if (ld1Var != null) {
                    kd1Var.getClass();
                    int ordinal = kd1Var.ordinal();
                    if (ordinal == 0) {
                        bs1Var = (bs1) ld1Var.d.getValue();
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return;
                        }
                        bs1Var = (bs1) ld1Var.e.getValue();
                    }
                } else {
                    bs1Var = null;
                }
                if (bs1Var instanceof as1) {
                    oq5Var.Z(-746091265);
                    kjn kjnVar = gq5.a;
                    if (w41Var == null) {
                        oq5Var.Z(-746058654);
                    } else {
                        oq5Var.Z(-855350401);
                        Object K = oq5Var.K();
                        if (K == kjnVar) {
                            K = szf.g0(Boolean.valueOf(w41Var.a));
                            oq5Var.k0(K);
                        }
                        if (((Boolean) ((aqi) K).getValue()).booleanValue()) {
                            oq5Var.Z(-1084218812);
                            Object K2 = oq5Var.K();
                            if (K2 == kjnVar) {
                                K2 = vq2.a(0.0f);
                                oq5Var.k0(K2);
                            }
                            fk0 fk0Var = (fk0) K2;
                            Unit unit = Unit.a;
                            boolean h = oq5Var.h(fk0Var);
                            Object K3 = oq5Var.K();
                            if (h || K3 == kjnVar) {
                                K3 = new v41(0, fk0Var, null);
                                oq5Var.k0(K3);
                            }
                            gld.w(oq5Var, unit, (Function2) K3);
                            sdrVar = fk0Var.c;
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(-1084057240);
                            Object K4 = oq5Var.K();
                            if (K4 == kjnVar) {
                                K4 = tlm.h(1.0f, oq5Var);
                            }
                            sdrVar = (poi) K4;
                            oq5Var.p(false);
                        }
                    }
                    oq5Var.p(false);
                    w4k w4kVar = ((as1) bs1Var).a;
                    boolean f = oq5Var.f(sdrVar);
                    Object K5 = oq5Var.K();
                    if (f || K5 == kjnVar) {
                        K5 = new la1(sdrVar, 0);
                        oq5Var.k0(K5);
                    }
                    irf.r(w4kVar, null, wyf.s(vciVar, (Function0) K5), null, hd6.g, 0.0f, null, oq5Var, 24624, 104);
                    boolean z = (i3 & 896) == 256;
                    Object K6 = oq5Var.K();
                    if (z || K6 == kjnVar) {
                        K6 = new z3(21, w41Var);
                        oq5Var.k0(K6);
                    }
                    gld.D((Function0) K6, oq5Var);
                    oq5Var.p(false);
                } else if (bs1Var instanceof yr1) {
                    oq5Var.Z(-745615136);
                    d(bVar.b(vciVar), oq5Var, 0);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-745506016);
                    c(bVar.b(vciVar), oq5Var, 0);
                    oq5Var.p(false);
                }
                oq5Var.p(true);
                yciVar3 = yciVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq((Object) ld1Var, (Object) kd1Var, (Object) w41Var, yciVar3, i, i2, 3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(int i, int i2, w41 w41Var, ld1 ld1Var, hq5 hq5Var, yci yciVar, Function0 function0, Function0 function02, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1273820182);
        int i3 = i2 | (oq5Var.f(ld1Var) ? 4 : 2) | (oq5Var.d(i) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(yciVar) ? 1048576 : 524288);
        if (oq5Var.P(i3 & 1, (599187 & i3) != 599186)) {
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (i >= 2) {
                oq5Var.Z(11563058);
                e(i, (i3 & 458752) | ((i3 >> 3) & 14) | ((i3 << 3) & 112) | 384 | (57344 & i3), w41Var, ld1Var, oq5Var, null, function0, function02, false);
                oq5Var.p(false);
            } else {
                oq5Var.Z(11890790);
                kd1 kd1Var = kd1.a;
                yci yciVar2 = vci.a;
                yci u = xp3.u(d.m(androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 0.0f, 4, 0.0f, 11), b), ugo.a);
                if (function02 == null || !z) {
                    oq5Var.Z(12351326);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(12248251);
                    boolean z2 = (i3 & 458752) == 131072;
                    Object K = oq5Var.K();
                    if (z2 || K == gq5.a) {
                        K = new or(5, function02);
                        oq5Var.k0(K);
                    }
                    yciVar2 = androidx.compose.foundation.a.e(yciVar2, false, null, null, (Function0) K, 7);
                    oq5Var.p(false);
                }
                a(ld1Var, kd1Var, w41Var, u.f(yciVar2), oq5Var, (i3 & 14) | 432, 0);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(i, i2, w41Var, ld1Var, yciVar, function0, function02, z);
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-837422897);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            ug3.a(androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 3);
        }
    }

    public static final void d(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1990056177);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            yci b2 = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i);
            kfh d2 = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.r(a0g.E(R.drawable.ic_artist_tinted_24, 0, oq5Var), null, null, null, null, 0.0f, null, oq5Var, 48, 124);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r15.K(), java.lang.Integer.valueOf(r12)) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(int i, int i2, w41 w41Var, ld1 ld1Var, hq5 hq5Var, yci yciVar, Function0 function0, Function0 function02, boolean z) {
        int i3;
        yci yciVar2;
        boolean z2;
        kb5 kb5Var;
        float f;
        yci yciVar3;
        long j;
        Function0 function03 = function02;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1311433669);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(ld1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(w41Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i4 |= oq5Var.h(function03) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i5 = i4 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if (oq5Var.P(i5 & 1, (599187 & i5) != 599186)) {
            float f2 = a;
            float f3 = b;
            float f4 = f2 + f3;
            float f5 = e + f4;
            yci yciVar4 = vci.a;
            yci r = d.r(yciVar4, f5);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, r);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, d2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O) {
                kb5Var = kb5Var3;
            } else {
                kb5Var = kb5Var3;
            }
            ouj.x(i6, oq5Var, i6, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var, H, kb5Var5);
            kb5 kb5Var6 = kb5Var;
            xee.b(u75.h(kd1.a, kd1.b), f3, f2, null, 0.0f, null, ild.C(-536797696, new ar(7, ld1Var, w41Var), oq5Var), oq5Var, 1573302, 56);
            if (i > 2) {
                oq5Var.Z(388896577);
                iz2 iz2Var2 = b2c.j;
                b bVar = b.a;
                yci b2 = androidx.compose.foundation.a.b(xp3.u(d.q(bVar.a(yciVar4, iz2Var2), c, d, 0.0f, 0.0f, 12), ugo.a), d85.f, vnj.i);
                kfh d3 = ug3.d(iz2Var, false);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, b2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, kb5Var2);
                g0g.U(oq5Var, l2, kb5Var6);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var4);
                }
                g0g.U(oq5Var, H2, kb5Var5);
                String i8 = k5r.i(i - 2, "+");
                yci a2 = bVar.a(yciVar4, b2c.f);
                d85 d85Var = function0 != null ? (d85) function0.invoke() : null;
                if (d85Var == null) {
                    oq5Var.Z(-926482354);
                    j = kg5.r(R.color.text_primary_day, oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-926483284);
                    oq5Var.p(false);
                    j = d85Var.a;
                }
                f = f3;
                xcs.b(i8, a2, j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, ges.b(nu0.j(), 0L, 0L, null, null, 0L, 0, 0L, null, new h6g(0, e6g.b), 0, 0, 15728639), oq5Var, 0, 0, 65016);
                oq5Var = oq5Var;
                oq5Var.p(true);
            } else {
                f = f3;
                oq5Var.Z(384873025);
            }
            oq5Var.p(false);
            yci u = xp3.u(d.o(yciVar4, f4, f), xp3.a);
            if (function02 != null) {
                oq5Var.Z(390027302);
                boolean z3 = (i5 & 458752) == 131072;
                Object K = oq5Var.K();
                if (z3 || K == gq5.a) {
                    function03 = function02;
                    K = new or(6, function03);
                    oq5Var.k0(K);
                } else {
                    function03 = function02;
                }
                yciVar3 = yciVar4;
                yciVar4 = androidx.compose.foundation.a.e(yciVar3, false, null, null, (Function0) K, 7);
                oq5Var.p(false);
            } else {
                function03 = function02;
                yciVar3 = yciVar4;
                oq5Var.Z(390122441);
                oq5Var.p(false);
            }
            ug3.a(u.f(yciVar4), oq5Var, 0);
            oq5Var.p(true);
            z2 = true;
            yciVar2 = yciVar3;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            z2 = z;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tp(i, i2, w41Var, ld1Var, yciVar2, function0, function03, z2);
        }
    }
}
