package ru.yandex.taxi.surge.interactor;

import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.trv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln4v;", "<anonymous>", "(Ltse;)Ln4v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetStateInteractor$mapBlizzardContent$2$barIcon$1", f = "SummaryWidgetStateInteractor.kt", l = {193}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetStateInteractor$mapBlizzardContent$2$barIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ ServiceLevelWidget$SurgeAlert $surgeAlert;
    int label;
    final /* synthetic */ trv0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetStateInteractor$mapBlizzardContent$2$barIcon$1(trv0 trv0Var, ServiceLevelWidget$SurgeAlert serviceLevelWidget$SurgeAlert, Continuation continuation) {
        super(2, continuation);
        this.this$0 = trv0Var;
        this.$surgeAlert = serviceLevelWidget$SurgeAlert;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryWidgetStateInteractor$mapBlizzardContent$2$barIcon$1(this.this$0, this.$surgeAlert, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryWidgetStateInteractor$mapBlizzardContent$2$barIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.widget.utils.e eVar = this.this$0.e;
        String str = this.$surgeAlert.a.a.b;
        this.label = 1;
        Object q = eVar.q(str, this);
        return q == coroutineSingletons ? coroutineSingletons : q;
    }
}
