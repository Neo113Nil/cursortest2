package ru.yandex.taxi.masstransit.repository;

import defpackage.cx30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uu30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luu30;", "route", "Li540;", "<anonymous>", "(Luu30;)Li540;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.repository.MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2", f = "MtSummaryCommunicationsRepositoryImpl.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ cx30 $routesParams;
    final /* synthetic */ MtSummaryCommunicationsParam.CommunicationState.MtScreenType $screenType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2(a aVar, cx30 cx30Var, MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$routesParams = cx30Var;
        this.$screenType = mtScreenType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2 mtSummaryCommunicationsRepositoryImpl$communicationsFlow$2 = new MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2(this.this$0, this.$routesParams, this.$screenType, continuation);
        mtSummaryCommunicationsRepositoryImpl$communicationsFlow$2.L$0 = obj;
        return mtSummaryCommunicationsRepositoryImpl$communicationsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtSummaryCommunicationsRepositoryImpl$communicationsFlow$2) create((uu30) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uu30 uu30Var = (uu30) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        cx30 cx30Var = this.$routesParams;
        MtSummaryCommunicationsParam.CommunicationState.MtScreenType mtScreenType = this.$screenType;
        this.L$0 = null;
        this.label = 1;
        Object b = a.b(aVar, uu30Var, cx30Var, mtScreenType, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
