package ru.yandex.taxi.experiments.superapp;

import defpackage.eaf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.superapp.EatsOrderBasedProductFetcher$start$1", f = "EatsOrderBasedProductFetcher.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EatsOrderBasedProductFetcher$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ eaf0 $productsParam;
    final /* synthetic */ yaf0 $productsScreenType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsOrderBasedProductFetcher$start$1(a aVar, yaf0 yaf0Var, eaf0 eaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$productsScreenType = yaf0Var;
        this.$productsParam = eaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsOrderBasedProductFetcher$start$1(this.this$0, this.$productsScreenType, this.$productsParam, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsOrderBasedProductFetcher$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            yaf0 yaf0Var = this.$productsScreenType;
            eaf0 eaf0Var = this.$productsParam;
            this.label = 1;
            if (a.a(aVar, yaf0Var, eaf0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
