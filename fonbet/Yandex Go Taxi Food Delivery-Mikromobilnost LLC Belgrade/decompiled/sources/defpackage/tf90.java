package defpackage;

import java.util.HashMap;
import ru.yandex.common.startup.a;

/* loaded from: classes4.dex */
public abstract class tf90 {
    public static final HashMap a = new HashMap();

    public static a a(String str) {
        if (str == null) {
            ny61.f("Illegal id == null for parser creation");
            return null;
        }
        HashMap hashMap = a;
        if (!hashMap.containsKey(str)) {
            ny61.f(oyr.p("Unknown 'id=", str, "' for parser creation."));
            return null;
        }
        try {
            return (a) ((Class) hashMap.get(str)).newInstance();
        } catch (IllegalAccessException e) {
            ny61.f(e);
            return null;
        } catch (InstantiationException e2) {
            ny61.f(e2);
            return null;
        }
    }
}
