package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class rjo implements qjo {
    public final vx6 b;
    public final dfb c;
    public boolean d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final ckj g = new ckj();
    public final aeo h = new aeo(1);
    public final LinkedHashMap i = new LinkedHashMap();
    public WeakReference j;
    public final en9 k;
    public final d0c l;

    public rjo(rv8 rv8Var, dw8 dw8Var, vx6 vx6Var, dfb dfbVar) {
        this.b = vx6Var;
        this.c = dfbVar;
        en9 en9Var = new en9(1, this);
        this.k = en9Var;
        String str = dw8Var.a;
        rxt rxtVar = new rxt(en9Var, null);
        tgi tgiVar = ((bz9) vx6Var.b).g;
        if (rxtVar.e.add(tgiVar)) {
            tgiVar.a.d(rxtVar.i);
            tgiVar.a.c(rxtVar.j);
            rxtVar.d.add(tgiVar);
        }
        es6 es6Var = new es6(vx6Var, dfbVar, str);
        cib cibVar = new cib(3, hs4.h);
        List list = rv8Var.a;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList I = fgq.I(list);
            if (!I.isEmpty()) {
                cibVar = new cib(3, new yfx(27, new tob(I), cibVar));
            }
        }
        d0c u = vx6Var.u(rv8Var.g, rv8Var.f, rxtVar, es6Var, cibVar, new pv9(5, dfbVar), "", this, dfbVar);
        l(u, "", null);
        this.l = u;
    }

    public static boolean k(jc8 jc8Var) {
        List w;
        List z;
        dp8 d = jc8Var.d();
        List i = d.i();
        return !((i == null || i.isEmpty()) && ((w = d.w()) == null || w.isEmpty()) && ((z = d.z()) == null || z.isEmpty()));
    }

    @Override // defpackage.qjo
    public final d0c a() {
        return this.l;
    }

    @Override // defpackage.qjo
    public final void b() {
        ckj ckjVar = this.g;
        ckjVar.getClass();
        akj akjVar = new akj(ckjVar);
        while (akjVar.hasNext()) {
            d0c d0cVar = (d0c) akjVar.next();
            if (d0cVar.d) {
                d0cVar.d = false;
                zzb zzbVar = d0cVar.a;
                oxt oxtVar = zzbVar.d;
                oxtVar.u(zzbVar, new kma(6, zzbVar));
                oxtVar.w();
            }
        }
    }

    @Override // defpackage.qjo
    public final void c(gc8 gc8Var) {
        ckj ckjVar = this.g;
        ckjVar.getClass();
        akj akjVar = new akj(ckjVar);
        while (akjVar.hasNext()) {
            rdk rdkVar = ((d0c) akjVar.next()).c;
            if (rdkVar != null) {
                if (Intrinsics.d((gc8) rdkVar.f, gc8Var)) {
                    rdkVar.f = null;
                }
                Iterator it = ((LinkedHashMap) rdkVar.e).entrySet().iterator();
                while (it.hasNext()) {
                    for (pat patVar : (List) ((Map.Entry) it.next()).getValue()) {
                        LinkedHashSet linkedHashSet = patVar.n;
                        wct.m(linkedHashSet);
                        linkedHashSet.remove(gc8Var);
                        patVar.b();
                    }
                }
            }
        }
    }

    @Override // defpackage.qjo
    public final void d(d0c d0cVar, pm9 pm9Var, am8 am8Var) {
        String c = pm9Var.c();
        ybg ybgVar = new ybg(25, am8Var);
        tjo tjoVar = (tjo) this.h.a.get(d0cVar);
        if (tjoVar == null) {
            return;
        }
        if (c.v(tjoVar.b, c, false)) {
            aeo.a(tjoVar, ybgVar);
            return;
        }
        for (tjo tjoVar2 : tjoVar.c) {
            if (c.v(tjoVar2.b, c, false)) {
                aeo.a(tjoVar2, ybgVar);
            }
        }
    }

    @Override // defpackage.qjo
    public final void e(gc8 gc8Var) {
        ckj ckjVar = this.g;
        ckjVar.getClass();
        akj akjVar = new akj(ckjVar);
        while (akjVar.hasNext()) {
            rdk rdkVar = ((d0c) akjVar.next()).c;
            if (rdkVar != null) {
                rdkVar.u(gc8Var);
            }
        }
    }

    @Override // defpackage.qjo
    public final Map f() {
        LinkedHashMap linkedHashMap = this.h.b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), ((tjo) entry.getValue()).a));
        }
        return uah.n(arrayList);
    }

    @Override // defpackage.qjo
    public final void g(dp8 dp8Var) {
        if (this.d || dp8Var.i() == null) {
            return;
        }
        this.d = true;
        this.c.e(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    @Override // defpackage.qjo
    public final d0c h(jc8 jc8Var, xzb xzbVar, String str) {
        LinkedHashMap linkedHashMap = this.f;
        d0c d0cVar = (d0c) linkedHashMap.get(str);
        if (d0cVar != null) {
            return d0cVar;
        }
        boolean z = xzbVar instanceof zzb;
        d0c d0cVar2 = this.l;
        if (!z) {
            return d0cVar2;
        }
        d0c i = i(xzbVar);
        dfb dfbVar = this.c;
        if (i == null) {
            dfbVar.d(new AssertionError(String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{str}, 1))));
            return d0cVar2;
        }
        if (!k(jc8Var)) {
            linkedHashMap.put(str, i);
            return i;
        }
        d0c t = this.b.t(str, jc8Var, (zzb) xzbVar, dfbVar);
        l(t, str, i);
        return t;
    }

    @Override // defpackage.qjo
    public final d0c i(xzb xzbVar) {
        return (d0c) this.e.get(xzbVar);
    }

    @Override // defpackage.qjo
    public final d0c j(pm9 pm9Var, jc8 jc8Var, xzb xzbVar, xzb xzbVar2) {
        String c = pm9Var.c();
        LinkedHashMap linkedHashMap = this.f;
        d0c d0cVar = (d0c) linkedHashMap.get(c);
        if (d0cVar != null) {
            return d0cVar;
        }
        if (!(xzbVar instanceof zzb)) {
            return null;
        }
        d0c i = i(xzbVar2);
        dfb dfbVar = this.c;
        if (i == null) {
            dfbVar.d(new AssertionError(String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{c}, 1))));
            return null;
        }
        if (k(jc8Var)) {
            d0c t = this.b.t(c, jc8Var, (zzb) xzbVar, dfbVar);
            l(t, c, i);
            return t;
        }
        if (xzbVar.equals(xzbVar2)) {
            linkedHashMap.put(c, i);
            return i;
        }
        d0c d0cVar2 = new d0c((zzb) xzbVar, null, null);
        l(d0cVar2, c, i);
        return d0cVar2;
    }

    public final void l(d0c d0cVar, String str, d0c d0cVar2) {
        tjo tjoVar;
        ArrayList arrayList;
        this.f.put(str, d0cVar);
        zzb zzbVar = d0cVar.a;
        this.e.put(zzbVar, d0cVar);
        this.g.a(d0cVar);
        aeo aeoVar = this.h;
        aeoVar.getClass();
        tjo tjoVar2 = new tjo(d0cVar, str);
        aeoVar.b.put(str, tjoVar2);
        LinkedHashMap linkedHashMap = aeoVar.a;
        linkedHashMap.put(d0cVar, tjoVar2);
        if (d0cVar2 != null && (tjoVar = (tjo) linkedHashMap.get(d0cVar2)) != null && (arrayList = tjoVar.c) != null) {
            arrayList.add(tjoVar2);
        }
        if (d0cVar.d) {
            d0cVar.d = false;
            oxt oxtVar = zzbVar.d;
            oxtVar.u(zzbVar, new kma(6, zzbVar));
            oxtVar.w();
        }
    }
}
