package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class mip implements oip {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean f;

    @Override // defpackage.oip
    public final void a(f9f f9fVar, f9f f9fVar2, t9f t9fVar) {
        f(f9fVar, f9fVar2, t9fVar, false);
    }

    @Override // defpackage.oip
    public final void b(f9f f9fVar, Function1 function1) {
        d(f9fVar, function1, false);
    }

    public final uhp c() {
        return new uhp(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void d(f9f f9fVar, Function1 function1, boolean z) {
        HashMap hashMap = this.e;
        Function1 function12 = (Function1) hashMap.get(f9fVar);
        if (function12 == null || function12.equals(function1) || z) {
            hashMap.put(f9fVar, function1);
        } else {
            wvs.i("Default deserializers provider for ", f9fVar, " is already registered: ", function12);
        }
    }

    public final void e(f9f f9fVar, Function1 function1, boolean z) {
        HashMap hashMap = this.c;
        Function1 function12 = (Function1) hashMap.get(f9fVar);
        if (function12 == null || function12.equals(function1) || z) {
            hashMap.put(f9fVar, function1);
        } else {
            wvs.i("Default serializers provider for ", f9fVar, " is already registered: ", function12);
        }
    }

    public final void f(f9f f9fVar, f9f f9fVar2, t9f t9fVar, boolean z) {
        Object obj;
        f9f f9fVar3;
        String i = t9fVar.getDescriptor().i();
        HashMap hashMap = this.b;
        Object obj2 = hashMap.get(f9fVar);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(f9fVar, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = this.d;
        Object obj3 = hashMap2.get(f9fVar);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(f9fVar, obj3);
        }
        Map map2 = (Map) obj3;
        t9f t9fVar2 = (t9f) map.get(f9fVar2);
        if (t9fVar2 != null && !t9fVar2.equals(t9fVar)) {
            if (!z) {
                throw new cbe("Serializer for " + f9fVar2 + " already registered in the scope of " + f9fVar);
            }
        }
        t9f t9fVar3 = (t9f) map2.get(i);
        if (t9fVar3 != null && !t9fVar3.equals(t9fVar)) {
            Iterator it = ((Iterable) CollectionsKt.F(map.entrySet()).b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == t9fVar3) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (f9fVar3 = (f9f) entry.getKey()) == null) {
                rj7.i(i, " is registered in the module but no Kotlin class is associated with it.", "Name ");
                return;
            }
            if (!z) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + f9fVar + "' have the same serial name '" + i + "': " + t9fVar + " for '" + f9fVar2 + "' and " + t9fVar3 + " for '" + f9fVar3 + '\'');
            }
        }
        map.put(f9fVar2, t9fVar);
        map2.put(i, t9fVar);
    }

    public final void g(f9f f9fVar, yf6 yf6Var, boolean z) {
        yf6 yf6Var2;
        f9fVar.getClass();
        HashMap hashMap = this.a;
        if (!z && (yf6Var2 = (yf6) hashMap.get(f9fVar)) != null && !yf6Var2.equals(yf6Var)) {
            throw new cbe("Contextual serializer or serializer provider for " + f9fVar + " already registered in this module");
        }
        hashMap.put(f9fVar, yf6Var);
        if (leu.P(f9fVar).isInterface()) {
            this.f = true;
        }
    }

    @Override // defpackage.oip
    public final void l(f9f f9fVar, t9f t9fVar) {
        t9fVar.getClass();
        g(f9fVar, new wf6(t9fVar), false);
    }

    @Override // defpackage.oip
    public final void m(f9f f9fVar, Function1 function1) {
        e(f9fVar, function1, false);
    }

    @Override // defpackage.oip
    public final void p(f9f f9fVar, nip nipVar) {
        f9fVar.getClass();
        g(f9fVar, new xf6(nipVar), false);
    }
}
