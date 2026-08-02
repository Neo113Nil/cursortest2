package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ycu {
    public static final jyr a = btf.b(new hft(20));

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r15.K(), java.lang.Integer.valueOf(r6)) == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(pbu pbuVar, wn5 wn5Var, jd6 jd6Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        kb5 kb5Var;
        oq5 oq5Var;
        wn5 wn5Var2;
        pbuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1733330561);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(pbuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(jd6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2 | 196608;
        if ((74899 & i3) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            wn5Var2 = wn5Var;
            oq5Var = oq5Var2;
        } else {
            boolean z2 = pbuVar instanceof obu;
            sdr b = pk0.b(z2 ? 0.0f : 1.0f, z2 ? new act(100, 300, nya.d) : new a2r(), null, null, oq5Var2, 0, 28);
            iz2 iz2Var = b2c.b;
            kfh d = ug3.d(iz2Var, false);
            int i4 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var2, d, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var2.O) {
                kb5Var = kb5Var3;
            } else {
                kb5Var = kb5Var3;
            }
            ouj.x(i4, oq5Var2, i4, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var5);
            b bVar = b.a;
            vci vciVar = vci.a;
            yci b2 = androidx.compose.foundation.a.b(bVar.b(vciVar), d85.b, vnj.i);
            boolean f = oq5Var2.f(b);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = new f6u(b, 3);
                oq5Var2.k0(K);
            }
            ug3.a(wyf.s(b2, (Function0) K), oq5Var2, 0);
            yci d2 = d.d(vciVar, 1.0f);
            boolean z3 = (i3 & 7168) == 2048;
            Object K2 = oq5Var2.K();
            if (z3 || K2 == kjnVar) {
                K2 = new i32(13, z);
                oq5Var2.k0(K2);
            }
            kb5 kb5Var6 = kb5Var;
            oq5Var = oq5Var2;
            t7g.j(pbuVar, androidx.compose.ui.draw.a.c(d2, (Function1) K2), b2c.f, jd6Var, oq5Var, (i3 & 14) | 384 | ((i3 << 3) & 7168), 0);
            yci d3 = d.d(vciVar, 1.0f);
            boolean f2 = oq5Var.f(b);
            Object K3 = oq5Var.K();
            if (f2 || K3 == kjnVar) {
                K3 = new f6u(b, 4);
                oq5Var.k0(K3);
            }
            yci s = wyf.s(d3, (Function0) K3);
            kfh d4 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, s);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d4, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var6);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var5);
            wn5Var2 = wn5Var;
            wn5Var2.invoke(oq5Var, Integer.valueOf((i3 >> 3) & 14));
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(pbuVar, wn5Var2, jd6Var, z, yciVar, i, 6);
        }
    }
}
