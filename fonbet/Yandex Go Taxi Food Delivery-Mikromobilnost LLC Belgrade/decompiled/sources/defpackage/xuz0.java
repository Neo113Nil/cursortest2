package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import com.yandex.go.summary.ui.compose.common.tooltip.a;

/* loaded from: classes5.dex */
public abstract class xuz0 {
    public static final void a(float f, int i, fid fidVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1580017225);
        int i2 = i | 6;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ypv0 ypv0Var = (ypv0) btsVar.m(a.a);
            if (ypv0Var == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new k0(f, i, 7);
                    return;
                }
                return;
            }
            l3t0 l3t0Var = ypv0Var.d;
            int w0 = (int) ((fwi) btsVar.m(j.h)).w0(f);
            boolean k = btsVar.k(l3t0Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = f.d(new zgz0(7, l3t0Var));
                btsVar.o0(Q);
            }
            m3u0 m3u0Var = (m3u0) Q;
            c530 c530Var = c530.a;
            f530 d = ooc.d(c530Var, null, 3);
            boolean k2 = btsVar.k(m3u0Var) | btsVar.c(w0);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new ali0(m3u0Var, w0);
                btsVar.o0(Q2);
            }
            oeb1.c(btsVar, kp50.F(d, (zls) Q2));
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new xkb0(f530Var, f, i);
        }
    }
}
