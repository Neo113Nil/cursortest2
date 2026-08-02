package ru.yandex.taxi.delivery.impl.badges;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lwl4;", "payOnDeliveryBadges", "paidInsuranceBadges", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.impl.badges.DeliverySummaryBadgesInteractorImpl$badgesFlow$1", f = "DeliverySummaryBadgesInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySummaryBadgesInteractorImpl$badgesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliverySummaryBadgesInteractorImpl$badgesFlow$1 deliverySummaryBadgesInteractorImpl$badgesFlow$1 = new DeliverySummaryBadgesInteractorImpl$badgesFlow$1(3, (Continuation) obj3);
        deliverySummaryBadgesInteractorImpl$badgesFlow$1.L$0 = (List) obj;
        deliverySummaryBadgesInteractorImpl$badgesFlow$1.L$1 = (List) obj2;
        return deliverySummaryBadgesInteractorImpl$badgesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return kotlin.collections.a.m0(list2, list);
    }
}
