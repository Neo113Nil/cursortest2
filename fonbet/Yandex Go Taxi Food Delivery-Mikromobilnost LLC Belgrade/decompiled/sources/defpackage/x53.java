package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class x53 extends c53 {
    public x53() {
        super(EvaluableType.NUMBER, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(c(), list, j());
        Number number = b instanceof Number ? (Number) b : null;
        if (number != null) {
            return Double.valueOf(number.doubleValue());
        }
        b.g(c(), list, this.c, b, j());
        throw null;
    }
}
