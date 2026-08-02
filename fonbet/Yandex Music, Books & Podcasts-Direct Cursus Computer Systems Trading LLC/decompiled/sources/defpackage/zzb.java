package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class zzb implements xzb {
    public final String b;
    public final rjo c;
    public final oxt d;
    public final h4b e;
    public final dfb f;
    public final String g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k;

    public zzb(String str, rjo rjoVar, oxt oxtVar, h4b h4bVar, dfb dfbVar, String str2) {
        this.b = str;
        this.c = rjoVar;
        this.d = oxtVar;
        this.e = h4bVar;
        this.f = dfbVar;
        this.g = str2;
    }

    @Override // defpackage.xzb
    public final Object a(String str, String str2, jhb jhbVar, Function1 function1, ywt ywtVar, uct uctVar, y7k y7kVar) {
        try {
            return g(str, str2, jhbVar, function1, ywtVar, uctVar);
        } catch (z7k e) {
            if (e.a == b8k.c) {
                if (this.k) {
                    throw a8k.a;
                }
                throw e;
            }
            y7kVar.a(e);
            this.f.d(e);
            return g(str, str2, jhbVar, function1, ywtVar, uctVar);
        }
    }

    @Override // defpackage.xzb
    public final void b(z7k z7kVar) {
        this.f.d(z7kVar);
    }

    @Override // defpackage.xzb
    public final kxt c(String str) {
        return this.d.x(str);
    }

    @Override // defpackage.xzb
    public final ja8 d(String str, List list, Function0 function0) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            LinkedHashMap linkedHashMap = this.i;
            Object obj = linkedHashMap.get(str2);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(str2, obj);
            }
            ((Set) obj).add(str);
        }
        LinkedHashMap linkedHashMap2 = this.j;
        Object obj2 = linkedHashMap2.get(str);
        if (obj2 == null) {
            obj2 = new ckj();
            linkedHashMap2.put(str, obj2);
        }
        ((ckj) obj2).a(function0);
        return new yzb(this, str, function0);
    }

    public final String e(String str) {
        String str2 = this.b;
        if (str2.length() == 0) {
            return str;
        }
        return str2 + '/' + str;
    }

    public final Object f(String str, jhb jhbVar) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(str);
        if (obj != null) {
            return obj;
        }
        Object h = this.e.h(jhbVar);
        if (jhbVar.b) {
            for (String str2 : jhbVar.c()) {
                LinkedHashMap linkedHashMap2 = this.i;
                Object obj2 = linkedHashMap2.get(str2);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap2.put(str2, obj2);
                }
                ((Set) obj2).add(str);
            }
            linkedHashMap.put(str, h);
        }
        return h;
    }

    public final Object g(String str, String str2, jhb jhbVar, Function1 function1, ywt ywtVar, uct uctVar) {
        Object invoke = null;
        try {
            Object f = f(str2, jhbVar);
            if (uctVar.b(f)) {
                f.getClass();
            } else {
                b8k b8kVar = b8k.e;
                if (function1 != null) {
                    try {
                        invoke = function1.invoke(f);
                    } catch (ClassCastException e) {
                        throw a8k.j(str, str2, f, e);
                    } catch (Exception e2) {
                        z7k z7kVar = a8k.a;
                        throw new z7k(b8kVar, f1d.j(f1d.m("Field '", str, "' with expression '", str2, "' received wrong value: '"), f, '\''), e2, null, null, 24);
                    }
                } else if (f != null) {
                    invoke = f;
                }
                if (invoke != null && (uctVar.a() instanceof String) && !uctVar.b(invoke)) {
                    invoke = String.valueOf(invoke);
                }
                if (invoke == null) {
                    z7k z7kVar2 = a8k.a;
                    StringBuilder sb = new StringBuilder("Value '");
                    sb.append(a8k.i(f));
                    sb.append("' for key '");
                    sb.append(str);
                    sb.append("' at path '");
                    throw new z7k(b8kVar, su4.o(sb, str2, "' is not valid"), null, null, null, 28);
                }
                f = invoke;
            }
            try {
                if (ywtVar.a(f)) {
                    return f;
                }
                throw a8k.c(f, str2);
            } catch (ClassCastException e3) {
                throw a8k.j(str, str2, f, e3);
            }
        } catch (khb e4) {
            String str3 = e4 instanceof b6i ? ((b6i) e4).a : null;
            if (str3 == null) {
                throw a8k.h(str, str2, e4);
            }
            z7k z7kVar3 = a8k.a;
            throw new z7k(b8k.c, hrg.r("Variable '", str3, "' is missing. Expression: ", str2), e4, null, null, 24);
        }
    }

    public final zzb h(String str, m86 m86Var) {
        nxt nxtVar = new nxt(this.d, m86Var);
        String e = e(str);
        g06 g06Var = (g06) this.e.a;
        return new zzb(e, this.c, nxtVar, new h4b(new g06(nxtVar, (es6) g06Var.b, (cib) g06Var.c, (pv9) g06Var.d)), this.f, str);
    }
}
