package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;
import kotlin.Result;

/* loaded from: classes11.dex */
public abstract class z53 extends c53 {
    public z53() {
        super(EvaluableType.COLOR, 1);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object failure;
        Object c = b.c(c(), list);
        jdc jdcVar = c instanceof jdc ? (jdc) c : null;
        if (jdcVar != null) {
            return jdcVar;
        }
        String str = c instanceof String ? (String) c : null;
        if (str != null) {
            try {
                failure = new jdc(wwg.B(str));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            r2 = (jdc) (failure instanceof Result.Failure ? null : failure);
        }
        return r2 == null ? list.get(2) : r2;
    }
}
