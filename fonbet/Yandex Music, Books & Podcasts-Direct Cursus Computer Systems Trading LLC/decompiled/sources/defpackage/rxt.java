package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class rxt implements oxt {
    public final szm a;
    public final oxt b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final Set d = Collections.synchronizedSet(new LinkedHashSet());
    public final Set e = Collections.synchronizedSet(new LinkedHashSet());
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final hxo i = new hxo(20, this);
    public final qxt j = new qxt(this);

    public rxt(szm szmVar, oxt oxtVar) {
        this.a = szmVar;
        this.b = oxtVar;
    }

    public final void a(kxt kxtVar) {
        gc8 gc8Var = (gc8) this.a.get();
        if (gc8Var == null) {
            synchronized (d51.l) {
            }
            qht qhtVar = qht.a;
            if (!qhtVar.a()) {
                qhtVar.b(new e8h(this, kxtVar, false, 23));
                return;
            }
            Iterator it = CollectionsKt.w0(this.h.values()).iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(kxtVar);
            }
            ckj ckjVar = (ckj) this.f.get(kxtVar.c());
            if (ckjVar != null) {
                akj akjVar = new akj(ckjVar);
                while (akjVar.hasNext()) {
                    ((Function1) akjVar.next()).invoke(kxtVar);
                }
                return;
            }
            return;
        }
        d51 d51Var = d51.l;
        synchronized (d51Var) {
        }
        if (!qht.a.a()) {
            g23 d = gc8Var.getViewComponent$div_release().d();
            f23 a = d.a();
            try {
                d51Var.p(new zg(d, a, this, kxtVar, 19));
                return;
            } catch (Throwable th) {
                g23.b(a);
                throw th;
            }
        }
        Iterator it2 = CollectionsKt.w0(this.h.values()).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(kxtVar);
        }
        ckj ckjVar2 = (ckj) this.f.get(kxtVar.c());
        if (ckjVar2 != null) {
            akj akjVar2 = new akj(ckjVar2);
            while (akjVar2.hasNext()) {
                ((Function1) akjVar2.next()).invoke(kxtVar);
            }
        }
    }

    public final void b(String str, dfb dfbVar, boolean z, Function1 function1) {
        Object putIfAbsent;
        Object putIfAbsent2;
        kxt x = x(str);
        if (x == null) {
            if (dfbVar != null) {
                z7k z7kVar = a8k.a;
                dfbVar.d(new z7k(b8k.c, f1d.g("No variable could be resolved for '", str), null, null, null, 24));
            }
            ConcurrentHashMap concurrentHashMap = this.f;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(str, (obj = new ckj()))) != null) {
                obj = putIfAbsent2;
            }
            ((ckj) obj).a(function1);
            return;
        }
        if (z) {
            gc8 gc8Var = (gc8) this.a.get();
            if (gc8Var == null) {
                synchronized (d51.l) {
                }
                qht qhtVar = qht.a;
                if (!qhtVar.a()) {
                    qhtVar.b(new e8h(function1, x));
                }
                function1.invoke(x);
            } else {
                d51 d51Var = d51.l;
                synchronized (d51Var) {
                }
                if (!qht.a.a()) {
                    g23 d = gc8Var.getViewComponent$div_release().d();
                    f23 a = d.a();
                    try {
                        d51Var.p(new zg(d, a, function1, x));
                    } catch (Throwable th) {
                        g23.b(a);
                        throw th;
                    }
                }
                function1.invoke(x);
            }
        }
        ConcurrentHashMap concurrentHashMap2 = this.f;
        Object obj2 = concurrentHashMap2.get(str);
        if (obj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(str, (obj2 = new ckj()))) != null) {
            obj2 = putIfAbsent;
        }
        ((ckj) obj2).a(function1);
    }

    @Override // defpackage.oxt
    public final List f() {
        return CollectionsKt.w0(this.c.values());
    }

    @Override // defpackage.xxt
    public final Object get(String str) {
        kxt x = x(str);
        Object o0 = bg3.o0(x != null ? x.d() : null);
        if (o0 != null) {
            return o0;
        }
        oxt oxtVar = this.b;
        if (oxtVar != null) {
            return oxtVar.get(str);
        }
        return null;
    }

    @Override // defpackage.oxt
    public final ja8 j(List list, nat natVar) {
        Object putIfAbsent;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ConcurrentHashMap concurrentHashMap = this.g;
            Object obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new ckj()))) != null) {
                obj = putIfAbsent;
            }
            ((ckj) obj).a(natVar);
        }
        return new yzb(list, this, natVar);
    }

    @Override // defpackage.oxt
    public final ja8 k(String str, dfb dfbVar, boolean z, Function1 function1) {
        if (!this.c.containsKey(str)) {
            oxt oxtVar = this.b;
            if ((oxtVar != null ? oxtVar.x(str) : null) != null) {
                return oxtVar.k(str, dfbVar, z, function1);
            }
        }
        b(str, dfbVar, z, function1);
        return new yzb(this, str, function1);
    }

    @Override // defpackage.oxt
    public final void l(kxt kxtVar) {
        String c = kxtVar.c();
        ConcurrentHashMap concurrentHashMap = this.c;
        kxt kxtVar2 = (kxt) concurrentHashMap.put(c, kxtVar);
        if (kxtVar2 == null) {
            kxtVar.a(this.i);
            a(kxtVar);
            return;
        }
        concurrentHashMap.put(kxtVar.c(), kxtVar2);
        throw new sxt("Variable '" + kxtVar.c() + "' already declared!", null);
    }

    @Override // defpackage.oxt
    public final ja8 m(final ArrayList arrayList, final gcp gcpVar) {
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!this.c.containsKey(str)) {
                oxt oxtVar = this.b;
                if ((oxtVar != null ? oxtVar.x(str) : null) != null) {
                    arrayList2.add(oxtVar.k(str, null, false, gcpVar));
                }
            }
            b(str, null, false, gcpVar);
        }
        return new ja8() { // from class: pxt
            @Override // java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ckj ckjVar = (ckj) this.f.get((String) it2.next());
                    if (ckjVar != null) {
                        ckjVar.g(gcpVar);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((ja8) it3.next()).close();
                }
            }
        };
    }

    @Override // defpackage.oxt
    public final void s() {
        for (tgi tgiVar : this.d) {
            Iterator it = tgiVar.a.a.values().iterator();
            while (it.hasNext()) {
                ((kxt) it.next()).f(this.i);
            }
            tgiVar.a.b.remove(this.j);
            this.e.remove(tgiVar);
        }
        this.h.clear();
    }

    @Override // defpackage.oxt
    public final void u(xzb xzbVar, Function1 function1) {
        this.h.put(xzbVar, function1);
        oxt oxtVar = this.b;
        if (oxtVar != null) {
            oxtVar.u(xzbVar, new gcp(this, function1));
        }
    }

    @Override // defpackage.oxt
    public final void w() {
        hxo hxoVar;
        for (tgi tgiVar : this.d) {
            bz9 bz9Var = tgiVar.a;
            bz9 bz9Var2 = tgiVar.a;
            Iterator it = bz9Var.a.values().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hxoVar = this.i;
                if (!hasNext) {
                    break;
                } else {
                    hxoVar.invoke((kxt) it.next());
                }
            }
            if (this.e.add(tgiVar)) {
                bz9Var2.d(hxoVar);
                bz9Var2.c(this.j);
            }
        }
    }

    @Override // defpackage.oxt
    public final kxt x(String str) {
        kxt x;
        kxt kxtVar = (kxt) this.c.get(str);
        if (kxtVar != null) {
            return kxtVar;
        }
        oxt oxtVar = this.b;
        if (oxtVar != null && (x = oxtVar.x(str)) != null) {
            return x;
        }
        for (tgi tgiVar : this.d) {
            tgiVar.b.invoke(str);
            kxt e = tgiVar.a.e(str);
            if (e != null) {
                return e;
            }
        }
        return null;
    }
}
