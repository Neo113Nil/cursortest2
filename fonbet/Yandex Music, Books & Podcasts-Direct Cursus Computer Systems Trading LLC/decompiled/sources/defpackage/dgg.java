package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class dgg {
    public static final long a = d85.b(c3x.h(4279771176L), 0.5f, 0.0f, 0.0f, 0.0f, 14);

    public static final void a(int i, long j, hq5 hq5Var, yci yciVar, List list) {
        int i2;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-918474802);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.e(j) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci b = a.b(d.h(yciVar, 16), a, vnj.i);
            oq5Var.a0(1247655271);
            boolean h = ((i2 & 896) == 256) | oq5Var.h(list);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new a6g(1, j, list);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            ksw.j(0, oq5Var, b, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b6g(i, 1, j, yciVar, list);
        }
    }
}
