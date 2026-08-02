package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class whb1 {
    public static final void a(f530 f530Var, String str, String str2, String str3, r901 r901Var, e68 e68Var, lpt0 lpt0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        lpt0 lpt0Var2;
        boolean z;
        boolean z2;
        uo5 uo5Var = x4c.w;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2128197039);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.k(str3) ? 2048 : 1024) | (btsVar2.e(r901Var) ? 16384 : 8192) | (btsVar2.k(e68Var) ? 131072 : 65536) | (btsVar2.k(lpt0Var) ? 1048576 : 524288) | (btsVar2.e(tlsVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC);
        if (btsVar2.V(i2 & 1, (4793491 & i2) != 4793490)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            WeakHashMap weakHashMap = a.w;
            f530 o = an91.o(c, 0.0f, w8a1.f(vuz.o(btsVar2).f, btsVar2).d(), 0.0f, 0.0f, 13);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = b.d(btsVar2, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar2, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar2, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d2);
            c530 c530Var = c530.a;
            cj6 cj6Var = cj6.a;
            if (lpt0Var == null) {
                btsVar2.e0(-949028896);
                int i3 = i2 & 29360128;
                boolean z3 = i3 == 8388608;
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (z3 || Q == o430Var) {
                    Q = new kiu(11, tlsVar);
                    btsVar2.o0(Q);
                }
                int i4 = i2 >> 3;
                xhb1.a(str, str2, str3, (sls) Q, btsVar2, i4 & 1022);
                f530 a = cj6Var.a(c530Var, uo5Var);
                sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
                int hashCode2 = Long.hashCode(btsVar2.T);
                r1b0 o3 = btsVar2.o();
                f530 d3 = b.d(btsVar2, a);
                btsVar2.i0();
                if (btsVar2.S) {
                    btsVar2.n(slsVar);
                } else {
                    btsVar2.r0();
                }
                qje.W(btsVar2, wlsVar, a2);
                qje.W(btsVar2, wlsVar2, o3);
                vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
                qje.W(btsVar2, wlsVar4, d3);
                f530 d4 = u3a1.d(an91.o(c530Var, 0.0f, 8.0f, 8.0f, 8.0f, 1), "traffic_btn");
                boolean z4 = i3 == 8388608;
                Object Q2 = btsVar2.Q();
                if (z4 || Q2 == o430Var) {
                    Q2 = new kiu(12, tlsVar);
                    btsVar2.o0(Q2);
                }
                com.yandex.go.navigator.floating_control_buttons.compose.button.a.b(d4, null, null, (sls) Q2, r901Var, btsVar2, 32768 | (i2 & HProv.ALG_CLASS_ALL), 6);
                btsVar = btsVar2;
                if (e68Var.b) {
                    btsVar.e0(426903360);
                    f530 d5 = u3a1.d(an91.o(c530Var, 0.0f, 8.0f, 8.0f, 12.0f, 1), "parking_btn");
                    boolean z5 = i3 == 8388608;
                    Object Q3 = btsVar.Q();
                    if (z5 || Q3 == o430Var) {
                        Q3 = new kiu(13, tlsVar);
                        btsVar.o0(Q3);
                    }
                    z2 = false;
                    z = true;
                    b791.a(d5, null, null, (sls) Q3, e68Var, btsVar, i4 & HProv.ALG_CLASS_ALL, 6);
                    btsVar.t(false);
                } else {
                    z2 = false;
                    z = true;
                    btsVar.e0(427218568);
                    btsVar.t(false);
                }
                btsVar.t(z);
                btsVar.t(z2);
                lpt0Var2 = lpt0Var;
            } else {
                btsVar = btsVar2;
                z = true;
                btsVar.e0(-948043189);
                lpt0Var2 = lpt0Var;
                dfb1.b(cj6Var.a(c530Var, uo5Var), lpt0Var2, btsVar, (i2 >> 15) & 112);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar = btsVar2;
            lpt0Var2 = lpt0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ze6(f530Var, str, str2, str3, r901Var, e68Var, lpt0Var2, tlsVar, i);
        }
    }

    public static final String b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.m(AndroidCompositionLocals_androidKt.a);
        return ((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getString(hzh0.default_error_message);
    }

    public static final void c(String str, Throwable th) {
        jst.e.h("Chargers", kotlin.collections.a.X(j73.A(new String[]{"Some exception happened in chargers", str, th.getMessage()}), System.lineSeparator(), null, null, null, 62), th);
    }
}
