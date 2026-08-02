package defpackage;

import androidx.fragment.app.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.list_player_manager.impl.EngineReuseException;
import ru.yandex.video.m3.list_player_manager.impl.a;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes6.dex */
public final class ecg implements bcg, wg7 {
    public final qdc a;
    public final a b;
    public final xbu c;
    public final dn9 d;
    public final qdc e;
    public final ru.yandex.video.m3.list_player_manager.impl.telemetry.a f;
    public final kkp g;
    public final ime h;
    public final anm i;
    public final gag j;
    public final tf6 k;
    public final yjj l = new yjj();
    public final String m = "LPM";
    public final rar n;
    public cr o;
    public boolean p;

    public ecg(qdc qdcVar, a aVar, xbu xbuVar, dn9 dn9Var, qdc qdcVar2, String str, ru.yandex.video.m3.list_player_manager.impl.telemetry.a aVar2, vx6 vx6Var, kkp kkpVar, ime imeVar, anm anmVar, gag gagVar, tf6 tf6Var, nsh nshVar) {
        this.a = qdcVar;
        this.b = aVar;
        this.c = xbuVar;
        this.d = dn9Var;
        this.e = qdcVar2;
        this.f = aVar2;
        this.g = kkpVar;
        this.h = imeVar;
        this.i = anmVar;
        this.j = gagVar;
        this.k = tf6Var;
        aVar.l = this;
        aVar.b.i = this;
        xbuVar.i = this;
        qdcVar.H("LPM", "init", null, new Object[0]);
        this.n = zsd.r0(tf6Var, new ub7(12, (fkn) nshVar.c, new ze1(this, (Continuation) null, 7)));
    }

    public static String b(List list) {
        List<imh> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (imh imhVar : list2) {
            arrayList.add(imhVar.d + " (" + imhVar.a.size() + ')');
        }
        return CollectionsKt.X(arrayList, null, null, null, null, 63);
    }

    public final void a(cr crVar) {
        if (crVar == null) {
            y7g.Q(new IllegalStateException("try access bitmapDownloader, but it is null. Call ListYandexPlayerManager.setCurrentActivity first"), this.a, this.m, "access bitmapDownloader", "try access bitmapDownloader, but it is null. Call ListYandexPlayerManager.setCurrentActivity first");
        }
    }

    public final void c(imh imhVar, paw pawVar) {
        HashSet u0;
        Object value;
        Object obj;
        yjj yjjVar = this.l;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            gag gagVar = (gag) it.next();
            xdr xdrVar = gagVar.c;
            LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).f);
            u7b u7bVar = (u7b) q.remove(imhVar);
            if (u7bVar != null) {
                u7bVar.a.F(u7bVar.b);
            }
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, null, null, q, null, null, null, null, null, null, null, null, null, null, null, 131039)));
            Iterator it2 = ((eag) xdrVar.getValue()).c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.d(((zye) obj).a, imhVar)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                gagVar.b();
            }
        }
    }

    public final void d(imh imhVar) {
        HashSet u0;
        Object value;
        imhVar.getClass();
        yjj yjjVar = this.l;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            gag gagVar = (gag) it.next();
            gagVar.getClass();
            imhVar.getClass();
            xdr xdrVar = gagVar.c;
            LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).d);
            q.put(imhVar, PreloadState.CANCELED);
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, q, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063)));
            gagVar.b();
        }
    }

    public final void e(imh imhVar) {
        HashSet u0;
        Object value;
        imhVar.getClass();
        yjj yjjVar = this.l;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            gag gagVar = (gag) it.next();
            gagVar.getClass();
            imhVar.getClass();
            xdr xdrVar = gagVar.c;
            LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).d);
            q.put(imhVar, PreloadState.ERROR);
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, q, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063)));
            gagVar.b();
        }
    }

    public final void f(imh imhVar) {
        HashSet u0;
        Object value;
        imhVar.getClass();
        yjj yjjVar = this.l;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            gag gagVar = (gag) it.next();
            gagVar.getClass();
            imhVar.getClass();
            xdr xdrVar = gagVar.c;
            LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).d);
            q.put(imhVar, PreloadState.STARTED);
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, q, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063)));
            gagVar.b();
        }
    }

    public final void g(t tVar) {
        cr crVar;
        this.a.H(this.m, "setCurrentActivity", String.valueOf(tVar), new Object[0]);
        cr crVar2 = this.o;
        if (crVar2 != null) {
            crVar2.g0();
        }
        if (tVar != null) {
            kkp kkpVar = this.g;
            crVar = new cr((qdc) kkpVar.b, this.e, (xiu) kkpVar.c, (xiu) kkpVar.d, tVar, (apo) kkpVar.e);
        } else {
            crVar = null;
        }
        this.o = crVar;
    }

    public final void h(List list) {
        HashSet u0;
        gag gagVar;
        Iterator it;
        ecg ecgVar;
        int m;
        int i;
        List list2 = list;
        list2.getClass();
        this.a.H(this.m, "updateVisibleItemsList", b(list2), new Object[0]);
        cr crVar = this.o;
        a(crVar);
        if (crVar != null) {
            qdc qdcVar = (qdc) crVar.c;
            if (!list2.isEmpty() && (m = qdcVar.m((imh) CollectionsKt.Q(list2))) != -1) {
                cag cagVar = (cag) crVar.i;
                int size = list2.size();
                x0 x0Var = (x0) qdcVar.c;
                if (x0Var != null) {
                    y7g.Y(false, (qdc) x0Var.c);
                    i = ((ArrayList) x0Var.d).size() + x0Var.b;
                } else {
                    i = 0;
                }
                if (cagVar.c) {
                    cagVar.a(m, size, i);
                } else {
                    cagVar.d = new bag(m, size, i);
                }
            }
        }
        a aVar = this.b;
        y7g.Y(false, aVar.c);
        aVar.c.H("EngineReuseManager", "onUpdateVisibleItemsList", "visibleItems updated = ".concat(aVar.m(list2)), new Object[0]);
        if (list2.isEmpty()) {
            aVar.c.H("EngineReuseManager", "onUpdateVisibleItemsList", "visibleItems.isEmpty()", new Object[0]);
        }
        int T = CollectionsKt.T(aVar.h, CollectionsKt.firstOrNull(list2));
        if (T == -1) {
            StringBuilder sb = new StringBuilder("Can not find visible item in items list. First call onUpdateItemsList. items = ");
            ArrayList arrayList = aVar.h;
            y7g.Y(false, aVar.c);
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((imh) it2.next()).d);
            }
            sb.append(CollectionsKt.X(arrayList2, null, null, null, null, 63));
            String sb2 = sb.toString();
            y7g.Q(new EngineReuseException.CanNotFindVisibleItemsInItemsList(sb2, null, 2, null), aVar.c, "EngineReuseManager", "onUpdateVisibleItemsList", sb2);
        }
        aVar.k.clear();
        if (T >= 0) {
            aVar.k.addAll(aVar.h.subList(Integer.max(0, T - aVar.f), Integer.min(aVar.h.size(), aVar.e + T)));
        }
        qdc qdcVar2 = aVar.c;
        qdcVar2.H("EngineReuseManager", "onUpdateVisibleItemsList", "items next to visible = ".concat(aVar.m(aVar.h.subList(Integer.max(0, T - 4), Integer.min(aVar.h.size(), T + 4)))), new Object[0]);
        qdcVar2.H("EngineReuseManager", "onUpdateVisibleItemsList", "itemsMustBeConnectedWithEngine = ".concat(aVar.m(aVar.k)), new Object[0]);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = aVar.k.iterator();
        while (it3.hasNext()) {
            imh imhVar = (imh) it3.next();
            rue rueVar = (rue) aVar.j.get(imhVar);
            if (rueVar != null) {
                arrayList3.add(rueVar);
            } else {
                aVar.c.H("EngineReuseManager", "onUpdateVisibleItemsList", su4.o(new StringBuilder("Can not find ListYandexPlayer for "), imhVar.d, " that should be connected with engine. Maybe setSource should be called first. Or it is ok, for just preloading case"), new Object[0]);
            }
        }
        aVar.c.H("EngineReuseManager", "onUpdateVisibleItemsList", "listYandexPlayerMustBeConnectedWithEngine = ".concat(a.l(arrayList3)), new Object[0]);
        List<rue> w0 = CollectionsKt.w0(wop.h(aVar.i.keySet(), arrayList3));
        aVar.c.H("EngineReuseManager", "onUpdateVisibleItemsList", "listYandexPlayerMustBeDisconnectedFromEngine = ".concat(a.l(w0)), new Object[0]);
        for (rue rueVar2 : w0) {
            if (aVar.d && ((acg) rueVar2).s) {
                ngl.r(aVar.c, "EngineReuseManager", "onUpdateVisibleItemsList", "Try to detach engine from willPlayWhenReady player ".concat(y7g.v(rueVar2)), null, new Object[0], 8);
            } else {
                acg acgVar = (acg) rueVar2;
                paw c = acgVar.c();
                if (c != null) {
                    aVar.b.d(c);
                    imh d = acgVar.d();
                    if (d != null && (ecgVar = aVar.l) != null) {
                        ecgVar.c(d, c);
                    }
                }
                aVar.i.remove(acgVar);
            }
        }
        List e0 = CollectionsKt.e0(arrayList3, aVar.i.keySet());
        aVar.c.H("EngineReuseManager", "onUpdateVisibleItemsList", "listYandexPlayersToConnectWithEngine = ".concat(a.l(e0)), new Object[0]);
        Iterator it4 = e0.iterator();
        while (it4.hasNext()) {
            aVar.k((rue) it4.next());
        }
        xbu xbuVar = this.c;
        xbuVar.c.H("VideoPreloadManager", "onUpdateVisibleItemsList", "visibleItems updated = ".concat(xbu.a(list2)), new Object[0]);
        if (list2.isEmpty()) {
            xbuVar.c.H("VideoPreloadManager", "onUpdateVisibleItemsList", "visibleItems.isEmpty()", new Object[0]);
        }
        xbuVar.l.clear();
        xbuVar.l.addAll(list2);
        if (xbuVar.r) {
            xbuVar.c(false);
        }
        yjj yjjVar = this.l;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it5 = u0.iterator();
        while (it5.hasNext()) {
            gag gagVar2 = (gag) it5.next();
            gagVar2.getClass();
            list2.getClass();
            xdr xdrVar = gagVar2.c;
            while (true) {
                Object value = xdrVar.getValue();
                gagVar = gagVar2;
                xdr xdrVar2 = xdrVar;
                it = it5;
                if (xdrVar2.k(value, eag.a((eag) value, null, list2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069))) {
                    break;
                }
                list2 = list;
                xdrVar = xdrVar2;
                it5 = it;
                gagVar2 = gagVar;
            }
            gagVar.b();
            list2 = list;
            it5 = it;
        }
    }
}
