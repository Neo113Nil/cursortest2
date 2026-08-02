package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract class az0 {
    public static final int a;

    static {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            t7oVar = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Integer num = (Integer) (t7oVar instanceof t7o ? null : t7oVar);
        a = num != null ? num.intValue() : 2097152;
    }
}
