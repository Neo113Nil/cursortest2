package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class qn0 {
    public static final Pair a;

    static {
        c5b c5bVar = c5b.a;
        a = new Pair(c5bVar, c5bVar);
    }

    public static final void a(mn0 mn0Var, List list, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1794596951);
        int i2 = (i & 6) == 0 ? (oq5Var.f(mn0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(list) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ln0 ln0Var = (ln0) list.get(i3);
                pyc pycVar = (pyc) ln0Var.a;
                int i4 = ln0Var.b;
                int i5 = ln0Var.c;
                r30 r30Var = r30.e;
                int i6 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, vci.a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, r30Var, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                pycVar.invoke(mn0Var.subSequence(i4, i5).b, oq5Var, 0);
                oq5Var.p(true);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kg0(mn0Var, list, i, 2);
        }
    }
}
