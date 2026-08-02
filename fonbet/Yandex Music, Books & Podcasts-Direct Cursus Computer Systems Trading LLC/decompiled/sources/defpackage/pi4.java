package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class pi4 {
    public final raa a;
    public final yx4 b;
    public final wca c;
    public final sga d;
    public final jur e;

    public pi4(raa raaVar, yx4 yx4Var, wca wcaVar, sga sgaVar, jur jurVar) {
        raaVar.getClass();
        yx4Var.getClass();
        wcaVar.getClass();
        sgaVar.getClass();
        this.a = raaVar;
        this.b = yx4Var;
        this.c = wcaVar;
        this.d = sgaVar;
        this.e = jurVar;
    }

    public static uga g(cvl cvlVar) {
        drt drtVar = cvlVar.c;
        return new uga(drtVar.a, drtVar.b, drtVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        if (r5.a(r10, r4, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
    
        if (r5.d(r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        if (r11 == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cvl cvlVar, boolean z, cg6 cg6Var) {
        ii4 ii4Var;
        int i;
        cvl cvlVar2;
        boolean z2;
        Map map;
        Object t;
        cvl cvlVar3;
        Set set;
        boolean isEmpty;
        if (cg6Var instanceof ii4) {
            ii4Var = (ii4) cg6Var;
            int i2 = ii4Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ii4Var.p = i2 - Integer.MIN_VALUE;
                Object obj = ii4Var.n;
                Object obj2 = nm6.a;
                i = ii4Var.p;
                yx4 yx4Var = this.b;
                switch (i) {
                    case 0:
                        qgg.h0(obj);
                        ii4Var.j = cvlVar;
                        ii4Var.m = z;
                        ii4Var.p = 1;
                        obj = e(ii4Var);
                        break;
                    case 1:
                        z = ii4Var.m;
                        cvlVar = ii4Var.j;
                        qgg.h0(obj);
                        Map map2 = (Map) obj;
                        long j = cvlVar.k;
                        ii4Var.j = cvlVar;
                        ii4Var.k = map2;
                        ii4Var.m = z;
                        ii4Var.p = 2;
                        Object t2 = yx4Var.t(j, true, ii4Var);
                        if (t2 != obj2) {
                            boolean z3 = z;
                            cvlVar2 = cvlVar;
                            z2 = z3;
                            map = map2;
                            obj = t2;
                            Set set2 = (Set) obj;
                            long j2 = cvlVar2.k;
                            ii4Var.j = cvlVar2;
                            ii4Var.k = map;
                            ii4Var.l = set2;
                            ii4Var.m = z2;
                            ii4Var.p = 3;
                            t = yx4Var.t(j2, false, ii4Var);
                            if (t != obj2) {
                                cvlVar3 = cvlVar2;
                                set = set2;
                                obj = t;
                                Set set3 = (Set) obj;
                                isEmpty = set.isEmpty();
                                sga sgaVar = this.d;
                                if (!isEmpty) {
                                    uga g = g(cvlVar3);
                                    String str = cvlVar3.a;
                                    if (map.get(new ega(g, str)) != null) {
                                        uga g2 = g(cvlVar3);
                                        ii4Var.j = null;
                                        ii4Var.k = null;
                                        ii4Var.l = null;
                                        ii4Var.m = z2;
                                        ii4Var.p = 4;
                                        break;
                                    }
                                    return Unit.a;
                                }
                                if (!wop.h(set3, set).isEmpty()) {
                                    return Unit.a;
                                }
                                if (z2) {
                                    uga g3 = g(cvlVar3);
                                    String str2 = cvlVar3.a;
                                    if (map.get(new ega(g3, str2)) == null) {
                                        fga fgaVar = new fga(g(cvlVar3), str2, System.currentTimeMillis());
                                        ii4Var.j = null;
                                        ii4Var.k = null;
                                        ii4Var.l = null;
                                        ii4Var.m = z2;
                                        ii4Var.p = 5;
                                        break;
                                    }
                                }
                                return Unit.a;
                            }
                        }
                        return obj2;
                    case 2:
                        z2 = ii4Var.m;
                        Map map3 = ii4Var.k;
                        cvl cvlVar4 = ii4Var.j;
                        qgg.h0(obj);
                        map = map3;
                        cvlVar2 = cvlVar4;
                        Set set22 = (Set) obj;
                        long j22 = cvlVar2.k;
                        ii4Var.j = cvlVar2;
                        ii4Var.k = map;
                        ii4Var.l = set22;
                        ii4Var.m = z2;
                        ii4Var.p = 3;
                        t = yx4Var.t(j22, false, ii4Var);
                        if (t != obj2) {
                        }
                        return obj2;
                    case 3:
                        z2 = ii4Var.m;
                        set = ii4Var.l;
                        map = ii4Var.k;
                        cvlVar3 = ii4Var.j;
                        qgg.h0(obj);
                        Set set32 = (Set) obj;
                        isEmpty = set.isEmpty();
                        sga sgaVar2 = this.d;
                        if (!isEmpty) {
                        }
                        return obj2;
                    case 4:
                        Set set4 = ii4Var.l;
                        Map map4 = ii4Var.k;
                        qgg.h0(obj);
                        return Unit.a;
                    case 5:
                        Set set5 = ii4Var.l;
                        Map map5 = ii4Var.k;
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        Set set6 = ii4Var.l;
                        Map map6 = ii4Var.k;
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ii4Var = new ii4(this, cg6Var);
        Object obj3 = ii4Var.n;
        Object obj22 = nm6.a;
        i = ii4Var.p;
        yx4 yx4Var2 = this.b;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0214 A[LOOP:1: B:45:0x020e->B:47:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x034f -> B:12:0x0352). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x02c6 -> B:13:0x02d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Collection collection, nvl nvlVar, cg6 cg6Var) {
        ji4 ji4Var;
        int i;
        nvl nvlVar2;
        Object f;
        Collection collection2;
        Map map;
        Serializable e;
        nvl nvlVar3;
        Collection collection3;
        Map map2;
        List list;
        Iterator it;
        String str;
        Iterator it2;
        Set set;
        Map map3;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        List list2;
        List list3;
        Set set2;
        Iterator it3;
        int i5;
        Iterator it4;
        int i6;
        int i7;
        Set set3;
        List list4;
        Map map4;
        int i8;
        int i9;
        yx4 yx4Var;
        HashSet hashSet;
        Iterator it5;
        int i10;
        yx4 yx4Var2;
        if (cg6Var instanceof ji4) {
            ji4Var = (ji4) cg6Var;
            int i11 = ji4Var.A;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                ji4Var.A = i11 - Integer.MIN_VALUE;
                Object obj = ji4Var.y;
                Serializable serializable = nm6.a;
                i = ji4Var.A;
                yx4 yx4Var3 = this.b;
                switch (i) {
                    case 0:
                        qgg.h0(obj);
                        if (collection.isEmpty()) {
                            return Unit.a;
                        }
                        ji4Var.j = collection;
                        nvlVar2 = nvlVar;
                        ji4Var.k = nvlVar2;
                        ji4Var.A = 1;
                        f = f(ji4Var);
                        if (f != serializable) {
                            collection2 = collection;
                            map = (Map) f;
                            ji4Var.j = collection2;
                            ji4Var.k = nvlVar2;
                            ji4Var.l = map;
                            ji4Var.A = 2;
                            e = e(ji4Var);
                            if (e != serializable) {
                                Collection collection4 = collection2;
                                nvlVar3 = nvlVar2;
                                obj = e;
                                collection3 = collection4;
                                Set keySet = ((Map) obj).keySet();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : keySet) {
                                    ega egaVar = (ega) obj2;
                                    if (!Intrinsics.d(egaVar.a.a, nvlVar3.a) || !Intrinsics.d(egaVar.b, nvlVar3.b)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                ji4Var.j = collection3;
                                ji4Var.k = null;
                                ji4Var.l = map;
                                ji4Var.m = arrayList2;
                                ji4Var.A = 3;
                                obj = d(ji4Var);
                                if (obj != serializable) {
                                    map2 = map;
                                    list = arrayList2;
                                    Set keySet2 = ((Map) obj).keySet();
                                    it = collection3.iterator();
                                    int i12 = 0;
                                    if (!it.hasNext()) {
                                        String str2 = (String) it.next();
                                        List list5 = (List) map2.get(str2);
                                        if (list5 != null) {
                                            arrayList = new ArrayList();
                                            for (Object obj3 : list5) {
                                                if (!((nq3) obj3).c.a()) {
                                                    arrayList.add(obj3);
                                                }
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        if (arrayList == null || arrayList.isEmpty()) {
                                            yx4Var = yx4Var3;
                                            yx4Var3 = yx4Var;
                                            if (!it.hasNext()) {
                                                return Unit.a;
                                            }
                                        } else {
                                            Set b = uop.b(str2);
                                            ji4Var.j = null;
                                            ji4Var.k = null;
                                            ji4Var.l = map2;
                                            ji4Var.m = list;
                                            ji4Var.n = keySet2;
                                            ji4Var.o = it;
                                            ji4Var.p = str2;
                                            ji4Var.q = arrayList;
                                            ji4Var.r = null;
                                            ji4Var.s = null;
                                            ji4Var.t = i12;
                                            ji4Var.u = 0;
                                            ji4Var.A = 4;
                                            Serializable u = yx4Var3.u(b, true, ji4Var);
                                            if (u != serializable) {
                                                set = keySet2;
                                                obj = u;
                                                it2 = it;
                                                i3 = i12;
                                                str = str2;
                                                map3 = map2;
                                                i2 = 0;
                                                hashSet = new HashSet();
                                                for (it5 = ((Iterable) obj).iterator(); it5.hasNext(); it5 = it5) {
                                                    rw4 rw4Var = (rw4) it5.next();
                                                    hashSet.add(new ega(rw4Var.a, rw4Var.b));
                                                }
                                                if (!hashSet.isEmpty()) {
                                                    Iterator it6 = hashSet.iterator();
                                                    while (it6.hasNext()) {
                                                        if (list.contains((ega) it6.next())) {
                                                            i10 = 1;
                                                            if (i10 != 0) {
                                                                yx4Var = yx4Var3;
                                                                i12 = i3;
                                                                it = it2;
                                                                keySet2 = set;
                                                                map2 = map3;
                                                                yx4Var3 = yx4Var;
                                                                if (!it.hasNext()) {
                                                                }
                                                            } else {
                                                                Set b2 = uop.b(str);
                                                                ji4Var.j = null;
                                                                ji4Var.k = null;
                                                                ji4Var.l = map3;
                                                                ji4Var.m = list;
                                                                ji4Var.n = set;
                                                                ji4Var.o = it2;
                                                                ji4Var.p = null;
                                                                ji4Var.q = null;
                                                                ji4Var.r = arrayList;
                                                                ji4Var.t = i3;
                                                                ji4Var.u = i2;
                                                                ji4Var.v = i10;
                                                                ji4Var.A = 5;
                                                                Object s = yx4Var3.s(b2, ji4Var);
                                                                if (s != serializable) {
                                                                    List list6 = list;
                                                                    i4 = i10;
                                                                    obj = s;
                                                                    list2 = arrayList;
                                                                    list3 = list6;
                                                                    set2 = (Set) obj;
                                                                    if ((set2 instanceof Collection) || !set2.isEmpty()) {
                                                                        it3 = set2.iterator();
                                                                        while (it3.hasNext()) {
                                                                            if (set.contains(((qw4) it3.next()).a)) {
                                                                                i5 = 1;
                                                                                if (i5 != 0) {
                                                                                    yx4Var = yx4Var3;
                                                                                    i12 = i3;
                                                                                    it = it2;
                                                                                    keySet2 = set;
                                                                                    list = list3;
                                                                                    map2 = map3;
                                                                                    yx4Var3 = yx4Var;
                                                                                    if (!it.hasNext()) {
                                                                                    }
                                                                                } else {
                                                                                    it4 = list2.iterator();
                                                                                    i6 = i2;
                                                                                    i7 = i3;
                                                                                    set3 = set;
                                                                                    list4 = list3;
                                                                                    map4 = map3;
                                                                                    i8 = i4;
                                                                                    i9 = 0;
                                                                                    if (it4.hasNext()) {
                                                                                        nq3 nq3Var = (nq3) it4.next();
                                                                                        yx4Var2 = yx4Var3;
                                                                                        ji4Var.j = null;
                                                                                        ji4Var.k = null;
                                                                                        ji4Var.l = map4;
                                                                                        ji4Var.m = list4;
                                                                                        ji4Var.n = set3;
                                                                                        ji4Var.o = it2;
                                                                                        ji4Var.p = null;
                                                                                        ji4Var.q = null;
                                                                                        ji4Var.r = null;
                                                                                        ji4Var.s = it4;
                                                                                        ji4Var.t = i7;
                                                                                        ji4Var.u = i6;
                                                                                        ji4Var.v = i8;
                                                                                        ji4Var.w = i5;
                                                                                        ji4Var.x = i9;
                                                                                        ji4Var.A = 6;
                                                                                        taa taaVar = (taa) this.a;
                                                                                        taaVar.getClass();
                                                                                        Iterator it7 = it4;
                                                                                        Iterator it8 = it2;
                                                                                        Object V = x97.V(dm6.b, new j57(new ess(nq3Var.a, nq3Var.d, nq3Var.e), new qjs(new Long(nq3Var.b)), taaVar, (Continuation) null, 17), ji4Var);
                                                                                        if (V != nm6.a) {
                                                                                            V = Unit.a;
                                                                                        }
                                                                                        if (V != serializable) {
                                                                                            it2 = it8;
                                                                                            it4 = it7;
                                                                                            yx4Var3 = yx4Var2;
                                                                                            if (it4.hasNext()) {
                                                                                                yx4Var = yx4Var3;
                                                                                                list = list4;
                                                                                                i12 = i7;
                                                                                                map2 = map4;
                                                                                                keySet2 = set3;
                                                                                                it = it2;
                                                                                                yx4Var3 = yx4Var;
                                                                                                if (!it.hasNext()) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i5 = 0;
                                                                    if (i5 != 0) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i10 = 0;
                                                if (i10 != 0) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return serializable;
                    case 1:
                        nvl nvlVar4 = ji4Var.k;
                        collection2 = ji4Var.j;
                        qgg.h0(obj);
                        f = obj;
                        nvlVar2 = nvlVar4;
                        map = (Map) f;
                        ji4Var.j = collection2;
                        ji4Var.k = nvlVar2;
                        ji4Var.l = map;
                        ji4Var.A = 2;
                        e = e(ji4Var);
                        if (e != serializable) {
                        }
                        return serializable;
                    case 2:
                        map = ji4Var.l;
                        nvlVar3 = ji4Var.k;
                        collection3 = ji4Var.j;
                        qgg.h0(obj);
                        Set keySet3 = ((Map) obj).keySet();
                        ArrayList arrayList22 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        ji4Var.j = collection3;
                        ji4Var.k = null;
                        ji4Var.l = map;
                        ji4Var.m = arrayList22;
                        ji4Var.A = 3;
                        obj = d(ji4Var);
                        if (obj != serializable) {
                        }
                        return serializable;
                    case 3:
                        list = ji4Var.m;
                        map2 = ji4Var.l;
                        collection3 = ji4Var.j;
                        qgg.h0(obj);
                        Set keySet22 = ((Map) obj).keySet();
                        it = collection3.iterator();
                        int i122 = 0;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 4:
                        int i13 = ji4Var.u;
                        int i14 = ji4Var.t;
                        ArrayList arrayList3 = ji4Var.q;
                        str = ji4Var.p;
                        it2 = ji4Var.o;
                        set = ji4Var.n;
                        List list7 = ji4Var.m;
                        map3 = ji4Var.l;
                        Collection collection5 = ji4Var.j;
                        qgg.h0(obj);
                        i2 = i13;
                        list = list7;
                        arrayList = arrayList3;
                        i3 = i14;
                        hashSet = new HashSet();
                        while (it5.hasNext()) {
                        }
                        if (!hashSet.isEmpty()) {
                        }
                        i10 = 0;
                        if (i10 != 0) {
                        }
                        break;
                    case 5:
                        i4 = ji4Var.v;
                        i2 = ji4Var.u;
                        i3 = ji4Var.t;
                        list2 = ji4Var.r;
                        it2 = ji4Var.o;
                        set = ji4Var.n;
                        list3 = ji4Var.m;
                        map3 = ji4Var.l;
                        Collection collection6 = ji4Var.j;
                        qgg.h0(obj);
                        set2 = (Set) obj;
                        if (set2 instanceof Collection) {
                            break;
                        }
                        it3 = set2.iterator();
                        while (it3.hasNext()) {
                        }
                        i5 = 0;
                        if (i5 != 0) {
                        }
                        break;
                    case 6:
                        i9 = ji4Var.x;
                        int i15 = ji4Var.w;
                        int i16 = ji4Var.v;
                        int i17 = ji4Var.u;
                        int i18 = ji4Var.t;
                        Iterator it9 = ji4Var.s;
                        Iterator it10 = ji4Var.o;
                        Set set4 = ji4Var.n;
                        list4 = ji4Var.m;
                        Map map5 = ji4Var.l;
                        Collection collection7 = ji4Var.j;
                        qgg.h0(obj);
                        yx4Var2 = yx4Var3;
                        i5 = i15;
                        i8 = i16;
                        map4 = map5;
                        it4 = it9;
                        it2 = it10;
                        set3 = set4;
                        i6 = i17;
                        i7 = i18;
                        yx4Var3 = yx4Var2;
                        if (it4.hasNext()) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ji4Var = new ji4(this, cg6Var);
        Object obj4 = ji4Var.y;
        Serializable serializable2 = nm6.a;
        i = ji4Var.A;
        yx4 yx4Var32 = this.b;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (b((java.util.Set) r10, r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r8.d.a(r10, r2, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cvl cvlVar, cg6 cg6Var) {
        ki4 ki4Var;
        int i;
        if (cg6Var instanceof ki4) {
            ki4Var = (ki4) cg6Var;
            int i2 = ki4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ki4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ki4Var.k;
                Object obj2 = nm6.a;
                i = ki4Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    uga g = g(cvlVar);
                    String str = cvlVar.a;
                    ki4Var.j = cvlVar;
                    ki4Var.m = 1;
                } else if (i == 1) {
                    cvlVar = ki4Var.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvlVar = ki4Var.j;
                    qgg.h0(obj);
                    nvl g2 = cvlVar.g();
                    ki4Var.j = null;
                    ki4Var.m = 3;
                }
                long j = cvlVar.k;
                ki4Var.j = cvlVar;
                ki4Var.m = 2;
                obj = this.b.t(j, true, ki4Var);
            }
        }
        ki4Var = new ki4(this, cg6Var);
        Object obj3 = ki4Var.k;
        Object obj22 = nm6.a;
        i = ki4Var.m;
        if (i != 0) {
        }
        long j2 = cvlVar.k;
        ki4Var.j = cvlVar;
        ki4Var.m = 2;
        obj3 = this.b.t(j2, true, ki4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[LOOP:0: B:14:0x0056->B:16:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(cg6 cg6Var) {
        li4 li4Var;
        int i;
        int a;
        if (cg6Var instanceof li4) {
            li4Var = (li4) cg6Var;
            int i2 = li4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                li4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = li4Var.j;
                nm6 nm6Var = nm6.a;
                i = li4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    li4Var.l = 1;
                    obj = this.c.c(li4Var);
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
                Iterable<jca> iterable = (Iterable) obj;
                a = tah.a(v75.o(iterable, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (jca jcaVar : iterable) {
                    linkedHashMap.put(jcaVar.a, new Long(jcaVar.b));
                }
                return new LinkedHashMap(linkedHashMap);
            }
        }
        li4Var = new li4(this, cg6Var);
        Object obj2 = li4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = li4Var.l;
        if (i != 0) {
        }
        Iterable<jca> iterable2 = (Iterable) obj2;
        a = tah.a(v75.o(iterable2, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
        while (r6.hasNext()) {
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[LOOP:0: B:14:0x0056->B:16:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(cg6 cg6Var) {
        mi4 mi4Var;
        int i;
        int a;
        if (cg6Var instanceof mi4) {
            mi4Var = (mi4) cg6Var;
            int i2 = mi4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = mi4Var.j;
                nm6 nm6Var = nm6.a;
                i = mi4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mi4Var.l = 1;
                    obj = this.d.c(mi4Var);
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
                Iterable<fga> iterable = (Iterable) obj;
                a = tah.a(v75.o(iterable, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (fga fgaVar : iterable) {
                    linkedHashMap.put(new ega(fgaVar.a, fgaVar.b), new Long(fgaVar.c));
                }
                return new LinkedHashMap(linkedHashMap);
            }
        }
        mi4Var = new mi4(this, cg6Var);
        Object obj2 = mi4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = mi4Var.l;
        if (i != 0) {
        }
        Iterable<fga> iterable2 = (Iterable) obj2;
        a = tah.a(v75.o(iterable2, 10));
        if (a < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
        while (r6.hasNext()) {
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable f(cg6 cg6Var) {
        ni4 ni4Var;
        int i;
        if (cg6Var instanceof ni4) {
            ni4Var = (ni4) cg6Var;
            int i2 = ni4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ni4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ni4Var.j;
                nm6 nm6Var = nm6.a;
                i = ni4Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ni4Var.l = 1;
                    obj = x97.V(dm6.b, new d7i(this.e, null, 23), ni4Var);
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
                ArrayList arrayList = ((r3t) obj).b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    String str = ((nq3) obj2).a.a;
                    Object obj3 = linkedHashMap.get(str);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(str, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                return new LinkedHashMap(linkedHashMap);
            }
        }
        ni4Var = new ni4(this, cg6Var);
        Object obj4 = ni4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ni4Var.l;
        if (i != 0) {
        }
        ArrayList arrayList2 = ((r3t) obj4).b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r6.hasNext()) {
        }
        return new LinkedHashMap(linkedHashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r3.d(r12, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(cvl cvlVar, cvl cvlVar2, cg6 cg6Var) {
        oi4 oi4Var;
        int i;
        Map map;
        ega egaVar;
        ega egaVar2;
        cvl cvlVar3;
        Map map2;
        if (cg6Var instanceof oi4) {
            oi4Var = (oi4) cg6Var;
            int i2 = oi4Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oi4Var.p = i2 - Integer.MIN_VALUE;
                Object obj = oi4Var.n;
                Object obj2 = nm6.a;
                i = oi4Var.p;
                sga sgaVar = this.d;
                if (i != 0) {
                    qgg.h0(obj);
                    oi4Var.j = cvlVar;
                    oi4Var.k = cvlVar2;
                    oi4Var.p = 1;
                    obj = e(oi4Var);
                } else if (i == 1) {
                    cvlVar2 = oi4Var.k;
                    cvlVar = oi4Var.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map3 = oi4Var.l;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    egaVar2 = oi4Var.m;
                    map2 = oi4Var.l;
                    cvlVar3 = oi4Var.k;
                    qgg.h0(obj);
                    Long l = (Long) map2.get(egaVar2);
                    fga fgaVar = new fga(g(cvlVar3), cvlVar3.a, l == null ? l.longValue() : System.currentTimeMillis());
                    oi4Var.j = null;
                    oi4Var.k = null;
                    oi4Var.l = null;
                    oi4Var.m = null;
                    oi4Var.p = 3;
                }
                map = (Map) obj;
                uga g = g(cvlVar);
                String str = cvlVar.a;
                egaVar = new ega(g, str);
                if (map.containsKey(egaVar)) {
                    return Unit.a;
                }
                uga g2 = g(cvlVar);
                oi4Var.j = null;
                oi4Var.k = cvlVar2;
                oi4Var.l = map;
                oi4Var.m = egaVar;
                oi4Var.p = 2;
                if (sgaVar.a(g2, str, oi4Var) != obj2) {
                    egaVar2 = egaVar;
                    cvlVar3 = cvlVar2;
                    map2 = map;
                    Long l2 = (Long) map2.get(egaVar2);
                    fga fgaVar2 = new fga(g(cvlVar3), cvlVar3.a, l2 == null ? l2.longValue() : System.currentTimeMillis());
                    oi4Var.j = null;
                    oi4Var.k = null;
                    oi4Var.l = null;
                    oi4Var.m = null;
                    oi4Var.p = 3;
                }
                return obj2;
            }
        }
        oi4Var = new oi4(this, cg6Var);
        Object obj3 = oi4Var.n;
        Object obj22 = nm6.a;
        i = oi4Var.p;
        sga sgaVar2 = this.d;
        if (i != 0) {
        }
        map = (Map) obj3;
        uga g3 = g(cvlVar);
        String str2 = cvlVar.a;
        egaVar = new ega(g3, str2);
        if (map.containsKey(egaVar)) {
        }
    }
}
