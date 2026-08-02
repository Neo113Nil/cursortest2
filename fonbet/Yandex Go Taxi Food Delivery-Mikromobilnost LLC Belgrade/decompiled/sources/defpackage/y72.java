package defpackage;

import java.util.Map;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;

/* loaded from: classes9.dex */
public final class y72 {
    public final Map a;

    public y72(Map map) {
        this.a = map;
    }

    public final Class a(AndroidComponentRepository$Component androidComponentRepository$Component) {
        Class cls = (Class) this.a.get(androidComponentRepository$Component);
        if (cls != null) {
            return cls;
        }
        kbs.f(androidComponentRepository$Component, "Unknown component passed: ");
        return null;
    }
}
