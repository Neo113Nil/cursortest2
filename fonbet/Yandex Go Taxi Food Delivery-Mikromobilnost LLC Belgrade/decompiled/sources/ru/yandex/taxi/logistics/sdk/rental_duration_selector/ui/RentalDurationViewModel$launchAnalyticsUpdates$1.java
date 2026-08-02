package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.jwh;
import defpackage.kzi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.RentalDurationViewModel$launchAnalyticsUpdates$1", f = "RentalDurationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RentalDurationViewModel$launchAnalyticsUpdates$1 extends SuspendLambda implements wls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalDurationViewModel$launchAnalyticsUpdates$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RentalDurationViewModel$launchAnalyticsUpdates$1 rentalDurationViewModel$launchAnalyticsUpdates$1 = new RentalDurationViewModel$launchAnalyticsUpdates$1(this.this$0, continuation);
        rentalDurationViewModel$launchAnalyticsUpdates$1.I$0 = ((Number) obj).intValue();
        return rentalDurationViewModel$launchAnalyticsUpdates$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RentalDurationViewModel$launchAnalyticsUpdates$1 rentalDurationViewModel$launchAnalyticsUpdates$1 = (RentalDurationViewModel$launchAnalyticsUpdates$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rentalDurationViewModel$launchAnalyticsUpdates$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kzi0 kzi0Var = (kzi0) kotlin.collections.a.S(i, this.this$0.W());
        if (kzi0Var != null) {
            int i2 = kzi0Var.a;
            jwh jwhVar = this.this$0.y.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("selected_time_option", Integer.valueOf(i2));
            jwhVar.a.o("DeliveryCargoHour.SelectTimeScreen.ChangeTime.Tapped", null, linkedHashMap);
        }
        return zy11.a;
    }
}
