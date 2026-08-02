package ru.yandex.taxi.masstransit.datasource.routing;

import defpackage.ey30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "Lcom/yandex/mapkit/transport/masstransit/Route;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$2$mtRoutes$1", f = "MtRoutesRepository.kt", l = {81}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesRepository$collectRoutes$2$2$mtRoutes$1 extends SuspendLambda implements wls {
    final /* synthetic */ ey30 $configs;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesRepository$collectRoutes$2$2$mtRoutes$1(f fVar, ey30 ey30Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$configs = ey30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRoutesRepository$collectRoutes$2$2$mtRoutes$1(this.this$0, this.$configs, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesRepository$collectRoutes$2$2$mtRoutes$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            uu30 uu30Var = this.$configs.a;
            this.label = 1;
            a = f.a(fVar, uu30Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
