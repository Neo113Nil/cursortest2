package ru.yandex.taxi.masstransit.trains.checkout;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.db40;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwh40;", "<anonymous>", "(Ltse;)Lwh40;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.checkout.MtTrainCheckoutScreenDataDtoToStateMapper$map$tariffState$1", f = "MtTrainCheckoutScreenDataDtoToStateMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtTrainCheckoutScreenDataDtoToStateMapper$map$tariffState$1 extends SuspendLambda implements wls {
    final /* synthetic */ vb40 $dto;
    final /* synthetic */ db40 $orderInfo;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTrainCheckoutScreenDataDtoToStateMapper$map$tariffState$1(db40 db40Var, vb40 vb40Var, Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$dto = vb40Var;
        this.$orderInfo = db40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = this.this$0;
        return new MtTrainCheckoutScreenDataDtoToStateMapper$map$tariffState$1(this.$orderInfo, this.$dto, continuation, kVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtTrainCheckoutScreenDataDtoToStateMapper$map$tariffState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        vb40.o oVar = this.$dto.b.f;
        db40 db40Var = this.$orderInfo;
        String str = db40Var != null ? db40Var.b : null;
        this.label = 1;
        Object f = k.f(kVar, oVar, str, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
