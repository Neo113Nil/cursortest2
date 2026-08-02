package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.b;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class rgj extends c {
    public final List b;
    public final EvaluableType c;

    public rgj() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.DICT, false), new kms(evaluableType, true));
        this.c = EvaluableType.COLOR;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        Object b = k.b(list, str, false);
        jdc d = b.d(b instanceof String ? (String) b : null);
        if (d != null) {
            return d;
        }
        jdc d2 = b.d(str);
        if (d2 != null) {
            return d2;
        }
        b.i(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
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
