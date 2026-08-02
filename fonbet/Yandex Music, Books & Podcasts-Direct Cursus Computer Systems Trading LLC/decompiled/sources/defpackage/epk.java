package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class epk {
    public final ac0 a;
    public final pt7 b;

    public epk(ac0 ac0Var, pt7 pt7Var, y9w y9wVar) {
        this.a = ac0Var;
        this.b = pt7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[LOOP:0: B:11:0x004f->B:13:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, cg6 cg6Var) {
        uok uokVar;
        int i;
        Iterator it;
        if (cg6Var instanceof uok) {
            uokVar = (uok) cg6Var;
            int i2 = uokVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uokVar.l = i2 - Integer.MIN_VALUE;
                Object obj = uokVar.j;
                nm6 nm6Var = nm6.a;
                i = uokVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    et etVar = (et) this.a.f.getValue();
                    uokVar.l = 1;
                    obj = etVar.i(str, uokVar);
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
                HashSet hashSet = new HashSet();
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    hashSet.add(((q1g) it.next()).a);
                }
                return hashSet;
            }
        }
        uokVar = new uok(this, cg6Var);
        Object obj2 = uokVar.j;
        nm6 nm6Var2 = nm6.a;
        i = uokVar.l;
        if (i != 0) {
        }
        HashSet hashSet2 = new HashSet();
        it = ((Iterable) obj2).iterator();
        while (it.hasNext()) {
        }
        return hashSet2;
    }

    public final Object b(String str, ArrayList arrayList, int i, int i2, cg6 cg6Var) {
        StringBuilder l = dfi.l("saveTracksToDatabase ", arrayList.size(), i, ", downloaded ", " of ");
        l.append(i2);
        ssg.a(4, "PhonotekaSynchronizer", l.toString(), null);
        Object b = ((fnk) this.a.d.getValue()).b(str, arrayList, cg6Var);
        return b == nm6.a ? b : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
    
        if (r3 == r6) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[LOOP:1: B:29:0x00ac->B:31:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(String str, rrl rrlVar, cg6 cg6Var) {
        vok vokVar;
        nm6 nm6Var;
        int i;
        Iterator it;
        Object i2;
        Set set;
        String str2 = str;
        rrl rrlVar2 = rrlVar;
        jyr jyrVar = this.a.e;
        if (cg6Var instanceof vok) {
            vokVar = (vok) cg6Var;
            int i3 = vokVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vokVar.o = i3 - Integer.MIN_VALUE;
                Object obj = vokVar.m;
                nm6Var = nm6.a;
                i = vokVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    rus rusVar = (rus) jyrVar.getValue();
                    List list = rrlVar2.b;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((t2m) it2.next()).a.a);
                    }
                    vokVar.j = str2;
                    vokVar.k = rrlVar2;
                    vokVar.o = 1;
                    obj = rusVar.j(vokVar, str2, arrayList);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        set = vokVar.l;
                        rrlVar2 = vokVar.k;
                        qgg.h0(obj);
                        int intValue = ((Number) obj).intValue();
                        List list2 = rrlVar2.b;
                        cvl cvlVar = rrlVar2.a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (set.contains(((t2m) obj2).a.a)) {
                                arrayList2.add(obj2);
                            }
                        }
                        ssg.a(4, "PhonotekaSynchronizer", "Update playlist " + cvlVar.g() + " track count from " + cvlVar.g + " to " + intValue, null);
                        return new rrl(cvl.a(rrlVar2.a, null, null, 0, intValue, 0L, null, null, null, null, null, null, null, null, null, null, 134217663), arrayList2, null);
                    }
                    rrl rrlVar3 = vokVar.k;
                    String str3 = vokVar.j;
                    qgg.h0(obj);
                    rrlVar2 = rrlVar3;
                    str2 = str3;
                }
                Set A0 = CollectionsKt.A0((Iterable) obj);
                rus rusVar2 = (rus) jyrVar.getValue();
                List list3 = rrlVar2.b;
                ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((t2m) it.next()).a.a);
                }
                vokVar.j = null;
                vokVar.k = rrlVar2;
                vokVar.l = A0;
                vokVar.o = 2;
                i2 = rusVar2.i(vokVar, str2, arrayList3);
                if (i2 != nm6Var) {
                    obj = i2;
                    set = A0;
                    int intValue2 = ((Number) obj).intValue();
                    List list22 = rrlVar2.b;
                    cvl cvlVar2 = rrlVar2.a;
                    ArrayList arrayList22 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    ssg.a(4, "PhonotekaSynchronizer", "Update playlist " + cvlVar2.g() + " track count from " + cvlVar2.g + " to " + intValue2, null);
                    return new rrl(cvl.a(rrlVar2.a, null, null, 0, intValue2, 0L, null, null, null, null, null, null, null, null, null, null, 134217663), arrayList22, null);
                }
                return nm6Var;
            }
        }
        vokVar = new vok(this, cg6Var);
        Object obj3 = vokVar.m;
        nm6Var = nm6.a;
        i = vokVar.o;
        if (i != 0) {
        }
        Set A02 = CollectionsKt.A0((Iterable) obj3);
        rus rusVar22 = (rus) jyrVar.getValue();
        List list32 = rrlVar2.b;
        ArrayList arrayList32 = new ArrayList(v75.o(list32, 10));
        it = list32.iterator();
        while (it.hasNext()) {
        }
        vokVar.j = null;
        vokVar.k = rrlVar2;
        vokVar.l = A02;
        vokVar.o = 2;
        i2 = rusVar22.i(vokVar, str2, arrayList32);
        if (i2 != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x039d A[LOOP:2: B:39:0x0397->B:41:0x039d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0282 A[LOOP:3: B:56:0x027c->B:58:0x0282, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r23v0, types: [epk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, a53 a53Var, cr crVar, cg6 cg6Var) {
        wok wokVar;
        nm6 nm6Var;
        int i;
        d63 d63Var;
        ArrayList<oq> arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        cwr cwrVar;
        ArrayList arrayList2;
        String str2;
        LinkedHashMap linkedHashMap3;
        List list;
        d63 d63Var2;
        cwr cwrVar2;
        LinkedHashMap linkedHashMap4;
        List list2;
        Iterator it;
        ArrayList arrayList3;
        List list3;
        List list4;
        ArrayList arrayList4;
        et etVar;
        cwr cwrVar3;
        Map map;
        String str3;
        ArrayList arrayList5;
        int a;
        Iterator it2;
        et etVar2;
        Map map2;
        d63 d63Var3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        et etVar3;
        cwr cwrVar4;
        ArrayList arrayList8;
        List list5;
        List list6;
        String str4 = str;
        jyr jyrVar = this.a.f;
        if (cg6Var instanceof wok) {
            wokVar = (wok) cg6Var;
            int i2 = wokVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wokVar.s = i2 - Integer.MIN_VALUE;
                Object obj = wokVar.q;
                nm6Var = nm6.a;
                i = wokVar.s;
                pt7 pt7Var = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    d63Var = (d63) a53Var.a;
                    cwr cwrVar5 = (cwr) a53Var.b;
                    if (((LinkedHashMap) crVar.c).isEmpty()) {
                        if (cwrVar5 != null && (list4 = cwrVar5.b) != null) {
                            List list7 = list4;
                            arrayList3 = new ArrayList(v75.o(list7, 10));
                            Iterator it3 = list7.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((yvr) it3.next()).a);
                            }
                        } else if (d63Var == null || (list3 = d63Var.c) == null) {
                            arrayList3 = null;
                        } else {
                            List list8 = list3;
                            arrayList3 = new ArrayList(v75.o(list8, 10));
                            Iterator it4 = list8.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((q1g) it4.next()).a);
                            }
                        }
                        if (arrayList3 != null) {
                            pt7Var.b(arrayList3);
                        }
                        return Unit.a;
                    }
                    Set entrySet = ((LinkedHashMap) crVar.c).entrySet();
                    arrayList = new ArrayList();
                    linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it5 = entrySet.iterator();
                    while (it5.hasNext()) {
                        Map.Entry entry = (Map.Entry) it5.next();
                        m9b m9bVar = (m9b) entry.getValue();
                        if (m9bVar instanceof i9b) {
                            arrayList.add(((i9b) m9bVar).a);
                        } else {
                            if (m9bVar instanceof k9b) {
                                p8k p8kVar = ((k9b) m9bVar).a;
                                if (p8kVar instanceof k8k) {
                                    linkedHashMap.put(entry.getKey(), p8kVar);
                                } else {
                                    it = it5;
                                    dfi.r("Can not update entity data with " + p8kVar, "PhonotekaSynchronizer");
                                }
                            } else {
                                it = it5;
                                if (m9bVar instanceof j9b) {
                                    arrayList9.add(entry.getKey());
                                } else {
                                    if (!(m9bVar instanceof h9b)) {
                                        b6e.s();
                                        return null;
                                    }
                                    arrayList10.add(entry.getKey());
                                }
                            }
                            it5 = it;
                        }
                        it = it5;
                        it5 = it;
                    }
                    if (cwrVar5 == null || (list2 = cwrVar5.b) == null) {
                        linkedHashMap2 = null;
                    } else {
                        List list9 = list2;
                        int a2 = tah.a(v75.o(list9, 10));
                        if (a2 < 16) {
                            a2 = 16;
                        }
                        linkedHashMap2 = new LinkedHashMap(a2);
                        Iterator it6 = list9.iterator();
                        while (it6.hasNext()) {
                            linkedHashMap2.put(((yvr) it6.next()).a, Boolean.TRUE);
                        }
                    }
                    if (linkedHashMap2 != null) {
                        int a3 = tah.a(v75.o(arrayList, 10));
                        if (a3 < 16) {
                            a3 = 16;
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(a3);
                        Iterator it7 = arrayList.iterator();
                        while (it7.hasNext()) {
                            String str5 = ((oq) it7.next()).a;
                            Boolean bool = (Boolean) linkedHashMap2.get(str5);
                            linkedHashMap5.put(str5, Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                        }
                        cwrVar2 = cwrVar5;
                        linkedHashMap4 = linkedHashMap5;
                        d63Var2 = d63Var;
                    } else {
                        if (d63Var == null || (list = d63Var.c) == null) {
                            wokVar.j = str4;
                            wokVar.k = d63Var;
                            wokVar.l = cwrVar5;
                            wokVar.m = arrayList;
                            wokVar.n = linkedHashMap;
                            wokVar.o = null;
                            wokVar.s = 1;
                            Serializable a4 = a(str4, wokVar);
                            if (a4 != nm6Var) {
                                cwrVar = cwrVar5;
                                arrayList2 = arrayList;
                                obj = a4;
                                str2 = str4;
                                linkedHashMap3 = linkedHashMap;
                            }
                            return nm6Var;
                        }
                        List list10 = list;
                        int a5 = tah.a(v75.o(list10, 10));
                        if (a5 < 16) {
                            a5 = 16;
                        }
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap(a5);
                        Iterator it8 = list10.iterator();
                        while (it8.hasNext()) {
                            linkedHashMap6.put(((q1g) it8.next()).a, Boolean.TRUE);
                        }
                        d63Var2 = d63Var;
                        cwrVar2 = cwrVar5;
                        linkedHashMap4 = linkedHashMap6;
                    }
                    if ((cwrVar2 != null ? cwrVar2.b : null) != null) {
                        List list11 = cwrVar2.b;
                        int a6 = tah.a(v75.o(list11, 10));
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(a6 < 16 ? 16 : a6);
                        for (Object obj2 : list11) {
                            linkedHashMap7.put(((yvr) obj2).a, obj2);
                        }
                        for (oq oqVar : arrayList) {
                            yvr yvrVar = (yvr) linkedHashMap7.get(oqVar.a);
                            if (yvrVar != null) {
                                oqVar.E = yvrVar.b;
                            }
                        }
                    }
                    arrayList4 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        Date date = ((oq) obj3).E;
                        if (date == null || date.getTime() == 0) {
                            arrayList11.add(obj3);
                        } else {
                            arrayList4.add(obj3);
                        }
                    }
                    ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList4.size(), arrayList11.size(), "addOrRewriteAlbums ", ", addOrUpdateAlbums "), null);
                    etVar = (et) jyrVar.getValue();
                    wokVar.j = str4;
                    wokVar.k = d63Var2;
                    wokVar.l = cwrVar2;
                    wokVar.m = null;
                    wokVar.n = linkedHashMap;
                    wokVar.o = linkedHashMap4;
                    wokVar.p = arrayList11;
                    wokVar.s = 2;
                    if (etVar.a(str4, arrayList4, linkedHashMap4, wokVar) != nm6Var) {
                        cwrVar3 = cwrVar2;
                        map = linkedHashMap;
                        str3 = str4;
                        arrayList5 = arrayList11;
                        etVar2 = (et) jyrVar.getValue();
                        wokVar.j = str3;
                        wokVar.k = d63Var2;
                        wokVar.l = cwrVar3;
                        wokVar.m = null;
                        wokVar.n = map;
                        wokVar.o = null;
                        wokVar.p = null;
                        wokVar.s = 3;
                        if (etVar2.c(str3, arrayList5, linkedHashMap4, wokVar) != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        arrayList5 = wokVar.p;
                        linkedHashMap4 = wokVar.o;
                        map = wokVar.n;
                        cwr cwrVar6 = wokVar.l;
                        d63Var2 = wokVar.k;
                        String str6 = wokVar.j;
                        qgg.h0(obj);
                        cwrVar3 = cwrVar6;
                        str3 = str6;
                        etVar2 = (et) jyrVar.getValue();
                        wokVar.j = str3;
                        wokVar.k = d63Var2;
                        wokVar.l = cwrVar3;
                        wokVar.m = null;
                        wokVar.n = map;
                        wokVar.o = null;
                        wokVar.p = null;
                        wokVar.s = 3;
                        if (etVar2.c(str3, arrayList5, linkedHashMap4, wokVar) != nm6Var) {
                            map2 = map;
                            d63Var3 = d63Var2;
                            arrayList6 = new ArrayList(map2.size());
                            while (r4.hasNext()) {
                            }
                            arrayList7 = null;
                            v3w.k("updateAlbumsLikeStatus ", map2.size(), 4, "PhonotekaSynchronizer", null);
                            etVar3 = (et) jyrVar.getValue();
                            wokVar.j = null;
                            wokVar.k = d63Var3;
                            wokVar.l = cwrVar3;
                            wokVar.m = null;
                            wokVar.n = null;
                            wokVar.o = null;
                            wokVar.p = null;
                            wokVar.s = 4;
                            if (etVar3.j(str3, arrayList6, wokVar) != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map3 = wokVar.n;
                        cwrVar4 = wokVar.l;
                        d63Var3 = wokVar.k;
                        qgg.h0(obj);
                        arrayList7 = null;
                        if (cwrVar4 == null && (list6 = cwrVar4.b) != null) {
                            List list12 = list6;
                            arrayList8 = new ArrayList(v75.o(list12, 10));
                            Iterator it9 = list12.iterator();
                            while (it9.hasNext()) {
                                arrayList8.add(((yvr) it9.next()).a);
                            }
                        } else if (d63Var3 != null || (list5 = d63Var3.c) == null) {
                            arrayList8 = arrayList7;
                        } else {
                            List list13 = list5;
                            arrayList8 = new ArrayList(v75.o(list13, 10));
                            Iterator it10 = list13.iterator();
                            while (it10.hasNext()) {
                                arrayList8.add(((q1g) it10.next()).a);
                            }
                        }
                        if (arrayList8 != null) {
                            pt7Var.b(arrayList8);
                        }
                        return Unit.a;
                    }
                    map2 = wokVar.n;
                    cwr cwrVar7 = wokVar.l;
                    d63 d63Var4 = wokVar.k;
                    str3 = wokVar.j;
                    qgg.h0(obj);
                    cwrVar3 = cwrVar7;
                    d63Var3 = d63Var4;
                    arrayList6 = new ArrayList(map2.size());
                    for (Map.Entry entry2 : map2.entrySet()) {
                        arrayList6.add(new au((String) entry2.getKey(), ((k8k) entry2.getValue()).a, ((k8k) entry2.getValue()).b));
                    }
                    arrayList7 = null;
                    v3w.k("updateAlbumsLikeStatus ", map2.size(), 4, "PhonotekaSynchronizer", null);
                    etVar3 = (et) jyrVar.getValue();
                    wokVar.j = null;
                    wokVar.k = d63Var3;
                    wokVar.l = cwrVar3;
                    wokVar.m = null;
                    wokVar.n = null;
                    wokVar.o = null;
                    wokVar.p = null;
                    wokVar.s = 4;
                    if (etVar3.j(str3, arrayList6, wokVar) != nm6Var) {
                        cwrVar4 = cwrVar3;
                        if (cwrVar4 == null) {
                        }
                        if (d63Var3 != null) {
                        }
                        arrayList8 = arrayList7;
                        if (arrayList8 != null) {
                        }
                        return Unit.a;
                    }
                    return nm6Var;
                }
                Map map4 = wokVar.n;
                arrayList2 = wokVar.m;
                cwrVar = wokVar.l;
                d63Var = wokVar.k;
                str2 = wokVar.j;
                qgg.h0(obj);
                linkedHashMap3 = map4;
                Set set = (Set) obj;
                a = tah.a(v75.o(arrayList2, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(a);
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String str7 = ((oq) it2.next()).a;
                    linkedHashMap8.put(str7, Boolean.valueOf(set.contains(str7)));
                }
                linkedHashMap = linkedHashMap3;
                arrayList = arrayList2;
                linkedHashMap4 = linkedHashMap8;
                str4 = str2;
                d63Var2 = d63Var;
                cwrVar2 = cwrVar;
                if ((cwrVar2 != null ? cwrVar2.b : null) != null) {
                }
                arrayList4 = new ArrayList();
                ArrayList arrayList112 = new ArrayList();
                while (r4.hasNext()) {
                }
                ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList4.size(), arrayList112.size(), "addOrRewriteAlbums ", ", addOrUpdateAlbums "), null);
                etVar = (et) jyrVar.getValue();
                wokVar.j = str4;
                wokVar.k = d63Var2;
                wokVar.l = cwrVar2;
                wokVar.m = null;
                wokVar.n = linkedHashMap;
                wokVar.o = linkedHashMap4;
                wokVar.p = arrayList112;
                wokVar.s = 2;
                if (etVar.a(str4, arrayList4, linkedHashMap4, wokVar) != nm6Var) {
                }
                return nm6Var;
            }
        }
        wokVar = new wok(this, cg6Var);
        Object obj4 = wokVar.q;
        nm6Var = nm6.a;
        i = wokVar.s;
        pt7 pt7Var2 = this.b;
        if (i != 0) {
        }
        Set set2 = (Set) obj4;
        a = tah.a(v75.o(arrayList2, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap82 = new LinkedHashMap(a);
        it2 = arrayList2.iterator();
        while (it2.hasNext()) {
        }
        linkedHashMap = linkedHashMap3;
        arrayList = arrayList2;
        linkedHashMap4 = linkedHashMap82;
        str4 = str2;
        d63Var2 = d63Var;
        cwrVar2 = cwrVar;
        if ((cwrVar2 != null ? cwrVar2.b : null) != null) {
        }
        arrayList4 = new ArrayList();
        ArrayList arrayList1122 = new ArrayList();
        while (r4.hasNext()) {
        }
        ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList4.size(), arrayList1122.size(), "addOrRewriteAlbums ", ", addOrUpdateAlbums "), null);
        etVar = (et) jyrVar.getValue();
        wokVar.j = str4;
        wokVar.k = d63Var2;
        wokVar.l = cwrVar2;
        wokVar.m = null;
        wokVar.n = linkedHashMap;
        wokVar.o = linkedHashMap4;
        wokVar.p = arrayList1122;
        wokVar.s = 2;
        if (etVar.a(str4, arrayList4, linkedHashMap4, wokVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04be A[LOOP:4: B:58:0x04b8->B:60:0x04be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033b A[LOOP:5: B:75:0x0335->B:77:0x033b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0368 A[LOOP:6: B:83:0x0362->B:85:0x0368, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0388  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v11, types: [c5b] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v24, types: [c5b] */
    /* JADX WARN: Type inference failed for: r15v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v32, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v47, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [pt7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, a53 a53Var, cr crVar, cg6 cg6Var) {
        xok xokVar;
        nm6 nm6Var;
        int i;
        e63 e63Var;
        ArrayList<c01> arrayList;
        LinkedHashMap linkedHashMap;
        HashSet hashSet;
        HashSet hashSet2;
        String str2;
        dwr dwrVar;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap i2;
        e63 e63Var2;
        dwr dwrVar2;
        LinkedHashMap linkedHashMap3;
        List list;
        List list2;
        ?? r3;
        List list3;
        ?? r15;
        List list4;
        List list5;
        List list6;
        ArrayList arrayList3;
        p51 p51Var;
        dwr dwrVar3;
        String str3;
        ArrayList arrayList4;
        Map map;
        int a;
        Iterator it;
        int a2;
        Iterator it2;
        p51 p51Var2;
        Map map2;
        e63 e63Var3;
        ArrayList arrayList5;
        Object obj;
        p51 p51Var3;
        dwr dwrVar4;
        ?? r32;
        List list7;
        ?? r152;
        List list8;
        List list9;
        List list10;
        String str4 = str;
        jyr jyrVar = this.a.g;
        if (cg6Var instanceof xok) {
            xokVar = (xok) cg6Var;
            int i3 = xokVar.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xokVar.s = i3 - Integer.MIN_VALUE;
                Object obj2 = xokVar.q;
                nm6Var = nm6.a;
                i = xokVar.s;
                ?? r9 = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    e63Var = (e63) a53Var.a;
                    dwr dwrVar5 = (dwr) a53Var.b;
                    if (((LinkedHashMap) crVar.d).isEmpty()) {
                        if (dwrVar5 != null && (list6 = dwrVar5.b) != null) {
                            List list11 = list6;
                            r3 = new ArrayList(v75.o(list11, 10));
                            Iterator it3 = list11.iterator();
                            while (it3.hasNext()) {
                                r3.add(((zvr) it3.next()).a);
                            }
                        } else if (e63Var == null || (list3 = e63Var.c) == null) {
                            r3 = 0;
                        } else {
                            List list12 = list3;
                            r3 = new ArrayList(v75.o(list12, 10));
                            Iterator it4 = list12.iterator();
                            while (it4.hasNext()) {
                                r3.add(((ac1) it4.next()).a);
                            }
                        }
                        if (dwrVar5 != null && (list5 = dwrVar5.c) != null) {
                            List list13 = list5;
                            r15 = new ArrayList(v75.o(list13, 10));
                            Iterator it5 = list13.iterator();
                            while (it5.hasNext()) {
                                r15.add(((zvr) it5.next()).a);
                            }
                        } else if (e63Var == null || (list4 = e63Var.d) == null) {
                            r15 = 0;
                        } else {
                            List list14 = list4;
                            r15 = new ArrayList(v75.o(list14, 10));
                            Iterator it6 = list14.iterator();
                            while (it6.hasNext()) {
                                r15.add(((ac1) it6.next()).a);
                            }
                        }
                        if (r3 == 0) {
                            r3 = c5b.a;
                        }
                        if (r15 == 0) {
                            r15 = c5b.a;
                        }
                        r9.c(r3, r15);
                        return Unit.a;
                    }
                    Set<Map.Entry> entrySet = ((LinkedHashMap) crVar.d).entrySet();
                    arrayList = new ArrayList();
                    linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        m9b m9bVar = (m9b) entry.getValue();
                        if (m9bVar instanceof i9b) {
                            arrayList.add(((i9b) m9bVar).a);
                        } else if (m9bVar instanceof k9b) {
                            p8k p8kVar = ((k9b) m9bVar).a;
                            if (p8kVar instanceof l8k) {
                                linkedHashMap.put(entry.getKey(), p8kVar);
                            } else {
                                dfi.r("Can not update entity data with " + p8kVar, "PhonotekaSynchronizer");
                            }
                        } else if (m9bVar instanceof j9b) {
                            arrayList6.add(entry.getKey());
                        } else {
                            if (!(m9bVar instanceof h9b)) {
                                b6e.s();
                                return null;
                            }
                            arrayList7.add(entry.getKey());
                        }
                    }
                    if (dwrVar5 == null || (list2 = dwrVar5.b) == null) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        Iterator it7 = list2.iterator();
                        while (it7.hasNext()) {
                            hashSet.add(((zvr) it7.next()).a);
                        }
                    }
                    if (dwrVar5 == null || (list = dwrVar5.c) == null) {
                        hashSet2 = null;
                    } else {
                        hashSet2 = new HashSet();
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            hashSet2.add(((zvr) it8.next()).a);
                        }
                    }
                    if (hashSet == null || hashSet2 == null) {
                        if (e63Var == null) {
                            xokVar.j = str4;
                            xokVar.k = e63Var;
                            xokVar.l = dwrVar5;
                            xokVar.m = arrayList;
                            xokVar.n = linkedHashMap;
                            xokVar.s = 1;
                            Object g = ((p51) jyrVar.getValue()).g(str4, xokVar);
                            if (g != nm6Var) {
                                str2 = str4;
                                dwrVar = dwrVar5;
                                arrayList2 = arrayList;
                                linkedHashMap2 = linkedHashMap;
                                obj2 = g;
                            }
                            return nm6Var;
                        }
                        List list15 = e63Var.c;
                        int a3 = tah.a(v75.o(list15, 10));
                        if (a3 < 16) {
                            a3 = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(a3);
                        Iterator it9 = list15.iterator();
                        while (it9.hasNext()) {
                            linkedHashMap4.put(((ac1) it9.next()).a, j1g.a);
                        }
                        List list16 = e63Var.d;
                        int a4 = tah.a(v75.o(list16, 10));
                        if (a4 < 16) {
                            a4 = 16;
                        }
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap(a4);
                        Iterator it10 = list16.iterator();
                        while (it10.hasNext()) {
                            linkedHashMap5.put(((ac1) it10.next()).a, j1g.c);
                        }
                        i2 = uah.i(linkedHashMap4, linkedHashMap5);
                    } else {
                        int a5 = tah.a(v75.o(hashSet, 10));
                        if (a5 < 16) {
                            a5 = 16;
                        }
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap(a5);
                        for (Object obj3 : hashSet) {
                            linkedHashMap6.put(obj3, j1g.a);
                        }
                        int a6 = tah.a(v75.o(hashSet2, 10));
                        if (a6 < 16) {
                            a6 = 16;
                        }
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(a6);
                        for (Object obj4 : hashSet2) {
                            linkedHashMap7.put(obj4, j1g.c);
                        }
                        i2 = uah.i(linkedHashMap6, linkedHashMap7);
                    }
                    e63Var2 = e63Var;
                    dwrVar2 = dwrVar5;
                    linkedHashMap3 = i2;
                    if ((dwrVar2 != null ? dwrVar2.b : null) != null) {
                        if ((dwrVar2 != null ? dwrVar2.c : null) != null) {
                            List list17 = dwrVar2.b;
                            int a7 = tah.a(v75.o(list17, 10));
                            if (a7 < 16) {
                                a7 = 16;
                            }
                            LinkedHashMap linkedHashMap8 = new LinkedHashMap(a7);
                            for (Object obj5 : list17) {
                                linkedHashMap8.put(((zvr) obj5).a, obj5);
                            }
                            List list18 = dwrVar2.c;
                            int a8 = tah.a(v75.o(list18, 10));
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap(a8 < 16 ? 16 : a8);
                            for (Object obj6 : list18) {
                                linkedHashMap9.put(((zvr) obj6).a, obj6);
                            }
                            LinkedHashMap i4 = uah.i(linkedHashMap8, linkedHashMap9);
                            for (c01 c01Var : arrayList) {
                                zvr zvrVar = (zvr) i4.get(c01Var.a);
                                if (zvrVar != null) {
                                    c01Var.r = zvrVar.b;
                                }
                            }
                        }
                    }
                    arrayList3 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj7 : arrayList) {
                        Date date = ((c01) obj7).r;
                        if (date == null || date.getTime() == 0) {
                            arrayList8.add(obj7);
                        } else {
                            arrayList3.add(obj7);
                        }
                    }
                    ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList3.size(), arrayList8.size(), "addOrRewriteArtists ", ", addOrUpdateArtists "), null);
                    p51Var = (p51) jyrVar.getValue();
                    xokVar.j = str4;
                    xokVar.k = e63Var2;
                    xokVar.l = dwrVar2;
                    xokVar.m = null;
                    xokVar.n = linkedHashMap;
                    xokVar.o = linkedHashMap3;
                    xokVar.p = arrayList8;
                    xokVar.s = 2;
                    if (p51Var.a(str4, arrayList3, linkedHashMap3, xokVar) != nm6Var) {
                        dwrVar3 = dwrVar2;
                        str3 = str4;
                        arrayList4 = arrayList8;
                        map = linkedHashMap;
                        p51Var2 = (p51) jyrVar.getValue();
                        xokVar.j = str3;
                        xokVar.k = e63Var2;
                        xokVar.l = dwrVar3;
                        xokVar.m = null;
                        xokVar.n = map;
                        xokVar.o = null;
                        xokVar.p = null;
                        xokVar.s = 3;
                        if (p51Var2.c(str3, arrayList4, linkedHashMap3, xokVar) != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        arrayList4 = xokVar.p;
                        linkedHashMap3 = xokVar.o;
                        map = xokVar.n;
                        dwr dwrVar6 = xokVar.l;
                        e63Var2 = xokVar.k;
                        String str5 = xokVar.j;
                        qgg.h0(obj2);
                        dwrVar3 = dwrVar6;
                        str3 = str5;
                        p51Var2 = (p51) jyrVar.getValue();
                        xokVar.j = str3;
                        xokVar.k = e63Var2;
                        xokVar.l = dwrVar3;
                        xokVar.m = null;
                        xokVar.n = map;
                        xokVar.o = null;
                        xokVar.p = null;
                        xokVar.s = 3;
                        if (p51Var2.c(str3, arrayList4, linkedHashMap3, xokVar) != nm6Var) {
                            map2 = map;
                            e63Var3 = e63Var2;
                            arrayList5 = new ArrayList(map2.size());
                            while (r4.hasNext()) {
                            }
                            obj = null;
                            v3w.k("updateArtistsLikeStatus ", map2.size(), 4, "PhonotekaSynchronizer", null);
                            p51Var3 = (p51) jyrVar.getValue();
                            xokVar.j = null;
                            xokVar.k = e63Var3;
                            xokVar.l = dwrVar3;
                            xokVar.m = null;
                            xokVar.n = null;
                            xokVar.o = null;
                            xokVar.p = null;
                            xokVar.s = 4;
                            if (p51Var3.h(str3, arrayList5, xokVar) != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i == 3) {
                        map2 = xokVar.n;
                        dwr dwrVar7 = xokVar.l;
                        e63 e63Var4 = xokVar.k;
                        str3 = xokVar.j;
                        qgg.h0(obj2);
                        dwrVar3 = dwrVar7;
                        e63Var3 = e63Var4;
                        arrayList5 = new ArrayList(map2.size());
                        for (Map.Entry entry2 : map2.entrySet()) {
                            arrayList5.add(new ac1((String) entry2.getKey(), ((l8k) entry2.getValue()).a, ((l8k) entry2.getValue()).b));
                        }
                        obj = null;
                        v3w.k("updateArtistsLikeStatus ", map2.size(), 4, "PhonotekaSynchronizer", null);
                        p51Var3 = (p51) jyrVar.getValue();
                        xokVar.j = null;
                        xokVar.k = e63Var3;
                        xokVar.l = dwrVar3;
                        xokVar.m = null;
                        xokVar.n = null;
                        xokVar.o = null;
                        xokVar.p = null;
                        xokVar.s = 4;
                        if (p51Var3.h(str3, arrayList5, xokVar) != nm6Var) {
                            dwrVar4 = dwrVar3;
                            if (dwrVar4 == null) {
                            }
                            if (e63Var3 != null) {
                            }
                            r32 = obj;
                            if (dwrVar4 == null) {
                            }
                            if (e63Var3 != null) {
                            }
                            r152 = obj;
                            if (r32 == 0) {
                            }
                            if (r152 == 0) {
                            }
                            r9.c(r32, r152);
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map3 = xokVar.n;
                    dwrVar4 = xokVar.l;
                    e63Var3 = xokVar.k;
                    qgg.h0(obj2);
                    obj = null;
                    if (dwrVar4 == null && (list10 = dwrVar4.b) != null) {
                        List list19 = list10;
                        r32 = new ArrayList(v75.o(list19, 10));
                        Iterator it11 = list19.iterator();
                        while (it11.hasNext()) {
                            r32.add(((zvr) it11.next()).a);
                        }
                    } else if (e63Var3 != null || (list7 = e63Var3.c) == null) {
                        r32 = obj;
                    } else {
                        List list20 = list7;
                        r32 = new ArrayList(v75.o(list20, 10));
                        Iterator it12 = list20.iterator();
                        while (it12.hasNext()) {
                            r32.add(((ac1) it12.next()).a);
                        }
                    }
                    if (dwrVar4 == null && (list9 = dwrVar4.c) != null) {
                        List list21 = list9;
                        r152 = new ArrayList(v75.o(list21, 10));
                        Iterator it13 = list21.iterator();
                        while (it13.hasNext()) {
                            r152.add(((zvr) it13.next()).a);
                        }
                    } else if (e63Var3 != null || (list8 = e63Var3.d) == null) {
                        r152 = obj;
                    } else {
                        List list22 = list8;
                        r152 = new ArrayList(v75.o(list22, 10));
                        Iterator it14 = list22.iterator();
                        while (it14.hasNext()) {
                            r152.add(((ac1) it14.next()).a);
                        }
                    }
                    if (r32 == 0) {
                        r32 = c5b.a;
                    }
                    if (r152 == 0) {
                        r152 = c5b.a;
                    }
                    r9.c(r32, r152);
                    return Unit.a;
                }
                Map map4 = xokVar.n;
                arrayList2 = xokVar.m;
                dwrVar = xokVar.l;
                e63Var = xokVar.k;
                str2 = xokVar.j;
                qgg.h0(obj2);
                linkedHashMap2 = map4;
                bc1 bc1Var = (bc1) obj2;
                List list23 = bc1Var.a;
                ArrayList arrayList9 = bc1Var.b;
                List list24 = list23;
                a = tah.a(v75.o(list24, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap(a);
                it = list24.iterator();
                while (it.hasNext()) {
                    linkedHashMap10.put(((ac1) it.next()).a, j1g.a);
                }
                a2 = tah.a(v75.o(arrayList9, 10));
                if (a2 < 16) {
                    a2 = 16;
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap(a2);
                it2 = arrayList9.iterator();
                while (it2.hasNext()) {
                    linkedHashMap11.put(((ac1) it2.next()).a, j1g.c);
                }
                LinkedHashMap i5 = uah.i(linkedHashMap10, linkedHashMap11);
                linkedHashMap = linkedHashMap2;
                arrayList = arrayList2;
                e63Var2 = e63Var;
                str4 = str2;
                linkedHashMap3 = i5;
                dwrVar2 = dwrVar;
                if ((dwrVar2 != null ? dwrVar2.b : null) != null) {
                }
                arrayList3 = new ArrayList();
                ArrayList arrayList82 = new ArrayList();
                while (r4.hasNext()) {
                }
                ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList3.size(), arrayList82.size(), "addOrRewriteArtists ", ", addOrUpdateArtists "), null);
                p51Var = (p51) jyrVar.getValue();
                xokVar.j = str4;
                xokVar.k = e63Var2;
                xokVar.l = dwrVar2;
                xokVar.m = null;
                xokVar.n = linkedHashMap;
                xokVar.o = linkedHashMap3;
                xokVar.p = arrayList82;
                xokVar.s = 2;
                if (p51Var.a(str4, arrayList3, linkedHashMap3, xokVar) != nm6Var) {
                }
                return nm6Var;
            }
        }
        xokVar = new xok(this, cg6Var);
        Object obj22 = xokVar.q;
        nm6Var = nm6.a;
        i = xokVar.s;
        ?? r92 = this.b;
        if (i != 0) {
        }
        bc1 bc1Var2 = (bc1) obj22;
        List list232 = bc1Var2.a;
        ArrayList arrayList92 = bc1Var2.b;
        List list242 = list232;
        a = tah.a(v75.o(list242, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap102 = new LinkedHashMap(a);
        it = list242.iterator();
        while (it.hasNext()) {
        }
        a2 = tah.a(v75.o(arrayList92, 10));
        if (a2 < 16) {
        }
        LinkedHashMap linkedHashMap112 = new LinkedHashMap(a2);
        it2 = arrayList92.iterator();
        while (it2.hasNext()) {
        }
        LinkedHashMap i52 = uah.i(linkedHashMap102, linkedHashMap112);
        linkedHashMap = linkedHashMap2;
        arrayList = arrayList2;
        e63Var2 = e63Var;
        str4 = str2;
        linkedHashMap3 = i52;
        dwrVar2 = dwrVar;
        if ((dwrVar2 != null ? dwrVar2.b : null) != null) {
        }
        arrayList3 = new ArrayList();
        ArrayList arrayList822 = new ArrayList();
        while (r4.hasNext()) {
        }
        ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList3.size(), arrayList822.size(), "addOrRewriteArtists ", ", addOrUpdateArtists "), null);
        p51Var = (p51) jyrVar.getValue();
        xokVar.j = str4;
        xokVar.k = e63Var2;
        xokVar.l = dwrVar2;
        xokVar.m = null;
        xokVar.n = linkedHashMap;
        xokVar.o = linkedHashMap3;
        xokVar.p = arrayList822;
        xokVar.s = 2;
        if (p51Var.a(str4, arrayList3, linkedHashMap3, xokVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:10:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0087 -> B:11:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0089 -> B:11:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var, String str, ArrayList arrayList) {
        yok yokVar;
        int i;
        List list;
        String str2;
        Iterator it;
        if (cg6Var instanceof yok) {
            yokVar = (yok) cg6Var;
            int i2 = yokVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yokVar.o = i2 - Integer.MIN_VALUE;
                Object obj = yokVar.m;
                Serializable serializable = nm6.a;
                i = yokVar.o;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
                    Iterator it2 = arrayList.iterator();
                    list = q;
                    str2 = str;
                    it = it2;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = yokVar.l;
                    list = yokVar.k;
                    String str3 = yokVar.j;
                    qgg.h0(obj);
                    String str4 = str3;
                    rrl rrlVar = (rrl) obj;
                    str2 = str4;
                    list.add(rrlVar);
                    if (!it.hasNext()) {
                        rrlVar = (rrl) it.next();
                        cvl cvlVar = rrlVar.a;
                        if (Intrinsics.d(cvlVar.a, "3") && Intrinsics.d(cvlVar.c.a, str2)) {
                            yokVar.j = str2;
                            yokVar.k = list;
                            yokVar.l = it;
                            yokVar.o = 1;
                            Serializable c = c(str2, rrlVar, yokVar);
                            if (c == serializable) {
                                return serializable;
                            }
                            str3 = str2;
                            obj = c;
                            String str42 = str3;
                            rrl rrlVar2 = (rrl) obj;
                            str2 = str42;
                            list.add(rrlVar2);
                            if (!it.hasNext()) {
                            }
                        } else {
                            if (Intrinsics.d(cvlVar.a, "-14")) {
                                Intrinsics.d(cvlVar.c.a, str2);
                            }
                            list.add(rrlVar2);
                            if (!it.hasNext()) {
                                return list;
                            }
                        }
                    }
                }
            }
        }
        yokVar = new yok(this, cg6Var);
        Object obj2 = yokVar.m;
        Serializable serializable2 = nm6.a;
        i = yokVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x018c, code lost:
    
        if (e(r11, r2, r9, r6) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00c9, code lost:
    
        if (j(r9, r2, r11, r6) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02ab, code lost:
    
        if (k(r11, r2, r9, r6) == r0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x024b, code lost:
    
        if (i(r11, r9, r6) != r0) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, p73 p73Var, cr crVar, cg6 cg6Var) {
        zok zokVar;
        zok zokVar2;
        String str2;
        cr crVar2;
        String str3;
        cr crVar3;
        if (cg6Var instanceof zok) {
            zokVar = (zok) cg6Var;
            int i = zokVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zokVar.o = i - Integer.MIN_VALUE;
                zokVar2 = zokVar;
                Object obj = zokVar2.m;
                Object obj2 = nm6.a;
                switch (zokVar2.o) {
                    case 0:
                        qgg.h0(obj);
                        List list = p73Var.a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof g63) {
                                arrayList.add(obj3);
                            }
                        }
                        k63 k63Var = (k63) CollectionsKt.firstOrNull(arrayList);
                        List list2 = p73Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list2) {
                            if (obj4 instanceof fwr) {
                                arrayList2.add(obj4);
                            }
                        }
                        a53 a53Var = new a53(k63Var, (jwr) CollectionsKt.firstOrNull(arrayList2));
                        zokVar2.j = str;
                        zokVar2.k = p73Var;
                        zokVar2.l = crVar;
                        zokVar2.o = 1;
                        break;
                    case 1:
                        crVar = zokVar2.l;
                        p73Var = zokVar2.k;
                        str = zokVar2.j;
                        qgg.h0(obj);
                        List list3 = p73Var.a;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list3) {
                            if (obj5 instanceof d63) {
                                arrayList3.add(obj5);
                            }
                        }
                        k63 k63Var2 = (k63) CollectionsKt.firstOrNull(arrayList3);
                        List list4 = p73Var.b;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : list4) {
                            if (obj6 instanceof cwr) {
                                arrayList4.add(obj6);
                            }
                        }
                        a53 a53Var2 = new a53(k63Var2, (jwr) CollectionsKt.firstOrNull(arrayList4));
                        zokVar2.j = str;
                        zokVar2.k = p73Var;
                        zokVar2.l = crVar;
                        zokVar2.o = 2;
                        if (d(str, a53Var2, crVar, zokVar2) != obj2) {
                            cr crVar4 = crVar;
                            str2 = str;
                            crVar2 = crVar4;
                            List list5 = p73Var.a;
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj7 : list5) {
                                if (obj7 instanceof e63) {
                                    arrayList5.add(obj7);
                                }
                            }
                            k63 k63Var3 = (k63) CollectionsKt.firstOrNull(arrayList5);
                            List list6 = p73Var.b;
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj8 : list6) {
                                if (obj8 instanceof dwr) {
                                    arrayList6.add(obj8);
                                }
                            }
                            a53 a53Var3 = new a53(k63Var3, (jwr) CollectionsKt.firstOrNull(arrayList6));
                            zokVar2.j = str2;
                            zokVar2.k = p73Var;
                            zokVar2.l = crVar2;
                            zokVar2.o = 3;
                            break;
                        }
                        return obj2;
                    case 2:
                        crVar2 = zokVar2.l;
                        p73Var = zokVar2.k;
                        str2 = zokVar2.j;
                        qgg.h0(obj);
                        List list52 = p73Var.a;
                        ArrayList arrayList52 = new ArrayList();
                        while (r12.hasNext()) {
                        }
                        k63 k63Var32 = (k63) CollectionsKt.firstOrNull(arrayList52);
                        List list62 = p73Var.b;
                        ArrayList arrayList62 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        a53 a53Var32 = new a53(k63Var32, (jwr) CollectionsKt.firstOrNull(arrayList62));
                        zokVar2.j = str2;
                        zokVar2.k = p73Var;
                        zokVar2.l = crVar2;
                        zokVar2.o = 3;
                        break;
                    case 3:
                        crVar2 = zokVar2.l;
                        p73Var = zokVar2.k;
                        str2 = zokVar2.j;
                        qgg.h0(obj);
                        cr crVar5 = crVar2;
                        String str4 = str2;
                        List list7 = p73Var.a;
                        List list8 = p73Var.b;
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj9 : list7) {
                            if (obj9 instanceof i63) {
                                arrayList7.add(obj9);
                            }
                        }
                        k63 k63Var4 = (k63) CollectionsKt.firstOrNull(arrayList7);
                        List list9 = list8;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj10 : list9) {
                            if (obj10 instanceof hwr) {
                                arrayList8.add(obj10);
                            }
                        }
                        a53 a53Var4 = new a53(k63Var4, (jwr) CollectionsKt.firstOrNull(arrayList8));
                        List list10 = p73Var.a;
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj11 : list10) {
                            if (obj11 instanceof f63) {
                                arrayList9.add(obj11);
                            }
                        }
                        k63 k63Var5 = (k63) CollectionsKt.firstOrNull(arrayList9);
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj12 : list9) {
                            if (obj12 instanceof ewr) {
                                arrayList10.add(obj12);
                            }
                        }
                        a53 a53Var5 = new a53(k63Var5, (jwr) CollectionsKt.firstOrNull(arrayList10));
                        zokVar2.j = str4;
                        zokVar2.k = p73Var;
                        zokVar2.l = crVar5;
                        zokVar2.o = 4;
                        if (h(str4, a53Var4, a53Var5, crVar5, zokVar2) != obj2) {
                            str3 = str4;
                            crVar3 = crVar5;
                            zokVar2.j = str3;
                            zokVar2.k = p73Var;
                            zokVar2.l = crVar3;
                            zokVar2.o = 5;
                            break;
                        }
                        return obj2;
                    case 4:
                        crVar3 = zokVar2.l;
                        p73Var = zokVar2.k;
                        str3 = zokVar2.j;
                        qgg.h0(obj);
                        zokVar2.j = str3;
                        zokVar2.k = p73Var;
                        zokVar2.l = crVar3;
                        zokVar2.o = 5;
                        break;
                    case 5:
                        crVar3 = zokVar2.l;
                        p73Var = zokVar2.k;
                        str3 = zokVar2.j;
                        qgg.h0(obj);
                        List list11 = p73Var.a;
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj13 : list11) {
                            if (obj13 instanceof h63) {
                                arrayList11.add(obj13);
                            }
                        }
                        k63 k63Var6 = (k63) CollectionsKt.firstOrNull(arrayList11);
                        List list12 = p73Var.b;
                        ArrayList arrayList12 = new ArrayList();
                        for (Object obj14 : list12) {
                            if (obj14 instanceof gwr) {
                                arrayList12.add(obj14);
                            }
                        }
                        a53 a53Var6 = new a53(k63Var6, (jwr) CollectionsKt.firstOrNull(arrayList12));
                        zokVar2.j = null;
                        zokVar2.k = null;
                        zokVar2.l = null;
                        zokVar2.o = 6;
                        break;
                    case 6:
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        zokVar = new zok(this, cg6Var);
        zokVar2 = zokVar;
        Object obj15 = zokVar2.m;
        Object obj22 = nm6.a;
        switch (zokVar2.o) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x079c, code lost:
    
        if (r0.k(r5, r7, r3) == r9) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0463  */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0, types: [epk] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x058a -> B:64:0x05a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, a53 a53Var, a53 a53Var2, cr crVar, cg6 cg6Var) {
        apk apkVar;
        int i;
        f63 f63Var;
        ewr ewrVar;
        Map linkedHashMap;
        pt7 pt7Var;
        ac0 ac0Var;
        LinkedHashMap linkedHashMap2;
        HashSet hashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        String str3;
        nm6 nm6Var;
        hwr hwrVar;
        Map map;
        ArrayList arrayList3;
        HashSet hashSet2;
        String str4;
        List list;
        nm6 nm6Var2;
        ArrayList arrayList4;
        List list2;
        ArrayList arrayList5;
        List list3;
        Iterator it;
        ArrayList arrayList6;
        List list4;
        Object obj;
        Collection collection;
        xtl xtlVar;
        ArrayList arrayList7;
        Iterator it2;
        hwr hwrVar2;
        String str5;
        String str6;
        int i2;
        int i3;
        cvl cvlVar;
        String str7;
        Collection collection2;
        pt7 pt7Var2;
        Collection collection3;
        Collection collection4;
        String str8;
        hwr hwrVar3;
        ewr ewrVar2;
        List list5;
        Map map2;
        Iterator it3;
        pt7 pt7Var3;
        int i4;
        Object j;
        Collection collection5;
        f63 f63Var2;
        Map map3;
        ewr ewrVar3;
        xtl xtlVar2;
        hwr hwrVar4;
        rrl rrlVar;
        cvl cvlVar2;
        String str9;
        Map map4;
        int i5;
        String str10;
        ArrayList arrayList8;
        ArrayList arrayList9;
        Collection collection6;
        ArrayList arrayList10;
        Collection collection7;
        Iterator it4;
        apk apkVar2;
        ewr ewrVar4;
        hwr hwrVar5;
        Collection collection8;
        List list6;
        String str11;
        int i6;
        Iterator it5;
        String str12;
        List list7;
        hwr hwrVar6;
        int i7;
        ac0 ac0Var2;
        String str13;
        ewr ewrVar5;
        f63 f63Var3;
        List list8;
        ArrayList arrayList11;
        ArrayList arrayList12;
        List list9;
        String str14 = str;
        cr crVar2 = crVar;
        if (cg6Var instanceof apk) {
            apkVar = (apk) cg6Var;
            int i8 = apkVar.G;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                apkVar.G = i8 - Integer.MIN_VALUE;
                Object obj2 = apkVar.E;
                nm6 nm6Var3 = nm6.a;
                i = apkVar.G;
                String str15 = "3";
                String str16 = "PhonotekaSynchronizer";
                pt7 pt7Var4 = this.b;
                ac0 ac0Var3 = this.a;
                switch (i) {
                    case 0:
                        qgg.h0(obj2);
                        hwr hwrVar7 = (hwr) a53Var.b;
                        f63Var = (f63) a53Var2.a;
                        ewrVar = (ewr) a53Var2.b;
                        if (((LinkedHashMap) crVar2.e).isEmpty()) {
                            if (ewrVar != null && (list2 = ewrVar.a) != null) {
                                List list10 = list2;
                                arrayList4 = new ArrayList(v75.o(list10, 10));
                                Iterator it6 = list10.iterator();
                                while (it6.hasNext()) {
                                    arrayList4.add(((owr) it6.next()).a);
                                }
                            } else if (f63Var != null) {
                                ArrayList arrayList13 = f63Var.a;
                                arrayList4 = new ArrayList(v75.o(arrayList13, 10));
                                Iterator it7 = arrayList13.iterator();
                                while (it7.hasNext()) {
                                    arrayList4.add(((z1g) it7.next()).a);
                                }
                            } else {
                                arrayList4 = null;
                            }
                            if (arrayList4 != null) {
                                pt7Var4.d(arrayList4);
                            }
                            return Unit.a;
                        }
                        Set<Map.Entry> entrySet = ((LinkedHashMap) crVar2.e).entrySet();
                        ArrayList arrayList14 = new ArrayList();
                        linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        for (Map.Entry entry : entrySet) {
                            ac0 ac0Var4 = ac0Var3;
                            m9b m9bVar = (m9b) entry.getValue();
                            pt7 pt7Var5 = pt7Var4;
                            if (m9bVar instanceof i9b) {
                                arrayList14.add(((i9b) m9bVar).a);
                            } else {
                                if (m9bVar instanceof k9b) {
                                    p8k p8kVar = ((k9b) m9bVar).a;
                                    if (p8kVar instanceof m8k) {
                                        linkedHashMap.put(entry.getKey(), p8kVar);
                                    } else {
                                        nm6Var2 = nm6Var3;
                                        dfi.r("Can not update entity data with " + p8kVar, "PhonotekaSynchronizer");
                                    }
                                } else {
                                    nm6Var2 = nm6Var3;
                                    if (m9bVar instanceof j9b) {
                                        arrayList15.add(entry.getKey());
                                    } else {
                                        if (!(m9bVar instanceof h9b)) {
                                            b6e.s();
                                            return null;
                                        }
                                        arrayList16.add(entry.getKey());
                                    }
                                }
                                pt7Var4 = pt7Var5;
                                ac0Var3 = ac0Var4;
                                nm6Var3 = nm6Var2;
                            }
                            nm6Var2 = nm6Var3;
                            pt7Var4 = pt7Var5;
                            ac0Var3 = ac0Var4;
                            nm6Var3 = nm6Var2;
                        }
                        nm6 nm6Var4 = nm6Var3;
                        pt7Var = pt7Var4;
                        ac0Var = ac0Var3;
                        if (ewrVar == null || (list = ewrVar.a) == null) {
                            linkedHashMap2 = null;
                        } else {
                            List<owr> list11 = list;
                            int a = tah.a(v75.o(list11, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            linkedHashMap2 = new LinkedHashMap(a);
                            for (owr owrVar : list11) {
                                linkedHashMap2.put(owrVar.a, owrVar.b);
                            }
                        }
                        if (f63Var != null) {
                            ArrayList arrayList17 = f63Var.a;
                            hashSet = new HashSet();
                            Iterator it8 = arrayList17.iterator();
                            while (it8.hasNext()) {
                                hashSet.add(((z1g) it8.next()).a);
                            }
                        } else {
                            hashSet = null;
                        }
                        if (linkedHashMap2 != null) {
                            Iterator it9 = arrayList14.iterator();
                            while (it9.hasNext()) {
                                rrl rrlVar2 = (rrl) it9.next();
                                Iterator it10 = it9;
                                Date date = (Date) linkedHashMap2.get(rrlVar2.a.g());
                                if (date != null) {
                                    rrlVar2.a.A = date;
                                }
                                it9 = it10;
                            }
                        }
                        Iterator it11 = arrayList14.iterator();
                        arrayList = null;
                        arrayList2 = null;
                        while (it11.hasNext()) {
                            String str17 = str16;
                            rrl rrlVar3 = (rrl) it11.next();
                            cvl cvlVar3 = rrlVar3.a;
                            List list12 = rrlVar3.b;
                            String str18 = cvlVar3.a;
                            ArrayList arrayList18 = arrayList14;
                            drt drtVar = cvlVar3.c;
                            if (Intrinsics.d(str18, str15) && Intrinsics.d(drtVar.a, str14)) {
                                List list13 = list12;
                                arrayList3 = arrayList;
                                str4 = str15;
                                arrayList2 = new ArrayList(v75.o(list13, 10));
                                Iterator it12 = list13.iterator();
                                while (it12.hasNext()) {
                                    t2m t2mVar = (t2m) it12.next();
                                    arrayList2.add(new unk(t2mVar.a, t2mVar.b, lxs.b));
                                    it12 = it12;
                                    hashSet = hashSet;
                                }
                                hashSet2 = hashSet;
                            } else {
                                arrayList3 = arrayList;
                                hashSet2 = hashSet;
                                str4 = str15;
                            }
                            if (Intrinsics.d(cvlVar3.a, "-14") && Intrinsics.d(drtVar.a, str14)) {
                                List<t2m> list14 = list12;
                                arrayList = new ArrayList(v75.o(list14, 10));
                                for (t2m t2mVar2 : list14) {
                                    arrayList.add(new unk(t2mVar2.a, t2mVar2.b, lxs.c));
                                }
                                arrayList14 = arrayList18;
                                str16 = str17;
                                str15 = str4;
                            } else {
                                arrayList14 = arrayList18;
                                str16 = str17;
                                str15 = str4;
                                arrayList = arrayList3;
                            }
                            hashSet = hashSet2;
                        }
                        str2 = str15;
                        str3 = str16;
                        apkVar.j = str14;
                        apkVar.k = crVar2;
                        apkVar.l = hwrVar7;
                        apkVar.m = f63Var;
                        apkVar.n = ewrVar;
                        apkVar.o = linkedHashMap;
                        apkVar.p = arrayList15;
                        apkVar.q = linkedHashMap2;
                        apkVar.r = hashSet;
                        apkVar.s = arrayList2;
                        apkVar.t = arrayList;
                        apkVar.G = 1;
                        Object f = f(apkVar, str14, arrayList14);
                        nm6Var = nm6Var4;
                        if (f != nm6Var) {
                            hwrVar = hwrVar7;
                            obj2 = f;
                            map = linkedHashMap2;
                            arrayList5 = arrayList15;
                            list3 = (List) obj2;
                            List list15 = list3;
                            it = list15.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    arrayList6 = arrayList;
                                    list4 = list3;
                                    obj = null;
                                } else {
                                    obj = it.next();
                                    rrl rrlVar4 = (rrl) obj;
                                    arrayList6 = arrayList;
                                    list4 = list3;
                                    str7 = str2;
                                    if (!Intrinsics.d(rrlVar4.a.a, str7) || !Intrinsics.d(rrlVar4.a.c.a, str14)) {
                                        arrayList = arrayList6;
                                        str2 = str7;
                                        list3 = list4;
                                    }
                                }
                            }
                            rrl rrlVar5 = (rrl) obj;
                            crVar2.h = (rrlVar5 != null || (cvlVar = rrlVar5.a) == null) ? null : Integer.valueOf(cvlVar.g);
                            int size = list4.size();
                            int size2 = linkedHashMap.size();
                            int size3 = arrayList5.size();
                            String str19 = str14;
                            StringBuilder l = dfi.l("updatePlaylists ", size, size2, ", updatePlaylistPartial ", ", deletePlaylists ");
                            l.append(size3);
                            ssg.a(4, str3, l.toString(), null);
                            xtl c = ac0Var.c();
                            ArrayList arrayList19 = new ArrayList(v75.o(list15, 10));
                            Iterator it13 = list15.iterator();
                            collection = arrayList6;
                            xtlVar = c;
                            arrayList7 = arrayList19;
                            it2 = it13;
                            hwrVar2 = hwrVar;
                            str5 = str19;
                            str6 = str5;
                            i2 = 0;
                            i3 = 0;
                            collection2 = arrayList5;
                            if (!it2.hasNext()) {
                                ArrayList arrayList20 = arrayList7;
                                rrl rrlVar6 = (rrl) it2.next();
                                Collection collection9 = collection2;
                                cvl cvlVar4 = rrlVar6.a;
                                ArrayList arrayList21 = arrayList2;
                                nvl g = cvlVar4.g();
                                apkVar.j = str5;
                                Map map5 = linkedHashMap;
                                apkVar.k = null;
                                apkVar.l = hwrVar2;
                                apkVar.m = f63Var;
                                apkVar.n = ewrVar;
                                apkVar.o = map5;
                                apkVar.p = (List) collection9;
                                apkVar.q = map;
                                apkVar.r = hashSet;
                                apkVar.s = arrayList21;
                                apkVar.t = (List) collection;
                                apkVar.u = null;
                                ArrayList arrayList22 = arrayList20;
                                apkVar.v = arrayList22;
                                ewr ewrVar6 = ewrVar;
                                it3 = it2;
                                apkVar.w = it3;
                                apkVar.x = rrlVar6;
                                apkVar.y = cvlVar4;
                                apkVar.z = xtlVar;
                                apkVar.A = str6;
                                apkVar.B = arrayList22;
                                apkVar.C = i2;
                                apkVar.D = i3;
                                apkVar.G = 2;
                                if (map != null) {
                                    j = Boolean.valueOf(map.containsKey(g));
                                } else if (hashSet != null) {
                                    j = Boolean.valueOf(hashSet.contains(g));
                                } else {
                                    pt7Var3 = pt7Var;
                                    i4 = i2;
                                    j = ((t3g) pt7Var3.b.getValue()).j(g.d(), apkVar);
                                    if (j != nm6Var) {
                                        collection5 = collection;
                                        f63Var2 = f63Var;
                                        map3 = map5;
                                        ewrVar3 = ewrVar6;
                                        ArrayList arrayList23 = arrayList20;
                                        xtlVar2 = xtlVar;
                                        hwrVar4 = hwrVar2;
                                        rrlVar = rrlVar6;
                                        cvlVar2 = cvlVar4;
                                        str9 = str5;
                                        map4 = map;
                                        i5 = i4;
                                        str10 = str6;
                                        arrayList8 = arrayList21;
                                        arrayList9 = arrayList23;
                                        collection6 = collection9;
                                        arrayList10 = arrayList23;
                                        arrayList9.add(new stl(cvlVar2, ((Boolean) j).booleanValue(), rrlVar.b));
                                        collection = collection5;
                                        i2 = i5;
                                        str5 = str9;
                                        str6 = str10;
                                        map = map4;
                                        it2 = it3;
                                        arrayList7 = arrayList10;
                                        collection2 = collection6;
                                        xtlVar = xtlVar2;
                                        arrayList2 = arrayList8;
                                        hwrVar2 = hwrVar4;
                                        ewrVar = ewrVar3;
                                        f63Var = f63Var2;
                                        pt7Var = pt7Var3;
                                        linkedHashMap = map3;
                                        if (!it2.hasNext()) {
                                            Collection collection10 = collection2;
                                            ArrayList arrayList24 = arrayList2;
                                            Map map6 = linkedHashMap;
                                            pt7Var2 = pt7Var;
                                            apkVar.j = str5;
                                            apkVar.k = null;
                                            apkVar.l = hwrVar2;
                                            apkVar.m = f63Var;
                                            apkVar.n = ewrVar;
                                            apkVar.o = map6;
                                            apkVar.p = (List) collection10;
                                            apkVar.q = null;
                                            apkVar.r = null;
                                            apkVar.s = arrayList24;
                                            apkVar.t = (List) collection;
                                            apkVar.u = null;
                                            apkVar.v = null;
                                            apkVar.w = null;
                                            apkVar.x = null;
                                            apkVar.y = null;
                                            apkVar.z = null;
                                            apkVar.A = null;
                                            apkVar.B = null;
                                            apkVar.G = 3;
                                            if (xtlVar.b(apkVar, str6, arrayList7) != nm6Var) {
                                                collection3 = collection;
                                                collection4 = collection10;
                                                str8 = str5;
                                                hwrVar3 = hwrVar2;
                                                ewrVar2 = ewrVar;
                                                list5 = arrayList24;
                                                map2 = map6;
                                                collection7 = collection4;
                                                it4 = map2.entrySet().iterator();
                                                apkVar2 = apkVar;
                                                ewrVar4 = ewrVar2;
                                                hwrVar5 = hwrVar3;
                                                collection8 = collection3;
                                                list6 = list5;
                                                str11 = str8;
                                                i6 = 0;
                                                while (it4.hasNext()) {
                                                    Map.Entry entry2 = (Map.Entry) it4.next();
                                                    nvl nvlVar = (nvl) entry2.getKey();
                                                    m8k m8kVar = (m8k) entry2.getValue();
                                                    xtl c2 = ac0Var.c();
                                                    m8kVar.getClass();
                                                    Integer num = m8kVar.a;
                                                    List list16 = m8kVar.b;
                                                    apkVar2.j = str11;
                                                    apkVar2.k = null;
                                                    apkVar2.l = hwrVar5;
                                                    apkVar2.m = f63Var;
                                                    apkVar2.n = ewrVar4;
                                                    apkVar2.o = null;
                                                    apkVar2.p = (List) collection7;
                                                    apkVar2.q = null;
                                                    apkVar2.r = null;
                                                    apkVar2.s = list6;
                                                    apkVar2.t = (List) collection8;
                                                    apkVar2.u = it4;
                                                    apkVar2.v = null;
                                                    apkVar2.w = null;
                                                    apkVar2.C = i6;
                                                    apkVar2.D = 0;
                                                    apkVar2.G = 4;
                                                    str11 = str11;
                                                    if (c2.c(str11, nvlVar, num, list16, apkVar2) == nm6Var) {
                                                    }
                                                }
                                                String str20 = str11;
                                                it5 = collection7.iterator();
                                                str12 = str20;
                                                apkVar = apkVar2;
                                                list7 = list6;
                                                hwrVar6 = hwrVar5;
                                                i7 = 0;
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        ArrayList arrayList25 = new ArrayList();
                                                        ArrayList arrayList26 = new ArrayList();
                                                        if (list7 != null) {
                                                            arrayList25.add(lxs.b);
                                                            arrayList26.addAll(list7);
                                                        }
                                                        if (collection8 != null) {
                                                            arrayList25.add(lxs.c);
                                                            arrayList26.addAll(collection8);
                                                        }
                                                        ac0Var2 = ac0Var;
                                                        i2m i2mVar = (i2m) ac0Var2.j.getValue();
                                                        apkVar.j = str12;
                                                        apkVar.k = null;
                                                        apkVar.l = hwrVar6;
                                                        apkVar.m = f63Var;
                                                        apkVar.n = ewrVar4;
                                                        apkVar.o = null;
                                                        apkVar.p = null;
                                                        apkVar.q = null;
                                                        apkVar.r = null;
                                                        apkVar.s = null;
                                                        apkVar.t = null;
                                                        apkVar.u = null;
                                                        apkVar.v = null;
                                                        apkVar.w = null;
                                                        apkVar.G = 6;
                                                        if (i2mVar.k(str12, arrayList25, arrayList26, apkVar) != nm6Var) {
                                                            str13 = str12;
                                                            ewrVar5 = ewrVar4;
                                                            f63Var3 = f63Var;
                                                            break;
                                                        }
                                                    } else {
                                                        nvl nvlVar2 = (nvl) it5.next();
                                                        xtl c3 = ac0Var.c();
                                                        apkVar.j = str12;
                                                        apkVar.k = null;
                                                        apkVar.l = hwrVar6;
                                                        apkVar.m = f63Var;
                                                        apkVar.n = ewrVar4;
                                                        apkVar.o = null;
                                                        apkVar.p = null;
                                                        apkVar.q = null;
                                                        apkVar.r = null;
                                                        apkVar.s = list7;
                                                        apkVar.t = (List) collection8;
                                                        apkVar.u = it5;
                                                        apkVar.v = null;
                                                        apkVar.w = null;
                                                        apkVar.C = i7;
                                                        apkVar.D = 0;
                                                        apkVar.G = 5;
                                                        if (c3.a(str12, nvlVar2, apkVar) == nm6Var) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                pt7Var3 = pt7Var;
                                i4 = i2;
                                if (j != nm6Var) {
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        List list17 = apkVar.t;
                        List list18 = apkVar.s;
                        HashSet hashSet3 = apkVar.r;
                        map = apkVar.q;
                        List list19 = apkVar.p;
                        linkedHashMap = apkVar.o;
                        ewrVar = apkVar.n;
                        f63Var = apkVar.m;
                        hwrVar = apkVar.l;
                        cr crVar3 = apkVar.k;
                        str14 = apkVar.j;
                        qgg.h0(obj2);
                        str2 = "3";
                        pt7Var = pt7Var4;
                        ac0Var = ac0Var3;
                        arrayList2 = list18;
                        nm6Var = nm6Var3;
                        arrayList = list17;
                        hashSet = hashSet3;
                        crVar2 = crVar3;
                        str3 = "PhonotekaSynchronizer";
                        arrayList5 = list19;
                        list3 = (List) obj2;
                        List list152 = list3;
                        it = list152.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                            arrayList = arrayList6;
                            str2 = str7;
                            list3 = list4;
                        }
                        rrl rrlVar52 = (rrl) obj;
                        if (rrlVar52 != null) {
                            break;
                        }
                        crVar2.h = (rrlVar52 != null || (cvlVar = rrlVar52.a) == null) ? null : Integer.valueOf(cvlVar.g);
                        int size4 = list4.size();
                        int size22 = linkedHashMap.size();
                        int size32 = arrayList5.size();
                        String str192 = str14;
                        StringBuilder l2 = dfi.l("updatePlaylists ", size4, size22, ", updatePlaylistPartial ", ", deletePlaylists ");
                        l2.append(size32);
                        ssg.a(4, str3, l2.toString(), null);
                        xtl c4 = ac0Var.c();
                        ArrayList arrayList192 = new ArrayList(v75.o(list152, 10));
                        Iterator it132 = list152.iterator();
                        collection = arrayList6;
                        xtlVar = c4;
                        arrayList7 = arrayList192;
                        it2 = it132;
                        hwrVar2 = hwrVar;
                        str5 = str192;
                        str6 = str5;
                        i2 = 0;
                        i3 = 0;
                        collection2 = arrayList5;
                        if (!it2.hasNext()) {
                        }
                        return nm6Var;
                    case 2:
                        int i9 = apkVar.D;
                        i5 = apkVar.C;
                        Collection collection11 = apkVar.B;
                        str10 = apkVar.A;
                        xtl xtlVar3 = apkVar.z;
                        cvl cvlVar5 = apkVar.y;
                        rrl rrlVar7 = apkVar.x;
                        Iterator it14 = apkVar.w;
                        Collection collection12 = apkVar.v;
                        Collection collection13 = (List) apkVar.t;
                        List list20 = apkVar.s;
                        HashSet hashSet4 = apkVar.r;
                        Map map7 = apkVar.q;
                        collection6 = (List) apkVar.p;
                        Map map8 = apkVar.o;
                        ewr ewrVar7 = apkVar.n;
                        f63 f63Var4 = apkVar.m;
                        hwrVar4 = apkVar.l;
                        String str21 = apkVar.j;
                        qgg.h0(obj2);
                        collection5 = collection13;
                        map3 = map8;
                        ewrVar3 = ewrVar7;
                        f63Var2 = f63Var4;
                        arrayList8 = list20;
                        xtlVar2 = xtlVar3;
                        ac0Var = ac0Var3;
                        it3 = it14;
                        map4 = map7;
                        j = obj2;
                        pt7Var3 = pt7Var4;
                        arrayList9 = collection11;
                        rrlVar = rrlVar7;
                        str9 = str21;
                        cvlVar2 = cvlVar5;
                        i3 = i9;
                        nm6Var = nm6Var3;
                        hashSet = hashSet4;
                        arrayList10 = collection12;
                        arrayList9.add(new stl(cvlVar2, ((Boolean) j).booleanValue(), rrlVar.b));
                        collection = collection5;
                        i2 = i5;
                        str5 = str9;
                        str6 = str10;
                        map = map4;
                        it2 = it3;
                        arrayList7 = arrayList10;
                        collection2 = collection6;
                        xtlVar = xtlVar2;
                        arrayList2 = arrayList8;
                        hwrVar2 = hwrVar4;
                        ewrVar = ewrVar3;
                        f63Var = f63Var2;
                        pt7Var = pt7Var3;
                        linkedHashMap = map3;
                        if (!it2.hasNext()) {
                        }
                        return nm6Var;
                    case 3:
                        collection3 = (List) apkVar.t;
                        list5 = apkVar.s;
                        Map map9 = apkVar.q;
                        collection4 = (List) apkVar.p;
                        map2 = apkVar.o;
                        ewrVar2 = apkVar.n;
                        f63 f63Var5 = apkVar.m;
                        hwrVar3 = apkVar.l;
                        String str22 = apkVar.j;
                        qgg.h0(obj2);
                        f63Var = f63Var5;
                        ac0Var = ac0Var3;
                        str8 = str22;
                        nm6Var = nm6Var3;
                        pt7Var2 = pt7Var4;
                        collection7 = collection4;
                        it4 = map2.entrySet().iterator();
                        apkVar2 = apkVar;
                        ewrVar4 = ewrVar2;
                        hwrVar5 = hwrVar3;
                        collection8 = collection3;
                        list6 = list5;
                        str11 = str8;
                        i6 = 0;
                        while (it4.hasNext()) {
                        }
                        String str202 = str11;
                        it5 = collection7.iterator();
                        str12 = str202;
                        apkVar = apkVar2;
                        list7 = list6;
                        hwrVar6 = hwrVar5;
                        i7 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                            }
                        }
                        return nm6Var;
                    case 4:
                        int i10 = apkVar.C;
                        Iterator it15 = apkVar.u;
                        Collection collection14 = (List) apkVar.t;
                        List list21 = apkVar.s;
                        Map map10 = apkVar.q;
                        Collection collection15 = (List) apkVar.p;
                        Map map11 = apkVar.o;
                        ewr ewrVar8 = apkVar.n;
                        f63 f63Var6 = apkVar.m;
                        hwr hwrVar8 = apkVar.l;
                        String str23 = apkVar.j;
                        qgg.h0(obj2);
                        i6 = i10;
                        ewrVar4 = ewrVar8;
                        ac0Var = ac0Var3;
                        list6 = list21;
                        collection7 = collection15;
                        it4 = it15;
                        nm6Var = nm6Var3;
                        str11 = str23;
                        apkVar2 = apkVar;
                        f63Var = f63Var6;
                        pt7Var2 = pt7Var4;
                        hwrVar5 = hwrVar8;
                        collection8 = collection14;
                        while (it4.hasNext()) {
                        }
                        String str2022 = str11;
                        it5 = collection7.iterator();
                        str12 = str2022;
                        apkVar = apkVar2;
                        list7 = list6;
                        hwrVar6 = hwrVar5;
                        i7 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                            }
                        }
                        return nm6Var;
                    case 5:
                        i7 = apkVar.C;
                        it5 = apkVar.u;
                        Collection collection16 = (List) apkVar.t;
                        list7 = apkVar.s;
                        Map map12 = apkVar.q;
                        List list22 = apkVar.p;
                        Map map13 = apkVar.o;
                        ewr ewrVar9 = apkVar.n;
                        f63 f63Var7 = apkVar.m;
                        hwr hwrVar9 = apkVar.l;
                        String str24 = apkVar.j;
                        qgg.h0(obj2);
                        ewrVar4 = ewrVar9;
                        f63Var = f63Var7;
                        ac0Var = ac0Var3;
                        str12 = str24;
                        collection8 = collection16;
                        nm6Var = nm6Var3;
                        hwrVar6 = hwrVar9;
                        pt7Var2 = pt7Var4;
                        while (true) {
                            if (it5.hasNext()) {
                            }
                        }
                        return nm6Var;
                    case 6:
                        List list23 = apkVar.t;
                        List list24 = apkVar.s;
                        Map map14 = apkVar.q;
                        List list25 = apkVar.p;
                        Map map15 = apkVar.o;
                        ewrVar5 = apkVar.n;
                        f63Var3 = apkVar.m;
                        hwrVar6 = apkVar.l;
                        str13 = apkVar.j;
                        qgg.h0(obj2);
                        nm6Var = nm6Var3;
                        pt7Var2 = pt7Var4;
                        ac0Var2 = ac0Var3;
                        if (hwrVar6 != null && (list8 = hwrVar6.a) != null) {
                            List list26 = list8;
                            ArrayList arrayList27 = new ArrayList(v75.o(list26, 10));
                            Iterator it16 = list26.iterator();
                            while (it16.hasNext()) {
                                arrayList27.add(((axr) it16.next()).a);
                            }
                            rtl b = ac0Var2.b();
                            arrayList11 = null;
                            apkVar.j = null;
                            apkVar.k = null;
                            apkVar.l = null;
                            apkVar.m = f63Var3;
                            apkVar.n = ewrVar5;
                            apkVar.o = null;
                            apkVar.p = null;
                            apkVar.q = null;
                            apkVar.r = null;
                            apkVar.s = null;
                            apkVar.t = null;
                            apkVar.u = null;
                            apkVar.v = null;
                            apkVar.C = 0;
                            apkVar.G = 7;
                            break;
                        }
                        arrayList11 = null;
                        if (ewrVar5 == null && (list9 = ewrVar5.a) != null) {
                            List list27 = list9;
                            arrayList12 = new ArrayList(v75.o(list27, 10));
                            Iterator it17 = list27.iterator();
                            while (it17.hasNext()) {
                                arrayList12.add(((owr) it17.next()).a);
                            }
                        } else if (f63Var3 == null) {
                            ArrayList arrayList28 = f63Var3.a;
                            arrayList12 = new ArrayList(v75.o(arrayList28, 10));
                            Iterator it18 = arrayList28.iterator();
                            while (it18.hasNext()) {
                                arrayList12.add(((z1g) it18.next()).a);
                            }
                        } else {
                            arrayList12 = arrayList11;
                        }
                        if (arrayList12 != null) {
                            pt7Var2.d(arrayList12);
                        }
                        return Unit.a;
                    case 7:
                        List list28 = apkVar.t;
                        List list29 = apkVar.s;
                        Map map16 = apkVar.q;
                        List list30 = apkVar.p;
                        Map map17 = apkVar.o;
                        ewrVar5 = apkVar.n;
                        f63Var3 = apkVar.m;
                        qgg.h0(obj2);
                        pt7Var2 = pt7Var4;
                        arrayList11 = null;
                        if (ewrVar5 == null) {
                            break;
                        }
                        if (f63Var3 == null) {
                        }
                        if (arrayList12 != null) {
                        }
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        apkVar = new apk(this, cg6Var);
        Object obj22 = apkVar.E;
        nm6 nm6Var32 = nm6.a;
        i = apkVar.G;
        String str152 = "3";
        String str162 = "PhonotekaSynchronizer";
        pt7 pt7Var42 = this.b;
        ac0 ac0Var32 = this.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, cr crVar, cg6 cg6Var) {
        bpk bpkVar;
        int i;
        Iterator it;
        int i2;
        String str2;
        Collection collection;
        String str3;
        int i3;
        Iterator it2;
        jyr jyrVar = this.a.k;
        if (cg6Var instanceof bpk) {
            bpkVar = (bpk) cg6Var;
            int i4 = bpkVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bpkVar.p = i4 - Integer.MIN_VALUE;
                Object obj = bpkVar.n;
                nm6 nm6Var = nm6.a;
                i = bpkVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    Set<Map.Entry> entrySet = ((LinkedHashMap) crVar.f).entrySet();
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        m9b m9bVar = (m9b) entry.getValue();
                        if (m9bVar instanceof i9b) {
                            arrayList.add(((i9b) m9bVar).a);
                        } else if (m9bVar instanceof k9b) {
                            linkedHashMap.put(entry.getKey(), ((k9b) m9bVar).a);
                        } else if (m9bVar instanceof j9b) {
                            arrayList2.add(entry.getKey());
                        } else {
                            if (!(m9bVar instanceof h9b)) {
                                b6e.s();
                                return null;
                            }
                            arrayList3.add(entry.getKey());
                        }
                    }
                    ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList.size(), arrayList2.size(), "updatePreSaves ", ", deletePreSaves "), null);
                    it = arrayList.iterator();
                    i2 = 0;
                    str2 = str;
                    collection = arrayList2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = bpkVar.m;
                        it2 = bpkVar.l;
                        List list = bpkVar.k;
                        str3 = bpkVar.j;
                        qgg.h0(obj);
                        i3 = i5;
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            fkm fkmVar = (fkm) jyrVar.getValue();
                            bpkVar.j = str3;
                            bpkVar.k = null;
                            bpkVar.l = it2;
                            bpkVar.m = i3;
                            bpkVar.p = 2;
                            if (fkmVar.b(str3, str4, bpkVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        return Unit.a;
                    }
                    i2 = bpkVar.m;
                    it = bpkVar.l;
                    Collection collection2 = (List) bpkVar.k;
                    String str5 = bpkVar.j;
                    qgg.h0(obj);
                    str2 = str5;
                    collection = collection2;
                }
                while (it.hasNext()) {
                    kjm kjmVar = (kjm) it.next();
                    fkm fkmVar2 = (fkm) jyrVar.getValue();
                    bpkVar.j = str2;
                    bpkVar.k = (List) collection;
                    bpkVar.l = it;
                    bpkVar.m = i2;
                    bpkVar.p = 1;
                    if (fkmVar2.e(str2, kjmVar, bpkVar) == nm6Var) {
                        break;
                    }
                }
                str3 = str2;
                i3 = 0;
                it2 = collection.iterator();
                while (it2.hasNext()) {
                }
                return Unit.a;
            }
        }
        bpkVar = new bpk(this, cg6Var);
        Object obj2 = bpkVar.n;
        nm6 nm6Var2 = nm6.a;
        i = bpkVar.p;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        str3 = str2;
        i3 = 0;
        it2 = collection.iterator();
        while (it2.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ff A[LOOP:4: B:60:0x01f9->B:62:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v11, types: [c5b] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [epk] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v8, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v22, types: [c5b] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [pt7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, a53 a53Var, cr crVar, cg6 cg6Var) {
        cpk cpkVar;
        cpk cpkVar2;
        nm6 nm6Var;
        int i;
        fwr fwrVar;
        String str2;
        g63 g63Var;
        LinkedHashMap linkedHashMap;
        ?? r2;
        List list;
        ?? r12;
        List list2;
        List list3;
        List list4;
        rus rusVar;
        int a;
        LinkedHashMap linkedHashMap2;
        Object obj;
        fwr fwrVar2;
        ?? r4;
        List list5;
        ?? r122;
        List list6;
        List list7;
        List list8;
        if (cg6Var instanceof cpk) {
            cpkVar = (cpk) cg6Var;
            int i2 = cpkVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cpkVar.p = i2 - Integer.MIN_VALUE;
                cpkVar2 = cpkVar;
                Object obj2 = cpkVar2.n;
                nm6Var = nm6.a;
                i = cpkVar2.p;
                ?? r8 = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    g63 g63Var2 = (g63) a53Var.a;
                    fwrVar = (fwr) a53Var.b;
                    if (((LinkedHashMap) crVar.b).isEmpty()) {
                        if (fwrVar != null && (list4 = fwrVar.b) != null) {
                            List list9 = list4;
                            r2 = new ArrayList(v75.o(list9, 10));
                            Iterator it = list9.iterator();
                            while (it.hasNext()) {
                                r2.add(((cyr) it.next()).a);
                            }
                        } else if (g63Var2 == null || (list = g63Var2.c.b) == null) {
                            r2 = 0;
                        } else {
                            List list10 = list;
                            r2 = new ArrayList(v75.o(list10, 10));
                            Iterator it2 = list10.iterator();
                            while (it2.hasNext()) {
                                r2.add(((unk) it2.next()).a);
                            }
                        }
                        if (fwrVar != null && (list3 = fwrVar.c) != null) {
                            List list11 = list3;
                            r12 = new ArrayList(v75.o(list11, 10));
                            Iterator it3 = list11.iterator();
                            while (it3.hasNext()) {
                                r12.add(((cyr) it3.next()).a);
                            }
                        } else if (g63Var2 == null || (list2 = g63Var2.d.b) == null) {
                            r12 = 0;
                        } else {
                            List list12 = list2;
                            r12 = new ArrayList(v75.o(list12, 10));
                            Iterator it4 = list12.iterator();
                            while (it4.hasNext()) {
                                r12.add(((unk) it4.next()).a);
                            }
                        }
                        if (r2 == 0) {
                            r2 = c5b.a;
                        }
                        if (r12 == 0) {
                            r12 = c5b.a;
                        }
                        r8.e(r2, r12);
                        return Unit.a;
                    }
                    Set<Map.Entry> entrySet = ((LinkedHashMap) crVar.b).entrySet();
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        m9b m9bVar = (m9b) entry.getValue();
                        if (m9bVar instanceof i9b) {
                            arrayList.add(((i9b) m9bVar).a);
                        } else if (m9bVar instanceof k9b) {
                            p8k p8kVar = ((k9b) m9bVar).a;
                            if (p8kVar instanceof n8k) {
                                linkedHashMap3.put(entry.getKey(), p8kVar);
                            } else {
                                dfi.r("Can not update entity data with " + p8kVar, "PhonotekaSynchronizer");
                            }
                        } else if (m9bVar instanceof j9b) {
                            arrayList2.add(entry.getKey());
                        } else {
                            if (!(m9bVar instanceof h9b)) {
                                b6e.s();
                                return null;
                            }
                            arrayList3.add(entry.getKey());
                        }
                    }
                    int size = arrayList.size();
                    int size2 = arrayList.size();
                    cpkVar2.j = str;
                    cpkVar2.k = g63Var2;
                    cpkVar2.l = fwrVar;
                    cpkVar2.m = linkedHashMap3;
                    cpkVar2.p = 1;
                    if (b(str, arrayList, size, size2, cpkVar2) != nm6Var) {
                        str2 = str;
                        g63Var = g63Var2;
                        linkedHashMap = linkedHashMap3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fwrVar2 = cpkVar2.l;
                    g63Var = cpkVar2.k;
                    qgg.h0(obj2);
                    obj = null;
                    if (fwrVar2 == null && (list8 = fwrVar2.b) != null) {
                        List list13 = list8;
                        r4 = new ArrayList(v75.o(list13, 10));
                        Iterator it5 = list13.iterator();
                        while (it5.hasNext()) {
                            r4.add(((cyr) it5.next()).a);
                        }
                    } else if (g63Var != null || (list5 = g63Var.c.b) == null) {
                        r4 = obj;
                    } else {
                        List list14 = list5;
                        r4 = new ArrayList(v75.o(list14, 10));
                        Iterator it6 = list14.iterator();
                        while (it6.hasNext()) {
                            r4.add(((unk) it6.next()).a);
                        }
                    }
                    if (fwrVar2 == null && (list7 = fwrVar2.c) != null) {
                        List list15 = list7;
                        r122 = new ArrayList(v75.o(list15, 10));
                        Iterator it7 = list15.iterator();
                        while (it7.hasNext()) {
                            r122.add(((cyr) it7.next()).a);
                        }
                    } else if (g63Var != null || (list6 = g63Var.d.b) == null) {
                        r122 = obj;
                    } else {
                        List list16 = list6;
                        r122 = new ArrayList(v75.o(list16, 10));
                        Iterator it8 = list16.iterator();
                        while (it8.hasNext()) {
                            r122.add(((unk) it8.next()).a);
                        }
                    }
                    if (r4 == 0) {
                        r4 = c5b.a;
                    }
                    if (r122 == 0) {
                        r122 = c5b.a;
                    }
                    r8.e(r4, r122);
                    return Unit.a;
                }
                linkedHashMap = cpkVar2.m;
                fwr fwrVar3 = cpkVar2.l;
                g63 g63Var3 = cpkVar2.k;
                str2 = cpkVar2.j;
                qgg.h0(obj2);
                fwrVar = fwrVar3;
                g63Var = g63Var3;
                v3w.k("updateTracksAvailability ", linkedHashMap.size(), 4, "PhonotekaSynchronizer", null);
                rusVar = (rus) this.a.e.getValue();
                Set<Map.Entry> entrySet2 = linkedHashMap.entrySet();
                a = tah.a(v75.o(entrySet2, 10));
                if (a < 16) {
                    a = 16;
                }
                linkedHashMap2 = new LinkedHashMap(a);
                for (Map.Entry entry2 : entrySet2) {
                    linkedHashMap2.put(entry2.getKey(), Boolean.valueOf(((n8k) entry2.getValue()).a));
                }
                obj = null;
                cpkVar2.j = null;
                cpkVar2.k = g63Var;
                cpkVar2.l = fwrVar;
                cpkVar2.m = null;
                cpkVar2.p = 2;
                if (rusVar.l(str2, linkedHashMap2, cpkVar2) != nm6Var) {
                    fwrVar2 = fwrVar;
                    if (fwrVar2 == null) {
                    }
                    if (g63Var != null) {
                    }
                    r4 = obj;
                    if (fwrVar2 == null) {
                    }
                    if (g63Var != null) {
                    }
                    r122 = obj;
                    if (r4 == 0) {
                    }
                    if (r122 == 0) {
                    }
                    r8.e(r4, r122);
                    return Unit.a;
                }
                return nm6Var;
            }
        }
        cpkVar = new cpk(this, cg6Var);
        cpkVar2 = cpkVar;
        Object obj22 = cpkVar2.n;
        nm6Var = nm6.a;
        i = cpkVar2.p;
        ?? r82 = this.b;
        if (i != 0) {
        }
        v3w.k("updateTracksAvailability ", linkedHashMap.size(), 4, "PhonotekaSynchronizer", null);
        rusVar = (rus) this.a.e.getValue();
        Set<Map.Entry> entrySet22 = linkedHashMap.entrySet();
        a = tah.a(v75.o(entrySet22, 10));
        if (a < 16) {
        }
        linkedHashMap2 = new LinkedHashMap(a);
        while (r1.hasNext()) {
        }
        obj = null;
        cpkVar2.j = null;
        cpkVar2.k = g63Var;
        cpkVar2.l = fwrVar;
        cpkVar2.m = null;
        cpkVar2.p = 2;
        if (rusVar.l(str2, linkedHashMap2, cpkVar2) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013b, code lost:
    
        if (r9.f(r1) == r7) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0419, code lost:
    
        if (r9.f(r11) == r7) goto L170;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032a A[LOOP:2: B:57:0x0324->B:59:0x032a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /* JADX WARN: Type inference failed for: r1v32, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, a53 a53Var, cr crVar, cg6 cg6Var) {
        dpk dpkVar;
        int i;
        h63 h63Var;
        LinkedHashMap linkedHashMap;
        Map map;
        Map map2;
        String str2;
        ArrayList arrayList;
        gwr gwrVar;
        List list;
        List list2;
        ArrayList arrayList2;
        ?? r3;
        ?? r2;
        p3u p3uVar;
        gwr gwrVar2;
        h63 h63Var2;
        String str3;
        Map map3;
        ArrayList arrayList3;
        p3u p3uVar2;
        gwr gwrVar3;
        h63 h63Var3;
        ArrayList arrayList4;
        ?? r1;
        ?? r32;
        jyr jyrVar = this.a.l;
        if (cg6Var instanceof dpk) {
            dpkVar = (dpk) cg6Var;
            int i2 = dpkVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dpkVar.q = i2 - Integer.MIN_VALUE;
                Object obj = dpkVar.o;
                nm6 nm6Var = nm6.a;
                i = dpkVar.q;
                pt7 pt7Var = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    h63Var = (h63) a53Var.a;
                    gwr gwrVar4 = (gwr) a53Var.b;
                    if (((LinkedHashMap) crVar.g).isEmpty()) {
                        if (gwrVar4 != null) {
                            if (gwrVar4.b == null || gwrVar4.c == null) {
                                gwrVar4 = null;
                            }
                            if (gwrVar4 != null) {
                                List list3 = gwrVar4.b;
                                if (list3 != null) {
                                    List<fyr> list4 = list3;
                                    r3 = new ArrayList(v75.o(list4, 10));
                                    for (fyr fyrVar : list4) {
                                        r3.add(new r4u(fyrVar.a, j1g.a, fyrVar.b));
                                    }
                                } else {
                                    r3 = c5b.a;
                                }
                                Collection collection = (Collection) r3;
                                List list5 = gwrVar4.c;
                                if (list5 != null) {
                                    List<fyr> list6 = list5;
                                    r2 = new ArrayList(v75.o(list6, 10));
                                    for (fyr fyrVar2 : list6) {
                                        r2.add(new r4u(fyrVar2.a, j1g.c, fyrVar2.b));
                                    }
                                } else {
                                    r2 = c5b.a;
                                }
                                arrayList2 = CollectionsKt.g0(collection, r2);
                                if (arrayList2 == null) {
                                    arrayList2 = h63Var != null ? CollectionsKt.g0(h63Var.c, h63Var.d) : null;
                                }
                                if (arrayList2 != null) {
                                    dpkVar.j = null;
                                    dpkVar.k = null;
                                    dpkVar.l = null;
                                    dpkVar.m = null;
                                    dpkVar.q = 1;
                                }
                                return Unit.a;
                            }
                        }
                        arrayList2 = null;
                        if (arrayList2 == null) {
                        }
                        if (arrayList2 != null) {
                        }
                        return Unit.a;
                    }
                    Set<Map.Entry> entrySet = ((LinkedHashMap) crVar.g).entrySet();
                    ArrayList arrayList5 = new ArrayList();
                    linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (Map.Entry entry : entrySet) {
                        m9b m9bVar = (m9b) entry.getValue();
                        if (m9bVar instanceof i9b) {
                            arrayList5.add(((i9b) m9bVar).a);
                        } else if (m9bVar instanceof k9b) {
                            p8k p8kVar = ((k9b) m9bVar).a;
                            if (p8kVar instanceof o8k) {
                                linkedHashMap.put(entry.getKey(), p8kVar);
                            } else {
                                dfi.r("Can not update entity data with " + p8kVar, "PhonotekaSynchronizer");
                            }
                        } else if (m9bVar instanceof j9b) {
                            arrayList6.add(entry.getKey());
                        } else {
                            if (!(m9bVar instanceof h9b)) {
                                b6e.s();
                                return null;
                            }
                            arrayList7.add(entry.getKey());
                        }
                    }
                    if (gwrVar4 == null || (list2 = gwrVar4.b) == null) {
                        map = e5b.a;
                        map.getClass();
                    } else {
                        List<fyr> list7 = list2;
                        int a = tah.a(v75.o(list7, 10));
                        if (a < 16) {
                            a = 16;
                        }
                        map = new LinkedHashMap(a);
                        for (fyr fyrVar3 : list7) {
                            String str4 = fyrVar3.a;
                            map.put(str4, new r4u(str4, j1g.a, fyrVar3.b));
                        }
                    }
                    if (gwrVar4 == null || (list = gwrVar4.c) == null) {
                        map2 = e5b.a;
                        map2.getClass();
                    } else {
                        List list8 = list;
                        int a2 = tah.a(v75.o(list8, 10));
                        if (a2 < 16) {
                            a2 = 16;
                        }
                        map2 = new LinkedHashMap(a2);
                        for (Iterator it = list8.iterator(); it.hasNext(); it = it) {
                            fyr fyrVar4 = (fyr) it.next();
                            String str5 = fyrVar4.a;
                            map2.put(str5, new r4u(str5, j1g.c, fyrVar4.b));
                        }
                    }
                    LinkedHashMap i3 = uah.i(map, map2);
                    if (!i3.isEmpty()) {
                        ArrayList arrayList8 = new ArrayList(v75.o(arrayList5, 10));
                        Iterator it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            x1u x1uVar = (x1u) it2.next();
                            r4u r4uVar = (r4u) i3.get(x1uVar.a);
                            if (r4uVar != null) {
                                x1uVar = x1u.a(x1uVar, r4uVar.b, r4uVar.c);
                            }
                            arrayList8.add(x1uVar);
                        }
                        arrayList5 = arrayList8;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        x1u x1uVar2 = (x1u) obj2;
                        if (x1uVar2.m == null || x1uVar2.l == null) {
                            arrayList10.add(obj2);
                        } else {
                            arrayList9.add(obj2);
                        }
                    }
                    ssg.a(4, "PhonotekaSynchronizer", f1d.e(arrayList9.size(), arrayList9.size(), "addOrRewriteVideoClips ", ", addOrUpdateVideoClips "), null);
                    p3u p3uVar3 = (p3u) jyrVar.getValue();
                    dpkVar.j = str;
                    dpkVar.k = h63Var;
                    dpkVar.l = gwrVar4;
                    dpkVar.m = linkedHashMap;
                    dpkVar.n = arrayList10;
                    dpkVar.q = 2;
                    if (((b4u) p3uVar3).c(str, arrayList9, dpkVar) != nm6Var) {
                        str2 = str;
                        arrayList = arrayList10;
                        gwrVar = gwrVar4;
                        p3uVar = (p3u) jyrVar.getValue();
                        dpkVar.j = str2;
                        dpkVar.k = h63Var;
                        dpkVar.l = gwrVar;
                        dpkVar.m = linkedHashMap;
                        dpkVar.n = null;
                        dpkVar.q = 3;
                        if (((b4u) p3uVar).d(str2, arrayList, dpkVar) != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i == 2) {
                    arrayList = dpkVar.n;
                    Map map4 = dpkVar.m;
                    gwrVar = dpkVar.l;
                    h63Var = dpkVar.k;
                    str2 = dpkVar.j;
                    qgg.h0(obj);
                    linkedHashMap = map4;
                    p3uVar = (p3u) jyrVar.getValue();
                    dpkVar.j = str2;
                    dpkVar.k = h63Var;
                    dpkVar.l = gwrVar;
                    dpkVar.m = linkedHashMap;
                    dpkVar.n = null;
                    dpkVar.q = 3;
                    if (((b4u) p3uVar).d(str2, arrayList, dpkVar) != nm6Var) {
                        gwrVar2 = gwrVar;
                        h63Var2 = h63Var;
                        str3 = str2;
                        map3 = linkedHashMap;
                        arrayList3 = new ArrayList(map3.size());
                        while (r4.hasNext()) {
                        }
                        v3w.k("updateVideoClipsLikeStatus ", map3.size(), 4, "PhonotekaSynchronizer", null);
                        p3uVar2 = (p3u) jyrVar.getValue();
                        dpkVar.j = null;
                        dpkVar.k = h63Var2;
                        dpkVar.l = gwrVar2;
                        dpkVar.m = null;
                        dpkVar.n = null;
                        dpkVar.q = 4;
                        if (((b4u) p3uVar2).m(str3, arrayList3, dpkVar) != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i == 3) {
                    map3 = dpkVar.m;
                    gwrVar2 = dpkVar.l;
                    h63Var2 = dpkVar.k;
                    str3 = dpkVar.j;
                    qgg.h0(obj);
                    arrayList3 = new ArrayList(map3.size());
                    for (Map.Entry entry2 : map3.entrySet()) {
                        arrayList3.add(new r4u((String) entry2.getKey(), ((o8k) entry2.getValue()).a, ((o8k) entry2.getValue()).b));
                    }
                    v3w.k("updateVideoClipsLikeStatus ", map3.size(), 4, "PhonotekaSynchronizer", null);
                    p3uVar2 = (p3u) jyrVar.getValue();
                    dpkVar.j = null;
                    dpkVar.k = h63Var2;
                    dpkVar.l = gwrVar2;
                    dpkVar.m = null;
                    dpkVar.n = null;
                    dpkVar.q = 4;
                    if (((b4u) p3uVar2).m(str3, arrayList3, dpkVar) != nm6Var) {
                        gwrVar3 = gwrVar2;
                        h63Var3 = h63Var2;
                        if (gwrVar3 != null) {
                        }
                        arrayList4 = null;
                        if (arrayList4 == null) {
                        }
                        if (arrayList4 != null) {
                        }
                    }
                    return nm6Var;
                }
                if (i == 4) {
                    Map map5 = dpkVar.m;
                    gwrVar3 = dpkVar.l;
                    h63Var3 = dpkVar.k;
                    qgg.h0(obj);
                    if (gwrVar3 != null) {
                        gwr gwrVar5 = (gwrVar3.b == null || gwrVar3.c == null) ? null : gwrVar3;
                        if (gwrVar5 != null) {
                            List list9 = gwrVar5.b;
                            if (list9 != null) {
                                List<fyr> list10 = list9;
                                r1 = new ArrayList(v75.o(list10, 10));
                                for (fyr fyrVar5 : list10) {
                                    r1.add(new r4u(fyrVar5.a, j1g.a, fyrVar5.b));
                                }
                            } else {
                                r1 = c5b.a;
                            }
                            Collection collection2 = (Collection) r1;
                            List list11 = gwrVar5.c;
                            if (list11 != null) {
                                List<fyr> list12 = list11;
                                r32 = new ArrayList(v75.o(list12, 10));
                                for (fyr fyrVar6 : list12) {
                                    r32.add(new r4u(fyrVar6.a, j1g.c, fyrVar6.b));
                                }
                            } else {
                                r32 = c5b.a;
                            }
                            arrayList4 = CollectionsKt.g0(collection2, r32);
                            if (arrayList4 == null) {
                                arrayList4 = h63Var3 != null ? CollectionsKt.g0(h63Var3.c, h63Var3.d) : null;
                            }
                            if (arrayList4 != null) {
                                dpkVar.j = null;
                                dpkVar.k = null;
                                dpkVar.l = null;
                                dpkVar.m = null;
                                dpkVar.n = null;
                                dpkVar.q = 5;
                            }
                        }
                    }
                    arrayList4 = null;
                    if (arrayList4 == null) {
                    }
                    if (arrayList4 != null) {
                    }
                } else {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map6 = dpkVar.m;
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        dpkVar = new dpk(this, cg6Var);
        Object obj3 = dpkVar.o;
        nm6 nm6Var2 = nm6.a;
        i = dpkVar.q;
        pt7 pt7Var2 = this.b;
        if (i != 0) {
        }
        return Unit.a;
    }
}
