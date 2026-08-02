package defpackage;

import com.yandex.go.payments.data.model.response.PaymentMethods;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public abstract class ysx {
    public static final PaymentMethods.LastPaymentMethod a(PaymentMethods.LastPaymentMethod lastPaymentMethod, List list) {
        if (lastPaymentMethod.a == null) {
            return null;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (jl40.l(((k2a0) it.next()).getA(), lastPaymentMethod.a)) {
                return lastPaymentMethod;
            }
        }
        return null;
    }

    public static final Long b(PaymentMethods.LastPaymentMethod lastPaymentMethod) {
        Object failure;
        String str = lastPaymentMethod.c;
        if (str == null) {
            return null;
        }
        if (evu0.J(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            failure = Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Long) (failure instanceof Result.Failure ? null : failure);
    }

    public static final PaymentMethods.LastPaymentMethod c(PaymentMethods paymentMethods) {
        PaymentMethods.LastPaymentMethod lastPaymentMethod = paymentMethods.k;
        if (lastPaymentMethod != null) {
            e4a0 e4a0Var = lastPaymentMethod.b;
            if (e4a0Var == null) {
                e4a0Var = e4a0.R3;
            }
            PaymentMethod$Type a = e4a0Var.a();
            if (a != null) {
                switch (xsx.a[a.ordinal()]) {
                    case 1:
                    case 2:
                        return lastPaymentMethod;
                    case 3:
                        return a(lastPaymentMethod, paymentMethods.a.a);
                    case 4:
                        return a(lastPaymentMethod, paymentMethods.q.a);
                    case 5:
                        return a(lastPaymentMethod, paymentMethods.c.a);
                    case 6:
                        return a(lastPaymentMethod, paymentMethods.d.a);
                    case 7:
                        return a(lastPaymentMethod, paymentMethods.e.a);
                    case 8:
                        return a(lastPaymentMethod, paymentMethods.g.a);
                    case 9:
                        return a(lastPaymentMethod, paymentMethods.b.a);
                    case 10:
                        return a(lastPaymentMethod, paymentMethods.f.b);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        break;
                    case 21:
                        return a(lastPaymentMethod, paymentMethods.h.a);
                    default:
                        w511.b();
                        return null;
                }
            }
        }
        return null;
    }
}
