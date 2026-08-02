package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.source.factory.a;

/* loaded from: classes9.dex */
public final class rn00 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final clm0 a(MapObjectType mapObjectType, float f) {
        List a;
        qn00 qn00Var = (qn00) this.a.get(mapObjectType);
        Object obj = null;
        if (qn00Var == null || (a = qn00Var.a()) == null) {
            return null;
        }
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (a.d(((clm0) next).b(), f)) {
                obj = next;
                break;
            }
        }
        return (clm0) obj;
    }
}
