package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersSubscriptionSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class xyo0 {
    public static ScootersSubscriptionSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersSubscriptionSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersSubscriptionSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersSubscriptionSection) obj;
    }
}
