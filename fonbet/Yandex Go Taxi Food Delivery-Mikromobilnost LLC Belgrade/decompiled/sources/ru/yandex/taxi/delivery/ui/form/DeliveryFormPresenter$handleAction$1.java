package ru.yandex.taxi.delivery.ui.form;

import defpackage.lr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq;
import defpackage.tse;
import defpackage.wls;
import defpackage.yii;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.ui.form.DeliveryFormPresenter$handleAction$1", f = "DeliveryFormPresenter.kt", l = {348}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryFormPresenter$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ lr $action;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryFormPresenter$handleAction$1(e eVar, lr lrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$action = lrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryFormPresenter$handleAction$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryFormPresenter$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.logistics.photocomment.b bVar = this.this$0.S;
            int b = ((oq) this.$action).a.b();
            yii yiiVar = this.this$0.k0.q;
            int i2 = yiiVar.c;
            int i3 = yiiVar.d;
            this.label = 1;
            if (bVar.e(b, i2, i3, this) == coroutineSingletons) {
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
