package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class qk5 {
    public final List a;

    public qk5(List list) {
        list.getClass();
        this.a = list;
    }

    public final LinkedHashMap a(Map map) {
        Iterator it;
        boolean z;
        List w;
        boolean z2;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                xh5 xh5Var = (xh5) obj;
                List<yh5> list2 = this.a;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (yh5 yh5Var : list2) {
                        int i = yh5Var.a;
                        str.getClass();
                        xh5Var.getClass();
                        map.getClass();
                        switch (i) {
                            case 0:
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(map.size()));
                                for (Map.Entry entry2 : map.entrySet()) {
                                    Object key2 = entry2.getKey();
                                    List list3 = (List) entry2.getValue();
                                    Iterator it3 = it2;
                                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                                    Iterator it4 = list3.iterator();
                                    while (it4.hasNext()) {
                                        arrayList2.add(((xh5) it4.next()).b());
                                    }
                                    linkedHashMap2.put(key2, arrayList2);
                                    it2 = it3;
                                }
                                it = it2;
                                if (xh5Var instanceof dh5) {
                                    zg5 zg5Var = ((dh5) xh5Var).d.f;
                                    w = u75.i(zg5Var != null ? zg5Var.a : null);
                                } else if (xh5Var instanceof lh5) {
                                    w = t75.c(((lh5) xh5Var).d);
                                } else if (xh5Var instanceof mh5) {
                                    w = CollectionsKt.w0(wct.v(((mh5) xh5Var).d));
                                } else if (xh5Var instanceof vh5) {
                                    rh5 rh5Var = ((vh5) xh5Var).d.e;
                                    w = u75.i(rh5Var != null ? rh5Var.a : null);
                                } else if (xh5Var instanceof ph5) {
                                    oh5 oh5Var = ((ph5) xh5Var).d;
                                    String str2 = oh5Var.i.a;
                                    nh5 nh5Var = oh5Var.m;
                                    w = xz0.w(new String[]{str2, nh5Var != null ? nh5Var.a : null});
                                } else if (!(xh5Var instanceof kh5)) {
                                    b6e.s();
                                    z = false;
                                    z2 = z;
                                    break;
                                } else {
                                    jh5 jh5Var = ((kh5) xh5Var).d;
                                    eh5 eh5Var = jh5Var.e;
                                    String str3 = eh5Var != null ? eh5Var.a : null;
                                    fh5 fh5Var = jh5Var.b;
                                    w = xz0.w(new String[]{str3, fh5Var != null ? fh5Var.b.a : null});
                                }
                                List list4 = w;
                                boolean z3 = true;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    Iterator it5 = list4.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            if (!nk5.a((String) it5.next(), linkedHashMap2)) {
                                                z3 = false;
                                            }
                                        }
                                    }
                                }
                                z = z3;
                                if (!z) {
                                    qi5 qi5Var = yh5Var.b;
                                    String b = xh5Var.b();
                                    b.getClass();
                                    qi5.c(qi5Var, "validation", "invalid_action_url", str, b, 8);
                                }
                                z2 = z;
                                break;
                            default:
                                long currentTimeMillis = System.currentTimeMillis();
                                qh5 a = xh5Var.a();
                                Long l = a.c;
                                z2 = false;
                                boolean z4 = l != null ? l.longValue() < currentTimeMillis : true;
                                Long l2 = a.d;
                                boolean z5 = l2 != null ? l2.longValue() > currentTimeMillis : true;
                                if (!z4 || !z5) {
                                    qi5 qi5Var2 = yh5Var.b;
                                    String str4 = !z4 ? "show_after_in_future" : "show_before_in_past";
                                    String b2 = xh5Var.b();
                                    b2.getClass();
                                    qi5.c(qi5Var2, "validation", str4, str, b2, 8);
                                }
                                if (z4 && z5) {
                                    z2 = true;
                                }
                                it = it2;
                                break;
                        }
                        it2 = it;
                        if (!z2) {
                            break;
                        }
                    }
                }
                Iterator it6 = it2;
                arrayList.add(obj);
                it2 = it6;
            }
            linkedHashMap.put(key, arrayList);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            if (!((List) entry3.getValue()).isEmpty()) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        return linkedHashMap3;
    }
}
