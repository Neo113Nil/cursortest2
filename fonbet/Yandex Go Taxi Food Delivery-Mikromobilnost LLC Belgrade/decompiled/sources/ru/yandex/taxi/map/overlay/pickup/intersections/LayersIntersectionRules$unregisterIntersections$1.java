package ru.yandex.taxi.map.overlay.pickup.intersections;

import defpackage.lp00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tdp;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.intersection.Participant;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map.overlay.pickup.intersections.LayersIntersectionRules$unregisterIntersections$1", f = "LayersIntersectionRules.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LayersIntersectionRules$unregisterIntersections$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersIntersectionRules$unregisterIntersections$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LayersIntersectionRules$unregisterIntersections$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersIntersectionRules$unregisterIntersections$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.favorites.address.api.experiment.a aVar = this.this$0.b;
            this.label = 1;
            obj = aVar.a.b(this);
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
        if (((tdp) obj).b) {
            lp00 lp00Var = this.this$0.a;
            Participant participant = Participant.BUBBLES;
            ((ru.yandex.taxi.map_common.map.intersection.a) lp00Var).l(participant, Participant.PICKUP_POINT_BUBBLES_COLLECTION);
            ((ru.yandex.taxi.map_common.map.intersection.a) this.this$0.a).l(participant, Participant.PICKUP_POINT_LAST_LABEL);
        }
        return zy11.a;
    }
}
