package ru.yandex.logistics.sdk.cargo_form.impl.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.d;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$OrderAction$Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.TapActionHandler$createOrder$1", f = "TapActionHandler.kt", l = {280}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TapActionHandler$createOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ TapAction$OrderAction$Flow $flow;
    final /* synthetic */ boolean $needValidation;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapActionHandler$createOrder$1(c cVar, TapAction$OrderAction$Flow tapAction$OrderAction$Flow, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$flow = tapAction$OrderAction$Flow;
        this.$needValidation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TapActionHandler$createOrder$1(this.this$0, this.$flow, this.$needValidation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TapActionHandler$createOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.v;
            TapAction$OrderAction$Flow tapAction$OrderAction$Flow = this.$flow;
            boolean z = this.$needValidation;
            this.label = 1;
            if (dVar.a(tapAction$OrderAction$Flow, z, this) == coroutineSingletons) {
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
