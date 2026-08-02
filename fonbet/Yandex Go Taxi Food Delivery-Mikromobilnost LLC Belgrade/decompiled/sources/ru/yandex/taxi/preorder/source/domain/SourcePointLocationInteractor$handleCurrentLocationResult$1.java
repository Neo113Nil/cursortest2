package ru.yandex.taxi.preorder.source.domain;

import defpackage.mo21;
import defpackage.mvg;
import defpackage.n5v0;
import defpackage.ny61;
import defpackage.tpo0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wit0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.SourcePointLocationInteractor$handleCurrentLocationResult$1", f = "SourcePointLocationInteractor.kt", l = {164}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointLocationInteractor$handleCurrentLocationResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $pickAction;
    final /* synthetic */ n5v0 $suggestInvocationTrigger;
    final /* synthetic */ mo21 $userLocation;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointLocationInteractor$handleCurrentLocationResult$1(n5v0 n5v0Var, mo21 mo21Var, String str, s sVar, Continuation continuation) {
        super(2, continuation);
        this.$suggestInvocationTrigger = n5v0Var;
        this.$userLocation = mo21Var;
        this.$pickAction = str;
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointLocationInteractor$handleCurrentLocationResult$1(this.$suggestInvocationTrigger, this.$userLocation, this.$pickAction, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointLocationInteractor$handleCurrentLocationResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n5v0 n5v0Var = this.$suggestInvocationTrigger;
            zzs a = this.$userLocation.a();
            String str = this.$pickAction;
            wit0 wit0Var = (wit0) n5v0Var;
            wit0Var.a(true);
            wit0Var.b(a);
            tpr q = wit0Var.c.q(false, a, RoutePointType.POINT_A, true, true, str, null, PositionInitAction.GEO);
            s sVar = this.this$0;
            kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(q, new SourcePointLocationInteractor$handleCurrentLocationResult$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            tpo0 tpo0Var = new tpo0(27, sVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(tpo0Var, this) == coroutineSingletons) {
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
