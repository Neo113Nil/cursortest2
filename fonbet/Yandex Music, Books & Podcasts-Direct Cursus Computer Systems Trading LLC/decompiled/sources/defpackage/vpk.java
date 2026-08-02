package defpackage;

import android.os.Parcelable;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class vpk {
    public final ac0 a;
    public final jac b;
    public final Set c;

    public vpk(ac0 ac0Var, jac jacVar, y9w y9wVar, Set set, klx klxVar) {
        set.getClass();
        this.a = ac0Var;
        this.b = jacVar;
        this.c = set;
    }

    public final ArrayList a(rj6 rj6Var, final List list, final String str) {
        ArrayList arrayList = new ArrayList();
        if (rj6Var instanceof qj6) {
            arrayList.addAll(list);
            return arrayList;
        }
        if (!(rj6Var instanceof pj6)) {
            b6e.s();
            return null;
        }
        pj6 pj6Var = (pj6) rj6Var;
        if (!(pj6Var instanceof mj6)) {
            final int i = 1;
            y9w.V(pj6Var.a(), new Function0() { // from class: fpk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return "send " + str + " error: " + list;
                        default:
                            return "send " + str + " error: " + list;
                    }
                }
            });
            return arrayList;
        }
        mj6 mj6Var = (mj6) rj6Var;
        int i2 = mj6Var.a;
        if (i2 >= 400 && i2 < 500) {
            arrayList.addAll(list);
            return arrayList;
        }
        final int i3 = 0;
        y9w.V(mj6Var.a(), new Function0() { // from class: fpk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return "send " + str + " error: " + list;
                    default:
                        return "send " + str + " error: " + list;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var, String str, List list) {
        ipk ipkVar;
        int i;
        if (cg6Var instanceof ipk) {
            ipkVar = (ipk) cg6Var;
            int i2 = ipkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ipkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ipkVar.k;
                nm6 nm6Var = nm6.a;
                i = ipkVar.m;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = ipkVar.j;
                    qgg.h0(obj);
                    return list2;
                }
                qgg.h0(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    rr5 rr5Var = ((iys) obj2).b;
                    String str2 = rr5Var.a;
                    String str3 = rr5Var.b;
                    if ((str3 == null || !StringsKt.M(str3, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) && !StringsKt.M(str2, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    dfi.r("track operations: " + arrayList2, "PhonotekaSynchronizer");
                    uys e = this.a.e();
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new Long(((iys) it.next()).a));
                    }
                    ipkVar.j = arrayList;
                    ipkVar.m = 1;
                    if (e.c(ipkVar, str, arrayList3) == nm6Var) {
                        return nm6Var;
                    }
                }
                return arrayList;
            }
        }
        ipkVar = new ipk(this, cg6Var);
        Object obj3 = ipkVar.k;
        nm6 nm6Var2 = nm6.a;
        i = ipkVar.m;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024f, code lost:
    
        if (r1 == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x028b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0289, code lost:
    
        if (r2.a(r3, r1, r5) != r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a8, code lost:
    
        if (r2 == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        if (r2 == r4) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x024f -> B:19:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01a8 -> B:33:0x01ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        jpk jpkVar;
        int i;
        List list;
        LinkedHashMap linkedHashMap;
        jac jacVar;
        List list2;
        Collection arrayList;
        LinkedHashMap linkedHashMap2;
        Iterator it;
        String str2;
        int i2;
        List list3;
        List list4;
        Iterable iterable;
        String str3;
        Iterator it2;
        Collection collection;
        List list5;
        int i3;
        String str4 = str;
        if (cg6Var instanceof jpk) {
            jpkVar = (jpk) cg6Var;
            int i4 = jpkVar.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jpkVar.u = i4 - Integer.MIN_VALUE;
                Object obj = jpkVar.s;
                nm6 nm6Var = nm6.a;
                i = jpkVar.u;
                jac jacVar2 = this.b;
                ac0 ac0Var = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    e1g a = ac0Var.a();
                    jpkVar.j = str4;
                    jpkVar.u = 1;
                    obj = a.e(str4, jpkVar);
                } else if (i == 1) {
                    str4 = jpkVar.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    i2 = jpkVar.r;
                    List list6 = (List) jpkVar.p;
                    it = jpkVar.n;
                    arrayList = jpkVar.m;
                    List list7 = jpkVar.l;
                    Map map = jpkVar.k;
                    str2 = jpkVar.j;
                    qgg.h0(obj);
                    jac jacVar3 = jacVar2;
                    LinkedHashMap linkedHashMap3 = map;
                    z75.t(arrayList, a((rj6) obj, list6, "album likes"));
                    jacVar2 = jacVar3;
                    linkedHashMap2 = linkedHashMap3;
                    if (it.hasNext()) {
                        jacVar = jacVar2;
                        list2 = (List) arrayList;
                        str4 = str2;
                        linkedHashMap = linkedHashMap2;
                        list3 = (List) linkedHashMap.get(q0g.b);
                        if (list3 == null) {
                            list3 = c5b.a;
                        }
                        list4 = list3;
                        if (list4.isEmpty()) {
                            ouj.B("send neutral albums: ", list3, 4, "PhonotekaSynchronizer", null);
                            List M = zsd.M(400, list4);
                            ArrayList arrayList2 = new ArrayList();
                            str3 = str4;
                            it2 = M.iterator();
                            collection = arrayList2;
                            list5 = list2;
                            i3 = 0;
                            if (it2.hasNext()) {
                            }
                        } else {
                            iterable = c5b.a;
                            e1g a2 = ac0Var.a();
                            ArrayList g0 = CollectionsKt.g0(list2, iterable);
                            jpkVar.j = null;
                            jpkVar.k = null;
                            jpkVar.l = null;
                            jpkVar.m = null;
                            jpkVar.n = null;
                            jpkVar.o = null;
                            jpkVar.p = null;
                            jpkVar.q = null;
                            jpkVar.u = 4;
                        }
                    } else {
                        list6 = (List) it.next();
                        f5g h = jacVar2.h();
                        List list8 = list6;
                        jacVar3 = jacVar2;
                        ArrayList arrayList3 = new ArrayList(v75.o(list8, 10));
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((m0g) it3.next()).b);
                        }
                        jpkVar.j = str2;
                        jpkVar.k = linkedHashMap2;
                        jpkVar.l = null;
                        jpkVar.m = arrayList;
                        jpkVar.n = it;
                        jpkVar.o = null;
                        jpkVar.p = list6;
                        jpkVar.r = i2;
                        jpkVar.u = 2;
                        obj = h.d(jpkVar, str2, arrayList3);
                        linkedHashMap3 = linkedHashMap2;
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list9 = jpkVar.l;
                        Map map2 = jpkVar.k;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    int i5 = jpkVar.r;
                    List list10 = jpkVar.q;
                    it2 = (Iterator) jpkVar.p;
                    collection = jpkVar.o;
                    list5 = jpkVar.l;
                    Map map3 = jpkVar.k;
                    str3 = jpkVar.j;
                    qgg.h0(obj);
                    i3 = i5;
                    Object k = obj;
                    jacVar = jacVar2;
                    z75.t(collection, a((rj6) k, list10, "album neutral"));
                    if (it2.hasNext()) {
                        iterable = (List) collection;
                        list2 = list5;
                        str4 = str3;
                        e1g a22 = ac0Var.a();
                        ArrayList g02 = CollectionsKt.g0(list2, iterable);
                        jpkVar.j = null;
                        jpkVar.k = null;
                        jpkVar.l = null;
                        jpkVar.m = null;
                        jpkVar.n = null;
                        jpkVar.o = null;
                        jpkVar.p = null;
                        jpkVar.q = null;
                        jpkVar.u = 4;
                    } else {
                        list10 = (List) it2.next();
                        f5g h2 = jacVar.h();
                        List list11 = list10;
                        ArrayList arrayList4 = new ArrayList(v75.o(list11, 10));
                        Iterator it4 = list11.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((m0g) it4.next()).b);
                        }
                        jpkVar.j = str3;
                        jpkVar.k = null;
                        jpkVar.l = list5;
                        jpkVar.m = null;
                        jpkVar.n = null;
                        jpkVar.o = collection;
                        jpkVar.p = it2;
                        jpkVar.q = list10;
                        jpkVar.r = i3;
                        jpkVar.u = 3;
                        k = h2.k(jpkVar, str3, arrayList4);
                    }
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    ssg.a(4, "PhonotekaSynchronizer", "uploadAlbumsLikeChanges(): nothing to send", null);
                    return Unit.a;
                }
                List list12 = list;
                int a3 = tah.a(v75.o(list12, 10));
                if (a3 < 16) {
                    a3 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(a3);
                for (Object obj2 : list12) {
                    linkedHashMap4.put(((m0g) obj2).b, obj2);
                }
                Collection values = linkedHashMap4.values();
                linkedHashMap = new LinkedHashMap();
                for (Object obj3 : values) {
                    q0g q0gVar = ((m0g) obj3).a;
                    Object obj4 = linkedHashMap.get(q0gVar);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(q0gVar, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                List list13 = (List) linkedHashMap.get(q0g.a);
                if (list13 == null) {
                    list13 = c5b.a;
                }
                List list14 = list13;
                if (list14.isEmpty()) {
                    jacVar = jacVar2;
                    list2 = c5b.a;
                    list3 = (List) linkedHashMap.get(q0g.b);
                    if (list3 == null) {
                    }
                    list4 = list3;
                    if (list4.isEmpty()) {
                    }
                } else {
                    ouj.B("send liked albums: ", list13, 4, "PhonotekaSynchronizer", null);
                    List M2 = zsd.M(400, list14);
                    arrayList = new ArrayList();
                    linkedHashMap2 = linkedHashMap;
                    it = M2.iterator();
                    str2 = str4;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        jpkVar = new jpk(this, cg6Var);
        Object obj5 = jpkVar.s;
        nm6 nm6Var2 = nm6.a;
        i = jpkVar.u;
        jac jacVar22 = this.b;
        ac0 ac0Var2 = this.a;
        if (i != 0) {
        }
        list = (List) obj5;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f2, code lost:
    
        if (r2 == r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0345, code lost:
    
        if (r1 == r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x038b, code lost:
    
        if (r2.b(r3, r1, r5) != r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e9, code lost:
    
        if (r2 == r4) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0345 -> B:20:0x0348). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x029d -> B:34:0x029f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01e9 -> B:53:0x01ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        kpk kpkVar;
        int i;
        List list;
        LinkedHashMap linkedHashMap;
        ac0 ac0Var;
        List list2;
        Iterator it;
        String str2;
        Collection collection;
        LinkedHashMap linkedHashMap2;
        int i2;
        List list3;
        List list4;
        List list5;
        String str3;
        Collection arrayList;
        Iterator it2;
        List list6;
        int i3;
        LinkedHashMap linkedHashMap3;
        List list7;
        List list8;
        List list9;
        List list10;
        String str4;
        List list11;
        int i4;
        Iterator it3;
        Collection collection2;
        String str5 = str;
        if (cg6Var instanceof kpk) {
            kpkVar = (kpk) cg6Var;
            int i5 = kpkVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                kpkVar.w = i5 - Integer.MIN_VALUE;
                Object obj = kpkVar.u;
                nm6 nm6Var = nm6.a;
                i = kpkVar.w;
                ac0 ac0Var2 = this.a;
                jac jacVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    e1g a = ac0Var2.a();
                    kpkVar.j = str5;
                    kpkVar.w = 1;
                    obj = a.f(str5, kpkVar);
                } else if (i == 1) {
                    str5 = kpkVar.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    i2 = kpkVar.t;
                    List list12 = (List) kpkVar.p;
                    it = (Iterator) kpkVar.n;
                    collection = kpkVar.m;
                    List list13 = kpkVar.l;
                    Map map = kpkVar.k;
                    str2 = kpkVar.j;
                    qgg.h0(obj);
                    ac0 ac0Var3 = ac0Var2;
                    char c = 2;
                    LinkedHashMap linkedHashMap4 = map;
                    z75.t(collection, a((rj6) obj, list12, "artist likes"));
                    ac0Var2 = ac0Var3;
                    linkedHashMap2 = linkedHashMap4;
                    if (it.hasNext()) {
                        ac0Var = ac0Var2;
                        list2 = (List) collection;
                        linkedHashMap = linkedHashMap2;
                        str5 = str2;
                        list3 = (List) linkedHashMap.get(q0g.b);
                        if (list3 == null) {
                            list3 = c5b.a;
                        }
                        list4 = list3;
                        if (list4.isEmpty()) {
                            ouj.B("send neutral artists: ", list3, 4, "PhonotekaSynchronizer", null);
                            List M = zsd.M(400, list4);
                            str3 = str5;
                            arrayList = new ArrayList();
                            it2 = M.iterator();
                            list6 = list2;
                            i3 = 0;
                            linkedHashMap3 = linkedHashMap;
                            if (it2.hasNext()) {
                            }
                        } else {
                            list5 = c5b.a;
                            list7 = (List) linkedHashMap.get(q0g.c);
                            if (list7 == null) {
                            }
                            list8 = list7;
                            if (list8.isEmpty()) {
                            }
                        }
                    } else {
                        list12 = (List) it.next();
                        f5g h = jacVar.h();
                        List list14 = list12;
                        ac0Var3 = ac0Var2;
                        ArrayList arrayList2 = new ArrayList(v75.o(list14, 10));
                        Iterator it4 = list14.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((n0g) it4.next()).b);
                        }
                        kpkVar.j = str2;
                        kpkVar.k = linkedHashMap2;
                        kpkVar.l = null;
                        kpkVar.m = collection;
                        kpkVar.n = it;
                        kpkVar.o = null;
                        kpkVar.p = list12;
                        kpkVar.t = i2;
                        c = 2;
                        kpkVar.w = 2;
                        obj = h.e(kpkVar, str2, arrayList2);
                        linkedHashMap4 = linkedHashMap2;
                    }
                } else if (i == 3) {
                    i3 = kpkVar.t;
                    List list15 = (List) kpkVar.r;
                    it2 = (Iterator) kpkVar.p;
                    arrayList = kpkVar.o;
                    list6 = kpkVar.l;
                    Map map2 = kpkVar.k;
                    str3 = kpkVar.j;
                    qgg.h0(obj);
                    ac0Var = ac0Var2;
                    LinkedHashMap linkedHashMap5 = map2;
                    z75.t(arrayList, a((rj6) obj, list15, "artist neutral"));
                    linkedHashMap3 = linkedHashMap5;
                    if (it2.hasNext()) {
                        list15 = (List) it2.next();
                        f5g h2 = jacVar.h();
                        List list16 = list15;
                        LinkedHashMap linkedHashMap6 = linkedHashMap3;
                        ArrayList arrayList3 = new ArrayList(v75.o(list16, 10));
                        Iterator it5 = list16.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(((n0g) it5.next()).b);
                        }
                        kpkVar.j = str3;
                        kpkVar.k = linkedHashMap6;
                        kpkVar.l = list6;
                        kpkVar.m = null;
                        kpkVar.n = null;
                        kpkVar.o = arrayList;
                        kpkVar.p = it2;
                        kpkVar.q = null;
                        kpkVar.r = list15;
                        kpkVar.t = i3;
                        kpkVar.w = 3;
                        obj = h2.l(kpkVar, str3, arrayList3);
                        if (obj != nm6Var) {
                            linkedHashMap5 = linkedHashMap6;
                            z75.t(arrayList, a((rj6) obj, list15, "artist neutral"));
                            linkedHashMap3 = linkedHashMap5;
                            if (it2.hasNext()) {
                                list5 = (List) arrayList;
                                linkedHashMap = linkedHashMap3;
                                list2 = list6;
                                str5 = str3;
                                list7 = (List) linkedHashMap.get(q0g.c);
                                if (list7 == null) {
                                    list7 = c5b.a;
                                }
                                list8 = list7;
                                if (list8.isEmpty()) {
                                    ouj.B("send disliked artists: ", list7, 4, "PhonotekaSynchronizer", null);
                                    List M2 = zsd.M(400, list8);
                                    ArrayList arrayList4 = new ArrayList();
                                    str4 = str5;
                                    list11 = list2;
                                    list9 = list5;
                                    i4 = 0;
                                    it3 = M2.iterator();
                                    collection2 = arrayList4;
                                    if (it3.hasNext()) {
                                    }
                                } else {
                                    list9 = list5;
                                    list10 = c5b.a;
                                    e1g a2 = ac0Var.a();
                                    ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(list2, list9), list10);
                                    kpkVar.j = null;
                                    kpkVar.k = null;
                                    kpkVar.l = null;
                                    kpkVar.m = null;
                                    kpkVar.n = null;
                                    kpkVar.o = null;
                                    kpkVar.p = null;
                                    kpkVar.q = null;
                                    kpkVar.r = null;
                                    kpkVar.s = null;
                                    kpkVar.w = 5;
                                }
                            }
                        }
                        return nm6Var;
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list17 = kpkVar.l;
                        Map map3 = kpkVar.k;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    int i6 = kpkVar.t;
                    List list18 = kpkVar.s;
                    it3 = (Iterator) kpkVar.r;
                    collection2 = kpkVar.q;
                    list9 = (List) kpkVar.n;
                    list11 = kpkVar.l;
                    Map map4 = kpkVar.k;
                    str4 = kpkVar.j;
                    qgg.h0(obj);
                    i4 = i6;
                    Object a3 = obj;
                    ac0Var = ac0Var2;
                    z75.t(collection2, a((rj6) a3, list18, "artist dislike"));
                    if (it3.hasNext()) {
                        list10 = (List) collection2;
                        str5 = str4;
                        list2 = list11;
                        e1g a22 = ac0Var.a();
                        ArrayList g02 = CollectionsKt.g0(CollectionsKt.g0(list2, list9), list10);
                        kpkVar.j = null;
                        kpkVar.k = null;
                        kpkVar.l = null;
                        kpkVar.m = null;
                        kpkVar.n = null;
                        kpkVar.o = null;
                        kpkVar.p = null;
                        kpkVar.q = null;
                        kpkVar.r = null;
                        kpkVar.s = null;
                        kpkVar.w = 5;
                    } else {
                        list18 = (List) it3.next();
                        f5g h3 = jacVar.h();
                        List list19 = list18;
                        ArrayList arrayList5 = new ArrayList(v75.o(list19, 10));
                        Iterator it6 = list19.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((n0g) it6.next()).b);
                        }
                        kpkVar.j = str4;
                        kpkVar.k = null;
                        kpkVar.l = list11;
                        kpkVar.m = null;
                        kpkVar.n = list9;
                        kpkVar.o = null;
                        kpkVar.p = null;
                        kpkVar.q = collection2;
                        kpkVar.r = it3;
                        kpkVar.s = list18;
                        kpkVar.t = i4;
                        kpkVar.w = 4;
                        a3 = h3.a(kpkVar, str4, arrayList5);
                    }
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    ssg.a(4, "PhonotekaSynchronizer", "uploadArtistsLikeChanges(): nothing to send", null);
                    return Unit.a;
                }
                List list20 = list;
                int a4 = tah.a(v75.o(list20, 10));
                if (a4 < 16) {
                    a4 = 16;
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(a4);
                for (Object obj2 : list20) {
                    linkedHashMap7.put(((n0g) obj2).b, obj2);
                }
                Collection values = linkedHashMap7.values();
                linkedHashMap = new LinkedHashMap();
                for (Object obj3 : values) {
                    q0g q0gVar = ((n0g) obj3).a;
                    Object obj4 = linkedHashMap.get(q0gVar);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(q0gVar, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                List list21 = (List) linkedHashMap.get(q0g.a);
                if (list21 == null) {
                    list21 = c5b.a;
                }
                List list22 = list21;
                if (list22.isEmpty()) {
                    ac0Var = ac0Var2;
                    list2 = c5b.a;
                    list3 = (List) linkedHashMap.get(q0g.b);
                    if (list3 == null) {
                    }
                    list4 = list3;
                    if (list4.isEmpty()) {
                    }
                } else {
                    ouj.B("send liked artists: ", list21, 4, "PhonotekaSynchronizer", null);
                    List M3 = zsd.M(400, list22);
                    ArrayList arrayList6 = new ArrayList();
                    it = M3.iterator();
                    str2 = str5;
                    collection = arrayList6;
                    linkedHashMap2 = linkedHashMap;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        kpkVar = new kpk(this, cg6Var);
        Object obj5 = kpkVar.u;
        nm6 nm6Var2 = nm6.a;
        i = kpkVar.w;
        ac0 ac0Var22 = this.a;
        jac jacVar2 = this.b;
        if (i != 0) {
        }
        list = (List) obj5;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01ad, code lost:
    
        if (r1 == r3) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [byr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [byr] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00dc -> B:14:0x0283). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x027c -> B:13:0x0282). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var, String str, List list) {
        lpk lpkVar;
        int i;
        Iterator it;
        int i2;
        String str2;
        int i3;
        jac jacVar;
        int i4;
        int i5;
        Iterator it2;
        String str3;
        Parcelable parcelable;
        int i6;
        cvl cvlVar;
        int i7;
        Parcelable parcelable2;
        ac0 ac0Var;
        boolean z;
        zxr zxrVar;
        rtl b;
        long j;
        IOException iOException;
        char c;
        lpk lpkVar2;
        String str4;
        String str5;
        Parcelable parcelable3;
        zxr zxrVar2;
        int i8;
        String str6;
        cvl cvlVar2;
        ?? r11;
        int i9;
        int i10;
        rj6 rj6Var;
        if (cg6Var instanceof lpk) {
            lpkVar = (lpk) cg6Var;
            int i11 = lpkVar.t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lpkVar.t = i11 - Integer.MIN_VALUE;
                Object obj = lpkVar.r;
                nm6 nm6Var = nm6.a;
                i = lpkVar.t;
                jac jacVar2 = this.b;
                char c2 = 4;
                IOException iOException2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        ssg.a(4, "PhonotekaSynchronizer", "uploadChangedMetaPlaylists(): nothing to send", null);
                        return Unit.a;
                    }
                    List list2 = list;
                    ssg.a(4, "PhonotekaSynchronizer", "DEBUG: change meta playlists: ".concat(CollectionsKt.X(list2, null, "[", "]", new qnk(20), 25)), null);
                    it = list2.iterator();
                    i2 = 0;
                    str2 = str;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    i8 = lpkVar.q;
                    i10 = lpkVar.p;
                    i9 = lpkVar.o;
                    i2 = lpkVar.n;
                    r11 = lpkVar.m;
                    cvlVar2 = lpkVar.l;
                    it = lpkVar.k;
                    str6 = lpkVar.j;
                    qgg.h0(obj);
                    rj6Var = (rj6) obj;
                    if (rj6Var instanceof pj6) {
                    }
                    if (zxrVar2.d) {
                    }
                } else {
                    if (i == 2) {
                        int i12 = lpkVar.q;
                        i5 = lpkVar.p;
                        i4 = lpkVar.o;
                        i6 = lpkVar.n;
                        Parcelable parcelable4 = lpkVar.m;
                        cvlVar = lpkVar.l;
                        it2 = lpkVar.k;
                        str3 = lpkVar.j;
                        qgg.h0(obj);
                        i3 = i12;
                        jacVar = jacVar2;
                        parcelable3 = parcelable4;
                        rj6 rj6Var2 = (rj6) obj;
                        parcelable = parcelable3;
                        if (rj6Var2 instanceof pj6) {
                            IOException a = ((pj6) rj6Var2).a();
                            if (a != null) {
                                ssg.a(5, "PhonotekaSynchronizer", "Failed to update description for playlist: " + cvlVar.g(), a);
                            } else {
                                ssg.a(5, "PhonotekaSynchronizer", "Failed to update description for playlist: " + cvlVar.g(), null);
                            }
                            i7 = 0;
                            parcelable2 = parcelable3;
                            ac0Var = this.a;
                            if (i5 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (r4) {
                            }
                            if (z) {
                            }
                            zxrVar = new zxr(r4);
                            b = ac0Var.b();
                            j = cvlVar.k;
                            lpkVar.j = str3;
                            lpkVar.k = it2;
                            iOException = null;
                            lpkVar.l = null;
                            lpkVar.m = null;
                            lpkVar.n = i6;
                            lpkVar.o = i4;
                            lpkVar.p = i5;
                            lpkVar.q = i7;
                            c = 4;
                            lpkVar.t = 4;
                            lpkVar2 = lpkVar;
                            str4 = str3;
                            if (b.n(str4, j, zxrVar, lpkVar2) != nm6Var) {
                            }
                            return nm6Var;
                        }
                        i7 = i3;
                        parcelable2 = parcelable;
                        ac0Var = this.a;
                        if (i5 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (r4) {
                        }
                        if (z) {
                        }
                        zxrVar = new zxr(r4);
                        b = ac0Var.b();
                        j = cvlVar.k;
                        lpkVar.j = str3;
                        lpkVar.k = it2;
                        iOException = null;
                        lpkVar.l = null;
                        lpkVar.m = null;
                        lpkVar.n = i6;
                        lpkVar.o = i4;
                        lpkVar.p = i5;
                        lpkVar.q = i7;
                        c = 4;
                        lpkVar.t = 4;
                        lpkVar2 = lpkVar;
                        str4 = str3;
                        if (b.n(str4, j, zxrVar, lpkVar2) != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i == 3) {
                        int i13 = lpkVar.n;
                        it = lpkVar.k;
                        str5 = lpkVar.j;
                        qgg.h0(obj);
                        jacVar = jacVar2;
                        i2 = i13;
                        c = 4;
                        iOException = null;
                        c2 = c;
                        iOException2 = iOException;
                        str2 = str5;
                        jacVar2 = jacVar;
                        if (!it.hasNext()) {
                        }
                    } else {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i14 = lpkVar.n;
                        it = lpkVar.k;
                        str5 = lpkVar.j;
                        qgg.h0(obj);
                        jacVar = jacVar2;
                        c = 4;
                        iOException = null;
                        i2 = i14;
                        c2 = c;
                        iOException2 = iOException;
                        str2 = str5;
                        jacVar2 = jacVar;
                        if (!it.hasNext()) {
                            cvlVar2 = (cvl) it.next();
                            r11 = cvlVar2.l;
                            if (!(r11 instanceof zxr)) {
                                y9w.V(iOException2, new iik(3, cvlVar2, r11));
                                str5 = str2;
                                jacVar = jacVar2;
                                c = c2;
                                iOException = iOException2;
                                c2 = c;
                                iOException2 = iOException;
                                str2 = str5;
                                jacVar2 = jacVar;
                                if (!it.hasNext()) {
                                }
                            } else {
                                if (((zxr) r11).c) {
                                    cut j2 = jacVar2.j();
                                    String str7 = cvlVar2.c.a;
                                    String str8 = cvlVar2.a;
                                    String str9 = cvlVar2.b;
                                    lpkVar.j = str2;
                                    lpkVar.k = it;
                                    lpkVar.l = cvlVar2;
                                    lpkVar.m = r11;
                                    lpkVar.n = i2;
                                    lpkVar.o = 0;
                                    lpkVar.p = 1;
                                    lpkVar.q = 1;
                                    lpkVar.t = 1;
                                    Object m = j2.m(str7, str8, str9, lpkVar);
                                    if (m != nm6Var) {
                                        str6 = str2;
                                        obj = m;
                                        i8 = 1;
                                        i10 = 1;
                                        i9 = 0;
                                        rj6Var = (rj6) obj;
                                        if (rj6Var instanceof pj6) {
                                            IOException a2 = ((pj6) rj6Var).a();
                                            if (a2 != null) {
                                                ssg.a(5, "PhonotekaSynchronizer", "Failed to update title for playlist: " + cvlVar2.g(), a2);
                                            } else {
                                                ssg.a(5, "PhonotekaSynchronizer", "Failed to update title for playlist: " + cvlVar2.g(), null);
                                            }
                                            String str10 = str6;
                                            i4 = i9;
                                            i6 = i2;
                                            zxrVar2 = r11;
                                            str3 = str10;
                                            cvlVar = cvlVar2;
                                            it2 = it;
                                            i5 = 0;
                                        } else {
                                            Iterator it3 = it;
                                            i5 = i10;
                                            cvlVar = cvlVar2;
                                            it2 = it3;
                                            String str11 = str6;
                                            i4 = i9;
                                            i6 = i2;
                                            zxrVar2 = r11;
                                            str3 = str11;
                                        }
                                        if (zxrVar2.d) {
                                            cut j3 = jacVar2.j();
                                            String str12 = cvlVar.c.a;
                                            String str13 = cvlVar.a;
                                            jacVar = jacVar2;
                                            String str14 = cvlVar.q;
                                            if (str14 == null) {
                                                str14 = "";
                                            }
                                            lpkVar.j = str3;
                                            lpkVar.k = it2;
                                            lpkVar.l = cvlVar;
                                            lpkVar.m = zxrVar2;
                                            lpkVar.n = i6;
                                            lpkVar.o = i4;
                                            lpkVar.p = i5;
                                            lpkVar.q = i8;
                                            i3 = i8;
                                            lpkVar.t = 2;
                                            obj = j3.o(str12, str13, str14, lpkVar);
                                            parcelable3 = zxrVar2;
                                        } else {
                                            i3 = i8;
                                            jacVar = jacVar2;
                                            parcelable = zxrVar2;
                                            i7 = i3;
                                            parcelable2 = parcelable;
                                            ac0Var = this.a;
                                            if (i5 != 0 || i7 == 0) {
                                                boolean z2 = i5 != 0 && ((zxr) parcelable2).c;
                                                z = i7 != 0 && ((zxr) parcelable2).d;
                                                int i15 = z2 ? 19 : 3;
                                                if (z) {
                                                    i15 |= 32;
                                                }
                                                zxrVar = new zxr(i15);
                                                b = ac0Var.b();
                                                j = cvlVar.k;
                                                lpkVar.j = str3;
                                                lpkVar.k = it2;
                                                iOException = null;
                                                lpkVar.l = null;
                                                lpkVar.m = null;
                                                lpkVar.n = i6;
                                                lpkVar.o = i4;
                                                lpkVar.p = i5;
                                                lpkVar.q = i7;
                                                c = 4;
                                                lpkVar.t = 4;
                                                lpkVar2 = lpkVar;
                                                str4 = str3;
                                                if (b.n(str4, j, zxrVar, lpkVar2) != nm6Var) {
                                                    i14 = i6;
                                                    it = it2;
                                                    str5 = str4;
                                                    lpkVar = lpkVar2;
                                                    i2 = i14;
                                                    c2 = c;
                                                    iOException2 = iOException;
                                                    str2 = str5;
                                                    jacVar2 = jacVar;
                                                    if (!it.hasNext()) {
                                                        return Unit.a;
                                                    }
                                                }
                                            } else {
                                                rtl b2 = ac0Var.b();
                                                long j4 = cvlVar.k;
                                                lpkVar.j = str3;
                                                lpkVar.k = it2;
                                                lpkVar.l = null;
                                                lpkVar.m = null;
                                                lpkVar.n = i6;
                                                lpkVar.o = i4;
                                                lpkVar.p = i5;
                                                lpkVar.q = i7;
                                                lpkVar.t = 3;
                                                if (b2.n(str3, j4, ayr.b, lpkVar) != nm6Var) {
                                                    str5 = str3;
                                                    it = it2;
                                                    i2 = i6;
                                                    c = 4;
                                                    iOException = null;
                                                    c2 = c;
                                                    iOException2 = iOException;
                                                    str2 = str5;
                                                    jacVar2 = jacVar;
                                                    if (!it.hasNext()) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return nm6Var;
                                }
                                i6 = i2;
                                zxrVar2 = r11;
                                cvlVar = cvlVar2;
                                it2 = it;
                                i8 = 1;
                                i5 = 1;
                                i4 = 0;
                                str3 = str2;
                                if (zxrVar2.d) {
                                }
                            }
                        }
                    }
                }
            }
        }
        lpkVar = new lpk(this, cg6Var);
        Object obj2 = lpkVar.r;
        nm6 nm6Var2 = nm6.a;
        i = lpkVar.t;
        jac jacVar22 = this.b;
        char c22 = 4;
        IOException iOException22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x011f -> B:11:0x0121). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var, String str, List list) {
        mpk mpkVar;
        int i;
        mpk mpkVar2;
        int i2;
        Iterator it;
        String str2;
        String str3;
        Iterator it2;
        cvl cvlVar;
        int i3;
        rj6 rj6Var;
        if (cg6Var instanceof mpk) {
            mpkVar = (mpk) cg6Var;
            int i4 = mpkVar.q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mpkVar.q = i4 - Integer.MIN_VALUE;
                Object obj = mpkVar.o;
                nm6 nm6Var = nm6.a;
                i = mpkVar.q;
                int i5 = 1;
                String str4 = "PhonotekaSynchronizer";
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        ssg.a(4, "PhonotekaSynchronizer", "uploadCreatedPlaylists(): nothing to send", null);
                        return Unit.a;
                    }
                    List list2 = list;
                    ssg.a(4, "PhonotekaSynchronizer", "create new playlists: ".concat(CollectionsKt.X(list2, null, "[", "]", new qnk(21), 25)), null);
                    mpkVar2 = mpkVar;
                    i2 = 0;
                    it = list2.iterator();
                    str2 = str;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i6 = mpkVar.n;
                    int i7 = mpkVar.m;
                    cvlVar = mpkVar.l;
                    it2 = mpkVar.k;
                    str3 = mpkVar.j;
                    qgg.h0(obj);
                    i3 = i6;
                    i2 = i7;
                    rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = mpkVar.m;
                    Iterator it3 = mpkVar.k;
                    String str5 = mpkVar.j;
                    qgg.h0(obj);
                    String str6 = "PhonotekaSynchronizer";
                    mpkVar2 = mpkVar;
                    it = it3;
                    str2 = str5;
                    String str7 = str6;
                    str4 = str7;
                    i5 = 1;
                    if (!it.hasNext()) {
                        cvl cvlVar2 = (cvl) it.next();
                        cut j = this.b.j();
                        String str8 = cvlVar2.c.a;
                        String str9 = cvlVar2.b;
                        String str10 = cvlVar2.r;
                        String str11 = cvlVar2.q;
                        mpkVar2.j = str2;
                        mpkVar2.k = it;
                        mpkVar2.l = cvlVar2;
                        mpkVar2.m = i2;
                        mpkVar2.n = 0;
                        mpkVar2.q = i5;
                        Object b = j.b(str8, str9, str10, str11, mpkVar2);
                        if (b != nm6Var) {
                            str3 = str2;
                            it2 = it;
                            obj = b;
                            mpkVar = mpkVar2;
                            cvlVar = cvlVar2;
                            i3 = 0;
                            rj6Var = (rj6) obj;
                            if (rj6Var instanceof qj6) {
                                String str12 = str4;
                                if (!(rj6Var instanceof pj6)) {
                                    b6e.s();
                                    return null;
                                }
                                IOException a = ((pj6) rj6Var).a();
                                if (a != null) {
                                    str7 = str12;
                                    ssg.a(5, str7, dfi.d(cvlVar.k, "create new playlists error: nativeId="), a);
                                    mpkVar2 = mpkVar;
                                    it = it2;
                                    str2 = str3;
                                } else {
                                    str7 = str12;
                                    ssg.a(5, str7, dfi.d(cvlVar.k, "create new playlists error: nativeId="), null);
                                    mpkVar2 = mpkVar;
                                    it = it2;
                                    str2 = str3;
                                }
                                str4 = str7;
                                i5 = 1;
                                if (!it.hasNext()) {
                                }
                            } else {
                                str6 = str4;
                                cvl a2 = cvl.a((cvl) ((qj6) rj6Var).a, null, null, 0, 0, cvlVar.k, null, null, null, null, null, null, null, null, null, null, 134216703);
                                xtl c = this.a.c();
                                mpkVar.j = str3;
                                mpkVar.k = it2;
                                mpkVar.l = null;
                                mpkVar.m = i2;
                                mpkVar.n = i3;
                                mpkVar.q = 2;
                                if (c.d(str3, a2, cvlVar, mpkVar) != nm6Var) {
                                    it3 = it2;
                                    str5 = str3;
                                    mpkVar2 = mpkVar;
                                    it = it3;
                                    str2 = str5;
                                    String str72 = str6;
                                    str4 = str72;
                                    i5 = 1;
                                    if (!it.hasNext()) {
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        mpkVar = new mpk(this, cg6Var);
        Object obj2 = mpkVar.o;
        nm6 nm6Var2 = nm6.a;
        i = mpkVar.q;
        int i52 = 1;
        String str42 = "PhonotekaSynchronizer";
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d3, code lost:
    
        if (r2.a(r1, r7, r4) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        if (r1.a(r14, r5, r2) == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0170 -> B:13:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x017c -> B:13:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0190 -> B:13:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01ab -> B:13:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01bf -> B:13:0x0173). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var, String str, List list) {
        npk npkVar;
        int i;
        npk npkVar2;
        int i2;
        Iterator it;
        String str2;
        String str3;
        Iterator it2;
        cvl cvlVar;
        int i3;
        int i4;
        rj6 rj6Var;
        char c;
        int i5;
        if (cg6Var instanceof npk) {
            npkVar = (npk) cg6Var;
            int i6 = npkVar.q;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                npkVar.q = i6 - Integer.MIN_VALUE;
                Object obj = npkVar.o;
                nm6 nm6Var = nm6.a;
                i = npkVar.q;
                int i7 = 0;
                int i8 = 2;
                ac0 ac0Var = this.a;
                int i9 = 1;
                char c2 = 4;
                if (i != 0) {
                    qgg.h0(obj);
                    if (list.isEmpty()) {
                        ssg.a(4, "PhonotekaSynchronizer", "uploadDeletedPlaylists(): nothing to send", null);
                        return Unit.a;
                    }
                    List list2 = list;
                    ssg.a(4, "PhonotekaSynchronizer", "delete playlists: ".concat(CollectionsKt.X(list2, null, "[", "]", new qnk(22), 25)), null);
                    npkVar2 = npkVar;
                    i2 = 0;
                    it = list2.iterator();
                    str2 = str;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i == 2) {
                        int i10 = npkVar.n;
                        int i11 = npkVar.m;
                        cvl cvlVar2 = npkVar.l;
                        Iterator it3 = npkVar.k;
                        String str4 = npkVar.j;
                        qgg.h0(obj);
                        cvlVar = cvlVar2;
                        str3 = str4;
                        i3 = i10;
                        i4 = i11;
                        it2 = it3;
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof qj6) {
                        }
                        return nm6Var;
                    }
                    if (i == 3) {
                        int i12 = npkVar.m;
                        it2 = npkVar.k;
                        str3 = npkVar.j;
                        qgg.h0(obj);
                        i5 = i12;
                        c = 4;
                        str2 = str3;
                        npkVar2 = npkVar;
                        it = it2;
                        c2 = c;
                        i8 = 2;
                        i9 = 1;
                        i2 = i5;
                        i7 = 0;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = npkVar.m;
                        it2 = npkVar.k;
                        str3 = npkVar.j;
                        qgg.h0(obj);
                        c = 4;
                        i5 = i4;
                        str2 = str3;
                        npkVar2 = npkVar;
                        it = it2;
                        c2 = c;
                        i8 = 2;
                        i9 = 1;
                        i2 = i5;
                        i7 = 0;
                        if (it.hasNext()) {
                            cvl cvlVar3 = (cvl) it.next();
                            if (cvlVar3.h()) {
                                cut j = this.b.j();
                                String str5 = cvlVar3.c.a;
                                String str6 = cvlVar3.a;
                                npkVar2.j = str2;
                                npkVar2.k = it;
                                npkVar2.l = cvlVar3;
                                npkVar2.m = i2;
                                npkVar2.n = i7;
                                npkVar2.q = i8;
                                Object d = j.d(str5, str6, npkVar2);
                                if (d != nm6Var) {
                                    str3 = str2;
                                    obj = d;
                                    cvlVar = cvlVar3;
                                    it2 = it;
                                    npkVar = npkVar2;
                                    i4 = i2;
                                    i3 = i7;
                                    rj6Var = (rj6) obj;
                                    if (rj6Var instanceof qj6) {
                                        xtl c3 = ac0Var.c();
                                        nvl g = cvlVar.g();
                                        npkVar.j = str3;
                                        npkVar.k = it2;
                                        npkVar.l = null;
                                        npkVar.m = i4;
                                        npkVar.n = i3;
                                        npkVar.q = 3;
                                        if (c3.a(str3, g, npkVar) != nm6Var) {
                                            i5 = i4;
                                            c = c2;
                                            str2 = str3;
                                            npkVar2 = npkVar;
                                            it = it2;
                                            c2 = c;
                                            i8 = 2;
                                            i9 = 1;
                                            i2 = i5;
                                            i7 = 0;
                                            if (it.hasNext()) {
                                            }
                                        }
                                    } else {
                                        if (!(rj6Var instanceof pj6)) {
                                            b6e.s();
                                            return null;
                                        }
                                        pj6 pj6Var = (pj6) rj6Var;
                                        if (pj6Var instanceof mj6) {
                                            mj6 mj6Var = (mj6) rj6Var;
                                            if (mj6Var.a == 404) {
                                                ssg.a(5, "PhonotekaSynchronizer", "delete already deleted playlist: " + cvlVar.g(), null);
                                                xtl c4 = ac0Var.c();
                                                nvl g2 = cvlVar.g();
                                                npkVar.j = str3;
                                                npkVar.k = it2;
                                                npkVar.l = null;
                                                npkVar.m = i4;
                                                npkVar.n = i3;
                                                c = 4;
                                                npkVar.q = 4;
                                            } else {
                                                c = 4;
                                                IOException a = mj6Var.a();
                                                if (a != null) {
                                                    ssg.a(5, "PhonotekaSynchronizer", "delete playlist error: " + cvlVar.g(), a);
                                                } else {
                                                    ssg.a(5, "PhonotekaSynchronizer", "delete playlist error: " + cvlVar.g(), null);
                                                }
                                            }
                                        } else {
                                            c = 4;
                                            IOException a2 = pj6Var.a();
                                            if (a2 != null) {
                                                ssg.a(5, "PhonotekaSynchronizer", "delete playlist error: " + cvlVar.g(), a2);
                                            } else {
                                                ssg.a(5, "PhonotekaSynchronizer", "delete playlist error: " + cvlVar.g(), null);
                                            }
                                        }
                                        i5 = i4;
                                        str2 = str3;
                                        npkVar2 = npkVar;
                                        it = it2;
                                        c2 = c;
                                        i8 = 2;
                                        i9 = 1;
                                        i2 = i5;
                                        i7 = 0;
                                        if (it.hasNext()) {
                                            return Unit.a;
                                        }
                                    }
                                }
                            } else {
                                xtl c5 = ac0Var.c();
                                nvl g3 = cvlVar3.g();
                                npkVar2.j = null;
                                npkVar2.k = null;
                                npkVar2.l = null;
                                npkVar2.m = i2;
                                npkVar2.n = i7;
                                npkVar2.q = i9;
                            }
                            return nm6Var;
                        }
                    }
                }
            }
        }
        npkVar = new npk(this, cg6Var);
        Object obj2 = npkVar.o;
        nm6 nm6Var2 = nm6.a;
        i = npkVar.q;
        int i72 = 0;
        int i82 = 2;
        ac0 ac0Var2 = this.a;
        int i92 = 1;
        char c22 = 4;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, cg6 cg6Var) {
        opk opkVar;
        String str2;
        Iterator it;
        if (cg6Var instanceof opk) {
            opkVar = (opk) cg6Var;
            int i = opkVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                opkVar.n = i - Integer.MIN_VALUE;
                Object obj = opkVar.l;
                Object obj2 = nm6.a;
                switch (opkVar.n) {
                    case 0:
                        qgg.h0(obj);
                        str2 = str;
                        it = this.c.iterator();
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        it = opkVar.k;
                        String str3 = opkVar.j;
                        qgg.h0(obj);
                        str2 = str3;
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                while (it.hasNext()) {
                    n43 n43Var = (n43) it.next();
                    if (Intrinsics.d(n43Var, j43.a)) {
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 1;
                        if (m(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    } else if (Intrinsics.d(n43Var, g43.a)) {
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 2;
                        if (c(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    } else if (Intrinsics.d(n43Var, h43.a)) {
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 3;
                        if (d(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    } else if (Intrinsics.d(n43Var, i43.a)) {
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 4;
                        if (k(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    } else if (Intrinsics.d(n43Var, l43.a)) {
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 5;
                        if (i(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    } else if (Intrinsics.d(n43Var, m43.a)) {
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 6;
                        if (l(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    } else if (Intrinsics.d(n43Var, f43.a)) {
                        continue;
                    } else {
                        if (!Intrinsics.d(n43Var, k43.a)) {
                            b6e.s();
                            return null;
                        }
                        opkVar.j = str2;
                        opkVar.k = it;
                        opkVar.n = 7;
                        if (n(str2, opkVar) == obj2) {
                            return obj2;
                        }
                    }
                }
                return Unit.a;
            }
        }
        opkVar = new opk(this, cg6Var);
        Object obj3 = opkVar.l;
        Object obj22 = nm6.a;
        switch (opkVar.n) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x015b, code lost:
    
        if (j(r13, r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014e, code lost:
    
        if (e(r0, r13, r14) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
    
        if (g(r0, r2, r14) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007a, code lost:
    
        if (r14 == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, cg6 cg6Var) {
        ppk ppkVar;
        Object obj;
        int i;
        List list;
        String str2;
        Map map;
        List list2;
        String str3;
        if (cg6Var instanceof ppk) {
            ppkVar = (ppk) cg6Var;
            int i2 = ppkVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppkVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = ppkVar.l;
                obj = nm6.a;
                i = ppkVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    rtl b = this.a.b();
                    ppkVar.j = str;
                    ppkVar.n = 1;
                    obj2 = b.g(str, Integer.MAX_VALUE, ppkVar);
                } else if (i == 1) {
                    str = ppkVar.j;
                    qgg.h0(obj2);
                } else if (i == 2) {
                    map = ppkVar.k;
                    str2 = ppkVar.j;
                    qgg.h0(obj2);
                    list2 = (List) map.get(new Integer(2));
                    if (list2 == null) {
                        list2 = c5b.a;
                    }
                    ppkVar.j = str2;
                    ppkVar.k = map;
                    ppkVar.n = 3;
                } else if (i == 3) {
                    map = ppkVar.k;
                    str2 = ppkVar.j;
                    qgg.h0(obj2);
                    Map map2 = map;
                    str3 = str2;
                    List list3 = (List) map2.get(new Integer(3));
                    if (list3 == null) {
                        list3 = c5b.a;
                    }
                    ppkVar.j = str3;
                    ppkVar.k = null;
                    ppkVar.n = 4;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map3 = ppkVar.k;
                        qgg.h0(obj2);
                        return Unit.a;
                    }
                    Map map4 = ppkVar.k;
                    str3 = ppkVar.j;
                    qgg.h0(obj2);
                    ppkVar.j = null;
                    ppkVar.k = null;
                    ppkVar.n = 5;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : (Iterable) obj2) {
                    byr byrVar = ((cvl) obj3).l;
                    Integer num = byrVar instanceof wxr ? new Integer(1) : byrVar instanceof xxr ? new Integer(2) : byrVar instanceof zxr ? new Integer(3) : null;
                    Object obj4 = linkedHashMap.get(num);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(num, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (((Integer) entry.getKey()) != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                list = (List) linkedHashMap2.get(new Integer(1));
                if (list == null) {
                    list = c5b.a;
                }
                ppkVar.j = str;
                ppkVar.k = linkedHashMap2;
                ppkVar.n = 2;
                if (f(ppkVar, str, list) != obj) {
                    str2 = str;
                    map = linkedHashMap2;
                    list2 = (List) map.get(new Integer(2));
                    if (list2 == null) {
                    }
                    ppkVar.j = str2;
                    ppkVar.k = map;
                    ppkVar.n = 3;
                }
                return obj;
            }
        }
        ppkVar = new ppk(this, cg6Var);
        Object obj22 = ppkVar.l;
        obj = nm6.a;
        i = ppkVar.n;
        if (i != 0) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        while (r14.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        while (r2.hasNext()) {
        }
        list = (List) linkedHashMap22.get(new Integer(1));
        if (list == null) {
        }
        ppkVar.j = str;
        ppkVar.k = linkedHashMap22;
        ppkVar.n = 2;
        if (f(ppkVar, str, list) != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x00df, code lost:
    
        if (r2 == r4) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0461 -> B:19:0x046e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x03d7 -> B:14:0x03de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, cg6 cg6Var) {
        qpk qpkVar;
        int i;
        Throwable th;
        List list;
        Serializable g;
        String str2;
        List list2;
        tqn tqnVar;
        Iterator it;
        int i2;
        String str3;
        String str4;
        String str5;
        ac0 ac0Var;
        String str6;
        tqn tqnVar2;
        List list3;
        Iterator it2;
        cvl cvlVar;
        List list4;
        qpk qpkVar2;
        int i3;
        Object obj;
        int i4;
        rj6 rj6Var;
        String str7;
        String str8;
        List list5;
        Object obj2;
        String str9;
        String str10;
        String str11;
        int i5;
        String str12;
        vpk vpkVar = this;
        String str13 = str;
        if (cg6Var instanceof qpk) {
            qpkVar = (qpk) cg6Var;
            int i6 = qpkVar.t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                qpkVar.t = i6 - Integer.MIN_VALUE;
                Object obj3 = qpkVar.r;
                nm6 nm6Var = nm6.a;
                i = qpkVar.t;
                String str14 = "uploadOwnPlaylistsTrackChanges(): nothing to send";
                int i7 = 2;
                String str15 = "send playlist track operations error: ";
                ac0 ac0Var2 = vpkVar.a;
                String str16 = "PhonotekaSynchronizer";
                boolean z = false;
                if (i != 0) {
                    th = null;
                    qgg.h0(obj3);
                    uys e = ac0Var2.e();
                    qpkVar.j = str13;
                    qpkVar.t = 1;
                    obj3 = e.d(str13, qpkVar);
                } else if (i == 1) {
                    th = null;
                    str13 = qpkVar.j;
                    qgg.h0(obj3);
                } else if (i == 2) {
                    list2 = qpkVar.k;
                    str2 = qpkVar.j;
                    qgg.h0(obj3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : (Iterable) obj3) {
                        byr[] byrVarArr = new byr[i7];
                        byrVarArr[0] = wxr.b;
                        byrVarArr[1] = xxr.b;
                        if (!xz0.Y(byrVarArr).contains(((cvl) obj4).l)) {
                            arrayList.add(obj4);
                        }
                        i7 = 2;
                    }
                    tqnVar = new tqn();
                    tqnVar.a = true;
                    it = arrayList.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else if (i == 3) {
                    int i8 = qpkVar.q;
                    i3 = qpkVar.p;
                    list4 = (List) qpkVar.o;
                    cvlVar = qpkVar.n;
                    Iterator it3 = qpkVar.m;
                    tqnVar2 = qpkVar.l;
                    List list6 = qpkVar.k;
                    str6 = qpkVar.j;
                    qgg.h0(obj3);
                    str5 = "uploadOwnPlaylistsTrackChanges(): nothing to send";
                    str3 = "send playlist track operations error: ";
                    it2 = it3;
                    ac0Var = ac0Var2;
                    str4 = "PhonotekaSynchronizer";
                    list3 = list6;
                    qpkVar2 = qpkVar;
                    obj = obj3;
                    i4 = i8;
                    rj6Var = (rj6) obj;
                    if (rj6Var instanceof qj6) {
                    }
                    vpkVar = this;
                    str16 = str7;
                    qpkVar = qpkVar2;
                    list2 = list5;
                    str15 = str8;
                    ac0Var2 = ac0Var;
                    str14 = str5;
                    z = false;
                    if (it.hasNext()) {
                    }
                } else if (i == 4) {
                    int i9 = qpkVar.p;
                    Iterator it4 = qpkVar.m;
                    tqn tqnVar3 = qpkVar.l;
                    List list7 = qpkVar.k;
                    String str17 = qpkVar.j;
                    qgg.h0(obj3);
                    str5 = "uploadOwnPlaylistsTrackChanges(): nothing to send";
                    ac0Var = ac0Var2;
                    qpkVar2 = qpkVar;
                    it2 = it4;
                    tqnVar2 = tqnVar3;
                    str6 = str17;
                    str8 = "send playlist track operations error: ";
                    list5 = list7;
                    i2 = i9;
                    str7 = "PhonotekaSynchronizer";
                    it = it2;
                    tqnVar = tqnVar2;
                    str2 = str6;
                    vpkVar = this;
                    str16 = str7;
                    qpkVar = qpkVar2;
                    list2 = list5;
                    str15 = str8;
                    ac0Var2 = ac0Var;
                    str14 = str5;
                    z = false;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i10 = qpkVar.p;
                    rj6 rj6Var2 = (rj6) qpkVar.o;
                    cvlVar = qpkVar.n;
                    Iterator it5 = qpkVar.m;
                    tqn tqnVar4 = qpkVar.l;
                    list5 = qpkVar.k;
                    String str18 = qpkVar.j;
                    qgg.h0(obj3);
                    str6 = str18;
                    str5 = "uploadOwnPlaylistsTrackChanges(): nothing to send";
                    str3 = "send playlist track operations error: ";
                    ac0Var = ac0Var2;
                    str4 = "PhonotekaSynchronizer";
                    IOException a = ((mj6) rj6Var2).a();
                    if (a == null) {
                        str8 = str3;
                        str12 = str4;
                        ssg.a(5, str12, str8 + cvlVar.g(), a);
                    } else {
                        str12 = str4;
                        str8 = str3;
                        ssg.a(5, str12, str8 + cvlVar.g(), null);
                    }
                    i2 = i10;
                    qpkVar2 = qpkVar;
                    str7 = str12;
                    it2 = it5;
                    tqnVar2 = tqnVar4;
                    it = it2;
                    tqnVar = tqnVar2;
                    str2 = str6;
                    vpkVar = this;
                    str16 = str7;
                    qpkVar = qpkVar2;
                    list2 = list5;
                    str15 = str8;
                    ac0Var2 = ac0Var;
                    str14 = str5;
                    z = false;
                    if (it.hasNext()) {
                        cvl cvlVar2 = (cvl) it.next();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            Object next = it6.next();
                            List list8 = list2;
                            ac0 ac0Var3 = ac0Var2;
                            Iterator it7 = it6;
                            if (((iys) next).d == cvlVar2.k) {
                                arrayList2.add(next);
                            }
                            list2 = list8;
                            it6 = it7;
                            ac0Var2 = ac0Var3;
                        }
                        List list9 = list2;
                        ac0Var = ac0Var2;
                        if (!arrayList2.isEmpty()) {
                            tqnVar.a = z;
                            ssg.a(4, str16, "send playlist track operations: " + cvlVar2.g() + StringUtil.SPACE + arrayList2, null);
                            cut j = vpkVar.b.j();
                            String str19 = cvlVar2.c.a;
                            String str20 = cvlVar2.a;
                            int i11 = cvlVar2.e;
                            int i12 = 0;
                            JSONArray jSONArray = new JSONArray();
                            while (i12 < arrayList2.size()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONArray.put(jSONObject);
                                String str21 = str20;
                                kys kysVar = ((iys) arrayList2.get(i12)).c;
                                int i13 = i11;
                                int ordinal = kysVar.ordinal();
                                JSONArray jSONArray2 = jSONArray;
                                if (ordinal == 0) {
                                    obj2 = "insert";
                                } else {
                                    if (ordinal != 1) {
                                        b6e.s();
                                        return null;
                                    }
                                    obj2 = "delete";
                                }
                                jSONObject.put("op", obj2);
                                int ordinal2 = kysVar.ordinal();
                                if (ordinal2 == 0) {
                                    jSONObject.put("at", ((iys) arrayList2.get(i12)).e);
                                } else {
                                    if (ordinal2 != 1) {
                                        b6e.s();
                                        return null;
                                    }
                                    jSONObject.put("from", ((iys) arrayList2.get(i12)).e);
                                    jSONObject.put("to", ((iys) arrayList2.get(i12)).e + 1);
                                }
                                JSONArray jSONArray3 = new JSONArray();
                                while (true) {
                                    String str22 = ((iys) arrayList2.get(i12)).b.b;
                                    str9 = str14;
                                    String str23 = ((iys) arrayList2.get(i12)).b.a;
                                    str10 = str16;
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONArray3.put(jSONObject2);
                                    str11 = str15;
                                    jSONObject2.putOpt(ConnectableDevice.KEY_ID, str23);
                                    if (str22 != null && str22.length() != 0 && !CommonUrlParts.Values.FALSE_INTEGER.equals(str22)) {
                                        jSONObject2.put("albumId", str22);
                                    }
                                    i5 = i12 + 1;
                                    kys kysVar2 = kys.INSERT;
                                    if (kysVar != kysVar2 || i5 >= arrayList2.size() || ((iys) arrayList2.get(i5)).c != kysVar2) {
                                        break;
                                    }
                                    if (((iys) arrayList2.get(i5)).e - ((iys) arrayList2.get(i12)).e == 1) {
                                        i12 = i5;
                                        str14 = str9;
                                        str16 = str10;
                                        str15 = str11;
                                    }
                                }
                                jSONObject.put("tracks", jSONArray3);
                                i12 = i5;
                                i11 = i13;
                                str20 = str21;
                                jSONArray = jSONArray2;
                                str14 = str9;
                                str16 = str10;
                                str15 = str11;
                            }
                            str5 = str14;
                            str3 = str15;
                            str4 = str16;
                            String jSONArray4 = jSONArray.toString();
                            jSONArray4.getClass();
                            qpkVar.j = str2;
                            qpkVar.k = list9;
                            qpkVar.l = tqnVar;
                            qpkVar.m = it;
                            qpkVar.n = cvlVar2;
                            qpkVar.o = arrayList2;
                            qpkVar.p = i2;
                            qpkVar.q = 0;
                            qpkVar.t = 3;
                            qpk qpkVar3 = qpkVar;
                            obj = j.a(str19, str20, i11, jSONArray4, qpkVar3);
                            if (obj != nm6Var) {
                                tqnVar2 = tqnVar;
                                it2 = it;
                                list4 = arrayList2;
                                qpkVar2 = qpkVar3;
                                i4 = 0;
                                str6 = str2;
                                i3 = i2;
                                cvlVar = cvlVar2;
                                list3 = list9;
                                rj6Var = (rj6) obj;
                                if (rj6Var instanceof qj6) {
                                    uys e2 = ac0Var.e();
                                    List list10 = list4;
                                    ArrayList arrayList3 = new ArrayList(v75.o(list10, 10));
                                    Iterator it8 = list10.iterator();
                                    while (it8.hasNext()) {
                                        arrayList3.add(new Long(((iys) it8.next()).a));
                                    }
                                    qpkVar2.j = str6;
                                    qpkVar2.k = list3;
                                    qpkVar2.l = tqnVar2;
                                    qpkVar2.m = it2;
                                    qpkVar2.n = null;
                                    qpkVar2.o = null;
                                    qpkVar2.p = i3;
                                    qpkVar2.q = i4;
                                    qpkVar2.t = 4;
                                    if (e2.c(qpkVar2, str6, arrayList3) != nm6Var) {
                                        qpkVar2 = qpkVar2;
                                        it2 = it2;
                                        tqnVar2 = tqnVar2;
                                        str6 = str6;
                                        str8 = str3;
                                        list5 = list3;
                                        i2 = i3;
                                        str7 = str4;
                                        it = it2;
                                        tqnVar = tqnVar2;
                                        str2 = str6;
                                    }
                                } else {
                                    if (!(rj6Var instanceof pj6)) {
                                        b6e.s();
                                        return null;
                                    }
                                    pj6 pj6Var = (pj6) rj6Var;
                                    if (pj6Var instanceof mj6) {
                                        uys e3 = ac0Var.e();
                                        List list11 = list4;
                                        ArrayList arrayList4 = new ArrayList(v75.o(list11, 10));
                                        Iterator it9 = list11.iterator();
                                        while (it9.hasNext()) {
                                            arrayList4.add(new Long(((iys) it9.next()).a));
                                            list3 = list3;
                                        }
                                        List list12 = list3;
                                        qpkVar2.j = str6;
                                        qpkVar2.k = list12;
                                        qpkVar2.l = tqnVar2;
                                        qpkVar2.m = it2;
                                        qpkVar2.n = cvlVar;
                                        qpkVar2.o = rj6Var;
                                        qpkVar2.p = i3;
                                        qpkVar2.q = i4;
                                        qpkVar2.t = 5;
                                        if (e3.c(qpkVar2, str6, arrayList4) != nm6Var) {
                                            list5 = list12;
                                            i10 = i3;
                                            tqnVar4 = tqnVar2;
                                            rj6Var2 = rj6Var;
                                            qpkVar = qpkVar2;
                                            it5 = it2;
                                            IOException a2 = ((mj6) rj6Var2).a();
                                            if (a2 == null) {
                                            }
                                            i2 = i10;
                                            qpkVar2 = qpkVar;
                                            str7 = str12;
                                            it2 = it5;
                                            tqnVar2 = tqnVar4;
                                            it = it2;
                                            tqnVar = tqnVar2;
                                            str2 = str6;
                                        }
                                    } else {
                                        List list13 = list3;
                                        str7 = str4;
                                        str8 = str3;
                                        IOException a3 = pj6Var.a();
                                        if (a3 != null) {
                                            ssg.a(5, str7, str8 + cvlVar.g(), a3);
                                            list5 = list13;
                                            i2 = i3;
                                        } else {
                                            ssg.a(5, str7, str8 + cvlVar.g(), null);
                                            list5 = list13;
                                            i2 = i3;
                                        }
                                        it = it2;
                                        tqnVar = tqnVar2;
                                        str2 = str6;
                                    }
                                }
                                vpkVar = this;
                                str16 = str7;
                                qpkVar = qpkVar2;
                                list2 = list5;
                                str15 = str8;
                                ac0Var2 = ac0Var;
                                str14 = str5;
                                z = false;
                                if (it.hasNext()) {
                                    String str24 = str14;
                                    String str25 = str16;
                                    if (tqnVar.a) {
                                        ssg.a(4, str25, str24, null);
                                    }
                                    return Unit.a;
                                }
                            }
                            return nm6Var;
                        }
                        str5 = str14;
                        str8 = str15;
                        str7 = str16;
                        list5 = list9;
                        qpkVar2 = qpkVar;
                        vpkVar = this;
                        str16 = str7;
                        qpkVar = qpkVar2;
                        list2 = list5;
                        str15 = str8;
                        ac0Var2 = ac0Var;
                        str14 = str5;
                        z = false;
                        if (it.hasNext()) {
                        }
                    }
                }
                list = (List) obj3;
                if (!list.isEmpty()) {
                    ssg.a(4, "PhonotekaSynchronizer", "uploadOwnPlaylistsTrackChanges(): nothing to send", th);
                    return Unit.a;
                }
                rtl b = ac0Var2.b();
                qpkVar.j = str13;
                qpkVar.k = list;
                qpkVar.t = 2;
                g = b.g(str13, Integer.MAX_VALUE, qpkVar);
                if (g != nm6Var) {
                    str2 = str13;
                    list2 = list;
                    obj3 = g;
                    ArrayList arrayList5 = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    tqnVar = new tqn();
                    tqnVar.a = true;
                    it = arrayList5.iterator();
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
                return nm6Var;
            }
        }
        qpkVar = new qpk(vpkVar, cg6Var);
        Object obj32 = qpkVar.r;
        nm6 nm6Var2 = nm6.a;
        i = qpkVar.t;
        String str142 = "uploadOwnPlaylistsTrackChanges(): nothing to send";
        int i72 = 2;
        String str152 = "send playlist track operations error: ";
        ac0 ac0Var22 = vpkVar.a;
        String str162 = "PhonotekaSynchronizer";
        boolean z2 = false;
        if (i != 0) {
        }
        list = (List) obj32;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024f, code lost:
    
        if (r1 == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x028b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0289, code lost:
    
        if (r2.c(r3, r1, r5) != r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a8, code lost:
    
        if (r2 == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b4, code lost:
    
        if (r2 == r4) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x024f -> B:19:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01a8 -> B:33:0x01ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, cg6 cg6Var) {
        rpk rpkVar;
        int i;
        List list;
        LinkedHashMap linkedHashMap;
        jac jacVar;
        List list2;
        Collection arrayList;
        LinkedHashMap linkedHashMap2;
        Iterator it;
        String str2;
        int i2;
        List list3;
        List list4;
        Iterable iterable;
        String str3;
        Iterator it2;
        Collection collection;
        List list5;
        int i3;
        String str4 = str;
        if (cg6Var instanceof rpk) {
            rpkVar = (rpk) cg6Var;
            int i4 = rpkVar.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rpkVar.u = i4 - Integer.MIN_VALUE;
                Object obj = rpkVar.s;
                nm6 nm6Var = nm6.a;
                i = rpkVar.u;
                jac jacVar2 = this.b;
                ac0 ac0Var = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    e1g a = ac0Var.a();
                    rpkVar.j = str4;
                    rpkVar.u = 1;
                    obj = a.g(str4, rpkVar);
                } else if (i == 1) {
                    str4 = rpkVar.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    i2 = rpkVar.r;
                    List list6 = (List) rpkVar.p;
                    it = rpkVar.n;
                    arrayList = rpkVar.m;
                    List list7 = rpkVar.l;
                    Map map = rpkVar.k;
                    str2 = rpkVar.j;
                    qgg.h0(obj);
                    jac jacVar3 = jacVar2;
                    LinkedHashMap linkedHashMap3 = map;
                    z75.t(arrayList, a((rj6) obj, list6, "playlist likes"));
                    jacVar2 = jacVar3;
                    linkedHashMap2 = linkedHashMap3;
                    if (it.hasNext()) {
                        jacVar = jacVar2;
                        list2 = (List) arrayList;
                        str4 = str2;
                        linkedHashMap = linkedHashMap2;
                        list3 = (List) linkedHashMap.get(q0g.b);
                        if (list3 == null) {
                            list3 = c5b.a;
                        }
                        list4 = list3;
                        if (list4.isEmpty()) {
                            ouj.B("send neutral playlists: ", list3, 4, "PhonotekaSynchronizer", null);
                            List M = zsd.M(400, list4);
                            ArrayList arrayList2 = new ArrayList();
                            str3 = str4;
                            it2 = M.iterator();
                            collection = arrayList2;
                            list5 = list2;
                            i3 = 0;
                            if (it2.hasNext()) {
                            }
                        } else {
                            iterable = c5b.a;
                            e1g a2 = ac0Var.a();
                            ArrayList g0 = CollectionsKt.g0(list2, iterable);
                            rpkVar.j = null;
                            rpkVar.k = null;
                            rpkVar.l = null;
                            rpkVar.m = null;
                            rpkVar.n = null;
                            rpkVar.o = null;
                            rpkVar.p = null;
                            rpkVar.q = null;
                            rpkVar.u = 4;
                        }
                    } else {
                        list6 = (List) it.next();
                        f5g h = jacVar2.h();
                        List list8 = list6;
                        jacVar3 = jacVar2;
                        ArrayList arrayList3 = new ArrayList(v75.o(list8, 10));
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(((o0g) it3.next()).b);
                        }
                        rpkVar.j = str2;
                        rpkVar.k = linkedHashMap2;
                        rpkVar.l = null;
                        rpkVar.m = arrayList;
                        rpkVar.n = it;
                        rpkVar.o = null;
                        rpkVar.p = list6;
                        rpkVar.r = i2;
                        rpkVar.u = 2;
                        obj = h.f(rpkVar, str2, arrayList3);
                        linkedHashMap3 = linkedHashMap2;
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list9 = rpkVar.l;
                        Map map2 = rpkVar.k;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    int i5 = rpkVar.r;
                    List list10 = rpkVar.q;
                    it2 = (Iterator) rpkVar.p;
                    collection = rpkVar.o;
                    list5 = rpkVar.l;
                    Map map3 = rpkVar.k;
                    str3 = rpkVar.j;
                    qgg.h0(obj);
                    i3 = i5;
                    Object m = obj;
                    jacVar = jacVar2;
                    z75.t(collection, a((rj6) m, list10, "playlist neutral"));
                    if (it2.hasNext()) {
                        iterable = (List) collection;
                        list2 = list5;
                        str4 = str3;
                        e1g a22 = ac0Var.a();
                        ArrayList g02 = CollectionsKt.g0(list2, iterable);
                        rpkVar.j = null;
                        rpkVar.k = null;
                        rpkVar.l = null;
                        rpkVar.m = null;
                        rpkVar.n = null;
                        rpkVar.o = null;
                        rpkVar.p = null;
                        rpkVar.q = null;
                        rpkVar.u = 4;
                    } else {
                        list10 = (List) it2.next();
                        f5g h2 = jacVar.h();
                        List list11 = list10;
                        ArrayList arrayList4 = new ArrayList(v75.o(list11, 10));
                        Iterator it4 = list11.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((o0g) it4.next()).b);
                        }
                        rpkVar.j = str3;
                        rpkVar.k = null;
                        rpkVar.l = list5;
                        rpkVar.m = null;
                        rpkVar.n = null;
                        rpkVar.o = collection;
                        rpkVar.p = it2;
                        rpkVar.q = list10;
                        rpkVar.r = i3;
                        rpkVar.u = 3;
                        m = h2.m(rpkVar, str3, arrayList4);
                    }
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    ssg.a(4, "PhonotekaSynchronizer", "uploadPlaylistsLikeChanges(): nothing to send", null);
                    return Unit.a;
                }
                List list12 = list;
                int a3 = tah.a(v75.o(list12, 10));
                if (a3 < 16) {
                    a3 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(a3);
                for (Object obj2 : list12) {
                    linkedHashMap4.put(((o0g) obj2).b, obj2);
                }
                Collection values = linkedHashMap4.values();
                linkedHashMap = new LinkedHashMap();
                for (Object obj3 : values) {
                    q0g q0gVar = ((o0g) obj3).a;
                    Object obj4 = linkedHashMap.get(q0gVar);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(q0gVar, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                List list13 = (List) linkedHashMap.get(q0g.a);
                if (list13 == null) {
                    list13 = c5b.a;
                }
                List list14 = list13;
                if (list14.isEmpty()) {
                    jacVar = jacVar2;
                    list2 = c5b.a;
                    list3 = (List) linkedHashMap.get(q0g.b);
                    if (list3 == null) {
                    }
                    list4 = list3;
                    if (list4.isEmpty()) {
                    }
                } else {
                    ouj.B("send liked playlists: ", list13, 4, "PhonotekaSynchronizer", null);
                    List M2 = zsd.M(400, list14);
                    arrayList = new ArrayList();
                    linkedHashMap2 = linkedHashMap;
                    it = M2.iterator();
                    str2 = str4;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        rpkVar = new rpk(this, cg6Var);
        Object obj5 = rpkVar.s;
        nm6 nm6Var2 = nm6.a;
        i = rpkVar.u;
        jac jacVar22 = this.b;
        ac0 ac0Var2 = this.a;
        if (i != 0) {
        }
        list = (List) obj5;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a7, code lost:
    
        if (r8.b(r9, r15, r0, r5) == r6) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009c, code lost:
    
        if (r2 == r6) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [pj6, qkm] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Throwable, pj6] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01a7 -> B:14:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0203 -> B:19:0x0204). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, cg6 cg6Var) {
        spk spkVar;
        int i;
        List list;
        String str2;
        Iterator it;
        int i2;
        qkm qkmVar;
        int i3;
        rj6 rj6Var;
        ?? r8;
        int i4;
        rj6 rj6Var2;
        qkm qkmVar2;
        String str3;
        Object obj;
        String str4 = str;
        jyr jyrVar = (jyr) this.b.e;
        jyr jyrVar2 = this.a.o;
        if (cg6Var instanceof spk) {
            spkVar = (spk) cg6Var;
            int i5 = spkVar.r;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                spkVar.r = i5 - Integer.MIN_VALUE;
                Object obj2 = spkVar.p;
                nm6 nm6Var = nm6.a;
                i = spkVar.r;
                int i6 = 1;
                int i7 = 4;
                ?? r82 = 0;
                boolean z = false;
                boolean z2 = false;
                if (i != 0) {
                    qgg.h0(obj2);
                    vkm vkmVar = (vkm) jyrVar2.getValue();
                    spkVar.j = str4;
                    spkVar.r = 1;
                    obj2 = vkmVar.c(str4, spkVar);
                } else if (i == 1) {
                    str4 = spkVar.j;
                    qgg.h0(obj2);
                } else {
                    if (i == 2) {
                        i3 = spkVar.o;
                        i2 = spkVar.n;
                        qkmVar = spkVar.l;
                        it = spkVar.k;
                        str2 = spkVar.j;
                        qgg.h0(obj2);
                        rj6Var = (rj6) obj2;
                        r8 = z2;
                        rj6 rj6Var3 = rj6Var;
                        int i8 = i3;
                        i4 = i2;
                        rj6Var2 = rj6Var3;
                        String str5 = str2;
                        qkmVar2 = qkmVar;
                        str3 = str5;
                        if (rj6Var2 instanceof qj6) {
                        }
                        return nm6Var;
                    }
                    if (i == 3) {
                        i3 = spkVar.o;
                        i2 = spkVar.n;
                        qkmVar = spkVar.l;
                        it = spkVar.k;
                        str2 = spkVar.j;
                        qgg.h0(obj2);
                        rj6Var = (rj6) obj2;
                        r8 = z;
                        rj6 rj6Var32 = rj6Var;
                        int i82 = i3;
                        i4 = i2;
                        rj6Var2 = rj6Var32;
                        String str52 = str2;
                        qkmVar2 = qkmVar;
                        str3 = str52;
                        if (rj6Var2 instanceof qj6) {
                        }
                        return nm6Var;
                    }
                    if (i == 4) {
                        i4 = spkVar.n;
                        Iterator it2 = spkVar.k;
                        String str6 = spkVar.j;
                        qgg.h0(obj2);
                        it = it2;
                        obj = null;
                        str2 = str6;
                        i2 = i4;
                        r82 = obj;
                        i6 = 1;
                        i7 = 4;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = spkVar.n;
                        rj6Var2 = spkVar.m;
                        qkmVar2 = spkVar.l;
                        it = spkVar.k;
                        str3 = spkVar.j;
                        qgg.h0(obj2);
                        IOException a = ((mj6) rj6Var2).a();
                        if (a != null) {
                            ssg.a(5, "PhonotekaSynchronizer", "send preSave operation error " + qkmVar2, a);
                        } else {
                            ssg.a(5, "PhonotekaSynchronizer", "send preSave operation error " + qkmVar2, null);
                        }
                        str2 = str3;
                        obj = null;
                        i2 = i4;
                        r82 = obj;
                        i6 = 1;
                        i7 = 4;
                        if (it.hasNext()) {
                            qkmVar = (qkm) it.next();
                            pkm pkmVar = qkmVar.c;
                            String str7 = qkmVar.a;
                            int ordinal = pkmVar.ordinal();
                            if (ordinal == 0) {
                                ssg.a(i7, "PhonotekaSynchronizer", "send subscribe to preSave: " + qkmVar, r82);
                                elm elmVar = (elm) jyrVar.getValue();
                                spkVar.j = str2;
                                spkVar.k = it;
                                spkVar.l = qkmVar;
                                spkVar.m = r82;
                                spkVar.n = i2;
                                spkVar.o = 0;
                                spkVar.r = 2;
                                obj2 = elmVar.a(str2, str7, spkVar);
                                if (obj2 != nm6Var) {
                                    i3 = 0;
                                    z2 = r82;
                                    rj6Var = (rj6) obj2;
                                    r8 = z2;
                                    rj6 rj6Var322 = rj6Var;
                                    int i822 = i3;
                                    i4 = i2;
                                    rj6Var2 = rj6Var322;
                                    String str522 = str2;
                                    qkmVar2 = qkmVar;
                                    str3 = str522;
                                    if (rj6Var2 instanceof qj6) {
                                        vkm vkmVar2 = (vkm) jyrVar2.getValue();
                                        String str8 = qkmVar2.a;
                                        pkm pkmVar2 = qkmVar2.c;
                                        spkVar.j = str3;
                                        spkVar.k = it;
                                        spkVar.l = r8;
                                        spkVar.m = r8;
                                        spkVar.n = i4;
                                        spkVar.o = i822;
                                        spkVar.r = i7;
                                        if (vkmVar2.b(str3, str8, pkmVar2, spkVar) != nm6Var) {
                                            it = it;
                                            obj = r8;
                                            str2 = str3;
                                            i2 = i4;
                                            r82 = obj;
                                            i6 = 1;
                                            i7 = 4;
                                            if (it.hasNext()) {
                                            }
                                        }
                                    } else {
                                        if (!(rj6Var2 instanceof pj6)) {
                                            b6e.s();
                                            return null;
                                        }
                                        pj6 pj6Var = (pj6) rj6Var2;
                                        if (pj6Var instanceof mj6) {
                                            int i9 = ((mj6) rj6Var2).a;
                                            if (i9 < 400 || i9 >= 500) {
                                                obj = null;
                                            } else {
                                                vkm vkmVar3 = (vkm) jyrVar2.getValue();
                                                String str9 = qkmVar2.a;
                                                pkm pkmVar3 = qkmVar2.c;
                                                spkVar.j = str3;
                                                spkVar.k = it;
                                                spkVar.l = qkmVar2;
                                                spkVar.m = pj6Var;
                                                spkVar.n = i4;
                                                spkVar.o = i822;
                                                spkVar.r = 5;
                                            }
                                        } else {
                                            IOException a2 = pj6Var.a();
                                            if (a2 != null) {
                                                ssg.a(5, "PhonotekaSynchronizer", "send preSave operation error " + qkmVar2, a2);
                                                obj = null;
                                            } else {
                                                obj = null;
                                                ssg.a(5, "PhonotekaSynchronizer", "send preSave operation error " + qkmVar2, null);
                                            }
                                        }
                                        str2 = str3;
                                        i2 = i4;
                                        r82 = obj;
                                        i6 = 1;
                                        i7 = 4;
                                        if (it.hasNext()) {
                                            return Unit.a;
                                        }
                                    }
                                }
                            } else {
                                if (ordinal != i6) {
                                    b6e.s();
                                    return null;
                                }
                                ssg.a(i7, "PhonotekaSynchronizer", "send unsubscribe to preSave: " + qkmVar, r82);
                                elm elmVar2 = (elm) jyrVar.getValue();
                                spkVar.j = str2;
                                spkVar.k = it;
                                spkVar.l = qkmVar;
                                spkVar.m = r82;
                                spkVar.n = i2;
                                spkVar.o = 0;
                                spkVar.r = 3;
                                obj2 = elmVar2.c(str2, str7, spkVar);
                                if (obj2 != nm6Var) {
                                    i3 = 0;
                                    z = r82;
                                    rj6Var = (rj6) obj2;
                                    r8 = z;
                                    rj6 rj6Var3222 = rj6Var;
                                    int i8222 = i3;
                                    i4 = i2;
                                    rj6Var2 = rj6Var3222;
                                    String str5222 = str2;
                                    qkmVar2 = qkmVar;
                                    str3 = str5222;
                                    if (rj6Var2 instanceof qj6) {
                                    }
                                }
                            }
                            return nm6Var;
                        }
                    }
                }
                list = (List) obj2;
                if (!list.isEmpty()) {
                    ssg.a(4, "PhonotekaSynchronizer", "uploadPreSavesChanges(): nothing to send", null);
                    return Unit.a;
                }
                str2 = str4;
                it = list.iterator();
                i2 = 0;
                if (it.hasNext()) {
                }
            }
        }
        spkVar = new spk(this, cg6Var);
        Object obj22 = spkVar.p;
        nm6 nm6Var2 = nm6.a;
        i = spkVar.r;
        int i62 = 1;
        int i72 = 4;
        ?? r822 = 0;
        boolean z3 = false;
        boolean z22 = false;
        if (i != 0) {
        }
        list = (List) obj22;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x05f7, code lost:
    
        if (r6.c(r3, r5, r1) != r4) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0578 A[LOOP:1: B:29:0x0572->B:31:0x0578, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x05c5 A[LOOP:3: B:45:0x05bf->B:47:0x05c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ed  */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v22, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0536 -> B:15:0x0538). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0467 -> B:44:0x046b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x039b -> B:65:0x039d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, cg6 cg6Var) {
        tpk tpkVar;
        int i;
        vpk vpkVar;
        String str2;
        String str3;
        List list;
        Object f;
        vpk vpkVar2;
        String str4;
        int i2;
        Object b;
        List list2;
        String str5;
        List list3;
        Iterator it;
        List list4;
        List list5;
        List list6;
        jac jacVar;
        ac0 ac0Var;
        List list7;
        Collection arrayList;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        List list8;
        List list9;
        String str6;
        int i3;
        gpk gpkVar;
        gpk gpkVar2;
        List list10;
        List list11;
        List list12;
        List list13;
        String str7;
        LinkedHashMap linkedHashMap2;
        Collection arrayList2;
        List list14;
        Iterator it3;
        int i4;
        List list15;
        List list16;
        jac jacVar2;
        ac0 ac0Var2;
        LinkedHashMap linkedHashMap3;
        List list17;
        List list18;
        List list19;
        List list20;
        List list21;
        Iterator it4;
        List list22;
        List list23;
        List list24;
        int i5;
        String str8;
        Collection collection;
        List list25;
        LinkedHashMap linkedHashMap4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        List list26;
        String str9 = str;
        if (cg6Var instanceof tpk) {
            tpkVar = (tpk) cg6Var;
            int i6 = tpkVar.y;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                tpkVar.y = i6 - Integer.MIN_VALUE;
                Object obj = tpkVar.w;
                nm6 nm6Var = nm6.a;
                i = tpkVar.y;
                jac jacVar3 = this.b;
                ac0 ac0Var3 = this.a;
                switch (i) {
                    case 0:
                        qgg.h0(obj);
                        uys e = ac0Var3.e();
                        nvl nvlVar = new nvl(str9, "3");
                        tpkVar.j = str9;
                        tpkVar.k = this;
                        tpkVar.l = str9;
                        tpkVar.y = 1;
                        obj = e.f(str9, nvlVar, tpkVar);
                        if (obj != nm6Var) {
                            vpkVar = this;
                            str2 = str9;
                            tpkVar.j = str2;
                            tpkVar.k = null;
                            tpkVar.l = null;
                            tpkVar.y = 2;
                            obj = vpkVar.b(tpkVar, str9, (List) obj);
                            if (obj != nm6Var) {
                                str3 = str2;
                                list = (List) obj;
                                uys e2 = ac0Var3.e();
                                nvl nvlVar2 = new nvl(str3, "-14");
                                tpkVar.j = str3;
                                tpkVar.k = list;
                                tpkVar.l = this;
                                tpkVar.m = str3;
                                tpkVar.y = 3;
                                f = e2.f(str3, nvlVar2, tpkVar);
                                if (f != nm6Var) {
                                    vpkVar2 = this;
                                    str4 = str3;
                                    tpkVar.j = str4;
                                    tpkVar.k = list;
                                    tpkVar.l = null;
                                    tpkVar.m = null;
                                    i2 = 4;
                                    tpkVar.y = 4;
                                    b = vpkVar2.b(tpkVar, str3, (List) f);
                                    if (b != nm6Var) {
                                        List list27 = list;
                                        obj = b;
                                        list2 = list27;
                                        str5 = str4;
                                        list3 = (List) obj;
                                        if (!list2.isEmpty() && list3.isEmpty()) {
                                            ssg.a(i2, "PhonotekaSynchronizer", "uploadTracksLikeChanges(): nothing to send", null);
                                            return Unit.a;
                                        }
                                        List<iys> list28 = list2;
                                        ArrayList arrayList3 = new ArrayList(v75.o(list28, 10));
                                        for (iys iysVar : list28) {
                                            int ordinal = iysVar.c.ordinal();
                                            if (ordinal == 0) {
                                                gpkVar2 = gpk.a;
                                            } else {
                                                if (ordinal != 1) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                gpkVar2 = gpk.b;
                                            }
                                            arrayList3.add(new hpk(gpkVar2, iysVar));
                                        }
                                        List<iys> list29 = list3;
                                        ArrayList arrayList4 = new ArrayList(v75.o(list29, 10));
                                        for (iys iysVar2 : list29) {
                                            int ordinal2 = iysVar2.c.ordinal();
                                            if (ordinal2 == 0) {
                                                gpkVar = gpk.c;
                                            } else {
                                                if (ordinal2 != 1) {
                                                    b6e.s();
                                                    return null;
                                                }
                                                gpkVar = gpk.b;
                                            }
                                            arrayList4.add(new hpk(gpkVar, iysVar2));
                                        }
                                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                        it = CollectionsKt.g0(arrayList3, arrayList4).iterator();
                                        while (it.hasNext()) {
                                            hpk hpkVar = (hpk) it.next();
                                            hpk hpkVar2 = (hpk) linkedHashMap5.get(hpkVar.b.b.a);
                                            if (hpkVar2 == null || ((Number) hpkVar2.c.getValue()).intValue() < ((Number) hpkVar.c.getValue()).intValue()) {
                                                linkedHashMap5.put(hpkVar.b.b.a, hpkVar);
                                            }
                                        }
                                        Collection values = linkedHashMap5.values();
                                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                        for (Object obj2 : values) {
                                            gpk gpkVar3 = ((hpk) obj2).a;
                                            Object obj3 = linkedHashMap6.get(gpkVar3);
                                            if (obj3 == null) {
                                                obj3 = new ArrayList();
                                                linkedHashMap6.put(gpkVar3, obj3);
                                            }
                                            ((List) obj3).add(obj2);
                                        }
                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap(tah.a(linkedHashMap6.size()));
                                        for (Map.Entry entry : linkedHashMap6.entrySet()) {
                                            Object key = entry.getKey();
                                            List list30 = (List) entry.getValue();
                                            ArrayList arrayList5 = new ArrayList(v75.o(list30, 10));
                                            Iterator it8 = list30.iterator();
                                            while (it8.hasNext()) {
                                                arrayList5.add(((hpk) it8.next()).b);
                                            }
                                            linkedHashMap7.put(key, arrayList5);
                                        }
                                        list4 = (List) linkedHashMap7.get(gpk.a);
                                        if (list4 != null || (list5 = CollectionsKt.j0(list4)) == null) {
                                            list5 = c5b.a;
                                        }
                                        list6 = list5;
                                        if (list6.isEmpty()) {
                                            ouj.B("send liked tracks: ", list5, 4, "PhonotekaSynchronizer", null);
                                            List M = zsd.M(400, list6);
                                            arrayList = new ArrayList();
                                            Iterator it9 = M.iterator();
                                            linkedHashMap = linkedHashMap7;
                                            it2 = it9;
                                            list8 = list2;
                                            list9 = list3;
                                            str6 = str5;
                                            i3 = 0;
                                            if (it2.hasNext()) {
                                                list16 = (List) it2.next();
                                                f5g h = jacVar3.h();
                                                List list31 = list16;
                                                jacVar2 = jacVar3;
                                                Collection collection2 = arrayList;
                                                ac0Var2 = ac0Var3;
                                                ArrayList arrayList6 = new ArrayList(v75.o(list31, 10));
                                                for (Iterator it10 = list31.iterator(); it10.hasNext(); it10 = it10) {
                                                    iys iysVar3 = (iys) it10.next();
                                                    arrayList6.add(new r4g(iysVar3.b, iysVar3.f));
                                                }
                                                tpkVar.j = str6;
                                                tpkVar.k = list8;
                                                tpkVar.l = list9;
                                                tpkVar.m = linkedHashMap;
                                                tpkVar.n = null;
                                                tpkVar.o = collection2;
                                                tpkVar.p = it2;
                                                tpkVar.q = null;
                                                tpkVar.r = list16;
                                                tpkVar.v = i3;
                                                tpkVar.y = 5;
                                                obj = h.g(tpkVar, str6, arrayList6);
                                                if (obj != nm6Var) {
                                                    arrayList = collection2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    z75.t(arrayList, a((rj6) obj, list16, "track like"));
                                                    jacVar3 = jacVar2;
                                                    ac0Var3 = ac0Var2;
                                                    linkedHashMap = linkedHashMap3;
                                                    if (it2.hasNext()) {
                                                        jacVar = jacVar3;
                                                        ac0Var = ac0Var3;
                                                        list7 = (List) arrayList;
                                                        linkedHashMap7 = linkedHashMap;
                                                        list3 = list9;
                                                        list2 = list8;
                                                        str5 = str6;
                                                        list10 = (List) linkedHashMap7.get(gpk.b);
                                                        if (list10 == null) {
                                                            list10 = c5b.a;
                                                        }
                                                        list11 = list10;
                                                        if (list11.isEmpty()) {
                                                            ouj.B("send neutral tracks: ", list10, 4, "PhonotekaSynchronizer", null);
                                                            List M2 = zsd.M(400, list11);
                                                            list13 = list2;
                                                            str7 = str5;
                                                            linkedHashMap2 = linkedHashMap7;
                                                            arrayList2 = new ArrayList();
                                                            list14 = list7;
                                                            it3 = M2.iterator();
                                                            i4 = 0;
                                                            list15 = list3;
                                                            if (it3.hasNext()) {
                                                                list25 = (List) it3.next();
                                                                f5g h2 = jacVar.h();
                                                                List list32 = list25;
                                                                Collection collection3 = arrayList2;
                                                                List list33 = list14;
                                                                ArrayList arrayList7 = new ArrayList(v75.o(list32, 10));
                                                                for (Iterator it11 = list32.iterator(); it11.hasNext(); it11 = it11) {
                                                                    iys iysVar4 = (iys) it11.next();
                                                                    arrayList7.add(new r4g(iysVar4.b, iysVar4.f));
                                                                }
                                                                tpkVar.j = str7;
                                                                tpkVar.k = list13;
                                                                tpkVar.l = list15;
                                                                tpkVar.m = linkedHashMap2;
                                                                tpkVar.n = list33;
                                                                tpkVar.o = null;
                                                                tpkVar.p = null;
                                                                tpkVar.q = collection3;
                                                                tpkVar.r = it3;
                                                                tpkVar.s = null;
                                                                tpkVar.t = list25;
                                                                tpkVar.v = i4;
                                                                tpkVar.y = 6;
                                                                obj = h2.i(tpkVar, str7, arrayList7);
                                                                if (obj != nm6Var) {
                                                                    arrayList2 = collection3;
                                                                    list14 = list33;
                                                                    linkedHashMap4 = linkedHashMap2;
                                                                    z75.t(arrayList2, a((rj6) obj, list25, "track neutral"));
                                                                    linkedHashMap2 = linkedHashMap4;
                                                                    if (it3.hasNext()) {
                                                                        list12 = (List) arrayList2;
                                                                        list3 = list15;
                                                                        list2 = list13;
                                                                        linkedHashMap7 = linkedHashMap2;
                                                                        str5 = str7;
                                                                        list7 = list14;
                                                                        list17 = (List) linkedHashMap7.get(gpk.c);
                                                                        if (list17 != null || (list18 = CollectionsKt.j0(list17)) == null) {
                                                                            list18 = c5b.a;
                                                                        }
                                                                        list19 = list18;
                                                                        if (list19.isEmpty()) {
                                                                            ouj.B("send disliked tracks: ", list18, 4, "PhonotekaSynchronizer", null);
                                                                            List M3 = zsd.M(400, list19);
                                                                            ArrayList arrayList8 = new ArrayList();
                                                                            it4 = M3.iterator();
                                                                            list22 = list2;
                                                                            list23 = list3;
                                                                            list20 = list7;
                                                                            list24 = list12;
                                                                            i5 = 0;
                                                                            str8 = str5;
                                                                            collection = arrayList8;
                                                                            if (it4.hasNext()) {
                                                                                List list34 = (List) it4.next();
                                                                                f5g h3 = jacVar.h();
                                                                                List list35 = list34;
                                                                                ArrayList arrayList9 = new ArrayList(v75.o(list35, 10));
                                                                                for (Iterator it12 = list35.iterator(); it12.hasNext(); it12 = it12) {
                                                                                    iys iysVar5 = (iys) it12.next();
                                                                                    arrayList9.add(new r4g(iysVar5.b, iysVar5.f));
                                                                                }
                                                                                tpkVar.j = str8;
                                                                                tpkVar.k = list22;
                                                                                tpkVar.l = list23;
                                                                                tpkVar.m = null;
                                                                                tpkVar.n = list20;
                                                                                tpkVar.o = null;
                                                                                tpkVar.p = list24;
                                                                                tpkVar.q = null;
                                                                                tpkVar.r = null;
                                                                                tpkVar.s = collection;
                                                                                tpkVar.t = it4;
                                                                                tpkVar.u = list34;
                                                                                tpkVar.v = i5;
                                                                                tpkVar.y = 7;
                                                                                obj = h3.b(tpkVar, str8, arrayList9);
                                                                                if (obj != nm6Var) {
                                                                                    list26 = list34;
                                                                                    z75.t(collection, a((rj6) obj, list26, "track dislikes"));
                                                                                    if (it4.hasNext()) {
                                                                                        list21 = (List) collection;
                                                                                        str5 = str8;
                                                                                        list3 = list23;
                                                                                        list2 = list22;
                                                                                        list12 = list24;
                                                                                        uys e3 = ac0Var.e();
                                                                                        ArrayList g0 = CollectionsKt.g0(list2, list3);
                                                                                        ArrayList g02 = CollectionsKt.g0(CollectionsKt.g0(list20, list12), list21);
                                                                                        HashSet hashSet = new HashSet();
                                                                                        it5 = g02.iterator();
                                                                                        while (it5.hasNext()) {
                                                                                            iys iysVar6 = (iys) it5.next();
                                                                                            iysVar6.getClass();
                                                                                            hashSet.add(iysVar6.b.a);
                                                                                        }
                                                                                        ArrayList arrayList10 = new ArrayList();
                                                                                        it6 = g0.iterator();
                                                                                        while (it6.hasNext()) {
                                                                                            Object next = it6.next();
                                                                                            iys iysVar7 = (iys) next;
                                                                                            iysVar7.getClass();
                                                                                            if (hashSet.contains(iysVar7.b.a)) {
                                                                                                arrayList10.add(next);
                                                                                            }
                                                                                        }
                                                                                        ArrayList arrayList11 = new ArrayList(v75.o(arrayList10, 10));
                                                                                        it7 = arrayList10.iterator();
                                                                                        while (it7.hasNext()) {
                                                                                            arrayList11.add(new Long(((iys) it7.next()).a));
                                                                                        }
                                                                                        tpkVar.j = null;
                                                                                        tpkVar.k = null;
                                                                                        tpkVar.l = null;
                                                                                        tpkVar.m = null;
                                                                                        tpkVar.n = null;
                                                                                        tpkVar.o = null;
                                                                                        tpkVar.p = null;
                                                                                        tpkVar.q = null;
                                                                                        tpkVar.r = null;
                                                                                        tpkVar.s = null;
                                                                                        tpkVar.t = null;
                                                                                        tpkVar.u = null;
                                                                                        tpkVar.y = 8;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            list20 = list7;
                                                                            list21 = c5b.a;
                                                                            uys e32 = ac0Var.e();
                                                                            ArrayList g03 = CollectionsKt.g0(list2, list3);
                                                                            ArrayList g022 = CollectionsKt.g0(CollectionsKt.g0(list20, list12), list21);
                                                                            HashSet hashSet2 = new HashSet();
                                                                            it5 = g022.iterator();
                                                                            while (it5.hasNext()) {
                                                                            }
                                                                            ArrayList arrayList102 = new ArrayList();
                                                                            it6 = g03.iterator();
                                                                            while (it6.hasNext()) {
                                                                            }
                                                                            ArrayList arrayList112 = new ArrayList(v75.o(arrayList102, 10));
                                                                            it7 = arrayList102.iterator();
                                                                            while (it7.hasNext()) {
                                                                            }
                                                                            tpkVar.j = null;
                                                                            tpkVar.k = null;
                                                                            tpkVar.l = null;
                                                                            tpkVar.m = null;
                                                                            tpkVar.n = null;
                                                                            tpkVar.o = null;
                                                                            tpkVar.p = null;
                                                                            tpkVar.q = null;
                                                                            tpkVar.r = null;
                                                                            tpkVar.s = null;
                                                                            tpkVar.t = null;
                                                                            tpkVar.u = null;
                                                                            tpkVar.y = 8;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            list12 = c5b.a;
                                                            list17 = (List) linkedHashMap7.get(gpk.c);
                                                            if (list17 != null) {
                                                            }
                                                            list18 = c5b.a;
                                                            list19 = list18;
                                                            if (list19.isEmpty()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            jacVar = jacVar3;
                                            ac0Var = ac0Var3;
                                            list7 = c5b.a;
                                            list10 = (List) linkedHashMap7.get(gpk.b);
                                            if (list10 == null) {
                                            }
                                            list11 = list10;
                                            if (list11.isEmpty()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        str9 = (String) tpkVar.l;
                        vpkVar = (vpk) tpkVar.k;
                        str2 = tpkVar.j;
                        qgg.h0(obj);
                        tpkVar.j = str2;
                        tpkVar.k = null;
                        tpkVar.l = null;
                        tpkVar.y = 2;
                        obj = vpkVar.b(tpkVar, str9, (List) obj);
                        if (obj != nm6Var) {
                        }
                        return nm6Var;
                    case 2:
                        str3 = tpkVar.j;
                        qgg.h0(obj);
                        list = (List) obj;
                        uys e22 = ac0Var3.e();
                        nvl nvlVar22 = new nvl(str3, "-14");
                        tpkVar.j = str3;
                        tpkVar.k = list;
                        tpkVar.l = this;
                        tpkVar.m = str3;
                        tpkVar.y = 3;
                        f = e22.f(str3, nvlVar22, tpkVar);
                        if (f != nm6Var) {
                        }
                        return nm6Var;
                    case 3:
                        str3 = (String) tpkVar.m;
                        vpk vpkVar3 = (vpk) tpkVar.l;
                        List list36 = (List) tpkVar.k;
                        str4 = tpkVar.j;
                        qgg.h0(obj);
                        f = obj;
                        list = list36;
                        vpkVar2 = vpkVar3;
                        tpkVar.j = str4;
                        tpkVar.k = list;
                        tpkVar.l = null;
                        tpkVar.m = null;
                        i2 = 4;
                        tpkVar.y = 4;
                        b = vpkVar2.b(tpkVar, str3, (List) f);
                        if (b != nm6Var) {
                        }
                        return nm6Var;
                    case 4:
                        list2 = (List) tpkVar.k;
                        str5 = tpkVar.j;
                        qgg.h0(obj);
                        i2 = 4;
                        list3 = (List) obj;
                        if (!list2.isEmpty()) {
                            break;
                        }
                        List<iys> list282 = list2;
                        ArrayList arrayList32 = new ArrayList(v75.o(list282, 10));
                        while (r8.hasNext()) {
                        }
                        List<iys> list292 = list3;
                        ArrayList arrayList42 = new ArrayList(v75.o(list292, 10));
                        while (r8.hasNext()) {
                        }
                        LinkedHashMap linkedHashMap52 = new LinkedHashMap();
                        it = CollectionsKt.g0(arrayList32, arrayList42).iterator();
                        while (it.hasNext()) {
                        }
                        Collection values2 = linkedHashMap52.values();
                        LinkedHashMap linkedHashMap62 = new LinkedHashMap();
                        while (r6.hasNext()) {
                        }
                        LinkedHashMap linkedHashMap72 = new LinkedHashMap(tah.a(linkedHashMap62.size()));
                        while (r8.hasNext()) {
                        }
                        list4 = (List) linkedHashMap72.get(gpk.a);
                        if (list4 != null) {
                            break;
                        }
                        list5 = c5b.a;
                        list6 = list5;
                        if (list6.isEmpty()) {
                        }
                        break;
                    case 5:
                        i3 = tpkVar.v;
                        list16 = (List) tpkVar.r;
                        it2 = (Iterator) tpkVar.p;
                        arrayList = tpkVar.o;
                        List list37 = tpkVar.n;
                        ?? r11 = (Map) tpkVar.m;
                        list9 = (List) tpkVar.l;
                        list8 = (List) tpkVar.k;
                        str6 = tpkVar.j;
                        qgg.h0(obj);
                        jacVar2 = jacVar3;
                        ac0Var2 = ac0Var3;
                        linkedHashMap3 = r11;
                        z75.t(arrayList, a((rj6) obj, list16, "track like"));
                        jacVar3 = jacVar2;
                        ac0Var3 = ac0Var2;
                        linkedHashMap = linkedHashMap3;
                        if (it2.hasNext()) {
                        }
                        break;
                    case 6:
                        i4 = tpkVar.v;
                        list25 = (List) tpkVar.t;
                        it3 = (Iterator) tpkVar.r;
                        arrayList2 = tpkVar.q;
                        list14 = tpkVar.n;
                        ?? r13 = (Map) tpkVar.m;
                        list15 = (List) tpkVar.l;
                        list13 = (List) tpkVar.k;
                        str7 = tpkVar.j;
                        qgg.h0(obj);
                        jacVar = jacVar3;
                        ac0Var = ac0Var3;
                        linkedHashMap4 = r13;
                        z75.t(arrayList2, a((rj6) obj, list25, "track neutral"));
                        linkedHashMap2 = linkedHashMap4;
                        if (it3.hasNext()) {
                        }
                        break;
                    case 7:
                        i5 = tpkVar.v;
                        list26 = tpkVar.u;
                        it4 = (Iterator) tpkVar.t;
                        collection = tpkVar.s;
                        list24 = (List) tpkVar.p;
                        list20 = tpkVar.n;
                        list23 = (List) tpkVar.l;
                        list22 = (List) tpkVar.k;
                        str8 = tpkVar.j;
                        qgg.h0(obj);
                        jacVar = jacVar3;
                        ac0Var = ac0Var3;
                        z75.t(collection, a((rj6) obj, list26, "track dislikes"));
                        if (it4.hasNext()) {
                        }
                        break;
                    case 8:
                        List list38 = tpkVar.n;
                        qgg.h0(obj);
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tpkVar = new tpk(this, cg6Var);
        Object obj4 = tpkVar.w;
        nm6 nm6Var2 = nm6.a;
        i = tpkVar.y;
        jac jacVar32 = this.b;
        ac0 ac0Var32 = this.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f2, code lost:
    
        if (r2 == r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0345, code lost:
    
        if (r1 == r4) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x038b, code lost:
    
        if (r2.d(r3, r1, r5) != r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e9, code lost:
    
        if (r2 == r4) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0345 -> B:20:0x0348). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x029d -> B:34:0x029f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01e9 -> B:53:0x01ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, cg6 cg6Var) {
        upk upkVar;
        int i;
        List list;
        LinkedHashMap linkedHashMap;
        ac0 ac0Var;
        List list2;
        Iterator it;
        String str2;
        Collection collection;
        LinkedHashMap linkedHashMap2;
        int i2;
        List list3;
        List list4;
        List list5;
        String str3;
        Collection arrayList;
        Iterator it2;
        List list6;
        int i3;
        LinkedHashMap linkedHashMap3;
        List list7;
        List list8;
        List list9;
        List list10;
        String str4;
        List list11;
        int i4;
        Iterator it3;
        Collection collection2;
        String str5 = str;
        if (cg6Var instanceof upk) {
            upkVar = (upk) cg6Var;
            int i5 = upkVar.w;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                upkVar.w = i5 - Integer.MIN_VALUE;
                Object obj = upkVar.u;
                nm6 nm6Var = nm6.a;
                i = upkVar.w;
                ac0 ac0Var2 = this.a;
                jac jacVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    e1g a = ac0Var2.a();
                    upkVar.j = str5;
                    upkVar.w = 1;
                    obj = a.h(str5, upkVar);
                } else if (i == 1) {
                    str5 = upkVar.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    i2 = upkVar.t;
                    List list12 = (List) upkVar.p;
                    it = (Iterator) upkVar.n;
                    collection = upkVar.m;
                    List list13 = upkVar.l;
                    Map map = upkVar.k;
                    str2 = upkVar.j;
                    qgg.h0(obj);
                    ac0 ac0Var3 = ac0Var2;
                    char c = 2;
                    LinkedHashMap linkedHashMap4 = map;
                    z75.t(collection, a((rj6) obj, list12, "video clip likes"));
                    ac0Var2 = ac0Var3;
                    linkedHashMap2 = linkedHashMap4;
                    if (it.hasNext()) {
                        ac0Var = ac0Var2;
                        list2 = (List) collection;
                        linkedHashMap = linkedHashMap2;
                        str5 = str2;
                        list3 = (List) linkedHashMap.get(q0g.b);
                        if (list3 == null) {
                            list3 = c5b.a;
                        }
                        list4 = list3;
                        if (list4.isEmpty()) {
                            ouj.B("send neutral video clips: ", list3, 4, "PhonotekaSynchronizer", null);
                            List M = zsd.M(400, list4);
                            str3 = str5;
                            arrayList = new ArrayList();
                            it2 = M.iterator();
                            list6 = list2;
                            i3 = 0;
                            linkedHashMap3 = linkedHashMap;
                            if (it2.hasNext()) {
                            }
                        } else {
                            list5 = c5b.a;
                            list7 = (List) linkedHashMap.get(q0g.c);
                            if (list7 == null) {
                            }
                            list8 = list7;
                            if (list8.isEmpty()) {
                            }
                        }
                    } else {
                        list12 = (List) it.next();
                        f5g h = jacVar.h();
                        List list14 = list12;
                        ac0Var3 = ac0Var2;
                        ArrayList arrayList2 = new ArrayList(v75.o(list14, 10));
                        Iterator it4 = list14.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(((p0g) it4.next()).b);
                        }
                        upkVar.j = str2;
                        upkVar.k = linkedHashMap2;
                        upkVar.l = null;
                        upkVar.m = collection;
                        upkVar.n = it;
                        upkVar.o = null;
                        upkVar.p = list12;
                        upkVar.t = i2;
                        c = 2;
                        upkVar.w = 2;
                        obj = h.h(upkVar, str2, arrayList2);
                        linkedHashMap4 = linkedHashMap2;
                    }
                } else if (i == 3) {
                    i3 = upkVar.t;
                    List list15 = (List) upkVar.r;
                    it2 = (Iterator) upkVar.p;
                    arrayList = upkVar.o;
                    list6 = upkVar.l;
                    Map map2 = upkVar.k;
                    str3 = upkVar.j;
                    qgg.h0(obj);
                    ac0Var = ac0Var2;
                    LinkedHashMap linkedHashMap5 = map2;
                    z75.t(arrayList, a((rj6) obj, list15, "video clip neutral"));
                    linkedHashMap3 = linkedHashMap5;
                    if (it2.hasNext()) {
                        list15 = (List) it2.next();
                        f5g h2 = jacVar.h();
                        List list16 = list15;
                        LinkedHashMap linkedHashMap6 = linkedHashMap3;
                        ArrayList arrayList3 = new ArrayList(v75.o(list16, 10));
                        Iterator it5 = list16.iterator();
                        while (it5.hasNext()) {
                            arrayList3.add(((p0g) it5.next()).b);
                        }
                        upkVar.j = str3;
                        upkVar.k = linkedHashMap6;
                        upkVar.l = list6;
                        upkVar.m = null;
                        upkVar.n = null;
                        upkVar.o = arrayList;
                        upkVar.p = it2;
                        upkVar.q = null;
                        upkVar.r = list15;
                        upkVar.t = i3;
                        upkVar.w = 3;
                        obj = h2.n(upkVar, str3, arrayList3);
                        if (obj != nm6Var) {
                            linkedHashMap5 = linkedHashMap6;
                            z75.t(arrayList, a((rj6) obj, list15, "video clip neutral"));
                            linkedHashMap3 = linkedHashMap5;
                            if (it2.hasNext()) {
                                list5 = (List) arrayList;
                                linkedHashMap = linkedHashMap3;
                                list2 = list6;
                                str5 = str3;
                                list7 = (List) linkedHashMap.get(q0g.c);
                                if (list7 == null) {
                                    list7 = c5b.a;
                                }
                                list8 = list7;
                                if (list8.isEmpty()) {
                                    ouj.B("send dislike video clips: ", list7, 4, "PhonotekaSynchronizer", null);
                                    List M2 = zsd.M(400, list8);
                                    ArrayList arrayList4 = new ArrayList();
                                    str4 = str5;
                                    list11 = list2;
                                    list9 = list5;
                                    i4 = 0;
                                    it3 = M2.iterator();
                                    collection2 = arrayList4;
                                    if (it3.hasNext()) {
                                    }
                                } else {
                                    list9 = list5;
                                    list10 = c5b.a;
                                    e1g a2 = ac0Var.a();
                                    ArrayList g0 = CollectionsKt.g0(CollectionsKt.g0(list2, list9), list10);
                                    upkVar.j = null;
                                    upkVar.k = null;
                                    upkVar.l = null;
                                    upkVar.m = null;
                                    upkVar.n = null;
                                    upkVar.o = null;
                                    upkVar.p = null;
                                    upkVar.q = null;
                                    upkVar.r = null;
                                    upkVar.s = null;
                                    upkVar.w = 5;
                                }
                            }
                        }
                        return nm6Var;
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list17 = upkVar.l;
                        Map map3 = upkVar.k;
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    int i6 = upkVar.t;
                    List list18 = upkVar.s;
                    it3 = (Iterator) upkVar.r;
                    collection2 = upkVar.q;
                    list9 = (List) upkVar.n;
                    list11 = upkVar.l;
                    Map map4 = upkVar.k;
                    str4 = upkVar.j;
                    qgg.h0(obj);
                    i4 = i6;
                    Object c2 = obj;
                    ac0Var = ac0Var2;
                    z75.t(collection2, a((rj6) c2, list18, "video clip disliked"));
                    if (it3.hasNext()) {
                        list10 = (List) collection2;
                        str5 = str4;
                        list2 = list11;
                        e1g a22 = ac0Var.a();
                        ArrayList g02 = CollectionsKt.g0(CollectionsKt.g0(list2, list9), list10);
                        upkVar.j = null;
                        upkVar.k = null;
                        upkVar.l = null;
                        upkVar.m = null;
                        upkVar.n = null;
                        upkVar.o = null;
                        upkVar.p = null;
                        upkVar.q = null;
                        upkVar.r = null;
                        upkVar.s = null;
                        upkVar.w = 5;
                    } else {
                        list18 = (List) it3.next();
                        f5g h3 = jacVar.h();
                        List list19 = list18;
                        ArrayList arrayList5 = new ArrayList(v75.o(list19, 10));
                        Iterator it6 = list19.iterator();
                        while (it6.hasNext()) {
                            arrayList5.add(((p0g) it6.next()).b);
                        }
                        upkVar.j = str4;
                        upkVar.k = null;
                        upkVar.l = list11;
                        upkVar.m = null;
                        upkVar.n = list9;
                        upkVar.o = null;
                        upkVar.p = null;
                        upkVar.q = collection2;
                        upkVar.r = it3;
                        upkVar.s = list18;
                        upkVar.t = i4;
                        upkVar.w = 4;
                        c2 = h3.c(upkVar, str4, arrayList5);
                    }
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    ssg.a(4, "PhonotekaSynchronizer", "uploadVideoClipsLikeChanges(): nothing to send", null);
                    return Unit.a;
                }
                List list20 = list;
                int a3 = tah.a(v75.o(list20, 10));
                if (a3 < 16) {
                    a3 = 16;
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(a3);
                for (Object obj2 : list20) {
                    linkedHashMap7.put(((p0g) obj2).b, obj2);
                }
                Collection values = linkedHashMap7.values();
                linkedHashMap = new LinkedHashMap();
                for (Object obj3 : values) {
                    q0g q0gVar = ((p0g) obj3).a;
                    Object obj4 = linkedHashMap.get(q0gVar);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(q0gVar, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                List list21 = (List) linkedHashMap.get(q0g.a);
                if (list21 == null) {
                    list21 = c5b.a;
                }
                List list22 = list21;
                if (list22.isEmpty()) {
                    ac0Var = ac0Var2;
                    list2 = c5b.a;
                    list3 = (List) linkedHashMap.get(q0g.b);
                    if (list3 == null) {
                    }
                    list4 = list3;
                    if (list4.isEmpty()) {
                    }
                } else {
                    ouj.B("send liked video clips: ", list21, 4, "PhonotekaSynchronizer", null);
                    List M3 = zsd.M(400, list22);
                    ArrayList arrayList6 = new ArrayList();
                    it = M3.iterator();
                    str2 = str5;
                    collection = arrayList6;
                    linkedHashMap2 = linkedHashMap;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        upkVar = new upk(this, cg6Var);
        Object obj5 = upkVar.u;
        nm6 nm6Var2 = nm6.a;
        i = upkVar.w;
        ac0 ac0Var22 = this.a;
        jac jacVar2 = this.b;
        if (i != 0) {
        }
        list = (List) obj5;
        if (!list.isEmpty()) {
        }
    }
}
