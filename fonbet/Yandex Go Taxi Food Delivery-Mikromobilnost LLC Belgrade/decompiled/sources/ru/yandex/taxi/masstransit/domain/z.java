package ru.yandex.taxi.masstransit.domain;

import defpackage.a040;
import defpackage.c4v;
import defpackage.g540;
import defpackage.gs30;
import defpackage.gw00;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.q051;
import defpackage.t051;
import defpackage.tcc;
import defpackage.uzg;
import defpackage.vpr;
import defpackage.w051;
import defpackage.x051;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

/* loaded from: classes6.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ gs30 c;

    public z(vpr vprVar, Map map, gs30 gs30Var) {
        this.a = vprVar;
        this.b = map;
        this.c = gs30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1 mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1;
        int i;
        Collection collection;
        String str;
        FormattedText formattedText;
        x051 x051Var;
        x051 q051Var;
        MtSummaryCommunicationsResponse.b bVar;
        MtSummaryCommunicationsResponse.c cVar;
        Collection collection2;
        MtSummaryCommunicationsResponse.b bVar2;
        MtSummaryCommunicationsResponse.c cVar2;
        if (continuation instanceof MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1) {
            mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1 = (MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    MtSummaryCommunicationsResponse mtSummaryCommunicationsResponse = (MtSummaryCommunicationsResponse) obj;
                    Collection collection3 = EmptyList.a;
                    if (mtSummaryCommunicationsResponse == null || (bVar2 = mtSummaryCommunicationsResponse.a) == null || (cVar2 = bVar2.a) == null || (collection = cVar2.a) == null) {
                        collection = collection3;
                    }
                    if (mtSummaryCommunicationsResponse != null && (bVar = mtSummaryCommunicationsResponse.a) != null && (cVar = bVar.a) != null && (collection2 = cVar.b) != null) {
                        collection3 = collection2;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : collection) {
                        MtSummaryCommunicationsResponse.a aVar = (MtSummaryCommunicationsResponse.a) obj3;
                        MtSummaryCommunicationsResponse.a.C0107a c0107a = aVar.g;
                        String str2 = aVar.a;
                        int i3 = c0107a.a;
                        Map map = this.b;
                        a040 a040Var = (a040) map.get(str2);
                        if (i3 > (a040Var != null ? a040Var.a : 0)) {
                            int i4 = aVar.g.b;
                            a040 a040Var2 = (a040) map.get(str2);
                            if (i4 > (a040Var2 != null ? a040Var2.b : 0)) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                    int i5 = 10;
                    int d = gw00.d(tcc.n(arrayList, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(((MtSummaryCommunicationsResponse.a) next).a, next);
                    }
                    Collection collection4 = collection3;
                    ArrayList arrayList2 = new ArrayList(tcc.n(collection4, 10));
                    Iterator it2 = collection4.iterator();
                    while (it2.hasNext()) {
                        MtSummaryCommunicationsResponse.d dVar = (MtSummaryCommunicationsResponse.d) it2.next();
                        List list = dVar.b;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            MtSummaryCommunicationsResponse.a aVar2 = (MtSummaryCommunicationsResponse.a) linkedHashMap.get((String) it3.next());
                            if (aVar2 != null) {
                                arrayList3.add(aVar2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, i5));
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            MtSummaryCommunicationsResponse.a aVar3 = (MtSummaryCommunicationsResponse.a) it4.next();
                            String str3 = aVar3.a;
                            String str4 = aVar3.b;
                            FormattedText formattedText2 = aVar3.c;
                            FormattedText formattedText3 = aVar3.d;
                            c4v c4vVar = aVar3.e;
                            int i6 = gs30.f;
                            Iterator it5 = it2;
                            gs30 gs30Var = this.c;
                            gs30Var.getClass();
                            String str5 = c4vVar.a;
                            String str6 = c4vVar.b;
                            if (str6 == null || str6.length() == 0) {
                                if (str5 == null || str5.length() == 0) {
                                    str = null;
                                    CommunicationItem.a aVar4 = aVar3.f;
                                    formattedText = aVar4.h;
                                    uzg uzgVar = aVar4.a;
                                    if (formattedText == null) {
                                        x051Var = new w051(formattedText);
                                    } else if (uzgVar != null) {
                                        q051Var = new q051(uzgVar);
                                        arrayList4.add(new g540(str3, str4, formattedText2, formattedText3, str, q051Var, aVar3.h, dVar.a));
                                        it2 = it5;
                                    } else {
                                        x051Var = t051.a;
                                    }
                                    q051Var = x051Var;
                                    arrayList4.add(new g540(str3, str4, formattedText2, formattedText3, str, q051Var, aVar3.h, dVar.a));
                                    it2 = it5;
                                } else {
                                    str6 = ((m7x0) gs30Var.b).a(str5);
                                }
                            }
                            str = str6;
                            CommunicationItem.a aVar42 = aVar3.f;
                            formattedText = aVar42.h;
                            uzg uzgVar2 = aVar42.a;
                            if (formattedText == null) {
                            }
                            q051Var = x051Var;
                            arrayList4.add(new g540(str3, str4, formattedText2, formattedText3, str, q051Var, aVar3.h, dVar.a));
                            it2 = it5;
                        }
                        arrayList2.add(arrayList4);
                        i5 = 10;
                    }
                    ArrayList o = tcc.o(arrayList2);
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.L$0 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.L$1 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.L$2 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.L$3 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.L$4 = null;
                    mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.label = 1;
                    if (this.a.emit(o, mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1 = new MtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtPromoMapper$mapPromotions$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
