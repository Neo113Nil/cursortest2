package ru.yandex.taxi.tariffs.data;

import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsUnavailableTextsExperiment;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.dto.response.c;
import defpackage.abl0;
import defpackage.bco;
import defpackage.cf31;
import defpackage.com0;
import defpackage.cq40;
import defpackage.dai0;
import defpackage.df31;
import defpackage.dy6;
import defpackage.e2k;
import defpackage.en40;
import defpackage.ffx;
import defpackage.fom0;
import defpackage.h73;
import defpackage.hct;
import defpackage.is60;
import defpackage.jgv;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.kjz;
import defpackage.lmw0;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.oox0;
import defpackage.pex0;
import defpackage.qp40;
import defpackage.qze0;
import defpackage.so40;
import defpackage.sze0;
import defpackage.tcc;
import defpackage.viq0;
import defpackage.viv0;
import defpackage.wjx0;
import defpackage.wp40;
import defpackage.yal0;
import defpackage.ybo;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes10.dex */
public final class a {
    public final jgv a;
    public final sze0 b;
    public final viv0 c;
    public final bco d;
    public final g e;
    public final wp40 f;
    public final cq40 g;
    public final so40 h;
    public final qp40 i;
    public final dy6 j;
    public final hct k;
    public final kjz l;

    public a(jgv jgvVar, sze0 sze0Var, viv0 viv0Var, bco bcoVar, g gVar, wp40 wp40Var, cq40 cq40Var, so40 so40Var, qp40 qp40Var, dy6 dy6Var, hct hctVar, kjz kjzVar) {
        this.a = jgvVar;
        this.b = sze0Var;
        this.c = viv0Var;
        this.d = bcoVar;
        this.e = gVar;
        this.f = wp40Var;
        this.g = cq40Var;
        this.h = so40Var;
        this.i = qp40Var;
        this.j = dy6Var;
        this.k = hctVar;
        this.l = kjzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x035f  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pex0 a(yal0 yal0Var, cf31 cf31Var, LinkedHashMap linkedHashMap, pex0 pex0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        EmptyList emptyList;
        EmptyList emptyList2;
        boolean z4;
        boolean z5;
        Boolean valueOf;
        Object obj;
        String str;
        ArrayList arrayList2;
        Iterator it;
        fom0 fom0Var;
        fom0 fom0Var2;
        Iterator it2;
        ArrayList arrayList3;
        Object obj2;
        boolean z6 = cf31Var.l;
        SelectionRules selectionRules = cf31Var.g;
        String str2 = cf31Var.a;
        df31 df31Var = cf31Var.f;
        if (z6) {
            ArrayList arrayList4 = cf31Var.c;
            List s = b.s(b.o(new e2k(0, new yw01(new h73(1, arrayList4), VerticalMulticlassFactory$create$supportedTariffs$1.b), new abl0(17)), new wjx0(linkedHashMap, 1)));
            if (!s.isEmpty() && s.size() >= selectionRules.a.a) {
                List list = s;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add(((pex0) it3.next()).b);
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    viq0 viq0Var = (viq0) obj3;
                    if (viq0Var.b && linkedHashSet.contains(viq0Var.a)) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((viq0) it4.next()).a);
                }
                Set N0 = kotlin.collections.a.N0(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : list) {
                    if (N0.contains(((pex0) obj4).b)) {
                        arrayList7.add(obj4);
                    }
                }
                List list2 = arrayList7.isEmpty() ? s : arrayList7;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        if (((pex0) it5.next()).X) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                jn40 jn40Var = pex0Var.V;
                boolean z7 = jn40Var != null ? jn40Var.i : false;
                wp40 wp40Var = this.f;
                if (z7) {
                    wp40Var.getClass();
                    z2 = wp40.a(s, N0);
                } else {
                    z2 = false;
                }
                if (z7) {
                    wp40Var.getClass();
                    z3 = wp40.b(s, N0);
                } else {
                    z3 = false;
                }
                EmptyList emptyList3 = EmptyList.a;
                if (z7) {
                    ?? a = this.g.a(s, N0, cf31Var.n && ((MulticlassTariffsUnavailableTextsExperiment) this.j.b.b()).b);
                    ArrayList a2 = this.k.a(str2, "multiclass", emptyList3);
                    if (a2.isEmpty()) {
                        arrayList = arrayList7;
                        emptyList = a;
                    } else {
                        Iterable iterable = (Iterable) a;
                        arrayList = arrayList7;
                        ?? arrayList8 = new ArrayList(tcc.n(iterable, 10));
                        Iterator it6 = iterable.iterator();
                        while (it6.hasNext()) {
                            lmw0 lmw0Var = (lmw0) it6.next();
                            Iterator it7 = a2.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    it2 = it6;
                                    arrayList3 = a2;
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it7.next();
                                it2 = it6;
                                arrayList3 = a2;
                                if (jl40.l(((RequirementOverrideDto) obj2).a, lmw0Var.getName())) {
                                    break;
                                }
                                it6 = it2;
                                a2 = arrayList3;
                            }
                            RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) obj2;
                            if (requirementOverrideDto != null) {
                                lmw0Var = ffx.h0(lmw0Var, requirementOverrideDto, "multiclass");
                            }
                            arrayList8.add(lmw0Var);
                            it6 = it2;
                            a2 = arrayList3;
                        }
                        linkedHashSet = linkedHashSet;
                        emptyList = arrayList8;
                    }
                } else {
                    arrayList = arrayList7;
                    emptyList = emptyList3;
                }
                if (z7) {
                    this.h.getClass();
                    emptyList2 = so40.a(s, N0);
                } else {
                    emptyList2 = emptyList3;
                }
                this.i.getClass();
                List a3 = qp40.a(s, N0);
                String str3 = cf31Var.e;
                en40 en40Var = new en40(df31Var.a, df31Var.b, null, dai0.k(df31Var.c, selectionRules, this.e.a(str2)), df31Var.e, df31Var.d, cf31Var.i);
                Selector selector = pex0Var.N;
                TariffUnavailable tariffUnavailable = cf31Var.k;
                boolean z8 = false;
                jn40 jn40Var2 = new jn40(str3, en40Var, selector, tariffUnavailable, linkedHashSet, N0, cf31Var.j, selectionRules, z7, cf31Var.m, cf31Var.n);
                String str4 = tariffUnavailable != null ? tariffUnavailable.b : null;
                boolean z9 = !(str4 == null || str4.length() == 0);
                Iterator it8 = list.iterator();
                if (!it8.hasNext()) {
                    ny61.p();
                    return null;
                }
                int i = ((pex0) it8.next()).o0;
                while (it8.hasNext()) {
                    int i2 = ((pex0) it8.next()).o0;
                    if (i > i2) {
                        i = i2;
                    }
                }
                TariffSource tariffSource = yal0Var == null ? TariffSource.ZONE_INFO : yal0Var.t ? TariffSource.ZONE_INFO_AND_LIGHTWEIGHT_ROUTE_STATS : TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS;
                SearchScreen searchScreen = df31Var.e;
                String str5 = cf31Var.e;
                TariffCard.Companion.getClass();
                TariffCard tariffCard = new TariffCard(emptyList3, 12);
                int i3 = pex0Var.n;
                HashSet hashSet = new HashSet(jn40Var2.g);
                if (!arrayList.isEmpty()) {
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        if (((pex0) it9.next()).C) {
                            z4 = true;
                            break;
                        }
                    }
                }
                z4 = false;
                if (!arrayList.isEmpty()) {
                    Iterator it10 = arrayList.iterator();
                    while (it10.hasNext()) {
                        if (((pex0) it10.next()).z) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if (arrayList.isEmpty()) {
                    valueOf = null;
                } else {
                    if (!arrayList.isEmpty()) {
                        Iterator it11 = arrayList.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                break;
                            }
                            pex0 pex0Var2 = (pex0) it11.next();
                            Boolean bool = pex0Var2.x;
                            if (bool != null ? bool.booleanValue() : pex0Var2.z) {
                                z8 = true;
                                break;
                            }
                        }
                    }
                    valueOf = Boolean.valueOf(z8);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it12 = arrayList.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it12.next();
                        pex0 pex0Var3 = (pex0) obj;
                        Boolean bool2 = pex0Var3.x;
                        if (bool2 != null ? bool2.booleanValue() : pex0Var3.z) {
                            break;
                        }
                    }
                    pex0 pex0Var4 = (pex0) obj;
                    if (pex0Var4 != null) {
                        str = pex0Var4.y;
                        oox0 oox0Var = pex0Var.r;
                        n7v n7vVar = cf31Var.d;
                        jgv jgvVar = this.a;
                        String a4 = n7vVar == null ? jgvVar.a(n7vVar) : pex0Var.j;
                        TariffSource tariffSource2 = tariffSource;
                        int i4 = i;
                        String a5 = jgvVar.a(new n7v(this.c.d(str2, "multiclass", true), 29));
                        boolean z10 = cf31Var.h;
                        f5 f5Var = cf31Var.m;
                        qze0 d = yal0Var == null ? sze0.d(this.b, yal0Var, df31Var.a, df31Var.b) : null;
                        c cVar = cf31Var.i;
                        this.d.getClass();
                        ybo a6 = bco.a(cVar);
                        is60 is60Var = pex0Var.J0.b;
                        List list3 = cf31Var.o;
                        arrayList2 = new ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            fom0 fom0Var3 = ((pex0) it.next()).D0;
                            if (fom0Var3 != null) {
                                arrayList2.add(fom0Var3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                Iterator it13 = arrayList2.iterator();
                                while (it13.hasNext()) {
                                    if (!jl40.l((fom0) it13.next(), kotlin.collections.a.P(arrayList2))) {
                                        fom0Var = com0.a;
                                        break;
                                    }
                                }
                            }
                            fom0Var = (fom0) kotlin.collections.a.P(arrayList2);
                            fom0Var2 = fom0Var;
                        } else {
                            fom0Var2 = null;
                        }
                        TariffUnavailable tariffUnavailable2 = cf31Var.k;
                        return new pex0(tariffSource2, "multiclass", emptyList, null, a3, emptyList2, is60Var, a6, a5, a4, null, str5, d, i3, null, null, null, oox0Var, false, z10, z9, false, false, valueOf, str, z5, z3, z2, z4, str4, tariffUnavailable2 == null ? tariffUnavailable2.c : null, null, null, tariffUnavailable2 == null ? tariffUnavailable2.d : null, this.l.i(tariffUnavailable2), null, null, hashSet, 0, null, null, false, false, null, list3, null, s, jn40Var2, null, z, null, null, null, null, null, null, false, null, tariffCard, null, searchScreen, null, null, null, i4, null, null, null, null, null, null, null, f5Var, null, null, null, null, null, null, fom0Var2, null, null, null, null, 0, -2140814328, -1342361639, 8256507);
                    }
                }
                str = null;
                oox0 oox0Var2 = pex0Var.r;
                n7v n7vVar2 = cf31Var.d;
                jgv jgvVar2 = this.a;
                String a42 = n7vVar2 == null ? jgvVar2.a(n7vVar2) : pex0Var.j;
                TariffSource tariffSource22 = tariffSource;
                int i42 = i;
                String a52 = jgvVar2.a(new n7v(this.c.d(str2, "multiclass", true), 29));
                boolean z102 = cf31Var.h;
                f5 f5Var2 = cf31Var.m;
                if (yal0Var == null) {
                }
                c cVar2 = cf31Var.i;
                this.d.getClass();
                ybo a62 = bco.a(cVar2);
                is60 is60Var2 = pex0Var.J0.b;
                List list32 = cf31Var.o;
                arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                if (arrayList2.isEmpty()) {
                }
                TariffUnavailable tariffUnavailable22 = cf31Var.k;
                return new pex0(tariffSource22, "multiclass", emptyList, null, a3, emptyList2, is60Var2, a62, a52, a42, null, str5, d, i3, null, null, null, oox0Var2, false, z102, z9, false, false, valueOf, str, z5, z3, z2, z4, str4, tariffUnavailable22 == null ? tariffUnavailable22.c : null, null, null, tariffUnavailable22 == null ? tariffUnavailable22.d : null, this.l.i(tariffUnavailable22), null, null, hashSet, 0, null, null, false, false, null, list32, null, s, jn40Var2, null, z, null, null, null, null, null, null, false, null, tariffCard, null, searchScreen, null, null, null, i42, null, null, null, null, null, null, null, f5Var2, null, null, null, null, null, null, fom0Var2, null, null, null, null, 0, -2140814328, -1342361639, 8256507);
            }
        }
        return null;
    }
}
