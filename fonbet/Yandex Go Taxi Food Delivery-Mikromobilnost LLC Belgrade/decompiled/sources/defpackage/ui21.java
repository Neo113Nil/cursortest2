package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import yads.wy1;

/* loaded from: classes10.dex */
public final class ui21 {
    public final LinkedHashMap a;

    public ui21(List list, b181 b181Var, o081 o081Var, iz71 iz71Var, bl61 bl61Var, fj71 fj71Var) {
        int d = gw00.d(tcc.n(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uy71 uy71Var = (uy71) it.next();
            String str = uy71Var.a;
            fj71 fj71Var2 = uy71Var.d;
            b181 b181Var2 = b181Var;
            o081 o081Var2 = o081Var;
            Pair pair = new Pair(str, new wy1(uy71Var, b181Var2, o081Var2, iz71Var, fj71Var2 == null ? fj71Var : fj71Var2, bl61Var));
            linkedHashMap.put(pair.c(), pair.f());
            b181Var = b181Var2;
            o081Var = o081Var2;
        }
        this.a = linkedHashMap;
    }

    public hyq0 a() {
        hyq0 hyq0Var = new hyq0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            ti21 ti21Var = (ti21) entry.getValue();
            if (ti21Var.f && ti21Var.e) {
                String str = (String) entry.getKey();
                hyq0Var.a(ti21Var.a);
                arrayList.add(str);
            }
        }
        arrayList.toString();
        sgb1.g(3, "UseCaseAttachState");
        return hyq0Var;
    }

    public hyq0 b() {
        hyq0 hyq0Var = new hyq0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            ti21 ti21Var = (ti21) entry.getValue();
            if (ti21Var.e) {
                hyq0Var.a(ti21Var.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        sgb1.g(3, "UseCaseAttachState");
        return hyq0Var;
    }

    public Collection c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (((ti21) entry.getValue()).e) {
                arrayList.add(((ti21) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection d() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            if (((ti21) entry.getValue()).e) {
                arrayList.add(((ti21) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public boolean e(String str) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            return ((ti21) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public void f(String str, jyq0 jyq0Var, xi21 xi21Var, lru0 lru0Var, List list) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            ti21 ti21Var = new ti21(jyq0Var, xi21Var, lru0Var, list);
            ti21 ti21Var2 = (ti21) linkedHashMap.get(str);
            ti21Var.e = ti21Var2.e;
            ti21Var.f = ti21Var2.f;
            linkedHashMap.put(str, ti21Var);
        }
    }

    public ui21(List list) {
        int d = gw00.d(tcc.n(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uy71 uy71Var = (uy71) it.next();
            Pair pair = new Pair(uy71Var.a, uy71Var.c);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.a = linkedHashMap;
    }

    public ui21(String str) {
        this.a = new LinkedHashMap();
    }
}
