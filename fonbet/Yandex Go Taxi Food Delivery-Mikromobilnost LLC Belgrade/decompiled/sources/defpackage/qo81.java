package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class qo81 {
    public final boolean a;
    public final abe b;
    public zy2 c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public bw71 i;
    public Integer j;
    public String k;
    public final ArrayList l;
    public final ArrayList m;
    public final LinkedHashMap n;
    public uc71 o;

    public qo81(Context context, boolean z) {
        abe abeVar = new abe(context, 24);
        this.a = z;
        this.b = abeVar;
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new LinkedHashMap();
        this.o = new uc71();
    }

    public final bs81 a() {
        LinkedHashMap linkedHashMap;
        a081 a081Var;
        abe abeVar = this.b;
        LinkedHashMap linkedHashMap2 = this.n;
        bw71 bw71Var = this.i;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            abeVar.getClass();
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(abeVar.a);
        if (a != null ? a.l : false) {
            linkedHashMap = linkedHashMap2;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            ArrayList arrayList = bw71Var != null ? bw71Var.a : null;
            List list = (List) linkedHashMap3.get("impression");
            if (arrayList != null) {
                linkedHashMap3.put("impression", arrayList);
            } else {
                linkedHashMap3.remove("impression");
            }
            if (list != null) {
                linkedHashMap3.put("render_impression", list);
            } else {
                linkedHashMap3.remove("render_impression");
            }
            linkedHashMap = linkedHashMap3;
        }
        return new bs81(this.a, this.l, this.n, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, this.m, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map] */
    public final void b(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if (linkedHashMap == null) {
            linkedHashMap2 = b.f();
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str = (String) entry.getKey();
            Iterable iterable = (List) entry.getValue();
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            Iterator it = ((ArrayList) a.M(iterable)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                LinkedHashMap linkedHashMap3 = this.n;
                Object obj = linkedHashMap3.get(str);
                if (obj == null) {
                    obj = qv10.w(str, linkedHashMap3);
                }
                ((List) obj).add(str2);
            }
        }
    }
}
