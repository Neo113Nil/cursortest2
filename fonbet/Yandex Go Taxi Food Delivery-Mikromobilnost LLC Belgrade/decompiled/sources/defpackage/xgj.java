package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class xgj extends c {
    public final List b;
    public final EvaluableType c;

    public xgj() {
        kms kmsVar = new kms(EvaluableType.DICT, false);
        EvaluableType evaluableType = EvaluableType.STRING;
        this.b = scc.g(kmsVar, new kms(evaluableType, true));
        this.c = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object a = k.a(c(), list, j());
        String str = a instanceof String ? (String) a : null;
        if (str != null) {
            return str;
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
