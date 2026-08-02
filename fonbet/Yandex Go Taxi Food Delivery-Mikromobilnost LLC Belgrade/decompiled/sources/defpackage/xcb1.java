package defpackage;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes6.dex */
public abstract class xcb1 {
    public static mgv a;

    public static final int a(LookaheadCapablePlaceable lookaheadCapablePlaceable, kt1 kt1Var) {
        LookaheadCapablePlaceable G0 = lookaheadCapablePlaceable.G0();
        if (G0 == null) {
            ixv.b("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line");
        }
        if (lookaheadCapablePlaceable.J0().b().containsKey(kt1Var)) {
            Integer num = (Integer) lookaheadCapablePlaceable.J0().b().get(kt1Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int u = G0.u(kt1Var);
            if (u != Integer.MIN_VALUE) {
                G0.C = true;
                lookaheadCapablePlaceable.D = true;
                lookaheadCapablePlaceable.P0();
                G0.C = false;
                lookaheadCapablePlaceable.D = false;
                return u + ((int) (kt1Var instanceof bqu ? G0.L0() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : G0.L0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final bj70 b(j37 j37Var) {
        return new bj70(new oi70(j37Var.a, j37Var.c), j37Var.b, j37Var.d);
    }
}
