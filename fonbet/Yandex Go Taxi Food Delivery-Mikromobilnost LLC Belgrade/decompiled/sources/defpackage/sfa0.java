package defpackage;

import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class sfa0 {
    public static /* synthetic */ rfa0 c(sfa0 sfa0Var, PaymentMethod$Type paymentMethod$Type, String str, PaymentMethod$Type paymentMethod$Type2, String str2, int i) {
        if ((i & 4) != 0) {
            paymentMethod$Type2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return sfa0Var.b(paymentMethod$Type, str, paymentMethod$Type2, str2, null);
    }

    public final rfa0 a(lv90 lv90Var, lv90 lv90Var2) {
        return b(lv90Var.a, lv90Var.b, lv90Var2 != null ? lv90Var2.a : null, lv90Var2 != null ? lv90Var2.b : null, lv90Var.d);
    }

    public final rfa0 b(PaymentMethod$Type paymentMethod$Type, String str, PaymentMethod$Type paymentMethod$Type2, String str2, Boolean bool) {
        if (paymentMethod$Type != null && paymentMethod$Type2 != null) {
            return new rfa0(paymentMethod$Type, str, (String) null, bool, Collections.singletonList(new rfa0(paymentMethod$Type2, str2, (String) null, (Boolean) null, (List) null, 28)), 4);
        }
        PaymentMethod$Type paymentMethod$Type3 = PaymentMethod$Type.CASH;
        return (paymentMethod$Type == paymentMethod$Type3 || paymentMethod$Type == PaymentMethod$Type.GOOGLE_PAY) ? new rfa0(paymentMethod$Type, (String) null, (String) null, bool, (List) null, 22) : (paymentMethod$Type == null || str == null) ? new rfa0(paymentMethod$Type3, (String) null, (String) null, bool, (List) null, 22) : new rfa0(paymentMethod$Type, str, (String) null, bool, (List) null, 20);
    }
}
