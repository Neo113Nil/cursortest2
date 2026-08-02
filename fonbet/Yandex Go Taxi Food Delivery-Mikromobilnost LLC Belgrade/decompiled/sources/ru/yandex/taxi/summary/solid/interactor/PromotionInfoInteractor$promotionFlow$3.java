package ru.yandex.taxi.summary.solid.interactor;

import defpackage.kb5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "alternative", "", "<unused var>", "Lnnv0;", "<anonymous>", "(ZLjava/lang/Object;)Lnnv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$promotionFlow$3", f = "PromotionInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$promotionFlow$3 extends SuspendLambda implements zls {
    final /* synthetic */ kb5 $info;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$promotionFlow$3(p pVar, kb5 kb5Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = pVar;
        this.$info = kb5Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PromotionInfoInteractor$promotionFlow$3 promotionInfoInteractor$promotionFlow$3 = new PromotionInfoInteractor$promotionFlow$3(this.this$0, this.$info, (Continuation) obj3);
        promotionInfoInteractor$promotionFlow$3.Z$0 = booleanValue;
        return promotionInfoInteractor$promotionFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.summary.promotions.repository.e eVar = this.this$0.e;
        kb5 kb5Var = this.$info;
        return eVar.k(kb5Var.b, kb5Var.a, z);
    }
}
