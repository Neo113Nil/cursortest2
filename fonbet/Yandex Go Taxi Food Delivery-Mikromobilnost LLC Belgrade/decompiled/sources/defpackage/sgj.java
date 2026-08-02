package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class sgj extends c {
    public final List b;
    public final EvaluableType c;

    public sgj() {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
        this.c = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Long l = (Long) list.get(0);
        long longValue = l.longValue();
        Object b = k.b(list, l, false);
        if (b instanceof Integer) {
            longValue = ((Number) b).intValue();
        } else if (b instanceof Long) {
            longValue = ((Number) b).longValue();
        }
        return Long.valueOf(longValue);
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }
}
