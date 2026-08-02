package ru.yandex.taxi.masstransit.domain;

import defpackage.bvf0;
import defpackage.hnm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwy30;", "<anonymous>", "(Ltse;)Lwy30;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.MtOnlineScheduleInteractor$fullSchedules$2", f = "MtOnlineScheduleInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtOnlineScheduleInteractor$fullSchedules$2 extends SuspendLambda implements wls {
    final /* synthetic */ hnm0 $request;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtOnlineScheduleInteractor$fullSchedules$2(q qVar, hnm0 hnm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$request = hnm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtOnlineScheduleInteractor$fullSchedules$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtOnlineScheduleInteractor$fullSchedules$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            q qVar = this.this$0;
            hnm0 hnm0Var = this.$request;
            String str = hnm0Var.a;
            List singletonList = Collections.singletonList(hnm0Var.b);
            this.label = 1;
            qVar.getClass();
            obj = bvf0.n(new MtOnlineScheduleInteractor$combinedSchedules$2(qVar, str, singletonList, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return ((Map) obj).get(this.$request.b);
    }
}
