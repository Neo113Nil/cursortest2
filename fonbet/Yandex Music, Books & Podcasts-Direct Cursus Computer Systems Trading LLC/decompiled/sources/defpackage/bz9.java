package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class bz9 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    public final tgi g = new tgi(this, new az6(27, this));

    public static final void a(bz9 bz9Var, kxt... kxtVarArr) {
        ArrayList arrayList = new ArrayList();
        synchronized (bz9Var.d) {
            try {
                for (kxt kxtVar : kxtVarArr) {
                    String str = (String) bz9Var.c.get(kxtVar.c());
                    if (str != null && !str.equals(kxtVar.getClass().getName())) {
                        throw new wxt(2, null, "Cannot declare new variable with type = " + kxtVar.getClass().getName() + ", because this variable have been declared with another type = " + str);
                    }
                    if (!bz9Var.d.contains(kxtVar.c())) {
                        bz9Var.d.add(kxtVar.c());
                        bz9Var.e.remove(kxtVar.c());
                        arrayList.add(kxtVar);
                    }
                    kxt kxtVar2 = (kxt) bz9Var.a.get(kxtVar.c());
                    if (!Intrinsics.d(kxtVar2, kxtVar)) {
                        if (kxtVar2 != null) {
                            kxtVar2.h(kxtVar);
                            kxtVar.a(new az6(26, kxtVar2));
                        } else {
                            kxt kxtVar3 = (kxt) bz9Var.a.put(kxtVar.c(), kxtVar);
                            if (kxtVar3 != null) {
                                hlr.d("\n                    Wanted to put new variable '" + kxtVar + "', but variable with such name\n                    already exists '" + kxtVar3 + "'! Is there a race?\n                ");
                            }
                            bz9Var.c.remove(kxtVar.c());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = bz9Var.b.iterator();
        while (it.hasNext()) {
            qxt qxtVar = (qxt) it.next();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                kxt kxtVar4 = (kxt) it2.next();
                rxt rxtVar = qxtVar.a;
                kxtVar4.a(rxtVar.i);
                rxtVar.a(kxtVar4);
            }
        }
    }

    public static final void b(bz9 bz9Var, String... strArr) {
        ConcurrentHashMap concurrentHashMap = bz9Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (xz0.u(strArr, entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        synchronized (bz9Var.d) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                bz9Var.d.remove(entry2.getKey());
                bz9Var.c.put(entry2.getKey(), entry2.getValue().getClass().getName());
                bz9Var.a.remove(entry2.getKey());
            }
        }
        Iterator it = bz9Var.b.iterator();
        while (it.hasNext()) {
            qxt qxtVar = (qxt) it.next();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                kxt kxtVar = (kxt) ((Map.Entry) it2.next()).getValue();
                rxt rxtVar = qxtVar.a;
                kxtVar.f(rxtVar.i);
                ckj ckjVar = (ckj) rxtVar.g.get(kxtVar.c());
                if (ckjVar != null) {
                    akj akjVar = new akj(ckjVar);
                    while (akjVar.hasNext()) {
                        ((Function1) akjVar.next()).invoke(kxtVar);
                    }
                }
                for (Function1 function1 : CollectionsKt.w0(rxtVar.h.values())) {
                    function1.invoke(kxtVar);
                    kxtVar.f(function1);
                }
                rxtVar.c.remove(kxtVar.c());
            }
        }
    }

    public final void c(qxt qxtVar) {
        this.b.add(qxtVar);
    }

    public final void d(Function1 function1) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((kxt) it.next()).a(function1);
        }
    }

    public final kxt e(String str) {
        boolean contains;
        synchronized (this.d) {
            contains = this.d.contains(str);
        }
        if (contains) {
            return (kxt) this.a.get(str);
        }
        return null;
    }

    public final void f(kxt... kxtVarArr) {
        synchronized (d51.l) {
        }
        qht qhtVar = qht.a;
        if (qhtVar.a()) {
            a(this, (kxt[]) Arrays.copyOf(kxtVarArr, kxtVarArr.length));
        } else {
            qhtVar.b(new pv7(this, kxtVarArr, false, 6));
        }
    }
}
