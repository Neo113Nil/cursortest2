package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class z9b1 {
    public static final void a(f530 f530Var, jt1 jt1Var, nhe nheVar, float f, fid fidVar, int i) {
        jt1 jt1Var2;
        nhe nheVar2;
        float f2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(732466801);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | 224688;
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            uo5 uo5Var = x4c.y;
            kl40 kl40Var = mhe.b;
            o4b1.b(mt71.m(wzg0.ic_eats, 0, btsVar), null, f530Var, uo5Var, kl40Var, 1.0f, null, btsVar, ((i2 << 6) & 896) | 1797168, 0);
            jt1Var2 = uo5Var;
            nheVar2 = kl40Var;
            f2 = 1.0f;
        } else {
            btsVar.Y();
            jt1Var2 = jt1Var;
            nheVar2 = nheVar;
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zvc(f2, i, 3, f530Var, jt1Var2, nheVar2);
        }
    }

    public static final void b(dae daeVar, sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(872617003);
        int i2 = (btsVar2.k(daeVar) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            String str = daeVar.a;
            String str2 = daeVar.b;
            if (evu0.J(str2)) {
                str2 = null;
            }
            String str3 = str2;
            f530 d = q791.d(c530.a, false, null, null, slsVar, 15);
            a S = wwg.S(-484750905, true, new kq5(str, str3, 3), btsVar2);
            y7d.a.getClass();
            btsVar = btsVar2;
            web1.c(d, 56.0f, false, 0.0f, null, null, S, null, null, y7d.b, null, oa01.a, false, btsVar, 806879232, 0, 5564);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(daeVar, slsVar, i, 6);
        }
    }

    public static final void c(int i, fid fidVar, tls tlsVar, f530 f530Var, List list) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2077486239);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ss(list, tlsVar, i3);
                btsVar.o0(Q);
            }
            adb1.a(f530Var, null, null, null, null, null, false, null, (tls) Q, btsVar, i2 & 14, 510);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l3x(f530Var, list, tlsVar, i);
        }
    }
}
