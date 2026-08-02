package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersAutoselectSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class uzm0 {
    public static ScootersAutoselectSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersAutoselectSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersAutoselectSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersAutoselectSection) obj;
    }
}
