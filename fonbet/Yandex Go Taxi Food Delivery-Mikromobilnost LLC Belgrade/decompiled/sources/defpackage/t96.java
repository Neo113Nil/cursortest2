package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class t96 extends c {
    public final List b = scc.g(new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
    public final EvaluableType c = EvaluableType.BOOLEAN;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object a = k.a(c(), list, j());
        Boolean bool = a instanceof Boolean ? (Boolean) a : null;
        if (bool != null) {
            return bool;
        }
        k.d(c(), list, this.c, a, j());
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

    public boolean j() {
        return false;
    }
}
