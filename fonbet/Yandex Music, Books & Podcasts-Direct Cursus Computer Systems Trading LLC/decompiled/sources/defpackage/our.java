package defpackage;

import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class our {
    public static final agr a = new agr(new nrq(26));

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(vdr vdrVar, Object obj, mur murVar, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        Object K;
        kjn kjnVar;
        Object K2;
        si siVar;
        Object K3;
        aqi aqiVar;
        tur turVar;
        boolean f;
        Object K4;
        boolean z;
        boolean z2;
        aqi aqiVar2;
        tur turVar2;
        int i4;
        Object K5;
        yci yciVar3;
        xmn r;
        vdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(217614196);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(vdrVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.d(murVar.ordinal()) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((i3 & 9363) == 9362 || !oq5Var.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var = ((fs5) K).a;
                K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new si(vdrVar, mm6Var);
                    oq5Var.k0(K2);
                }
                siVar = (si) K2;
                K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = szf.g0(new rur(b(siVar, wn5Var, vdrVar.getValue(), null)));
                    oq5Var.k0(K3);
                }
                aqiVar = (aqi) K3;
                turVar = (tur) oq5Var.j(a);
                f = ((i3 & 112) != 32 || ((i3 & 64) != 0 && oq5Var.h(obj))) | ((i3 & 896) != 256) | oq5Var.f(turVar) | oq5Var.h(siVar) | ((57344 & i3) != 16384) | oq5Var.h(vdrVar);
                K4 = oq5Var.K();
                if (!f || K4 == kjnVar) {
                    z = false;
                    z2 = true;
                    aqiVar2 = aqiVar;
                    turVar2 = turVar;
                    y7b y7bVar = new y7b(turVar2, aqiVar2, murVar, obj, vdrVar, siVar, wn5Var, (Continuation) null);
                    oq5Var.k0(y7bVar);
                    K4 = y7bVar;
                } else {
                    turVar2 = turVar;
                    aqiVar2 = aqiVar;
                    z = false;
                    z2 = true;
                }
                gld.w(oq5Var, turVar2, (Function2) K4);
                kfh d = ug3.d(b2c.b, z);
                i4 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar4);
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
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                sur surVar = (sur) aqiVar2.getValue();
                K5 = oq5Var.K();
                if (K5 == kjnVar) {
                    K5 = new x80(aqiVar2, 22);
                    oq5Var.k0(K5);
                }
                c(surVar, (Function1) K5, oq5Var, 48);
                oq5Var.p(z2);
                yciVar3 = yciVar4;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new cj(vdrVar, obj, murVar, yciVar3, wn5Var, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i5 == 0) {
        }
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        mm6 mm6Var2 = ((fs5) K).a;
        K2 = oq5Var.K();
        if (K2 == kjnVar) {
        }
        siVar = (si) K2;
        K3 = oq5Var.K();
        if (K3 == kjnVar) {
        }
        aqiVar = (aqi) K3;
        turVar = (tur) oq5Var.j(a);
        f = ((i3 & 112) != 32 || ((i3 & 64) != 0 && oq5Var.h(obj))) | ((i3 & 896) != 256) | oq5Var.f(turVar) | oq5Var.h(siVar) | ((57344 & i3) != 16384) | oq5Var.h(vdrVar);
        K4 = oq5Var.K();
        if (f) {
        }
        z = false;
        z2 = true;
        aqiVar2 = aqiVar;
        turVar2 = turVar;
        y7b y7bVar2 = new y7b(turVar2, aqiVar2, murVar, obj, vdrVar, siVar, wn5Var, (Continuation) null);
        oq5Var.k0(y7bVar2);
        K4 = y7bVar2;
        gld.w(oq5Var, turVar2, (Function2) K4);
        kfh d2 = ug3.d(b2c.b, z);
        i4 = oq5Var.P;
        a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, yciVar4);
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
        ouj.x(i4, oq5Var, i4, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        sur surVar2 = (sur) aqiVar2.getValue();
        K5 = oq5Var.K();
        if (K5 == kjnVar) {
        }
        c(surVar2, (Function1) K5, oq5Var, 48);
        oq5Var.p(z2);
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final wn5 b(si siVar, wn5 wn5Var, Object obj, Object obj2) {
        rar rarVar = siVar.c;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        x6k g0 = szf.g0(obj);
        siVar.c = x97.y(siVar.b, null, null, new k3(siVar, obj2, g0, continuation, 1), 3);
        return a0g.C(new wn5(new k0r(13, wn5Var, g0), -65261809, true));
    }

    public static final void c(sur surVar, Function1 function1, hq5 hq5Var, int i) {
        Object fpqVar;
        fk0 fk0Var;
        Function1 function12;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-563519157);
        int i2 = i | (oq5Var.f(surVar) ? 4 : 2);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else if (surVar instanceof qur) {
            oq5Var.Z(1228186069);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vq2.a(0.0f);
                oq5Var.k0(K);
            }
            fk0 fk0Var2 = (fk0) K;
            vm0 vm0Var = fk0Var2.c;
            boolean h = ((i2 & 14) == 4) | oq5Var.h(fk0Var2);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                fk0Var = fk0Var2;
                function12 = function1;
                fpqVar = new fpq(fk0Var, function12, surVar, null, 9);
                oq5Var.k0(fpqVar);
            } else {
                fpqVar = K2;
                fk0Var = fk0Var2;
                function12 = function1;
            }
            gld.x(fk0Var, surVar, function12, (Function2) fpqVar, oq5Var);
            qur qurVar = (qur) surVar;
            nur nurVar = qurVar.a;
            pur purVar = (pur) nurVar.b;
            vm0Var.getClass();
            xum xumVar = new xum(27, purVar, vm0Var);
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.graphics.a.a(vciVar, xumVar);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
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
            qurVar.b.invoke(oq5Var, 0);
            oq5Var.p(true);
            pur purVar2 = (pur) nurVar.c;
            vm0Var.getClass();
            yci a3 = androidx.compose.ui.graphics.a.a(vciVar, new xum(27, purVar2, vm0Var));
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a3);
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
            qurVar.c.invoke(oq5Var, 0);
            oq5Var.p(true);
            oq5Var.p(false);
        } else {
            if (!(surVar instanceof rur)) {
                throw vz1.i(oq5Var, -376025101, false);
            }
            oq5Var.Z(1229182595);
            ((rur) surVar).a.invoke(oq5Var, 0);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(surVar, function1, i, 12);
        }
    }
}
