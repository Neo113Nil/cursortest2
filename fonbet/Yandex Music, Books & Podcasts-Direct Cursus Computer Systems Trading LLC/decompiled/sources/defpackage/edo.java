package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class edo {
    public static final float a = 80;
    public static final float b = 48;

    public static final void a(dh3 dh3Var, String str, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1127523026);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var2.f(dh3Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(str) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            float f = 100;
            oq5Var = oq5Var2;
            xv7.j(str, a.a(androidx.compose.foundation.layout.a.q(dh3Var.a(vci.a, b2c.c), f, 16, f, 0.0f, 8), "top_app_bar_title"), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.g(), oq5Var, (i2 >> 3) & 14, 3120, 55288);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(dh3Var, str, i, 6);
        }
    }

    public static final void b(tvd tvdVar, wn5 wn5Var, yci yciVar, Function0 function0, Function0 function02, Function0 function03, float f, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        tvdVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1559582759);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(tvdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.c(f) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.U(new nr(tvdVar, 27));
                oq5Var2.k0(K);
            }
            sdr sdrVar = (sdr) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = szf.U(new nr(tvdVar, 28));
                oq5Var2.k0(K2);
            }
            boolean booleanValue = ((Boolean) sdrVar.getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) ((sdr) K2).getValue()).booleanValue();
            Object K3 = oq5Var2.K();
            if (K3 == kjnVar) {
                K3 = new i6o(19);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            d(booleanValue, booleanValue2, wn5Var, nfp.b(yciVar, false, (Function1) K3), function0, function02, function03, f, oq5Var, (i2 << 3) & 33547136);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vd1(tvdVar, wn5Var, yciVar, function0, function02, function03, f, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(tvd tvdVar, String str, yci yciVar, Function0 function0, Function0 function02, Function0 function03, float f, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        oq5 oq5Var;
        yci yciVar3;
        xmn r;
        tvdVar.getClass();
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(576870772);
        int i4 = (oq5Var2.f(tvdVar) ? 4 : 2) | i | (oq5Var2.f(str) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            int i6 = i4 | (!oq5Var2.h(function0) ? 2048 : 1024);
            if ((i & 24576) == 0) {
                i6 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((196608 & i) == 0) {
                i6 |= oq5Var2.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            i3 = i6 | (!oq5Var2.c(f) ? 1048576 : 524288);
            if ((599187 & i3) == 599186 || !oq5Var2.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                oq5Var = oq5Var2;
                b(tvdVar, ild.C(-1053859548, new mf3(str, 12), oq5Var2), yciVar4, function0, function02, function03, f, oq5Var, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016));
                yciVar3 = yciVar4;
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hh3(tvdVar, str, yciVar3, function0, function02, function03, f, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        int i62 = i4 | (!oq5Var2.h(function0) ? 2048 : 1024);
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i3 = i62 | (!oq5Var2.c(f) ? 1048576 : 524288);
        if ((599187 & i3) == 599186) {
        }
        if (i5 == 0) {
        }
        oq5Var = oq5Var2;
        b(tvdVar, ild.C(-1053859548, new mf3(str, 12), oq5Var2), yciVar4, function0, function02, function03, f, oq5Var, (i3 & 14) | 48 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016));
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void d(final boolean z, final boolean z2, final wn5 wn5Var, final yci yciVar, Function0 function0, Function0 function02, Function0 function03, final float f, hq5 hq5Var, final int i) {
        int i2;
        long j;
        int i3;
        yci yciVar2;
        final Function0 function04 = function0;
        final Function0 function05 = function02;
        final Function0 function06 = function03;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1850134528);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function05) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.h(function06) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.c(f) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i4 = i2;
            sdr b2 = pk0.b(z ? 1.0f : 0.0f, null, null, null, oq5Var, 0, 30);
            if (z2) {
                oq5Var.Z(-137163605);
                j = svd.a(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-137162869);
                oq5Var.p(false);
                j = d85.m;
            }
            yci b3 = androidx.compose.foundation.a.b(d.d(yciVar, 1.0f), j, vnj.i);
            vci vciVar = vci.a;
            kjn kjnVar = gq5.a;
            if (z2) {
                oq5Var.Z(-137157546);
                Unit unit = Unit.a;
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = new db(2, 13, null);
                    oq5Var.k0(K);
                }
                yciVar2 = vciVar.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K), 6));
                i3 = 0;
                oq5Var.p(false);
            } else {
                i3 = 0;
                oq5Var.Z(-137156664);
                oq5Var.p(false);
                yciVar2 = vciVar;
            }
            yci f2 = b3.f(yciVar2);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, i3);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, f2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            WeakHashMap weakHashMap = rqv.w;
            ug3.a(new wx7(z7l.h(oq5Var).f, ucs.A), oq5Var, 0);
            yci a3 = a.a(d.e(d.d(vciVar, 1.0f), f), "top_bar_block");
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            boolean f3 = oq5Var.f(b2);
            Object K2 = oq5Var.K();
            if (f3 || K2 == kjnVar) {
                K2 = new xtb(b2, 27);
                oq5Var.k0(K2);
            }
            yci s = wyf.s(vciVar, (Function0) K2);
            kfh d2 = ug3.d(iz2Var, false);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, s);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            wn5Var.invoke(b.a, oq5Var, Integer.valueOf(((i4 >> 3) & 112) | 6));
            int i8 = 1;
            oq5Var.p(true);
            function04 = function0;
            function05 = function02;
            function06 = function03;
            jf0.a(new qzm[0], null, (z && ((ma5) oq5Var.j(pa5.a)).g()) ? false : true, ild.C(2010328299, new cdo(function04, function05, function06, i8), oq5Var), oq5Var, 3072, 2);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: ddo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    edo.d(z, z2, wn5Var, yciVar, function04, function05, function06, f, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final tvd e(fvf fvfVar, eoe eoeVar, jx7 jx7Var, float f, hq5 hq5Var, int i) {
        fvfVar.getClass();
        if ((i & 2) != 0) {
            WeakHashMap weakHashMap = rqv.w;
            eoeVar = p6g.n(z7l.h(hq5Var).f, hq5Var);
        }
        if ((i & 4) != 0) {
            jx7Var = (jx7) ((oq5) hq5Var).j(es5.h);
        }
        boolean f2 = ((oq5) hq5Var).f(fvfVar) | ((oq5) hq5Var).f(eoeVar) | ((oq5) hq5Var).f(jx7Var) | ((oq5) hq5Var).c(f);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new tvd(fvfVar, jx7Var, eoeVar, f);
            oq5Var.k0(K);
        }
        return (tvd) K;
    }
}
