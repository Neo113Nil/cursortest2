package ru.yandex.taxi.preorder.source.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wsd0;
import defpackage.ysd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.AddressActionsInteractor$executePointAAddressActions$1", f = "AddressActionsInteractor.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddressActionsInteractor$executePointAAddressActions$1 extends SuspendLambda implements wls {
    final /* synthetic */ wsd0 $actionInfo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressActionsInteractor$executePointAAddressActions$1(a aVar, wsd0 wsd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$actionInfo = wsd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressActionsInteractor$executePointAAddressActions$1(this.this$0, this.$actionInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressActionsInteractor$executePointAAddressActions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ysd0 ysd0Var = this.this$0.b;
            wsd0 wsd0Var = this.$actionInfo;
            this.label = 1;
            if (((ru.yandex.taxi.map_common.b) ysd0Var).d(wsd0Var, this) == coroutineSingletons) {
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
