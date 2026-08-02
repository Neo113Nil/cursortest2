package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.text.contextmenu.internal.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferPaymentInitiatedChosenMethod;
import com.ybsdk.core.transfer.utils.domain.entities.AnalyticsSourceScreen;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class wva1 {
    public static final void a(f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2064964257);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            b(f530Var, aVar, btsVar, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tc2(f530Var, aVar, i, i3);
        }
    }

    public static final void b(f530 f530Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(771959668);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.i(null, x4c.Q);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new w01(i3, oz40Var);
                btsVar.o0(Q2);
            }
            sb2.b(jly0.b.a(f((sls) Q2, btsVar, 0)), wwg.S(-291176396, true, new xx8(11, f530Var, oz40Var, aVar), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tc2(f530Var, aVar, i, i3);
        }
    }

    public static npg c(int i) {
        int i2 = tw21.a;
        Locale locale = Locale.US;
        return new npg(Uri.parse("rtp://0.0.0.0:" + i));
    }

    public static /* synthetic */ void e(hxs hxsVar, String str, AnalyticsSourceScreen analyticsSourceScreen, TransferEvents$TransferPaymentInitiatedChosenMethod transferEvents$TransferPaymentInitiatedChosenMethod, String str2, String str3, String str4, String str5, String str6, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        hxsVar.a(str, analyticsSourceScreen, transferEvents$TransferPaymentInitiatedChosenMethod, str2, str3, str4, str5, str6, null);
    }

    public static final b f(sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        boolean k = btsVar.k(view);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            Q = new b(view, null, slsVar);
            btsVar.o0(Q);
        }
        b bVar = (b) Q;
        boolean e = btsVar.e(bVar);
        Object Q2 = btsVar.Q();
        if (e || Q2 == o430Var) {
            Q2 = new oc2(bVar, 3);
            btsVar.o0(Q2);
        }
        zpn.a(bVar, (tls) Q2, btsVar);
        return bVar;
    }

    public static int g(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }
}
