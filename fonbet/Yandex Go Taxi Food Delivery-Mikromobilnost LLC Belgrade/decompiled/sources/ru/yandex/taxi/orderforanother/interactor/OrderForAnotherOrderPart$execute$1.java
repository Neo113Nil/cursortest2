package ru.yandex.taxi.orderforanother.interactor;

import defpackage.aw70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x880;
import defpackage.zv70;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.orderforanother.interactor.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderforanother.interactor.OrderForAnotherOrderPart$execute$1", f = "OrderForAnotherOrderPart.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderForAnotherOrderPart$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderForAnotherOrderPart$execute$1(a aVar, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderForAnotherOrderPart$execute$1(this.this$0, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderForAnotherOrderPart$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            final a aVar = this.this$0;
            this.label = 1;
            if (aVar.d.a()) {
                obj = Boolean.FALSE;
            } else {
                obj = ((ru.yandex.taxi.orderforanother.router.a) ((aw70) aVar.b.get())).a(new zv70() { // from class: vv70
                    @Override // defpackage.zv70
                    public final void n() {
                        a.this.c.a();
                    }
                }, this);
            }
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        x880 x880Var = this.$chainCallback;
        if (booleanValue) {
            x880Var.o();
        } else {
            x880Var.n();
        }
        return zy11.a;
    }
}
