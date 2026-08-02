package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class u4x {
    public final t5x a;
    public final b5x b;
    public final suc c;

    public u4x(t5x t5xVar, b5x b5xVar, int i) {
        t5xVar = (i & 1) != 0 ? null : t5xVar;
        b5xVar = (i & 2) != 0 ? null : b5xVar;
        this.a = t5xVar;
        this.b = b5xVar;
        this.c = new suc();
    }

    public final f5x a(v5x v5xVar, d6x d6xVar) {
        try {
            Pair pair = (Pair) this.c.get();
            juw juwVar = (juw) pair.getFirst();
            jje jjeVar = (jje) pair.getSecond();
            t5x t5xVar = this.a;
            b5x b5xVar = this.b;
            Map map = v5xVar.c;
            jjeVar.getClass();
            ArrayList arrayList = jjeVar.e;
            jjeVar.a = t5xVar;
            jjeVar.b = b5xVar;
            jjeVar.c = d6xVar;
            jjeVar.d = map;
            arrayList.clear();
            return new e5x(jjeVar.c, a.J0(arrayList), juwVar.a(jjeVar, v5xVar.b));
        } catch (Throwable th) {
            return new d5x(th);
        }
    }

    public u4x() {
        this(null, null, 15);
    }
}
