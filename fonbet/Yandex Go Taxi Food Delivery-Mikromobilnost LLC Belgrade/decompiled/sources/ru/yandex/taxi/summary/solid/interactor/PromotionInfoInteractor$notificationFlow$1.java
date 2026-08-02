package ru.yandex.taxi.summary.solid.interactor;

import defpackage.gsc;
import defpackage.mvg;
import defpackage.nnv0;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgsc;", "Lnnv0;", "promo", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lnmv0;", "<anonymous>", "(Lgsc;Lru/yandex/taxi/theme/ThemeType;)Lgsc;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$notificationFlow$1", f = "PromotionInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$notificationFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PromotionInfoInteractor$notificationFlow$1 promotionInfoInteractor$notificationFlow$1 = new PromotionInfoInteractor$notificationFlow$1(3, (Continuation) obj3);
        promotionInfoInteractor$notificationFlow$1.L$0 = (gsc) obj;
        return promotionInfoInteractor$notificationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gsc gscVar = (gsc) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new gsc(gscVar.a, ((nnv0) gscVar.b).a);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
