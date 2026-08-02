package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import com.yandex.div.evaluable.function.k;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes11.dex */
public final class r9t extends c {
    public static final r9t b = new r9t();
    public static final String c = "getOptArrayFromDict";
    public static final List d = scc.g(new kms(EvaluableType.DICT, false), new kms(EvaluableType.STRING, true));
    public static final EvaluableType e = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        JSONArray jSONArray = new JSONArray();
        Object b2 = k.b(list, jSONArray, true);
        JSONArray jSONArray2 = b2 instanceof JSONArray ? (JSONArray) b2 : null;
        return jSONArray2 == null ? jSONArray : jSONArray2;
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
