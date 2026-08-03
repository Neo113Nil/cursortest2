package c5;

import a0.a0;
import ac.o;
import g5.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m0.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1234a;

    public d() {
        this.f1234a = new ArrayList();
    }

    public boolean a(q0 q0Var, Object obj) {
        ArrayList arrayList = q0Var.f4713a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof m0.a) {
                if (obj2.equals(obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof q0)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (a((q0) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(oc.c cVar) {
        if (((j) this.f1234a).f2531h.get() != null) {
            throw new ClassCastException();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cVar.invoke(new a0(7, linkedHashSet));
        j jVar = (j) this.f1234a;
        String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        pc.j.e(strArr2, "queryKeys");
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        synchronized (jVar.f2534k) {
            for (String str : strArr2) {
                Set set = (Set) jVar.f2534k.get(str);
                if (set != null) {
                    linkedHashSet2.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            ((e5.a) it.next()).f2107a.s(o.f277a);
        }
    }

    public d(j jVar) {
        this.f1234a = jVar;
    }

    public void c(q0 q0Var, Object obj) {
    }
}
