package ru.yandex.taxi.tollroad.alert.item;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.loz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wqz0;
import defpackage.xqz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.tollroad.alert.item.TollRoadRideInfoPresenter$onClick$1", f = "TollRoadRideInfoPresenter.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class TollRoadRideInfoPresenter$onClick$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ xqz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadRideInfoPresenter$onClick$1(xqz0 xqz0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xqz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TollRoadRideInfoPresenter$onClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TollRoadRideInfoPresenter$onClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OrderStatusInfo.TollRoads tollRoads = this.this$0.x.a.b().V().b0;
            c cVar = this.this$0.y;
            this.L$0 = null;
            this.label = 1;
            obj = cVar.a(tollRoads, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ((wqz0) this.this$0.Dg()).D5((loz0) obj);
        return zy11.a;
    }
}
