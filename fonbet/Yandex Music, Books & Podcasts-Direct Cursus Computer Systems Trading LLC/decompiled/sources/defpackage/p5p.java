package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class p5p {
    public static final float a = 16;

    public static final void a(wn5 wn5Var, wn5 wn5Var2, float f, boolean z, yci yciVar, hq5 hq5Var, int i) {
        float f2;
        wn5 wn5Var3;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2026726823);
        int i2 = i | (oq5Var.c(f) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = k5r.h(0, oq5Var);
            }
            u6k u6kVar = (u6k) K;
            int L = ((jx7) oq5Var.j(es5.h)).L(f);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            boolean d2 = oq5Var.d(L);
            Object K2 = oq5Var.K();
            if (d2 || K2 == kjnVar) {
                K2 = new a6c(L, u6kVar, 1);
                oq5Var.k0(K2);
            }
            vci vciVar = vci.a;
            yci b = androidx.compose.ui.layout.a.b(vciVar, (pyc) K2);
            kfh d3 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            wn5Var3 = wn5Var2;
            wn5Var3.invoke(oq5Var, 6);
            oq5Var.p(true);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new aq(u6kVar, 4);
                oq5Var.k0(K3);
            }
            yci f3 = androidx.compose.ui.layout.a.f(vciVar, (Function1) K3);
            kfh d4 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, f3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d4, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            if (z) {
                oq5Var.Z(-758049090);
                f2 = f;
                z2 = false;
                ug3.a(xee.z(((ma5) oq5Var.j(pa5.a)).f(), d.e(d.d(b.a.a(vciVar, b2c.h), 1.0f), f2), 6), oq5Var, 0);
            } else {
                f2 = f;
                z2 = false;
                oq5Var.Z(-766063892);
            }
            oq5Var.p(z2);
            wn5Var.invoke(oq5Var, 6);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            f2 = f;
            wn5Var3 = wn5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z04(wn5Var, wn5Var3, f2, z, yciVar, i);
        }
    }

    public static final void b(l6p l6pVar, u0q u0qVar, Function1 function1, Function1 function12, j6i j6iVar, tmb tmbVar, Function0 function0, boolean z, yci yciVar, Function0 function02, hq5 hq5Var, int i) {
        yci yciVar2;
        l6pVar.getClass();
        u0qVar.getClass();
        function1.getClass();
        function12.getClass();
        j6iVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(919070292);
        int i2 = i | (oq5Var.f(l6pVar) ? 4 : 2) | (oq5Var.h(u0qVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024) | (oq5Var.h(j6iVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(tmbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function0) ? 1048576 : 524288) | (oq5Var.g(z) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | 100663296 | (oq5Var.h(function02) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if (oq5Var.P(i2 & 1, (306783379 & i2) != 306783378)) {
            qxo.d(ild.C(-326426367, new o5p(l6pVar, u0qVar, z ? a : 0, z, function1, function12, j6iVar, tmbVar, function0, function02, 0), oq5Var), oq5Var, 54);
            yciVar2 = vci.a;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lw5(l6pVar, u0qVar, function1, function12, j6iVar, tmbVar, function0, z, yciVar2, function02, i);
        }
    }
}
