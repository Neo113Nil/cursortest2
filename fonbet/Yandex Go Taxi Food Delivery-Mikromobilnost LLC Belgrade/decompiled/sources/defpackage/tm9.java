package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.modal.bottomsheet.c;

/* loaded from: classes12.dex */
public abstract class tm9 {
    static {
        byk0 byk0Var = cyk0.a;
    }

    public static final void a(an9 an9Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        int i2;
        c530 c530Var;
        boolean z;
        float f;
        c530 c530Var2;
        o430 o430Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-692958391);
        int i3 = i | (btsVar.k(an9Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var3 = c530.a;
            f530 o = an91.o(ljs0.c(c530Var3, 1.0f), 0.0f, 10.0f, 0.0f, 8.0f, 5);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            String str = an9Var.c;
            if (str == null) {
                btsVar.e0(1878142443);
                btsVar.t(false);
                c530Var = c530Var3;
                z = false;
            } else {
                btsVar.e0(1878142444);
                c530Var = c530Var3;
                z = false;
                v0b1.a(mja1.b(str, null, 6), ljs0.n(an91.m(c530Var3, 10.0f, 0.0f, 2), 40.0f, 40.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
                btsVar.t(false);
            }
            CharSequence charSequence = an9Var.a;
            if (charSequence == null) {
                btsVar.e0(1878352933);
                btsVar.t(z);
                f = 8.0f;
                c530Var2 = c530Var;
            } else {
                btsVar.e0(1878352934);
                f = 8.0f;
                c530Var2 = c530Var;
                qgy.b(charSequence, null, an91.o(c530Var, 16.0f, 8.0f, 16.0f, 0.0f, 8), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16378);
                btsVar = btsVar;
                btsVar.t(z);
            }
            CharSequence charSequence2 = an9Var.b;
            o430 o430Var2 = did.a;
            if (charSequence2 == null) {
                btsVar.e0(1878510134);
                btsVar.t(z);
                o430Var = o430Var2;
            } else {
                btsVar.e0(1878510135);
                f530 n = an91.n(c530Var2, 16.0f, 12.0f, 16.0f, 16.0f);
                boolean z2 = (i3 & 112) == 32 ? true : z;
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var2) {
                    Q = new a0(26, tlsVar);
                    btsVar.o0(Q);
                }
                bts btsVar2 = btsVar;
                o430Var = o430Var2;
                qgy.b(charSequence2, null, n, null, 0L, 0L, null, 0L, 0, 0, 0, null, (tls) Q, btsVar2, 0, 0, 8186);
                btsVar = btsVar2;
                btsVar.t(z);
            }
            ButtonStyle buttonStyle = ButtonStyle.Main;
            f530 o3 = an91.o(ljs0.c(c530Var2, 1.0f), f, 4.0f, f, 0.0f, 8);
            boolean z3 = (i3 & 112) == 32 ? true : z;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                tlsVar2 = tlsVar;
                Q2 = new zp5(26, tlsVar2);
                btsVar.o0(Q2);
            } else {
                tlsVar2 = tlsVar;
            }
            k4d.a.getClass();
            d17.c(o3, false, null, buttonStyle, null, (sls) Q2, k4d.b, btsVar, 1575936, 22);
            i2 = 1;
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sm9(an9Var, tlsVar2, i, i2);
        }
    }

    public static final void b(an9 an9Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-229228080);
        int i2 = (btsVar.k(an9Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c.a(null, null, null, false, false, null, null, null, null, null, null, wwg.S(-499416784, true, new l0(5, an9Var, tlsVar), btsVar), btsVar, 0, 48, 2047);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sm9(an9Var, tlsVar, i, 0);
        }
    }
}
