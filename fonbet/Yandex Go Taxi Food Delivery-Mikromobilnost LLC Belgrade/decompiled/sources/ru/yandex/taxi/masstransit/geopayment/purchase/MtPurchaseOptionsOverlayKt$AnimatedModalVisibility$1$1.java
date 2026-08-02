package ru.yandex.taxi.masstransit.geopayment.purchase;

import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.sz20;
import defpackage.tse;
import defpackage.tz20;
import defpackage.w01;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseOptionsOverlayKt$AnimatedModalVisibility$1$1", f = "MtPurchaseOptionsOverlay.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtPurchaseOptionsOverlayKt$AnimatedModalVisibility$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $lastState$delegate;
    final /* synthetic */ Object $state;
    final /* synthetic */ lz40 $triggerFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPurchaseOptionsOverlayKt$AnimatedModalVisibility$1$1(lz40 lz40Var, oz40 oz40Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$triggerFlow = lz40Var;
        this.$state = obj;
        this.$lastState$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtPurchaseOptionsOverlayKt$AnimatedModalVisibility$1$1(this.$triggerFlow, this.$lastState$delegate, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtPurchaseOptionsOverlayKt$AnimatedModalVisibility$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lz40 lz40Var = this.$triggerFlow;
            Object sz20Var = this.$state == null ? new sz20(new w01(16, this.$lastState$delegate)) : tz20.a;
            this.label = 1;
            if (lz40Var.emit(sz20Var, this) == coroutineSingletons) {
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
