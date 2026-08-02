package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class q9t extends c53 {
    public static final q9t e = new q9t(EvaluableType.ARRAY, 1);
    public static final String f = "getOptArrayFromArray";
    public static final List g = scc.g(new kms(EvaluableType.ARRAY, false), new kms(EvaluableType.INTEGER, false));

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object c = b.c(f, list);
        JSONArray jSONArray = c instanceof JSONArray ? (JSONArray) c : null;
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    @Override // defpackage.c53, com.yandex.div.evaluable.c
    public final List b() {
        return g;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return f;
    }
}
