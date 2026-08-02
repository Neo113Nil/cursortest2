package ru.yandex.taxi.order.map.controller;

import defpackage.hk50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.order.map.controller.NearestDriversFacade$updateTariffClasses$1", f = "NearestDriversFacade.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NearestDriversFacade$updateTariffClasses$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $pickupPoint;
    final /* synthetic */ Set<String> $tariffClasses;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestDriversFacade$updateTariffClasses$1(a aVar, zzs zzsVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pickupPoint = zzsVar;
        this.$tariffClasses = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearestDriversFacade$updateTariffClasses$1(this.this$0, this.$pickupPoint, this.$tariffClasses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NearestDriversFacade$updateTariffClasses$1 nearestDriversFacade$updateTariffClasses$1 = (NearestDriversFacade$updateTariffClasses$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        nearestDriversFacade$updateTariffClasses$1.invokeSuspend(zy11Var);
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
        this.this$0.d.b(this.$pickupPoint, new hk50(this.$tariffClasses, null, null, null, false));
        this.this$0.d.e();
        return zy11.a;
    }
}
