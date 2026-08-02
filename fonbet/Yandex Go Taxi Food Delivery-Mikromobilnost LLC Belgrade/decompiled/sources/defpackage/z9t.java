package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class z9t extends c {
    public static final z9t b = new z9t();
    public static final String c = "getOptDictFromDict";
    public static final List d;
    public static final EvaluableType e;

    static {
        EvaluableType evaluableType = EvaluableType.DICT;
        d = scc.g(new kms(evaluableType, false), new kms(EvaluableType.STRING, true));
        e = evaluableType;
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        JSONObject jSONObject = new JSONObject();
        Object b2 = k.b(list, jSONObject, true);
        JSONObject jSONObject2 = b2 instanceof JSONObject ? (JSONObject) b2 : null;
        return jSONObject2 == null ? jSONObject : jSONObject2;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return d;
    }

    @Override // com.yandex.div.evaluable.c
    public final String c() {
        return c;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return e;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }
}
