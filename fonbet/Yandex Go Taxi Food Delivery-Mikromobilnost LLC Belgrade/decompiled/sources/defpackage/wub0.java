package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.cache.PinCacheMode;

/* loaded from: classes7.dex */
public final class wub0 {
    public final PinCacheMode a;
    public final LinkedHashMap b = new LinkedHashMap();

    public wub0(PinCacheMode pinCacheMode) {
        this.a = pinCacheMode;
    }

    public final List a() {
        return a.J0(this.b.keySet());
    }

    public final void b(mwb0 mwb0Var, Object obj) {
        this.b.put(mwb0Var, obj);
    }

    public final List c() {
        return a.J0(this.b.values());
    }
}
