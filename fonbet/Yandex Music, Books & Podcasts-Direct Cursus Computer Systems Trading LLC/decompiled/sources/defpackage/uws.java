package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class uws {
    public final btl a;
    public final ss b;
    public final g51 c;
    public final fnk d;
    public final jyr e;
    public final jyr f;
    public final jyr g = l18.b.b(hag.I(zzp.class), true);

    public uws(btl btlVar, jyr jyrVar, ss ssVar, jyr jyrVar2, g51 g51Var, fnk fnkVar) {
        this.a = btlVar;
        this.b = ssVar;
        this.c = g51Var;
        this.d = fnkVar;
        this.e = jyrVar2;
        this.f = jyrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x037f, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x037a, code lost:
    
        if (r1 != r4) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0232 A[LOOP:1: B:81:0x022c->B:83:0x0232, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01bc A[LOOP:2: B:92:0x01b6->B:94:0x01bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.Collection, java.util.List, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x034a -> B:14:0x037f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x037a -> B:13:0x037d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(uws uwsVar, ArrayList arrayList, cg6 cg6Var) {
        rws rwsVar;
        int i;
        nnk D;
        Collection collection;
        List w0;
        Collection collection2;
        LinkedHashMap linkedHashMap;
        nnk nnkVar;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        Collection collection3;
        int a;
        Iterator it;
        Map map;
        Map map2;
        int i2;
        Collection collection4;
        nnk nnkVar2;
        int i3;
        int i4;
        nnk nnkVar3;
        Map map3;
        Map map4;
        Collection collection5;
        mqs mqsVar;
        Continuation continuation;
        oq oqVar;
        List list;
        List list2;
        l18 l18Var = l18.b;
        if (cg6Var instanceof rws) {
            rwsVar = (rws) cg6Var;
            int i5 = rwsVar.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                rwsVar.v = i5 - Integer.MIN_VALUE;
                Object obj = rwsVar.t;
                nm6 nm6Var = nm6.a;
                i = rwsVar.v;
                boolean z = false;
                ?? r14 = 0;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    D = nnk.D();
                    ab8 ab8Var = new ab8(new o7t(ghp.c(new o7t(new lcc(CollectionsKt.F(arrayList), true, new phs(20)), new phs(21)), new d0p(24)), new phs(22)).iterator(), new s3f(3));
                    if (ab8Var.hasNext()) {
                        Object next = ab8Var.next();
                        if (ab8Var.hasNext()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(next);
                            while (ab8Var.hasNext()) {
                                arrayList2.add(ab8Var.next());
                            }
                            collection = arrayList2;
                        } else {
                            collection = t75.c(next);
                        }
                    } else {
                        collection = c5b.a;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((mqs) obj2).t == null) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((mqs) it2.next()).d.a);
                    }
                    w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList4));
                    Collection collection6 = collection;
                    if (!collection6.isEmpty()) {
                        g51 g51Var = uwsVar.c;
                        rwsVar.j = arrayList;
                        rwsVar.k = D;
                        rwsVar.l = w0;
                        rwsVar.v = 1;
                        bdt I = hag.I(frt.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        String str = ((frt) qdcVar.C(I)).c().a;
                        str.getClass();
                        obj = g51Var.a.f(str, collection6, rwsVar);
                        if (obj != nm6.a) {
                            obj = (List) obj;
                        }
                        if (obj != nm6Var) {
                            collection2 = arrayList;
                        }
                        return nm6Var;
                    }
                    collection2 = arrayList;
                    linkedHashMap = null;
                    if (!w0.isEmpty()) {
                        bdt I2 = hag.I(frt.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        String str2 = ((frt) qdcVar2.C(I2)).c().a;
                        str2.getClass();
                        ss ssVar = uwsVar.b;
                        rwsVar.j = collection2;
                        rwsVar.k = D;
                        rwsVar.l = null;
                        rwsVar.m = linkedHashMap;
                        rwsVar.n = null;
                        rwsVar.q = 0;
                        rwsVar.r = 0;
                        rwsVar.v = 2;
                        obj = ssVar.a.h(str2, w0, rwsVar);
                        if (obj != nm6Var) {
                            nnkVar = D;
                            linkedHashMap3 = linkedHashMap;
                            collection3 = collection2;
                            List list3 = (List) obj;
                            int a2 = tah.a(v75.o(list3, 10));
                            linkedHashMap2 = new LinkedHashMap(a2 >= 16 ? a2 : 16);
                            while (r1.hasNext()) {
                            }
                            linkedHashMap = linkedHashMap3;
                            collection2 = collection3;
                            ArrayList arrayList5 = new ArrayList();
                            it = collection2.iterator();
                            map = linkedHashMap2;
                            map2 = linkedHashMap;
                            i2 = 0;
                            collection4 = arrayList5;
                            nnkVar2 = nnkVar;
                            i3 = 0;
                            i4 = 0;
                            if (!it.hasNext()) {
                            }
                        }
                        return nm6Var;
                    }
                    nnkVar = D;
                    linkedHashMap2 = null;
                    ArrayList arrayList52 = new ArrayList();
                    it = collection2.iterator();
                    map = linkedHashMap2;
                    map2 = linkedHashMap;
                    i2 = 0;
                    collection4 = arrayList52;
                    nnkVar2 = nnkVar;
                    i3 = 0;
                    i4 = 0;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    w0 = rwsVar.l;
                    D = rwsVar.k;
                    collection2 = rwsVar.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    Map map5 = rwsVar.m;
                    nnkVar = rwsVar.k;
                    collection3 = rwsVar.j;
                    qgg.h0(obj);
                    linkedHashMap3 = map5;
                    List list32 = (List) obj;
                    int a22 = tah.a(v75.o(list32, 10));
                    linkedHashMap2 = new LinkedHashMap(a22 >= 16 ? a22 : 16);
                    for (Object obj3 : list32) {
                        linkedHashMap2.put(((oq) obj3).a, obj3);
                    }
                    linkedHashMap = linkedHashMap3;
                    collection2 = collection3;
                    ArrayList arrayList522 = new ArrayList();
                    it = collection2.iterator();
                    map = linkedHashMap2;
                    map2 = linkedHashMap;
                    i2 = 0;
                    collection4 = arrayList522;
                    nnkVar2 = nnkVar;
                    i3 = 0;
                    i4 = 0;
                    if (!it.hasNext()) {
                    }
                } else if (i == 3) {
                    i3 = rwsVar.s;
                    i4 = rwsVar.r;
                    i2 = rwsVar.q;
                    it = rwsVar.p;
                    collection5 = rwsVar.o;
                    map4 = rwsVar.n;
                    map3 = rwsVar.m;
                    nnkVar3 = rwsVar.k;
                    qgg.h0(obj);
                    mqsVar = (mqs) obj;
                    Map map6 = map4;
                    collection4 = collection5;
                    nnkVar2 = nnkVar3;
                    map2 = map3;
                    map = map6;
                    continuation = continuation2;
                    if (mqsVar != null) {
                    }
                    r14 = continuation;
                    z = false;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = rwsVar.s;
                    i4 = rwsVar.r;
                    i2 = rwsVar.q;
                    it = rwsVar.p;
                    collection4 = rwsVar.o;
                    map = rwsVar.n;
                    map2 = rwsVar.m;
                    nnkVar2 = rwsVar.k;
                    qgg.h0(obj);
                    continuation = null;
                    mqsVar = (mqs) obj;
                    if (mqsVar != null) {
                        collection4.add(mqsVar);
                    }
                    r14 = continuation;
                    z = false;
                    if (!it.hasNext()) {
                        mqsVar = (mqs) it.next();
                        bdt I3 = hag.I(byb.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        boolean z2 = (!((jfc) ((byb) qdcVar3.C(I3)).b(jfc.class)).h() || mqsVar.Z) ? z : true;
                        if (z2) {
                            sws swsVar = new sws(nnkVar2, mqsVar, r14, 0);
                            mn7 mn7Var = dm6.b;
                            rwsVar.j = r14;
                            rwsVar.k = nnkVar2;
                            rwsVar.l = r14;
                            rwsVar.m = map2;
                            rwsVar.n = map;
                            rwsVar.o = collection4;
                            rwsVar.p = it;
                            rwsVar.q = i2;
                            rwsVar.r = i4;
                            rwsVar.s = i3;
                            rwsVar.v = 3;
                            obj = x97.V(mn7Var, swsVar, rwsVar);
                            if (obj != nm6Var) {
                                Map map7 = map2;
                                nnkVar3 = nnkVar2;
                                collection5 = collection4;
                                map4 = map;
                                map3 = map7;
                                continuation2 = r14;
                                mqsVar = (mqs) obj;
                                Map map62 = map4;
                                collection4 = collection5;
                                nnkVar2 = nnkVar3;
                                map2 = map3;
                                map = map62;
                                continuation = continuation2;
                                if (mqsVar != null) {
                                }
                                r14 = continuation;
                                z = false;
                                if (!it.hasNext()) {
                                }
                            }
                        } else {
                            if (z2 || mqsVar.t == null || mqsVar.u == null) {
                                oq oqVar2 = mqsVar.t;
                                List list4 = mqsVar.f;
                                if (oqVar2 == null) {
                                    if (map != null) {
                                        oqVar2 = (oq) map.get(mqsVar.d.a);
                                    } else {
                                        oqVar = r14;
                                        list = mqsVar.u;
                                        if (list != null) {
                                            list2 = list;
                                        } else {
                                            if (map2 != null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it3 = list4.iterator();
                                                while (it3.hasNext()) {
                                                    c01 c01Var = (c01) map2.get(((zp2) it3.next()).a);
                                                    if (c01Var != null) {
                                                        arrayList6.add(c01Var);
                                                    }
                                                }
                                                if (arrayList6.size() == list4.size()) {
                                                    list2 = arrayList6;
                                                }
                                            }
                                            list2 = null;
                                        }
                                        mqsVar = mqs.e(mqsVar, 0L, null, oqVar, list2, null, -1572865);
                                        if (mqsVar.t != null || mqsVar.u == null) {
                                            continuation = null;
                                            sws swsVar2 = new sws(nnkVar2, mqsVar, continuation, 1);
                                            mn7 mn7Var2 = dm6.b;
                                            rwsVar.j = null;
                                            rwsVar.k = nnkVar2;
                                            rwsVar.l = null;
                                            rwsVar.m = map2;
                                            rwsVar.n = map;
                                            rwsVar.o = collection4;
                                            rwsVar.p = it;
                                            rwsVar.q = i2;
                                            rwsVar.r = i4;
                                            rwsVar.s = i3;
                                            rwsVar.v = 4;
                                            obj = x97.V(mn7Var2, swsVar2, rwsVar);
                                        } else {
                                            continuation = null;
                                            if (mqsVar != null) {
                                            }
                                            r14 = continuation;
                                            z = false;
                                            if (!it.hasNext()) {
                                                return (List) collection4;
                                            }
                                        }
                                    }
                                }
                                oqVar = oqVar2;
                                list = mqsVar.u;
                                if (list != null) {
                                }
                                mqsVar = mqs.e(mqsVar, 0L, null, oqVar, list2, null, -1572865);
                                if (mqsVar.t != null) {
                                }
                                continuation = null;
                                sws swsVar22 = new sws(nnkVar2, mqsVar, continuation, 1);
                                mn7 mn7Var22 = dm6.b;
                                rwsVar.j = null;
                                rwsVar.k = nnkVar2;
                                rwsVar.l = null;
                                rwsVar.m = map2;
                                rwsVar.n = map;
                                rwsVar.o = collection4;
                                rwsVar.p = it;
                                rwsVar.q = i2;
                                rwsVar.r = i4;
                                rwsVar.s = i3;
                                rwsVar.v = 4;
                                obj = x97.V(mn7Var22, swsVar22, rwsVar);
                            }
                            continuation = continuation2;
                            if (mqsVar != null) {
                            }
                            r14 = continuation;
                            z = false;
                            if (!it.hasNext()) {
                            }
                        }
                        return nm6Var;
                    }
                }
                Iterable iterable = (Iterable) obj;
                a = tah.a(v75.o(iterable, 10));
                if (a < 16) {
                    a = 16;
                }
                linkedHashMap = new LinkedHashMap(a);
                for (Object obj4 : iterable) {
                    linkedHashMap.put(((c01) obj4).a, obj4);
                }
                if (!w0.isEmpty()) {
                }
            }
        }
        rwsVar = new rws(uwsVar, cg6Var);
        Object obj5 = rwsVar.t;
        nm6 nm6Var2 = nm6.a;
        i = rwsVar.v;
        boolean z3 = false;
        ?? r142 = 0;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj5;
        a = tah.a(v75.o(iterable2, 10));
        if (a < 16) {
        }
        linkedHashMap = new LinkedHashMap(a);
        while (r1.hasNext()) {
        }
        if (!w0.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r6.d.b(r2, r8, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oq oqVar, Collection collection, cg6 cg6Var) {
        tws twsVar;
        int i;
        String str;
        int i2;
        int i3;
        if (cg6Var instanceof tws) {
            twsVar = (tws) cg6Var;
            int i4 = twsVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                twsVar.p = i4 - Integer.MIN_VALUE;
                Object obj = twsVar.n;
                nm6 nm6Var = nm6.a;
                i = twsVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    ss ssVar = this.b;
                    List c = t75.c(oqVar);
                    twsVar.j = collection;
                    twsVar.k = str;
                    i2 = 0;
                    twsVar.l = 0;
                    twsVar.m = 0;
                    twsVar.p = 1;
                    Object b = ssVar.a.b(str, c, twsVar);
                    if (b != nm6Var) {
                        b = Unit.a;
                    }
                    if (b != nm6Var) {
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection2 = twsVar.j;
                    qgg.h0(obj);
                    return Unit.a;
                }
                i3 = twsVar.m;
                int i5 = twsVar.l;
                str = twsVar.k;
                Collection collection3 = twsVar.j;
                qgg.h0(obj);
                i2 = i5;
                collection = collection3;
                twsVar.j = null;
                twsVar.k = null;
                twsVar.l = i2;
                twsVar.m = i3;
                twsVar.p = 2;
            }
        }
        twsVar = new tws(this, cg6Var);
        Object obj2 = twsVar.n;
        nm6 nm6Var2 = nm6.a;
        i = twsVar.p;
        if (i != 0) {
        }
        twsVar.j = null;
        twsVar.k = null;
        twsVar.l = i2;
        twsVar.m = i3;
        twsVar.p = 2;
    }
}
