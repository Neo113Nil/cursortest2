package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class wft extends c {
    public final List b = Collections.singletonList(new kms(EvaluableType.DICT, false));
    public final EvaluableType c = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        JSONObject jSONObject = (JSONObject) list.get(0);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            jSONArray.put(jSONObject.get(keys.next()));
        }
        return jSONArray;
    }

    @Override // com.yandex.div.evaluable.c
    public final List b() {
        return this.b;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        return false;
    }
}
