package ru.yandex.taxi.promotions.storage;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion;", "T", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.promotions.storage.PromotionsStorageImpl$promotionRemovedListener$1", f = "PromotionsStorageImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PromotionsStorageImpl$promotionRemovedListener$1 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionsStorageImpl$promotionRemovedListener$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PromotionsStorageImpl$promotionRemovedListener$1 promotionsStorageImpl$promotionRemovedListener$1 = (PromotionsStorageImpl$promotionRemovedListener$1) create((Promotion) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        promotionsStorageImpl$promotionRemovedListener$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
