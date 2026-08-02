package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;

/* loaded from: classes11.dex */
public final class xdt extends wdt {
    public static final xdt d = new xdt();
    public static final List e;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        e = scc.g(new kms(evaluableType, false), new kms(evaluableType, false));
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return e;
    }

    @Override // com.yandex.div.evaluable.function.n
    public final Object k(List list) {
        return new jdc(wwg.B((String) list.get(1)));
    }
}
