package defpackage;

import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class t310 {
    public static MasstransitPaymentBleExitBehavior a(String str) {
        Object obj;
        Iterator<E> it = MasstransitPaymentBleExitBehavior.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((MasstransitPaymentBleExitBehavior) obj).getValue(), str, true)) {
                break;
            }
        }
        return (MasstransitPaymentBleExitBehavior) obj;
    }
}
