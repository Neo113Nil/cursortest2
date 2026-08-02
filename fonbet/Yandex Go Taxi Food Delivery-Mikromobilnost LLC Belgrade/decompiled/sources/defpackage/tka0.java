package defpackage;

import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.n;
import androidx.compose.ui.viewinterop.b;
import com.yandex.fintechsdk.flows.payment.kit.api.widget.PaymentKitWidget;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public abstract class tka0 {
    public static final qwd a = new qwd(new t7a0(20));

    public static final void a(fid fidVar, int i) {
        aii0 v;
        g990 g990Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2078047103);
        if (!btsVar.V(i & 1, i != 0)) {
            btsVar.Y();
        } else {
            if (((Boolean) btsVar.m(n.a)).booleanValue()) {
                btsVar.e0(557422871);
                b(btsVar, 0);
                btsVar.t(false);
                v = btsVar.v();
                if (v != null) {
                    g990Var = new g990(i, 3);
                    v.d = g990Var;
                }
                return;
            }
            btsVar.e0(557463233);
            btsVar.t(false);
            PaymentKitWidget paymentKitWidget = (PaymentKitWidget) btsVar.m(a);
            f530 b = tra1.b(ljs0.m(c530.a, 1.0f), 0.0f);
            boolean e = btsVar.e(paymentKitWidget);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new u290(24, paymentKitWidget);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new dia0(2);
                btsVar.o0(Q2);
            }
            b.a(tlsVar, b, (tls) Q2, btsVar, 432, 0);
        }
        v = btsVar.v();
        if (v != null) {
            g990Var = new g990(i, 4);
            v.d = g990Var;
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(367869047);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 l = pw91.l(ljs0.c(c530Var, 1.0f), pw91.o(btsVar), 14);
            lhl0 a2 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            pi6.a(ljs0.q(c530Var, 16.0f), btsVar, 6);
            btsVar.e0(1721385686);
            for (int i2 = 0; i2 < 3; i2++) {
                pi6.a(bzk0.c(ljs0.n(c530Var, 120.0f, 76.0f), AppColor$Palette.BgMinor, cyk0.c(12.0f)), btsVar, 0);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g990(i, 5);
        }
    }

    public static final void c(boolean z, fid fidVar, int i) {
        aii0 v;
        vxd vxdVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1230013915);
        int i2 = 4;
        int i3 = (btsVar.a(z) ? 4 : 2) | i;
        if (!btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (((Boolean) btsVar.m(n.a)).booleanValue()) {
                btsVar.e0(-1316329187);
                b(btsVar, 0);
                btsVar.t(false);
                v = btsVar.v();
                if (v != null) {
                    vxdVar = new vxd(z, i, 3);
                    v.d = vxdVar;
                }
                return;
            }
            btsVar.e0(-1316288825);
            btsVar.t(false);
            PaymentKitWidget paymentKitWidget = (PaymentKitWidget) btsVar.m(a);
            boolean e = btsVar.e(paymentKitWidget);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new u290(24, paymentKitWidget);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            boolean z2 = (i3 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new yce(z, 19);
                btsVar.o0(Q2);
            }
            b.a(tlsVar, null, (tls) Q2, btsVar, 0, 2);
        }
        v = btsVar.v();
        if (v != null) {
            vxdVar = new vxd(z, i, i2);
            v.d = vxdVar;
        }
    }
}
