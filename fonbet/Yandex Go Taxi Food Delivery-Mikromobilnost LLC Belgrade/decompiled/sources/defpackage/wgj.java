package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.b;
import com.yandex.div.evaluable.function.k;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class wgj extends c {
    public final List b;
    public final EvaluableType c;

    public wgj() {
        EvaluableType evaluableType = EvaluableType.URL;
        this.b = scc.g(new kms(evaluableType, false), new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
        this.c = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        String e;
        String str = ((rg21) list.get(0)).a;
        Object b = k.b(list, new rg21(str), false);
        String str2 = b instanceof String ? (String) b : null;
        return (str2 == null || (e = b.e(str2)) == null) ? new rg21(str) : new rg21(e);
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
