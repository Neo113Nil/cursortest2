package defpackage;

import com.yandex.go.due.data.api.dto.DuePricingDataParam;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes12.dex */
public final class wwm {
    public final dqe0 a;
    public final qbl0 b;
    public final yvf0 c;
    public final xjg d;

    public wwm(dqe0 dqe0Var, qbl0 qbl0Var, dqx0 dqx0Var, xjg xjgVar) {
        this.a = dqe0Var;
        this.b = qbl0Var;
        this.c = dqx0Var;
        this.d = xjgVar;
    }

    public final DuePricingDataParam a(b580 b580Var) {
        rfa0 rfa0Var;
        dbl0 b = this.b.b();
        d0l0 d0l0Var = this.a.a.G;
        zzk0 zzk0Var = d0l0.Companion;
        List d = d0l0Var.d(false, false);
        List d2 = this.d.d(b580Var);
        lv90 a = ((gay0) this.c.get()).b.a();
        if (a.a != null) {
            PaymentMethod$Type paymentMethod$Type = a.a;
            if (paymentMethod$Type == null) {
                ny61.g("Required value was null.");
                return null;
            }
            rfa0Var = new rfa0(paymentMethod$Type, a.b, (String) null, (Boolean) null, (List) null, 28);
        } else {
            rfa0Var = null;
        }
        return new DuePricingDataParam(d, d2, rfa0Var, b != null ? b.d : null);
    }
}
