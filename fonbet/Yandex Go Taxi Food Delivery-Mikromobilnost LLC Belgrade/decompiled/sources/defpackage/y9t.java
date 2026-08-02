package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.function.b;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y9t extends c53 {
    public static final y9t e = new y9t(EvaluableType.DICT, 0);
    public static final String f = "getOptDictFromArray";
    public static final List g = scc.g(new kms(EvaluableType.ARRAY, false), new kms(EvaluableType.INTEGER, false));

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        Object b = b.b(f, list, false);
        JSONObject jSONObject = b instanceof JSONObject ? (JSONObject) b : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
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
