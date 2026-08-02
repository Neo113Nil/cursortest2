package ru.yandex.taxi.masstransit.domain;

import defpackage.bc4;
import defpackage.hnm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002j\u0002`\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzy11;", "it", "", "", "Lw211;", "Lwy30;", "Lru/yandex/taxi/masstransit/model/MtTransportSchedules;", "<anonymous>", "(V)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.domain.DetailRouteStateInteractor$scheduleFlow$1", f = "DetailRouteStateInteractor.kt", l = {141}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DetailRouteStateInteractor$scheduleFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<hnm0> $requests;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRouteStateInteractor$scheduleFlow$1(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$requests = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailRouteStateInteractor$scheduleFlow$1(this.this$0, this.$requests, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailRouteStateInteractor$scheduleFlow$1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr b = this.this$0.d.b(this.$requests);
            ?? f = kotlin.collections.b.f();
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = f;
            bc4 bc4Var = new bc4(1, ref$ObjectRef2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = ref$ObjectRef2;
            this.label = 1;
            if (b.collect(bc4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            kotlin.b.b(obj);
        }
        return ref$ObjectRef.element;
    }
}
