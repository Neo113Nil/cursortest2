package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.rida.bids.utils.a;
import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$DebtState;
import java.io.File;
import java.io.FileOutputStream;
import ru.yandex.taxi.scooters.data.model.DebtStatus;

/* loaded from: classes11.dex */
public abstract class r1b1 {
    public static final void a(f530 f530Var, wg6 wg6Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1339365056);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wg6Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            tx40 d = a.d(wg6Var, btsVar, (i2 >> 3) & 14, 1);
            f530 h = ljs0.h(f530Var, 12.0f);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, h);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            c530 c530Var = c530.a;
            f530 j = ljs0.j(c530Var, 34.0f, 4.0f);
            boolean k = btsVar.k(d);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new f0(d, 1);
                btsVar.o0(Q);
            }
            pi6.a(bzk0.c(androidx.compose.ui.graphics.d.a(j, (tls) Q), AppColor$Palette.Background, cyk0.c(2.5f)), btsVar, 0);
            pi6.a(bzk0.c(ljs0.j(c530Var, 34.0f, 4.0f), yyf0.a, cyk0.c(2.5f)), btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(f530Var, wg6Var, i, 22);
        }
    }

    public static final ScootersDebtAnalytics$DebtState b(DebtStatus debtStatus) {
        int i = ycn0.a[debtStatus.ordinal()];
        if (i == 1) {
            return ScootersDebtAnalytics$DebtState.RequirePayment;
        }
        if (i == 2) {
            return ScootersDebtAnalytics$DebtState.WaitingPaymentCompleted;
        }
        w511.b();
        return null;
    }

    public static final void c(Bitmap bitmap, File file, int i, int i2) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        bitmap.compress(i != 0 ? i != 1 ? i != 2 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
