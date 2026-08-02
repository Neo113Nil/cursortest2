package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.gq1;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qkg;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgq1;", "aiConfig", "Lqkg;", "contentWidgets", "<anonymous>", "(Lgq1;Lqkg;)Lgq1;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormViewModel$aiWidgetsConfigFlow$1", f = "CargoFormViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormViewModel$aiWidgetsConfigFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormViewModel$aiWidgetsConfigFlow$1(h hVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CargoFormViewModel$aiWidgetsConfigFlow$1 cargoFormViewModel$aiWidgetsConfigFlow$1 = new CargoFormViewModel$aiWidgetsConfigFlow$1(this.this$0, (Continuation) obj3);
        cargoFormViewModel$aiWidgetsConfigFlow$1.L$0 = (gq1) obj;
        cargoFormViewModel$aiWidgetsConfigFlow$1.L$1 = (qkg) obj2;
        return cargoFormViewModel$aiWidgetsConfigFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gq1 gq1Var = (gq1) this.L$0;
        qkg qkgVar = (qkg) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (jl40.l(qkgVar, this.this$0.F)) {
            return null;
        }
        return gq1Var;
    }
}
