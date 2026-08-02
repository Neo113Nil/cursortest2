package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* loaded from: classes4.dex */
public final class xtl {
    public final b4m a;
    public final rtl b;
    public final i2m c;
    public final oga d;
    public final m88 e;

    public xtl(b4m b4mVar, rtl rtlVar, i2m i2mVar, oga ogaVar, m88 m88Var) {
        this.a = b4mVar;
        this.b = rtlVar;
        this.c = i2mVar;
        this.d = ogaVar;
        this.e = m88Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        if (r9.e.a(r10, r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r9.d.b(r2, r12, r5, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[LOOP:0: B:27:0x007f->B:29:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, nvl nvlVar, cg6 cg6Var) {
        ttl ttlVar;
        nm6 nm6Var;
        int i;
        Iterator it;
        String str2;
        List list;
        if (cg6Var instanceof ttl) {
            ttlVar = (ttl) cg6Var;
            int i2 = ttlVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ttlVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ttlVar.m;
                nm6Var = nm6.a;
                i = ttlVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    ttlVar.j = str;
                    ttlVar.k = nvlVar;
                    ttlVar.o = 1;
                    obj = this.c.f(str, nvlVar, ttlVar);
                } else if (i == 1) {
                    nvlVar = ttlVar.k;
                    str = ttlVar.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    list = ttlVar.l;
                    nvlVar = ttlVar.k;
                    str2 = ttlVar.j;
                    qgg.h0(obj);
                    String str3 = nvlVar.a;
                    String str4 = nvlVar.b;
                    ttlVar.j = null;
                    ttlVar.k = nvlVar;
                    ttlVar.l = list;
                    ttlVar.o = 3;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = ttlVar.l;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    list = ttlVar.l;
                    nvlVar = ttlVar.k;
                    qgg.h0(obj);
                    ttlVar.j = null;
                    ttlVar.k = null;
                    ttlVar.l = null;
                    ttlVar.o = 4;
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i1m) it.next()).c);
                }
                ttlVar.j = str;
                ttlVar.k = nvlVar;
                ttlVar.l = arrayList;
                ttlVar.o = 2;
                if (this.a.c(str, nvlVar, ttlVar) != nm6Var) {
                    str2 = str;
                    list = arrayList;
                    String str32 = nvlVar.a;
                    String str42 = nvlVar.b;
                    ttlVar.j = null;
                    ttlVar.k = nvlVar;
                    ttlVar.l = list;
                    ttlVar.o = 3;
                }
                return nm6Var;
            }
        }
        ttlVar = new ttl(this, cg6Var);
        Object obj2 = ttlVar.m;
        nm6Var = nm6.a;
        i = ttlVar.o;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        ttlVar.j = str;
        ttlVar.k = nvlVar;
        ttlVar.l = arrayList2;
        ttlVar.o = 2;
        if (this.a.c(str, nvlVar, ttlVar) != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[LOOP:2: B:50:0x0132->B:52:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.String, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0262 -> B:13:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011f -> B:45:0x0123). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, String str, List list) {
        utl utlVar;
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        String str2;
        utl utlVar2;
        List list2;
        List list3;
        List list4;
        List list5;
        Iterator it2;
        int i4;
        cvl cvlVar;
        List list6;
        List list7;
        List list8;
        int i5;
        HashSet hashSet;
        List list9;
        Iterator it3;
        int i6;
        int i7;
        ArrayList arrayList2;
        nvl g;
        Object obj;
        if (cg6Var instanceof utl) {
            utlVar = (utl) cg6Var;
            int i8 = utlVar.x;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                utlVar.x = i8 - Integer.MIN_VALUE;
                Object obj2 = utlVar.v;
                nm6 nm6Var = nm6.a;
                i = utlVar.x;
                m88 m88Var = this.e;
                int i9 = 1;
                ?? r12 = 0;
                if (i != 0) {
                    qgg.h0(obj2);
                    List list10 = list;
                    ArrayList arrayList3 = new ArrayList(v75.o(list10, 10));
                    it = list10.iterator();
                    arrayList = arrayList3;
                    i2 = 0;
                    i3 = 0;
                    str2 = str;
                    utlVar2 = utlVar;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    int i10 = utlVar.t;
                    int i11 = utlVar.s;
                    Collection collection = utlVar.q;
                    Iterator it4 = utlVar.o;
                    Collection collection2 = utlVar.n;
                    List list11 = utlVar.m;
                    List list12 = utlVar.l;
                    List list13 = utlVar.k;
                    String str3 = utlVar.j;
                    qgg.h0(obj2);
                    utlVar2 = utlVar;
                    list2 = list13;
                    Iterator it5 = it4;
                    arrayList = collection;
                    i3 = i11;
                    i2 = i10;
                    ArrayList arrayList4 = collection2;
                    Iterable iterable = (Iterable) obj2;
                    ArrayList arrayList5 = new ArrayList(v75.o(iterable, 10));
                    Iterator it6 = iterable.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(((i1m) it6.next()).c);
                    }
                    arrayList.add(arrayList5);
                    arrayList = arrayList4;
                    it = it5;
                    str2 = str3;
                    i9 = 1;
                    if (it.hasNext()) {
                        nvl g2 = ((stl) it.next()).a.g();
                        utlVar2.j = str2;
                        utlVar2.k = list2;
                        utlVar2.l = null;
                        utlVar2.m = null;
                        ArrayList arrayList6 = arrayList;
                        utlVar2.n = arrayList6;
                        utlVar2.o = it;
                        utlVar2.p = null;
                        utlVar2.q = arrayList6;
                        utlVar2.s = i3;
                        utlVar2.t = i2;
                        utlVar2.u = 0;
                        utlVar2.x = i9;
                        Object f = this.c.f(str2, g2, utlVar2);
                        if (f != nm6Var) {
                            str3 = str2;
                            obj2 = f;
                            it5 = it;
                            arrayList4 = arrayList;
                            Iterable iterable2 = (Iterable) obj2;
                            ArrayList arrayList52 = new ArrayList(v75.o(iterable2, 10));
                            Iterator it62 = iterable2.iterator();
                            while (it62.hasNext()) {
                            }
                            arrayList.add(arrayList52);
                            arrayList = arrayList4;
                            it = it5;
                            str2 = str3;
                            i9 = 1;
                            if (it.hasNext()) {
                                ArrayList arrayList7 = arrayList;
                                utlVar2.j = null;
                                utlVar2.k = list2;
                                utlVar2.l = arrayList7;
                                utlVar2.m = null;
                                utlVar2.n = null;
                                utlVar2.o = null;
                                utlVar2.p = null;
                                utlVar2.q = null;
                                utlVar2.x = 2;
                                obj2 = this.a.f(utlVar2, str2, list2);
                                if (obj2 != nm6Var) {
                                    list3 = list2;
                                    utlVar = utlVar2;
                                    list4 = arrayList7;
                                    list5 = (List) obj2;
                                    it2 = CollectionsKt.B0(list5).iterator();
                                    i4 = 0;
                                    if (!it2.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
                    return nm6Var;
                }
                if (i == 2) {
                    list4 = utlVar.l;
                    list3 = utlVar.k;
                    qgg.h0(obj2);
                    list5 = (List) obj2;
                    it2 = CollectionsKt.B0(list5).iterator();
                    i4 = 0;
                    if (!it2.hasNext()) {
                    }
                } else {
                    if (i == 3) {
                        int i12 = utlVar.u;
                        int i13 = utlVar.t;
                        int i14 = utlVar.s;
                        HashSet hashSet2 = utlVar.r;
                        list6 = (List) utlVar.q;
                        cvlVar = utlVar.p;
                        Iterator it7 = utlVar.o;
                        Collection collection3 = utlVar.n;
                        list9 = utlVar.m;
                        List list14 = utlVar.l;
                        list7 = utlVar.k;
                        qgg.h0(obj2);
                        i5 = i12;
                        i6 = i14;
                        list8 = list14;
                        hashSet = hashSet2;
                        i7 = i13;
                        it3 = it7;
                        arrayList2 = new ArrayList();
                        while (r13.hasNext()) {
                        }
                        g = cvlVar.g();
                        obj = null;
                        utlVar.j = null;
                        utlVar.k = list7;
                        utlVar.l = list8;
                        utlVar.m = list9;
                        utlVar.n = null;
                        utlVar.o = it3;
                        utlVar.p = null;
                        utlVar.q = null;
                        utlVar.r = null;
                        utlVar.s = i6;
                        utlVar.t = i7;
                        utlVar.u = i5;
                        utlVar.x = 4;
                        if (m88Var.a(arrayList2, g, utlVar) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i6 = utlVar.s;
                    Iterator it8 = utlVar.o;
                    Collection collection4 = utlVar.n;
                    List list15 = utlVar.m;
                    list8 = utlVar.l;
                    List list16 = utlVar.k;
                    qgg.h0(obj2);
                    list5 = list15;
                    obj = null;
                    it2 = it8;
                    list3 = list16;
                    i4 = i6;
                    list4 = list8;
                    r12 = obj;
                    if (!it2.hasNext()) {
                        IndexedValue indexedValue = (IndexedValue) it2.next();
                        i5 = indexedValue.a;
                        cvlVar = (cvl) indexedValue.b;
                        list6 = (List) list4.get(i5);
                        List list17 = ((stl) list3.get(i5)).c;
                        HashSet hashSet3 = new HashSet();
                        Iterator it9 = list17.iterator();
                        while (it9.hasNext()) {
                            hashSet3.add(((t2m) it9.next()).a.a);
                        }
                        utlVar.j = r12;
                        utlVar.k = list3;
                        utlVar.l = list4;
                        utlVar.m = list5;
                        utlVar.n = r12;
                        utlVar.o = it2;
                        utlVar.p = cvlVar;
                        utlVar.q = list6;
                        utlVar.r = hashSet3;
                        utlVar.s = i4;
                        utlVar.t = 0;
                        utlVar.u = i5;
                        utlVar.x = 3;
                        Object a = ((pi4) m88Var.a.getValue()).a(cvlVar, false, utlVar);
                        if (a != nm6.a) {
                            a = Unit.a;
                        }
                        if (a != nm6Var) {
                            list7 = list3;
                            it3 = it2;
                            hashSet = hashSet3;
                            list9 = list5;
                            list8 = list4;
                            i6 = i4;
                            i7 = 0;
                            arrayList2 = new ArrayList();
                            for (Object obj3 : list6) {
                                if (!hashSet.contains((String) obj3)) {
                                    arrayList2.add(obj3);
                                }
                            }
                            g = cvlVar.g();
                            obj = null;
                            utlVar.j = null;
                            utlVar.k = list7;
                            utlVar.l = list8;
                            utlVar.m = list9;
                            utlVar.n = null;
                            utlVar.o = it3;
                            utlVar.p = null;
                            utlVar.q = null;
                            utlVar.r = null;
                            utlVar.s = i6;
                            utlVar.t = i7;
                            utlVar.u = i5;
                            utlVar.x = 4;
                            if (m88Var.a(arrayList2, g, utlVar) != nm6Var) {
                                list5 = list9;
                                it2 = it3;
                                list3 = list7;
                                i4 = i6;
                                list4 = list8;
                                r12 = obj;
                                if (!it2.hasNext()) {
                                    return list5;
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        utlVar = new utl(this, cg6Var);
        Object obj22 = utlVar.v;
        nm6 nm6Var2 = nm6.a;
        i = utlVar.x;
        m88 m88Var2 = this.e;
        int i92 = 1;
        ?? r122 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0251, code lost:
    
        if (r8.a(r0, r6, r4) == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0217, code lost:
    
        if (r0 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0175, code lost:
    
        if (r3 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c8, code lost:
    
        if (r3 == r5) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[LOOP:2: B:48:0x00fb->B:50:0x0101, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, nvl nvlVar, Integer num, List list, cg6 cg6Var) {
        vtl vtlVar;
        int i;
        Integer num2;
        Object d;
        String str2;
        List list2;
        cvl cvlVar;
        String str3;
        cvl cvlVar2;
        nvl nvlVar2;
        List list3;
        List list4;
        cvl cvlVar3;
        Integer num3;
        nvl nvlVar3;
        Iterator it;
        cvl cvlVar4;
        List list5;
        HashSet hashSet;
        nvl nvlVar4 = nvlVar;
        if (cg6Var instanceof vtl) {
            vtlVar = (vtl) cg6Var;
            int i2 = vtlVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vtlVar.s = i2 - Integer.MIN_VALUE;
                Object obj = vtlVar.q;
                Object obj2 = nm6.a;
                i = vtlVar.s;
                m88 m88Var = this.e;
                switch (i) {
                    case 0:
                        qgg.h0(obj);
                        vtlVar.j = str;
                        vtlVar.k = nvlVar4;
                        num2 = num;
                        vtlVar.l = num2;
                        vtlVar.m = list;
                        vtlVar.s = 1;
                        d = this.b.d(str, nvlVar4, true, vtlVar);
                        if (d != obj2) {
                            str2 = str;
                            list2 = list;
                            cvlVar = (cvl) d;
                            if (cvlVar != null) {
                                return Unit.a;
                            }
                            if (list2 != null) {
                                vtlVar.j = str2;
                                vtlVar.k = nvlVar4;
                                vtlVar.l = num2;
                                vtlVar.m = list2;
                                vtlVar.n = cvlVar;
                                vtlVar.o = null;
                                vtlVar.s = 2;
                                Object f = this.c.f(str2, nvlVar4, vtlVar);
                                if (f != obj2) {
                                    nvl nvlVar5 = nvlVar4;
                                    list3 = list2;
                                    cvlVar3 = cvlVar;
                                    num3 = num2;
                                    obj = f;
                                    str3 = str2;
                                    nvlVar3 = nvlVar5;
                                    Iterable iterable = (Iterable) obj;
                                    ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                                    it = iterable.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((i1m) it.next()).c);
                                    }
                                    num2 = num3;
                                    nvlVar2 = nvlVar3;
                                    cvlVar2 = cvlVar3;
                                    list4 = arrayList;
                                    b4m b4mVar = this.a;
                                    if (list3 == null) {
                                        cvl a = cvl.a(cvlVar2, null, null, num2 != null ? num2.intValue() : cvlVar2.e, 0, 0L, null, null, null, null, null, null, null, null, null, null, 134217711);
                                        vtlVar.j = null;
                                        vtlVar.k = nvlVar2;
                                        vtlVar.l = null;
                                        vtlVar.m = list3;
                                        vtlVar.n = null;
                                        vtlVar.o = list4;
                                        vtlVar.s = 3;
                                        obj = b4mVar.d(str3, a, false, vtlVar);
                                        break;
                                    } else {
                                        String str4 = str3;
                                        cvl cvlVar5 = cvlVar2;
                                        cvl a2 = cvl.a(cvlVar5, null, null, num2 != null ? num2.intValue() : cvlVar5.e, list3.size(), 0L, null, null, null, null, null, null, null, null, null, null, 134217647);
                                        vtlVar.j = null;
                                        vtlVar.k = nvlVar2;
                                        vtlVar.l = null;
                                        vtlVar.m = list3;
                                        vtlVar.n = null;
                                        vtlVar.o = list4;
                                        vtlVar.s = 4;
                                        obj = b4mVar.e(str4, a2, list3, vtlVar);
                                        break;
                                    }
                                }
                            } else {
                                str3 = str2;
                                cvlVar2 = cvlVar;
                                nvlVar2 = nvlVar4;
                                list3 = list2;
                                list4 = null;
                                b4m b4mVar2 = this.a;
                                if (list3 == null) {
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        list2 = vtlVar.m;
                        Integer num4 = vtlVar.l;
                        nvl nvlVar6 = vtlVar.k;
                        str2 = vtlVar.j;
                        qgg.h0(obj);
                        num2 = num4;
                        nvlVar4 = nvlVar6;
                        d = obj;
                        cvlVar = (cvl) d;
                        if (cvlVar != null) {
                        }
                        break;
                    case 2:
                        List list6 = vtlVar.o;
                        cvlVar3 = vtlVar.n;
                        list3 = vtlVar.m;
                        num3 = vtlVar.l;
                        nvlVar3 = vtlVar.k;
                        str3 = vtlVar.j;
                        qgg.h0(obj);
                        Iterable iterable2 = (Iterable) obj;
                        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
                        it = iterable2.iterator();
                        while (it.hasNext()) {
                        }
                        num2 = num3;
                        nvlVar2 = nvlVar3;
                        cvlVar2 = cvlVar3;
                        list4 = arrayList2;
                        b4m b4mVar22 = this.a;
                        if (list3 == null) {
                        }
                        return obj2;
                    case 3:
                        list4 = vtlVar.o;
                        list3 = vtlVar.m;
                        nvlVar2 = vtlVar.k;
                        qgg.h0(obj);
                        cvlVar4 = (cvl) obj;
                        List list7 = list3;
                        list5 = list4;
                        if (list5 != null) {
                            return Unit.a;
                        }
                        hashSet = new HashSet();
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            hashSet.add(((t2m) it2.next()).a.a);
                        }
                        vtlVar.j = null;
                        vtlVar.k = nvlVar2;
                        vtlVar.l = null;
                        vtlVar.m = null;
                        vtlVar.n = null;
                        vtlVar.o = list5;
                        vtlVar.p = hashSet;
                        vtlVar.s = 5;
                        Object a3 = ((pi4) m88Var.a.getValue()).a(cvlVar4, false, vtlVar);
                        if (a3 != nm6.a) {
                            a3 = Unit.a;
                            break;
                        }
                        break;
                    case 4:
                        list4 = vtlVar.o;
                        list3 = vtlVar.m;
                        nvlVar2 = vtlVar.k;
                        qgg.h0(obj);
                        cvlVar4 = (cvl) obj;
                        List list72 = list3;
                        list5 = list4;
                        if (list5 != null) {
                        }
                        break;
                    case 5:
                        hashSet = vtlVar.p;
                        list5 = vtlVar.o;
                        List list8 = vtlVar.m;
                        nvlVar2 = vtlVar.k;
                        qgg.h0(obj);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list5) {
                            if (!hashSet.contains((String) obj3)) {
                                arrayList3.add(obj3);
                            }
                        }
                        vtlVar.j = null;
                        vtlVar.k = null;
                        vtlVar.l = null;
                        vtlVar.m = null;
                        vtlVar.n = null;
                        vtlVar.o = null;
                        vtlVar.p = null;
                        vtlVar.s = 6;
                        break;
                    case 6:
                        List list9 = vtlVar.o;
                        List list10 = vtlVar.m;
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        vtlVar = new vtl(this, cg6Var);
        Object obj4 = vtlVar.q;
        Object obj22 = nm6.a;
        i = vtlVar.s;
        m88 m88Var2 = this.e;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r5.b.a.d(r6, r7, false, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cvl cvlVar, cvl cvlVar2, cg6 cg6Var) {
        wtl wtlVar;
        int i;
        if (cg6Var instanceof wtl) {
            wtlVar = (wtl) cg6Var;
            int i2 = wtlVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wtlVar.n = i2 - Integer.MIN_VALUE;
                Object obj = wtlVar.l;
                nm6 nm6Var = nm6.a;
                i = wtlVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    wtlVar.j = str;
                    wtlVar.k = cvlVar;
                    wtlVar.n = 1;
                    Object h = ((pi4) this.e.a.getValue()).h(cvlVar2, cvlVar, wtlVar);
                    if (h != nm6Var) {
                        h = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cvlVar = wtlVar.k;
                    str = wtlVar.j;
                    qgg.h0(obj);
                }
                wtlVar.j = null;
                wtlVar.k = null;
                wtlVar.n = 2;
            }
        }
        wtlVar = new wtl(this, cg6Var);
        Object obj2 = wtlVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wtlVar.n;
        if (i != 0) {
        }
        wtlVar.j = null;
        wtlVar.k = null;
        wtlVar.n = 2;
    }
}
