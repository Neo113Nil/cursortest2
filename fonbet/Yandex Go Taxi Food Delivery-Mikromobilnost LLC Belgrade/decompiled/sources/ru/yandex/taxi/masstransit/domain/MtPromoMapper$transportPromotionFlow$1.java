package ru.yandex.taxi.masstransit.domain;

import com.yandex.go.analytics.realtime.event.CreativeType;
import defpackage.dei0;
import defpackage.gs30;
import defpackage.h540;
import defpackage.i540;
import defpackage.lei0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li540;", "promoInfo", "Lzy11;", "<anonymous>", "(Li540;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtPromoMapper$transportPromotionFlow$1", f = "MtPromoMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtPromoMapper$transportPromotionFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gs30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPromoMapper$transportPromotionFlow$1(gs30 gs30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gs30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtPromoMapper$transportPromotionFlow$1 mtPromoMapper$transportPromotionFlow$1 = new MtPromoMapper$transportPromotionFlow$1(this.this$0, continuation);
        mtPromoMapper$transportPromotionFlow$1.L$0 = obj;
        return mtPromoMapper$transportPromotionFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtPromoMapper$transportPromotionFlow$1 mtPromoMapper$transportPromotionFlow$1 = (MtPromoMapper$transportPromotionFlow$1) create((i540) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtPromoMapper$transportPromotionFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i540 i540Var = (i540) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gs30 gs30Var = this.this$0;
        h540 h540Var = gs30Var.d;
        if (i540Var != null && !i540Var.equals(gs30Var.e)) {
            h540Var.d.clear();
            for (MtSummaryCommunicationsResponse.a aVar : i540Var.a.a.a.a) {
                dei0 dei0Var = h540Var.b;
                CreativeType creativeType = CreativeType.PromoOnSummary;
                String str = aVar.a;
                Map map = aVar.h;
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                ((com.yandex.go.analytics.realtime.a) dei0Var).d(new lei0(creativeType, str, map));
            }
        }
        return zy11.a;
    }
}
