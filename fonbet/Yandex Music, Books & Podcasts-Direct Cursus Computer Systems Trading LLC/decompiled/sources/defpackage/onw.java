package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class onw {
    public static final String j = "YnisonShared:QueueDiffController";
    public final zzp a;
    public final agw b;
    public final phw c;
    public final amw d;
    public final fmw e;
    public final ndw f;
    public final tqw g;
    public final jiv h = new jiv(this);
    public final hjp i = new hjp(18, this);

    public onw(zzp zzpVar, wfw wfwVar, agw agwVar, phw phwVar, amw amwVar, fmw fmwVar, ndw ndwVar, slw slwVar, tqw tqwVar) {
        this.a = zzpVar;
        this.b = agwVar;
        this.c = phwVar;
        this.d = amwVar;
        this.e = fmwVar;
        this.f = ndwVar;
        this.g = tqwVar;
    }

    public final ArrayList a(List list, List list2) {
        jzs o0;
        jzs jzsVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            mwk mwkVar = (mwk) obj;
            mwkVar.getClass();
            kiw a0 = y5g.a0(mwkVar);
            Object obj2 = linkedHashMap.get(a0);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a0, obj2);
            }
            ((List) obj2).add(obj);
        }
        List<naq> list3 = list2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list3) {
            mwk mwkVar2 = (mwk) obj3;
            mwkVar2.getClass();
            kiw a02 = y5g.a0(mwkVar2);
            Object obj4 = linkedHashMap2.get(a02);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(a02, obj4);
            }
            ((List) obj4).add(obj3);
        }
        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
        for (naq naqVar : list3) {
            iiw iiwVar = naqVar.c;
            uow uowVar = naqVar.d;
            List list4 = (List) linkedHashMap2.get(iiwVar);
            if (list4 != null) {
                int indexOf = list4.indexOf(naqVar);
                List list5 = (List) linkedHashMap.get(iiwVar);
                o0 = null;
                if (list5 != null && (jzsVar = (jzs) CollectionsKt.S(list5, indexOf)) != null && Intrinsics.d(jzsVar.g, q7g.I(uowVar)) && Intrinsics.d(jzsVar.d, q7g.G(uowVar))) {
                    o0 = jzsVar;
                }
                if (o0 != null) {
                    arrayList.add(o0);
                }
            }
            o0 = o2g.o0(naqVar);
            arrayList.add(o0);
        }
        return arrayList;
    }
}
