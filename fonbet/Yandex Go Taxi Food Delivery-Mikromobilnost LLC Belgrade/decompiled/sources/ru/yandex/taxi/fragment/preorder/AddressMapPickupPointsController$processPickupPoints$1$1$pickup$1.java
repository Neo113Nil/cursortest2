package ru.yandex.taxi.fragment.preorder;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s31;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpb0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgmb0;", "<anonymous>", "(Ltse;)Lgmb0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.preorder.AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1", f = "AddressMapPickupPointsController.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    final /* synthetic */ List<wpb0> $pickupPoints;
    int label;
    final /* synthetic */ s31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1(s31 s31Var, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s31Var;
        this.$pickupPoints = list;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1(this.this$0, this.$pickupPoints, this.$imageTag, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPickupPointsController$processPickupPoints$1$1$pickup$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.preorder.source.pickup.a aVar = this.this$0.a;
        List<wpb0> list = this.$pickupPoints;
        String str = this.$imageTag;
        this.label = 1;
        Object e = aVar.e(str, list, this);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
