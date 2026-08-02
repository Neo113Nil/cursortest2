package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z0n {
    public static final float a = 40;
    public static final tgo b = ugo.a;
    public static final float c = (float) 7.5d;
    public static final float d = (float) 2.5d;
    public static final float e = 10;
    public static final float f = 5;
    public static final float g = 6;
    public static final act h = weo.S(300, 0, nya.d, 2);

    public static final void a(boolean z, d1n d1nVar, yci yciVar, long j, long j2, hq5 hq5Var, int i) {
        int i2;
        d85 f2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(308716636);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(d1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.e(j2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2 | 196608;
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            int i4 = i3 & 14;
            boolean f3 = (i4 == 4) | oq5Var.f(d1nVar);
            Object K = oq5Var.K();
            if (f3 || K == gq5.a) {
                K = szf.U(new si2(z, d1nVar, 3));
                oq5Var.k0(K);
            }
            sdr sdrVar = (sdr) K;
            wl7 wl7Var = (wl7) oq5Var.j(t2b.a);
            float f4 = g;
            if (wl7Var == null) {
                oq5Var.Z(-1347611339);
                oq5Var.p(false);
                f2 = null;
            } else {
                oq5Var.Z(1619096652);
                f2 = k5r.f(oq5Var, false, wl7.a(f4, ((i3 >> 9) & 14) | 48, j, oq5Var));
            }
            long j3 = f2 != null ? f2.a : j;
            yci a2 = a.a(androidx.compose.ui.draw.a.c(d.m(yciVar, a), hhm.x), new ybg(18, d1nVar));
            if (!((Boolean) sdrVar.getValue()).booleanValue()) {
                f4 = 0;
            }
            tgo tgoVar = b;
            yci b2 = androidx.compose.foundation.a.b(y1g.d0(a2, f4, tgoVar, true, 24), j3, tgoVar);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            tt0.g(Boolean.valueOf(z), null, weo.S(100, 0, null, 6), null, ild.C(1853731063, new x0n(j2, d1nVar), oq5Var), oq5Var, i4 | 24960, 10);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new y0n(z, d1nVar, yciVar, j, j2, i);
        }
    }

    public static final void b(d1n d1nVar, long j, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-486016981);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(d1nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (K == kjnVar) {
                nh0 a2 = ph0.a();
                a2.i(1);
                oq5Var.k0(a2);
                obj = a2;
            }
            eak eakVar = (eak) obj;
            boolean f2 = oq5Var.f(d1nVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = szf.U(new w0n(d1nVar, 0));
                oq5Var.k0(K2);
            }
            boolean z = true;
            sdr b2 = pk0.b(((Number) ((sdr) K2).getValue()).floatValue(), h, null, null, oq5Var, 48, 28);
            yci b3 = nfp.b(yciVar, false, hhm.w);
            boolean h2 = oq5Var.h(d1nVar) | oq5Var.f(b2);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean h3 = h2 | z | oq5Var.h(eakVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                i3 = 0;
                ad3 ad3Var = new ad3(d1nVar, b2, j, eakVar, 2);
                oq5Var.k0(ad3Var);
                K3 = ad3Var;
            } else {
                i3 = 0;
            }
            ksw.j(i3, oq5Var, b3, (Function1) K3);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v0n(d1nVar, j, yciVar, i);
        }
    }

    public static final void c(jpa jpaVar, eak eakVar, ynn ynnVar, long j, float f2, yz0 yz0Var) {
        nh0 nh0Var = (nh0) eakVar;
        nh0Var.h();
        nh0Var.f(0.0f, 0.0f);
        float f3 = e;
        float n0 = jpaVar.n0(f3);
        float f4 = yz0Var.b;
        nh0Var.e(n0 * f4, 0.0f);
        nh0Var.e((jpaVar.n0(f3) * f4) / 2, jpaVar.n0(f) * f4);
        nh0Var.j(swf.i((enj.e(ynnVar.c()) + (Math.min(ynnVar.g(), ynnVar.d()) / 2.0f)) - ((jpaVar.n0(f3) * f4) / 2.0f), (jpaVar.n0(d) / 2.0f) + enj.f(ynnVar.c())));
        nh0Var.b();
        float f5 = yz0Var.a;
        long y0 = jpaVar.y0();
        nsh q0 = jpaVar.q0();
        long B = q0.B();
        q0.s().r();
        try {
            ((xzi) q0.b).e0(f5, y0);
            jpa.x0(jpaVar, nh0Var, j, f2, null, 56);
        } finally {
            vz1.A(q0, B);
        }
    }
}
