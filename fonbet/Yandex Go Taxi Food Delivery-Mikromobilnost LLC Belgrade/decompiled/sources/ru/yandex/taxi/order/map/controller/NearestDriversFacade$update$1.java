package ru.yandex.taxi.order.map.controller;

import defpackage.hk50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.map.controller.NearestDriversFacade$update$1", f = "NearestDriversFacade.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NearestDriversFacade$update$1 extends SuspendLambda implements wls {
    final /* synthetic */ hk50 $nearestDriversTariffDescription;
    final /* synthetic */ zzs $pickupPoint;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestDriversFacade$update$1(a aVar, zzs zzsVar, hk50 hk50Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pickupPoint = zzsVar;
        this.$nearestDriversTariffDescription = hk50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearestDriversFacade$update$1(this.this$0, this.$pickupPoint, this.$nearestDriversTariffDescription, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NearestDriversFacade$update$1 nearestDriversFacade$update$1 = (NearestDriversFacade$update$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nearestDriversFacade$update$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.d.b(this.$pickupPoint, this.$nearestDriversTariffDescription);
        this.this$0.d.e();
        return zy11.a;
    }
}
