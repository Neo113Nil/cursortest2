package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import defpackage.e9s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8p0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$titleAsync$1", f = "ScootersDetailedOrderActionListFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$titleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ o8p0 $exp;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$titleAsync$1(a aVar, o8p0 o8p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$exp = o8p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$titleAsync$1(this.this$0, this.$exp, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersDetailedOrderActionListFactory$voluntarySlowdown$2$titleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.widget.c cVar = this.this$0.c;
        o8p0 o8p0Var = this.$exp;
        return ru.yandex.taxi.widget.c.f(cVar, e9s.b(o8p0Var.e, o8p0Var), false, null, 14).toString();
    }
}
