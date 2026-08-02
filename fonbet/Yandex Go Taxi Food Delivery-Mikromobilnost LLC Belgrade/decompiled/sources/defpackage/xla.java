package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersPaymentMethodsSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class xla {
    public static ChargersPaymentMethodsSection a(String str) {
        Object obj;
        Iterator<E> it = ChargersPaymentMethodsSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ChargersPaymentMethodsSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ChargersPaymentMethodsSection) obj;
    }
}
