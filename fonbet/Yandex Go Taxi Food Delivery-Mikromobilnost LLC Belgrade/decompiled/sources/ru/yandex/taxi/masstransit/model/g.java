package ru.yandex.taxi.masstransit.model;

import defpackage.gw00;
import defpackage.k4o;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v231;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public abstract class g {
    public static final LinkedHashMap a;

    static {
        k4o a2 = RouteType.a();
        int d = gw00.d(tcc.n(a2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator<E> it = a2.iterator();
        while (it.hasNext()) {
            Pair pair = new Pair(((RouteType) it.next()).getType(), new VariantStyle("", scc.g(new VariantStyle.a(new VariantStyle.b(2), VariantStyle.VariantType.MARK, 88), new VariantStyle.a(new VariantStyle.b(1), VariantStyle.VariantType.DOT, 228))));
            linkedHashMap.put(pair.c(), pair.f());
        }
        a = linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        if (r4 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashMap a(Map map) {
        Set<Map.Entry> entrySet = a.entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            VariantStyle variantStyle = (VariantStyle) entry.getValue();
            VariantStyle variantStyle2 = (VariantStyle) map.get(str);
            if (variantStyle2 != null) {
                List list = variantStyle2.b;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        VariantStyle.a aVar = (VariantStyle.a) it.next();
                        if (aVar.a.b() > aVar.a.a()) {
                            break;
                        }
                    } else {
                        List x0 = kotlin.collections.a.x0(list, new v231());
                        int size = x0.size();
                        for (int i = 1; i < size; i++) {
                            if (((VariantStyle.a) x0.get(i - 1)).a.b() >= ((VariantStyle.a) x0.get(i)).a.a()) {
                            }
                        }
                    }
                }
            }
            variantStyle2 = variantStyle;
            if (variantStyle2.b.isEmpty()) {
                variantStyle2 = new VariantStyle(variantStyle2.a, variantStyle.b);
            }
            Pair pair = new Pair(str, variantStyle2);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }
}
