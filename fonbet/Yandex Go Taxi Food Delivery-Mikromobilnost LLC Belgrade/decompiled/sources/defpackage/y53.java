package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class y53 extends c53 {
    public y53() {
        super(EvaluableType.BOOLEAN, 1);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(c(), list);
        Boolean bool = c instanceof Boolean ? (Boolean) c : null;
        return bool == null ? list.get(2) : bool;
    }
}
