package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z30 {
    public static final yci a;
    public static final yci b;
    public static final long c;
    public static final long d;
    public static final long e;

    static {
        float f = 24;
        vci vciVar = vci.a;
        a = a.q(vciVar, f, 0.0f, f, 0.0f, 10);
        b = a.q(vciVar, f, 0.0f, f, 28, 2);
        c = v7g.z(40);
        d = v7g.z(36);
        e = v7g.z(38);
    }

    public static final void a(Function2 function2, Function2 function22, hq5 hq5Var, int i) {
        boolean z;
        boolean z2;
        iz2 iz2Var = b2c.b;
        gz2 gz2Var = b2c.n;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-555573207);
        int i2 = i | (oq5Var.h(function2) ? 32 : 16) | (oq5Var.h(function22) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f);
            r30 r30Var = r30.b;
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, layoutWeightElement);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, r30Var, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (function2 == null) {
                oq5Var.Z(1317321954);
                oq5Var.p(false);
                z = false;
            } else {
                oq5Var.Z(1317321955);
                yci f = androidx.compose.ui.layout.a.c(a, "title").f(new HorizontalAlignElement(gz2Var));
                kfh d2 = ug3.d(iz2Var, false);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, f);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                function2.invoke(oq5Var, 0);
                oq5Var.p(true);
                z = false;
                oq5Var.p(false);
            }
            if (function22 == null) {
                oq5Var.Z(1317454758);
                oq5Var.p(z);
                z2 = true;
            } else {
                oq5Var.Z(1317454759);
                yci f2 = androidx.compose.ui.layout.a.c(b, "text").f(new HorizontalAlignElement(gz2Var));
                kfh d3 = ug3.d(iz2Var, z);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, f2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                function22.invoke(oq5Var, 0);
                z2 = true;
                oq5Var.p(true);
                oq5Var.p(false);
            }
            oq5Var.p(z2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s30(function2, function22, i, 0);
        }
    }

    public static final void b(wn5 wn5Var, yci yciVar, Function2 function2, dup dupVar, long j, long j2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-453679601);
        int i2 = i | (oq5Var.h(wn5Var) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.h(null) ? 256 : 128) | (oq5Var.h(function2) ? 2048 : 1024) | (oq5Var.f(dupVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.e(j) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.e(j2) ? 1048576 : 524288);
        if (oq5Var.P(i2 & 1, (599187 & i2) != 599186)) {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            wn5 C = ild.C(629950291, new u30(function2, wn5Var, 0), oq5Var);
            int i3 = ((i2 >> 3) & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
            int i4 = i2 >> 9;
            q5g.k(yciVar, dupVar, j, j2, null, 0.0f, C, oq5Var, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v30(wn5Var, yciVar, function2, dupVar, j, j2, i);
        }
    }

    public static final void c(float f, float f2, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(73434452);
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new x30(f, f2, 0);
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(6, wn5Var, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y30(f, f2, wn5Var, i);
        }
    }
}
