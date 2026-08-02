package ru.yandex.taxi.checkin;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.checkin.CheckInRepository$sendCheckInRequest$1", f = "CheckInRepository.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CheckInRepository$sendCheckInRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ String $pickupLineId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckInRepository$sendCheckInRequest$1(d dVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$orderId = str;
        this.$pickupLineId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckInRepository$sendCheckInRequest$1(this.this$0, this.$orderId, this.$pickupLineId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckInRepository$sendCheckInRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$orderId;
            String str2 = this.$pickupLineId;
            this.label = 1;
            if (d.a(dVar, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        l8x l8xVar = (l8x) this.this$0.g.get(this.$orderId);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        return zy11.a;
    }
}
