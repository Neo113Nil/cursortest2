package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import org.json.JSONObject;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* loaded from: classes11.dex */
public final class ygj extends c {
    public static final ygj b = new ygj();
    public static final String c = "toString";
    public static final List d = Collections.singletonList(new kms(EvaluableType.DICT, false));
    public static final EvaluableType e = EvaluableType.STRING;

    public static TreeMap j(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        xcc.p(arrayList);
        TreeMap treeMap = new TreeMap();
        b.q(treeMap, new Pair[0]);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                b.getClass();
                obj = j((JSONObject) obj);
            }
            treeMap.put(str, obj);
        }
        return treeMap;
    }

    public static String k(Object obj) {
        String str;
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            return "\"" + obj + OpenList.CHAR_QUOTE;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(entry.getKey());
            sb.append("\":");
            Object value = entry.getValue();
            if (value != null) {
                b.getClass();
                str = k(value);
            } else {
                str = null;
            }
            sb.append(str);
            arrayList.add(sb.toString());
        }
        return b64.p(new StringBuilder("{"), a.X(arrayList, ",", null, null, null, 62), '}');
    }

    @Override // com.yandex.div.evaluable.c
    public final Object a(cxq0 cxq0Var, jdo jdoVar, List list) {
        return k(j((JSONObject) a.P(list)));
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
