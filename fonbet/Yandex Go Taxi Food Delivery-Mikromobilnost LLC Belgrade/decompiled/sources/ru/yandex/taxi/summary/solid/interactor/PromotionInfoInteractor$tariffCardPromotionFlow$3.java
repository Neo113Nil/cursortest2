package ru.yandex.taxi.summary.solid.interactor;

import defpackage.kb5;
import defpackage.mvg;
import defpackage.nmv0;
import defpackage.nnv0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tmv0;
import defpackage.zkv0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.ConfigurationType;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "alternative", "", "<unused var>", "Lnnv0;", "<anonymous>", "(ZLjava/lang/Object;)Lnnv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$tariffCardPromotionFlow$3", f = "PromotionInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$tariffCardPromotionFlow$3 extends SuspendLambda implements zls {
    final /* synthetic */ kb5 $info;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$tariffCardPromotionFlow$3(p pVar, kb5 kb5Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = pVar;
        this.$info = kb5Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PromotionInfoInteractor$tariffCardPromotionFlow$3 promotionInfoInteractor$tariffCardPromotionFlow$3 = new PromotionInfoInteractor$tariffCardPromotionFlow$3(this.this$0, this.$info, (Continuation) obj3);
        promotionInfoInteractor$tariffCardPromotionFlow$3.Z$0 = booleanValue;
        return promotionInfoInteractor$tariffCardPromotionFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.summary.promotions.repository.e eVar = this.this$0.e;
        kb5 kb5Var = this.$info;
        tmv0 j = eVar.j(kb5Var.b, kb5Var.a, z, Collections.singletonList(SummaryPromotionsResponse.DisplayOnType.TARIFF_CARD), scc.g(ConfigurationType.LIST, ConfigurationType.DIALOGUE));
        Iterator it = j.a.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((zkv0) next).m;
                do {
                    Object next2 = it.next();
                    int i2 = ((zkv0) next2).m;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        zkv0 zkv0Var = (zkv0) next;
        return new nnv0(zkv0Var != null ? new nmv0(zkv0Var, j.b) : null, null);
    }
}
