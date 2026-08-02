package defpackage;

import com.connectsdk.service.DeviceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class ngk extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ogk s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ngk(ogk ogkVar, int i) {
        super(1);
        this.r = i;
        this.s = ogkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                ArrayList arrayList = wleVar.d;
                boolean z = wleVar.c;
                ogk ogkVar = this.s;
                if (z) {
                    ogkVar.getClass();
                }
                return new bg2(arrayList, false, wleVar.b && ogkVar.b != null, bfg.y(wleVar, "sbp_qr"), bfg.y(wleVar, "sbp_token"), false);
            case 1:
                bg2 bg2Var = (bg2) obj;
                bg2Var.getClass();
                return this.s.d.a(bg2Var);
            default:
                bg2 bg2Var2 = (bg2) obj;
                bg2Var2.getClass();
                g0c g0cVar = this.s.c;
                List list = bg2Var2.a;
                boolean z2 = bg2Var2.f;
                boolean z3 = bg2Var2.e;
                boolean z4 = bg2Var2.d;
                boolean z5 = bg2Var2.c;
                boolean z6 = bg2Var2.b;
                List list2 = list;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new jkr(((qfk) it.next()).d));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    qfk qfkVar = (qfk) obj2;
                    qfkVar.getClass();
                    if (qfkVar.j == ufk.SbpToken) {
                        arrayList3.add(obj2);
                    }
                }
                int size = arrayList3.size();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    qfk qfkVar2 = (qfk) obj3;
                    qfkVar2.getClass();
                    r8k r8kVar = qfkVar2.l;
                    if (r8kVar != null ? r8kVar.a : false) {
                        arrayList4.add(obj3);
                    }
                }
                int size2 = arrayList4.size();
                int size3 = list.size();
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((qfk) it2.next()).d);
                }
                String o = ouj.o(ouj.o(ouj.o(ouj.o(ouj.o((ouj.o(k5r.i(size3, "Доступные методы оплаты: количество привязанных карт - "), "; платежные системы - ", CollectionsKt.X(arrayList5, ", ", null, null, null, 62)) + "; количество сохраненных СБП токенов - " + size) + "; количество сохраненных счетов в Яндекс-Банке - " + size2, "; оплата через ApplePay ", z6 ? "доступна" : "не доступна"), "; оплата через GooglePay ", z5 ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей ", z4 ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ", z3 ? "доступна" : "не доступна"), "; оплата наличными ", z2 ? "доступна" : "не доступна");
                z9h z9hVar = new z9h();
                z9hVar.i(size3, "stored_cards_count");
                my0 my0Var = new my0(arrayList2);
                Map map = z9hVar.b;
                w1g.B(map, "stored_cards_systems", my0Var);
                z9hVar.i(size, "stored_sbp_tokens_count");
                z9hVar.i(size2, "stored_yandex_bank_count");
                z9hVar.h("apple_pay_available", z6);
                z9hVar.h("google_pay_available", z5);
                z9hVar.h("spb_qr_available", z4);
                z9hVar.h("new_sbp_token_available", z3);
                z9hVar.h("cash_available", z2);
                z9hVar.j(DeviceService.KEY_DESC, o);
                map.getClass();
                vtm vtmVar = new vtm(map);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                ((x60) g0cVar).a(su4.j(vtmVar, "event_name", "resolved_available_methods", "resolved_available_methods", vtmVar));
                return bg2Var2;
        }
    }
}
