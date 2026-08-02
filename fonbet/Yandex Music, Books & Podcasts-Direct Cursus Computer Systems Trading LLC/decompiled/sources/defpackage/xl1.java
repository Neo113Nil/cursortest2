package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class xl1 {
    public static final float a = 32;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(k4k k4kVar, lvf lvfVar, tmb tmbVar, dib dibVar, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function2 function22, Function0 function04, ml1 ml1Var, hq5 hq5Var, int i) {
        oq5 oq5Var;
        boolean z;
        int i2;
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function2.getClass();
        function22.getClass();
        function04.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-726855803);
        int i3 = i | (oq5Var2.f(k4kVar) ? 4 : 2) | (oq5Var2.h(lvfVar) ? 32 : 16) | (oq5Var2.h(tmbVar) ? 256 : 128) | (oq5Var2.h(dibVar) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function03) ? 1048576 : 524288) | (oq5Var2.h(function2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.h(function22) ? 67108864 : 33554432) | (oq5Var2.h(function04) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = 1;
        if (oq5Var2.P(i3 & 1, ((i3 & 306783379) == 306783378 && ((oq5Var2.f(ml1Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            ogp ogpVar = ogp.g;
            boolean z2 = k4kVar.c;
            rzf rzfVar = k4kVar.b;
            if (rzfVar != null) {
                i2 = 0;
                z = true;
            } else {
                z = false;
                i2 = 0;
            }
            int i5 = i2;
            ogpVar.e(z2, z, null, oq5Var2, 4096, 4);
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var2).f, oq5Var2);
            q0k c = a.c(0.0f, edo.a + 30, 0.0f, 0.0f, 13);
            boolean d = Intrinsics.d(rzfVar, j4k.a);
            int i6 = rzfVar == null ? 1 : i5;
            int i7 = (i3 & 458752) == 131072 ? 1 : i5;
            if ((i3 & 112) != 32 && !oq5Var2.h(lvfVar)) {
                i4 = i5;
            }
            int i8 = i7 | i4;
            Object K = oq5Var2.K();
            if (i8 != 0 || K == gq5.a) {
                K = new rl1(function02, lvfVar, i5);
                oq5Var2.k0(K);
            }
            bfg.f(d, (Function0) K, c, n, i6, ild.C(1685695493, new i11(k4kVar, lvfVar, dibVar, function0, function2, function22, function04, ml1Var, tmbVar, function03), oq5Var2), oq5Var2, 196608, 0);
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new w91(k4kVar, lvfVar, tmbVar, dibVar, function0, function02, function03, function2, function22, function04, ml1Var, i);
        }
    }

    public static final void b(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2098784958);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            long a2 = svd.a(oq5Var);
            jzk jzkVar = vnj.i;
            vci vciVar = vci.a;
            yci b = androidx.compose.foundation.a.b(vciVar, a2, jzkVar);
            Unit unit = Unit.a;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = wl1.a;
                oq5Var.k0(K);
            }
            yci a3 = eur.a(b, unit, (PointerInputEventHandler) K);
            ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a4, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            WeakHashMap weakHashMap = rqv.w;
            ug3.a(new wx7(z7l.h(oq5Var).f, ucs.A), oq5Var, 0);
            yci e = d.e(d.d(vciVar, 1.0f), edo.a);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            g(function0, oq5Var, i2 & 14);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(i, 2, function0, false);
        }
    }

    public static final void c(Function0 function0, Function0 function02, sdr sdrVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-35955425);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(sdrVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            b(function02, oq5Var, i3 & 14);
            vci vciVar = vci.a;
            yci g0 = f8g.g0(vciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, g0);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            WeakHashMap weakHashMap = rqv.w;
            ug3.a(new wx7(z7l.h(oq5Var).f, ucs.A), oq5Var, 0);
            yci e = d.e(d.d(vciVar, 1.0f), edo.a + 30);
            kfh d = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            f(function0, sdrVar, b.a.a(vciVar, b2c.i), oq5Var, (i2 & 14) | (i3 & 112));
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(function0, function02, sdrVar, i, 14);
        }
    }

    public static final void d(lvf lvfVar, dib dibVar, Function0 function0, Function2 function2, Function2 function22, Function0 function02, ml1 ml1Var, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-339893230);
        int i2 = i | (oq5Var2.h(lvfVar) ? 4 : 2) | (oq5Var2.h(dibVar) ? 32 : 16) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.h(function2) ? 2048 : 1024) | (oq5Var2.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(ml1Var) ? 1048576 : 524288);
        if (oq5Var2.P(i2 & 1, (599187 & i2) != 599186)) {
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            int i3 = i2 >> 3;
            wyf.g(dibVar, a2, oq5Var2, i3 & 14);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
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
            WeakHashMap weakHashMap = rqv.w;
            vm C = ghh.C(ghh.C(p6g.n(z7l.h(oq5Var2).f, oq5Var2), a.c(0.0f, edo.a + a, 0.0f, 0.0f, 13)), ghh.C(zs4.g(oq5Var2), ogp.A(oq5Var2)));
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new ci1(16);
                oq5Var2.k0(K);
            }
            yci b = nfp.b(vciVar, false, (Function1) K);
            boolean z = ((i2 & 14) == 4 || oq5Var2.h(lvfVar)) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object K2 = oq5Var2.K();
            if (z || K2 == kjnVar) {
                K2 = new g3(9, lvfVar, function2, function22);
                oq5Var2.k0(K2);
            }
            weo.f(b, a2, C, null, null, null, false, null, (Function1) K2, oq5Var2, 0, 504);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            if (lvfVar.d() > 0) {
                oq5Var.Z(1775935481);
                c(function02, function0, szf.Q(ml1Var.j, oq5Var), oq5Var, ((i2 >> 15) & 14) | (i3 & 112));
                oq5Var.p(false);
            } else {
                oq5Var.Z(1776150063);
                b(function0, oq5Var, (i2 >> 6) & 14);
                oq5Var.p(false);
            }
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl1(lvfVar, dibVar, function0, function2, function22, function02, ml1Var, i);
        }
    }

    public static final void e(tmb tmbVar, lvf lvfVar, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-468409968);
        int i2 = i | (oq5Var.h(tmbVar) ? 4 : 2) | (oq5Var.h(lvfVar) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            yci x = d.x(d.c(a.l(vci.a, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var))), 1.0f), b2c.f, 2);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32 || oq5Var.h(lvfVar));
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new kc(21, function02, lvfVar);
                oq5Var.k0(K);
            }
            rvf.j((Function1) K, tmbVar, x, 0, true, null, oq5Var, 24640 | ((i2 << 3) & 112), 40);
            b(function0, oq5Var, (i2 >> 6) & 14);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i, 17, tmbVar, lvfVar, function0, function02);
        }
    }

    public static final void f(Function0 function0, sdr sdrVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(156218289);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(sdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            a0g.n(function0, androidx.compose.ui.platform.a.a(yciVar, "artist_tracks_play"), false, false, false, 0.0f, ild.C(-850216039, new ix(sdrVar, 3), oq5Var), oq5Var, (i2 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 60);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(function0, sdrVar, yciVar, i, 13);
        }
    }

    public static final void g(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        int i3;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1492228916);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            vci vciVar = vci.a;
            float f = 4;
            yci q = a.q(d.d(vciVar, 1.0f), f, f, f, 0.0f, 8);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            aae.a(function0, androidx.compose.ui.platform.a.a(vciVar, "go_back"), false, qwp.a, oq5Var, (i2 & 14) | 24624, 12);
            i3 = 1;
            z = false;
            xcs.b(rvf.M(R.string.all_tracks, oq5Var), a.q(b.a.a(vciVar, b2c.c), 0.0f, 12, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.c(), oq5Var, 0, 3120, 55288);
            oq5Var.p(true);
        } else {
            i3 = 1;
            z = false;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(i, i3, function0, z);
        }
    }
}
