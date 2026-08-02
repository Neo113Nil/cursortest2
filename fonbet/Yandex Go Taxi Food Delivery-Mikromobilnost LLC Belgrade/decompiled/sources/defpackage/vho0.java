package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPhotocheckSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class vho0 {
    public static ScootersPhotocheckSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersPhotocheckSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersPhotocheckSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersPhotocheckSection) obj;
    }
}
