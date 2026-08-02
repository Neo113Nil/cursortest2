package defpackage;

import androidx.compose.ui.viewinterop.b;
import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class s2b1 {
    public static final void a(f530 f530Var, e0v e0vVar, lk31 lk31Var, wls wlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-964576248);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(e0vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(lk31Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(wlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            int i3 = 3;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = lk31Var.a(new cp1(wlsVar, i3));
                btsVar.o0(Q);
            }
            kk31 kk31Var = (kk31) Q;
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean e = btsVar.e(kk31Var);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new gau(10, kk31Var);
                btsVar.o0(Q2);
            }
            tls tlsVar = (tls) Q2;
            boolean e2 = btsVar.e(kk31Var) | ((i2 & 112) == 32);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new mgu(i3, kk31Var, e0vVar);
                btsVar.o0(Q3);
            }
            b.a(tlsVar, c, (tls) Q3, btsVar, 0, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f530Var2, e0vVar, lk31Var, wlsVar, i, 1);
        }
    }

    public static final cyn0 b(List list, String str, Double d, Double d2, String str2, Integer num) {
        if (!list.contains("hub") || str == null || str2 == null || d == null || d2 == null) {
            return null;
        }
        return new cyn0(num != null ? num.intValue() : 100, new zzs(d.doubleValue(), d2.doubleValue(), 0, null, null, 28), str, str2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(l5a0 l5a0Var, String str) {
        n1a0 n1a0Var;
        i1a0 i1a0Var;
        if (l5a0Var != null) {
            PaymentMethodType paymentMethodType = l5a0Var.b;
            String str2 = l5a0Var.a;
            int i = p24.a[paymentMethodType.ordinal()];
            if (i == 1) {
                n1a0Var = new i1a0(str2);
            } else if (i == 2) {
                n1a0Var = new l1a0(str2);
            } else if (i != 3 && i != 4) {
                w511.b();
                return null;
            }
            i1a0Var = str == null ? new i1a0(str) : null;
            if (n1a0Var == null && i1a0Var != null) {
                return new xjt0(n1a0Var, i1a0Var);
            }
            x4c.g("required parameters for dto AutoTopupPaymentParty are null", null, "source=" + n1a0Var + ", target=" + i1a0Var, Collections.singletonList(lrp0.d), 2);
            return new Result.Failure(new Exception("required parameters for dto AutoTopupPaymentParty are null"));
        }
        n1a0Var = null;
        if (str == null) {
        }
        if (n1a0Var == null) {
        }
        x4c.g("required parameters for dto AutoTopupPaymentParty are null", null, "source=" + n1a0Var + ", target=" + i1a0Var, Collections.singletonList(lrp0.d), 2);
        return new Result.Failure(new Exception("required parameters for dto AutoTopupPaymentParty are null"));
    }
}
