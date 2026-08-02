package ru.yandex.taxi.maas.impl.ride;

import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yqv0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzy11;", "<unused var>", "Lyqv0;", ClidProvider.STATE, "", "<anonymous>", "(VLcom/yandex/go/taxi/summary/api/state/SummaryUiState;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.MaasRouteStatsParametersProvider$couponFlow$1", f = "MaasRouteStatsParametersProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MaasRouteStatsParametersProvider$couponFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasRouteStatsParametersProvider$couponFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MaasRouteStatsParametersProvider$couponFlow$1 maasRouteStatsParametersProvider$couponFlow$1 = new MaasRouteStatsParametersProvider$couponFlow$1(this.this$0, (Continuation) obj3);
        maasRouteStatsParametersProvider$couponFlow$1.L$0 = (yqv0) obj2;
        return maasRouteStatsParametersProvider$couponFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yqv0 yqv0Var = (yqv0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        cVar.getClass();
        return (yqv0Var.a == SummaryUiState$Type.TRAP && jl40.l(yqv0Var.b, cVar.d)) ? cVar.c : "";
    }
}
