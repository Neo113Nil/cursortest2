package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.b;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class vgj extends c {
    public final List b;
    public final EvaluableType c;

    public vgj() {
        EvaluableType evaluableType = EvaluableType.STRING;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.DICT, false), new kms(evaluableType, true));
        this.c = EvaluableType.URL;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String str = (String) list.get(0);
        Object b = k.b(list, str, false);
        String e = b.e(b instanceof String ? (String) b : null);
        if (e != null) {
            return new rg21(e);
        }
        String e2 = b.e(str);
        if (e2 != null) {
            return new rg21(e2);
        }
        b.i(c(), "Unable to convert value to Url.", list);
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
