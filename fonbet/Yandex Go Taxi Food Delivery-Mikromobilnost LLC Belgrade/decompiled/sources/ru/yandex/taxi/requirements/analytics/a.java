package ru.yandex.taxi.requirements.analytics;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.b580;
import defpackage.evu0;
import defpackage.je70;
import defpackage.lt70;
import defpackage.tcc;
import defpackage.yg70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes6.dex */
public final class a {
    public final lt70 a;

    public a(lt70 lt70Var) {
        this.a = lt70Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public final void a(Zone zone, List list) {
        Object obj;
        Object obj2;
        c cVar;
        Object obj3;
        yg70 yg70Var;
        List list2;
        Object obj4;
        ChildchairAnalytics$reportOrderDraftRequest$1 childchairAnalytics$reportOrderDraftRequest$1 = new ChildchairAnalytics$reportOrderDraftRequest$1(7, this.a, lt70.class, "orderDraftChildTariffChairRequirement", "orderDraftChildTariffChairRequirement(Ljava/lang/String;Ljava/util/List;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", 0);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (evu0.y(((b580) obj).a, "childchair", false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b580 b580Var = (b580) obj;
        if (b580Var == null) {
            return;
        }
        Iterator it2 = zone.k.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (evu0.y(((ZoneTariffInfo) obj2).e, "child_tariff", false)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) obj2;
        List list3 = zoneTariffInfo != null ? zoneTariffInfo.o : null;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj4 = it3.next();
                    if (evu0.y(((c) obj4).c, "childchair", false)) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            cVar = (c) obj4;
        } else {
            cVar = null;
        }
        Object obj5 = zone.a;
        Object obj6 = b580Var.e;
        Object valueOf = Integer.valueOf(list3 != null ? list3.size() : 0);
        Object valueOf2 = Integer.valueOf(cVar != null ? cVar.i.intValue() : 0);
        if (cVar == null || (yg70Var = cVar.g) == null || (list2 = yg70Var.c) == null) {
            obj3 = EmptyList.a;
        } else {
            List<je70> list4 = list2;
            obj3 = new ArrayList(tcc.n(list4, 10));
            for (je70 je70Var : list4) {
                obj3.add(je70Var.c + "|" + je70Var.a() + "|" + je70Var.b());
            }
        }
        childchairAnalytics$reportOrderDraftRequest$1.h(obj5, obj6, valueOf, valueOf2, obj3, zoneTariffInfo != null ? zoneTariffInfo.e : null, cVar != null ? cVar.c : null);
    }
}
