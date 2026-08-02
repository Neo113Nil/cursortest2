package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qkg;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqkg;", "dashboard", "Lru/yandex/taxi/logistics/sdk/delivery_launch/domain/DeliveryLaunchLoadingStateRepository$State;", "<unused var>", "<anonymous>", "(Lqkg;Lru/yandex/taxi/logistics/sdk/delivery_launch/domain/DeliveryLaunchLoadingStateRepository$State;)Lqkg;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormViewModel$topWidgetsFlow$1", f = "CargoFormViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormViewModel$topWidgetsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CargoFormViewModel$topWidgetsFlow$1 cargoFormViewModel$topWidgetsFlow$1 = new CargoFormViewModel$topWidgetsFlow$1(3, (Continuation) obj3);
        cargoFormViewModel$topWidgetsFlow$1.L$0 = (qkg) obj;
        return cargoFormViewModel$topWidgetsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qkg qkgVar = (qkg) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return qkgVar;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
