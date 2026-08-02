package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmi31;", "it", "Lzy11;", "<anonymous>", "(Lmi31;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.solid.interactors.TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5", f = "TrapOnlyVerticalFallbackInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5(p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5 trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5 = new TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5(this.this$0, continuation);
        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5.L$0 = obj;
        return trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5 trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5 = (TrapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5) create((mi31) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        trapOnlyVerticalFallbackInteractor$reselectTariffOnFallback$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.c.a(new gnx0(new fnx0(mi31Var, SelectionOrigin.TRAP_ONLY_FALLBACK), true));
        return zy11.a;
    }
}
