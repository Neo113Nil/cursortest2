package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersDvizhSubscriptionSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class tx9 {
    public static ChargersDvizhSubscriptionSection a(String str) {
        Object obj;
        Iterator<E> it = ChargersDvizhSubscriptionSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ChargersDvizhSubscriptionSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ChargersDvizhSubscriptionSection) obj;
    }
}
