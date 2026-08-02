package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class r8g {
    public static final qs5 a = new qs5(grb.Y);

    public static final void a(vdr vdrVar, vdr vdrVar2, yci yciVar, xbl xblVar, iag iagVar, hq5 hq5Var, int i) {
        yci yciVar2;
        boolean z;
        yci yciVar3;
        vdrVar.getClass();
        vdrVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(194755950);
        int i2 = i | (oq5Var.h(vdrVar) ? 4 : 2) | (oq5Var.h(vdrVar2) ? 32 : 16) | 384 | (oq5Var.f(xblVar) ? 2048 : 1024) | (oq5Var.f(iagVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                yciVar2 = vci.a;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
            }
            oq5Var.q();
            aqi x = bcx.x(vdrVar, oq5Var, i2 & 14);
            aqi x2 = bcx.x(vdrVar2, oq5Var, (i2 >> 3) & 14);
            iz2 iz2Var = b2c.f;
            yci c = d.c(yciVar2, 1.0f);
            oq5Var.a0(733328855);
            wg3 e = ug3.e(iz2Var, false, oq5Var, 6);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(c);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, e, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            x2i x2iVar = qx0.a;
            oq5Var.a0(-862651793);
            u3r u3rVar = (u3r) oq5Var.j(bfs.c);
            oq5Var.p(false);
            nx0 g = qx0.g(u3rVar.a);
            yci c2 = d.c(androidx.compose.foundation.layout.a.m(yciVar2, 4), 1.0f);
            oq5Var.a0(-483455358);
            ta5 a2 = sa5.a(g, b2c.n, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            wn5 A2 = ghh.A(c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            A2.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            boolean z2 = ((jag) x2.getValue()).o;
            qs5 qs5Var = a;
            if (z2) {
                oq5Var.a0(339417920);
                etn.l(qs5Var.a(new iag(iagVar.a, iagVar.b, false, iagVar.d, iagVar.e, false, iagVar.g, false, iagVar.i, false, iagVar.k, false, iagVar.m, false, iagVar.o, iagVar.p, iagVar.q, iagVar.r, iagVar.s, iagVar.t, iagVar.u, iagVar.v, iagVar.w, iagVar.x, iagVar.y, iagVar.z, iagVar.A, iagVar.B, iagVar.C, iagVar.D, iagVar.E, iagVar.F, iagVar.G, iagVar.H, iagVar.I, false, iagVar.K, iagVar.L, iagVar.M, false, iagVar.O, false, iagVar.Q, iagVar.R, iagVar.S, iagVar.T, iagVar.U, iagVar.V, false, iagVar.X, iagVar.Y, iagVar.Z, iagVar.a0, iagVar.b0, iagVar.c0, iagVar.d0, iagVar.e0, iagVar.f0)), ild.s(oq5Var, -1986978505, new qtf(3, x, x2)), oq5Var, 56);
                z = false;
                oq5Var.p(false);
            } else {
                z = false;
                oq5Var.a0(340299994);
                etn.l(qs5Var.a(iagVar), ild.s(oq5Var, 642837262, new pu6(vdrVar, xblVar, x, x2, 2)), oq5Var, 56);
                oq5Var.p(false);
            }
            k5r.s(oq5Var, z, true, z, z);
            k5r.s(oq5Var, z, true, z, z);
            yciVar3 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ne8(vdrVar, vdrVar2, yciVar3, xblVar, iagVar, i);
        }
    }
}
