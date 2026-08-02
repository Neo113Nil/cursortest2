package defpackage;

import com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalanceExperiment;
import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import com.yandex.go.yb.data.u;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class zaa0 implements q, yaa0 {
    public final /* synthetic */ q a;
    public final u b;
    public final lw90 c;
    public final yla0 d;

    public zaa0(rqo rqoVar, u uVar, lw90 lw90Var, yla0 yla0Var) {
        PaymentMethodsHideBalanceExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(PaymentMethodsHideBalanceExperiment.f);
        this.b = uVar;
        this.c = lw90Var;
        this.d = yla0Var;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (PaymentMethodsHideBalanceExperiment) this.a.c();
    }

    public final boolean d() {
        Object obj;
        nw51 d = this.b.d();
        if (d instanceof jw51) {
            Iterator it = ((jw51) d).c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((uv51) obj).d() == YbSdkPaymentMethodInfo$ProductType.WALLET) {
                    break;
                }
            }
            uv51 uv51Var = (uv51) obj;
            if ((uv51Var != null ? uv51Var.c() : null) != null) {
                PaymentMethod$Type paymentMethod$Type = PaymentMethod$Type.YB_WALLET;
                lw90 lw90Var = this.c;
                lw90Var.getClass();
                if (lw90.c(lw90Var, null, new n65[0], 3).a(paymentMethod$Type).equals(xw91.C)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
