package defpackage;

import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchActionType;
import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes14.dex */
public final class stv0 {
    public final uy a;
    public final co40 b;

    public stv0(uy uyVar, co40 co40Var) {
        this.a = uyVar;
        this.b = co40Var;
    }

    public static SuperMapAnalytics$SuperMapSearchType a(String str) {
        return evu0.J(str) ? SuperMapAnalytics$SuperMapSearchType.Zerosuggest : SuperMapAnalytics$SuperMapSearchType.Suggest;
    }

    public final void b(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof bxv0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            swv0 swv0Var = ((bxv0) it.next()).d;
            this.a.getClass();
            axv0 a = uy.a(swv0Var);
            e8w0 e8w0Var = a != null ? new e8w0(a.a, a.b, a.c, a.d, a.e, a.f, a.g, a.h, a.i) : null;
            if (e8w0Var != null) {
                arrayList2.add(e8w0Var);
            }
        }
        SuperMapAnalytics$SuperMapSearchType a2 = a(str);
        co40 co40Var = this.b;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", a2.getEventValue());
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((e8w0) it2.next()).j);
        }
        hashMap.put("items_list", arrayList3);
        if (str != null) {
            hashMap.put("search_query", str);
        }
        co40Var.a.a("SuperMap.Search.Shown", hashMap, 1, new HashMap());
    }

    public final void c(SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType, String str) {
        SuperMapAnalytics$SuperMapSearchType a = a(str);
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("type", superMapAnalytics$SuperMapSearchActionType.getEventValue());
        MapBuilder j = mapBuilder.j();
        co40 co40Var = this.b;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", a.getEventValue());
        hashMap.put("action", j);
        if (str != null) {
            hashMap.put("search_query", str);
        }
        co40Var.a.a("SuperMap.Search.Tapped", hashMap, 1, new HashMap());
    }
}
