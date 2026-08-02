package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g28 extends oyc {
    public static final g28 a = new g28();
    public static final List b = t75.c(new azc(mhb.DICT));
    public static final mhb c = mhb.STRING;

    public static TreeMap j(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            arrayList.add(next);
        }
        y75.r(arrayList);
        TreeMap treeMap = new TreeMap();
        uah.k(treeMap, new Pair[0]);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                obj = j((JSONObject) obj);
            }
            treeMap.put(str, obj);
        }
        return treeMap;
    }

    public static String k(Object obj) {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj.toString();
            }
            return "\"" + obj + '\"';
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(entry.getKey());
            sb.append("\":");
            Object value = entry.getValue();
            sb.append(value != null ? k(value) : null);
            arrayList.add(sb.toString());
        }
        return dfi.i(new StringBuilder("{"), CollectionsKt.X(arrayList, StringUtils.COMMA, null, null, null, 62), '}');
    }

    @Override // defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        return k(j((JSONObject) ouj.j(list, list)));
    }

    @Override // defpackage.oyc
    public final List b() {
        return b;
    }

    @Override // defpackage.oyc
    public final String c() {
        return "toString";
    }

    @Override // defpackage.oyc
    public final mhb d() {
        return c;
    }

    @Override // defpackage.oyc
    public final boolean f() {
        return false;
    }
}
