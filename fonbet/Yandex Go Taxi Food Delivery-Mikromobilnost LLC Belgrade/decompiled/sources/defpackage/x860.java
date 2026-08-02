package defpackage;

import com.ybsdk.feature.nfc.api.models.NfcPaymentScenario;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class x860 {
    public static NfcPaymentScenario a(Integer num) {
        Object obj;
        Iterator<E> it = NfcPaymentScenario.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int value = ((NfcPaymentScenario) obj).getValue();
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        return (NfcPaymentScenario) obj;
    }
}
