package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.b;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class qgj extends c {
    public final List b;
    public final EvaluableType c;

    public qgj() {
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
        this.c = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        int i = ((jdc) list.get(0)).a;
        Object b = k.b(list, new jdc(i), false);
        jdc d = b.d(b instanceof String ? (String) b : null);
        return d == null ? new jdc(i) : d;
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
