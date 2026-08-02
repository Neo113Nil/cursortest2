package defpackage;

import com.yandex.go.deeplinks.generated.chargers.ChargersStationSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class usa {
    public static ChargersStationSection a(String str) {
        Object obj;
        Iterator<E> it = ChargersStationSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ChargersStationSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ChargersStationSection) obj;
    }
}
