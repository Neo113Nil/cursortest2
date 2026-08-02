package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.j5s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj5s;", "override", "Lzy11;", "<anonymous>", "(Lj5s;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormViewModel$subscribeOverrideAnalytics$1", f = "CargoFormViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormViewModel$subscribeOverrideAnalytics$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormViewModel$subscribeOverrideAnalytics$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CargoFormViewModel$subscribeOverrideAnalytics$1 cargoFormViewModel$subscribeOverrideAnalytics$1 = new CargoFormViewModel$subscribeOverrideAnalytics$1(this.this$0, continuation);
        cargoFormViewModel$subscribeOverrideAnalytics$1.L$0 = obj;
        return cargoFormViewModel$subscribeOverrideAnalytics$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CargoFormViewModel$subscribeOverrideAnalytics$1 cargoFormViewModel$subscribeOverrideAnalytics$1 = (CargoFormViewModel$subscribeOverrideAnalytics$1) create((j5s) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        cargoFormViewModel$subscribeOverrideAnalytics$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        j5s j5sVar = (j5s) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (j5sVar != null && (str = j5sVar.h) != null) {
            this.this$0.w.q(j5sVar.i, str);
        }
        return zy11.a;
    }
}
