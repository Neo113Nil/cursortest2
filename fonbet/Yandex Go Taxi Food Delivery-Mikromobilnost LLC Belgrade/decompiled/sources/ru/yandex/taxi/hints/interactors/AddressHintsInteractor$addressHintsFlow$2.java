package ru.yandex.taxi.hints.interactors;

import defpackage.bms;
import defpackage.hv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpex0;", "tariffDescription", "Lhv0;", "deliveryAddressHints", "defaultHints", "<anonymous>", "(Lpex0;Lhv0;Lhv0;)Lhv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.hints.interactors.AddressHintsInteractor$addressHintsFlow$2", f = "AddressHintsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressHintsInteractor$addressHintsFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressHintsInteractor$addressHintsFlow$2(c cVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AddressHintsInteractor$addressHintsFlow$2 addressHintsInteractor$addressHintsFlow$2 = new AddressHintsInteractor$addressHintsFlow$2(this.this$0, (Continuation) obj4);
        addressHintsInteractor$addressHintsFlow$2.L$0 = (pex0) obj;
        addressHintsInteractor$addressHintsFlow$2.L$1 = (hv0) obj2;
        addressHintsInteractor$addressHintsFlow$2.L$2 = (hv0) obj3;
        return addressHintsInteractor$addressHintsFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var = (pex0) this.L$0;
        hv0 hv0Var = (hv0) this.L$1;
        hv0 hv0Var2 = (hv0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (pex0Var == null || !this.this$0.b.a.g(pex0Var.b)) ? hv0Var2 : hv0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
