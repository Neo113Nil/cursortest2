package ru.yandex.taxi.summary.requirements.list.mapper;

import com.yandex.go.zone.dto.objects.TariffGroupDefinitionType;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinitionImages;
import com.yandex.go.zone.dto.objects.TariffInfoViewSection;
import com.yandex.go.zone.dto.objects.TariffInfoViewSectionItem;
import com.yandex.go.zone.dto.objects.TariffViewSectionItemType;
import com.yandex.go.zone.model.Zone;
import defpackage.apj0;
import defpackage.b580;
import defpackage.b8r;
import defpackage.bpj0;
import defpackage.cqj0;
import defpackage.efj0;
import defpackage.ejj0;
import defpackage.evu0;
import defpackage.fmw0;
import defpackage.g580;
import defpackage.gmw0;
import defpackage.h73;
import defpackage.jhu0;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.kmw0;
import defpackage.lmw0;
import defpackage.lx8;
import defpackage.mi31;
import defpackage.n3a;
import defpackage.oqj0;
import defpackage.pex0;
import defpackage.qwz0;
import defpackage.tcc;
import defpackage.th40;
import defpackage.tlx0;
import defpackage.voj0;
import defpackage.vvb1;
import defpackage.w15;
import defpackage.w511;
import defpackage.wgj0;
import defpackage.x8;
import defpackage.xoj0;
import defpackage.ycc;
import defpackage.ykv0;
import defpackage.ymi;
import defpackage.yoj0;
import defpackage.yw01;
import defpackage.zoj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a {
    public final bpj0 a;
    public final w15 b;
    public final ymi c;
    public final g580 d;
    public final jhu0 e;
    public final n3a f;

    public a(bpj0 bpj0Var, w15 w15Var, ymi ymiVar, g580 g580Var, jhu0 jhu0Var, n3a n3aVar) {
        this.a = bpj0Var;
        this.b = w15Var;
        this.c = ymiVar;
        this.d = g580Var;
        this.e = jhu0Var;
        this.f = n3aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00eb, code lost:
    
        if (r3 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
    
        return new defpackage.apj0(r6, r7, r2, r9, r10, r11, false, r21.a(), r14, null, r16, java.lang.Boolean.TRUE, null, r21.f());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final apj0 a(lmw0 lmw0Var) {
        Object obj;
        String str;
        String c;
        String str2;
        ejj0 p;
        boolean z;
        Iterator it = ((x8) this.d).d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((b580) obj).a, lmw0Var.getName())) {
                break;
            }
        }
        b580 b580Var = (b580) obj;
        bpj0 bpj0Var = this.a;
        bpj0Var.getClass();
        kmw0 kmw0Var = lmw0Var instanceof kmw0 ? (kmw0) lmw0Var : null;
        tlx0 tlx0Var = kmw0Var != null ? kmw0Var.h : null;
        if (tlx0Var != null) {
            mi31 d = b8r.d(bpj0Var.c, tlx0Var.a, null, 6);
            pex0 pex0Var = d != null ? d.a : null;
            if (pex0Var != null) {
                str = pex0Var.j;
                zoj0 yoj0Var = str != null ? vvb1.N : new yoj0(str);
                gmw0 gmw0Var = !(lmw0Var instanceof gmw0) ? (gmw0) lmw0Var : null;
                String name = lmw0Var.getName();
                String label = lmw0Var.getLabel();
                c = lmw0Var.c();
                if (c != null || evu0.J(c)) {
                    if (b580Var != null) {
                        List list = b580Var.e;
                        String name2 = lmw0Var.getName();
                        Zone c2 = bpj0Var.a.c();
                        oqj0.b a = (c2 != null ? (oqj0) c2.d(oqj0.e) : oqj0.e).a(name2);
                        if (a != null && a.a && !list.isEmpty() && (lmw0Var instanceof jmw0) && (p = ((jmw0) lmw0Var).p((String) list.get(0))) != null) {
                            str2 = p.b;
                        }
                    }
                    str2 = null;
                } else {
                    str2 = lmw0Var.c();
                }
                if (str2 == null) {
                    str2 = "";
                }
                String a2 = bpj0Var.a(lmw0Var);
                boolean z2 = true;
                z = !(lmw0Var instanceof fmw0) && ((fmw0) lmw0Var).p;
                if (z) {
                    if (z) {
                        w511.b();
                        return null;
                    }
                }
            }
        }
        str = null;
        if (str != null) {
        }
        if (!(lmw0Var instanceof gmw0)) {
        }
        String name3 = lmw0Var.getName();
        String label2 = lmw0Var.getLabel();
        c = lmw0Var.c();
        if (c != null) {
        }
        if (b580Var != null) {
        }
        str2 = null;
        if (str2 == null) {
        }
        String a22 = bpj0Var.a(lmw0Var);
        boolean z22 = true;
        if (lmw0Var instanceof fmw0) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    public final ArrayList b(mi31 mi31Var) {
        Object obj;
        lx8 lx8Var;
        List list;
        lmw0 lmw0Var;
        List list2;
        Iterator it;
        Object obj2;
        Iterator it2;
        Iterator it3;
        Object obj3;
        EmptyList emptyList;
        Iterator it4;
        lmw0 lmw0Var2;
        Object obj4;
        pex0 pex0Var = mi31Var.a;
        List f = pex0Var.f();
        List list3 = pex0Var.f;
        HashSet hashSet = new HashSet(f.size());
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<TariffInfoViewSection> list4 = pex0Var.e;
        Iterator it5 = list4.iterator();
        while (true) {
            boolean hasNext = it5.hasNext();
            EmptyList<String> emptyList2 = EmptyList.a;
            jhu0 jhu0Var = this.e;
            if (!hasNext) {
                List list5 = f;
                Iterator it6 = list3.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((TariffInfoGroupDefinition) obj).c == TariffGroupDefinitionType.CAROUSEL) {
                        break;
                    }
                }
                TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj;
                if (tariffInfoGroupDefinition == null) {
                    lx8Var = null;
                } else {
                    List<String> list6 = tariffInfoGroupDefinition.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : list6) {
                        Iterator it7 = list5.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                list = list6;
                                lmw0Var = 0;
                                break;
                            }
                            lmw0Var = it7.next();
                            list = list6;
                            if (jl40.l(((lmw0) lmw0Var).getName(), str)) {
                                break;
                            }
                            list6 = list;
                        }
                        lmw0 lmw0Var3 = lmw0Var;
                        apj0 a = (lmw0Var3 == null || jhu0Var.a(lmw0Var3)) ? null : a(lmw0Var3);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                        list6 = list;
                    }
                    hashSet.addAll(list6);
                    lx8Var = new lx8(tariffInfoGroupDefinition.a, arrayList2);
                }
                if (lx8Var != null) {
                    arrayList.add(lx8Var);
                }
                List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(1, list5), new th40(27, hashSet, this, pex0Var)), new RequirementsListGroupMapper$mapRequirements$missedRequirements$2(1, this, a.class, "createItem", "createItem(Lcom/yandex/go/requirements/api/domain/model/SupportedRequirement;)Lru/yandex/taxi/summary/requirements/list/models/RequirementsListItem;", 0)));
                boolean z = false;
                for (TariffInfoViewSection tariffInfoViewSection : list4) {
                    List list7 = tariffInfoViewSection.b;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it8 = list7.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            TariffInfoViewSectionItem tariffInfoViewSectionItem = (TariffInfoViewSectionItem) it8.next();
                            if (jl40.l(tariffInfoViewSectionItem.a, "$ungrouped_requirements")) {
                                list2 = s;
                                z = true;
                            } else {
                                list2 = (List) linkedHashMap.get(tariffInfoViewSectionItem.a);
                            }
                            if (list2 == null) {
                                break;
                            }
                            ycc.r(list2, arrayList3);
                        } else {
                            String str2 = tariffInfoViewSection.a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            arrayList.add(new cqj0(str2, arrayList3));
                        }
                    }
                }
                if (!z) {
                    arrayList.add(new cqj0("", s));
                }
                n3a n3aVar = this.f;
                Map map = (Map) (((ykv0) n3aVar.b.b()).b ? ((ykv0) n3aVar.b.b()).c : kotlin.collections.b.f()).get(mi31Var.b);
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                ?? r0 = (List) map.get(pex0Var.b);
                if (r0 != 0) {
                    emptyList2 = r0;
                }
                ArrayList arrayList4 = new ArrayList();
                for (String str3 : emptyList2) {
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        wgj0 wgj0Var = (wgj0) it9.next();
                        if (wgj0Var instanceof cqj0) {
                            for (apj0 apj0Var : ((cqj0) wgj0Var).b) {
                                if (jl40.l(apj0Var.a, str3)) {
                                    arrayList4.add(apj0Var);
                                }
                            }
                        }
                    }
                }
                if (!arrayList4.isEmpty()) {
                    arrayList.add(new qwz0(arrayList4));
                }
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    wgj0 wgj0Var2 = (wgj0) it10.next();
                    if (wgj0Var2 instanceof cqj0) {
                        cqj0 cqj0Var = (cqj0) wgj0Var2;
                        List list8 = cqj0Var.b;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list8) {
                            if (!emptyList2.contains(((apj0) obj5).a)) {
                                arrayList6.add(obj5);
                            }
                        }
                        wgj0Var2 = new cqj0(cqj0Var.a, arrayList6);
                    }
                    arrayList5.add(wgj0Var2);
                }
                return arrayList5;
            }
            Iterator it11 = ((TariffInfoViewSection) it5.next()).b.iterator();
            while (it11.hasNext()) {
                TariffInfoViewSectionItem tariffInfoViewSectionItem2 = (TariffInfoViewSectionItem) it11.next();
                TariffViewSectionItemType tariffViewSectionItemType = tariffInfoViewSectionItem2.b;
                String str4 = tariffInfoViewSectionItem2.a;
                int i = voj0.a[tariffViewSectionItemType.ordinal()];
                List list9 = f;
                List list10 = list3;
                if (i != 1) {
                    if (i == 2) {
                        Iterator it12 = list9.iterator();
                        while (true) {
                            if (!it12.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it12.next();
                            if (jl40.l(((lmw0) obj4).getName(), str4)) {
                                break;
                            }
                        }
                        lmw0 lmw0Var4 = (lmw0) obj4;
                        if (lmw0Var4 == null) {
                            it = it5;
                            jst.e.k(new IllegalArgumentException(), "Invalid section requirement received " + str4);
                        } else {
                            it = it5;
                            emptyList = !jhu0Var.a(lmw0Var4) ? Collections.singletonList(a(lmw0Var4)) : emptyList2;
                            hashSet.add(lmw0Var4.getName());
                            it2 = it11;
                            linkedHashMap.put(str4, emptyList);
                            f = list9;
                            it11 = it2;
                            list3 = list10;
                            it5 = it;
                        }
                    } else {
                        if (i != 3 && i != 4) {
                            w511.b();
                            return null;
                        }
                        it = it5;
                    }
                    it2 = it11;
                    emptyList = emptyList2;
                    linkedHashMap.put(str4, emptyList);
                    f = list9;
                    it11 = it2;
                    list3 = list10;
                    it5 = it;
                } else {
                    it = it5;
                    Iterator it13 = list10.iterator();
                    while (true) {
                        if (!it13.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it13.next();
                        if (jl40.l(((TariffInfoGroupDefinition) obj2).a, str4)) {
                            break;
                        }
                    }
                    TariffInfoGroupDefinition tariffInfoGroupDefinition2 = (TariffInfoGroupDefinition) obj2;
                    if (tariffInfoGroupDefinition2 == null) {
                        jst.e.k(new IllegalArgumentException(), "Invalid group received for " + str4);
                        it2 = it11;
                        emptyList = emptyList2;
                        linkedHashMap.put(str4, emptyList);
                        f = list9;
                        it11 = it2;
                        list3 = list10;
                        it5 = it;
                    } else {
                        List list11 = tariffInfoGroupDefinition2.b;
                        int i2 = voj0.b[tariffInfoGroupDefinition2.c.ordinal()];
                        if (i2 == 1) {
                            ArrayList arrayList7 = ((x8) this.d).d;
                            it2 = it11;
                            ArrayList arrayList8 = new ArrayList(tcc.n(arrayList7, 10));
                            Iterator it14 = arrayList7.iterator();
                            while (it14.hasNext()) {
                                arrayList8.add(((b580) it14.next()).a);
                            }
                            Set N0 = kotlin.collections.a.N0(arrayList8);
                            ArrayList arrayList9 = new ArrayList();
                            Iterator it15 = list11.iterator();
                            while (it15.hasNext()) {
                                Object next = it15.next();
                                Iterator it16 = it15;
                                if (N0.contains((String) next)) {
                                    arrayList9.add(next);
                                }
                                it15 = it16;
                            }
                            ArrayList arrayList10 = new ArrayList();
                            Iterator it17 = arrayList9.iterator();
                            while (it17.hasNext()) {
                                String str5 = (String) it17.next();
                                Iterator it18 = list9.iterator();
                                while (true) {
                                    if (!it18.hasNext()) {
                                        it3 = it17;
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it18.next();
                                    it3 = it17;
                                    if (jl40.l(((lmw0) obj3).getName(), str5)) {
                                        break;
                                    }
                                    it17 = it3;
                                }
                                lmw0 lmw0Var5 = (lmw0) obj3;
                                if (lmw0Var5 != null) {
                                    arrayList10.add(lmw0Var5);
                                }
                                it17 = it3;
                            }
                            ArrayList arrayList11 = new ArrayList();
                            Iterator it19 = arrayList10.iterator();
                            while (it19.hasNext()) {
                                Object next2 = it19.next();
                                if (!jhu0Var.a((lmw0) next2)) {
                                    arrayList11.add(next2);
                                }
                            }
                            this.a.getClass();
                            int size = arrayList11.size();
                            ArrayList arrayList12 = new ArrayList(tcc.n(arrayList11, 10));
                            Iterator it20 = arrayList11.iterator();
                            while (it20.hasNext()) {
                                arrayList12.add(((lmw0) it20.next()).getLabel());
                            }
                            zoj0 xoj0Var = size > 0 ? new xoj0(new efj0(String.valueOf(size))) : vvb1.N;
                            String str6 = tariffInfoGroupDefinition2.a;
                            String str7 = tariffInfoGroupDefinition2.d;
                            if (str7 == null) {
                                str7 = "";
                            }
                            String X = kotlin.collections.a.X(arrayList12, Extension.FIX_SPACE, null, null, null, 62);
                            TariffInfoGroupDefinitionImages tariffInfoGroupDefinitionImages = tariffInfoGroupDefinition2.h;
                            emptyList = Collections.singletonList(new apj0(str6, str7, X, tariffInfoGroupDefinitionImages != null ? tariffInfoGroupDefinitionImages.a : null, false, null, true, null, xoj0Var, null, null, Boolean.TRUE, null, false));
                        } else if (i2 == 2) {
                            ?? arrayList13 = new ArrayList();
                            Iterator it21 = list11.iterator();
                            while (it21.hasNext()) {
                                String str8 = (String) it21.next();
                                Iterator it22 = list9.iterator();
                                while (true) {
                                    if (!it22.hasNext()) {
                                        it4 = it21;
                                        lmw0Var2 = 0;
                                        break;
                                    }
                                    lmw0Var2 = it22.next();
                                    it4 = it21;
                                    if (jl40.l(((lmw0) lmw0Var2).getName(), str8)) {
                                        break;
                                    }
                                    it21 = it4;
                                }
                                lmw0 lmw0Var6 = lmw0Var2;
                                apj0 a2 = (lmw0Var6 == null || jhu0Var.a(lmw0Var6)) ? null : a(lmw0Var6);
                                if (a2 != null) {
                                    arrayList13.add(a2);
                                }
                                it21 = it4;
                            }
                            it2 = it11;
                            emptyList = arrayList13;
                        } else {
                            if (i2 != 3 && i2 != 4) {
                                w511.b();
                                return null;
                            }
                            it2 = it11;
                            emptyList = emptyList2;
                        }
                        hashSet.addAll(list11);
                        linkedHashMap.put(str4, emptyList);
                        f = list9;
                        it11 = it2;
                        list3 = list10;
                        it5 = it;
                    }
                }
            }
        }
    }
}
