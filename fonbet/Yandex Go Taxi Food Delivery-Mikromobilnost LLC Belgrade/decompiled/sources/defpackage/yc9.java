package defpackage;

import java.util.Calendar;
import java.util.function.Consumer;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class yc9 {
    public final String a;
    public final String b;
    public final Calendar c;
    public final PaymentMethod$Type d;
    public final String e;
    public final String f;
    public final Runnable g;
    public final Consumer h;

    public yc9(String str, String str2, Calendar calendar, PaymentMethod$Type paymentMethod$Type, String str3, String str4, l9 l9Var, qa0 qa0Var) {
        this.a = str;
        this.b = str2;
        this.c = calendar;
        this.d = paymentMethod$Type;
        this.e = str3;
        this.f = str4;
        this.g = l9Var;
        this.h = qa0Var;
    }

    public final String toString() {
        StringBuilder v = b64.v("ChangePaymentMethodParam(id='", this.a, "', orderId='", this.b, "', now=");
        v.append(this.c);
        v.append(", paymentMethodType=");
        v.append(this.d);
        v.append(", paymentMethodId=");
        return g8e.r(v, this.e, ", tipsValue='", this.f, "')");
    }
}
