package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;
import kotlin.Result;

/* loaded from: classes11.dex */
public abstract class t43 extends c53 {
    public t43() {
        super(EvaluableType.COLOR, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object failure;
        Object b = b.b(c(), list, j());
        if (b instanceof jdc) {
            return b;
        }
        if (!(b instanceof String)) {
            b.g(c(), list, this.c, b, j());
            throw null;
        }
        try {
            failure = new jdc(wwg.B((String) b));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        b.f(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
        throw null;
    }
}
