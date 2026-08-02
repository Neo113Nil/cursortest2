package ru.yandex.taxi.due_selector.impl.domain.interactor.price;

import defpackage.hwm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ljwm;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.due_selector.impl.domain.interactor.price.DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5", f = "DuePickerOnDemandPriceInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5 duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5 = new DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5(3, (Continuation) obj3);
        duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5.L$0 = (vpr) obj;
        return duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$5.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hwm hwmVar = hwm.a;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(hwmVar, this) == coroutineSingletons) {
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
