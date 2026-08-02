package ru.yandex.taxi.address.repository;

import defpackage.avj0;
import defpackage.d6z;
import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Le1c0;", "<anonymous>", "(Ltse;)Le1c0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.repository.PinV2ExperimentRepository$experimentDeferredLazy$2$1", f = "PinV2ExperimentRepository.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PinV2ExperimentRepository$experimentDeferredLazy$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f1c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinV2ExperimentRepository$experimentDeferredLazy$2$1(f1c0 f1c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f1c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinV2ExperimentRepository$experimentDeferredLazy$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinV2ExperimentRepository$experimentDeferredLazy$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t1b0 t1b0Var = this.this$0.d;
            this.label = 1;
            obj = t1b0Var.b(this);
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
        e1c0 e1c0Var = (e1c0) obj;
        this.this$0.getClass();
        if (e1c0Var.b && d6z.Z(e1c0Var, e1c0Var.d) && d6z.Z(e1c0Var, e1c0Var.e)) {
            return e1c0Var;
        }
        f1c0 f1c0Var = this.this$0;
        f1c0Var.a.getClass();
        avj0 avj0Var = (avj0) f1c0Var.c;
        return new e1c0(kotlin.collections.b.i(new Pair("car_arriving_title", avj0Var.h(kyh0.source_destination_on_map_car_arriving_title)), new Pair("car_transporting_title_template", avj0Var.h(kyh0.source_destination_on_map_car_transporting_title_template)), new Pair("clarify_starting_point_title", avj0Var.h(kyh0.source_destination_on_map_clarify_starting_point_title))), true, 32);
    }
}
