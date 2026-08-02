package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class nsl {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public nsl(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4) {
        this.a = jyrVar3;
        this.b = jyrVar;
        this.c = jyrVar2;
        this.d = jyrVar4;
    }

    public final klg a() {
        return (klg) this.c.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (r2 == r5) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a A[Catch: IOException -> 0x010a, TryCatch #0 {IOException -> 0x010a, blocks: (B:15:0x0136, B:17:0x013a, B:25:0x00f8, B:27:0x00fe, B:29:0x010c, B:31:0x0110, B:35:0x0142, B:36:0x0147, B:39:0x0157, B:41:0x015b, B:58:0x00af, B:60:0x00ce, B:63:0x00dd, B:66:0x0148), top: B:57:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe A[Catch: IOException -> 0x010a, TryCatch #0 {IOException -> 0x010a, blocks: (B:15:0x0136, B:17:0x013a, B:25:0x00f8, B:27:0x00fe, B:29:0x010c, B:31:0x0110, B:35:0x0142, B:36:0x0147, B:39:0x0157, B:41:0x015b, B:58:0x00af, B:60:0x00ce, B:63:0x00dd, B:66:0x0148), top: B:57:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c A[Catch: IOException -> 0x010a, TryCatch #0 {IOException -> 0x010a, blocks: (B:15:0x0136, B:17:0x013a, B:25:0x00f8, B:27:0x00fe, B:29:0x010c, B:31:0x0110, B:35:0x0142, B:36:0x0147, B:39:0x0157, B:41:0x015b, B:58:0x00af, B:60:0x00ce, B:63:0x00dd, B:66:0x0148), top: B:57:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c A[Catch: IOException -> 0x003d, TryCatch #1 {IOException -> 0x003d, blocks: (B:13:0x0037, B:24:0x004a, B:37:0x0050, B:44:0x0058, B:45:0x0078, B:47:0x007c, B:49:0x0084, B:51:0x0093, B:52:0x0097, B:55:0x00a1, B:75:0x005f, B:77:0x0068), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093 A[Catch: IOException -> 0x003d, TryCatch #1 {IOException -> 0x003d, blocks: (B:13:0x0037, B:24:0x004a, B:37:0x0050, B:44:0x0058, B:45:0x0078, B:47:0x007c, B:49:0x0084, B:51:0x0093, B:52:0x0097, B:55:0x00a1, B:75:0x005f, B:77:0x0068), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce A[Catch: IOException -> 0x010a, TryCatch #0 {IOException -> 0x010a, blocks: (B:15:0x0136, B:17:0x013a, B:25:0x00f8, B:27:0x00fe, B:29:0x010c, B:31:0x0110, B:35:0x0142, B:36:0x0147, B:39:0x0157, B:41:0x015b, B:58:0x00af, B:60:0x00ce, B:63:0x00dd, B:66:0x0148), top: B:57:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(cvl cvlVar, cg6 cg6Var) {
        jsl jslVar;
        int i;
        String str;
        String e;
        drt drtVar;
        rrl rrlVar;
        rj6 rj6Var;
        rrl rrlVar2;
        cvl cvlVar2 = cvlVar;
        try {
            try {
                if (cg6Var instanceof jsl) {
                    jslVar = (jsl) cg6Var;
                    int i2 = jslVar.m;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        jslVar.m = i2 - Integer.MIN_VALUE;
                        Object obj = jslVar.k;
                        nm6 nm6Var = nm6.a;
                        i = jslVar.m;
                        if (i != 0) {
                            qgg.h0(obj);
                            cvlVar2.getClass();
                            if (ivf.I(cvlVar2)) {
                                klg a = a();
                                jslVar.j = cvlVar2;
                                jslVar.m = 1;
                                obj = a.c(cvlVar2, jslVar);
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                            }
                            e = cvlVar2.e();
                            drtVar = drt.f;
                            ayr ayrVar = (134217720 & 2048) != 0 ? ayr.b : null;
                            String str2 = (134217720 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? "private" : null;
                            drtVar.getClass();
                            ayrVar.getClass();
                            str2.getClass();
                            str = "PlaylistCenter";
                            new Date(0L);
                            if (!e.equals(drtVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + "-1") && ((z66) this.d.getValue()).g()) {
                                kvn kvnVar = (kvn) this.b.getValue();
                                jslVar.j = cvlVar2;
                                jslVar.m = 3;
                                obj = ((cut) kvnVar.b.getValue()).e(cvlVar2, jslVar);
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                                rj6Var = (rj6) obj;
                                if (rj6Var instanceof qj6) {
                                }
                            }
                            klg a2 = a();
                            jslVar.j = null;
                            jslVar.m = 2;
                            obj = a2.c(cvlVar2, jslVar);
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    qgg.h0(obj);
                                    rrl rrlVar3 = (rrl) obj;
                                    if (rrlVar3 != null) {
                                        return new Pair(rrlVar3, isl.a);
                                    }
                                    return null;
                                }
                                if (i != 3) {
                                    if (i != 4) {
                                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    qgg.h0(obj);
                                    rrlVar2 = (rrl) obj;
                                    if (rrlVar2 != null) {
                                        return new Pair(rrlVar2, isl.a);
                                    }
                                    return null;
                                }
                                cvlVar2 = jslVar.j;
                                qgg.h0(obj);
                                str = "PlaylistCenter";
                                rj6Var = (rj6) obj;
                                if (rj6Var instanceof qj6) {
                                    return new Pair(((qj6) rj6Var).a, isl.b);
                                }
                                if (!(rj6Var instanceof pj6)) {
                                    throw new x7j();
                                }
                                ssg.a(6, str, "Could not retrieve playlist: " + rj6Var, ((pj6) rj6Var).a());
                                klg a3 = a();
                                jslVar.j = null;
                                jslVar.m = 4;
                                obj = a3.c(cvlVar2, jslVar);
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                                rrlVar2 = (rrl) obj;
                                if (rrlVar2 != null) {
                                }
                                return null;
                            }
                            cvlVar2 = jslVar.j;
                            qgg.h0(obj);
                        }
                        rrlVar = (rrl) obj;
                        if (rrlVar != null) {
                            return new Pair(rrlVar, isl.a);
                        }
                        e = cvlVar2.e();
                        drtVar = drt.f;
                        if ((134217720 & 2048) != 0) {
                        }
                        if ((134217720 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
                        }
                        drtVar.getClass();
                        ayrVar.getClass();
                        str2.getClass();
                        str = "PlaylistCenter";
                        new Date(0L);
                        if (!e.equals(drtVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + "-1")) {
                            kvn kvnVar2 = (kvn) this.b.getValue();
                            jslVar.j = cvlVar2;
                            jslVar.m = 3;
                            obj = ((cut) kvnVar2.b.getValue()).e(cvlVar2, jslVar);
                            if (obj == nm6Var) {
                            }
                            rj6Var = (rj6) obj;
                            if (rj6Var instanceof qj6) {
                            }
                        }
                        klg a22 = a();
                        jslVar.j = null;
                        jslVar.m = 2;
                        obj = a22.c(cvlVar2, jslVar);
                    }
                }
                new Date(0L);
                if (!e.equals(drtVar.a + StringUtils.PROCESS_POSTFIX_DELIMITER + "-1")) {
                }
                klg a222 = a();
                jslVar.j = null;
                jslVar.m = 2;
                obj = a222.c(cvlVar2, jslVar);
            } catch (IOException e2) {
                e = e2;
                ssg.a(6, str, "Could not load playlist", e);
                return null;
            }
            if (i != 0) {
            }
            rrlVar = (rrl) obj;
            if (rrlVar != null) {
            }
            e = cvlVar2.e();
            drtVar = drt.f;
            if ((134217720 & 2048) != 0) {
            }
            if ((134217720 & SQLiteDatabase.OPEN_SHAREDCACHE) != 0) {
            }
            drtVar.getClass();
            ayrVar.getClass();
            str2.getClass();
            str = "PlaylistCenter";
        } catch (IOException e3) {
            e = e3;
            str = "PlaylistCenter";
        }
        jslVar = new jsl(this, cg6Var);
        Object obj2 = jslVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jslVar.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        if (r13 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        if (r13 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(String str, String str2, cg6 cg6Var) {
        ksl kslVar;
        int i;
        String str3;
        String str4;
        rj6 rj6Var;
        if (cg6Var instanceof ksl) {
            kslVar = (ksl) cg6Var;
            int i2 = kslVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kslVar.n = i2 - Integer.MIN_VALUE;
                ksl kslVar2 = kslVar;
                Object obj = kslVar2.l;
                nm6 nm6Var = nm6.a;
                i = kslVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String str5 = ((frt) this.a.getValue()).c().a;
                    if (Intrinsics.d(str5, str) || Intrinsics.d(str5, drt.f.a) || !((z66) this.d.getValue()).g()) {
                        klg a = a();
                        kslVar2.j = null;
                        kslVar2.k = null;
                        kslVar2.n = 1;
                        obj = a.d(str, str2, kslVar2);
                    } else {
                        kvn kvnVar = (kvn) this.b.getValue();
                        new nvl(str, str2);
                        kslVar2.j = str;
                        kslVar2.k = str2;
                        kslVar2.n = 2;
                        obj = cut.h((cut) kvnVar.b.getValue(), str, str2, false, true, kslVar2, 112);
                        if (obj != nm6Var) {
                            str3 = str2;
                            str4 = str;
                            rj6Var = (rj6) obj;
                            if (!(rj6Var instanceof qj6)) {
                            }
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    rrl rrlVar = (rrl) obj;
                    if (rrlVar != null) {
                        return new Pair(rrlVar, isl.a);
                    }
                    return null;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    rrl rrlVar2 = (rrl) obj;
                    if (rrlVar2 != null) {
                        return new Pair(rrlVar2, isl.a);
                    }
                    return null;
                }
                str3 = kslVar2.k;
                str4 = kslVar2.j;
                qgg.h0(obj);
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new Pair(((qj6) rj6Var).a, isl.b);
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                ssg.a(6, "PlaylistCenter", "Could not retrieve playlist: " + rj6Var, ((pj6) rj6Var).a());
                klg a2 = a();
                kslVar2.j = null;
                kslVar2.k = null;
                kslVar2.n = 3;
                obj = a2.d(str4, str3, kslVar2);
            }
        }
        kslVar = new ksl(this, cg6Var);
        ksl kslVar22 = kslVar;
        Object obj2 = kslVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = kslVar22.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018e A[LOOP:0: B:16:0x0188->B:18:0x018e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3 A[LOOP:1: B:21:0x01bd->B:23:0x01c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0211 A[LOOP:2: B:29:0x0206->B:31:0x0211, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0223 A[EDGE_INSN: B:32:0x0223->B:33:0x0223 BREAK  A[LOOP:2: B:29:0x0206->B:31:0x0211], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024e A[LOOP:3: B:38:0x0248->B:40:0x024e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113 A[LOOP:5: B:60:0x010d->B:62:0x0113, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(List list, boolean z, cg6 cg6Var) {
        lsl lslVar;
        int i;
        Collection A0;
        int i2;
        Object V;
        List list2;
        int i3;
        Collection collection;
        Collection collection2;
        List list3;
        List list4;
        Iterator it;
        Collection k;
        List list5;
        List list6;
        Collection collection3;
        List list7;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        int a;
        LinkedHashMap linkedHashMap;
        Iterator it5;
        ora oraVar;
        boolean z2 = z;
        if (cg6Var instanceof lsl) {
            lslVar = (lsl) cg6Var;
            int i4 = lslVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lslVar.s = i4 - Integer.MIN_VALUE;
                Object obj = lslVar.q;
                nm6 nm6Var = nm6.a;
                i = lslVar.s;
                int i5 = 2;
                int i6 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    A0 = CollectionsKt.A0(list);
                    i2 = 0;
                    if (z2) {
                        lslVar.j = null;
                        lslVar.k = (Set) A0;
                        lslVar.l = null;
                        lslVar.n = z2;
                        lslVar.o = 0;
                        lslVar.p = 0;
                        lslVar.s = 1;
                        obj = e(A0, lslVar);
                        if (obj != nm6Var) {
                            collection2 = A0;
                            list3 = (List) obj;
                            List list8 = list3;
                            int a2 = tah.a(v75.o(list8, 10));
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2 < 16 ? 16 : a2);
                            while (r2.hasNext()) {
                            }
                            ArrayList arrayList = new ArrayList();
                            it2 = collection2.iterator();
                            while (it2.hasNext()) {
                            }
                            return arrayList;
                        }
                    } else {
                        klg a3 = a();
                        Set A02 = CollectionsKt.A0(A0);
                        lslVar.j = list;
                        Set set = (Set) A0;
                        lslVar.k = set;
                        lslVar.l = set;
                        lslVar.n = z2;
                        lslVar.o = 0;
                        lslVar.p = 0;
                        lslVar.s = 2;
                        a3.getClass();
                        jyr jyrVar = i2q.e;
                        V = lsq.v() ? x97.V(dm6.a, new zig(a3, A02, continuation, i5), lslVar) : x97.V(dm6.a, new seg(continuation, a3, A02, i5), lslVar);
                        if (V != nm6Var) {
                            list2 = list;
                            i3 = 0;
                            collection = A0;
                            list4 = (List) V;
                            List list9 = list4;
                            ArrayList arrayList2 = new ArrayList(v75.o(list9, 10));
                            it = list9.iterator();
                            while (it.hasNext()) {
                            }
                            Set A03 = CollectionsKt.A0(arrayList2);
                            wz0 F = CollectionsKt.F(collection);
                            Set set2 = A03;
                            set2.getClass();
                            k = jhp.k(new h5d(i6, set2, F));
                            if (k.isEmpty()) {
                            }
                            if (k != null) {
                            }
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    Set set3 = lslVar.l;
                    collection2 = (Set) lslVar.k;
                    List list10 = lslVar.j;
                    qgg.h0(obj);
                    list3 = (List) obj;
                    List list82 = list3;
                    int a22 = tah.a(v75.o(list82, 10));
                    LinkedHashMap linkedHashMap22 = new LinkedHashMap(a22 < 16 ? 16 : a22);
                    while (r2.hasNext()) {
                    }
                    ArrayList arrayList3 = new ArrayList();
                    it2 = collection2.iterator();
                    while (it2.hasNext()) {
                    }
                    return arrayList3;
                }
                if (i != 2) {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list6 = lslVar.m;
                    Set set4 = lslVar.l;
                    collection3 = (Set) lslVar.k;
                    list7 = lslVar.j;
                    qgg.h0(obj);
                    list5 = (List) obj;
                    list4 = list6;
                    list2 = list7;
                    collection2 = collection3;
                    if (list5 == null) {
                        list5 = c5b.a;
                    }
                    List list11 = list4;
                    ArrayList arrayList4 = new ArrayList(v75.o(list11, 10));
                    it3 = list11.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((cvl) it3.next()).e());
                    }
                    ssg.a(3, null, "Cached playlists: " + arrayList4, null);
                    List list12 = list5;
                    ArrayList arrayList5 = new ArrayList(v75.o(list12, 10));
                    it4 = list12.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((cvl) it4.next()).e());
                    }
                    ssg.a(3, null, "Loaded playlists: " + arrayList5, null);
                    ArrayList g0 = CollectionsKt.g0(list4, list12);
                    vz0 B0 = CollectionsKt.B0(list2);
                    a = tah.a(v75.o(B0, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    linkedHashMap = new LinkedHashMap(a);
                    it5 = B0.iterator();
                    while (true) {
                        oraVar = (ora) it5;
                        if (!oraVar.b.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) oraVar.next();
                        linkedHashMap.put(indexedValue.b, Integer.valueOf(indexedValue.a));
                    }
                    list3 = CollectionsKt.o0(g0, new eh(13, linkedHashMap));
                    List list822 = list3;
                    int a222 = tah.a(v75.o(list822, 10));
                    LinkedHashMap linkedHashMap222 = new LinkedHashMap(a222 < 16 ? 16 : a222);
                    for (Object obj2 : list822) {
                        linkedHashMap222.put(((cvl) obj2).e(), obj2);
                    }
                    ArrayList arrayList32 = new ArrayList();
                    it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        cvl cvlVar = (cvl) linkedHashMap222.get(((nvl) it2.next()).d());
                        if (cvlVar != null) {
                            arrayList32.add(cvlVar);
                        }
                    }
                    return arrayList32;
                }
                int i7 = lslVar.p;
                int i8 = lslVar.o;
                boolean z3 = lslVar.n;
                Collection collection4 = (Set) lslVar.l;
                Collection collection5 = (Set) lslVar.k;
                list2 = lslVar.j;
                qgg.h0(obj);
                i2 = i7;
                z2 = z3;
                i3 = i8;
                V = obj;
                collection = collection4;
                A0 = collection5;
                list4 = (List) V;
                List list92 = list4;
                ArrayList arrayList22 = new ArrayList(v75.o(list92, 10));
                it = list92.iterator();
                while (it.hasNext()) {
                    arrayList22.add(((cvl) it.next()).g());
                }
                Set A032 = CollectionsKt.A0(arrayList22);
                wz0 F2 = CollectionsKt.F(collection);
                Set set22 = A032;
                set22.getClass();
                k = jhp.k(new h5d(i6, set22, F2));
                if (k.isEmpty()) {
                    k = null;
                }
                if (k != null) {
                    list5 = null;
                    collection2 = A0;
                    if (list5 == null) {
                    }
                    List list112 = list4;
                    ArrayList arrayList42 = new ArrayList(v75.o(list112, 10));
                    it3 = list112.iterator();
                    while (it3.hasNext()) {
                    }
                    ssg.a(3, null, "Cached playlists: " + arrayList42, null);
                    List list122 = list5;
                    ArrayList arrayList52 = new ArrayList(v75.o(list122, 10));
                    it4 = list122.iterator();
                    while (it4.hasNext()) {
                    }
                    ssg.a(3, null, "Loaded playlists: " + arrayList52, null);
                    ArrayList g02 = CollectionsKt.g0(list4, list122);
                    vz0 B02 = CollectionsKt.B0(list2);
                    a = tah.a(v75.o(B02, 10));
                    if (a < 16) {
                    }
                    linkedHashMap = new LinkedHashMap(a);
                    it5 = B02.iterator();
                    while (true) {
                        oraVar = (ora) it5;
                        if (!oraVar.b.hasNext()) {
                        }
                        IndexedValue indexedValue2 = (IndexedValue) oraVar.next();
                        linkedHashMap.put(indexedValue2.b, Integer.valueOf(indexedValue2.a));
                    }
                    list3 = CollectionsKt.o0(g02, new eh(13, linkedHashMap));
                    List list8222 = list3;
                    int a2222 = tah.a(v75.o(list8222, 10));
                    LinkedHashMap linkedHashMap2222 = new LinkedHashMap(a2222 < 16 ? 16 : a2222);
                    while (r2.hasNext()) {
                    }
                    ArrayList arrayList322 = new ArrayList();
                    it2 = collection2.iterator();
                    while (it2.hasNext()) {
                    }
                    return arrayList322;
                }
                lslVar.j = list2;
                lslVar.k = (Set) A0;
                lslVar.l = null;
                lslVar.m = list4;
                lslVar.n = z2;
                lslVar.o = i3;
                lslVar.p = i2;
                lslVar.s = 3;
                obj = e(k, lslVar);
                if (obj != nm6Var) {
                    list6 = list4;
                    collection3 = A0;
                    list7 = list2;
                    list5 = (List) obj;
                    list4 = list6;
                    list2 = list7;
                    collection2 = collection3;
                    if (list5 == null) {
                    }
                    List list1122 = list4;
                    ArrayList arrayList422 = new ArrayList(v75.o(list1122, 10));
                    it3 = list1122.iterator();
                    while (it3.hasNext()) {
                    }
                    ssg.a(3, null, "Cached playlists: " + arrayList422, null);
                    List list1222 = list5;
                    ArrayList arrayList522 = new ArrayList(v75.o(list1222, 10));
                    it4 = list1222.iterator();
                    while (it4.hasNext()) {
                    }
                    ssg.a(3, null, "Loaded playlists: " + arrayList522, null);
                    ArrayList g022 = CollectionsKt.g0(list4, list1222);
                    vz0 B022 = CollectionsKt.B0(list2);
                    a = tah.a(v75.o(B022, 10));
                    if (a < 16) {
                    }
                    linkedHashMap = new LinkedHashMap(a);
                    it5 = B022.iterator();
                    while (true) {
                        oraVar = (ora) it5;
                        if (!oraVar.b.hasNext()) {
                        }
                        IndexedValue indexedValue22 = (IndexedValue) oraVar.next();
                        linkedHashMap.put(indexedValue22.b, Integer.valueOf(indexedValue22.a));
                    }
                    list3 = CollectionsKt.o0(g022, new eh(13, linkedHashMap));
                    List list82222 = list3;
                    int a22222 = tah.a(v75.o(list82222, 10));
                    LinkedHashMap linkedHashMap22222 = new LinkedHashMap(a22222 < 16 ? 16 : a22222);
                    while (r2.hasNext()) {
                    }
                    ArrayList arrayList3222 = new ArrayList();
                    it2 = collection2.iterator();
                    while (it2.hasNext()) {
                    }
                    return arrayList3222;
                }
                return nm6Var;
            }
        }
        lslVar = new lsl(this, cg6Var);
        Object obj3 = lslVar.q;
        nm6 nm6Var2 = nm6.a;
        i = lslVar.s;
        int i52 = 2;
        int i62 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Collection collection, cg6 cg6Var) {
        msl mslVar;
        int i;
        rj6 rj6Var;
        int i2;
        Iterable iterable;
        Iterator it;
        int i3;
        if (cg6Var instanceof msl) {
            mslVar = (msl) cg6Var;
            int i4 = mslVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mslVar.p = i4 - Integer.MIN_VALUE;
                Object obj = mslVar.n;
                nm6 nm6Var = nm6.a;
                i = mslVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    kvn kvnVar = (kvn) this.b.getValue();
                    Collection collection2 = collection;
                    ArrayList arrayList = new ArrayList(v75.o(collection2, 10));
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((nvl) it2.next()).d());
                    }
                    mslVar.p = 1;
                    obj = kvnVar.a(arrayList, mslVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = mslVar.m;
                        i2 = mslVar.l;
                        it = mslVar.k;
                        iterable = mslVar.j;
                        qgg.h0(obj);
                        while (it.hasNext()) {
                            cvl cvlVar = (cvl) it.next();
                            klg a = a();
                            mslVar.j = iterable;
                            mslVar.k = it;
                            mslVar.l = i2;
                            mslVar.m = i3;
                            mslVar.p = 2;
                            if (a.g(cvlVar, mslVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                        return (List) iterable;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    ssg.a(6, null, "Could not load playlists", ((pj6) rj6Var).a());
                    return c5b.a;
                }
                if (!(rj6Var instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                Iterable iterable2 = (Iterable) ((qj6) rj6Var).a;
                i2 = 0;
                iterable = iterable2;
                it = iterable2.iterator();
                i3 = 0;
                while (it.hasNext()) {
                }
                return (List) iterable;
            }
        }
        mslVar = new msl(this, cg6Var);
        Object obj2 = mslVar.n;
        nm6 nm6Var2 = nm6.a;
        i = mslVar.p;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }
}
