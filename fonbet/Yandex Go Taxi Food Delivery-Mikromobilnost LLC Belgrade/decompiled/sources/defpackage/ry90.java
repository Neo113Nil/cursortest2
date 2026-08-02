package defpackage;

import com.yandex.go.payments.data.model.response.Availability;
import com.yandex.go.payments.data.model.response.DeliveryPaymentMethod;
import com.yandex.go.payments.data.model.response.PersonalAccount;

/* loaded from: classes8.dex */
public final class ry90 {
    public static String a(k2a0 k2a0Var) {
        Availability f = k2a0Var.getF();
        if (f == null || f.a) {
            return null;
        }
        String str = f.b;
        return str == null ? "" : str;
    }

    public static String b(k2a0 k2a0Var) {
        if (k2a0Var instanceof DeliveryPaymentMethod) {
            DeliveryPaymentMethod deliveryPaymentMethod = (DeliveryPaymentMethod) k2a0Var;
            String a = a(deliveryPaymentMethod);
            if (a != null) {
                return a;
            }
            DeliveryPaymentMethod.DisableReason d = deliveryPaymentMethod.b.getD();
            if (d != null) {
                return d.getB();
            }
            return null;
        }
        if (!(k2a0Var instanceof PersonalAccount)) {
            return a(k2a0Var);
        }
        PersonalAccount personalAccount = (PersonalAccount) k2a0Var;
        boolean z = personalAccount.g;
        Availability availability = personalAccount.j;
        if (!(z && availability.a) && availability.c == null) {
            return a(personalAccount);
        }
        return null;
    }
}
