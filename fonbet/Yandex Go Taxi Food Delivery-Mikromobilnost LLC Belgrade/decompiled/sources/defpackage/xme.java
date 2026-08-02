package defpackage;

import com.fluttercandies.photo_manager.constant.AssetType;
import defpackage.d4r;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

/* loaded from: classes10.dex */
public abstract class xme {
    public static HashMap a(d93 d93Var) {
        HashMap h = b.h(new Pair("id", String.valueOf(d93Var.a)), new Pair("duration", Long.valueOf(d93Var.c / 1000)), new Pair("type", Integer.valueOf(d93Var.g)), new Pair("createDt", Long.valueOf(d93Var.d)), new Pair("width", Integer.valueOf(d93Var.e)), new Pair("height", Integer.valueOf(d93Var.f)), new Pair("orientation", Integer.valueOf(d93Var.j)), new Pair("is_favorite", Boolean.valueOf(d93Var.k)), new Pair("modifiedDt", Long.valueOf(d93Var.i)), new Pair("lat", null), new Pair("lng", null), new Pair("title", d93Var.h), new Pair("relativePath", d93Var.n));
        h.put("mimeType", d93Var.m);
        return h;
    }

    public static Map b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((d93) it.next()));
        }
        return gw00.e(new Pair(Constants.KEY_DATA, arrayList));
    }

    public static Map c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h93 h93Var = (h93) it.next();
            int i = h93Var.c;
            if (i != 0) {
                LinkedHashMap l = b.l(new Pair("id", h93Var.a), new Pair("name", h93Var.b), new Pair("assetCount", Integer.valueOf(i)), new Pair("isAll", Boolean.valueOf(h93Var.e)));
                Long l2 = h93Var.f;
                if (l2 != null) {
                    l.put("modified", l2);
                }
                arrayList.add(l);
            }
        }
        return gw00.e(new Pair(Constants.KEY_DATA, arrayList));
    }

    public static tqg d(Map map) {
        return new tqg(Long.parseLong(String.valueOf(map.get("min"))), Long.parseLong(String.valueOf(map.get(CspBioProgressConstants.MAX))), Boolean.parseBoolean(String.valueOf(map.get("ignore"))));
    }

    public static d4r e(Map map, AssetType assetType) {
        String lowerCase = assetType.name().toLowerCase(Locale.ROOT);
        if (map.containsKey(lowerCase)) {
            Object obj = map.get(lowerCase);
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                d4r d4rVar = new d4r();
                Map map3 = (Map) map2.get("size");
                d4r.b bVar = new d4r.b();
                bVar.a = ((Integer) map3.get("minWidth")).intValue();
                bVar.b = ((Integer) map3.get("maxWidth")).intValue();
                bVar.c = ((Integer) map3.get("minHeight")).intValue();
                bVar.d = ((Integer) map3.get("maxHeight")).intValue();
                bVar.e = ((Boolean) map3.get("ignoreSize")).booleanValue();
                d4rVar.a = bVar;
                Map map4 = (Map) map2.get("duration");
                d4r.a aVar = new d4r.a();
                aVar.a = ((Integer) map4.get("min")).intValue();
                aVar.b = ((Integer) map4.get(CspBioProgressConstants.MAX)).intValue();
                aVar.c = ((Boolean) map4.get("allowNullable")).booleanValue();
                d4rVar.b = aVar;
                return d4rVar;
            }
        }
        return new d4r();
    }
}
