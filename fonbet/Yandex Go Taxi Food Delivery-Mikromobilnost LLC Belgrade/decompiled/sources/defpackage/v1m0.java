package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes.dex */
public final class v1m0 {
    public final LinkedHashMap a;
    public final w1m0 b;

    public v1m0() {
        this.a = new LinkedHashMap();
        this.b = new w1m0(0);
    }

    public final void a(String str, Object obj) {
        if (!pxa1.d(obj)) {
            yci0.x("Can't put value with type ", obj.getClass(), " into saved state");
            return;
        }
        Object obj2 = this.a.get(str);
        dy40 dy40Var = obj2 instanceof dy40 ? (dy40) obj2 : null;
        if (dy40Var != null) {
            dy40Var.l(obj);
        }
        this.b.d(str, obj);
    }

    public v1m0(MapBuilder mapBuilder) {
        this.a = new LinkedHashMap();
        this.b = new w1m0(mapBuilder);
    }
}
