package ru.yandex.taxi.summary.solid.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zkv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhk60;", "<anonymous>", "(Ltse;)Lhk60;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.interactor.PromotionInfoInteractor$mapBottomNotification$2$trail$1", f = "PromotionInfoInteractor.kt", l = {238}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PromotionInfoInteractor$mapBottomNotification$2$trail$1 extends SuspendLambda implements wls {
    final /* synthetic */ zkv0 $promo;
    final /* synthetic */ boolean $switched;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionInfoInteractor$mapBottomNotification$2$trail$1(p pVar, zkv0 zkv0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$promo = zkv0Var;
        this.$switched = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionInfoInteractor$mapBottomNotification$2$trail$1(this.this$0, this.$promo, this.$switched, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionInfoInteractor$mapBottomNotification$2$trail$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        p pVar = this.this$0;
        zkv0 zkv0Var = this.$promo;
        boolean z = this.$switched;
        this.label = 1;
        Object a = p.a(pVar, zkv0Var, z, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
