package defpackage;

import com.yandex.go.deeplinks.generated.add_payment_method.AddPaymentMethodType;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class ri0 {
    public static AddPaymentMethodType a(String str) {
        Object obj;
        Iterator<E> it = AddPaymentMethodType.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((AddPaymentMethodType) obj).getValue(), str, true)) {
                break;
            }
        }
        return (AddPaymentMethodType) obj;
    }
}
