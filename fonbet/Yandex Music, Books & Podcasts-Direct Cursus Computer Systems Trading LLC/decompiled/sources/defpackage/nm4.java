package defpackage;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class nm4 implements iip, o6k {
    public final om4 a = new om4();
    public final syc b;

    public nm4(Function1 function1) {
        this.b = function1;
    }

    @Override // defpackage.o6k
    public Object a(f9f f9fVar, ArrayList arrayList) {
        Object t7oVar;
        Object obj = this.a.get(leu.P(f9fVar));
        obj.getClass();
        zpi zpiVar = (zpi) obj;
        Object obj2 = zpiVar.a.get();
        if (obj2 == null) {
            synchronized (zpiVar) {
                obj2 = zpiVar.a.get();
                if (obj2 == null) {
                    obj2 = new n6k();
                    zpiVar.a = new SoftReference(obj2);
                }
            }
        }
        n6k n6kVar = (n6k) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new w9f((u9f) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = n6kVar.a;
        Object obj3 = concurrentHashMap.get(arrayList2);
        if (obj3 == null) {
            try {
                r7o r7oVar = z7o.b;
                t7oVar = (t9f) ((Function2) this.b).invoke(f9fVar, arrayList);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            z7o z7oVar = new z7o(t7oVar);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, z7oVar);
            obj3 = putIfAbsent == null ? z7oVar : putIfAbsent;
        }
        return ((z7o) obj3).a;
    }

    @Override // defpackage.iip
    public t9f b(f9f f9fVar) {
        Object obj = this.a.get(leu.P(f9fVar));
        obj.getClass();
        zpi zpiVar = (zpi) obj;
        Object obj2 = zpiVar.a.get();
        if (obj2 == null) {
            synchronized (zpiVar) {
                obj2 = zpiVar.a.get();
                if (obj2 == null) {
                    obj2 = new op3((t9f) ((Function1) this.b).invoke(f9fVar));
                    zpiVar.a = new SoftReference(obj2);
                }
            }
        }
        return ((op3) obj2).a;
    }

    public nm4(Function2 function2) {
        this.b = function2;
    }
}
