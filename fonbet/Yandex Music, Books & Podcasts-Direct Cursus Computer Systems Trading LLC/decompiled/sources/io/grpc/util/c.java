package io.grpc.util;

import defpackage.aeg;
import defpackage.ceg;
import defpackage.csk;
import defpackage.deg;
import defpackage.dgi;
import defpackage.egi;
import defpackage.mgo;
import defpackage.ngo;
import defpackage.o2g;
import defpackage.qdc;
import defpackage.r76;
import defpackage.reb;
import defpackage.sgr;
import defpackage.ude;
import defpackage.wdg;
import defpackage.wrk;
import defpackage.wu1;
import defpackage.xdg;
import defpackage.xu1;
import defpackage.yde;
import defpackage.ydg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c extends ceg {
    public static final Logger n = Logger.getLogger(c.class.getName());
    public final LinkedHashMap g;
    public final wdg h;
    public boolean i;
    public final csk j;
    public r76 k;
    public final AtomicInteger l;
    public aeg m;

    public c(wdg wdgVar) {
        super(0);
        this.g = new LinkedHashMap();
        this.j = new csk();
        this.h = wdgVar;
        n.log(Level.FINE, "Created");
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new mgo();
    }

    public final ngo A(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((dgi) it.next()).e);
        }
        return new ngo(arrayList, this.l);
    }

    public final void B(r76 r76Var, aeg aegVar) {
        if (r76Var == this.k && aegVar.equals(this.m)) {
            return;
        }
        this.h.Z(r76Var, aegVar);
        this.k = r76Var;
        this.m = aegVar;
    }

    public final void C() {
        r76 r76Var;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.g;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r76Var = r76.b;
            if (!hasNext) {
                break;
            }
            dgi dgiVar = (dgi) it.next();
            if (!dgiVar.f && dgiVar.d == r76Var) {
                arrayList.add(dgiVar);
            }
        }
        if (!arrayList.isEmpty()) {
            B(r76Var, A(arrayList));
            return;
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            r76 r76Var2 = ((dgi) it2.next()).d;
            r76 r76Var3 = r76.a;
            if (r76Var2 == r76Var3 || r76Var2 == r76.d) {
                B(r76Var3, new mgo());
                return;
            }
        }
        B(r76.c, A(linkedHashMap.values()));
    }

    @Override // defpackage.ceg
    public final sgr a(ydg ydgVar) {
        try {
            this.i = true;
            qdc z = z(ydgVar);
            sgr sgrVar = (sgr) z.b;
            if (!sgrVar.g()) {
                return sgrVar;
            }
            C();
            for (dgi dgiVar : (List) z.c) {
                dgiVar.b.y();
                dgiVar.d = r76.e;
                n.log(Level.FINE, "Child balancer {0} deleted", dgiVar.a);
            }
            return sgrVar;
        } finally {
            this.i = false;
        }
    }

    @Override // defpackage.ceg
    public final void p(sgr sgrVar) {
        if (this.k != r76.b) {
            this.h.Z(r76.c, new wrk(xdg.a(sgrVar), 1));
        }
    }

    @Override // defpackage.ceg
    public final void y() {
        Level level = Level.INFO;
        Logger logger = n;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.g;
        for (dgi dgiVar : linkedHashMap.values()) {
            dgiVar.b.y();
            dgiVar.d = r76.e;
            logger.log(Level.FINE, "Child balancer {0} deleted", dgiVar.a);
        }
        linkedHashMap.clear();
    }

    public final qdc z(ydg ydgVar) {
        LinkedHashMap linkedHashMap;
        egi egiVar;
        reb rebVar;
        Level level = Level.FINE;
        Logger logger = n;
        logger.log(level, "Received resolution result: {0}", ydgVar);
        HashMap hashMap = new HashMap();
        List list = ydgVar.a;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.g;
            if (!hasNext) {
                break;
            }
            egi egiVar2 = new egi((reb) it.next());
            dgi dgiVar = (dgi) linkedHashMap.get(egiVar2);
            if (dgiVar != null) {
                hashMap.put(egiVar2, dgiVar);
            } else {
                hashMap.put(egiVar2, new dgi(this, egiVar2, this.j, new wrk(xdg.e, 1)));
            }
        }
        int i = 14;
        Object obj = null;
        if (hashMap.isEmpty()) {
            sgr i2 = sgr.o.i("NameResolver returned no usable address. " + ydgVar);
            p(i2);
            return new qdc(i, i2, obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            deg degVar = ((dgi) entry.getValue()).c;
            ((dgi) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                dgi dgiVar2 = (dgi) linkedHashMap.get(key);
                if (dgiVar2.f) {
                    dgiVar2.f = false;
                }
            } else {
                linkedHashMap.put(key, (dgi) entry.getValue());
            }
            dgi dgiVar3 = (dgi) linkedHashMap.get(key);
            if (key instanceof reb) {
                egiVar = new egi((reb) key);
            } else {
                o2g.J("key is wrong type", key instanceof egi);
                egiVar = (egi) key;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rebVar = null;
                    break;
                }
                rebVar = (reb) it2.next();
                if (egiVar.equals(new egi(rebVar))) {
                    break;
                }
            }
            o2g.O(rebVar, key + " no longer present in load balancer children");
            xu1 xu1Var = xu1.b;
            List singletonList = Collections.singletonList(rebVar);
            xu1 xu1Var2 = xu1.b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(ceg.f, bool);
            for (Map.Entry entry2 : xu1Var2.a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((wu1) entry2.getKey(), entry2.getValue());
                }
            }
            ydg ydgVar2 = new ydg(singletonList, new xu1(identityHashMap), null);
            ((dgi) linkedHashMap.get(key)).getClass();
            if (!dgiVar3.f) {
                dgiVar3.b.r(ydgVar2);
            }
        }
        ArrayList arrayList = new ArrayList();
        ude listIterator = yde.v(linkedHashMap.keySet()).listIterator(0);
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            if (!hashMap.containsKey(next)) {
                dgi dgiVar4 = (dgi) linkedHashMap.get(next);
                egi egiVar3 = dgiVar4.a;
                if (!dgiVar4.f) {
                    dgiVar4.g.g.remove(egiVar3);
                    dgiVar4.f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", egiVar3);
                }
                arrayList.add(dgiVar4);
            }
        }
        return new qdc(i, sgr.e, arrayList);
    }
}
