package defpackage;

import java.util.Iterator;
import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;

/* loaded from: classes6.dex */
public final class r6u0 {
    public static StaticMapImageConfig$MapType a(String str) {
        Object obj;
        Iterator<E> it = StaticMapImageConfig$MapType.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((StaticMapImageConfig$MapType) obj).getValue(), str)) {
                break;
            }
        }
        StaticMapImageConfig$MapType staticMapImageConfig$MapType = (StaticMapImageConfig$MapType) obj;
        return staticMapImageConfig$MapType == null ? StaticMapImageConfig$MapType.MAP : staticMapImageConfig$MapType;
    }
}
