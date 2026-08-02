package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPaymentMethodsSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class qgo0 {
    public static ScootersPaymentMethodsSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersPaymentMethodsSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersPaymentMethodsSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersPaymentMethodsSection) obj;
    }
}
