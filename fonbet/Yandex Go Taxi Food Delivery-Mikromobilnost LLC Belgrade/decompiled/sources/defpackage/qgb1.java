package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;

/* loaded from: classes11.dex */
public abstract class qgb1 {
    public static final void a(rhu0 rhu0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1645578950);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rhu0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new bgc(12);
                btsVar.o0(Q);
            }
            wg6 a = b.a(false, 0.0f, null, false, null, null, null, (sls) Q, btsVar, 0, 384, 4095);
            a S = wwg.S(-1231118188, true, new asr0(i3, tlsVar), btsVar);
            a S2 = wwg.S(116785702, true, new nhu0(0, rhu0Var, tlsVar), btsVar);
            btsVar = btsVar;
            c.a(c530.a, a, null, false, false, null, null, S, null, null, null, S2, btsVar, 12582918, 48, 1916);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(rhu0Var, tlsVar, i, 25);
        }
    }

    public static final void b(String str) {
        if (b9v.c) {
            String obj = str.toString();
            if (obj == null) {
                obj = "null";
            }
            Log.i("flutter_image_compress", obj);
        }
    }

    public abstract void c(ViewGroup viewGroup);
}
