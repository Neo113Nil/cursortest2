package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.lze;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llze;", "it", "Lzy11;", "<anonymous>", "(Llze;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.RentalDurationViewModel$launchIndexUpdating$1", f = "RentalDurationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RentalDurationViewModel$launchIndexUpdating$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalDurationViewModel$launchIndexUpdating$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RentalDurationViewModel$launchIndexUpdating$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RentalDurationViewModel$launchIndexUpdating$1 rentalDurationViewModel$launchIndexUpdating$1 = (RentalDurationViewModel$launchIndexUpdating$1) create((lze) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rentalDurationViewModel$launchIndexUpdating$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        r0 r0Var = dVar.A;
        int indexOf = dVar.W().indexOf(this.this$0.x.b.getValue());
        if (indexOf < 0) {
            indexOf = 0;
        }
        Integer num = new Integer(indexOf);
        r0Var.getClass();
        r0Var.m(null, num);
        return zy11.a;
    }
}
