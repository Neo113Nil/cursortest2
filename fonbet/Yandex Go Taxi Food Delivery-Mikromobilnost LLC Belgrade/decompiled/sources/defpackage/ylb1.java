package defpackage;

import androidx.compose.foundation.text.selection.j;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class ylb1 {
    public static mgv a;

    public static final void a(boolean z, ResolvedTextDirection resolvedTextDirection, j jVar, fid fidVar, int i) {
        int i2;
        ery0 d;
        dry0 dry0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(jVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean k = (i4 == 4) | btsVar.k(jVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new xkq0(jVar, z);
                btsVar.o0(Q);
            }
            yly0 yly0Var = (yly0) Q;
            boolean e = btsVar.e(jVar) | (i4 == 4);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new coy0(jVar, z);
                btsVar.o0(Q2);
            }
            mv60 mv60Var = (mv60) Q2;
            boolean g = asy0.g(jVar.o().b);
            int i5 = (int) (z ? jVar.o().b >> 32 : jVar.o().b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            oay oayVar = jVar.d;
            float c = (oayVar == null || (d = oayVar.d()) == null || (dry0Var = d.a) == null) ? 0.0f : lnb1.c(dry0Var, i5);
            boolean e2 = btsVar.e(yly0Var);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new ikq0(yly0Var, i3);
                btsVar.o0(Q3);
            }
            pva1.b(mv60Var, z, resolvedTextDirection, g, 0L, c, exw0.a(c530.a, yly0Var, (PointerInputEventHandler) Q3), btsVar, (i2 << 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(z, resolvedTextDirection, jVar, i, 17);
        }
    }

    public static ctb b(tfl0 tfl0Var) {
        return new ctb(tfl0Var);
    }
}
