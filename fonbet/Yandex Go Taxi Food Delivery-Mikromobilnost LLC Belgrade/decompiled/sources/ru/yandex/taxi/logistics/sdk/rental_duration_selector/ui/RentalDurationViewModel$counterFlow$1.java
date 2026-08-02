package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.kzi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.v0f;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedIndex", "Llze;", "<unused var>", "Lv0f;", "<anonymous>", "(ILlze;)Lv0f;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.RentalDurationViewModel$counterFlow$1", f = "RentalDurationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RentalDurationViewModel$counterFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalDurationViewModel$counterFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        RentalDurationViewModel$counterFlow$1 rentalDurationViewModel$counterFlow$1 = new RentalDurationViewModel$counterFlow$1(this.this$0, (Continuation) obj3);
        rentalDurationViewModel$counterFlow$1.I$0 = intValue;
        return rentalDurationViewModel$counterFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new v0f(((kzi0) this.this$0.W().get(i)).b, i < scc.f(this.this$0.W()), i > 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
