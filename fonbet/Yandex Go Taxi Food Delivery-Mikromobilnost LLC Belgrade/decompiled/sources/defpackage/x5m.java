package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class x5m extends c {
    public static final x5m b = new x5m();
    public static final String c = "min";
    public static final List d;
    public static final EvaluableType e;
    public static final boolean f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        d = Collections.singletonList(new kms(evaluableType, true));
        e = evaluableType;
        f = true;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        if (list.isEmpty()) {
            b.e(c, list, "Function requires non empty argument list.", null);
            throw null;
        }
        Object P = a.P(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P = Double.valueOf(Math.min(((Double) P).doubleValue(), ((Double) it.next()).doubleValue()));
        }
        return P;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return d;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return e;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return f;
    }
}
