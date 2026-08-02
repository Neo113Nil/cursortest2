package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class y2h {
    public static final float a = 16;

    public static final void a(yci yciVar, boolean z, c6h c6hVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1683063064);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(c6hVar) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean h = oq5Var2.h(c6hVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                pef pefVar = new pef(0, c6hVar, c6h.class, "enableLyricsFullscreen", "enableLyricsFullscreen()V", 0, 25);
                oq5Var2.k0(pefVar);
                K = pefVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var2.h(c6hVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                pef pefVar2 = new pef(0, c6hVar, c6h.class, "disableLyricsFullscreen", "disableLyricsFullscreen()V", 0, 26);
                oq5Var2.k0(pefVar2);
                K2 = pefVar2;
            }
            oq5Var = oq5Var2;
            b(z, function0, (Function0) ((h9f) K2), yciVar, oq5Var, ((i3 >> 3) & 14) | ((i3 << 9) & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(yciVar, z, c6hVar, i, 2);
        }
    }

    public static final void b(boolean z, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(736785450);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (z) {
                i3 = -618779784;
                i4 = R.string.btn_close;
            } else {
                i3 = -618778105;
                i4 = R.string.expand_video_description;
            }
            String n = vz1.n(oq5Var, i3, i4, oq5Var, false);
            int i5 = 1;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new x2h(z, function02, function0, 0);
                oq5Var.k0(K);
            }
            Function0 function03 = (Function0) K;
            yci u = xp3.u(d.m(yciVar, 40), ugo.a);
            if (z) {
                oq5Var.Z(-618768331);
                j = ((dq0) oq5Var.j(eq0.a)).c.c;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-618767595);
                oq5Var.p(false);
                j = d85.m;
            }
            ff7.n(function03, a.b(u, j, vnj.i), false, null, ild.C(1438680749, new ed3(z, n, i5), oq5Var), oq5Var, 196608, 28);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(z, function0, function02, yciVar, i, 10);
        }
    }

    public static final void c(sdr sdrVar, e4h e4hVar, c6h c6hVar, b2h b2hVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1905087373);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(sdrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(e4hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(c6hVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(b2hVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            String M = rvf.M(R.string.menu_element_lyrics, oq5Var2);
            q0k c = androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, b2hVar.b.b, 7);
            float f = t2h.a;
            yciVar.getClass();
            yci b = androidx.compose.ui.draw.a.b(androidx.compose.ui.graphics.a.a(yciVar, new brg(29)), new s2h(1));
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            aqi N = gld.N(c6hVar.v(), Long.valueOf(((u7l) sdrVar.getValue()).e), oq5Var2, 0);
            act S = weo.S(600, 0, null, 6);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new s2h(6);
                oq5Var2.k0(K);
            }
            ot0.l(e4hVar, (Function1) K, null, S, null, false, ild.C(2053937955, new h54(b2hVar, c, c6hVar, z, N, M), oq5Var2), oq5Var2, ((i3 >> 3) & 14) | 1575984, 52);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(sdrVar, e4hVar, c6hVar, b2hVar, z, yciVar, i, 10);
        }
    }

    public static final void d(sdr sdrVar, e4h e4hVar, c6h c6hVar, b2h b2hVar, yci yciVar, hq5 hq5Var, int i) {
        sdrVar.getClass();
        e4hVar.getClass();
        b2hVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1691366312);
        int i2 = i | (oq5Var.f(sdrVar) ? 4 : 2) | (oq5Var.h(e4hVar) ? 32 : 16) | (oq5Var.h(c6hVar) ? 256 : 128) | (oq5Var.f(b2hVar) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            int i4 = i2 & 896;
            c(sdrVar, e4hVar, c6hVar, b2hVar, false, d.c(vciVar, 1.0f), oq5Var, (i2 & 14) | 221184 | (i2 & 112) | i4 | (i2 & 7168));
            a(b.a.a(vciVar, b2c.d), false, c6hVar, oq5Var, i4 | 48);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(sdrVar, e4hVar, c6hVar, b2hVar, yciVar, i, 25);
        }
    }

    public static final void e(aqi aqiVar, sdr sdrVar, b2h b2hVar, c6h c6hVar, yci yciVar, hq5 hq5Var, int i) {
        b bVar;
        sdrVar.getClass();
        b2hVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-990005840);
        int i2 = i | (oq5Var.f(aqiVar) ? 4 : 2) | (oq5Var.f(sdrVar) ? 32 : 16) | (oq5Var.f(b2hVar) ? 256 : 128) | (oq5Var.h(c6hVar) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s2h(3);
                oq5Var.k0(K);
            }
            yci b = nfp.b(yciVar, false, (Function1) K);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            f4h f4hVar = (f4h) sdrVar.getValue();
            boolean z = f4hVar instanceof e4h;
            vci vciVar = vci.a;
            b bVar2 = b.a;
            if (z) {
                oq5Var.Z(67144868);
                bVar = bVar2;
                c(aqiVar, (e4h) f4hVar, c6hVar, b2hVar, true, bVar2.a(d.t(d.b(vciVar, 1.0f), 0.0f, b2hVar.b.a, 1), b2c.f), oq5Var, (i2 & 14) | 24576 | ((i2 >> 3) & 896) | ((i2 << 3) & 7168));
            } else {
                bVar = bVar2;
                oq5Var.Z(61110284);
            }
            oq5Var.p(false);
            yci m = androidx.compose.foundation.layout.a.m(bVar.a(vciVar, b2c.d), 16);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new s2h(5);
                oq5Var.k0(K2);
            }
            a(nfp.b(m, false, (Function1) K2), true, c6hVar, oq5Var, ((i2 >> 3) & 896) | 48);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(aqiVar, sdrVar, b2hVar, c6hVar, yciVar, i, 26);
        }
    }
}
