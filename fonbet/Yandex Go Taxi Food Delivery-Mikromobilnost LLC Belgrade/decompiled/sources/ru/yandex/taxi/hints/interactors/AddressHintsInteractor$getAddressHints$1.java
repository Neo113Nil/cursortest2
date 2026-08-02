package ru.yandex.taxi.hints.interactors;

import defpackage.g92;
import defpackage.ha2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lhv0;", "<anonymous>", "(Ltse;)Lhv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.hints.interactors.AddressHintsInteractor$getAddressHints$1", f = "AddressHintsInteractor.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressHintsInteractor$getAddressHints$1 extends SuspendLambda implements wls {
    final /* synthetic */ pex0 $tariffDescription;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressHintsInteractor$getAddressHints$1(c cVar, pex0 pex0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$tariffDescription = pex0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressHintsInteractor$getAddressHints$1(this.this$0, this.$tariffDescription, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressHintsInteractor$getAddressHints$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        ha2 n = kotlinx.coroutines.flow.e.n(new g92(2, this.$tariffDescription), cVar.e.a(), cVar.d.a(), new AddressHintsInteractor$addressHintsFlow$2(cVar, null));
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(n, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
