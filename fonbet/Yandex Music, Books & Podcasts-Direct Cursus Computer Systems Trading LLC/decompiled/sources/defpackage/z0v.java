package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class z0v {
    public static final float b;
    public static final float c;
    public static final float a = 150;
    public static final float d = 12;

    static {
        float f = 16;
        b = f;
        c = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, boolean z, boolean z2, yci yciVar, onu onuVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        yci yciVar3;
        boolean c2;
        Object K;
        boolean f;
        Object K2;
        int i4;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2098149067);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(wn5Var3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((1572864 & i) == 0) {
                i3 |= oq5Var.d(onuVar == null ? -1 : onuVar.ordinal()) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !oq5Var.z()) {
                yciVar3 = i5 == 0 ? vci.a : yciVar2;
                gtu gtuVar = (gtu) oq5Var.j(htu.a);
                float f2 = gtuVar.a;
                float f3 = gtuVar.c;
                List h = u75.h(wn5Var, wn5Var2, wn5Var3);
                c2 = ((i3 & 7168) != 2048) | ((i3 & 3670016) != 1048576) | oq5Var.c(f2) | ((57344 & i3) != 16384) | oq5Var.c(f3);
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!c2 || K == kjnVar) {
                    y0v y0vVar = new y0v(onuVar, f2, z2, f3, z);
                    oq5Var.k0(y0vVar);
                    K = y0vVar;
                }
                ggi ggiVar = (ggi) K;
                wn5 o = ghh.o(h);
                f = oq5Var.f(ggiVar);
                K2 = oq5Var.K();
                if (!f || K2 == kjnVar) {
                    K2 = new hgi(ggiVar);
                    oq5Var.k0(K2);
                }
                kfh kfhVar = (kfh) K2;
                i4 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar3);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, kfhVar, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                eta.l(0, o, oq5Var, true);
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cq(wn5Var, wn5Var2, wn5Var3, z, z2, yciVar3, onuVar, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        if (i5 == 0) {
        }
        gtu gtuVar2 = (gtu) oq5Var.j(htu.a);
        float f22 = gtuVar2.a;
        float f32 = gtuVar2.c;
        List h2 = u75.h(wn5Var, wn5Var2, wn5Var3);
        c2 = ((i3 & 7168) != 2048) | ((i3 & 3670016) != 1048576) | oq5Var.c(f22) | ((57344 & i3) != 16384) | oq5Var.c(f32);
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!c2) {
        }
        y0v y0vVar2 = new y0v(onuVar, f22, z2, f32, z);
        oq5Var.k0(y0vVar2);
        K = y0vVar2;
        ggi ggiVar2 = (ggi) K;
        wn5 o2 = ghh.o(h2);
        f = oq5Var.f(ggiVar2);
        K2 = oq5Var.K();
        if (!f) {
        }
        K2 = new hgi(ggiVar2);
        oq5Var.k0(K2);
        kfh kfhVar2 = (kfh) K2;
        i4 = oq5Var.P;
        a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, yciVar3);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, kfhVar2, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        eta.l(0, o2, oq5Var, true);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final yci b(hq5 hq5Var) {
        return androidx.compose.foundation.layout.a.q(vci.a, 0.0f, ((gtu) ((oq5) hq5Var).j(htu.a)).a - b, 0.0f, 0.0f, 13);
    }

    public static final float c(boolean z, boolean z2, float f, boolean z3, oq5 oq5Var) {
        float f2;
        float max;
        if (z) {
            oq5Var.Z(-613070466);
            f2 = d(oq5Var);
            oq5Var.p(false);
        } else {
            oq5Var.Z(-613069619);
            oq5Var.p(false);
            f2 = 0;
        }
        float f3 = f - f2;
        boolean I = asq.I((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a));
        gtu gtuVar = (gtu) oq5Var.j(htu.a);
        float f4 = (z3 ? 0 : gtuVar.e + gtuVar.j) + gtuVar.f;
        if (z2) {
            oq5Var.Z(-1523043283);
            f4 += hdg.Z(oq5Var);
        } else {
            oq5Var.Z(-1527731785);
        }
        oq5Var.p(false);
        float f5 = f4 + gtuVar.g;
        if (I) {
            oq5Var.Z(-1522913486);
            oq5Var.p(false);
            max = 56;
        } else {
            oq5Var.Z(-1522869621);
            max = Math.max(irv.d(oq5Var) * 0.31f, 240);
            oq5Var.p(false);
        }
        return f3 - (f5 + max);
    }

    public static final float d(oq5 oq5Var) {
        return ild.v(oq5Var) + irv.f(oq5Var) + 12;
    }
}
