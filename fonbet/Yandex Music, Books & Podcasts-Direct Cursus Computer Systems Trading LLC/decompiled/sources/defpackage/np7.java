package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class np7 implements pve {
    public boolean a;
    public final LinkedHashMap b = new LinkedHashMap();
    public boolean c = true;

    public np7(boolean z) {
        this.a = z;
    }

    @Override // defpackage.irl
    public final void a(Set set) {
        set.getClass();
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.clear();
        for (Object obj : set) {
            linkedHashMap.put(obj, ((hrl) obj).d ? mp7.a : mp7.c);
        }
        g();
    }

    @Override // defpackage.irl
    public final void b(hrl hrlVar) {
        hrlVar.getClass();
        this.b.put(hrlVar, mp7.a);
        g();
    }

    @Override // defpackage.pve
    public final void c() {
        this.c = true;
        g();
    }

    @Override // defpackage.pve
    public final void d(boolean z) {
        this.a = z;
    }

    @Override // defpackage.irl
    public final void e(Set set) {
        set.getClass();
        for (Object obj : set) {
            this.b.put(obj, mp7.c);
        }
        g();
    }

    @Override // defpackage.irl
    public final void f(Set set) {
        set.getClass();
        for (Object obj : set) {
            this.b.put(obj, mp7.b);
        }
        g();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function0, uif] */
    public final void g() {
        boolean z = this.c;
        LinkedHashMap linkedHashMap = this.b;
        Object obj = null;
        if ((!z || !this.a) && !linkedHashMap.isEmpty()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((hrl) entry.getKey()).b == 1 && entry.getValue() != mp7.c) {
                    Iterator it = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        hrl hrlVar = (hrl) next;
                        if (hrlVar.b == 1 && !hrlVar.c && hrlVar.d) {
                            obj = next;
                            break;
                        }
                    }
                    hrl hrlVar2 = (hrl) obj;
                    if (hrlVar2 != null) {
                        hrlVar2.a.invoke();
                        return;
                    }
                    return;
                }
            }
        }
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            hrl hrlVar3 = (hrl) next2;
            if (hrlVar3.b == 0 && !hrlVar3.c) {
                obj = next2;
                break;
            }
        }
        hrl hrlVar4 = (hrl) obj;
        if (hrlVar4 != null) {
            hrlVar4.a.invoke();
        }
    }

    @Override // defpackage.pve
    public final void onResume() {
        this.c = false;
        g();
    }
}
