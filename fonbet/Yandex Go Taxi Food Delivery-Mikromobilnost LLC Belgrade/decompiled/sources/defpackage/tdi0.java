package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class tdi0 {
    public final LinkedHashMap a = new LinkedHashMap();
    public int b;

    public final void a() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    rdi0 rdi0Var = (rdi0) a.R(arrayList);
                    if ((rdi0Var != null ? (q7v) rdi0Var.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((rdi0) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void b(ii10 ii10Var, q7v q7vVar, Map map, long j) {
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(ii10Var);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(ii10Var, obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        rdi0 rdi0Var = new rdi0(new WeakReference(q7vVar), map, j);
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                rdi0 rdi0Var2 = (rdi0) arrayList.get(i);
                if (j < rdi0Var2.c) {
                    i++;
                } else if (rdi0Var2.a.get() == q7vVar) {
                    arrayList.set(i, rdi0Var);
                } else {
                    arrayList.add(i, rdi0Var);
                }
            }
        } else {
            arrayList.add(rdi0Var);
        }
        a();
    }
}
