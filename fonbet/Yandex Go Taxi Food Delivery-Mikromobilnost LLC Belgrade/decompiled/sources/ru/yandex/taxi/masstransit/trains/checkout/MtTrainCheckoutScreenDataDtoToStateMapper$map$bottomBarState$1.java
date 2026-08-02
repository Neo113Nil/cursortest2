package ru.yandex.taxi.masstransit.trains.checkout;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.fef;
import defpackage.ib40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vb40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ly940;", "<anonymous>", "(Ltse;)Ly940;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutScreenDataDtoToStateMapper$map$bottomBarState$1", f = "MtTrainCheckoutScreenDataDtoToStateMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutScreenDataDtoToStateMapper$map$bottomBarState$1 extends SuspendLambda implements wls {
    final /* synthetic */ fef $currencyRules;
    final /* synthetic */ vb40 $dto;
    final /* synthetic */ ib40 $paymentMethod;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutScreenDataDtoToStateMapper$map$bottomBarState$1(k kVar, vb40 vb40Var, ib40 ib40Var, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$dto = vb40Var;
        this.$paymentMethod = ib40Var;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtTrainCheckoutScreenDataDtoToStateMapper$map$bottomBarState$1(this.this$0, this.$dto, this.$paymentMethod, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutScreenDataDtoToStateMapper$map$bottomBarState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        k kVar = this.this$0;
        vb40.k kVar2 = this.$dto.e;
        ib40 ib40Var = this.$paymentMethod;
        fef fefVar = this.$currencyRules;
        this.label = 1;
        Object d = k.d(kVar, kVar2, ib40Var, fefVar, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
