package com.yandex.plus.home.feature.webviews.internal.webview;

import com.yandex.plus.core.graphql.fragment.w2;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.pulse.metrics.o;
import defpackage.cp0;
import defpackage.g4f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                g4fVar.f = "dtoMessageType";
                g4fVar.g = true;
                break;
            case 1:
                g4f g4fVar2 = (g4f) obj;
                g4fVar2.getClass();
                g4fVar2.c = true;
                g4fVar2.f = "dtoMessageType";
                g4fVar2.g = true;
                break;
            case 2:
                g4f g4fVar3 = (g4f) obj;
                g4fVar3.getClass();
                g4fVar3.c = true;
                break;
            case 3:
                w2 w2Var = (w2) obj;
                w2Var.getClass();
                break;
            case 4:
                g4f g4fVar4 = (g4f) obj;
                g4fVar4.getClass();
                g4fVar4.c = true;
                g4fVar4.a = true;
                break;
            case 5:
                g4f g4fVar5 = (g4f) obj;
                g4fVar5.getClass();
                g4fVar5.c = true;
                g4fVar5.a = true;
                g4fVar5.g = true;
                break;
            case 6:
                com.yandex.plus.home.plaque.feature.api.context.b bVar = (com.yandex.plus.home.plaque.feature.api.context.b) obj;
                bVar.getClass();
                break;
            case 7:
                com.yandex.plus.home.plaque.feature.api.context.b bVar2 = (com.yandex.plus.home.plaque.feature.api.context.b) obj;
                bVar2.getClass();
                break;
            case 8:
                g4f g4fVar6 = (g4f) obj;
                g4fVar6.getClass();
                g4fVar6.c = true;
                g4fVar6.e = true;
                break;
            case 9:
                g4f g4fVar7 = (g4f) obj;
                g4fVar7.getClass();
                g4fVar7.c = true;
                g4fVar7.e = true;
                break;
            case 10:
                com.yandex.plus.pay.api.analytics.e eVar = (com.yandex.plus.pay.api.analytics.e) obj;
                eVar.getClass();
                break;
            case 11:
                List list = (List) obj;
                list.getClass();
                break;
            case 12:
                List list2 = (List) obj;
                list2.getClass();
                break;
            case 13:
                cp0 cp0Var = (cp0) obj;
                cp0Var.getClass();
                break;
            case 14:
                g4f g4fVar8 = (g4f) obj;
                g4fVar8.getClass();
                g4fVar8.c = true;
                g4fVar8.e = true;
                break;
            case 15:
                PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) obj;
                option.getClass();
                break;
            case 16:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar.getClass();
                jVar.d(R.string.PlusPay_Error_TimeoutNoSuccess_Title);
                jVar.c(R.string.PlusPay_Error_TimeoutNoSuccess_Subtitle);
                jVar.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.b);
                jVar.a("P015");
                break;
            case 17:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar2 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar2.getClass();
                jVar2.d(R.string.PlusPay_Error_ExpiredCard_Title);
                jVar2.c(R.string.PlusPay_Error_ExpiredCard_Subtitle);
                jVar2.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.c);
                jVar2.a("P006");
                break;
            case 18:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar3 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar3.getClass();
                jVar3.d(R.string.PlusPay_Error_Fail3ds_Title);
                jVar3.c(R.string.PlusPay_Error_Fail3ds_Subtitle);
                jVar3.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.b);
                jVar3.a("P004");
                break;
            case 19:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar4 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar4.getClass();
                jVar4.d(R.string.PlusPay_Error_OperationCancelled_Title);
                jVar4.c(R.string.PlusPay_Error_OperationCancelled_Subtitle);
                com.yandex.plus.pay.ui.common.internal.error.content.e eVar2 = com.yandex.plus.pay.ui.common.internal.error.content.e.b;
                ArrayList arrayList = jVar4.g;
                arrayList.add(eVar2);
                arrayList.add(com.yandex.plus.pay.ui.common.internal.error.content.e.c);
                jVar4.a("P012");
                break;
            case 20:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar5 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar5.getClass();
                jVar5.d(R.string.PlusPay_Error_Unknown_Title);
                jVar5.c(R.string.PlusPay_Error_Unknown_Subtitle);
                jVar5.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.b);
                jVar5.a("P000");
                break;
            case 21:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar6 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar6.getClass();
                jVar6.d(R.string.PlusPay_Error_UserCancelled_Title);
                jVar6.c(R.string.PlusPay_Error_UserCancelled_Subtitle);
                jVar6.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.b);
                jVar6.a("P007");
                break;
            case 22:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar7 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar7.getClass();
                com.yandex.plus.pay.ui.common.internal.error.content.d.d(jVar7);
                jVar7.a("GP001");
                break;
            case 23:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar8 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar8.getClass();
                jVar8.d(R.string.PlusPay_Error_PaymentTimeout_Title);
                jVar8.c(R.string.PlusPay_Error_PaymentTimeout_Subtitle);
                jVar8.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.b);
                jVar8.a("P003");
                break;
            case 24:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar9 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar9.getClass();
                jVar9.d(R.string.PlusPay_Error_AuthorizationReject_Title);
                jVar9.c(R.string.PlusPay_Error_AuthorizationReject_Subtitle);
                com.yandex.plus.pay.ui.common.internal.error.content.e eVar3 = com.yandex.plus.pay.ui.common.internal.error.content.e.b;
                ArrayList arrayList2 = jVar9.g;
                arrayList2.add(eVar3);
                arrayList2.add(com.yandex.plus.pay.ui.common.internal.error.content.e.c);
                jVar9.a("P014");
                break;
            case 25:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar10 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar10.getClass();
                jVar10.d(R.string.PlusPay_Error_LimitExceeded_Title);
                jVar10.c(R.string.PlusPay_Error_LimitExceeded_Subtitle);
                com.yandex.plus.pay.ui.common.internal.error.content.e eVar4 = com.yandex.plus.pay.ui.common.internal.error.content.e.c;
                ArrayList arrayList3 = jVar10.g;
                arrayList3.add(eVar4);
                arrayList3.add(com.yandex.plus.pay.ui.common.internal.error.content.e.b);
                jVar10.a("P034");
                break;
            case 26:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar11 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar11.getClass();
                jVar11.d(R.string.PlusPay_Error_RestrictedCard_Title);
                jVar11.c(R.string.PlusPay_Error_RestrictedCard_Subtitle);
                jVar11.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.c);
                jVar11.a("P008");
                break;
            case 27:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar12 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar12.getClass();
                com.yandex.plus.pay.ui.common.internal.error.content.d.d(jVar12);
                jVar12.a("GP002");
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar13 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar13.getClass();
                com.yandex.plus.pay.ui.common.internal.error.content.d.d(jVar13);
                jVar13.a("GP003");
                break;
            default:
                com.yandex.plus.pay.ui.common.internal.error.content.j jVar14 = (com.yandex.plus.pay.ui.common.internal.error.content.j) obj;
                jVar14.getClass();
                jVar14.d(R.string.PlusPay_Error_TransactionNotPermitted_Title);
                jVar14.c(R.string.PlusPay_Error_TransactionNotPermitted_Subtitle);
                jVar14.g.add(com.yandex.plus.pay.ui.common.internal.error.content.e.c);
                jVar14.a("P016");
                break;
        }
        return Unit.a;
    }
}
