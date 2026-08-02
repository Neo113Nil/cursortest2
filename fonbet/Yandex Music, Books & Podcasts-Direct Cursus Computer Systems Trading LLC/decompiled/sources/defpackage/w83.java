package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class w83 extends oj implements pyc {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w83(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x054a, code lost:
    
        if (r6 == null) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0565  */
    @Override // defpackage.pyc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        List o0;
        List o02;
        qab pabVar;
        String str;
        Object obj5;
        List o03;
        Object obj6;
        List o04;
        Object obj7;
        List o05;
        Object obj8;
        List o06;
        int i = 26;
        int i2 = 25;
        int i3 = 2;
        switch (this.a) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                x83 x83Var = (x83) this.receiver;
                x83Var.getClass();
                if (list2.isEmpty()) {
                    return z83.a;
                }
                ((y83) x83Var.o.getValue()).getClass();
                list.getClass();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj4 = it.next();
                        if (((vbc) obj4).b()) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                vbc vbcVar = (vbc) obj4;
                int ordinal = (vbcVar != null ? y83.a(vbcVar) : zea.a).ordinal();
                if (ordinal == 0) {
                    o0 = CollectionsKt.o0(list2, new C1318t(i));
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    o0 = CollectionsKt.o0(list2, new C1318t(i2));
                }
                List<jja> list3 = o0;
                ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                for (jja jjaVar : list3) {
                    arrayList.add(new gdj(((cej) x83Var.p.getValue()).a(jjaVar.a, false), jjaVar.a));
                }
                return new a93(arrayList);
            case 1:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                ru4 ru4Var = (ru4) this.receiver;
                ru4Var.getClass();
                if (list5.isEmpty()) {
                    return uu4.a;
                }
                ((tu4) ru4Var.s.getValue()).getClass();
                i10 a = tu4.a(list4);
                int ordinal2 = a.ordinal();
                if (ordinal2 == 0) {
                    o02 = CollectionsKt.o0(list5, new dl4(4));
                } else if (ordinal2 != 1) {
                    int i4 = 3;
                    if (ordinal2 == 2) {
                        o02 = CollectionsKt.o0(list5, new dl4(i4));
                    } else {
                        if (ordinal2 != 3) {
                            b6e.s();
                            return null;
                        }
                        o02 = CollectionsKt.o0(list5, new dl4(5));
                    }
                } else {
                    o02 = CollectionsKt.o0(list5, new dl4(i3));
                }
                List<s75> list6 = o02;
                ArrayList arrayList2 = new ArrayList(v75.o(list6, 10));
                for (s75 s75Var : list6) {
                    if (s75Var instanceof q75) {
                        oq oqVar = ((q75) s75Var).a;
                        String w = vz1.w(oqVar.o);
                        String str2 = oqVar.b;
                        String x = etn.x(oqVar);
                        String str3 = x.length() > 0 ? x : null;
                        String o07 = etn.o0(oqVar);
                        pabVar = new oab(oqVar, new ru(oqVar.i(), w, str2, str3, o07.length() > 0 ? o07 : null, oqVar.g.b()));
                    } else {
                        if (!(s75Var instanceof r75)) {
                            b6e.s();
                            return null;
                        }
                        kjm kjmVar = ((r75) s75Var).a;
                        String w2 = vz1.w(kjmVar.e);
                        Date date = kjmVar.c;
                        String L = date != null ? saf.L(date) : null;
                        switch (kjmVar.d().ordinal()) {
                            case 0:
                            case 1:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                            case 2:
                                l18 l18Var = l18.b;
                                bdt I = hag.I(skr.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                L = avf.M(L, ((skr) qdcVar.C(I)).c(R.string.album_type_single));
                                str = L;
                                String str4 = kjmVar.f;
                                List<ljm> list7 = kjmVar.a;
                                list7.getClass();
                                StringBuilder sb = new StringBuilder();
                                for (ljm ljmVar : list7) {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(ljmVar.b);
                                }
                                pabVar = new pab(kjmVar, new nkm(kjmVar.l, w2, str4, sb.toString(), str, kjmVar.h.b()));
                                break;
                            case 3:
                                str = "";
                                String str42 = kjmVar.f;
                                List<ljm> list72 = kjmVar.a;
                                list72.getClass();
                                StringBuilder sb2 = new StringBuilder();
                                while (r6.hasNext()) {
                                }
                                pabVar = new pab(kjmVar, new nkm(kjmVar.l, w2, str42, sb2.toString(), str, kjmVar.h.b()));
                                break;
                            default:
                                b6e.s();
                                return null;
                        }
                    }
                    arrayList2.add(pabVar);
                }
                return new wu4(arrayList2, a);
            case 2:
                List list8 = (List) obj;
                List list9 = (List) obj2;
                ida idaVar = (ida) this.receiver;
                idaVar.getClass();
                if (list9.isEmpty()) {
                    return kda.a;
                }
                ((jda) idaVar.o.getValue()).getClass();
                list8.getClass();
                Iterator it2 = list8.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj5 = it2.next();
                        if (((vbc) obj5).b()) {
                        }
                    } else {
                        obj5 = null;
                    }
                }
                vbc vbcVar2 = (vbc) obj5;
                int ordinal3 = (vbcVar2 != null ? jda.a(vbcVar2) : xca.a).ordinal();
                if (ordinal3 == 0) {
                    o03 = CollectionsKt.o0(list9, new dl4(28));
                } else if (ordinal3 == 1) {
                    o03 = CollectionsKt.o0(list9, new dl4(i));
                } else {
                    if (ordinal3 != 2) {
                        b6e.s();
                        return null;
                    }
                    o03 = CollectionsKt.o0(list9, new dl4(27));
                }
                List list10 = o03;
                ArrayList arrayList3 = new ArrayList(v75.o(list10, 10));
                Iterator it3 = list10.iterator();
                while (it3.hasNext()) {
                    oq oqVar2 = ((kca) it3.next()).a;
                    String w3 = vz1.w(oqVar2.o);
                    String str5 = oqVar2.b;
                    String x2 = etn.x(oqVar2);
                    String str6 = x2.length() > 0 ? x2 : null;
                    String o08 = etn.o0(oqVar2);
                    arrayList3.add(new xt(oqVar2, new ru(oqVar2.i(), w3, str5, str6, o08.length() > 0 ? o08 : null, oqVar2.g.b())));
                }
                return new lda(arrayList3);
            case 3:
                List list11 = (List) obj;
                List list12 = (List) obj2;
                leb lebVar = (leb) this.receiver;
                lebVar.getClass();
                if (list12.isEmpty()) {
                    return ieb.a;
                }
                ((meb) lebVar.o.getValue()).getClass();
                list11.getClass();
                Iterator it4 = list11.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj6 = it4.next();
                        if (((vbc) obj6).b()) {
                        }
                    } else {
                        obj6 = null;
                    }
                }
                vbc vbcVar3 = (vbc) obj6;
                int ordinal4 = (vbcVar3 != null ? meb.a(vbcVar3) : bfa.a).ordinal();
                if (ordinal4 == 0) {
                    o04 = CollectionsKt.o0(list12, new zda(8));
                } else if (ordinal4 == 1) {
                    o04 = CollectionsKt.o0(list12, new zda(7));
                } else {
                    if (ordinal4 != 2) {
                        b6e.s();
                        return null;
                    }
                    int i5 = 6;
                    o04 = CollectionsKt.o0(list12, new eh(i5, new zda(i5)));
                }
                List<jja> list13 = o04;
                ArrayList arrayList4 = new ArrayList(v75.o(list13, 10));
                for (jja jjaVar2 : list13) {
                    arrayList4.add(new gdj(((cej) lebVar.p.getValue()).a(jjaVar2.a, false), jjaVar2.a));
                }
                return new jeb(arrayList4);
            case 4:
                ukj ukjVar = (ukj) obj;
                uwc uwcVar = (uwc) this.receiver;
                uwcVar.getClass();
                ywc ywcVar = ywc.a;
                if (!((x66) obj2).a && !(uwcVar.g.a.getValue() instanceof dxc)) {
                    return bxc.a;
                }
                if (ukjVar == null) {
                    return axc.a;
                }
                if (ukjVar instanceof tkj) {
                    LinkedHashMap linkedHashMap = ((tkj) ukjVar).a.b;
                    if (!linkedHashMap.isEmpty()) {
                        Map.Entry entry = (Map.Entry) CollectionsKt.R(linkedHashMap.entrySet());
                        bve bveVar = entry != null ? (bve) entry.getValue() : null;
                        return bveVar != null ? new dxc(bveVar) : zwc.a;
                    }
                } else if (!(ukjVar instanceof skj)) {
                    b6e.s();
                    return null;
                }
                return ywcVar;
            case 5:
                List list14 = (List) obj;
                List list15 = (List) obj2;
                cff cffVar = (cff) this.receiver;
                cffVar.getClass();
                if (list15.isEmpty()) {
                    return iff.a;
                }
                ((gff) cffVar.o.getValue()).getClass();
                list14.getClass();
                Iterator it5 = list14.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj7 = it5.next();
                        if (((vbc) obj7).b()) {
                        }
                    } else {
                        obj7 = null;
                    }
                }
                vbc vbcVar4 = (vbc) obj7;
                int ordinal5 = (vbcVar4 != null ? gff.a(vbcVar4) : dfa.a).ordinal();
                if (ordinal5 == 0) {
                    o05 = CollectionsKt.o0(list15, new zda(22));
                } else {
                    if (ordinal5 != 1) {
                        b6e.s();
                        return null;
                    }
                    o05 = CollectionsKt.o0(list15, new zda(21));
                }
                List<gga> list16 = o05;
                ArrayList arrayList5 = new ArrayList(v75.o(list16, 10));
                for (gga ggaVar : list16) {
                    iwl iwlVar = iwl.a;
                    arrayList5.add(new qvl(iwl.a(ggaVar.a, ((z66) cffVar.p.getValue()).h()), ggaVar.a));
                }
                return new lff(arrayList5);
            case 6:
                List list17 = (List) obj;
                List list18 = (List) obj2;
                dff dffVar = (dff) this.receiver;
                dffVar.getClass();
                if (list18.isEmpty()) {
                    return jff.a;
                }
                ((hff) dffVar.t.getValue()).getClass();
                list17.getClass();
                Iterator it6 = list17.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj8 = it6.next();
                        if (((vbc) obj8).b()) {
                        }
                    } else {
                        obj8 = null;
                    }
                }
                vbc vbcVar5 = (vbc) obj8;
                int ordinal6 = (vbcVar5 != null ? hff.a(vbcVar5) : nef.a).ordinal();
                if (ordinal6 == 0) {
                    o06 = CollectionsKt.o0(list18, new zda(24));
                } else if (ordinal6 == 1) {
                    o06 = CollectionsKt.o0(list18, new zda(i2));
                } else {
                    if (ordinal6 != 2) {
                        b6e.s();
                        return null;
                    }
                    o06 = CollectionsKt.o0(list18, new zda(23));
                }
                List<cvl> list19 = o06;
                ArrayList arrayList6 = new ArrayList(v75.o(list19, 10));
                for (cvl cvlVar : list19) {
                    iwl iwlVar2 = iwl.a;
                    arrayList6.add(new rvl(iwl.a(cvlVar, ((z66) dffVar.s.getValue()).h()), cvlVar));
                }
                return new mff(arrayList6);
            case 7:
                xyo xyoVar = (xyo) obj;
                String str7 = (String) obj2;
                ((cwj) this.receiver).getClass();
                if (xyoVar instanceof vyo) {
                    return md6.a;
                }
                if (xyoVar instanceof wyo) {
                    return new od6((cu8) ((wyo) xyoVar).a, str7);
                }
                if (xyoVar == null) {
                    return qd6.a;
                }
                b6e.s();
                return null;
            case 8:
                pu1 pu1Var = (pu1) obj;
                j1g j1gVar = (j1g) obj2;
                ((tu1) this.receiver).getClass();
                pu1Var.getClass();
                j1gVar.getClass();
                int ordinal7 = j1gVar.ordinal();
                if (ordinal7 == 0) {
                    return pu1.a;
                }
                if (ordinal7 == 1) {
                    int ordinal8 = pu1Var.ordinal();
                    return ordinal8 != 0 ? ordinal8 != 2 ? pu1.e : pu1.d : pu1.b;
                }
                if (ordinal7 == 2) {
                    return pu1.c;
                }
                b6e.s();
                return null;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                ((oqw) this.receiver).getClass();
                if (booleanValue) {
                    return iqw.b;
                }
                if (booleanValue2) {
                    return iqw.a;
                }
                return null;
        }
    }
}
