package defpackage;

import android.view.View;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes5.dex */
public abstract class rhd {
    public static final void a(pey peyVar, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1521683263);
        int i2 = i | 2 | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                peyVar = (pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            } else {
                btsVar.Y();
            }
            int i3 = i2 & (-15);
            btsVar.u();
            boolean e = btsVar.e(peyVar) | ((i3 & 112) == 32);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new a7b(25, peyVar, wlsVar);
                btsVar.o0(Q);
            }
            zpn.a(peyVar, (tls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(peyVar, wlsVar, i, 23);
        }
    }

    public static final oz40 b(fid fidVar) {
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(Boolean.FALSE);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean e = btsVar.e(view);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new a7b(26, view, oz40Var);
            btsVar.o0(Q2);
        }
        zpn.a(view, (tls) Q2, btsVar);
        return oz40Var;
    }
}
