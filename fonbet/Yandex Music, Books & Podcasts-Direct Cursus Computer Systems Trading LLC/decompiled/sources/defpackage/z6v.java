package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z6v {
    public static final /* synthetic */ s9f[] n;
    public final oq7 a;
    public final z66 b;
    public final g8v c;
    public final v8v d;
    public final vdr e;
    public final rw5 f;
    public mm6 g;
    public final z6n h;
    public final AtomicBoolean i;
    public final xdr j;
    public final xdr k;
    public final vdr l;
    public final xdr m;

    static {
        opi opiVar = new opi(z6v.class, "feedbackJob", "getFeedbackJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        n = new s9f[]{opiVar};
    }

    public z6v(oq7 oq7Var, z66 z66Var, g8v g8vVar, v8v v8vVar, vdr vdrVar, rw5 rw5Var) {
        oq7Var.getClass();
        z66Var.getClass();
        vdrVar.getClass();
        this.a = oq7Var;
        this.b = z66Var;
        this.c = g8vVar;
        this.d = v8vVar;
        this.e = vdrVar;
        this.f = rw5Var;
        this.g = be7.a;
        this.h = new z6n(7);
        this.i = new AtomicBoolean(false);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.j = ydr.a(e5bVar);
        this.k = ydr.a(l9v.a);
        this.l = z66Var.c();
        this.m = ydr.a(null);
    }

    public static final n9v a(z6v z6vVar, Map map, String str) {
        k6v k6vVar = (k6v) map.get(str);
        if (k6vVar == null) {
            return null;
        }
        if (k6vVar instanceof i6v) {
            return new i9v(str, ((i6v) k6vVar).a);
        }
        if (k6vVar.equals(j6v.a)) {
            return new k9v(str, f6v.d);
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00c9, code lost:
    
        if (defpackage.y2x.o(2000, r10) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018d, code lost:
    
        if (r2 != r4) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e A[LOOP:2: B:81:0x0158->B:83:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e4 A[LOOP:3: B:89:0x00de->B:91:0x00e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(z6v z6vVar, vbn vbnVar, Map map, cg6 cg6Var) {
        u6v u6vVar;
        Object obj;
        nm6 nm6Var;
        int i;
        Map map2;
        Iterator it;
        Iterator it2;
        Map map3;
        List list;
        ArrayList arrayList;
        Iterator it3;
        List q0;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list2;
        Map map4;
        Long a;
        rj6 rj6Var;
        List list3;
        rj6 rj6Var2;
        Map map5;
        LinkedHashMap linkedHashMap;
        vbn vbnVar2 = vbnVar;
        v8v v8vVar = z6vVar.d;
        if (cg6Var instanceof u6v) {
            u6vVar = (u6v) cg6Var;
            int i2 = u6vVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u6vVar.r = i2 - Integer.MIN_VALUE;
                u6v u6vVar2 = u6vVar;
                obj = u6vVar2.p;
                nm6Var = nm6.a;
                i = u6vVar2.r;
                LinkedHashMap linkedHashMap2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(CollectionsKt.Z(vbnVar2.c), vbnVar2.b)) {
                        u6vVar2.j = vbnVar2;
                        u6vVar2.k = map;
                        u6vVar2.r = 1;
                    }
                    map2 = map;
                } else if (i == 1) {
                    Map map6 = u6vVar2.k;
                    vbn vbnVar3 = u6vVar2.j;
                    qgg.h0(obj);
                    map2 = map6;
                    vbnVar2 = vbnVar3;
                } else if (i == 2) {
                    List list4 = u6vVar2.m;
                    List list5 = u6vVar2.l;
                    map3 = u6vVar2.k;
                    qgg.h0(obj);
                    arrayList = list5;
                    list = list4;
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList4 = new ArrayList(v75.o(iterable, 10));
                    it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((b9v) it3.next()).a);
                    }
                    q0 = CollectionsKt.q0(arrayList4, 50);
                    u6vVar2.j = null;
                    u6vVar2.k = map3;
                    u6vVar2.l = arrayList;
                    u6vVar2.m = list;
                    u6vVar2.n = q0;
                    u6vVar2.r = 3;
                    obj = v8vVar.e(u6vVar2);
                    arrayList2 = arrayList;
                } else {
                    if (i == 3) {
                        q0 = u6vVar2.n;
                        list = u6vVar2.m;
                        List list6 = u6vVar2.l;
                        map3 = u6vVar2.k;
                        qgg.h0(obj);
                        arrayList2 = list6;
                        ArrayList arrayList5 = arrayList2;
                        List list7 = q0;
                        List list8 = list;
                        Map map7 = map3;
                        List q02 = CollectionsKt.q0((Iterable) obj, 50);
                        g8v g8vVar = z6vVar.c;
                        rw5 rw5Var = z6vVar.f;
                        String valueOf = (rw5Var == null || (a = rw5Var.a()) == null) ? null : String.valueOf(a.longValue());
                        u6vVar2.j = null;
                        u6vVar2.k = map7;
                        u6vVar2.l = arrayList5;
                        u6vVar2.m = list8;
                        u6vVar2.n = null;
                        u6vVar2.r = 4;
                        obj = g8vVar.b(list8, list7, q02, valueOf, u6vVar2);
                        if (obj != nm6Var) {
                            arrayList3 = arrayList5;
                            list2 = list8;
                            map4 = map7;
                            rj6Var = (rj6) obj;
                            if (!(rj6Var instanceof qj6)) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rj6Var2 = u6vVar2.o;
                        list2 = u6vVar2.m;
                        list3 = u6vVar2.l;
                        map5 = u6vVar2.k;
                        qgg.h0(obj);
                        rj6Var = rj6Var2;
                        arrayList3 = list3;
                        map4 = map5;
                        if (rj6Var instanceof qj6) {
                            List list9 = list2;
                            int a2 = tah.a(v75.o(list9, 10));
                            if (a2 < 16) {
                                a2 = 16;
                            }
                            linkedHashMap = new LinkedHashMap(a2);
                            for (Object obj2 : list9) {
                                q6v q6vVar = (q6v) ((Map) ((qj6) rj6Var).a).get((String) obj2);
                                linkedHashMap.put(obj2, q6vVar != null ? new i6v(q6vVar) : j6v.a);
                            }
                        } else {
                            if (!(rj6Var instanceof pj6)) {
                                b6e.s();
                                return null;
                            }
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            LinkedHashMap i3 = uah.i(map4, linkedHashMap);
                            linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : i3.entrySet()) {
                                if (arrayList3.contains((String) entry.getKey())) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        return linkedHashMap2 == null ? r6v.a : new s6v(linkedHashMap2);
                    }
                    List list10 = u6vVar2.m;
                    List list11 = u6vVar2.l;
                    map4 = u6vVar2.k;
                    qgg.h0(obj);
                    list2 = list10;
                    arrayList3 = list11;
                    rj6Var = (rj6) obj;
                    if (!(rj6Var instanceof qj6)) {
                        qj6 qj6Var = (qj6) rj6Var;
                        u6vVar2.j = null;
                        u6vVar2.k = map4;
                        u6vVar2.l = arrayList3;
                        u6vVar2.m = list2;
                        u6vVar2.n = null;
                        u6vVar2.o = qj6Var;
                        u6vVar2.r = 5;
                        if (v8vVar.a(u6vVar2) != nm6Var) {
                            list3 = arrayList3;
                            rj6Var2 = rj6Var;
                            map5 = map4;
                            rj6Var = rj6Var2;
                            arrayList3 = list3;
                            map4 = map5;
                            if (rj6Var instanceof qj6) {
                            }
                            if (linkedHashMap != null) {
                            }
                            if (linkedHashMap2 == null) {
                            }
                        }
                        return nm6Var;
                    }
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (rj6Var instanceof qj6) {
                    }
                    if (linkedHashMap != null) {
                    }
                    if (linkedHashMap2 == null) {
                    }
                }
                ArrayList arrayList6 = vbnVar2.c;
                ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, 10));
                it = arrayList6.iterator();
                while (it.hasNext()) {
                    arrayList7.add(((wbn) it.next()).b.a);
                }
                ArrayList arrayList8 = new ArrayList();
                it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!map2.keySet().contains((String) next)) {
                        arrayList8.add(next);
                    }
                }
                ssg.a(4, "WaveWordsCenter", "reload for " + arrayList8 + " in window " + vbnVar2, null);
                u6vVar2.j = null;
                u6vVar2.k = map2;
                u6vVar2.l = arrayList7;
                u6vVar2.m = arrayList8;
                u6vVar2.r = 2;
                obj = v8vVar.d(u6vVar2);
                if (obj != nm6Var) {
                    map3 = map2;
                    list = arrayList8;
                    arrayList = arrayList7;
                    Iterable iterable2 = (Iterable) obj;
                    ArrayList arrayList42 = new ArrayList(v75.o(iterable2, 10));
                    it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                    }
                    q0 = CollectionsKt.q0(arrayList42, 50);
                    u6vVar2.j = null;
                    u6vVar2.k = map3;
                    u6vVar2.l = arrayList;
                    u6vVar2.m = list;
                    u6vVar2.n = q0;
                    u6vVar2.r = 3;
                    obj = v8vVar.e(u6vVar2);
                    arrayList2 = arrayList;
                }
                return nm6Var;
            }
        }
        u6vVar = new u6v(z6vVar, cg6Var);
        u6v u6vVar22 = u6vVar;
        obj = u6vVar22.p;
        nm6Var = nm6.a;
        i = u6vVar22.r;
        LinkedHashMap linkedHashMap22 = null;
        if (i != 0) {
        }
        ArrayList arrayList62 = vbnVar2.c;
        ArrayList arrayList72 = new ArrayList(v75.o(arrayList62, 10));
        it = arrayList62.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList82 = new ArrayList();
        it2 = arrayList72.iterator();
        while (it2.hasNext()) {
        }
        ssg.a(4, "WaveWordsCenter", "reload for " + arrayList82 + " in window " + vbnVar2, null);
        u6vVar22.j = null;
        u6vVar22.k = map2;
        u6vVar22.l = arrayList72;
        u6vVar22.m = arrayList82;
        u6vVar22.r = 2;
        obj = v8vVar.d(u6vVar22);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, cg6 cg6Var) {
        v6v v6vVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof v6v) {
            v6vVar = (v6v) cg6Var;
            int i2 = v6vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v6vVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v6vVar.j;
                nm6 nm6Var = nm6.a;
                i = v6vVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        return c5b.a;
                    }
                    List q0 = CollectionsKt.q0(list, 10);
                    v6vVar.l = 1;
                    obj = this.c.a(q0, v6vVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (List) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return c5b.a;
                }
                b6e.s();
                return null;
            }
        }
        v6vVar = new v6v(this, cg6Var);
        Object obj2 = v6vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = v6vVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
