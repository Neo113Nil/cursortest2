package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class y43 extends c53 {
    public y43() {
        super(EvaluableType.DICT, 0);
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(c(), list, j());
        JSONObject jSONObject = b instanceof JSONObject ? (JSONObject) b : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        b.g(c(), list, this.c, b, j());
        throw null;
    }
}
