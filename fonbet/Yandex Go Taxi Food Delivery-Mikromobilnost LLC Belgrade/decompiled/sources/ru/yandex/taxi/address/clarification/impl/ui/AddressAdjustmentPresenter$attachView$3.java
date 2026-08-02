package ru.yandex.taxi.address.clarification.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.x5;
import defpackage.zp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.clarification.impl.ui.AddressAdjustmentPresenter$attachView$3", f = "AddressAdjustmentPresenter.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressAdjustmentPresenter$attachView$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ zp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressAdjustmentPresenter$attachView$3(zp0 zp0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressAdjustmentPresenter$attachView$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressAdjustmentPresenter$attachView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(new c(ru.yandex.taxi.styling.c.b(this.this$0.J)));
            x5 x5Var = new x5(10, this.this$0);
            this.label = 1;
            if (t.collect(x5Var, this) == coroutineSingletons) {
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
